package com.example.proiect;

import org.testng.annotations.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ISBN_DBTest {

    @Test
    void ISBN_to_Object() throws IOException {
    Carte c = ISBN_DB.ISBN_to_Object("6069830717");
    assertEquals(c.toString(),"Carte{Titlu='Amintiri Din Copilarie (Romanian Edition)', Editura='SC Active Business Development Srl', ISBN='6069830717', Limba='ro', Lista autori:=[\"Creanga, Ion\"], Data publicarii=2016, Numar pagini=68, rating=5.0, id=0}");

    }

}