package com.najim.operasjoner;

import com.najim.ingrediens.Ingrediens;
import com.najim.oppskrift.Kaketype;
import com.najim.oppskrift.Oppskrift;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class OperasjonerTest {


    ArrayList<Oppskrift> oppskriftList = new ArrayList<>();

    @Test
    void registrerIngrediens() {
        Operasjoner regIngrediens = new Operasjoner();
        regIngrediens.registrerIngrediens("Salt", 2);
        regIngrediens.registrerIngrediens("Pepper", 5);
        regIngrediens.registrerIngrediens("Mel", 20);
        regIngrediens.registrerIngrediens("Melk", 30);

        System.out.println(regIngrediens.ingrediensList);
    }

    @Test // test for å legge til en oppskrift
    void registrerOppskrift() {
        Operasjoner operasjon = new Operasjoner();
        // hvordan legger jeg til i ingredienslisten?
        operasjon.registrerIngrediens("Salt", 50);
        operasjon.registrerIngrediens("Pepper", 100);
        operasjon.registrerIngrediens("Melk", 100);
        operasjon.registrerOppskrift("Boller", Kaketype.Gjærbakst, operasjon.ingrediensList);

        System.out.println(operasjon.oppskriftList);

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