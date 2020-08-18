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
			
			System.out.println("Escolha Uma Opção: [1] Entrada [2] Saída [3] Permanência [4] Qt Carro [05] Remove [6] Listar [7] Gravar [8] Lê [0] Sair");
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
				Gerenciamento.setPessoa();
			}else if (opcao == 11 ) {
				Gerenciamento.getPessoa();
		
			}
			
		}while (opcao != 0);
		scanner.close();
	}
	private static void erro() throws IOException{
		System.out.println("Opção Invalida");
		menu();
	}
	
	private static void header() throws IOException{
		System.out.println(" ");
		System.out.println("                              BEM VINDO AO SYSTEMA DE ESTACIONAMENTO ");
		System.out.println(" ");
	}
}
