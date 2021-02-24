/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramenta.csv;

/**
 *
 * @author Pichau
 */
public class FerramentaCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directory_Reader directoryReader = new Directory_Reader();
        directoryReader.ReadDirectory("src/PENDENTES");
    }
    
}
