/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datafolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kimmo
 */
@XmlRootElement
public class Guard extends Worker{
    private int id;
    private String name;
    private String title;
    
    public Guard(){
        
    }
    
    public Guard(int id, String name){
        this.id = id;
        this.name = name;
        this.title = "Guard";
    }
    
    @XmlElement
    @Override
    public int getId() {
        return id;
    }

    @XmlElement
    @Override
    public String getName() {
        return name;
    }

    @XmlElement
    @Override
    public String getTitle() {
        return title;
    }
}
