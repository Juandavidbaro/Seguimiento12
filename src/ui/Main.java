package ui;

import java.util.Scanner;

import model.DoubleListDouble;


public class Main {

		public static void main(String[] args) {
		
		DoubleListDouble doublelist=new DoubleListDouble();
		Scanner scan = new Scanner(System.in);
		
		boolean flag=true;
		int value=1;
		
		while(flag){
			
			System.out.println("Digite la opción deseada");
			System.out.println(" 1. Dar turno\n 2. Mostrar turno\n 3. Pasar turno\n 4. Eliminar turno actual");
			int option = scan.nextInt();
		
			switch (option) {
			case 1: 
				doublelist.add(value);
				System.out.println("El turno ha sido agregado correctamente\n");
				value++;
				break;
			case 2:
				doublelist.mostrarTurno();
				break;
			case 3:
				doublelist.pasarTurno();
				System.out.println("Se ha pasado el turno");
				break;
			case 4:	
				doublelist.delete(value);
				break;
			}
		}
		}

}
