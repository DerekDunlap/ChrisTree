//Name: Derek Dunlap
//Date: 1/20/2021
//Due Date: Jan 23
//Program that produces images of Christmas trees using the combination of * and " ".
//===============================================================================
package task1;

public class ChrisTree {
	public static void main(String[] args) {

		int segment=3;//Declares how many segments the Christmas tree will have.
		int height=4;//Declares how high each segment will be.
		int spaces=height; //Assigns the height of each Christmas tree to the variable named spaces.
		int stars=1; //Declares the variable stars and assigns the initial value of 1.
		
		//For-loop that determines how many triangles will be created.
		for(int i=1;i<=segment;i++) {
			//For-loop that determines the height of each triangle made.
			for(int j=1;j<=height;j++) {
				//For-loop to create indentation or spaces for the triangle.
				for(int k=1;k<=spaces+1;k++) {
					System.out.print(" ");
				}
				//For-loop to create stars for the triangle and display the *.
				for(int h=1;h<=stars;h++) {
					System.out.print("*");
				}
				System.out.println();//Added to separate each segment.
				spaces-=1;//Decrements the value of spaces according to the number of iterations.
				stars+=2;//Increments by 2 the number of stars according to each iteration.
			}
			spaces=height-i;//Reassigns spaces to have the appropriate number of spaces with each new segment.
			stars=i+(1+i);//Reassigns stars to have the appropriate number of stars with each new segment.
		}
		//Nested for-loop to create the stem of the Christmas tree based on the height and segment of the Christmas tree.
		for(int i=0;i<2;i++) {
			for(int j=1;j<=height+1;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		//For-loop to output the correct number of spaces to align base of tree with upper portion.
		for(int i=0;i<height-2;i++) {
			System.out.print(" ");
		}
		//Output to print the base of the Christmas tree.
		System.out.print("*******");
	}
}
