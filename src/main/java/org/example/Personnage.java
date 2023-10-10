package org.example;

public class Personnage {

    public enum Orientation {
        EST,SUD,OUEST,NORD;

        public void setOrientation(Orientation uneOrientation) {
            orientation = uneOrientation;
        }
    }
    private static Orientation orientation;

    public Personnage(){
        orientation= Orientation.EST;
    }
    //
    public static void tourner(int entier){
        if(entier == 1){
            orientation.setOrientation(Orientation.SUD);
        }
        if(entier == 2){
            orientation.setOrientation(Orientation.OUEST);
        }
        if(entier == 3 ){
            orientation.setOrientation(Orientation.NORD);
        }
        if(entier == 4){
            orientation.setOrientation(Orientation.EST);
        }
    }
    //Refactorisation de la methode tourner
    public static void tournerRefactorer(int entier) {
        switch (entier) {
            case 1:
                orientation.setOrientation(Orientation.SUD);
                break;
            case 2:
                orientation.setOrientation(Orientation.OUEST);
                break;
            case 3:
                orientation.setOrientation(Orientation.NORD);
                break;
            case 4:
                orientation.setOrientation(Orientation.EST);
                break;
            default:
                orientation.setOrientation(Orientation.OUEST);
                break;
        }
    }
    public Orientation getOrientation(){
        return orientation;
    }

}
