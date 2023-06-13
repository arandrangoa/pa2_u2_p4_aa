package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICuentaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CuentaBancaria cta=new CuentaBancaria();
		cta.setCedulaPropietario("1727193847");
		cta.setNumero("1234");
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("Ahorro");
		
		this.bancariaService.apertura(cta);
		
		
		CuentaBancaria ctaEn=this.bancariaService.consultar(2);
		ctaEn.setCedulaPropietario("1714458237");
		this.bancariaService.modificar(ctaEn);
		
		
		CuentaBancaria ctaSaldo=this.bancariaService.consultar(3);
		System.out.println("El saldo de la cuenta con id 3 es: "+ctaSaldo.getSaldo());
		

	}

}
