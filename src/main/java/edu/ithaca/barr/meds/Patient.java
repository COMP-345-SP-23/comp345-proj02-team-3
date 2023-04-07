package edu.ithaca.barr.meds;

import java.util.ArrayList;

public class Patient {
    
    private String firstname;
    private String lastname;
    private int id;
    private String email;
    private String password;
    ArrayList<Medication> prescribedMeds;
    ArrayList<Medication> currentMeds;

    public Patient(String firstname, String lastname, int id, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.email = email;
        this.password = password;
        this.prescribedMeds = new ArrayList<>();
        this.currentMeds = new ArrayList<>();
    }

    public ArrayList<Medication> viewMedication() {
        return currentMeds;
    }

    public void requestMedication(Medication med) {
        if (prescribedMeds.contains(med)) {
            currentMeds.add(med);
        }
    }

    public boolean isPrescribed(Medication med) {
        if (prescribedMeds.contains(med)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

}
