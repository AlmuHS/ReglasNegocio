package com.sample;
import java.util.Date;;

public class Cliente {
	
	private int id;
	private String name;
	private Date ultimafechaacceso;
	private float tiemposinacceso;
	public enum estado {activo,bloqueado};
	private estado actual;
	private Boolean plazovencido;
	private Boolean info;
	
	
	public int get_id()
	{
		return id;
	}
	
	public void set_id(int id)
	{
		this.id=id;
	}
	
	public String get_name()
	{
		return name;
	}

	public void set_name(String name)
	{
		this.name=name;
	}
	
	public Date get_date()
	{
		return ultimafechaacceso;
	}
	
	public void set_date(Date fecha)
	{
		this.ultimafechaacceso=fecha;
	}
	
	public void calculatsa(Date ufa, float tsa)
	{
		ufa=this.ultimafechaacceso;
		Date fechanow = new Date();
		float diferenciaEn_ms = fechanow.getTime() - ufa.getTime();
		tsa = diferenciaEn_ms / (1000 * 60 * 60 * 24* 30* 12);
		this.tiemposinacceso=tsa;
		if(tsa>2)
		{
			this.actual=estado.bloqueado;
			set_info(true);
		}
		else set_info(false);
	}
	
	public float get_tsa()
	{
		return tiemposinacceso;
	}
	
	public estado get_actual()
	{
		return actual;
	}
	
	public void set_actual(estado actual)
	{
		this.actual=actual;
	}
	
	public Cliente(int id, String name, estado actual)
	{
		super();
		this.id=id;
		this.name=name;
		this.actual=actual;
	}

	public Boolean getPlazovencido() {
		return plazovencido;
	}

	public void setPlazovencido(Boolean plazovencido) {
		this.plazovencido = plazovencido;
	}
	
	public Boolean get_info()
	{
		return this.info;
	}
	
	public void set_info(Boolean info)
	{
		this.info=info;
	}
}

