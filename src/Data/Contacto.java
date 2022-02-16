
package Data;

import java.io.Serializable;

public class Contacto implements Serializable{
    
    private String nombre_persona;
    private long numero;
    private String correo;
    
    public String getNombre_persona() {
        return this.nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }
    
    
}
