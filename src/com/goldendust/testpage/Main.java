package com.goldendust.testpage;

import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> numbers = new Stack<>();
		
		int count = 0;
		while(count < k) {
			String input = br.readLine();
			
			if (input.startsWith("push")) {
				int n = Integer.parseInt(input.replaceAll("[^0-9]", ""));
				numbers.push(n);
			} else if (input.equals("pop")) {
				try {
					int n = numbers.pop();
					System.out.println(n);
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (input.equals("size")) {
				System.out.println(numbers.size());
			} else if (input.equals("empty")) {
				int n = (numbers.empty())? 1 : 0;
				System.out.println(n);
			} else if (input.equals("top")) {
				try {
					System.out.println(numbers.peek());
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else {
				System.out.println("Wrong input!");
			}
			
			count++;
		}

	}
	
}
