import java.util.Scanner;
public class Month {
	 public static void main(String []args)
	 {
		 Scanner scanner = new Scanner(System.in);
		 int month;
		 
		 System.out.print("�ش� ���� �Է��ϼ���: ");
         month = scanner.nextInt();
         
         switch(month) {
         case 1:
         	
         case 3:
          	
         case 5:
          	
         case 7:
          	
         case 8:
          	
         case 10:
          	
         case 12:
          	System.out.println("31�ϱ����ֽ��ϴ�");
         	break;
         case 2:
          	System.out.println("28�ϱ����ֽ��ϴ�");
          	break;
         case 4:
          	
         case 6:
           	
         case 9:
           	
         case 11:
           	System.out.println("30�ϱ����ֽ��ϴ�");
          	break;
         default :
        	 System.out.println("�ش�Ǵ� ���� �����ϴ�");
         	
         }
         
	 }
}
