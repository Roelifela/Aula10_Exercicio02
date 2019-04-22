package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coca grande = new Coca(500, 10.0);
        Coca media = new Coca(500, 10.0);
        Coca pequena = new Coca(290, 6.5);

        List<Coca> coca = new ArrayList<>();

        coca.add(grande);
        coca.add(media);

        System.out.println("As 2 Cocas são iguais?" + grande.equals(media));





    }



}
