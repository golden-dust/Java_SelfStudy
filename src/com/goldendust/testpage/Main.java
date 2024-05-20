package com.goldendust.testpage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Check {
	
	String string;
	
	public Check(String string) {
		this.string = string;
	}
	
	public boolean isPush() {
		Pattern push = Pattern.compile("push", Pattern.CASE_INSENSITIVE); 
		Matcher matcher = push.matcher(this.string);
		return matcher.lookingAt();
	}
	
	public boolean isPop() {
		Pattern pop = Pattern.compile("pop", Pattern.CASE_INSENSITIVE); 
		Matcher matcher = pop.matcher(this.string);
		return matcher.matches();
	}
	
	public boolean isSize() {
		Pattern size = Pattern.compile("size", Pattern.CASE_INSENSITIVE);
		Matcher matcher = size.matcher(this.string);
		return matcher.matches();
	}
	
	public boolean isEmpty() {
		Pattern empty = Pattern.compile("empty", Pattern.CASE_INSENSITIVE); 
		Matcher matcher = empty.matcher(this.string);
		return matcher.matches();
	}

	public boolean isTop() {
		Pattern top = Pattern.compile("top", Pattern.CASE_INSENSITIVE); 
		Matcher matcher = top.matcher(this.string);
		return matcher.matches();
	}
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> numbers = new Stack<>();
		Check check;
		
		int count = 0;
		while(count < k) {
			String input = br.readLine();
			check = new Check(input);
			if (check.isPush()) {
				int n = Integer.parseInt(input.replaceAll("[^0-9]", ""));
				numbers.push(n);
			} else if (check.isPop()) {
				try {
					int n = numbers.pop();
					System.out.println(n);
				} catch (Exception e) {
					System.out.println(-1);
				}
			} else if (check.isSize()) {
				System.out.println(numbers.size());
			} else if (check.isEmpty()) {
				int n = (numbers.empty())? 1 : 0;
				System.out.println(n);
			} else if (check.isTop()) {
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
