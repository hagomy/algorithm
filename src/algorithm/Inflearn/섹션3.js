//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열
//회문 문자열이면 "YES", 아니면 “NO"를 출력
//대소문자를 구분하지 않
function solution1(str){
    restr = str.toLowerCase().split("").reverse().join("");
    if(restr===str.toLowerCase()) return "YES";
    else return "NO";
}
console.log(solution1("gooG"));

//위의 문제에 조건 추가
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사
//알파벳 이외의 문자들의 무시
function solution2(str){
    str = str.toLowerCase().replace(/[^a-z]/g,'');
    restr = str.split("").reverse().join("");
    if(restr===str.toLowerCase()) return "YES";
    else return "NO";
}
console.log(solution2("found7, time: study; Yduts; emit, 7Dnuof"));

//숫자만 추출하여 그 순서대로 자연수를 만듭니다
function solution3(str){
    return parseInt(str.replace(/[^0-9]/g,''));
}
console.log(solution3("tge0a1h205er"),solution3('g0en2T0s8eSoft'));

//한 개의 문자열 s와 문자 t
//문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력
function solution4(s,t){
    let po=[];
    for(let i=0;i<s.length;i++){
        if(s[i]===t) po.push(i);
    }

    let answer="";
    for(let i=0;i<s.length;i++){
        let min=s.length;
        for(j of po){
            if(Math.abs(i-j)<min) min=Math.abs(i-j);
        }
        answer += min+" "
    }
    return answer;
}
console.log(solution4("teachermode",'e'));

//같은 문자가 연속으로 반복되는 경우
//반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축
//단 반복횟수가 1인 경우 생략
function solution5(str){
    let answer=str[0];
    let count=1;
    for(let i=1; i<str.length; i++){
        if(str[i]===str[i-1]){
            count++;
        }else{
            if(count!==1) answer+=count;
            count=1;
            answer+=str[i];
        }
    }
    return answer;
}
console.log(solution5("KKHSSSSSSSE"));
