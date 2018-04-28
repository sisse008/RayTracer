//package ppm;

    import java.awt.Color;
    import java.awt.image.BufferedImage;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.util.ArrayList;


    public class RayCaster
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
	        for(int i = 0; i <= height; i++){
	            for(int j = 0; j <= width; j++){ 
	                Color c = getColor(width, height, j, i);
	                //System.out.println(c);
	                if(c==Color.red){
	                      rgb[0] = (int) (255*factor(width, height, j, i));
	                      rgb[1] = 0;
	                      rgb[2] = 0;
	                }else if(c==Color.green){
	                      rgb[0] = 0;
	                      rgb[1] = (int) (255*factor(width, height, j, i));
	                      rgb[2] = 0;
	                }else if(c==Color.blue){
	                      rgb[0] = 0;
	                      rgb[1] = 0;
	                      rgb[2] = (int) (255*factor(width, height, j, i));
	                }else if(c== Color.white){
	                      rgb[0] = (int) (255*factor(width, height, j, i));
	                      rgb[1] = (int) (255*factor(width, height, j, i));
	                      rgb[2] = (int) (255*factor(width, height, j, i));
	                }
	                matrix += ""+ rgb[0] + " " + rgb[1] + " " + rgb[2] + "  " ;
	                //System.out.println(""+ rgb[0] + " " + rgb[1] + " " + rgb[2] + "  ");
	                //pic.add(rgb);
	            } 
	            matrix += "\n";
	        }   
	    }

	    public static Color getColor(int width, int height, int a, int b){
	        double d1 = ((double) width / height) * a;
	        double d2 = (((double) -width / height) * a + height);

	        if(d1 > b && d2 > b) return Color.green;
	        if(d1 > b && d2 < b) return Color.blue;
	        if(d1 < b && d2 > b) return Color.red;
	        return Color.white;
	    }

	    public static double  factor(int width, int height, int a, int b){
	        double factorX = (double) Math.min(a, width - a) / width * 2;
	        double factorY = (double) Math.min(b, height - b) / height * 2;

	        //System.out.println(Math.min(factorX, factorY));

	        return Math.min(factorX, factorY);
	    }

	    public static void writeImage(String fn) throws FileNotFoundException, IOException {

	        //if (pic != null) {

	               FileOutputStream fos = new FileOutputStream(fn);
	                fos.write(new String(matrix).getBytes());

	                //fos.write(data.length);
	                //System.out.println(data.length);
	                fos.close();
	       // }
	    }
}	