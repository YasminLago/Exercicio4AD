package primitivewriteutf;

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
       
       
       System.out.println("WriteUTF escribiu: "+ texto);
       tex.writeUTF(texto);
       System.out.println("WriteUTF escribiu: "+ tex.size()+" bytes");
       
       System.out.println("WriteUTF escribiu: "+ texto);
       System.out.println("WriteUTF escribiu: "+ tex.size()+" bytes");
       tex.writeUTF(texto);
       
       
       System.out.println("Bytes totais escritos = "+tex.size());
       
       System.out.println("Lemos a primeira cadea en UTF: "+ text.readUTF());
       System.out.println("Número de bytes lidos: "+ text.available()+" bytes.");
       System.out.println("Bytes restantes por ler: "+ text.available());
       System.out.println("Lemos a segunda cadea: "+ text.readUTF());
       
    }
}