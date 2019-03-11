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
public abstract class Pet {

    protected String id;
    protected String name;
    protected String hairColor;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }
    
    

    public abstract String sound();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    
}
