//자신의 바로 앞 수보다 큰 수만 출력
//첫 번째 수는 무조건 출력
function solution1(arr){
    let answer=[];
    answer.push(arr[0]);
    for(i=1;i<arr.length;i++){
        if(arr[i]>arr[i-1]) answer.push(arr[i]);
    }
    return answer;
}
console.log(solution1([7,3,9,5,6,12]));

//일렬로 서 있는 학생의 키가 앞에 서부터 순서대로 주어질 때
// 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수
function solution2(arr){
    let count=1;
    let max=arr[0];
    for(i=1;i<arr.length;i++){
        if(arr[i]>max){
            count++;
            max=arr[i];
        }
    }
    return count;
}
console.log(solution2([130,135,148,140,145,150,150,153]));

//가위1 바위2 보3
function solution3(a,b){
    let answer=[];
    for(i=0;i<a.length;i++){
        if(a[i]===1){
            if(b[i]===1) answer.push("D")
            else if(b[i]===2) answer.push("B")
            else answer.push("A")
        }
        else if(a[i]===2){
            if(b[i]===2) answer.push("D")
            else if(b[i]===3) answer.push("B")
            else answer.push("A")
        }else if(a[i]===3){
            if(b[i]===3) answer.push("D")
            else if(b[i]===1) answer.push("B")
            else answer.push("A")
        }
    }
    return answer;
}
console.log(solution3([2,3,3,1,3],[1,1,2,2,3]));

//OX 문제
//연속적으로 답을 맞히는 경우에는 가산점
//두 번째 문제는 2점, .., K번째 문제는 K점
function solution4(arr){
    let score=0;
    let point=0;
    for(i=0;i<arr.length;i++){
        if(arr[i]===1){
            point++;
            score+=point;
        }else point=0;
    }
    return score;
}
console.log(solution4([1,0,1,1,1,0,0,1,1,0]));

//국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력
function solution5(arr){
    let n = arr.length;
    let answer = Array(arr.length).fill(1);
    for (let i = 0; i < arr.length; i++) {
        answer[i] += arr.filter(y => y > arr[i]).length;
    }
    return answer;
}
console.log(solution5([87,89,92,100,76,92]));

//N*N 격자판
//각 행의 합, 각 열의 합, 두 대각선의 합
//중 가 장 큰 합을 출력
function solution6(arr){
    let sum=[], tmp1=0,tmp2=0 ;
    for(let i=0;i<arr.length;i++){
        let tmpx=0, tmpy=0;
        for(let j=0;j<arr.length;j++){
            tmpx += arr[i][j];
            tmpy += arr[j][i];
            if(i===j) tmp1 += arr[j][i];
            if(i+j===arr.length-1) tmp2 += arr[j][i];
        }
        sum.push(tmpx);
        sum.push(tmpy);
    }
    sum.push(tmp1);
    sum.push(tmp2);
    return Math.max.apply(null,sum);
}
let arr1=[[10, 13, 10, 12, 15], 
        [12, 39, 30, 23, 11],
        [11, 25, 50, 53, 15],
        [19, 27, 29, 37, 27],
        [19, 13, 30, 13, 19]];
console.log(solution6(arr1));

//지도 정보가 N*N 격자판
//각 격자에는 그 지역의 높이
//자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역
//봉우리 지역이 몇 개?
function solution7(arr){
    let count=0;
    let size = arr.length;
    for(let i=0;i<size;i++){
        for(let j=0;j<size;j++){
            let left = j !== 0 ? arr[i][j - 1] : 0;
            let right = j !== size - 1 ? arr[i][j + 1] : 0;
            let top = i !== 0 ? arr[i - 1][j] : 0;
            let bottom = i !== size - 1 ? arr[i + 1][j] : 0;

            if(arr[i][j] === Math.max(arr[i][j],left, right, top, bottom)){
                count++;
            }
        }
    }
    return count;
}
arr1=[[5, 3, 7, 2, 3], 
    [3, 7, 1, 6, 1],
    [7, 2, 5, 3, 4],
    [4, 3, 6, 4, 1],
    [8, 7, 3, 5, 2]];
console.log(solution7(arr1));
