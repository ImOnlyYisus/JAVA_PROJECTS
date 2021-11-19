package EjLuz;

import javax.swing.*;

public class ParteA {
	public static void main(String[] args) {
		/*
        +--------------------------------------------------------------------------------------------------------------------------------------------------------+
        |                                                                                                                                                        |
        |  PARTE A                                                                                                                                               |
        | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
        |  Por todos es sabido que el precio de la energía no para de subir, y en concreto, la luz que se paga en los hogares está a un precio astronómico.      |
        |                                                                                                                                                        |
        |  La idea es que realices una calculadora de consumo eléctrico, de forma que se pueda introducir el consumo en vatios de un aparato (entre 1 y 4500),   |
        |  las horas que está funcionando al día y el precio del kWh (entre 0.1 y 0.45) para saber cuántos € hay que pagar por el consumo de ese aparato.        |
        |                                                                                                                                                        |
        |  Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada, en total consume 1.12kW en esas dos horas y media. Suponiendo un precio de   |
        |  0.30€/kWh entonces la lavadora ha gastado en lavar la ropa: 1.12kW*0.3€/kWh = 0.33€                                                                   |
        |                                                                                                                                                        |
        +--------------------------------------------------------------------------------------------------------------------------------------------------------+
        introducir : vatios de consumo entre max y min, y las horas de funcionamiento, y el precio del kwh
        resultado: precio a pagar
        */

		//CONSTANTES
		final int CONSUMO_VATIOS_MIN = 1;
		final int CONSUMO_VATIOS_MAX = 4_500;
		final int HORAS_DIA = 24;
		final double PRECIO_KWH_MIN = 0.1;
		final double PRECIO_KWH_MAX = 0.45;

		//VARIABLES
		int option =0;
		double vatiosCosumo = 0;
		double horasCosumo = 0.0;
		double precioCosumo = 0.0;
		do{
			option= JOptionPane.showConfirmDialog(null,"CALCULAR EL PRECIO A PAGAR", "MENU",JOptionPane.YES_NO_OPTION);

			if(option==0){
				boolean esValido = true;
				do {
					do {
						String vatiosConsumoText = JOptionPane.showInputDialog(null, "Introduzca el numero de vatios de consumo (" + CONSUMO_VATIOS_MIN + "-" + CONSUMO_VATIOS_MAX + ")");
						esValido = true;
						try {
							vatiosCosumo = Double.parseDouble(vatiosConsumoText);
						} catch (NumberFormatException nfe) {
							JOptionPane.showMessageDialog(null, "El formato introducido no es valido, intentalo de nuevo");
							esValido = !esValido;
						}
					} while (!esValido);

					if (!(vatiosCosumo>CONSUMO_VATIOS_MIN && vatiosCosumo<CONSUMO_VATIOS_MAX)){
						JOptionPane.showMessageDialog(null,"Esta fuera del rango");
					}
				}while(!(vatiosCosumo>CONSUMO_VATIOS_MIN && vatiosCosumo<CONSUMO_VATIOS_MAX));

				do{
					do{
						esValido=true;
						String horasFuncionamientoText = JOptionPane.showInputDialog(null, "Introduzca las horas de funcionamiento ("+0+"-"+HORAS_DIA+"h)");
						try{
							horasCosumo = Double.parseDouble(horasFuncionamientoText);
						}catch (NumberFormatException nfe) {
							JOptionPane.showMessageDialog(null, "El formato introducido no es valido, intentalo de nuevo");
							esValido = !esValido;
						}
					}while (!esValido);

					if (!(horasCosumo<=HORAS_DIA && horasCosumo>0)){
						JOptionPane.showMessageDialog(null,"Esta fuera del rango");
					}
				} while (!(horasCosumo<=HORAS_DIA && horasCosumo>0));

				do {
					do {
						esValido=true;
						String precioKhwText = JOptionPane.showInputDialog(null, "Introduzca el precio del Kwh ("+PRECIO_KWH_MIN+"-"+PRECIO_KWH_MAX+")");
						try{
							precioCosumo= Double.parseDouble(precioKhwText);
						}catch (NumberFormatException nfe) {
							JOptionPane.showMessageDialog(null, "El formato introducido no es valido, intentalo de nuevo");
							esValido = !esValido;
						}
					}while (!esValido);

					if(!(precioCosumo>=PRECIO_KWH_MIN && precioCosumo<=PRECIO_KWH_MAX)){
						JOptionPane.showMessageDialog(null,"Esta fuera del rango");
					}
				}while (!(precioCosumo>=PRECIO_KWH_MIN && precioCosumo<=PRECIO_KWH_MAX));
			}

			if(option == 0){
				double precioFinal = (vatiosCosumo * 0.001) * (precioCosumo * horasCosumo);
				String precioFinalRound = String.format("%.2f",precioFinal);
				JOptionPane.showMessageDialog(null,"El precio a pagar es de "+ precioFinalRound);
			}

		} while(!(option == 1 || option == -1));
	}

}
