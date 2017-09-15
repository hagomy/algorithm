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
 * Site       : https://www.hackerrank.com/challenges/apple-and-orange
 * Difficulty : Easy
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int aco = 0;
        int oco = 0;

        for(int i = 0; i < m; i++){
            if(s <= (apple[i] + a) && (apple[i] + a) <= t){
                aco++;
            }
        }
        for(int i = 0; i < n; i++){
            if(s <= (orange[i] + b) && (orange[i] + b) <= t){
                oco++;
            }
        }
        System.out.println(aco);
        System.out.print(oco);
    }
}
