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
 * Site       : https://www.hackerrank.com/challenges/diagonal-difference
 * Difficulty : Easy
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n*n];
        for(int i = 0; i < n*n; i++){
                ar[i] = in.nextInt();
        }

        int s1 = 0;
        for(int j = 0; j < n*n; j= j+n+1){
            s1 += ar[j];
        }
        int s2 = 0;
        for(int k = n-1; k < n*n-1; k = k+n-1){
            s2 += ar[k];
        }

        int result = ((s1 - s2) < 0 ? s2-s1 : s1-s2);
        System.out.print(result);
    }
}
