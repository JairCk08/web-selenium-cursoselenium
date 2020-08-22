package com.javabasic;

public class Tickets {

	/*Objetos*/
	int precioAdulto, edad;
	double precioNi�o, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	/*Constructor*/
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {
		precioAdulto = precioNormal;
		precioNi�o = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
	}
	
	/*Metodos*/
	public void costoDia() {
		System.out.println("El costo ticket: "+ costo);
	}
	
	public void precioAdulto() {
		System.out.println("Ticket: Adulto $"+ precioAdulto);
	}
	
	public void precioNi�o() {
		System.out.println("Ticket: Ni�o $"+ precioNi�o);
	}
	
	public void precioEstudiante() {
		System.out.println("Ticket: Estudiante $"+ precioEstudiante);
	}
	
	public void verificarCostoTicket() {
		if (estudiante == true) {
			System.out.println("Eres un estudiante, el precio de tu ticket es " + precioEstudiante);
		} else if(edad>18){
			System.out.println("Eres un adulto, tu precio de tu ticket es "+ precioAdulto);
		}else {
			System.out.println("Eres un ni�o, el precio de tu ticket es "+ precioNi�o);
		}
	}
	
	
	/*OVERLOAD*/
	
	public double sumarTicket() {
		double suma = precioAdulto + precioNi�o;
		System.out.println("Lasuma es: "+ suma);
		return suma;
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNi�o) - descuento;
		System.out.println("Lasuma es: "+ suma);
		return suma;
	}
	
	public double sumarTicket(int descuento, int descuentoextra) {
		double suma = (precioAdulto + precioNi�o) - descuento - descuentoextra;
		System.out.println("Lasuma es: "+ suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, int descuentoextra) {
		double suma = (precioAdulto + precioNi�o) - 30 - 20;
		System.out.println("Lasuma es: "+ suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, boolean descuentoextra) {
		double suma = (precioAdulto + precioNi�o) - 30 - 20;
		System.out.println("Lasuma es: "+ suma);
		return suma;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tickets tickets = new Tickets(100, 19, true);
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNi�o();
		tickets.precioEstudiante();
		
		//tickets.sumarTicket(true, false);
		tickets.sumarTicket(true, false);
		
	}

}
