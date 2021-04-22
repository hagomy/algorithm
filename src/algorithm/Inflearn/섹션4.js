//각 자연수의 자릿수의 합을 구하고,
//그 합이 최대인 자연수를 출력
//자릿수의 합이 같은 경우 원래 숫자가 큰 숫자를 답으로
function solution1(arr){
    let sumarr=[];
    for(i of arr){
        let sum=0;
        for(j of String(i)){
            sum+=parseInt(j);
        }
        sumarr.push(sum);
    }

    let max= Math.max.apply(null,sumarr);
    let answer=0;
    for(let i=0;i<arr.length;i++){
        if(sumarr[i]===max && arr[i]>answer) answer=arr[i];
    }
    return answer;
}
console.log(solution1([128, 460, 603, 40, 521, 137, 123]));

//각 자연수를 뒤집은 후
//그 뒤집은 수가 소수이면 그 소수를 출력
//첫 자리부터의 연속된 0은 무시
function solution2(arr){

    return "i dont know";
}
console.log(solution2([32,55,62,20,250,370,200,30,100]));

//
function solution3(test){
    let answer=0;
    let m=test.length;
    let n=test[0].length;

    for(let i=0; i<n; i++){
        for(let j=0;j<n;j++){
            for(let k=0;k<m;k++){
                if(test[k][i]>=test[k][j]) break;
                if(k===m-1){
                    answer++;
                    console.log(i+1,j+1)
                }
            }
        }
    }
    return answer;
}
let arr1=[[3, 4, 1, 2], [4, 3, 2, 1], [3, 1, 4, 2]];
console.log(solution3(arr1));

//졸업 선물
function solution4(n,money,arr){
    let sum=0, sumarr=[], answer=n;
    for(let i=0;i<n;i++){
        sum += arr[i][0]/2 + arr[i][1];
        sumarr.push(arr[i][0]/2 + arr[i][1]);
    }
    sumarr.sort(function(a, b) { // 내림차순
        return b - a;
    });
    for(price of sumarr){
        if(sum<=money) break;
        else{
            sum -= price;
            answer--;
        }
    }
    return answer;
}
console.log(solution4(5,28,[[6, 6], [2, 2], [4, 3], [4, 5], [10, 3]]));

//K번째 큰 수
//3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록
//3장을 뽑을 수 있는 모든 경우를 기록
function solution5(n,k,arr){
    let sumarr=[];
    for(let i=0;i<n-2;i++){
        for(let j=i+1;j<n-1;j++){
            for(let l=j+1;l<n;l++){
                sumarr.push(arr[i]+arr[j]+arr[l]);
            }
        }   
    }
    sumarr.sort(function(a, b) { // 내림차순
        return b - a;
    });

    let uniqueArr = sumarr.filter(function(ele , pos){
        return sumarr.indexOf(ele) == pos;
    }) 
    
    return uniqueArr[k-1];
}
console.log(solution5(10,3,[13,15,34,23,45,65,33,11,26,42]));
