package SistemasVentas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Productos<String>> productosList = new ArrayList<>();

        Productos<String> productos = new Productos<>("condones", 12345, 321);
        Productos<String> productos1 = new Productos<>("consolador", 12345, 2133);
        Productos<String> productos2 = new Productos<>("exfoliante", 12345, 1234);

        productosList.add(productos);
        productosList.add(productos1);
        productosList.add(productos2);

        System.out.println("Estos son los productos adquiridos:");

        for (Productos<String> producto : productosList) {
            System.out.println(producto);
        }

        System.out.println("Disfruta tus compras");
    }
}
