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
 * Site       : https://www.acmicpc.net/problem/2908
 */

public class Boj2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        char[] a = inputs[0].toCharArray();
        char[] b = inputs[1].toCharArray();
        char tmp = ' ';
        tmp = a[0];
        a[0] = a[2];
        a[2] = tmp;
        tmp = b[0];
        b[0] = b[2];
        b[2] = tmp;
        if(a[0]> b[0]){
            System.out.println(a);
        }else if(a[0]==b[0]){
            if(a[1]> b[1]){
                System.out.println(a);
            }else if(a[1]==b[1]){
                if(a[2]> b[2]){
                    System.out.println(a);
                }else{
                    System.out.println(b);
                }
            }else {
                System.out.println(b);
            }
        }else {
            System.out.println(b);
        }
    }

}
