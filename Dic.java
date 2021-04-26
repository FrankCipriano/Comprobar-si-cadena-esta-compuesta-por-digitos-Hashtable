package exam5;

import java.util.Scanner;
import java.util.Hashtable;

public class Dic {
  private String cadena,claves="1234567890",llave;
  private int contador=0;
  
  public void ingresar_cadena(Hashtable<String,Integer> diccionario){
    System.out.println("Ingrese el texto");
    Scanner guardar = new Scanner(System.in);
    cadena = guardar.nextLine();
    cadena = cadena.toLowerCase();
    cadena = cadena.replaceAll("[-;,:#+@$%+()¡¿!?]","");
    cadena = cadena.replace(" ","");
    for(int i=0;i<claves.length();i++){
      llave = claves.substring(i,i+1);
      diccionario.put(llave,1);
    }
  }
  public void buscar_digitos(Hashtable<String,Integer> diccionario){
    for(int i=0;i<cadena.length();i++){
      llave = cadena.substring(i,i+1);
      if(diccionario.containsKey(llave)){
        contador++;
      }
    }
    System.out.println("la cadena posee "+contador+" digitos");
    if(contador>cadena.length()-contador){
      System.out.println("Por lo tanto la cadena esta compuesta solo por digitos");
    }else{
      System.out.println("Por lo tanto la cadena no esta compuesta por digitos");
    }
  }
}
