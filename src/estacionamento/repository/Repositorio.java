package estacionamento.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import estacionamento.estadia.Estadia;

public class Repositorio {
	public static Scanner scanner = new Scanner(System.in);
	public static final String FILENAME = "banco-de-dados.json";
	public static Map<String, Estadia> estadias = new HashMap<String, Estadia>();
	public static int opcao = 0;
	
	
	/*
	 * 
	 * BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME))))
	 * FILENAME => Classe do java
	 * File(FILENAME) => pega um arquivo e joga na Classe do java Chamada FILENAME que é do tipo arquivo, com base
	 *  neste nome do banco "banco-de-dados.json" ele cria new File(FILENAME) o objeto arquivo, então passa para 
	 * FileInputStream que é a entrada de arquivo que manipula um arquivo, então ele passa para o InputStreamReader
	 * ele conseguqe fazer a leitura do arquivo, entao passa para o BufferedReader que tem o metodo readLine() que
	 * consegue ler as linhas do arquivo que grava na variável fr ( BufferedReader fr = BufferedReader ) entao fr 
	 * passa ter tudo que tem em BufferedReader, então cada linha que ela ler ela guarda em stringLida ( String stringLida = fr.readLine() )
	 * fromJson(bf.readLine() recebe os dados tranformado no tipo de objeto desejado => TypeToken<Map<String, Estadia>>() {}.getType())
	  
	  
	  
	  então a stringLida é passada para a classe gson, que é uma biblioteca do java que pega do formato gson 
	  gson.fromJson(strngLida, new TypeToken<Map<String, Estadia>>() {}.getType()) 
	  BufferedReader
	  
	*/
	
	public static void le() throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(FILENAME))));	
	Map<String, Estadia> estadiasBD = new Gson().fromJson(bf.readLine(), new TypeToken<Map<String, Estadia>>() {}.getType());
		
		if (estadiasBD != null)
				estadias = estadiasBD;
		bf.close();
	}
	
	public static void grava() throws IOException {
		PrintWriter pw = new PrintWriter(FILENAME);
		pw.append(new Gson().toJson(estadias));
		//System.out.println(estadias);
		pw.close();
	}
}
