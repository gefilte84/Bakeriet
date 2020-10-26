package com.najim.ingrediens;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Ingrediens {

    public final UUID ingrediensId;
    private final String ingrediensNavn;
    public int gram;


    public Ingrediens(UUID ingrediensId, String ingrediensNavn, int gram) {
        this.ingrediensId = ingrediensId;
        this.ingrediensNavn = ingrediensNavn;
        this.gram = gram;
    }
    public int setGram(int nyGram){

        return gram;
    }


    public UUID getIngrediensId() {
        return ingrediensId;
    }

    public String getIngrediensNavn() {
        return ingrediensNavn;
    }

    public int getGram() {
        return gram;
    }


    @Override
    public String toString() {
        return "Ingrediens{" +
                "ingrediensId=" + ingrediensId +
                ", ingrediensNavn='" + ingrediensNavn + '\'' +
                ", gram=" + gram +
                '}';
    }
}
