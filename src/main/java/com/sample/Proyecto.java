package com.sample;

public class Proyecto {
	private int id;
	private int ultima_actividad;
	private enum estado {activo, cerrado};
	private estado actual;
	private String pais;
	
	public Proyecto(int id, String pais){
		actual = estado.activo;
		this.id = id;
		this.pais = pais;
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
		
	public estado getActual() {
		return actual;
	}
	
	public void setActual(estado actual) {
		this.actual = actual;
	}

	public String getPais() {
		return pais;
	}

}
