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
@Table(name="permiso.usuario")
public class Usuario extends Model{

    @Required
    String usuario;
    String password;
    String nombre;

    @ManyToMany
    List<Rol> roles;

    public Usuario(String usuario, String password, String nombre, List<Rol> roles) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.roles = roles;
    }


}
