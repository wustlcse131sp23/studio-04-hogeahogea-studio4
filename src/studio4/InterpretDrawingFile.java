package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		int amountPoints = 6;
		//Shape Name
		String name = in.next();
		
		int red =in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		boolean filled = in.nextBoolean();
	
		double one=in.nextDouble();
		double two=in.nextDouble();
		double three=in.nextDouble();
		double four=in.nextDouble();
		double five=in.nextDouble();
		double six=in.nextDouble();
		double[] x = { one, two, three};
		double[] y = { four, five, six};
		
		if(name .equals("rectangle"))
		{
			StdDraw.setPenColor(red,green,blue);
			StdDraw.rectangle(one, two, three, four);
		}
		if(name .equals("ellipse"))
		{
			StdDraw.setPenColor(red,green,blue);
			StdDraw.ellipse(one, two, three, four);
		}
		if(name .equals("triangle"))
		{
			StdDraw.setPenColor(black);
			StdDraw.polygon(x,y);
		}
	}
}
