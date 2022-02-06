package com.xitrust.cocktails;

public class Barkeeper {

	private IBeverageBar bar;

	public Barkeeper(IBeverageBar bar) {
		this.bar = bar;
	}

	public static IDrink mix(IDrink... parts) {
		return new IDrink() {
			@Override
			public int compareTo(IDrink o) {
				return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
			}

			@Override
			public String getName() {
				String temp = "";
				for(IDrink drink : parts)
					temp += drink.getName() + "-";
				return temp.substring(0,temp.length()-1);
			}

			@Override
			public double getVolume() {
				double temp = 0;
				for(IDrink drink : parts)
					temp += drink.getVolume();
				return temp;
			}

			@Override
			public double getAlcoholicVolume() {
				double temp = 0;
				for(IDrink drink : parts)
					temp += drink.getAlcoholicVolume();
				return temp;
			}

			@Override
			public String toString(){
				String temp = "(" + getName() + "[";
				for(int i = 0; i < parts.length;i++){
					temp += parts[i];
					if(i != parts.length - 1)
						temp += ", ";
				}
				return temp + "])";
			}
		};
	}

	public IDrink createColaRum() {

		return mix(new IDrink[] { bar.getCola(200), bar.getRum(40) });
	}

	public IDrink createGinTonic() {

		return mix(new IDrink[] { bar.getGin(20), bar.getTonic(125) });
	}

}
