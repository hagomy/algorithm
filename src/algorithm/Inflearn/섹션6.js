//
function solution1(s){
    let arr=[];
    for(let i of s){
        if(i==='(') arr.push(i);
        else{
            //if(arr.pop()!=='(') return 'NO';
            if(arr.length===0) return 'NO';
            arr.pop();
        }
    }
    if(arr.length===0) return 'NO';
    return 'YES';
}
let q1 = '(()()))';
console.log(solution1(q1));

//
function solution2(s){
    let count = 0;
    let answer='';
    for(let i of s){
        if(i==='(') count++;
        else if(i===')') count--;
        else {
            if(count===0) answer += i;
        }
    }
    return answer;
}
let q2 = '(A(BC)D)EF(G(H)(IJ)K)LM(N)';
console.log(solution2(q2));

//
function solution3(board,moves){
    let n=board.length;
    let basket=[];
    let last = 0;
    let score=0;
    for(let m of moves){
        for(let i=0; i<n; i++){
            if(board[i][m-1]!==0){
                if(last===board[i][m-1]){
                    basket.pop();
                    score+=2;
                }
                else basket.push(board[i][m-1]);

                if(basket.length!==0) last = basket[basket.length-1];
                else last =0;

                board[i][m-1]=0;
                break;
            }
        }
    }
    return score;
}
console.log(solution3([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]],[1,5,3,5,1,2,1,4]));

//후위식 연산(postfix)
function solution4(s){
    let stack=[];
    let a=0;
    for(let i of s){
        if(!isNaN(i)) stack.push(i);
        else{
            let tmp2=parseInt(stack.pop());
            let tmp1=parseInt(stack.pop());
            if(i==='+') stack.push(tmp1+tmp2);
            else if(i==='-') stack.push(tmp1-tmp2);
            else if(i==='*') stack.push(tmp1*tmp2);
            else stack.push(tmp1/tmp2);
        }
    }
    return stack.pop();
}
console.log(solution4('352+*9-'));

//
function solution5(){
    return '포기';
}
console.log(solution5());

//
function solution6(){
    
    return ;
}
console.log(solution6());




//
function solution(){
    
    return ;
}
console.log(solution());
