/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ge.generics.executions;

import com.ge.generics.Baza;

/**
 *
 * @author Mariusz.Gazdowicz
 */
public abstract class Zapis<S, V> extends Baza<S, V, String> {


    public String akcja1() {
        return "String";
    }

    public String akcja2(String x) {
        return "info";
    }

    public void akcja3() {
       
    }
}
