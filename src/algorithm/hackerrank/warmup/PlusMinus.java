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
 * Site       : https://www.hackerrank.com/challenges/plus-minus
 * Difficulty : Easy
 */
public class PlusMinus {
    static void solve(int n, int[] ar) {
        float po = 0;
        float ne = 0;
        float ze = 0;
        for(int i = 0; i < n; i++){
            if(ar[i]==0){
                ze += 1;
            } else if (ar[i]<0) {
                ne += 1;
            }else {
                po += 1;
            }
        }
        System.out.println(po/n);
        System.out.println(ne/n);
        System.out.print(ze/n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        solve(n, ar);
    }
}
