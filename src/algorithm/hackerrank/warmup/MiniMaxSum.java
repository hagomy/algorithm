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
 * Site       : https://www.hackerrank.com/challenges/mini-max-sum
 * Difficulty : Easy
 */
public class MiniMaxSum {
    static void solve(long[] arr){
        long tmp = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        long sum1 = arr[0] + arr[1] + arr[2] + arr[3];
        long sum2 = arr[1] + arr[2] + arr[3] + arr[4];

        System.out.print(sum2 + " " + sum1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        solve(arr);
    }
}
