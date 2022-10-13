package ejecicio;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Aca empieza el programa");
		
		int numero = 100;
		
		Autor cortazar = new Autor("Julio","Cortazar","1914","masculino","cortazar2008xd@");
		
		Editorial editorial12 = new Editorial("Julio","1169241437","Av Corrientes", "Buenos Aires","cortazar2008xd@", "435431234345" );
		
		
		Libro rayuela = new Libro("Rayuela","1940",10,100,cortazar,editorial12);
		
		JOptionPane.showMessageDialog(null, rayuela);
	}

}
