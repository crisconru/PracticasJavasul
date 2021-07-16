package com.crisconru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * @author: yo
 */
public class CesarTest {

    private Cesar cesar = new Cesar(3);

    /** */
    @Test
    public void cifrarTest() {

        String mensaje = "Hola Chato";
        String cifrado = cesar.cifrar(mensaje);
        assertNotNull(cifrado);
        assertEquals("Krod Fkdwr", cifrado);
    }

    @Test
    public void cifrarNullTest() {
        String mensaje = null;
        assertThrows(NullPointerException.class, () -> cesar.cifrar(mensaje));
    }

    @Test
    public void descifrarTest() {
        String mensajeCifrado = "Frp ñd gh klhuur txh wlhph";
        String descifrado = cesar.descifrar(mensajeCifrado);
        assertNotNull(descifrado);
        assertEquals("Com îa de hierro que tieme", descifrado);
    }

    @Test
    public void descifrarNullTest() {
        String mensajeCifrado = null;
        assertThrows(NullPointerException.class, () -> cesar.descifrar(mensajeCifrado));
    }
}
