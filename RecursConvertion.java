package Calculator;
import java.util.ArrayList;

class RecursConvertion {
		/*	String [] arrIn ={"(","1","+","2",
					")",	"*","(","3",
						"+","4",")","+","7"};*/
			String arrIn[];
			void  getArr(){
			//			System.out.println("yyyttt"+arr);
					String []	arr=Parser.count();
						arrIn=arr;
				//		System.out.println(arrIn	);
			}
			ArrayList<String > listOut = new ArrayList<>();
			String temp;
			String curr;
			String result="";
			int i=0;
			String next(){
						while(i<arrIn.length){	
									curr=arrIn[i++];
									System.out.println("i="+i+" curr="+curr+" Это next"); 
									return curr;
						}
						return "";
			}
			void arr(){
						for(String t:arrIn){
									System.out.print(t)	;
						}
						System.out.println();
			}
			void add(){		
						mult();
						 
			while(curr.equals("+")|curr.equals("-")){//	System.out.println(result);
									String temp=curr;
									System.out.println("add curr "+curr+" result="+result);
									next();
									System.out.println("curr=="+curr+"после next");
									mult();
									result +=" "+temp;
									System.out.println(" add result="+result+"after add");
						}
			}
			void mult(){
						pow();
						while(curr.equals("*")|curr.equals("/")){
									String temp=curr;
									next();
									pow();
									result +=" "+temp;
									System.out.println(
									"mult result="
									+result+"after mult");	
						}
 			}
		void pow(){	
						unarMinus();
						//number();
						while(curr.equals("^") ){
									String t ="^";
									next();
									unarMinus();
						  //number();
									result +=t;
									System.out.println(" pow result="+result+"after pow");			
						}
			}
		void unarMinus(){
				number ();
				while (curr.equals("_")){
				result+=" 0";
					//	String t ="_";
						next();
						number();			
				
				number();
				result +=" _";
	  	}
		}
		
			void number(){
						if(curr.equals("(")){
									next();
									add();		
						}
						if(curr.equals(")")){next();}
					else 	if(Convert.isNum(curr)){
									System.out.println("num curr="+curr);
									result +=" "+curr;
									System.out.println("number i="+i+"result="+result);
									next();
						}			
			}
			void convert(){
						arr();
						next();	
						add();
								System.out.println("curr"+curr);					
								System.out.println("вывод ="+result);
			}
}
