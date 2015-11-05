/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4v1;





import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author usuario
 */
public class KATA4V1 {

 /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

      String name="C:\\Users\\usuario\\Desktop\\EMAILS (2).bt";
        ArrayList<String>mailArray=MailListReader.read(name);
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramaDisplay(histogram).execute();
    }
}
