package edu.unlam.paradigmas.tp.entidades;

import java.util.Objects;

public class RegistroHistorico {
	protected String simbolo;
	protected double cantidad;
	
	
	public RegistroHistorico(String simbolo, double cantidad) {
		this.simbolo = simbolo;
		this.cantidad = cantidad;
	}
	
	public RegistroHistorico(String simbolo, String cantidad) {
		this.simbolo = simbolo;
		this.cantidad = Double.parseDouble(cantidad);
	}
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return  simbolo + ", " + cantidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(simbolo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroHistorico other = (RegistroHistorico) obj;
		return Objects.equals(simbolo, other.simbolo);
	}
}
