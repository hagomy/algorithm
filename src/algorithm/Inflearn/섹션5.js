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
function solution3(n,m,arr){
    let answer=0;
    for(let i=0;i<n;i++){
        let sum=0;
        for(let j=i;j<n;j++){
            sum+=arr[j];
            if(sum<m) continue;
            else if(sum===m) answer++;
            else break;
        }
    }
    return answer;
}
console.log(solution3(8,6,[1,2,1,3,1,1,1,2]));

//연속부분수열의 합이 특정숫자 M이하가 되는 경우가 몇 번
function solution4(){
    
    return ;
}
console.log(solution4());

//
function solution5(n,k,arr){
    let max=0;
    for(let i=0;i<n;i++){
        let sum=0;
        for(let j=i;j<i+k;j++){
            sum+=arr[j];
        }
        if(sum>max) max=sum;
    }
    return max;
}
console.log(solution5(10,3,[12,15,11,20,25,10,20,19,13,15]));

//학급 회장
function solution6(s){
    let answer;
    let sH = new Map();
    for(let x of s){
        if(sH.has(x)) sH.set(x, sH.get(x)+1);
        else sH.set(x, 1);
    }
    let max=Number.MIN_SAFE_INTEGER;
    for(let [key, val] of sH){
        if(val>max){
            max=val;
            answer=key;
        }
    }
    return answer;
}
console.log(solution6("BACBACCACCBDEDE"));

//
function toMap(s){
    let m = new Map();
    for(let i of s){
        if(m.has(i)) m.set(i, m.get(i)+1);
        else m.set(i,1);
    }
    return m;
}
function solution7(s1,s2){
    let m1 = toMap(s1);
    let m2 = toMap(s2);

    if(m1.size!==m2.size) return 'NO';
    for(let [k,v] of m1){
        if(m2.has(k) && m2.get(k)===v) continue;
        else return 'NO';
    }
    return 'YES';
}
console.log(solution7('AbaAeCe','baeeACA'), solution7('abaCC','Caaab'));

//
function solution8(s,t){
    let s1 ='';
    let m2 = toMap(t);
    let answer=0;

    for(let i=0;i<s.length-t.length+1;i++){
        s1 = s.slice(i,i+t.length);
        let m1 = toMap(s1);
        let d = true;
        for(let [k,v] of m1){
            if(m2.has(k) && m2.get(k)===v) continue;
            else{
                d=false;
                break;
            }
        }
        if(d) answer++;
    }
    return answer;
}
console.log(solution8('bacaAacba','abc'));
