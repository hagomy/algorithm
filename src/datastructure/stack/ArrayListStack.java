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

import java.util.ArrayList;

/**
 * Created by haeun on 2017-10-05
 */
public class ArrayListStack implements Stack<String> {
    ArrayList<String> items = new ArrayList();

    @Override
    public void push(String item) {
        items.add(item);
    }

    @Override
    public String pop() {
        String input = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return input;
    }

    @Override
    public String peek() {
        return items.get(items.size() - 1);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean empty() {
        return items.isEmpty();
    }
}
