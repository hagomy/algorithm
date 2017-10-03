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
 * Created by haeun on 2017-10-02
 * Site       : https://www.acmicpc.net/problem/1316
 */

public class Boj1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n ;
        String[] inputs = new String[n];
        for(int i=0; i<n; i++){
            inputs[i] = br.readLine();
        }
        for(int i=0; i<n; i++){
            int[] atoz = new int[26];
            char pre = ' ';
            int noGroup = 0;
            for(int j=0; j<inputs[i].length(); j++){
                if(pre != inputs[i].charAt(j)) {
                    atoz[(int) inputs[i].charAt(j) - 97]++;
                }
                pre = inputs[i].charAt(j);
            }
            for(int j=0; j<atoz.length; j++){
                if(atoz[j]>1){
                    noGroup++;
                }
            }
            if(noGroup > 0){
                result--;
            }
        }
        System.out.println(result);
    }

}
