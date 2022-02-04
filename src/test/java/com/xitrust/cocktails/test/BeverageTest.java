package com.xitrust.cocktails.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.xitrust.cocktails.IBeverageBar;
import com.xitrust.cocktails.IDrink;

public class BeverageTest {

	IBeverageBar bar;

	@Before
	public void init() {
//		bar = new DefaultBeverageBar();
	}

	@Test
	public void testWater() throws Exception {
		IDrink g = bar.getWater(200);
		assertEquals("Water", g.getName());
		assertEquals(200, g.getVolume(), 0.01);
		assertEquals(0, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testBeer() throws Exception {
		IDrink g = bar.getBeer(100);
		assertEquals("Beer", g.getName());
		assertEquals(100, g.getVolume(), 0.01);
		assertEquals(2, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testGin1() throws Exception {
		IDrink g = bar.getGin(100);
		assertEquals("Gin", g.getName());
		assertEquals(100, g.getVolume(), 0.01);
		assertEquals(42, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testGin2() throws Exception {
		IDrink g = bar.getGin(125);
		assertEquals("Gin", g.getName());
		assertEquals(125, g.getVolume(), 0.01);
		assertEquals(52.5, g.getAlcoholicVolume(), 0.01);
	}

	
	@Test
	public void testTonic() throws Exception {
		IDrink g = bar.getTonic(200);
		assertEquals("Tonic", g.getName());
		assertEquals(200, g.getVolume(), 0.01);
		assertEquals(0, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testRum() throws Exception {
		IDrink g = bar.getRum(100);
		assertEquals("Rum", g.getName());
		assertEquals(100, g.getVolume(), 0.01);
		assertEquals(38, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testCola() throws Exception {
		IDrink g = bar.getCola(100);
		assertEquals("Cola", g.getName());
		assertEquals(100, g.getVolume(), 0.01);
		assertEquals(0, g.getAlcoholicVolume(), 0.01);
	}

	@Test
	public void testToString() throws Exception {
		IDrink g = bar.getBeer(200);
		assertEquals("(Beer 2,0% 200,00)", g.toString());
	}
}
