package factory;

import models.Cancion;

import java.util.HashMap;

public class FlyweightFactory {
    // sacamos el final de la firma del contrato porque no nos dejaba hacer un getter del Hashmap
    private static HashMap<String, Cancion> cancionesMap = new HashMap<>();

    // se declara estatico para poder acceder al metodo sin tener que instanciar una FlyweightFactory
    public static Cancion getCancion(String nombre) {
        Cancion cancion = cancionesMap.get(nombre);
        if(cancion == null) {
            cancion = new Cancion(nombre);
            cancionesMap.put(nombre, cancion);
            System.out.println("creamos una nueva cancion de titulo: " + nombre);
            return cancion;
        }
        System.out.println("devuelvo una cancion ya existente");
        return cancion;
    }

    public static HashMap<String, Cancion> getCancionesMap() {
        return cancionesMap;
    }
}
