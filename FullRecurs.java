package Calculator;
import java.util.ArrayList;

class FullRecurs {
			
			String curr;
		double f;
			int i=0;
		String str="-1*(0-1)";
		FullRecurs(String str){
				this.str=str;
		}
		//	String [] arrIn ={"3","*","3","+","7","*","4"};
			String [] arrIn =Parser.count();
			 String [] parse(String no){
    
    //Scanner scan =new Scanner(System.in);
  	 //	String no =scan.nextLine();
    no =no.replace("0(","0*(") ;
    no =no.replace(  "1(","1*(");
    no =no.replace(  "2(","2*(");
    no =no.replace(  "3(","3*(") ;
    no =no.replace(  "4(","4*(");
    no =no.replace(  "5(","5*(");
    no =no.replace(  "6(","6*(");
    no =no.replace(  "7(","7*(");
    no =no.replace(  "8(","8*(");
    no =no.replace(  "9(","9*(") ;
    String nom =no.replace(  ")(",")*(") ;
    //System.out.println(nom);
    ArrayList <String >list = new ArrayList<>();
    char [] charNom = nom.toCharArray();
    String nomchar ="";
    for(int i=0;i<charNom.length;i++){
      if(isNom(charNom[i])){ 
        nomchar ="";
        while(isNom(charNom[i])){
          nomchar+=nom.charAt(i);
          i++;
          if(i>charNom.length-1)
            break; 
        }      
        i--;       
      }
      else{
        nomchar =String.valueOf(nom.charAt(i));  
      } 
      list.add(nomchar);
      }  
      //scan.close();
   // int b=list.size();
    int i=0 ;
   // while(i<b+1){ 
      if(list.get(i).equals("-")&
        i==0){
        list.add(i,"(");
        i++;
        list.add(i,"0");
        i=i+2;   
        if(list.get(i).equals("(")){
          i++;
          while(!list.get(i).equals(")")){
            i++;
          }
        }
        i++;
        list.add(i,")"); 
        }else {
         if(list.get(i).equals("(")){
          i++;
          if(list.get(i).equals("-")){
            list.add(i,"(");
            i++;
            list.add(i,"0");
            i=i+2;
            i++;
            list.add(i,")");
          }
        }
     // }      
    }
   // System.out.println(list);
        String [] arrOut = new String [list.size()];
        arrOut = list.toArray(arrOut);
        return arrOut;
    }
		
		boolean isNom(char ch){
            if(Character.isDigit(ch)|
            ch=='.')
        return true;
        else
            return false;
        }					   
			String next(){
						while(i<arrIn.length){	
									curr=arrIn[i++];
							//		System.out.println("i="+i+" curr="+curr+" Это next"); 
									return curr;
						}
						return "";
			}
			
			/*void arr(){
						for(String t:arrIn){
									System.out.print(t)	;			
						}
						System.out.println();
}*/
			
			double add(){
					 double z=0;
						z= mult();
						//next();
						while (curr.equals("+")||curr.equals("-")){
									if(curr.equals("+"))	
								   	z=z+mult();
									else
												z=z-mult();
						//			System.out.println("рез= "+z); 
									//next();
						}
				//		next();
		//				System.out.println("z="+z);
				
						return z;			
			}
			double mult(){
						double z=0;
						z=pow();
		//		next();
						while (curr.equals("*")||curr.equals("/")){
									if(curr.equals("*"))
												z=z*pow();
									else 
												z=z/pow();
				//		System.out.println("z= "+z);
							//		next();
			}
						return z;
		}
		double pow(){//
				double p=0;
				p=number();
				while(curr.equals("^")){
						p=Math.pow(p ,number());
				}
				return p;
		}
		
			double number(){		
				double x=0;
				next();
				if(curr.equals("("))
						x=add();
				else
					 x= Double.parseDouble(curr);
						next();
				//		System.out.println("x= "+x);
						return x;
			}
		void comp(){
				double h=add();
				   if(h==Math.floor(h))
            System.out.printf("Ответ= %.0f \n",h);
            else
               System.out.println("Ответ= "+ h); 
        }
		
}
