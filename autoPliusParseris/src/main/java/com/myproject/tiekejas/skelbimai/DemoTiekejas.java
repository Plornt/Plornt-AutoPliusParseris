package com.myproject.tiekejas.skelbimai;

import com.myproject.model.VisiSkelbimai;
import java.util.ArrayList;
import java.util.List;
import com.myproject.model.Skelbimas;
import com.myproject.model.enums.Gamintojas;
import com.myproject.model.enums.GreiciuDeze;
import com.myproject.model.enums.KebuloTipas;
import com.myproject.model.enums.KuroTipas;
import com.myproject.model.enums.Spalva;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vardas
 */
public class DemoTiekejas implements SkelbimuTiekejas {

    @Override
    public VisiSkelbimai nuskaito() {

        List<Skelbimas> skelbimai = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            skelbimai.add(sukurtiAutomobili("abc" + i));
        }

        VisiSkelbimai visiSkelbimai = new VisiSkelbimai(skelbimai);
        return visiSkelbimai;
    }

    private Skelbimas sukurtiAutomobili(String id) {
        Skelbimas s = new Skelbimas();
        s.setId(id);
        s.setNuskenavimoData(LocalDate.MAX);
        s.setIstrinimoData(null);
        s.setPardavimoData(null);
        s.setGamintojas(Gamintojas.TOYOTA);
        s.setGreiciudeze(GreiciuDeze.MECHANINĖ);
        s.setKaina(5);
        s.setMetai(1);
        s.setSpalva(Spalva.BALTA);
        s.setKuroTipas(KuroTipas.DYZELINAS);
        s.setRida(1.5555);
        s.setMetai(5);
        s.setKebuloTipas(KebuloTipas.KABRIOLETAS);
        return s;
    }

    

}
