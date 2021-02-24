package ferramenta.csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Directory_Reader {

    public void ReadDirectory (String path){        

        File directory = new File(path);
        CSV_Reader csvReader = new CSV_Reader();
        boolean result;
        Path origin = Paths.get(path);
        Path invalid = Paths.get("src/INVALIDADO");
        Path valid = Paths.get("src/VALIDO");
                
        if (directory.isDirectory()) {
           
           String[] files = directory.list();
           System.out.println("Quantidade de arquivos no diretório " + path + ": " + files.length);       
           
           if (files.length > 0) { // Esse Diretório possui algum arquivo              
           
                for(int i=0; i < files.length; i ++){
                   
                    System.out.println("Nome do arquivo: " + files[i]);                   
                    csvReader.Read_CSV(files[i]);                        
                }               
               
           } else { // Diretório está vázio.
               
               System.out.println("Diretorio está vazio");
           }
        }
    }
}
