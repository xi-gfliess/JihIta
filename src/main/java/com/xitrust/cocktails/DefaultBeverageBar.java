package com.xitrust.cocktails;


import java.text.DecimalFormat;

public class DefaultBeverageBar extends AbstractDrink implements IBeverageBar, IMixedDrink {

    public DefaultBeverageBar(String name, double volumen, double alcoholInPercent) {
        super(name, volumen, alcoholInPercent);
    }

    public DefaultBeverageBar(String name, double volumen) {
        super(name, volumen);
    }

    public DefaultBeverageBar(){
        super();
    }


    private String getNum(double num){
        String temp = new DecimalFormat("#.#").format(num);
        if(temp.equals((int)num + ""))
            return temp + ",0%";
        else return temp + "%";
    }

    private String getNum2(double num){
        String temp = new DecimalFormat("#.##").format(num);
        if(temp.equals((int)num + ""))
            temp += ",00";
        return temp;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public double getVolume() {
        return super.volume;
    }

    @Override
    public double getAlcoholicVolume() {
        return super.alcoholicContentInPercent;
    }

    @Override
    public IDrink getWater(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Water";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return 0;
            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public IDrink getBeer(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Beer";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return volumen / 50;
            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public IDrink getCola(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Cola";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return 0;
            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public IDrink getGin(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Gin";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return Double.parseDouble(new DecimalFormat("#.#").format(volumen / 2.38));

            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public IDrink getTonic(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Tonic";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return 0;
            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public IDrink getRum(double volumen) {
        return new IDrink() {
            @Override
            public int compareTo(IDrink o) {
                return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
            }
            @Override
            public String getName() {
                return "Rum";
            }

            @Override
            public double getVolume() {
                return volumen;
            }

            @Override
            public double getAlcoholicVolume() {
                return Double.parseDouble(new DecimalFormat("#.#").format(volumen / 2.63));
            }

            @Override
            public String toString(){
                return "(" + getName() + " " + getNum(getAlcoholicVolume()) + " " + getNum2(getVolume()) + ")";
            }
        };
    }

    @Override
    public void addDrink(IDrink part) {}

    @Override
    public int compareTo(IDrink o) {
        return Double.compare(getAlcoholicVolume(),o.getAlcoholicVolume());
    }
}


