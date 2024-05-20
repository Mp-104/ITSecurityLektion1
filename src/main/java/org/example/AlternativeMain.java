package org.example;

import javax.swing.*;
import java.util.HashMap;

public class AlternativeMain {

    private static Hash hash = new Hash();

    static HashMap<String, String> hashMap = new HashMap<>();



    public static void main(String[] args) {

        JOptionPane.showConfirmDialog(null, "Registrera dig.", "Registration", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        String username = JOptionPane.showInputDialog("Ange användarnamn");

        String password = JOptionPane.showInputDialog("Ange lösenord");

        String hashedPW = hash.hashPassword(password);

        hashMap.put(username, password);

        JOptionPane.showConfirmDialog(null, "Logga in", "Inloggning", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        String inputUsername = JOptionPane.showInputDialog("Ange användarnamn");

        String inputPassword = JOptionPane.showInputDialog("Ange lösenord");

        // String hashedInputPassword = hash.hashPassword(inputPassword);

        String hashMapPassword = hashMap.get(inputUsername);

        String hashMapPasswordHashed = hash.hashPassword(hashMapPassword);

        hash.checkPassword(inputPassword, hashMapPasswordHashed);

        if (hash.checkPassword(inputPassword, hashMapPasswordHashed) == true ) {
            System.out.println("Användaren är inloggad");
        } else {
            System.out.println("Fel användaruppgifter");
        }


    }
}
