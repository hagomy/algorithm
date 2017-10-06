/*
 * Copyright 2017 haeun kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package algorithm.boj;

import java.io.*;

/**
 * Created by haeun on 2017-10-06
 * Site       : https://www.acmicpc.net/problem/10828
 */

public class Boj10828 {
    String[] items = new String[10000];

    int top = -1;

    public void push(String item) {
        items[++top] = item;
    }

    public String pop() {
        if (empty()==1){
            return ""+ -1;
        }
        return items[top--];
    }

    public String peek() {
        if(empty()==1){
            return ""+ -1;
        }
        return items[top];
    }

    public int size() {
        return top+1;
    }

    public int empty() {
        if(top == -1){
            return  1;
        }else{
            return  0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Boj10828 obj = new Boj10828();
        for(int i=0; i<n; i++){
            String[] comm = br.readLine().split(" ");
            if(comm[0].equals("push")){
                obj.push(comm[1]);
            }else if(comm[0].equals("pop")){
                System.out.println(obj.pop());
            }else if(comm[0].equals("size")){
                System.out.println(obj.size());
            }else if(comm[0].equals("empty")){
                System.out.println(obj.empty());
            }else{
                System.out.println(obj.peek());
            }
        }
    }

}
