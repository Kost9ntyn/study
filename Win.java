package com.lesson;

public class Win {
	
	public void checkWin(char k) {
		
		Field field = new Field();
		
		if (field.getCell(0, 0)== k && field.getCell(1, 0) == k && field.getCell(2, 0) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(0, 1)== k && field.getCell(1, 1) == k && field.getCell(2, 1) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(0, 2)== k && field.getCell(1, 2) == k && field.getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(0, 0)== k && field.getCell(0, 1) == k && field.getCell(0, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(1, 0)== k && field.getCell(1, 1) == k && field.getCell(1, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(2, 0)== k && field.getCell(2, 1) == k && field.getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(0, 0)== k && field.getCell(1, 1) == k && field.getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (field.getCell(0, 2)== k && field.getCell(1, 1) == k && field.getCell(2, 0) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
	//	System.out.println(field.getCell(0, 0));
		//getCell(0, 0);
		//System.out.println("this is "+bla);
		
//		if (getField[0][0]== k && getField[1][0] == k && getField[2][0] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[0][1]== k && getField[1][1] == k && getField[2][1] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[0][2]== k && getField[1][2] == k && getField[2][2] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[0][0]== k && getField[0][1] == k && getField[0][2] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[1][0]== k && getField[1][1] == k && getField[1][2] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[2][0]== k && getField[2][1] == k && getField[2][2] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[0][0]== k && getField[1][1] == k && getField[2][2] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
//		else if (getField[0][2]== k && getField[1][1] == k && getField[2][0] == k){
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
//			System.out.println(k +" wins!!!");
//		}
	}

}
