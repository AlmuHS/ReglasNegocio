package com.sample;
import java.util.Date;

public class Cliente {
	
	private int id;
	private String name;
	private Date ultimafechaacceso;
	
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
	
}

