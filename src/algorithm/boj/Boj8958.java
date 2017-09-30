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
 * Created by haeun on 2017-09-30
 * Site       : https://www.acmicpc.net/problem/8958
 */

public class Boj8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            char[] inputs = br.readLine().toCharArray();
            int result = 0;
            for(int j=0; j<inputs.length; ) {
                int count = 0;
                while(inputs[j] == 'O') {
                    count++;
                    j++;
                    if(j==inputs.length){
                        break;
                    }
                }
                result += count*(count+1)/2;
                j++;
            }
            System.out.println(result);
        }
    }

}
