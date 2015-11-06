/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;

/**
 *
 * @author jesus
 */
@Entity
public class Rol extends Model{

    @Required
    String clave;

    @Required
    @Lob
    String descripcion;

    public Rol(String clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }



    public String toString(){
        return this.clave;
    }

}
