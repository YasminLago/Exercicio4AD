package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

        DataInputStream text = new DataInputStream(new BufferedInputStream(new FileInputStream("text3.txt")));
        DataOutputStream tex = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("text3.txt", true)));

        for (int i = 1; i <= 2; i++) {
            tex.writeUTF(texto);
            System.out.println("WriteUTF escribiu: "+texto);
            System.out.println("WriteUTF escribiu: " + (tex.size() / i) + " bytes");
        }

        System.out.println("Bytes totais escritos: " + tex.size());
        tex.close();

        int i = 0;
        while (text.available() != 0) {
            String cadea = text.readUTF();
            System.out.println("Lemos a cadea: " + cadea);
            int lido = cadea.length() + 2;
            System.out.println("Número de bytes lidos: " + lido + " bytes");
            System.out.println("Bytes restantes por ler: " + text.available() + " bytes");
            i++;
        }
        text.close();
        
    }
}
