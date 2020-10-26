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
        Operasjoner nyOppskrift = new Operasjoner();
        Operasjoner nyOppskrift1 = new Operasjoner();
        Operasjoner nyOppskrift2 = new Operasjoner();
        Operasjoner nyOppskrift3 = new Operasjoner();

        nyOppskrift.registrerIngrediens("Melk", 2);
        nyOppskrift.registrerIngrediens("Salt", 50);
        nyOppskrift.registrerOppskrift("Boller", Kaketype.Gjærbakst, nyOppskrift.ingrediensList);

        nyOppskrift1.registrerIngrediens("Melk", 50);
        nyOppskrift1.registrerIngrediens("Mel", 100);
        nyOppskrift1.registrerIngrediens("Salt", 20);
        nyOppskrift.registrerOppskrift("Vaniljeboller", Kaketype.Gjærbakst, nyOppskrift.ingrediensList);

        nyOppskrift2.registrerIngrediens("Mel", 100);
        nyOppskrift2.registrerIngrediens("Vann", 200);
        nyOppskrift2.registrerOppskrift("Vafler", Kaketype.AnnetBakverk, nyOppskrift.ingrediensList);

        nyOppskrift3.registrerIngrediens("Melk", 100);
        nyOppskrift3.registrerIngrediens("Egg", 50);
        nyOppskrift3.registrerIngrediens("Sukker", 100);
        nyOppskrift3.registrerIngrediens("Kardemomme", 20);
        nyOppskrift3.registrerOppskrift("Kanelbolle", Kaketype.Småkaker, nyOppskrift.ingrediensList);


        nyOppskrift.alleKakeTyperSortertPaaNavn(Kaketype.Gjærbakst);



    }

    @Test
    void oppskriftMellomToDatoer() {
    }
}