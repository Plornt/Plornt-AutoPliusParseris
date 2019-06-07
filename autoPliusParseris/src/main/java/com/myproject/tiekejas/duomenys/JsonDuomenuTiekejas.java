/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.tiekejas.duomenys;

import com.google.gson.Gson;
import com.myproject.model.VisiSkelbimai;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Vardas
 */
public class JsonDuomenuTiekejas implements DuomenuTiekejas {

    private final static String FILENAME = "skelbimai.json";

    @Override
    public VisiSkelbimai nuskaito() {
        File file = new File(FILENAME);
        Reader reader;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new Gson();
        return gson.fromJson(reader, VisiSkelbimai.class);
    }

    @Override
    public void iraso(VisiSkelbimai skelbimai) {
        Gson gson = new Gson();
        String objStrContent = gson.toJson(skelbimai);
        File file = new File(FILENAME);
        try {
            FileUtils.write(file, objStrContent, StandardCharsets.UTF_8, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
