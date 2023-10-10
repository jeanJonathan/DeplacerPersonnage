package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    //Ce test est valide par ce que par defaut la personne est
    //orientee vers l'est
    @Test
    void tourner(){
        //Given
        Personnage unPersonnage = new Personnage();
        //When
        Enum result = Personnage.Orientation.EST;
        //Then
        assertEquals(result,unPersonnage.getOrientation());
    }
    @Test
    void tourner_1_fois() {
        //Given
        Personnage unPersonnage = new Personnage();
        //When
        unPersonnage.tourner(1);
        Enum result = Personnage.Orientation.SUD;
        //Then
        assertEquals(result,unPersonnage.getOrientation());
    }

    @Test
    void tourner_2_fois(){
        //Given
        Personnage unPersonnage = new Personnage();
        //When
        unPersonnage.tourner(2);
        Enum result = Personnage.Orientation.OUEST;
        //Then
        assertEquals(result,unPersonnage.getOrientation());
    }

    @Test
    void tourner_3_fois(){
        //Given
        Personnage unPersonnage = new Personnage();
        //When
        unPersonnage.tourner(3);
        Enum result = Personnage.Orientation.NORD;
        //Then
        assertEquals(result,unPersonnage.getOrientation());
    }
    @Test
    void tourner_4_fois(){
        //Given
        Personnage unPersonnage = new Personnage();
        //When
        unPersonnage.tourner(4);
        Enum result = Personnage.Orientation.EST;
        //Then
        assertEquals(result,unPersonnage.getOrientation());
    }
}