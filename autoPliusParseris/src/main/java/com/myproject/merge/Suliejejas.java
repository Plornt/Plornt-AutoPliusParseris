/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.merge;

import com.myproject.model.Skelbimas;
import com.myproject.model.VisiSkelbimai;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vardas
 */
public class Suliejejas {
    

    public VisiSkelbimai sulieti(VisiSkelbimai remote, VisiSkelbimai local){
        
        List <Skelbimas> forRemove = new ArrayList<>();
        
        for (Skelbimas skelbimas : local.getSkelbimai()) {
            
           Skelbimas s =  rastiTarpRemoteSkelbimu(skelbimas.getId(),remote );
            if (s == null) {
                skelbimas.setIstrinimoData(LocalDate.now());
            } else {
                forRemove.add(skelbimas);
            }
        }
        
        local.getSkelbimai().removeAll(forRemove);
        local.getSkelbimai().addAll(remote.getSkelbimai());

        return local ;

    }

    private Skelbimas rastiTarpRemoteSkelbimu(String id, VisiSkelbimai remote) {
        for (Skelbimas skelbimas : remote.getSkelbimai()) {
            if(id.equalsIgnoreCase(skelbimas.getId()) ){
                return skelbimas;
            }
            
        }
        return null;
    }
        
        
    
        
    
    
}
