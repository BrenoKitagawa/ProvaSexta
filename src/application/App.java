package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Notas;

public class App {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	char continuar;
	int opcao;
	do {
	
		System.out.println("Sistema de registro de notas fiscais");
		System.out.println("------------------");
		System.out.println("1-Para registrar nova nota");
		System.out.println("2-listar todas as notas");
		System.out.println("3-calcular impostos de todas as notas");
		System.out.println("4-sair do sistema");
		System.out.println("------------------");
			
		opcao = sc.nextInt();
		switch(opcao) {
		
		case 1:{
			sc.nextLine();
			System.out.println("Novo registro");
			System.out.println("Digite a razão social");
			String razao = sc.nextLine();
			System.out.println("Digite o cnpj");
			String cnpj = sc.nextLine();
			System.out.println("Digite o email");
			String email = sc.nextLine();
			System.out.println("Digite o número da nota fiscal");
			String numero = sc.nextLine();
			System.out.println("Digite a data de emissão");
			Date data =format.parse(sc.nextLine());
			System.out.println("Digite a descrição");
			String descricao = sc.nextLine();
			System.out.println("Digite o valor");
			float valor = sc.nextFloat();
			sc.nextLine();
			System.out.println("Digite a razão social  ( 1 - Simples nacional) ou (2 - Lucro presumido)");
			int regime = sc.nextInt();
			
			if(regime == 1) {
				System.out.println("pronto");
				Notas nota = new Notas(razao,cnpj,email,numero,data,descricao,valor,"Simples nacional");
				nota.addNotas(nota);
		
			}else if(regime ==2){
				System.out.println("foda");
				Notas nota = new Notas(razao,cnpj,email,numero,data,descricao,valor,"Lucro presumido");
				nota.addNotas(nota);
			}else {
				System.out.println("Algo deu errado...");
			}
		}
			break;
		case 2:{
			System.out.println("Listagem de notas");

				for(Notas olocoMeu : Notas.getNotas() ) {
					if(olocoMeu.getRegime().equalsIgnoreCase("Simples nacional")) {
						System.out.println(olocoMeu);
					}
					
		}		
				for(Notas olocoMeu : Notas.getNotas() ) {
					if(olocoMeu.getRegime().equalsIgnoreCase("Lucro presumido")) {
						System.out.println(olocoMeu);

					}
					
		}
		}
			break;
		case 3:{
			System.out.println("Valor que devera pagar de cada nota");
			Notas notas = new Notas();
			notas.calcularImposto();
				
		
			
		}
			break;
		default:System.out.println("Saindo do sistema");	
		
		}
		
		
		if(opcao != 4) {
		System.out.println("Gostaria de continuar no sistema? (y/n)");
		}
		
		
		
		
		
		continuar=sc.next().charAt(0);
		
	}while(continuar == 'y' || continuar == 'Y');
	
	sc.close();
	

	}

}
