package com.sample;

public class Proyecto {
	private int id;
	private int ultima_actividad;
	private enum estado {activo, cerrado};
	private estado actual;
	
	public Proyecto(){
		actual = estado.activo;
	}
	
	public int getUltima_actividad() {
		return ultima_actividad;
	}
	
	public void setUltima_actividad(int ultima_actividad) {
		this.ultima_actividad = ultima_actividad;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public estado getActual() {
		return actual;
	}
	
	public void setActual(estado actual) {
		this.actual = actual;
	}
}
