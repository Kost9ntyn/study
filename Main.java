package com.lesson;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Field field = new Field();
		Win win = new Win();
		
		field.showField();				//����� �������� ����
		
		for (int i = 0; i < (field.getFieldSize()*field.getFieldSize())-1; i++) {	//������ ���� ���� ����.
			field.fillCellHuman('X'); 	//��� ��������
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.showField(); 			//����� �������� ����
			win.checkWin('X');			//�������� �������� �
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.fillCellIO();			//��� ����������
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			field.showField();			//����� �������� ����
			win.checkWin('O');			//�������� �������� �
		}

	}
}
