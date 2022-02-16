
package BussinessLogic;

import Data.*;
import BussinessLogic.*;
import java.util.ArrayList;

public class Compile {
    public static void main(String[] args) {
        ArrayList<Contacto> test = new ArrayList<Contacto> ();
        instancias(test);
        Functions_.Guardar(test);
    }
    public static void instancias(ArrayList<Contacto> c){
       Proovedor p1 = new Proovedor("Juan González",(long) 31256247,"JGonz@gmail.com","Productos Naturales de la Sabana S.A.S",12523);
       Proovedor p2 = new Proovedor("Laura Acevedo",(long) 31262517,"LauAvedo@gmail.com","Nestle S.A",32561);
       Proovedor p3 = new Proovedor("Ivan Marquez",(long) 34865247,"IMar@gmail.com","Productos Naturales de la Sabana S.A.S",32122);
       Comprador c1 = new Comprador("Juan Gutierrez",(long) 36846247,"JGuti@gmail.com",new ArrayList<String> (),"Cra 70B - 22D",16923);
       Comprador c2 = new Comprador("Ximena Duarte",(long) 31251585,"XDuarte@gmail.com",new ArrayList<String> (),"Cra 80B - 23",0);
       Comprador c3 = new Comprador("Jaime Duarte",(long) 31251585,"JDuarte@gmail.com",new ArrayList<String> (),"Cra 95B - 80",0);
       c.add(p1);c.add(p2);c.add(p3);c.add(c1);c.add(c2);c.add(c3);
    }
     
}
