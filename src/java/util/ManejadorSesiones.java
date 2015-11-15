/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ceci
 */
public class ManejadorSesiones {
    
    public boolean usuarioEnSession(HttpServletRequest req){
        HttpSession s= req.getSession();
        if(s!=null){
        Object usuario= req.getSession().getAttribute("usuario"); //verificar como se maneja el usuario ingresado en la session
        return usuario!=null && usuario.toString().trim().length()>0; //si el usuario es diferente de null y la cadena sin espacios es mayor cero tengo un usuario
        }
        else {
            return false;
        }
    }
}
