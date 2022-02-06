package com.xitrust.cocktails.test;

import com.xitrust.cocktails.Barkeeper;
import com.xitrust.cocktails.DefaultBeverageBar;
import com.xitrust.cocktails.IBeverageBar;
import com.xitrust.cocktails.IDrink;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MixedDrinkTest {

	IBeverageBar bar;

	@Before
	public void init() {
		bar = new DefaultBeverageBar();
	}

	@Test
	public void add01() throws Exception {

		Barkeeper douglas = new Barkeeper(bar);
		IDrink mg = douglas.createColaRum();

		assertEquals(240, mg.getVolume(), 0.1);
		assertEquals(15.2, mg.getAlcoholicVolume(), 0.1);

	}

	@Test
	public void testName() throws Exception {
		Barkeeper douglas = new Barkeeper(bar);
		IDrink mg = douglas.createColaRum();

		assertEquals("Cola-Rum", mg.getName());
	}

	@Test
	public void testToStringColaRum() throws Exception {
		Barkeeper douglas = new Barkeeper(bar);
		IDrink mg = douglas.createColaRum();

		assertEquals("(Cola-Rum[(Cola 0,0% 200,00), (Rum 38,0% 40,00)])", mg.toString());
	}

	@Test
	public void testMixed() throws Exception {

		Barkeeper douglas = new Barkeeper(bar);

		IDrink mischMasch = Barkeeper
				.mix(new IDrink[] { bar.getWater(200), douglas.createGinTonic(), douglas.createColaRum() });

		assertEquals(
				"(Water-Gin-Tonic-Cola-Rum[(Water 0,0% 200,00), (Gin-Tonic[(Gin 42,0% 20,00), (Tonic 0,0% 125,00)]), (Cola-Rum[(Cola 0,0% 200,00), (Rum 38,0% 40,00)])])",
				mischMasch.toString());
	}

	@Test
	public void testSort() {

		Barkeeper douglas = new Barkeeper(bar);

		List<IDrink> list = new ArrayList<IDrink>();
		list.add(bar.getBeer(250));
		list.add(bar.getWater(500));
		list.add(douglas.createColaRum());
		list.add(douglas.createGinTonic());

		assertEquals("Beer", list.get(0).getName());
		assertEquals("Water", list.get(1).getName());
		assertEquals("Cola-Rum", list.get(2).getName());
		assertEquals("Gin-Tonic", list.get(3).getName());

		Collections.sort(list);

		assertEquals("Water", list.get(0).getName());
		assertEquals("Beer", list.get(1).getName());
		assertEquals("Gin-Tonic", list.get(2).getName());
		assertEquals("Cola-Rum", list.get(3).getName());
	}

}
