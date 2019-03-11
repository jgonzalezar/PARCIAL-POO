/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jgonzalezar
 */
public class Vet {
    private ArrayList <Pet> pets;

    public Vet(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
    public void  removePet (Pet petid){
        System.out.println("mascota removida");
    }
    
    public void showPetsByType (String type) throws FileNotFoundException{
        File archivoPets = new File("pets.txt");
        Scanner lector = new Scanner(archivoPets);
        ArrayList<String> pets = new ArrayList<>();
        while(type.equals(lector.hasNextLine())){
          pets.add(lector.next());
       }
       lector.close();
       
       for (int i = 0; i<pets.size(); i++){
           System.out.println(pets.get(i));
       }
    }
    
    public ArrayList<String> showPets (){
        ArrayList<String> data = 
               new ArrayList<>();
       Scanner lectura = 
               new Scanner("pets.txt");
       while(lectura.hasNextInt()){
          data.add(lectura.next());
       }
       lectura.close();
       return data;
    }
    
}
