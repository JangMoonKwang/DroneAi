package ch03;

class OperatorEx10 {
    // Your program begins with a call to main()
    
    public static void main(String[] args)
    {
    	int 	a = 1000000;

    	int		result1	= a * a / a;
    	int		result2	= a / a * a;
    	
       	System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
       	System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
	
	
	
}
