package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public final class Bigmac {

    public final static String SAUCE_STANDAARD = "STANDARD";
    public final static String SAUCE_THOUSANDS_ISLANDS = "THOUSANDS ISLANDS";
    public final static String SAUCE_BARBECUE = "BARBECUE";

    public final static String SALAD = "SALAD";
    public final static String ONION = "ONION";
    public final static String BECON = "BECON";
    public final static String CUCUMBER = "CUMBER";
    public final static String PEPPERS = "PEPPERS";
    public final static String CHILLI = "CHILLI";
    public final static String MUSHROOMS = "MUSHROOMS";
    public final static String SHRIMP = "SHRIMP";
    public final static String CHEESE = "CHEESE";


    private final String bun;
    private final int burgers;
    private final String sauce;
    private final ArrayList<String> ingredients;

    private Bigmac(String bun, int burgers, String sauce, ArrayList<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {

            if (bun == null) {
                throw new IllegalStateException("No choose bun");
            }
            if (sauce == null) {
                throw new IllegalStateException("No choose sauce");
            }

            if (!(sauce.equals(SAUCE_STANDAARD)
                    || sauce.equals(SAUCE_THOUSANDS_ISLANDS)
                    || sauce.equals(SAUCE_BARBECUE))) {
                throw new IllegalStateException("you choose wrong sauce");
            }

            if (ingredients == null) {
                throw new IllegalStateException("No choose ingredients");
            }
            
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
