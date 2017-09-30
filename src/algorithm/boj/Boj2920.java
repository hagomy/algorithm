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
 * Site       : https://www.acmicpc.net/problem/2920
 */

public class Boj2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        if(inputs[0].equals("1") && inputs[1].equals("2") && inputs[2].equals("3") &&inputs[3].equals("4") &&inputs[4].equals("5") && inputs[5].equals("6") && inputs[6].equals("7") &&inputs[7].equals("8")){
            System.out.println("ascending");
        }else if(inputs[0].equals("8") && inputs[1].equals("7") && inputs[2].equals("6") &&inputs[3].equals("5") &&inputs[4].equals("4") && inputs[5].equals("3") && inputs[6].equals("2") &&inputs[7].equals("1")){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }

}
