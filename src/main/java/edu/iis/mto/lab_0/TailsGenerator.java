package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        List<String> lista= new ArrayList<String>();
        for(int i=0 ; i <= value.length() ; i++){
            lista.add(i,value.substring(i,value.length()));
        }
        return lista;
    }

}
