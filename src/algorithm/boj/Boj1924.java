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
 * Created by haeun on 2017-09-23
 * Site       : https://www.acmicpc.net/problem/1924
 */

public class Boj1924 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        int[] dd = {0,3,0,1,0,1,0,0,1,0,1,0};
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] pr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int result = (x-1) * 31 + y;

        for(int i=0; i<x-1; i++){
            result -= dd[i];
        }

        System.out.print(pr[result%7]);
    }

}
