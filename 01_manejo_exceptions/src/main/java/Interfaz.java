package main.java;

import java.io.IOException;
import java.util.Scanner;

public class Interfaz {
	
	private ListaDeCompra listaDeCompra;
	
	public Interfaz(String archivo) {
		try {
			listaDeCompra = new ListaDeCompra(archivo);
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error con el archivo lista_compras.txt");
		}
	}
	
	public void mostrarMenu(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("Para salir ingrese el 0");
			System.out.println("Para ver un elemento seleccione un número para buscarlo en la lista: ");
			System.out.println("Para agregar un elemento introduzca el: -1");
			
			opcion = scanner.nextInt();
			if( opcion > 0) {
				mostrarElemento(opcion);
			}
			if( opcion == -1) {
				agregarElemento();
			}
		} while (opcion != 0);
	}
	
	private void agregarElemento(){
		System.out.println("¿Que elemento desea agregar?");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String elemento = scanner.nextLine();
		try {
			listaDeCompra.insertarElemento(elemento);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void mostrarElemento(int indice) {
		System.out.println("El elemento número "+ indice + " de la lista es: "+ listaDeCompra.obtenerElemento(indice));
	}
	
}
