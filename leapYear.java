
public class leapYear {
	  public static void chkYun(int year) {
          boolean isYun=false;
          
          if( (0 == (year % 4) && 
                   0 != (year %100)) || 
                   0 == year%400 ){
                  isYun = true;
          }else{
                  isYun = false;
          }
                  
          if(isYun){
                  System.out.println(year+"�� ����. ");
          }else{
                  System.out.println(year+"�� ������ �ƴ�.");
          }                
  }                

}
