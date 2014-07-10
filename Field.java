package com.lesson;

import java.io.IOException;

public class Field {
	
	private static final char DEFAULT_CELL_VALUE = ' '; // значение ячейки поумолчанию

	private static final int DEFAULT_FIELD_SIZE = 3;
	
	private int fieldSize;
	
	public final char[][] field; 	// инициализируем массив
	
	public Field() {				// конструктор класса с дефолтным размером поля		
		this(DEFAULT_FIELD_SIZE);
	}
	
	public Field (int size) {		//конструктор класса с предустановленным размером поля
		fieldSize = size;
		field= new char[fieldSize][fieldSize];
	}
	
	Input input = new Input();		//инициализация класса Input для ввода координат
	
	public int getFieldSize() {		//получение размера поля
		return fieldSize;
	}
	
	public void eraseField() {					//отчищает игровое поле
		for (int i = 0; i < fieldSize; i++) {
			eraseLine(i);
		}
	}
	
	public void eraseLine(int lineNumber) {		//отчищает игровое поле
		for (int i = 0; i < fieldSize; i++) {
			eraseCell(i, lineNumber);
		}
	}
	
	public void eraseCell(int i, int j) {		//отчищает игровое поле
		field[i][j] = DEFAULT_CELL_VALUE;
	}
	
	public void showField() {					//выводит на экран игровое поле
		for (int i = 0; i < fieldSize; i++) {
			showLine(i);
			System.out.println();
		}
	}
	
	private void showLine(int lineNumber) {		//выводит на экран игровое поле
		for (int i = 0; i < fieldSize; i++) {
			showCell(i, lineNumber);
		}
	}
		
	public void showCell(int i, int j) {		//выводит на экран игровое поле
		System.out.print("[" + field[i][j] + "]");
	}
	
	public void fillCellHuman(char k) throws IOException{	//ход человека
		int x,y,x1,y1;
		System.out.println("Please enter a cordinate of "+k);

		x = input.getInput("Enter x (1.."+ fieldSize +"): ");
		y = input.getInput("Enter y (1.."+ fieldSize +"): ");
		x1 = x-1;
		y1 = y-1;
		while (x <= 0 || x > fieldSize || y <= 0 || y > fieldSize || field[x1][y1]=='O' || field[x1][y1] == 'X') {
			x = input.getInput("Enter correct x (1.."+ fieldSize +"): ");
			y = input.getInput("Enter correct y (1.."+ fieldSize +"): ");
			x1 = x-1;
			y1 = y-1;
		}
		
		field[x1][y1] = k;
	}
	
	public void fillCellIO(){								//ход компьютера
		int x = (int) (Math.random() * fieldSize), y = (int) (Math.random() * fieldSize);
	    while (field[x][y] == 'O' || field[x][y] == 'X') {
	        x = (int) (Math.random() * fieldSize);
	        y = (int) (Math.random() * fieldSize);
	    }
	    field[x][y] = 'O';
		
	}
	
	char getCell(int i, int y){								//смотрим содержимое ячейки
		return field[i][y];
	}
	
public void checkWin(char k) {								//проверка выигрыша одного из игроков
		
		if (getCell(0, 0)== k && getCell(1, 0) == k && getCell(2, 0) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(0, 1)== k && getCell(1, 1) == k && getCell(2, 1) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(0, 2)== k && getCell(1, 2) == k && getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(0, 0)== k && getCell(0, 1) == k && getCell(0, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(1, 0)== k && getCell(1, 1) == k && getCell(1, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(2, 0)== k && getCell(2, 1) == k && getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(0, 0)== k && getCell(1, 1) == k && getCell(2, 2) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
		else if (getCell(0, 2)== k && getCell(1, 1) == k && getCell(2, 0) == k){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(k +" wins!!!");
		}
}

}
