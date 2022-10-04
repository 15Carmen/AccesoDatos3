package ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaFicheroSecuencial {

    public static void main(String[] args) throws IOException {
        File fichero=new File("C:\\Users\\cmartin\\eclipse-workspace\\AccesoDatos1\\src\\Ejercicio3\\palabras.txt");
        FileReader fr=new FileReader(fichero);
        FileWriter fw=new FileWriter("palabrasSeparadas.txt");
        int i;
        char[] letras=new char[(int) fichero.length()];

        while ((i = fr.read(letras,0,5)) != -1) { //se va leyendo 5 caracteres hasta que lea -1
            fw.write(letras);
            fw.close();
            System.out.println(letras);
        }

        fr.close(); //cerrar fichero
    }

}