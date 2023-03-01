package br.senai.sp;

import br.senai.sp.model.triangulo;

public class geometriaapp{

	public static void main(String[] args) {
		
		System.out.println("Criando triangulos..."); 
		
		// Criando dois triangulos
		triangulo t1 = new triangulo();
		triangulo t2 = new triangulo();
				
		// Definindo as propriedades triangulos
		t1.altura = 20;
		t1.ladoC = 10;
		t1.ladoB = 9;
		t1.base = 22;
		t1.nome = "triangulo 001";
		t1.exibirDados();
		
		t2.altura = 12;
		t2.ladoC = 5;
		t2.ladoB = 9;
		t2.base = 10;
		t2.nome = "triangulo 002";
				
		// Exibir dados dos triangulos
		t1.exibirDados();
		t2.exibirDados();
				
				
				
				
    }

}
