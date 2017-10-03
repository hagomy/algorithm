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
 * Created by haeun on 2017-10-03
 * Site       : https://www.acmicpc.net/problem/5622
 */

public class Boj5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int[] dial = new int[10];
        int result = 0;
        for(int i=0; i<input.length; i++){
            if(input[i]=='A' || input[i]=='B' || input[i]=='C'){
                result += 3;    //2
            } else if(input[i]=='D' || input[i]=='E' || input[i]=='F'){
                result += 4;    //3
            }else if(input[i]=='G' || input[i]=='H' || input[i]=='I'){
                result += 5;    //4
            }else if(input[i]=='J' || input[i]=='K' || input[i]=='L'){
                result += 6;
            }else if(input[i]=='M' || input[i]=='N' || input[i]=='O'){
                result += 7;
            }else if(input[i]=='P' || input[i]=='Q' || input[i]=='R' || input[i]=='S'){
                result += 8;
            }else if(input[i]=='T' || input[i]=='U' || input[i]=='V'){
                result += 9;
            }else if(input[i]=='W' || input[i]=='X' || input[i]=='Y' || input[i]=='Z'){
                result += 10;
            }else {
                result += 11;
            }
        }
        System.out.println(result);
    }

}
