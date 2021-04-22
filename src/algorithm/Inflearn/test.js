console.log('yeah~~~');

a > b ? 'A' : 'B'

// 10자리 초기값 0 배열 생성
let arr = Array(10).fill(0);
arr.push('z');
arr.indexOf('z')
arr.splice(i,1);
Math.max.apply(null,sum);

/* 배열 숫자 정렬 */
score.sort(); // 1, 10, 11, 2, 3, 4 
// ASCII 문자 순서로 정렬되어 숫자의 크기대로 나오지 않음
score.sort(function(a, b) { // 오름차순
    return a - b;    // 1, 2, 3, 4, 10, 11
});
score.sort(function(a, b) { // 내림차순
    return b - a;    // 11, 10, 4, 3, 2, 1
});

//배열 중복 제거
let uniqueArr = sumarr.filter(function(ele , pos){
    return sumarr.indexOf(ele) == pos;
}) 

str.charAt(5)
toLowerCase

//reverse()는 배열 함수, 문자열에서 쓰고 싶으면
str.split("").reverse().join("");

parseInt(str.length/2); //몫
x%10 //나머지
Math.ceil(n/12); //올림

parseInt()
isNaN() // Not A Number

for(s of str){
    if(s.search(/[A-Z]/g) == -1){}
    str.replace(/A/g,"#");
    str = str.toLowerCase().replace(/[^a-z]/g,'');
}

//소수 구하기
const isPrime = (num) => {
    if (num === 1) return false;

    for (let i = 2; i < parseInt(Math.sqrt(num)); i++) {
        if (num % i === 0) return false;
    }

    return true;
};



//Object 정렬
var student = [
    { name : "재석", age : 21},
    { name : "광희", age : 25},
    { name : "형돈", age : 13},
    { name : "명수", age : 44}
]

/* 이름순으로 정렬 */
student.sort(function(a, b) { // 오름차순
    return a.name < b.name ? -1 : a.name > b.name ? 1 : 0;
    // 광희, 명수, 재석, 형돈
});

student.sort(function(a, b) { // 내림차순
    return a.name > b.name ? -1 : a.name < b.name ? 1 : 0;
    // 형돈, 재석, 명수, 광희
});

/* 나이순으로 정렬 */
var sortingField = "age";

student.sort(function(a, b) { // 오름차순
    return a[sortingField] - b[sortingField];
    // 13, 21, 25, 44
});

student.sort(function(a, b) { // 내림차순
    return b[sortingField] - a[sortingField];
    // 44, 25, 21, 13
});
