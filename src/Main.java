import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ruta = "texto.txt";
        mostraFichero(ruta);
    }
    public static void mostraFichero (String ruta){
        try(FileReader fr = new FileReader(ruta)){
            int numero = fr.read();
            while(numero!=-1){
            char letra = (char) numero;
                if(letra!=32){
                    System.out.print(letra);
                }
                numero=fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}