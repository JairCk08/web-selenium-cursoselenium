package com.javabasic;

public class ArreglosStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*UNIDIMENSIONAL*/
		/*String []nombre = new String[4];
		
		nombre[0]= "Ricardo";
		nombre[1]= "Jair";
		nombre[2]= "Juan";
		nombre[3]= "Maur";
		
		System.out.println(nombre[2]);**/
		
		/*BIDIMENSIONAL*/
		String[][]persona = new String[2][2];
		
		persona[0][0]="Jair"; persona [0][1]= "Qa Analyst";
		persona[1][0]="Jonnier";persona[1][1]= "Qa Analyst";
		
		
		//System.out.println("esta persona es " + persona[1][0] + " con cargo de " + persona[1][1]);
		
	}
	
	
	public static void getNombre(String persona[][]) {
		System.out.println("esta persona es " + persona[1][0] + " con cargo de " + persona[1][1]);
	}
	


}
