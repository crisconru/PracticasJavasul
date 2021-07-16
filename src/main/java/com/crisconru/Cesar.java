package com.crisconru;

/**
 * @author: Cristo
 */
public class Cesar {

    int key;

    /**
     * 
     * @param i
     */
    public Cesar(int i) {
        key = i;
    }

    /**
     * 
     * @param mensaje
     * @return
     */
    public String cifrar(String mensaje) {
        String cipherMsg = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char character = mensaje.charAt(i);
            cipherMsg += (character != ' ') ? (char) (character + key) : ' ';
        }
        return cipherMsg;
    }

    /**
     * 
     * @param mensajeCifrado
     * @return
     */
    public String descifrar(String mensajeCifrado) {
        String uncipherMsg = "";
        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char character = mensajeCifrado.charAt(i);
            uncipherMsg += (character != ' ') ? (char) (character - key) : ' ';
        }
        return uncipherMsg;
    }

}
