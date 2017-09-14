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

package algorithm.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by haeun on 2017-09-14
 * Site       : https://www.hackerrank.com/challenges/time-conversion
 * Difficulty : Easy
 */
public class TimeConversion {
    static String timeConversion(String s) {
        String out = "";
        char ampm = s.charAt(8);
        int hh = (s.charAt(0)-48)*10 + (s.charAt(1)-48);
        int mm = (s.charAt(3)-48)*10 + (s.charAt(4)-48);
        int ss = (s.charAt(6)-48)*10 + (s.charAt(7)-48);

        String MM = "";
        if(mm<10){
            MM = "0" + mm;
        }else{
            MM = "" + mm;
        }

        String SS = "";
        if(ss<10){
            SS = "0" + ss;
        }else{
            SS = "" + ss;
        }

        String HH = "";

        if(ampm == 'A'){
            if(hh == 12){
                out = "00:" + MM + ":" + SS;
            }else if(hh < 10){
                HH = "0" + hh;
                out = HH + ":" + MM + ":" + SS;
            }else{
                out = hh + ":" + MM + ":" + SS;
            }
        }else{
            if(hh == 12){
                out = hh + ":" + MM + ":" + SS;
            }else {
                hh += 12;
                out = hh + ":" + MM + ":" + SS;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
