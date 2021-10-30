package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Atraccion;
import model.TipoAtraccion;

public class TestAtraccion {

	Atraccion atraccion1;
	Atraccion atraccion2;
	Atraccion atraccion3;
	@Before
	public void setUp() {
		atraccion1 = new Atraccion("Arenas", 6, 7d, 9, TipoAtraccion.AVENTURA);
		atraccion2 = new Atraccion("Playa", 10, 6d, 11, TipoAtraccion.PAISAJE);
		atraccion3 = new Atraccion("Cielo", 4, 5d, 8, TipoAtraccion.PAISAJE);
	}
	
	@Test
	public void obtenerCostoAtraccion() {
		assertEquals(4,atraccion3.getPrecio(),0);
	}
	
	@Test
	public void obtenerTiempoAtraccion() {
		assertEquals(5,atraccion3.getTiempo(),0);
	}
	
	@Test
	public void obtenerCupoAtraccion() {
		assertEquals(11,atraccion2.getCupo(),0);
	}
	
	@Test
	public void obtenerNombreAtraccion() {
		assertEquals("Cielo",atraccion1.getNombre(),0);
	}
	
	@Test
	public void obtenerTipoAtraccion() {
		
		assertEquals(TipoAtraccion.AVENTURA,atraccion1.getTipo());
	}
	
	
}
