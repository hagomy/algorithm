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

package algorithm.hackerrank.Arrays;

import java.io.*;

/**
 * Created by haeun on 2017-10-10
 * Site       : https://www.hackerrank.com/challenges/
 * Difficulty :
 */
public class TwoD_Array_DS {
    public static void main(String[] args) throws IOException {
        int[][] a = new int[6][6];
        int[] b = new int[16];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<6; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<6; j++){
                a[i][j] = Integer.parseInt(input[j]);
            }
        }
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[k] = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
                k++;
            }
        }
        int max = b[0];
        for(int i=0; i<16; i++){
            if(max<b[i]){
                max = b[i];
            }
        }
        System.out.println(max);
    }
}