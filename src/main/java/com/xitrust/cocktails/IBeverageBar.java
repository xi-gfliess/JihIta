package com.xitrust.cocktails;

public  interface IBeverageBar {

	public IDrink getWater(double volumen);

	public IDrink getBeer(double volumen);
	
	public IDrink getCola(double volumen);
	
	public IDrink getGin(double volumen);
	
	public IDrink getTonic(double volumen);

	public IDrink getRum(double volumen);	
	
}
