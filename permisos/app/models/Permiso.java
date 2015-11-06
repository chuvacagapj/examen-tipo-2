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
@Table(name="permisos")
public class Permiso extends Model{
    @Required
    String clave;

    @Lob
    @Required
    String descripcion;

    @Required
    @ManyToOne
    Rol rol;

    public String toString(){
        return descripcion;
    }

    public Permiso(String clave, String descripcion, Rol rol) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.rol = rol;
    }



}
