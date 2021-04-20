// 100이하의 자연수 A, B, C를 입력받아 세 수 중 가장 작은 값을 출력
//(정렬을 사용하면 안됩니다)
function solution1(a, b, c){
    let answer;
    answer = a;
    if(answer>b) answer = b;
    if(answer>c) answer = c;
    return answer;
}
console.log(solution1(3, 5, 4));

//길이가 서로 다른 A, B, C 세 개의 막대 길이가 주어지면
//이 세 막대로 삼각형을 만들 수 있으면 “YES"를 출력
//만들 수 없으면 ”NO"를 출력
function solution2(a, b, c){
    let answer;
    let arr = [a,b,c];
    arr.sort();
    if(arr[2] >= arr[0]+arr[1]) answer = "NO"
    else answer = "YES"
    return answer;
}
console.log(solution2(6, 7, 11),solution2(13, 33, 17));

//연필 1 다스는 12자루
//학생 1인당 연필을 1자루씩 나누어 준다고 할 때
//학생수를 입력하면 필요한 연필의 다스 수를 계산
function solution3(n){
    let answer = Math.ceil(n/12);
    return answer;
}
console.log(solution3(25),solution3(178));

//자연수 N이 입력되면 1부터 N까지의 합을 출력
function solution4(n){
    return n*(n+1)/2;
}
console.log(solution4(6), solution4(10));

//7개의 수가 주어지면 그 숫자 중 가장 작은 수를 출력
function solution5(arr){
    return arr.sort()[0];
}
console.log(solution5([5, 7, 1, 3, 2, 9, 11]));

//7개의 자연수가 주어질 때
//홀수인 자연수들을 모두 골라
//그 합을 구하고
//고른 홀수들 중 최소값을 찾
function solution6(arr){
    let odd=[];
    let sum=0;
    let answer;
    for(i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            odd.push(arr[i]);
            sum = sum+arr[i];
        }
    }
    return sum+"\n"+odd.sort()[0];
}
console.log(solution6([12,77,38,41,53,92,85]));

// 자동차 10부제
//자동차 번호의 일의 자리 숫자와 날짜의 일의 자리 숫자가 일치하면 해당 자동차의 운행을 금지
//날짜의 일의 자리 숫자가 주어지고
//7대의 자동차 번호의 끝 두 자리 수가 주어졌을 때
//위반하는 자동차의 대수를 출력
function solution7(n,arr){
    let answer=0;
    for(x of arr){
        if(x%10 == n) answer++;
    }
    return answer;
}
console.log(solution7(3,[25,23,11,47,53,17,33]));

//일곱 난쟁이의 키의 합이 100
//아홉 난쟁이의 키가 주어졌을 때,
//백설공주를 도와 일곱 난쟁이를 찾는 프로그램
function solution8(arr){
    let sum=0;
    for(x of arr) sum = sum+x;
    for(i=0;i<arr.length-1;i++){
        for(j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j] == sum-100){
                arr.splice(i,1);
                arr.splice(j-1,1);
                return arr;
            }
        }
    }
}
console.log(solution8([20,7,23,19,10,15,25,8,13]));

//단어에 포함된 ‘A'를 모두 ’#‘으로 바꾸어 출력
function solution9(str){
    return str.replace(/A/g,"#");
}
console.log(solution9("BANANA"));

//특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램
function solution10(s, t){
    let count=0;
    for(x of s){
        if( x == t) count = count+1;
    }
    return count;
}
console.log(solution10("COMPUTERPROGRAMMING", 'R'));

//문자열에 알파벳 대문자가 몇 개 있는지 알아내는 프로그램
function solution11(str){
    let count = 0;
    for(s of str){
        if(s.search(/[A-Z]/g) != -1) count++;
    }
    return count;
}
console.log(solution11("KoreaTimeGOod"));

//대문자로 모두 통일하여 문자열을 출력
function solution12(str){
    return str.toUpperCase();
}
console.log(solution12("ItisTimeToStudy"));

//대문자는 소문자로 소문자는 대문자로 변환하여 출력
function solution13(str){
    let answer = "";
    for(s of str){
        if(s.search(/[A-Z]/g) == -1) answer += s.toUpperCase();
        else answer += s.toLowerCase();
    }
    return answer;
}
console.log(solution13("StuDY"));

//N개의 문자열이 입력되면 그 중 가장 긴 문자열을 출력
function solution14(str){
    let len = 0;
    let answer;
    for(s of str){
        if(s.length > len){
            len = s.length;
            answer = s;
        }
    }
    return answer;
}
let str=["teacher", "time", "student", "beautiful", "good"];
console.log(solution14(str));

//단어의 가운데 문자를 출력
// 단어의 길이가 짝수일 경우 가운데 2개의 문자를 출력
function solution15(str){
    let m = parseInt(str.length/2); //몫
    if(str.length%2==0) return str.charAt(m-1)+str.charAt(m);
    else return str.charAt(m);
}
console.log(solution15("study"), solution15("good"));

//중복된 문자를 제거하고 출력
function solution16(str){
    let answer="";
    for(i=0;i<str.length;i++){
        if(str.indexOf(str[i])===i) answer+=str[i];
    }
    return answer;
}
console.log(solution16("ksekkset"));

//중복된 문자열은 제거하고 출력
function solution17(arr){
    let answer=[];
    for(i=0;i<arr.length;i++){
        if(arr.indexOf(arr[i])===i) answer.push(arr[i]);
    }
    return answer;
}
console.log(solution17(["good", "time", "time", "beautiful", "good"]));
