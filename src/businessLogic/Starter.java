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
public class Starter {

    private ArrayList<Person> persons;
    private Vet vet;

    public static void main(String[] args) throws FileNotFoundException {
        Starter start = new Starter();
        String mostrar = "menu";
        ArrayList<Pet> pets = new ArrayList();
        Vet veterinaria = new Vet(pets);
        start.manageVet(veterinaria, mostrar);
    }

    public void readPets(Vet v) throws FileNotFoundException {
        File archivoPets = new File("pets.txt");
        Scanner lector = new Scanner(archivoPets);
        ArrayList<Integer> pets = new ArrayList<>();
        while(lector.hasNextInt()){
          pets.add(lector.nextInt());
       }
       lector.close();
    }

    public void manageVet(Vet v, String accion) throws FileNotFoundException {
        System.out.println("Bienvenido a la veterinaria Juano");
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Remover mascota usando ID.");
        System.out.println("2. Listar mascotas segun su tipo.");
        System.out.println("3. Listar mascotas registradas.");
        System.out.println("4. Salir.");
        int opcion = 0;
        Scanner leerOpcion = new Scanner(System.in);
        opcion = leerOpcion.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el ID de la mascota");
                String id;
                Scanner leerId = new Scanner(System.in);
                id = leerId.next();

                //v.removePet();
                break;
            }
            case 2: {
                System.out.println("Ingrese el tipo de mascota");
                String tipo;
                Scanner leer = new Scanner(System.in);
                tipo = leer.next();
                v.showPetsByType(tipo);
                break;
            }
            case 3: {
                System.out.println("Estas son las mascotas registradas: ");
                v.showPets();
            }
            case 4: {
                System.out.println("Adios!...... Vuelva Pronto.");
            }

        }
    }
}
