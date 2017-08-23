// it requires 3 software   which i am also uploading
// if you are facing any problem , you can contact me  -> nanki.anup@gmail.com
package gen;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;


public class Gen {
                  public static void main(String[] args) throws Exception {
                   // TODO code application logic here
        
        
                    String details="https://www.donationclub.info/";
                    ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
                       // file directory where qr logo generated 
                       File f=new File("C:\\Users\\yo yo anup\\Downloads\\os\\Qr.jpg");
                      FileOutputStream fos =new FileOutputStream(f);
                       fos.write(out.toByteArray());
                        fos.flush();
    }
    
}
