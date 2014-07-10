package com.lesson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
	
	public static int getInput(String prompt) {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return Integer.parseInt(stdin.readLine());
		} catch (Exception e) {
			System.out.println("Error");
			//return "Error: " + e.getMessage();
		}
		return 0;
	}
	
//	public void inputCheck() {
//		int x,x1,y,y1;
//		x = Integer.parseInt(this.getInput("Enter correct x (1.."+ field.getFieldSize() +"): "));
//		y = Integer.parseInt(this.getInput("Enter correct y (1.."+ field.getFieldSize() +"): "));
//		x1 = x-1;
//		y1 = y-1;
//	}

}
