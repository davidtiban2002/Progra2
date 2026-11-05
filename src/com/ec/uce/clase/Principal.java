package com.ec.uce.clase;

public class Principal {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria("001", "Anthony", 200);
		CuentaBancaria cuenta2 = new CuentaBancaria("002", "David", 500);
		
		cuenta1.depositar(300);
		cuenta2.depositar(200);
		
		cuenta1.retirar(200);
		cuenta2.retirar(500);
		
		
		System.out.println("\n----- Estado de Cuentas-----");
		System.out.println("Cuenta: " +cuenta1.getNumeroCuenta());
		System.out.println("Titular: " +cuenta1.getTitular());
		System.out.println("Saldo: " +cuenta1.getSaldo());
		
		System.out.println("-------------------------------");
		
		System.out.println("Cuenta: " +cuenta2.getNumeroCuenta());
		System.out.println("Titular: " +cuenta2.getTitular());
		System.out.println("Saldo: " +cuenta2.getSaldo());
		
		System.out.println("\nTotal de cuentas creadas: " + CuentaBancaria.getTotalCuentas());
	}

}
