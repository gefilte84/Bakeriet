package com.najim.oppskrift;




import com.najim.ingrediens.Ingrediens;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Oppskrift {
    public final UUID oppskriftId;
    public String oppskriftNavn;
    private final LocalDate localDate;
    public final Kaketype kaketype;




    public Oppskrift(UUID oppskriftId, String oppskriftNavn, LocalDate localDate, Kaketype kaketype) {
        this.oppskriftId = oppskriftId;
        this.oppskriftNavn = oppskriftNavn;
        this.localDate = localDate;
        this.kaketype = kaketype;


    }

    public UUID getOppskriftId() {
        return oppskriftId;
    }

    public String getOppskriftNavn() {
        return oppskriftNavn;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

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
