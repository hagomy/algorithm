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
 * Created by haeun on 2017-10-08
 * Site       : https://www.hackerrank.com/challenges/arrays-ds
 * Difficulty : Easy
 */
public class Arrays_DS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        for(int i=n-1; i>=0; i--){
            System.out.print(inputs[i]+ " ");
        }
    }
}
