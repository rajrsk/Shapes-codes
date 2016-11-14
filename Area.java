import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Area{
	public static void main(String a[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t" +" Area calculation"+" \n "+"press 1 for Circle"+" \n"+" press 2 for triangle"+" \n "+"press 3 for rectangle"+" \n "+"some other numbers to exit");
		Circle cir = new Circle();
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		int choice=Integer.parseInt(bf.readLine());
		switch(choice){
			case 1:System.out.println("Enter value for radius :");
				   cir.radius=Double.parseDouble(bf.readLine());
				   cir.area();
				   break;
			case 2:System.out.println("Enter value for base :");
				   tri.base=Double.parseDouble(bf.readLine());
				   System.out.println("Enter value for height :");
				   tri.height=Double.parseDouble(bf.readLine());
				   tri.area();
				   break;
			case 3:System.out.println("Enter value for length :");
				   rec.length=Double.parseDouble(bf.readLine());
				   System.out.println("Enter value for breadth :");
				   rec.breadth=Double.parseDouble(bf.readLine());
				   rec.area();
				   break;
			default:System.out.println("--------THANKYOU-------");
				   System.exit(0);
		}
	}
}