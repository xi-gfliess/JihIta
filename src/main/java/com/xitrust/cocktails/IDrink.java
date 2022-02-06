package com.xitrust.cocktails;


public interface IDrink extends Comparable<IDrink> {

	/**
	 * @return namen of the drink
	 */
	public String getName();

	/**
	 * @return volumen
	 */
	public double getVolume();

	
	/**
	 * @return  volumen of alcohol in the drink
	 */
	public double getAlcoholicVolume();

	public String toString();

}