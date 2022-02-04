package com.xitrust.cocktails;

public class Barkeeper {

	private IBeverageBar bar;

	public Barkeeper(IBeverageBar bar) {
		this.bar = bar;
	}

	public static IDrink mix(IDrink... parts) {

		return null;
	}

	public IDrink createColaRum() {

		return mix(new IDrink[] { bar.getCola(200), bar.getRum(40) });
	}

	public IDrink createGinTonic() {

		return mix(new IDrink[] { bar.getGin(20), bar.getTonic(125) });
	}

}
