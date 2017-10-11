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
 * Created by haeun on 2017-10-11
 * Site       : https://www.hackerrank.com/challenges/array-left-rotation
 * Difficulty : Easy
 */
public class LeftRotation {
    static int[] leftRotation(int[] a, int d) {
        for(int j=0; j<d; j++) {
            int tmp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = tmp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        String[] a0 = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(a0[i]);
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
