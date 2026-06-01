package ch04;

class FlowEx {
    // Your program begins with a call to main()
    
    public static void main(String[] args)
    {

    	int 	x =0;
       	System.out.printf("x=%d 일, 참인것은%n", x);
       	
       	if (x==0)   System.out.println("x== 0");
       	if (x!=0)   System.out.println("x!= 0");
       	if (!(x==0))   System.out.println("!(x== 0)");
       	if (!(x!=0))   System.out.println("!(x!= 0)");
       	
       	x	= 1;
       	System.out.printf("x=%d 일, 참인것은%n", x);
       	
       	if (x==0)   System.out.println("x== 0");
       	if (x!=0)   System.out.println("x!= 0");
       	if (!(x==0))   System.out.println("!(x== 0)");
       	if (!(x!=0))   System.out.println("!(x!= 0)");
       	
    }
	
	
	
}
