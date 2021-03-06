package Wyrazenie.op1arg;

import Wyrazenie.Wyrazenie;

/**
 * Klasa Odrotnosc reprezentuje wartosc odwrotna 
 * @author Kamil
 
 */
public class Odwrotnosc extends Operator1arg{
     /**
     * Oblicza wyrazenie dla podanej klasy
     * @return Wynik wyrazenia
     */   
    @Override
    public double oblicz(){
        if (x.oblicz()==0) throw new IllegalArgumentException("Dzielenie przez zero");
        return 1/x.oblicz();
    }
    
    public Odwrotnosc (Wyrazenie x){
        super(x);
    };

     /**
     * 
     * @return Reprezentacja wyrazenia 
     */       
    @Override
    public String toString() {
        return "(1/"+x+")";
    }    
}
