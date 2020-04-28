package edu.labs.LAB3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomePets {

    private Map<String, ArrayList> homePets;

    public HomePets()
    {
        homePets = new HashMap<>();
    }

    public void addHomePet(String name, ArrayList owner) {
        homePets.put(name, owner);
    }

    public void showHomePets() {
        for (Map.Entry<String, ArrayList> entry : homePets.entrySet()) {
            String petName = entry.getKey();
            ArrayList owners = entry.getValue();
            System.out.print("Pet Name: " + petName + "\n Owners: ");
            for (Object owner: owners) {
                System.out.print(owner + " ");
            }
            System.out.println("");
        }
    }

}
