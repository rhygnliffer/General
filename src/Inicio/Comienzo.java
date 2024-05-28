/* Java funciona con el paradigma POO(programación orientada a objetos) que consiste,
en crear objetos y que estos interactuen entre ellos para resolver problemas.
Estos objetos se comprenden como un bloque de código y lo más útil que se puede hacer
con ellos es la modularidad(dividir el problema en partes más manejables) y
reutilizar código.
Por eso, aunque en este cuatrimestre utilizamos programación estructurada(secuencial), es 
importante ver dos puntos:
1) En java todo es un objeto: incluso un variable String que definiste va a tener
métodos asignados a ella; 
2)Como es POO se puede utilizar: Herencia, Encapsulamiento, Polimorfismo, entre otros;
A lo largo de este proyecto voy a ir mostrando y describiendo los elementos que se dieron
en clase hasta la fecha.
Voy a empezar describiendo los elementos más importantes
Paquetes:
Al inicio del programa siempre se indica el nombre del paquete al que pertenece.
El paquete es un concepto de java que corresponde a una agrupación de elementos, por lo
general clases y va en concordancia con cualquier carpeta que creemos en el proyecto, es decir, si
creamos una carpeta y ponemos en ella una clase, debemos indicarle a la clase
que pertenece al paquete con el mismo nombre que la carpeta.
Clases:
Import:
Esta palabra clave permite usar código más especifico (que está
previamente programado por desarrolladores de java) o de otra parte de nuestro
proyecto en el archivo que estamos trabajando.
Se puede importar:
Clases: puedes elegir una o varias clases en específico. Se especifica el nombre del paquete
donde esta contenida la clase, y luego el nombre de la clase 
Todo el contenido de un paquete: Se hace indicando el nombre del paquete 
y se utiliza * como comodin para todas las clases.
Interfaces(No voy a usarlas por ahora)
*/
package Inicio; // Definición del paquete/carpeta(por lo general se hace automáticamente)
import java.util.Collections; // Importé la clase collections


@SuppressWarnings("unused")// Solo par ignorar Advertencias de "sin usar"
/* Cada vez que querés hacer un programa se debe acceder a new java file y new class, esto
crea un archivo java en la carpeta y una clase.
Modificadores de acceso(Solo dos):
Public:
Afecta: Métodos, Clases y Atributos
Esto quiere decir que son accesibles desde cualquier parte del código. Incluso otro paquete
(hay que importarla);
Private:
Afecta: Métodos, Clases y Atributos
Son accesibles solo desde la misma clase en la que están declarados.
No se puede aplicar a las clases.

Modificador static:
Este modificador  afecta a métodos y atributos: estos elementos pasan a ser de
la clase(lo que sea que eso signifique) y por lo tanto no se necesita instanciar
un objeto de la clase(Esto se ve más a detalle luego)
 */

public class Comienzo {
// Es obligatorio (al menos en este punto de java) tener un método main
// Este método es donde comienza la ejecucción
public static void main(String[] args) {
    // Se escribe aca el bloque de código
}
}
