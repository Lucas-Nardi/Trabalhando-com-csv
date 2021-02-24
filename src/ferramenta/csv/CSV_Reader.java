package ferramenta.csv;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CSV_Reader {
   
    
    public void Read_CSV(String file_name) {  // Returno  false -  Arquivo inválido, retorno true Arqivo Válido
        
        try {
            System.out.println("Path do arquvio: src/PENDENTES/" + file_name);
            File csv_file = new File("src/PENDENTES/"+file_name);
            
            if(csv_file.length() == 0){ // Arquivo nao está vazio
                
                System.out.println("ARQUIVO VAZIO"); 
                csv_file.renameTo(new File("src/INVALIDADO/"+file_name));                               
            
            }else{
                
                FileReader fr = new FileReader(csv_file);
                BufferedReader bf = new BufferedReader(fr);
                String data = "";                

                while(data != null){

                    try {
                        data = bf.readLine();
                        if(data != null && !data.isBlank() ){
                            String [] colunas = data.split(";");
                            if(colunas.length != 4){
                                System.out.println("NAO POSSUI 4 COLUNAS");                                
                                bf.close();
                                fr.close();
                                csv_file.renameTo(new File("src/INVALIDADO/"+file_name));                                
                                return;
                            }                            
                        }
                        
                    } catch (IOException ex) {
                        System.out.println("Erro ao tentar ler o arquivo");
                    }
                }
                bf.close();
                fr.close();                
            }              
            csv_file.renameTo(new File("src/VALIDO/"+file_name));
        } catch (FileNotFoundException ex) {
            
            System.out.println("Arquivo nao encontrado");
            
        } catch(IOException ex) {
            
            System.out.println("Erro ao fechar o aquivo");
        }
    }     
}
