package learn.java.com.automation;

public class CompoundInterest {

	public static void main(String[] args) {
double p = 1000,r = 4,t = 2, si=0,ci=0;

double a = (100+r)/100;

if(t>=2){
for (int i=2; i<=t; i++){
	a = a*a;
}
}

ci = p*a;
 
System.out.print("si = ");
System.out.println(si = (p*r*t)/100);
System.out.println("ci = " + ci);


	}

}
