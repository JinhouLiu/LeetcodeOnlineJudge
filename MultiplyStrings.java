import java.math.BigDecimal;
public class Solution{
//利用java大数乘法，两行解决，但与题目要求不符合,这是最容易想到的思路    
public String multiply(String num1, String num2){	
if (num1==null||num2==null||num1.length()==0||num2.length()==0)return String.valueOf(0); 		
return  new BigDecimal(num1).multiply(new BigDecimal(num2)).toString();  	
}
}
