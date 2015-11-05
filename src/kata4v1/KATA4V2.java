/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4v1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class KATA4V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String from = "C:\\Users\\usuario\\Desktop\\EMAILS (2).bt";
        String to = "C:\\Users\\usuario\\Desktop\\nuevo.txt";

        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(from)));

        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));

        byte[] buffer = new byte[1024];
        Date date = new Date();

        while (true) {
            int read = input.read(buffer);
            if (read < 0) {
                break;
            }
            output.write(buffer);
        }
        input.close();
        output.flush();
        output.close();

        String path = "C:\\Users\\usuario\\Documents";
        File file = new File(path);
        String[] files = file.list();
        
        for (String file1 : files) {
            //System.out.println(file1);
        }
            print(file.listFiles(), "");

        
    }

    private static void print(File[] listFiles, String ident) {

        if (listFiles == null) {
            return;
        }
        for (File listFile : listFiles) {
            System.out.println(ident+(listFile.isDirectory()? "+": "  ")+listFile.getName());
            if (listFile.isFile() || listFile.isHidden()) continue;
            print (listFile.listFiles(), ident+ " ");
            
        }
        
        
    }
}
