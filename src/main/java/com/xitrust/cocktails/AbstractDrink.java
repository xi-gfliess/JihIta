package com.xitrust.cocktails;

public abstract class AbstractDrink implements IDrink {

	protected String name;
	protected double volume;
	protected double alcoholicContentInPercent;

	/**
	 * @param name 
	 * @param volumen in [ml]
	 * @param alcoholInPercent  in %
	 */
	public AbstractDrink(String name, double volumen, double alcoholInPercent) {
		this.name = name;
		this.volume = volumen;
		this.alcoholicContentInPercent = alcoholInPercent;
	}

	public AbstractDrink(){
		name = "";
		volume = 0;
		alcoholicContentInPercent = 0;
	}

	/**
	 * @param name 
	 * @param volumen  in [ml]
	 */
	public AbstractDrink(String name, double volumen) {
		this.name = name;
		this.volume = volumen;
	}
}
