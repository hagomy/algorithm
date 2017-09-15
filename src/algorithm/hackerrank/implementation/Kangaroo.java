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

package algorithm.hackerrank.implementation;

import java.util.Scanner;

/**
 * Created by haeun on 2017-09-15
 * Site       : https://www.hackerrank.com/challenges/kangaroo
 * Difficulty : Easy
 */
public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2){
            return "NO";
        }
        while(true){
            if(x1 > x2){
                return "NO";
            }

            if(x1 == x2){
                return "YES";
            }else{
                x1 += v1;
                x2 += v2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
