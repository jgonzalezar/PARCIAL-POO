/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author jgonzalezar
 */
public class Cat extends Pet{
     private boolean isHunter;

    public Cat(String id, String name, String hairColor) {
        super(id, name, hairColor);
    }

    @Override
    public String sound() {
        return "miau";
    }
     
}
