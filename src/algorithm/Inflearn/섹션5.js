//오름차순으로 정렬이 된 두 배열
//두 배열을 오름차순으로 합쳐 출력
function solution1(arr1,arr2){
    let answer=[];
    let n=arr1.length;
    let m=arr2.length;
    let p1=p2=0;
    while(p1<n && p2<m){
        if(arr1[p1]<=arr2[p2]) answer.push(arr1[p1++]);
        else answer.push(arr2[p2++]);
    }
    while(p1<n) answer.push(arr1[p1++]);
    while(p2<m) answer.push(arr2[p2++]); 
    return answer;
}
let a=[1, 3, 5];
let b=[2, 3, 6, 7, 9];
console.log(solution1(a,b));

//A, B 두 개의 집합
//두 집합의 공통 원소를 추출하여 오름차순으로 출력
function solution2(arr1,arr2){
    let answer=[];
    for(i of arr1){
        for(j of arr2){
            if(i===j){
                answer.push(i);
                break;
            }
        }
    }
    let sortAnswer = answer.sort(function(a,b){
        return a-b;
    })
    return sortAnswer;
}
let c=[1, 3, 9, 5, 2];
let d=[3, 2, 5, 7];
console.log(solution2(c,d));

//
function solution3(){
    
    return ;
}
console.log(solution3());






//
function solution(){
    
    return ;
}
console.log(solution());
