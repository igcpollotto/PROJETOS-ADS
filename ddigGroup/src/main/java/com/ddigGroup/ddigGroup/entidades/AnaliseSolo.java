package com.ddigGroup.ddigGroup.entidades;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnaliseSolo  extends BaseEntidade{
	
	
	private float nitrogenio;
	private float fosforo;
	private float potassio;
	

	public float getNitrogenio() {
		return nitrogenio;
	}
	public void setNitrogenio(float nitrogenio) {
		this.nitrogenio = nitrogenio;
	}
	public float getFosforo() {
		return fosforo;
	}
	public void setFosforo(float fosforo) {
		this.fosforo = fosforo;
	}
	public float getPotassio() {
		return potassio;
	}
	public void setPotassio(float potassio) {
		this.potassio = potassio;
	}
	
	
	
}
