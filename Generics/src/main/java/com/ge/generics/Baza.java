/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ge.generics;

/**
 *
 * @author Mariusz.Gazdowicz
 */
public abstract class Baza<S, V, K> {

    public void wykonaj(S value) {
        K akcja1 = akcja1();
        K akcja2 = akcja2(akcja1);
        subAkcja1(value, akcja2);
    }
    
    public abstract K akcja1();
    
    public abstract K akcja2(K k);
    
    public abstract void akcja3();
    
    public abstract V subAkcja1(S wartosci,K klucze);
    
    public abstract void subAkcja2();
    
    public abstract void subAkcja3();
    
}
