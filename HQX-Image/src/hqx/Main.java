/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hqx;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author NOI25
 */
public class Main {
    
    public static void main(String[] args) throws IOException{
        // Load an image
        URL input = new URL("http://wallpaper.sc/en/ipad/wp-content/uploads/2014/10/ipad-2048x2048-thumbnail_00286-256x256.jpg");
        BufferedImage bi;
        bi = ImageIO.read(input);
        if (bi != null) {
            // Convert image to ARGB if on another format
            if (bi.getType() != BufferedImage.TYPE_INT_ARGB && bi.getType() != BufferedImage.TYPE_INT_ARGB_PRE) {
                final BufferedImage temp = new BufferedImage(bi.getWidth(), bi.getHeight(), BufferedImage.TYPE_INT_ARGB);
                temp.getGraphics().drawImage(bi, 0, 0, null);
                bi = temp;
            }
            // Obtain pixel data for source image
            final int[] data = ((DataBufferInt) bi.getRaster().getDataBuffer()).getData();

            // Initialize lookup tables
            RgbYuv.hqxInit();

            // Create the destination image, twice as large for 2x algorithm
            final BufferedImage biDest2 = new BufferedImage(bi.getWidth() * 2, bi.getHeight() * 2, BufferedImage.TYPE_INT_ARGB);
            // Obtain pixel data for destination image
            final int[] dataDest2 = ((DataBufferInt) biDest2.getRaster().getDataBuffer()).getData();
            // Resize it
            Hqx_2x.hq2x_32_rb(data, dataDest2, bi.getWidth(), bi.getHeight());
            // Save our result
            ImageIO.write(biDest2, "PNG", new File("image2x.png"));

            // More calls to hq[234]x_32_rb() methods
            // ....

            // Release the lookup table
            RgbYuv.hqxDeinit();
        }
    }
}
