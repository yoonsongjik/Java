import java.util.Scanner;
public class Month {
	 public static void main(String []args)
	 {
		 Scanner scanner = new Scanner(System.in);
		 int month;
		 
		 System.out.print("해당 월을 입력하세요: ");
         month = scanner.nextInt();
         
         switch(month) {
         case 1:
         	
         case 3:
          	
         case 5:
          	
         case 7:
          	
         case 8:
          	
         case 10:
          	
         case 12:
          	System.out.println("31일까지있습니다");
         	break;
         case 2:
          	System.out.println("28일까지있습니다");
          	break;
         case 4:
          	
         case 6:
           	
         case 9:
           	
         case 11:
           	System.out.println("30일까지있습니다");
          	break;
         default :
        	 System.out.println("해당되는 월이 없습니다");
         	
         }
         
	 }
}
