/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.model;

import com.myproject.model.enums.KebuloTipas;
import com.myproject.model.enums.GreiciuDeze;
import com.myproject.model.enums.KuroTipas;
import com.myproject.model.enums.Gamintojas;
import com.myproject.model.enums.Spalva;
import java.time.LocalDate;

/**
 *
 * @author Vardas
 */
public class Skelbimas {
    private String id;
    private LocalDate nuskenavimoData;
    private LocalDate istrinimoData;
    private LocalDate pardavimoData;
    private int metai;
    private String modelis;
    private int kaina;
    private KebuloTipas kebuloTipas;
    private double rida;
    private GreiciuDeze greiciudeze;
    private KuroTipas kuroTipas;
    private Spalva spalva;
    private Gamintojas gamintojas;
    private LocalDate data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getNuskenavimoData() {
        return nuskenavimoData;
    }

    public void setNuskenavimoData(LocalDate nuskenavimoData) {
        this.nuskenavimoData = nuskenavimoData;
    }

    public LocalDate getIstrinimoData() {
        return istrinimoData;
    }

    public void setIstrinimoData(LocalDate istrinimoData) {
        this.istrinimoData = istrinimoData;
    }

    public LocalDate getPardavimoData() {
        return pardavimoData;
    }

    public void setPardavimoData(LocalDate pardavimoData) {
        this.pardavimoData = pardavimoData;
    }
    
    

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }

    public KebuloTipas getKebuloTipas() {
        return kebuloTipas;
    }

    public void setKebuloTipas(KebuloTipas kebuloTipas) {
        this.kebuloTipas = kebuloTipas;
    }

    public double getRida() {
        return rida;
    }

    public void setRida(double rida) {
        this.rida = rida;
    }

    public GreiciuDeze getGreiciudeze() {
        return greiciudeze;
    }

    public void setGreiciudeze(GreiciuDeze greiciudeze) {
        this.greiciudeze = greiciudeze;
    }

    public KuroTipas getKuroTipas() {
        return kuroTipas;
    }

    public void setKuroTipas(KuroTipas kuroTipas) {
        this.kuroTipas = kuroTipas;
    }

    public Spalva getSpalva() {
        return spalva;
    }

    public void setSpalva(Spalva spalva) {
        this.spalva = spalva;
    }

    public Gamintojas getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(Gamintojas gamintojas) {
        this.gamintojas = gamintojas;
    }

    @Override
    public String toString() {
        return "Skelbimas{" + "id=" + id + ", nuskenavimoData=" + nuskenavimoData + ", istrinimoData=" + istrinimoData + ", pardavimoData=" + pardavimoData + '}';
    }
    
    
    
}
