package com.javabasic;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidad = 80;
		int limite_velocidad = 70;
		
		
		/*if (velocidad > limite_velocidad) {
			System.out.println("Multa");
		} else {
			System.out.println("Vas bien chaval");
		}
		*/
		
		
		/*IF ANIDADOS*//*
		boolean carretera = true;
		
		if(carretera == true) {
			System.out.println("Vas en carretera");
			limite_velocidad = 100;
			if (velocidad > limite_velocidad) {
				System.out.println("Multa");
			} else {
				System.out.println("Vas bien chaval");
			}
		}else {
			System.out.println("no vas en carretera");
		}*/
		
		/*IF ELSE IF*//*
		boolean carretera = false;
		
		if(carretera == true) {
			System.out.println("Vas en carretera");
			limite_velocidad = 100;
			if (velocidad > limite_velocidad) {
				System.out.println("Multa");
			} else {
				System.out.println("Vas bien chaval");
			}
		}else if(velocidad > limite_velocidad){
			System.out.println("vas en una calle MULTA POR PENDEJO");
		}else {
			System.out.println("vas en una calle puedes ir en paz");
		}*/
		
		
		
		/*SWITCH CASE*/
		int temperatura = 22;
		
		switch(temperatura) {
		case 10:
			System.out.println("frio");
			break;
		case 20: 
			System.out.println("tibio");
			break;
		case 30:
			System.out.println("caliente");
			break;
		case 40:
			System.out.println("quema");
			break;
		default:
			System.out.println("da igual");
			break;
		}
		
		
		
	}

}
