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

package datastructure.queue;

/**
 * Created by haeun on 2017-10-16
 */
public class ArrayQueue implements Queue<String> {
    String[] items = new String[10000];
    int rear = -1;
    int front = -1;

    @Override
    public void enqueue(String item) {
        items[++rear] = item;
    }

    @Override
    public String peek() {
        if (isEmpty()) return null;

        return items[front + 1];
    }

    @Override
    public String dequeue() {
        if (isEmpty()) return null;

        return items[++front];
    }

    @Override
    public boolean isFull() {
        if (rear==10000) return true;

        return false;
    }

    @Override
    public int size() {
        return (rear - front);
    }

    @Override
    public boolean isEmpty() {
        if (rear == front) return true;
        
        return false;
    }
}
