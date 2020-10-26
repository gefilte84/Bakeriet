package com.najim.operasjoner;

import com.najim.ingrediens.Ingrediens;
import com.najim.oppskrift.Kaketype;
import com.najim.oppskrift.Oppskrift;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    @Test // test for å legge til en oppskrift
    void registrerOppskrift() {
        Operasjoner nyOppskrift = new Operasjoner();
        // hvordan legger jeg til i ingredienslisten?

        nyOppskrift.registrerIngrediens("Melk", 2);
        nyOppskrift.registrerIngrediens("Salt", 50);
        nyOppskrift.registrerOppskrift("Boller", Kaketype.Gjærbakst, nyOppskrift.ingrediensList);

        System.out.println(nyOppskrift.oppskriftList);
    }
    @Test
    void oppdaterLager() {
        Operasjoner oppdaterIngrediens = new Operasjoner();

        UUID test = UUID.fromString("23456734-2567-2569-1111-222236190458");
        Ingrediens nyIngrediens = new Ingrediens(test, "Salt", 40);
        oppdaterIngrediens.ingrediensList.add(nyIngrediens);
        oppdaterIngrediens.oppdaterLager(test, 50);

        System.out.println(oppdaterIngrediens.ingrediensList);
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