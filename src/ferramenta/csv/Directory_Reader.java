package ferramenta.csv;

import java.io.File;

public class Directory_Reader {

    public void ReadDirectory (String path){        

        File directory = new File(path);
        System.out.println(path);
        System.out.println(directory.isDirectory());
        if (directory.isDirectory()) {
           String[] files = directory.list();
           System.out.println("Quantidade de arquivos no diretório " + path + ": " + files.length);       
           
           if (files.length > 0) { // Esse Diretório possui algum arquivo
              
           
               for(int i=0; i < files.length; i ++){
                   
                   System.out.println(files[i]);
               }               
               
           } else { // Diretório está vázio.
               
              
           }
        }
    }
}
