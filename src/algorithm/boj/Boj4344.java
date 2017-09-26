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

package algorithm.boj;

import java.io.*;

/**
 * Created by haeun on 2017-09-26
 * Site       : https://www.acmicpc.net/problem/4344
 */

public class Boj4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            String[] inputs = br.readLine().split(" ");
            int size = Integer.parseInt(inputs[0]);
            int[] inputss = new int[size];
            for (int j = 0; j < size; j++) {
                inputss[j] = Integer.parseInt(inputs[j + 1]);
            }


            float sum = 0;
            float avr[] = new float[c];

            for (int k = 0; k < size; k++) {
                sum += inputss[k];
            }

            avr[i] = sum / size;
            float count = 0;
            for (int k = 0; k < size; k++) {
                if (inputss[k] > avr[i]) {
                    count++;
                }
            }
            System.out.println(String.format("%.3f", count / size * 100) + "%");
        }


    }
}
