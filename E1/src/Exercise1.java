
public class Exercise1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
//Number 1		
for(int n = 0; n<6 ; n++)
{
	System.out.println((n+1)+ " " + "Zeyad");
}
System.out.println("");

//Number 2
System.out.println("x    x^5    x^10");
for(int x = 1; x < 4; x++)
{
	System.out.println(x +"    "+ ((int)Math.pow(x, 5))+"     "+((int)Math.pow(x, 10)));
}
System.out.println("");

//Number 3
final double PI = 3.14159;
double radius = 5.5;
double area = radius * radius * PI;
double perimeter = 2 * radius * PI;
System.out.println("Permieter: "+ perimeter);
System.out.println("Area: "+area);
System.out.println("");

//Number 4
double numberFour = (3*4.5+5*7.1) / (7.2*5.5);
System.out.println(numberFour);
System.out.println("");


//Number 5
int speedMiles = 24;
double speedKm = speedMiles*1.6;
double time = 1 + (40.0/60) + (35.0/3600);
double AvgSpeed = speedKm / time;
System.out.println(AvgSpeed); //Don't forget to add the .0 when dividing if you want exact numbers

	}
}
