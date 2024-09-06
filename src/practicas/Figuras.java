package practicas;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("    MENU    ");
			System.out.println("1. Linea    ");
			System.out.println("2. Cuadro    ");
			System.out.println("3. Triangulo   ");
			System.out.println("4. Rectangulo    ");
			System.out.println("5. Cuadro Contorno    ");
			System.out.println("6. ROMBO    ");
			System.out.println("7. TRIANGULO CONTORNO                ");
			System.out.println("8. ROMBO CONTORNO    ");
			System.out.println("9. FLECHA    ");
			System.out.println("0. SALIR    ");
			System.out.println("Elige Opción??    ");
			op = in.nextInt();
			switch (op) {
			case 1:
				System.out.println("\n_______LINEA______");
				System.out.println("Tamaño?");
				int n = in.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("█");
				}
				break;
			case 2:
				System.out.println("\n_____CUADRO______");
				System.out.println("Tamaño");
				int n1 = in.nextInt();
				for (int j = 0; j < n1; j++) {
					for (int i = 0; i < n1; i++) {
						System.out.print("██");
					}
					System.out.println("");

				}
				break;
			case 3:
				System.out.println("\n_____TRIANGULO______");
				System.out.println("Tamaño");
				int n2 = in.nextInt();
				for (int j = 0; j < n2; j++) {
					for (int i = 0; i < n2 - j; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < (j * 2) - 2; i++) {
						System.out.print("█");
					}
					System.out.println("");

				}
				break;
			case 4:
				System.out.println("\n_____CUADRO______");
				System.out.println("Base");
				int n3 = in.nextInt();
				System.out.println("Altura");
				int n4 = in.nextInt();
				for (int j = 0; j < n4; j++) {
					for (int i = 0; i < n3; i++) {
						System.out.print("██");
					}
					System.out.println("");

				}
				break;
				
				case 5:
					System.out.println("\n CUADRO CONTORNO \n");
					System.out.println("Tamaño?");
					int n5=in.nextInt();
					for (int i = 0; i < n5; i++) {
					System.out.print("▄▄");
					}
					System.out.println("");
					for (int j = 0; j < n5-2; j++) {
					System.out.print("█ ");
					for (int i = 0; i < n5-2; i++) {
					System.out.print("  ");
					}
					System.out.println(" █");
					}
					for (int i=0; i < n5; i++) {
					System.out.print("▀▀");
					}
					break;
			
				case 6:
					System.out.println("\n_____ROMBO______\n");
					System.out.println("Tamaño");
					int n6 = in.nextInt();
					for (int j = 0; j <= n6; j++) {
						for (int i = 0; i < n6 - j; i++) {
							System.out.print(" ");
						}
						for (int i = 0; i < (j * 2) - 1; i++) {
							System.out.print("■");
						}
						System.out.println("");

					}
					for (int j = 0; j <= n6; j++) {
						for (int i = 0; i <=j; i++) {
							System.out.print(" ");
						}
						for (int i = 1; i < ((n6 * 2)-(j*2))-2; i++) {
							System.out.print("■");
						}
						System.out.println("");
					}
					break;
			default:
				System.out.println("OPCION NO VALIDA");
				break;
			}
		} while (op != 9);

	}
	
	
}
