import java.util.Scanner;
import java.text.DecimalFormat;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat Dfor = new DecimalFormat("0.##");
		System.out.println("Radius of the sphere: ");
		double area = 4;
		double radius = scan.nextDouble();
		double SurfaceArea = area * Math.PI * Math.pow(radius, 2);
		System.out.println("Surface area is: " + Dfor.format(SurfaceArea));
		double Volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.println("The volume is: " + Dfor.format(Volume));
		
	}

}
