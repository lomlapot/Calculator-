package Calculator;
import java.util.Stack;

class PostfixCalc {
    
    static String postFixCount(String [] list) {
      
        Stack<Double> stack =new Stack<>();
        for(int i =0;i<list.length;i++){
            if(isNumber(list[i])){
                stack.push
                (Double.parseDouble(list[i]));
            }
            else{
                double nom1 =stack.pop();
                double nom2 =stack.pop();
                switch(list[i]){
                    case "+":
                        stack.push(nom1
                        +nom2);
                        break;
                    case "-":
                        stack.push(nom2
                        -nom1);
                        break;
                    case "*":
                        stack.push(nom1
                        *nom2);
                        break;
                    case "/":
                        stack.push(nom2
                        /nom1);
                        break;
                    case "^":
                        stack.push(Math
                        .pow(nom2,nom1));
                        break;
                } 
            }                 
        }
       
        if(!stack.empty()){
            String strAnswer;
           // System.out.println();
            double answer=  stack.pop();
            if(answer==Math.floor(answer))
          //  System.out.printf("Ответ= %.0f \n",answer);
            return ""+(int)answer;
            else
              // System.out.println("Ответ= "+ answer); 
            return""+answer;
        }
        else 
            System.out.println("Ошибка ");
        return "Ошибка";
    }
  static  boolean isNumber(String i){
       try{
            Double.parseDouble(i);
        return true;
        }
            
       catch(NumberFormatException e){
        return false ; 
        }
    }
    
}
