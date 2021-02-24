package ferramenta.csv;

public class FerramentaCSV {

    public static void main(String[] args) {
        Directory_Reader directoryReader = new Directory_Reader();
        directoryReader.ReadDirectory("src/PENDENTES");
    }
    
}
