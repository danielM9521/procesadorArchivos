
package sv.edu.uesocc.ingenieria.tpi2018.procesadorarchivos.procesadorarchivos;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CargarArchivos implements Serializable{
  
   
    
    public boolean validarPath(final String path){
        boolean salida = false;
        BufferedReader br = null;
            if(path!=null && !path.trim().isEmpty()){
                try{
             br = new BufferedReader(new FileReader(path));
                }catch(FileNotFoundException fe){
                    System.out.println(""+fe);
                }
             salida = true;
            }
                        
    return salida;
    }
    
    public void cargarArchivo(final String path){
        validarPath(path);
        String csvFile = "/home/fernando/Documentos/tpi2018.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

       
        }

    
        

    
    
    
    
    

