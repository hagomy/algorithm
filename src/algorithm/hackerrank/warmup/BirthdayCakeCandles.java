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
 * Created by haeun on 2017-09-14
 * Site       : https://www.hackerrank.com/challenges/birthday-cake-candles
 * Difficulty : Easy
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int m = ar[0];
        for(int i = 1; i < n; i++){
            if(m < ar[i]){
                m = ar[i];
            }
        }
        int count = 0;
        for(int i =0; i<n; i++){
            if(m == ar[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
