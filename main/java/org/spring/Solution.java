package org.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bufferedReader.readLine();
        Result.typeCounter(sentence);
        bufferedReader.close();

    }
}
