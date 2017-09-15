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
 * Site       : https://www.hackerrank.com/challenges/grading
 * Difficulty : Easy
 */
public class GradingStudents {
    static int[] solve(int[] grades,int n){
        for(int i = 0; i < n; i++){
            if(grades[i] >= 38){
                if((grades[i]+1)%5 ==0){
                    grades[i] += 1;
                }else if((grades[i]+2)%5 ==0){
                    grades[i] += 2;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades,n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
