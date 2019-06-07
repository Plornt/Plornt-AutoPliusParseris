/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.app.skaneris;

import com.myproject.merge.Suliejejas;
import com.myproject.model.Skelbimas;
import com.myproject.model.VisiSkelbimai;
import com.myproject.tiekejas.duomenys.DuomenuTiekejas;
import com.myproject.tiekejas.duomenys.JsonDuomenuTiekejas;
import com.myproject.tiekejas.skelbimai.DemoTiekejas;
import com.myproject.tiekejas.skelbimai.SkelbimuTiekejas;

/**
 *
 * @author Vardas
 */
public class ParserApp {
    public static void main(String[] args) {
        DuomenuTiekejas dt = new JsonDuomenuTiekejas();
        VisiSkelbimai localSkelbimai = dt.nuskaito();
        
        for (Skelbimas skelbimas : localSkelbimai.getSkelbimai()) {
            System.out.println(skelbimas);
            
        }
        
        
        SkelbimuTiekejas skelbimuTiekejas = new DemoTiekejas();
        VisiSkelbimai remoteSkelbimai = skelbimuTiekejas.nuskaito();
        System.out.println("");
        System.out.println("Remote is webo");
        System.out.println("");
        
         for (Skelbimas skelbimas : remoteSkelbimai.getSkelbimai()) {
            System.out.println(skelbimas);
        }
        
         
         System.out.println("done");
         
         
          Suliejejas s = new Suliejejas();
          localSkelbimai = s.sulieti(remoteSkelbimai, localSkelbimai);
         dt.iraso(localSkelbimai);
    }
}
