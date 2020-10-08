package estacionamento.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import com.google.gson.Gson;

import estacionamento.entidade.Motorista;

public class RepositorioMotorista {
	public static Scanner scanner = new Scanner(System.in);
	public static final String FILENAME = "banco-motoristas.json";
	public static final String FILENAME_LISTA = "banco-lista-motoristas.json";
	public static int opcao = 0;
	
	
	public static Motorista le() throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME))));	
	Motorista motoristaBD = new Gson().fromJson(bf.readLine(), Motorista.class );

		

		bf.close();
		return motoristaBD;
	} 
	
	public static Motorista leMotorista() throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME_LISTA))));	
	Motorista motoristaBD = new Gson().fromJson(bf.readLine(), Motorista.class );
	
		

		bf.close();
		return motoristaBD;
	}
	
	public static void grava(Motorista motorista) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(FILENAME);
		pw.append(new Gson().toJson(motorista));
		pw.close();
	}

	public static void gravaListaMotorista(Motorista motorista) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(FILENAME_LISTA);
		pw.append(new Gson().toJson(motorista));
		pw.close();
	}
	
	
}
