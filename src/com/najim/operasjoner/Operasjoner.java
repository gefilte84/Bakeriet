package com.najim.operasjoner;

import com.najim.ingrediens.Ingrediens;
import com.najim.oppskrift.Kaketype;
import com.najim.oppskrift.Oppskrift;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Operasjoner {
    ArrayList<Ingrediens> ingrediensList = new ArrayList<>();
    ArrayList<Oppskrift> oppskriftList = new ArrayList<>();



    public void registrerIngrediens(String ingrediensNavn, Integer gram) {
        Ingrediens nyIngrediens = new Ingrediens(UUID.randomUUID(), ingrediensNavn, gram);
        ingrediensList.add(nyIngrediens);
    }
    public void registrerOppskrift(String oppskriftNavn, Kaketype kaketype, ArrayList ingrediensList){
        // Metoden for å legge til ny oppskrift

        Oppskrift nyOppskrift = new Oppskrift(UUID.randomUUID(), oppskriftNavn, LocalDate.now(),
                kaketype, ingrediensList);
        oppskriftList.add(nyOppskrift);
    }

    public void oppdaterLager(UUID ingrediensId, int gram) {
        for (Ingrediens sok : ingrediensList) {
            if (sok.getIngrediensId() == ingrediensId) {
                int nyGram = sok.gram + gram;
                sok.setGram(nyGram);
            }else if (gram <= 0) {
                System.out.println("Du har tastet inn ugyldig antall gram");
            }else
                System.out.println("IngrediensID finnes ikke");
        }
    }

    // Henter alle oppskrifter basert på kaketype med Javastream funksjon
    public void alleOppskrifterKakeType(Kaketype kaketype) {
        List<Oppskrift> sortert = oppskriftList.stream()
                .sorted(Comparator.comparing(Oppskrift::getKaketype))
                .collect(Collectors.toList());
        sortert.forEach(System.out::println);
    }
    // henter spesifikk kaketype sortert på oppskriftsnavn
    public void alleKakeTyperSortertPaaNavn(Kaketype kaketype) {
        for (Oppskrift sokKake : oppskriftList) {
            if (sokKake.getKaketype() == kaketype) {
                Arrays.sort(new String[]{sokKake.getOppskriftNavn()});
                System.out.println("Alle oppskrifter: " + sokKake);
            }
        }
    }
    // henter oppskrifter mellom to datoer
    public void oppskriftMellomToDatoer (LocalDate startDato, LocalDate sluttDato){
        for (Oppskrift sokDato : oppskriftList){
            if (sokDato.getLocalDate() == startDato && sokDato.getLocalDate() == sluttDato) {
                System.out.println(sokDato);
            }else
                System.out.println("Det finnes ingen oppskrifter mellom de to datoene");
        }
    }

}