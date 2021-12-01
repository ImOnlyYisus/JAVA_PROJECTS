package jesus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

	//OBJETOS
	Cafetera cafeteraSinParametros = new Cafetera(); //Inicializa los valores como 1000 cap.max y 0 cantidadActual
	Cafetera cafeteraParametroCantMax = new Cafetera(2000); //cantidad actual lo inicializa a la capacidad max
	Cafetera cafeteraDosParametros = new Cafetera(2000, 1000);

	//PRUEBA 1: Comprobar valores de objetos
	@Test
	void valoresCafeteraSinParametros(){
		assertEquals(1000, cafeteraSinParametros.getCapacidadMaxima());
		assertEquals(0, cafeteraSinParametros.getCantidadActual());
	}

	@Test
	void valoresCafeteraParametroCantMax(){
		assertEquals(2000, cafeteraParametroCantMax.getCapacidadMaxima());
		assertEquals(2000, cafeteraParametroCantMax.getCantidadActual());
	}

	@Test
	void valoresCafeteraDosParametros(){
		assertEquals(2000, cafeteraDosParametros.getCapacidadMaxima());
		assertEquals(1000, cafeteraDosParametros.getCantidadActual());
	}

	//PRUEBA 2: Llenar cafetera
	@Test
	void llenarCafetera(){
		cafeteraSinParametros.llenarCafetera();

		assertNotEquals(0,cafeteraSinParametros.getCantidadActual());
		assertEquals(cafeteraSinParametros.getCapacidadMaxima(),cafeteraSinParametros.getCantidadActual());
	}

	//PRUEBA 3: Vaciar cafetera
	@Test
	void vaciarCafetera(){
		cafeteraParametroCantMax.vaciarCafetera();//Para cambiar el estado a 0 ya que inicializa el valor al max
		cafeteraParametroCantMax.llenarCafetera();

		assertNotEquals(0,cafeteraParametroCantMax.getCantidadActual());
		assertEquals(cafeteraParametroCantMax.getCapacidadMaxima(),cafeteraParametroCantMax.getCantidadActual());

	}

	//PRUEBA 4: servir cafe
	@Test //Servir sin tener cafe suficiente (arroja un IllegalArgumentException)
	void servirCafeSinTener(){
		assertThrows(IllegalArgumentException.class,()->{
			cafeteraSinParametros.servirTaza(100);
		});
	}

	@Test //Sirvo con bastante cafe y me sobra
	void servirCafe(){
		cafeteraParametroCantMax.servirTaza(100);

		assertEquals(cafeteraParametroCantMax.getCapacidadMaxima()-100,cafeteraParametroCantMax.getCantidadActual());
	}

	@Test //Sirvo con poco cafe y dejo el contenido a 0
	void servirCafeConPoco(){
		assertEquals(1000, cafeteraDosParametros.getCantidadActual());

		cafeteraDosParametros.servirTaza(2000);
		assertEquals(0, cafeteraDosParametros.getCantidadActual());
	}

	//PRUEBA 5: Agregar cafe
	@Test //Llenarlo con mas cafe del posible
	void agregarCafePasandoLimite(){
		assertThrows(IllegalArgumentException.class,()->{
			cafeteraSinParametros.agregarCafe(2000);
		});
	}

	@Test //Lenar el cafe con una cantidad posible
	void agregarCafe(){
		cafeteraSinParametros.agregarCafe(100);

		assertNotEquals(0, cafeteraSinParametros.getCantidadActual());
		assertEquals(100,cafeteraSinParametros.getCantidadActual());
	}


}
