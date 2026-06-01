package ch04;

import	java.util.*;
class FlowEx6 {
    // Your program begins with a call to main()
    
    public static void main(String[] args)
    {

    	int 	score  = 0;
    	char	grade	= ' ';
    	
    	
       	System.out.print("현재 월를 입력하세요.>");
       	
       	Scanner  	scanner  = new Scanner(System.in);
       	int 	month = 	scanner.nextInt();
       	
       	switch(month)  {
       	
       		case 3:
       		case 4:
       		case 5:
       	   		System.out.println("현재의 계절은 봄입니다.");
       	   		break;
       		case 6:
       		case 7:
       		case 8:
       	   		System.out.println("현재의 계절은 여름입니다.");
       	   		break;
       		case 9:
       		case 10:
       		case 11:
       	   		System.out.println("현재의 계절은 가울입니다.");
       	   		break;
       		default:
       	   		System.out.println("현재의 계절은 겨울입니다.");
       	   		break;
       	   		
       			
       	
       	
       	}


        	
    }
	
	
	
}
