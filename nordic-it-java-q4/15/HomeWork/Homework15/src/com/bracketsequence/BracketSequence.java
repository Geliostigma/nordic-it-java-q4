package com.bracketsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BracketSequence {

    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bracketSequence = reader.readLine();

        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < bracketSequence.length(); i++) {
            char bracket = bracketSequence.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                deque.offer(bracket);
            } else if (bracket == ')') {
                if (deque.peekLast() != null && deque.peekLast().equals('(')) {
                    deque.pollLast();
                } else {
                    deque.offer(bracket);
                }
            } else if (bracket == ']') {
                if (deque.peekLast() != null && deque.peekLast().equals('[')) {
                    deque.pollLast();
                } else {
                    deque.offer(bracket);
                }
            } else if (bracket == '}') {
                if (deque.peekLast() != null && deque.peekLast().equals('{')) {
                    deque.pollLast();
                } else {
                    deque.offer(bracket);
                }
            }
        }
        
        if (deque.peekLast() == null) {
        	System.out.println("Правильная скобочная последовательность");
        } else {
        	System.out.println("НЕПравильная скобочная последовательность");
        }
        
    }
}
