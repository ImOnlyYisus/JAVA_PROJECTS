package NumerosMayorMenor;

import javax.swing.*;

public class NumeroMayorMenor {
	public static void main(String[] args) {
		/*
			Sacar numeros del 0-10, elegir el numero de rondas. JOPTION
			-Si saca un numero <5 ganas J1
			-Si saca un numero >5 gana J2
			-Si saca 5 empate y no cuenta la ronda

		 */
		String [] jOption = new String[3];
		jOption[0] = "JUGAR 1vs1";
		jOption[1] = "JUGAR vs AI";
		jOption[2] = "SALIR";
		int option = 0;

		int numeroJ1= 0;
		int numeroJ2 =0;
		int rondas =0;
		int puntosJ1=0;
		int puntosJ2=0;

		do { //SE EJECUTA HASTA QUE PULSE EL BOTON DE SALIR O PULSE LA CRUZ "X"
			option = JOptionPane.showOptionDialog(null, "JUEGO DE ELEGIR NUMERO", "GAME", 0, JOptionPane.INFORMATION_MESSAGE, null, jOption, null);
			System.out.println(option);

			boolean esCorrecto=true;
			do { //SE EJECUTA HASTA QUE EL FORMATO SEA CORRECTO Y EL NUMERO DE RONDAS SEA IMPAR
				esCorrecto = true;
				String rondasTxt = JOptionPane.showInputDialog(null, "Introduce un numero de rondas para jugar (3,5,7...)");
				try {
					rondas = Integer.parseInt(rondasTxt);
				}catch (NumberFormatException nfe){
					JOptionPane.showMessageDialog(null,"Formato incorrecto");
					esCorrecto = !esCorrecto;
				}

				if(rondas%2==0){
					JOptionPane.showMessageDialog(null,"El numero de rondas debe ser impar");
				}
			}while (!esCorrecto && rondas%2==0 && rondas==0);

			switch (option){
				case 0:
					for(int i=0; i <=rondas ; i++){
						numeroJ1=pedirNumeroJOption(0,5,1);
						numeroJ2=pedirNumeroJOption(0,5,2);

						boolean esMayor = esMayor(numeroJ1,numeroJ2);
						if(esMayor){
							puntosJ1++;
							JOptionPane.showMessageDialog(null,"RONDA ["+i+"] GANA J1\nJ1:"+numeroJ1+"\nJ2:"+numeroJ2+"\n~~PUNTOS~~\nJ1->"+puntosJ1+"\nJ2->"+puntosJ2);
						} else if(!esMayor){
							puntosJ2++;
							JOptionPane.showMessageDialog(null,"RONDA ["+i+"] GANA J2\nJ1:"+numeroJ1+"\nJ2:"+numeroJ2+"\n~~PUNTOS~~\nJ1->"+puntosJ1+"\nJ2->"+puntosJ2);
						} else {
							JOptionPane.showMessageDialog(null,"EMPATE NO CUENTA LA RONDA"+"\n~~PUNTOS~~\nJ1:"+puntosJ1+"\nJ2:"+puntosJ2);
							i--;
						}

						if(puntosJ1>((rondas/2)+1) || puntosJ2>((rondas/2)+1)){
							break;
						}

					}

					break;
				case 1:

					break;
			}

			if(option==0 || option==1){
				String ganador = esMayor(puntosJ1,puntosJ2) ? "Gana J1": "Gana J2";
				JOptionPane.showMessageDialog(null, ganador);
			}
		} while (!(option == -1 || option == 2));


	}

	//METODO QUE COMPARA DOS NUMEROS, DEVUELVE TRUE SI EL NUMERO ES MAYOR O FALSE SI ES MENOR
	private static boolean esMayor(int primerNumero, int segundoNumero){
		return (primerNumero>segundoNumero);
	}

	//METODO PARA PEDIR NUMERO JOPTION
	private static int pedirNumeroJOption(int rango1, int rango2, int jugador){
		int numero = 0;
		do {
			boolean formatoCorrecto = true;
			do {
				formatoCorrecto = true;
				String numeroTxt = JOptionPane.showInputDialog(null, "Introduce un numero Jugador["+ jugador +"] del 0-5");
				try{
					numero = Integer.parseInt(numeroTxt);
				}catch (NumberFormatException nfe){
					JOptionPane.showMessageDialog(null,"Formato incorrecto");
					formatoCorrecto = !formatoCorrecto;
				}
			}while (!formatoCorrecto);
		}while (!(numero>rango1 && numero<rango2));
		return numero;
	}

}
