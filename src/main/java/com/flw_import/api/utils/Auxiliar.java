package com.flw_import.api.utils;

public class Auxiliar {


 
    public static String trimNull(String field) {
        return field == null ? "" : field.trim();        
    }


    public static String nvl(String str, String nullText) {
        return str == null ? nullText : str;        
    }
    

    public static String nvl2(String valor){
        return valor + "####";
    }


    public static class text {

        public static String masc1(String texto){
            return "mascText1";
        }
    }



    /*public Aux(){

    }*/
    
}


