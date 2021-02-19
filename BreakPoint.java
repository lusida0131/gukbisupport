package ch05;

public class BreakPoint {

	public static void main(String[] args) {
        outer : for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i*j) == 72) {
					System.out.println(i + "x" + j + "=" + i*j);
					break outer;   //outer로 명시된 반복문까지 빠져나간다.
				}	
			}	
		}
        
        
        
        
        
        
        
        
        
      for (int a =1; a < 10; a++) {
    	  for(int b = 1; b < 10; b++ ) {
    		  if(a == 2 && b < 3) {
    			  System.out.println(a + "x" + b + "=" + a*b);
    		  }
    		  if (a == 4 && b <5) {
    			  System.out.println(a + "x" + b + "=" + a*b);
    		  }
    		  if (a == 6 && b <7) {
    			  System.out.println(a + "x" + b + "=" + a*b);
    		  }
    		  if (a == 8 && b <9) {
    			  System.out.println(a + "x" + b + "=" + a*b);
    		  }
    	  }
      }
      
//     for (int c = 0; c < 10; c++) {
//    	 for (int d = 0; d < 10; d++) {
//    		 if ((c*10) + d == 99) {
//    	 System.out.println(((c*10)+d) + (d + (c*10)) + "=99" ); 
//    	 }
//    	 System.out.println((c*10)+d + "+" + d + (c*10) + "=99" );
//     } 
//	}
      
      
      
  }
}
