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
 * Created by haeun on 2017-09-20
 * Site       : https://www.acmicpc.net/problem/2839
 */
public class Boj2839 {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int min;

       if(n%5 == 0){
           min = n / 5;
       }else if(n%5 == 1){
               min = n / 5 + 1;
       }else if(n%5 == 2){
           if(n<10){
               min = -1;
           }else {
               min = n / 5 + 2;
           }
       }else if(n%5 == 3){
               min = n / 5 + 1;
       }else{
           if(n<5){
               min = -1;
           }else {
               min = n / 5 + 2;
           }
       }

       System.out.print(min);
    }

}
