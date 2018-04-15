package com.sample;

import java.util.Arrays;

public class Proyecto {
	private int id;
	private int ultima_actividad;
	private enum estado {activo, cerrado};
	public boolean aceptado;
	private estado actual;
	private String pais;
	private String[] paises_ue = {"Alemania", "Austria", "Belgica", "Bulgaria",
								"Chipre", "Croacia", "Dinamarca", "Eslovaquia",
								"Eslovenia", "España", "Estonia", "Finlandia",
								"Francia", "Grecia", "Hungría", "Irlanda",
								"Italia", "Letonia", "Lituania", "Luxemburgo",
								"Malta", "Paises Bajos", "Polonia", "Portugal",
								"Reino Unido", "República Checa", "Rumanía","Suecia"};
	private boolean pais_ue;
	
	
	public Proyecto(){
		actual = estado.activo;
	}
	
	public int getUltima_actividad() {
		return ultima_actividad;
	}
	
	public void setUltima_actividad(int ultima_actividad) {
		this.ultima_actividad = ultima_actividad;
	}
	
	public void setId(int id){
		this.id = id;
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
	
	public void setPais(String pais){
		this.pais = pais;
		pais_ue = Arrays.asList(paises_ue).contains(pais);
	}

	public String getPais() {
		return pais;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public boolean isPais_ue() {
		return pais_ue;
	}

}
