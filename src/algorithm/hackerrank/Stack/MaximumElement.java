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

package algorithm.hackerrank.Stack;

import java.io.*;

/**
 * Created by haeun on 2017-10-05
 * Site       : https://www.hackerrank.com/challenges/maximum-element
 * Difficulty : Easy
 */
public class MaximumElement{
    String[] items = new String[100000];
    int[] maximum = new int[100000];
    int top = -1;

    public void push(String item) {
        items[++top] = item;
        if(top>0){
            maximum[top] = (maximum[top-1] > Integer.parseInt(item))?maximum[top-1]:Integer.parseInt(item);
        }else {
            maximum[top]= Integer.parseInt(item);
        }
    }

    public String pop() {
        if (top==-1){
            return null;
        }
        return items[top--];
    }

    public String peek() {
        if(top==-1){
            return null;
        }
        return ""+maximum[top];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        MaximumElement me = new MaximumElement();
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].trim().equals("1")){
                me.push(input[1]);
            }else if(input[0].trim().equals("2")){
                me.pop();
            }else{
                System.out.println(me.peek());
            }
        }
    }
}
