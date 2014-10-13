public class Solution{

//通过在线测试结果
public static List<String> restoreIpAddresses(String s)
	{	
	List<String> result=new ArrayList<String>();    
	if(s==null||s.length()<4||s.length()>12)
	{
	return result;  	
	}
	 for(int i=1; i <s.length();i++){
		 if(i<=3&&((s.length()-i)<=9&&(s.length()-i)>=3))
		  for(int j = i+1; j <s.length(); j++) {
	        if(j-i<=3&&(s.length()-j<=6&&(s.length()-i)>=2)){
			   for(int k=j+1;k<s.length();k++){
				     if((k-j)<=3&&(s.length()-k)<=3){
					String n1=s.substring(0,i);
					String n2=s.substring(i, j);
					String n3=s.substring(j, k);
					String n4=s.substring(k, s.length()); 
				   	if(!(n1.charAt(0)=='0'&&n1.length()>1)&&
				   	  !(n2.charAt(0)=='0'&&n2.length()>1)&&
				   	  !(n3.charAt(0)=='0'&&n3.length()>1)&&
				   	  !(n4.charAt(0)=='0'&&n4.length()>1)&&
				   	  Integer.parseInt(n1)<256&&Integer.parseInt(n2)<256&&Integer.parseInt(n3)<256&&Integer.parseInt(n4)<256)
				   	   {	
				   	   String temp=n1+"."+n2+"."+n3+"."+n4;
				   	   result.add(temp);
				   	}
				   		
					} 
					} 
			   
			   
			}	
	        	
			}		
		}
	return result; 	
	}
}
