package com.Salomon.Dagher;


public class Compra {
	
	private String clienteTipo;
	
	private double totalCompra;
	
	private int cantidadProductos;
	
	private double descuento;
	
	public Compra() {}

	public Compra(String clienteTipo, double totalCompra, int cantidadProductos, double descuento) {
		super();
		this.clienteTipo = clienteTipo;
		this.totalCompra = totalCompra;
		this.cantidadProductos = cantidadProductos;
		this.descuento = descuento;
	}

	public String getClienteTipo() {
		return clienteTipo;
	}

	public void setClienteTipo(String clienteTipo) {
		this.clienteTipo = clienteTipo;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getTotalpagar() {
		return totalCompra-(totalCompra*descuento/100);
	}
	

}
