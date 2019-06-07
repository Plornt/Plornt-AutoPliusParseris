/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.model;

import java.util.List;

/**
 *
 * @author Vardas
 */
public class VisiSkelbimai {

    private List<Skelbimas> skelbimai;
    

    public VisiSkelbimai(List<Skelbimas> skelbimai) {
        this.skelbimai = skelbimai;
    }

    public List<Skelbimas> getSkelbimai() {
        return skelbimai;
    }

    
    

}
