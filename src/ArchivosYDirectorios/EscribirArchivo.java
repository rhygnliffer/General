package ArchivosYDirectorios;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
  public static void main(String[] args) {
    // Ruta del archivo en el que queremos escribir
    String archivoPath = "nuevo_directorio/nuevo_archivo.txt";

    try (FileWriter writer = new FileWriter(archivoPath)) {
      writer.write("Hola, este es un archivo de prueba.\n");
      writer.write("Escribiendo más líneas en el archivo.");
      System.out.println("Datos escritos exitosamente en el archivo.");
    } catch (IOException e) {
      System.out.println("Ocurrió un error al escribir en el archivo.");
      e.printStackTrace();
    }
  }
}
