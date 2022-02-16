
package Data;

public class Proovedor extends Contacto {
    
    private String empresa;
    private boolean paz_y_salvo;
    private int valor;

    public Proovedor(String nombre, long numero , String correo, String empresa, int valor) {
        this.setCorreo(correo);
        this.setNombre_persona(nombre);
        this.setNumero(numero);
        this.setEmpresa(empresa);
        this.setValor(valor);
    }

    public Proovedor(String nombre, long numero , String correo){
        this(nombre,numero,correo,null,0);
    }
    
    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isPaz_y_salvo() {
        return this.paz_y_salvo;
    }

    private void setPaz_y_salvo(boolean paz_y_salvo) {
        this.paz_y_salvo = paz_y_salvo;
    }

    public int getValor() {
        return this.valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
        if(this.getValor()!=0) this.setPaz_y_salvo(false);
        else this.setPaz_y_salvo(true);
    }
    
    @Override
    public String toString(){
        String ret = "\n";
        ret+="Tipo de Contacto: Proovedor";
        ret+="\nNombre: "+this.getNombre_persona();
        ret+="\nNúmero de Teléfono: "+this.getNumero();
        ret+="\nCorreo: "+this.getCorreo();
        ret+="\nEmpresa: "+this.getEmpresa();
        ret+="\nValor de factura: $"+this.getValor()+"\n\n";
        return ret;
    }

}
