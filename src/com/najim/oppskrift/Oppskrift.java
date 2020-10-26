package com.najim.oppskrift;




import com.najim.ingrediens.Ingrediens;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Oppskrift {
    public final UUID oppskriftId;
    public String oppskriftNavn;
    private final LocalDate localDate;
    public final Kaketype kaketype;
    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();



    public Oppskrift(UUID oppskriftId, String oppskriftNavn, LocalDate localDate, Kaketype kaketype, ArrayList ingredienser) {
        this.oppskriftId = oppskriftId;
        this.oppskriftNavn = oppskriftNavn;
        this.localDate = localDate;
        this.kaketype = kaketype;


    }
    public void LeggTilIngrediens(Ingrediens ingrediens){
        ingredienser.add(ingrediens);
    }
    public void visIngredienser() {
        for (Ingrediens produkt : ingredienser) {
            System.out.println(produkt);
        }
    }


    public UUID getOppskriftId() { return oppskriftId; }

    public String getOppskriftNavn() {
        return oppskriftNavn;
    }

    public LocalDate getLocalDate() { return localDate; }

    public Kaketype getKaketype() {
        return kaketype;
    }

    @Override
    public String toString() {
        return "Oppskrift{" +
                "oppskriftId=" + oppskriftId +
                ", oppskriftNavn='" + oppskriftNavn + '\'' +
                ", localDate=" + localDate +
                ", kaketype=" + kaketype +
                '}';
    }
}
