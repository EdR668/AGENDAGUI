
package Data;

import java.util.ArrayList;

public class Comprador extends Contacto{
    
    private ArrayList<String> productos_solicitados;
    private String direccion;
    private int precio;

    public Comprador(String nombre, long numero , String correo ,ArrayList<String> productos_solicitados, String direccion, int precio) {
        this.setCorreo(correo);
        this.setNombre_persona(nombre);
        this.setNumero(numero);
        this.setProductos_solicitados(productos_solicitados);
        this.setDireccion(direccion);
        this.setPrecio(precio);
    }
    public Comprador(String nombre, long numero , String correo){
        this(nombre,numero,correo,null,null,0);
    }

    public Comprador(String laura_Acevedo, long l, String lauAvedogmailcom, String nestle_SA, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ArrayList<String> getProductos_solicitados() {
        return this.productos_solicitados;
    }

    public void setProductos_solicitados(ArrayList<String> productos_solicitados) {
        this.productos_solicitados = productos_solicitados;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String ret = "\n";
        ret+="Tipo de Contacto: Comprador";
        ret+="\nNombre: "+this.getNombre_persona();
        ret+="\nNúmero de Teléfono: "+this.getNumero();
        ret+="\nCorreo: "+this.getCorreo();
        ret+="\nProductos solicitados: ";
        for(String i: getProductos_solicitados()) ret+=(i+"   ");
        ret+="\nValor Reciente de factura: $"+this.getPrecio()+"\n\n";
        return ret;
    }
}
