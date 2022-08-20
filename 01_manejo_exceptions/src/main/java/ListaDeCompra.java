package main.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeCompra {
	
	private ArrayList<String> lista;
	private String archivo;
	
	public ListaDeCompra( String filename) throws IOException {
		cargarLista(filename);
		archivo = filename;
	}

	private void cargarLista(String filename) throws IOException{
		lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
	}
	
	public String obtenerElemento(int indice) throws PositionException {
		if( indice <= lista.size())
			return lista.get(indice - 1);
		
		PositionException position = new PositionException("Posición fuera de los limites de la lista.");
		throw position;
	}
	
	public void insertarElemento(String elemento) throws IOException {
		BufferedWriter out = null;
		try {			
			FileWriter fstream = new FileWriter(archivo, true);
			out = new BufferedWriter(fstream);
			out.write("\n" + elemento);
			cargarLista(archivo);
		}catch(IOException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if(out != null)
				out.close();
		}
	}
	
	
}
