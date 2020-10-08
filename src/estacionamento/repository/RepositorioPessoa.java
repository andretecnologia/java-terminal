package estacionamento.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import estacionamento.entidade.Pessoa;
import estacionamento.estadia.Estadia;

public class RepositorioPessoa {
	public static Scanner scanner = new Scanner(System.in);
	public static final String FILENAME = "banco-pessoas.json";
	public static final String FILENAME_LISTA = "banco-lista-pessoas.json";
	//public static Map<String, Estadia> estadias = new HashMap<String, Estadia>();
	public static int opcao = 0;
	
	
	public static Pessoa le() throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME))));	
	Pessoa pessoaBD = new Gson().fromJson(bf.readLine(), Pessoa.class );
	//Map<String, Estadia> estadiasBD = new Gson().fromJson(bf.readLine(), new TypeToken<Map<String, Estadia>>() {}.getType());
		
		//if (estadiasBD != null)
		//		estadias = estadiasBD;
		bf.close();
		return pessoaBD;
	}
	
	public static Pessoa leLista() throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME_LISTA))));	
	Pessoa pessoaBD = new Gson().fromJson(bf.readLine(), Pessoa.class );
	//Map<String, Estadia> estadiasBD = new Gson().fromJson(bf.readLine(), new TypeToken<Map<String, Estadia>>() {}.getType());
		
		//if (estadiasBD != null)
		//		estadias = estadiasBD;
		bf.close();
		return pessoaBD;
	}
	
	public static void grava(Pessoa pessoa) throws IOException {
		PrintWriter pw = new PrintWriter(FILENAME);
		pw.append(new Gson().toJson(pessoa));
		//System.out.println(estadias);
		pw.close();
	}

	public static void gravaLista(Pessoa pessoa) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(FILENAME_LISTA);
		pw.append(new Gson().toJson(pessoa));
		//System.out.println(estadias);
		pw.close();
	}
}
