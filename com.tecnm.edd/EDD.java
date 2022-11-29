package com.tecnm.edd;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mario Rios <jose.rf@culiacan.tecnm.mx>
 * finished by Jaime Humberto <L21170384@culiacan.tecnm.mx>
 */
public class EDD {
    
    public static void main(String[] args) {
        ApiHelper api = new ApiHelper();
        String datos = api.get("https://rickandmortyapi.com/api/character");
        System.out.println("data acquired");
        System.out.println("======================");
        JsonHelper jsonHelper = new JsonHelper();
        Personaje[] convertJsonAPersonajes = jsonHelper.convertJsonAPersonajes(datos);
        if(convertJsonAPersonajes != null){
            for (Personaje personaje : convertJsonAPersonajes) {
                System.out.println("ID: " + personaje.getID());
                System.out.println(personaje.getName());
                System.out.println();
            }
        }
        Arrays.sort(convertJsonAPersonajes);
        System.out.println("======================");
        System.out.println("Sorted by ID(descending):");
        System.out.println("");
        if(convertJsonAPersonajes != null){
            for (Personaje personaje : convertJsonAPersonajes) {
                System.out.println("ID: " + personaje.getID());
                System.out.println(personaje.getName());
                System.out.println();
            }
        }
        System.out.println("Looking for 'Alan Rails' ");
        /*
        if(convertJsonAPersonajes != null) {
            for (Personaje personaje : convertJsonAPersonajes) {
                if("Alan Rails".equals(personaje.getName())){
                    System.out.println("Found it: ");
                    System.out.println(personaje.toString());
                }
            }
        }
        */
        System.out.println(BinarySearch(convertJsonAPersonajes, 0, convertJsonAPersonajes.length-1, "Beth Smith"));
    }
    
    private static boolean BinarySearch(Personaje[] Arr, int L, int R, String value) {
        //Base ***TODO
        if(L == R) return false;
        
        int middle = (L+R)/2;
        if(Arr[middle].getName().equals(value)) return true;
        
        if(!value.equals(Arr[middle].getName())) {
            L = middle + 1;
        } 
        else {
            R = middle - 1;
        }
        return BinarySearch(Arr, L, R, value);
        
    }

    
    
}
