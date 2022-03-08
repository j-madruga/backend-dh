package test;

import factory.FlyweightFactory;
import models.Cancion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlyweightFactoryTest {

    @Test
    public void factoryAddsNewSong(){
        // Arrange
        /* no ponemos nada aca porque la fabrica debe crear la canción, no nosotros */
        // Act
        Cancion eres = FlyweightFactory.getCancion("eres");
        // Assert
        Assertions.assertEquals("eres", eres.getNombre());
    }

    @Test
    public void factoryReturnsExistingSong(){
        // Arrange
        /* creo la canción por primera vez */
        Cancion eres = FlyweightFactory.getCancion("eres");
        // Act
        /* intento volver a crear la cancion, deberia en cambio devolvernos la canción existente */
        Cancion eres2 = FlyweightFactory.getCancion("eres");
        // Assert
        /* hacemos un size() del Hashmap de canciones para comprobar que no agregó una canción nueva */
        Assertions.assertEquals(1,FlyweightFactory.getCancionesMap().size());
    }

    @Test
    public void factoryAddsTwoNewSongs(){
        // Arrange
        Cancion eres = FlyweightFactory.getCancion("eres");
        // Act
        /* intento volver a crear la cancion, deberia en cambio devolvernos la canción existente */
        Cancion chiuchuUa = FlyweightFactory.getCancion("chu chu ua");
        // Assert
        /* hacemos un size() del Hashmap de canciones para comprobar que no agregó una canción nueva */
        Assertions.assertEquals(2,FlyweightFactory.getCancionesMap().size());
    }
}
