//package ppm;

    import java.awt.Color;
    import java.awt.image.BufferedImage;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.ArrayList;


    public class OutPutImage
    {

	    private BufferedImage img;
	    private static final String imageDir = "Image/rect.ppm";
	    private final static String filename = "example.ppm";

	    private static byte bytes[]=null;      // bytes which make up binary PPM image
	    private static double doubles[] = null;
	    private static int height = 0;
	    private static int width = 0;
	    private static ArrayList pic;
	    private static String matrix="";

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) throws IOException 
	    {
	        createImage(200, 200);
	        writeImage(filename);
	    }


	    public static void createImage(int width, int height)
	    {
	        pic = new ArrayList();
	        int[] rgb = new int[3];
	        matrix +="P3\n" + width + "\n" + height + "\n255\n";
	       


	        for(int i = 0; i <= height; i++)
	        {
	            for(int j = 0; j <= width; j++)
	            { 
	                Color c = getColor(width, height, j, i);
	                
	                
	                rgb[0] = 255;
	                rgb[1] = 0;
	                rgb[2] = 0;
	              
	                matrix += ""+ rgb[0] + " " + rgb[1] + " " + rgb[2] + "  " ;
	             
	            } 
	            matrix += "\n";
	        }   
	    }

	    public static Color getColor(int width, int height, int a, int b){
	        return Color.red;
	    }

	   

	    public static void writeImage(String fn) throws FileNotFoundException, IOException {

	        

	        FileOutputStream fos = new FileOutputStream(fn);
	        fos.write(new String(matrix).getBytes());

	        fos.close();
	       
	    }
}	