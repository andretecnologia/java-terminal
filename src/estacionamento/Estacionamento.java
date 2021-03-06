package estacionamento;

import java.io.IOException;

import estacionamento.gerenciamento.Gerenciamento;
import estacionamento.repository.Repositorio;

public class Estacionamento extends Repositorio{

	public static void main(String[] args) throws IOException {
		le();
		header();
		menu();
	}	
		
	
	public static void menu() throws IOException{
		do {
			
			System.out.println("Escolha Uma Op��o: [1] "
					+ "Entrada [2] "
					+ "Sa�da [3] "
					+ "Perman�ncia "
					+ "[04] Qt Carro "
					+ "[05] Remove "
					+ "[06] Listar "
					+ "[07] Gravar "
					+ "[08] L� "
					+ "[09] Testes "
					+ "[10] Escreve pessoa "
					+ "[11] L� pessoa "
					+ "[12] Esc Lst de pessoa "
					+ "[13] L� Lst de pessoa "
					+ "[14] Ins Motorista"
					+ "[15] L� Motorista"
					+ "[0] Sair");
			try {
			opcao = scanner.nextInt();
			}catch (Exception e) {
				erro();
			}
			
			if (opcao == 1) {
				Gerenciamento.setEntrada();
			}else if (opcao == 2 ){
				Gerenciamento.setSaida();
			}else if (opcao == 3 ) {
				Gerenciamento.getPermanencia();
			}else if (opcao == 4 ) {
				Gerenciamento.getQuantidade();
			}else if (opcao == 5 ) {
				Gerenciamento.removeEstadia();				
			}else if (opcao == 6 ) {
				Gerenciamento.listEstadia();
			}else if ( opcao == 7 ) {
				Gerenciamento.grava();
			}else if ( opcao == 8 ) {
				Gerenciamento.le();
			}else if ( opcao == 9 ) {
				Gerenciamento.debug();
			}else if ( opcao == 10 ) {
				Gerenciamento.inserePessoa();
			}else if (opcao == 11 ) {
				Gerenciamento.getPessoa();
			}else if (opcao == 12 ) {
				Gerenciamento.insereMotorista();
			}
			
		}while (opcao != 0);
		scanner.close();
	}
	private static void erro() throws IOException{
		System.out.println("Op��o Invalida");
		menu();
	}
	
	private static void header() throws IOException{
		System.out.println(" ");
		System.out.println("                              BEM VINDO AO SYSTEMA DE ESTACIONAMENTO ");
		System.out.println(" ");
	}
}
