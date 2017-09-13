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

package algorithm.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by haeun on 2017-09-13
 * Site       : https://www.hackerrank.com/challenges/staircase
 * Difficulty : Easy
 */
public class Staircase {
    static void solve(int n){
        for(int i = 1; i <= n; i++){
            int a = i;
            while(a < n){
                System.out.print(" ");
                a++;
            }
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solve(n);
    }
}
