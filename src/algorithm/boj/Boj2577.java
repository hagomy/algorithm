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
 * Site       : https://www.acmicpc.net/problem/2577
 */

public class Boj2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());
        int mul = a*b*c;
        int tmp = mul;
        int count = 0; //mul의 자릿수
        while(tmp != 0){
            tmp /= 10;
            count++;
        }

        int[] out = new int[10]; //각각의 숫자가 몇번 사용되었는지 체크할 배열
        for (int i=0; i<count; i++){
            out[mul%10]++;
            mul /= 10;
        }

        for (int i=0; i<10; i++){
            System.out.println(out[i]);
        }
    }

}