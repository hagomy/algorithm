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

package datastructure.stack;

/**
 * Created by haeun on 2017-10-05
 */
public class ArrayStack implements Stack<String>{

    String[] items = new String[10000];

    int top = -1;

    @Override
    public void push(String item) {
        items[++top] = item;
    }

    @Override
    public String pop() {
        if (empty()){
            return null;
        }
        return items[top--];
    }

    @Override
    public String peek() {
        if(empty()){
            return null;
        }
        return items[top];
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean empty() {
        return top == -1;
    }
}
