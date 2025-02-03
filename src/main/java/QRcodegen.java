package main.java;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QRcodegen {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter something");
            String userinput = input.nextLine();
            generateQRcode(userinput,200, 200 ,
                    "d:\\Documents\\School\\QR\\" + userinput + ".png" );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void generateQRcode(String text, int width, int height, String filepath ) throws WriterException, IOException {

        QRCodeWriter qc = new QRCodeWriter();
        BitMatrix bm = qc.encode(text, BarcodeFormat.QR_CODE, width, height);
        Path probj = FileSystems.getDefault().getPath(filepath);

        try{
            MatrixToImageWriter.writeToPath(bm,"PNG", probj);
        } catch (IOException ex){
            Logger.getLogger(QRcodegen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}
