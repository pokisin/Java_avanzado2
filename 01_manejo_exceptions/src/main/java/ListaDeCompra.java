package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeCompra {
	
	private ArrayList<String> lista;
	
	public ListaDeCompra( String filename) throws IOException {
		cargarLista(filename);
	}

	private void cargarLista(String filename) throws IOException{
		lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
	}
	
	public String obtenerElemento(int indice) {
		if( indice <= lista.size())
			return lista.get(indice);
		
		return "Elemento no encontrado";
	}
	
}
