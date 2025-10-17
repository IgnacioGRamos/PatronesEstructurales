package org.example;


import org.example.Adapter.MainAdapter;
import org.example.Adapter.adapterImpresora;
import org.example.Bridge.*;
import org.example.Composite.MainComposite;
import org.example.Composite.Menu;
import org.example.Composite.Plato;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /// Prueba Patron Adapter

        MainAdapter.main(args);


        System.out.println("\n// --------------------------------------------------\n");


        /// Prueba Patron Bridge

        MainBridge.main(args);

        System.out.println("\n// --------------------------------------------------\n");


        /// Prueba Patron composite

        MainComposite.main(args);



    }
}