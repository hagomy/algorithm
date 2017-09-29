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
 * Site       : https://www.acmicpc.net/problem/1152
 */

public class Boj1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int bc = 0; //0==' ', 1=='char

        String[] inputs = br.readLine().split(" ");

        for (int i=0; i<inputs.length; i++){
            if(bc == 0){
                if(inputs[i].isEmpty()){
                    bc = 0;
                }else{
                    count++;
                    bc = 1;
                }
            }else {
                if(inputs[i].isEmpty()){
                    bc = 0;
                }else{
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
