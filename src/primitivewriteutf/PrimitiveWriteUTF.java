package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class PrimitiveWriteUTF {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
       String texto = "Esta e unha cadea\n";
        
       String directorio = "/home/oracle/NetBeansProjects/PrimitiveWriteUTF/text3.txt";
      
       DataInputStream text = new DataInputStream(new FileInputStream(directorio));
       DataOutputStream tex = new DataOutputStream(new FileOutputStream(directorio));
       
       tex.writeUTF(texto);
       tex.writeUTF(texto);
       
       
       System.out.println("WriteUTF escribiu: "+ text.readUTF());
       System.out.println("WriteUTF escribiu: "+ text.readUTF());

        
        
       
//        int i = text.read();
//        int c;
//        
//        while(i != -1){
//            
//            System.out.println(i);
//        }
        
    }
}