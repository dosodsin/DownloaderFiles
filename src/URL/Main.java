package URL;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String link="https://be2.aldebaran.ru/get_file/5008112/47599218/Tolstoyi_L_Vse_Luchshie_Skazki_I_Ras.a6.pdf?md5=f381ab5cfc69bbffb8241e802e1a03e4&t=1589653080&s=yes";
        File out=new File("D:/java/1.pdf");
        out.getParentFile().mkdirs(); // correct!
        if (!out.exists()) {
            out.createNewFile();
        }
        new Thread(new Download(link,out)).start();
    }
}
