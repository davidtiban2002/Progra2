package com.ec.uce.clase;

public class CuentaBancaria {
	
	private static String nombreBanco = "Banco Central";
	private static int totalCuentasCreadas = 0;
	
	private final String numeroCuenta;
	private String titular;
	private double saldo;
	
	
	public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		
		if(titular!= null && !titular.isEmpty()) {
			this.titular = titular;
		}else {
			this.titular = "Sin titular";
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}else {
			this.saldo = 0;
		}
		
		totalCuentasCreadas ++;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(titular != null && !titular.isEmpty()) {
			this.titular = titular;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public static String getNombreBanco() {
		return nombreBanco;
	}
	
	
	public void depositar(double monto) {
		if(monto > 0) {
			double bonificacion = 0;
			
			if(monto >= 500) {
				bonificacion = 10;
			}
			
			saldo = saldo + monto + bonificacion;
			
			System.out.println("Deposito realizado correctamente");
			System.out.println("Bonificacion: " +bonificacion);
			
		}else {
			System.out.println("Monto invalido");
		}
		
	}
	
	public boolean retirar(double monto) {
		double comision = 1;
		
		if(monto > 0 && saldo >= monto + comision) {
			saldo = saldo - monto - comision;
			
			System.out.println("Retiro realizado correctamente");			
			return true;
			
		}else {
			System.out.println("Fondos insuficientes o monto invalido");
			return false;
		}
	}
	
	public static int getTotalCuentas() {
		return totalCuentasCreadas;
	}
	
	
}
