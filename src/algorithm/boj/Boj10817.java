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
 * Created by haeun on 2017-09-25
 * Site       : https://www.acmicpc.net/problem/10817
 */

public class Boj10817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int tmp = 0 ;
        if(a>b){
            tmp = a;
            a = b;
            b = tmp;
        }
        if(a>c){
            tmp = a;
            a = c;
            c = tmp;
        }
        if(b>c){
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.print(b);
    }

}
