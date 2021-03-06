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
 * Created by haeun on 2017-10-01
 * Site       : https://www.acmicpc.net/problem/10809
 */

public class Boj10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        int[] atoz = new int[26];
        for(int i=0; i<atoz.length; i++){
            atoz[i] = -1;
        }
        for(int i=0; i<inputs.length(); i++){
            if(atoz[(int)inputs.charAt(i) - 97] == -1) {
                atoz[(int) inputs.charAt(i) - 97] = i;
            }
        }
        for(int i=0; i<atoz.length; i++){
            System.out.print(atoz[i] + " ");
        }
    }

}
