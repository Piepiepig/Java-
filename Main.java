public class Main
{
	public static void main(String[] args) {
	  long a = 0;
	  for (int q =100; q<1001; q++) {
	    if ((q % 13==0)||(q % 11==0)) { 
	        a=a+1;
	        System.out.println(q);
	    }
	  }System.out.println("Кол-во чисел: "+(a));
	  
	 
	}
}