package com.example.userinterface;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class functions {
    public static String searchBloodType = null;
    public static String searchArea  = null;
    //Show Function For Member
    public static ArrayList<Member> showObj(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Member> users = new ArrayList<>();

            while (fis.available()>0) {
                try {
                    Member u = (Member)ois.readObject();
                    users.add(u);
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();
            return users;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }


}
    //Save Function For Member
    public static void saveObj(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Member a : MainPage.member)
                oos.writeObject(a);
            oos.close();
            System.out.println("Object saved");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }


    //Alert Method For Incase Any Error
    public static ButtonType alert(Alert.AlertType type, String title, String message){
        Alert alert = new Alert(type) ;
        alert.setTitle(title);
        alert. setHeaderText (null) ;
        alert.setContentText(message);
        alert.showAndWait ();
        return alert.getResult();
    }

    //For Donor
    public static ArrayList<Blood> getBloodList() throws IOException {
        ArrayList<Blood> bloods = new ArrayList<>();
        for (Object objects : showObj("blood.txt")) {
            bloods.add((Blood) objects);
        }
        return bloods;
    }

   /* public static void filerBlood(String type, String area) throws IOException {
        int index = 1;
        System.out.println("List of available blood: ");
        for (Blood b : getBloodList()) {
            if (b.getDonoType().equalsIgnoreCase(type) && b.getArea().equalsIgnoreCase(area)) {
                System.out.print("\nDonor-" + index + "\n\tBlood Details: ");
                System.out.println(b.toString());
                System.out.print("\tDonor: ");
                for (Member m : MainPage.member) {
                    if (b.getDonorName().equals(m.getUserName())) {
                        System.out.println(m.toString());
                    }
                }
                index++;
            }
        }
        if (index == 1) {
            System.out.println("Sorry, cannot find blood with the required details.");
        }
    }*/


    //InCase User Write Incorrect Email Pattern
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }


//    public static ArrayList<Blood> showBloodObj(String filename) {
//        try {
//            FileInputStream fis = new FileInputStream(filename);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ArrayList<Blood> b = new ArrayList<>();
//
//            while (fis.available()>0) {
//                try {
//                    Blood u = (Blood) ois.readObject();
//                    b.add(u);
//                } catch (EOFException e) {
//                    break;
//                }
//            }
//
//            ois.close();
//            return b;
//        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return new ArrayList<>();
//        }
//
//
//    }
    //Save Function For Member
//    public static void saveBloodObj(Blood a, String filename) {
//        try {
//            FileOutputStream fos = new FileOutputStream(filename);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(a);
//            oos.close();
//            System.out.println("Object saved");
//        } catch (IOException ex) {
//            ex.getMessage();
//        }
//    }


}


