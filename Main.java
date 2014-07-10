package com.lesson;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Field field = new Field();
		Win win = new Win();
		
		field.showField();				//вывод игрового поля
		
		for (int i = 0; i < (field.getFieldSize()*field.getFieldSize())-1; i++) {	//играем пока есть ходы.
			field.fillCellHuman('X'); 		//ход человека
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.showField(); 			//вывод игрового поля
			win.checkWin('X');			//проверка выигрыша Х
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.fillCellIO();			//ход компьютера
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.showField();			//вывод игрового поля
			win.checkWin('O');			//проверка выигрыша О
		}

	}
}
