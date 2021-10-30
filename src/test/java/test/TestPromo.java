package test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import model.Atraccion;
import model.PromoPorcentual;
import model.TipoAtraccion;

public class TestPromo {

	@Test
	public void obtenerTipoAtraccion() {
		
		Atraccion atraccion1 = new Atraccion("Arenas", 6, 7d, 9, TipoAtraccion.AVENTURA);
		Atraccion atraccion2 = new Atraccion("Playa", 10, 6d, 11, TipoAtraccion.PAISAJE);
		Atraccion atraccion3 = new Atraccion("Cielo", 4, 5d, 8, TipoAtraccion.PAISAJE);
		
		List<Atraccion> atracciones = new LinkedList<Atraccion>();
		
		atracciones.add(atraccion1);
		atracciones.add(atraccion2);
		atracciones.add(atraccion3);
	
		String[] nombres = {"Playa","Cielo"};
		PromoPorcentual promo = new PromoPorcentual(TipoAtraccion.PAISAJE, "Porcentual", nombres,20);
		
		promo.establecerHsPromo(promo, atracciones);
		promo.establecerPrecioPromo(promo, atracciones);
		
		assertEquals(TipoAtraccion.PAISAJE,promo.getTipo());
		
	}
}

