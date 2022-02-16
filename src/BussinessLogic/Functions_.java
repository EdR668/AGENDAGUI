package BussinessLogic;

import Data.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Functions_ {
    
    private static Contacto base;
    
    public static Contacto nuevo_c(String nombre, String correo, String Dire_Empresa , long num, boolean proov){
        if(proov){
            return new Proovedor(nombre, num , correo, Dire_Empresa, 0);
        }else{
            return new Comprador(nombre, num , correo , new ArrayList<String> (), Dire_Empresa, 0);
        }
    }
    
    public static ArrayList<Contacto> carga(){
        FileInputStream input = null;
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        try{
            input = new FileInputStream("Contacts.obj");
            ObjectInputStream os = new ObjectInputStream(input);
            while(true){
                contactos.add((Contacto) os.readObject());
            }
            
        }catch(FileNotFoundException exception){
            System.out.println("Not found - Starting from 0");
        }catch(IOException | ClassNotFoundException exception){
            return contactos;
        }
        return null;
    }
    
    public static void guarda(ArrayList<Contacto> contactos){
        FileOutputStream output = null;
        try{
            output = new FileOutputStream("Contacts.obj");
            ObjectOutputStream os = new ObjectOutputStream(output);
            for(Contacto i: contactos){
                os.writeObject(i);
            }
        }catch(FileNotFoundException exception){
            System.out.println("Not found - Starting from 0");
        }catch(IOException exception){
            System.out.println(exception);
        }
    }
    
    public static void Agregar_Contacto(ArrayList<Contacto> contactos , Contacto Nuevo){
        contactos.add(Nuevo);
        System.out.println("\nContacto Agregado Correctamente");
    }
    
    public static void Borrar_Contacto(ArrayList<Contacto> contactos , Contacto Eliminado){
        contactos.remove(Eliminado);
        System.out.println("\nContacto Eliminado Correctamente");
    }
    public static void Guardar(ArrayList<Contacto> contactos){
        guarda(contactos); 
    }
    public static ArrayList<Contacto> Cargar(){
        return carga();
    }
    
    public static boolean com_string(String a , String b){
        for(int i=0;i<a.length();i++){
            if(a.toCharArray()[i]!=b.toCharArray()[i]){
                return false;
            }
        }
        return true;
    }
    
    public static Contacto Buscar_n(ArrayList<Contacto> contactos, String buscador){
        for(Contacto i : contactos){
            System.out.println(i.getNombre_persona()+" -> "+buscador);
            if(com_string(i.getNombre_persona(),buscador)) return i;
        }
        return null;
    }
    public static Contacto Buscar_l(ArrayList<Contacto> contactos, long num){
        for(Contacto i : contactos){
            System.out.println(i.getNumero()+" -> "+num);
            if(i.getNumero()== num) return i;
        }
        return null;
    }
}
