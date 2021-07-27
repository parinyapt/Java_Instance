package instanceTest;

import java.util.Scanner;

public class instanceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				float bs,hi;
				System.out.print("Enter base : ");
				bs = input.nextFloat();
				System.out.print("Enter height : ");
				hi = input.nextFloat();
				
				area ac = new area();
				System.out.println("Triangle Area = " + ac.triangleArea(bs,hi));
				System.out.println("Rectangle Area = " + ac.rectangleArea(bs,hi));
				//float area = AreaCalc(bs,hi);
				
				
			}

		}
	/*	class AreaCalc{
			public float triangleArea(float base,float height){
				float area = 0.5F * base * height;
				return area;
				
			}
			public float rectangleArea(float base,float height){
				float area = base * height;
				return area;
			}
		}*/
			