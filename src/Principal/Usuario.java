/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Usuario {
    //Atributos
    private final String nombre, apellido, hobbie, editorDeCodigoPreferido, sistemaOperativoQueUtiliza;
    private final int edad;
    private final Scanner scanner;
    //Constructor
    Usuario(){
        scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        this.nombre =scanner.nextLine();
        System.out.println("Ingrese su apellido");
        this.apellido =scanner.nextLine();
        System.out.println("Ingrese su edad");
        this.edad=Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese su hobbie");
        this.hobbie =scanner.nextLine();
        System.out.println("Ingrese su editor de código preferido");
        this.editorDeCodigoPreferido =scanner.nextLine();
        System.out.println("Ingrese su sistema operativo");
        this.sistemaOperativoQueUtiliza =scanner.nextLine();
    }
    //Metodos
    public void mostrarUsuario(){
        System.out.println(datos());
    }
    private String datos(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad
                +"\nHobbie: "+hobbie+"\nEditor de código preferido: "+editorDeCodigoPreferido
                +"\nSistema Operativo que utiliza: "+sistemaOperativoQueUtiliza;
    }
}
