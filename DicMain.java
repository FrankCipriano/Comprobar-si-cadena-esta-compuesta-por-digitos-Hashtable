//5.	Realice una función que retorne si una cadena está compuesta por solo dígitos

package exam5;

import java.util.Hashtable;

public class DicMain {

  public static void main(String[] args) {
  Hashtable<String,Integer> tabla = new Hashtable();
  Dic diccionario = new Dic();
  diccionario.ingresar_cadena(tabla);
  diccionario.buscar_digitos(tabla);
  }
}
