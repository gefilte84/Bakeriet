package com.najim.operasjoner;

import com.najim.ingrediens.Ingrediens;
import com.najim.oppskrift.Kaketype;
import com.najim.oppskrift.Oppskrift;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class OperasjonerTest {

    @Test
    void registrerIngrediens() {
        Operasjoner regIngrediens = new Operasjoner();
        regIngrediens.registrerIngrediens("Salt", 2);
        regIngrediens.registrerIngrediens("Pepper", 5);
        regIngrediens.registrerIngrediens("Mel", 20);
        regIngrediens.registrerIngrediens("Melk", 30);

        System.out.println(regIngrediens.ingrediensList);
    }

    @Test
    void registrerOppskrift() {
        Operasjoner regNyOpp = new Operasjoner();
        
        regNyOpp.registrerOppskrift("Boller", Kaketype.Gjærbakst, "Salt", 2);




    }
    @Test
    void leggTilOppskrift (){
        Operasjoner regnyOpp = new Operasjoner();

        for (Ingrediens nyIng : regnyOpp.ingrediensList) {
            regnyOpp.ingrediensList.stream()
                    .skip(1)
                    .collect(Collectors.toList());
            regnyOpp.ingrediensList.forEach(System.out::println);
        }
    }

    @Test
    void oppdaterLager() {
    }

    @Test
    void alleOppskrifterKakeType() {
    }

    @Test
    void alleKakeTyperSortertPaaNavn() {
    }

    @Test
    void oppskriftMellomToDatoer() {
    }
}