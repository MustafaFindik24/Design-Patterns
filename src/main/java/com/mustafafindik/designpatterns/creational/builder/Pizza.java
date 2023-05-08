package com.mustafafindik.designpatterns.creational.builder;

import lombok.Data;

@Data
public class Pizza {
    private String hamur;
    private String sos;
    private String peynir;
    private boolean sosis;
    private boolean mantar;
    private boolean zeytin;

    public Pizza(PizzaBuilder builder){
        this.hamur= builder.hamur;
        this.sos= builder.sos;
        this.peynir= builder.peynir;
        this.sosis= builder.sosis;
        this.mantar= builder.mantar;
        this.zeytin= builder.zeytin;
    }
    public static class PizzaBuilder {
        private String hamur;
        private String sos;
        private String peynir;
        private boolean sosis;
        private boolean mantar;
        private boolean zeytin;

        public PizzaBuilder(String hamur, String sos) {
            this.hamur = hamur;
            this.sos = sos;
        }

        public PizzaBuilder addPeynir(String peynir) {
            this.peynir = peynir;
            return this;
        }

        public PizzaBuilder addSosis(boolean sosis) {
            this.sosis = sosis;
            return this;
        }

        public PizzaBuilder addMantar(boolean mantar) {
            this.mantar = mantar;
            return this;
        }

        public PizzaBuilder addZeytin(boolean zeytin) {
            this.zeytin = zeytin;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
