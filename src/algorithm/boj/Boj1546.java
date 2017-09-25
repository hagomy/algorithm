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
 * Created by haeun on 2017-09-25
 * Site       : https://www.acmicpc.net/problem/1546
 */

public class Boj1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] scores = new int[n];
        for(int i=0; i<n; i++){
            scores[i] = Integer.parseInt(inputs[i]);
        }

        int tmp=0;
        for(int i=1; i<n; i++){
            if(scores[0]<scores[i]){
                tmp = scores[0];
                scores[0] = scores[i];
                scores[i] = tmp;
            }
        }

        float sum = 0;
        for(int i=0; i<n; i++){
            sum += scores[i];
        }
        System.out.print(String.format("%.2f",sum/n/scores[0]*100));
    }

}
