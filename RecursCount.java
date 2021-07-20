package Calculator;
import java.util.Arrays;

public class RecursCount {
	/*String []	 arrIn={"1","2","3","4",
				"5","6","^","+","*",
				"*","+","7","-"	};*/
	String [] arrIn ={"1","2","3","*","-"};
//String [] arrIn ={"1","2","+","3","*","7","-"};
	
	
			int i ;
	
	 String result;
			String curr;
	 	String first="";
	 	String second="";
			String third="";
	int prev;

	
	 	String count(String strFirst,String strsecond,
			String sign){
						double first = Double.parseDouble(strFirst);
						double second= Double.parseDouble(strsecond);
						switch(sign){
									case"+":
												return ""+(first + second);
									case "*":
												return ""+first * second;
									case "-":
												return ""+(first -second);
									case "/":
												return ""+first / second;
									 case"^":
												return ""+Math.pow(first ,second);
						}
 						return "";
			}
	
		boolean isSign(String t){
				if(t.equals("+")|t.equals("-")
						|t.equals("*")	|t.equals("/")
							|t.equals("^")){
						return true ;
				}
				return false ; 
		}
			
		String next(){
						while(i<arrIn.length){	
									curr=arrIn[i++];
									System.out.println("i="+i+" curr="+curr); 
									return curr;
						}
						return "";
			}
	
	//	__________________::_____________
	
		String reCount(){
			System.out.println(Arrays.toString(arrIn));
		while(i<arrIn.length){
 		curr =arrIn[0] ;
 		while( !isSign(curr )){
			curr=next();	
		}
			if (isSign(curr)&i<arrIn.length){	
  		if(first.equals("")&second.equals("")
						&third.equals("")){
			  	prev=i;
		  		third= arrIn[--prev];
			  	second =arrIn[--prev];
	  			first = arrIn[--prev];
			  	result=count(first,second,third);
				  System.out.println("result"+result);
			  	second =result;
		   	reCount();
			}
				if(!first.equals("")&!second.equals("")
						&!third.equals("")){
				 	System.out.println("второй иф curr="+curr);
			 		third=curr;
				  	first = arrIn[--prev];
					 System.out.println("first= "+first);
					 System.out.println("second="+second );
					 
			 		System.out.println("third= "+third);
				 	result=count(first,second,third);
			 		System.out.println("res="+result);
			 		second =result;
		   	reCount();
				}
		}
	}
		return " ";
	
	}
	
	
	/*	String recursCount(){
				System.out.println(Arrays.toString(arrIn));
				String result="";
				if (first.equals("")&second.equals("")
						&third.equals("")){
						first = next();
						result=first ;
						System.out.println("first= "+first);
					//	recursCount();
		   
				}
			if(!first.equals("")&second.equals("")
						&third.equals(""))	{
								second = next();
	//		recursCount();
					  	System.out.println("second= "+second);
					}
		if (!first.equals("")&!second.equals("")
						&third.equals("")){
						  third=next();
			    // recursCount();
					  	System.out.println("third sign= "+third);
		}	
	 	if (!first.equals("")&!second.equals("")
						&!third.equals("")){		
			System.out.println("третий if");
						if(isSign(third)){
						result=count(first,second,third);
						System.out.println("результат== "+result);
						first = ""+result;
						second = "";
						third ="";
			 		recursCount();//hjhhhhq
		}
							else	if(!isSign(third)){
								  System.out.println("recount начало");
							second =		reCount();				
							//recursCount();
										
			}
				}
	
				System.out.println(first);
				System.out.println("i="+i);
			System.out.println("результат "+result);
		
				return first;
}*/
}

