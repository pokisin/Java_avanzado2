package main.java;

public class Principal {

	public static void main(String[] args) {
		Interfaz interfaz = new Interfaz("/home/poky/Documentos/Java/Tutorial_Java_Avanzado/01_manejo_exceptions/lista_compras.txt");
		interfaz.mostrarMenu();
	}

}
