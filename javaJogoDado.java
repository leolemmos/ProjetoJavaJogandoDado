package aula17;

public class Exercicio02 {

	public static void main(String[] args) {
		 int dado = (int) (Math.random()*5);
		 		
		 switch(dado){   
         
         case 1: 
        	 System.out.println(" ------------");
        	 System.out.println("|            |");
        	 System.out.println("|     *      |");
        	 System.out.println("|            |");
        	 System.out.println(" ------------");	 
            break; 
         case 2: 
        	 System.out.println(" ------------");
        	 System.out.println("|  *        |");
        	 System.out.println("|           |");
        	 System.out.println("|        *  |");
        	 System.out.println(" ------------");	 
            break;
         case 3: 
        	 System.out.println(" ------------");
        	 System.out.println("|  *          |");
        	 System.out.println("|      *      |");
        	 System.out.println("|          *  |");
        	 System.out.println(" ------------");	 
            break;  
         case 4: 
        	 System.out.println(" ------------");
        	 System.out.println("|  *       *  |");
        	 System.out.println("|             |");
        	 System.out.println("|  *       *  |");
        	 System.out.println(" ------------");	 
            break; 
         case 5: 
        	 System.out.println(" ------------");
        	 System.out.println("| *         *  |");
        	 System.out.println("|      *       |");
        	 System.out.println("| *         *  |");
        	 System.out.println(" ------------");	 
            break;   
         case 6: 
        	 System.out.println(" ------------");
        	 System.out.println("| *    *    * |");
        	 System.out.println("|             |");
        	 System.out.println("| *    *    * |");
        	 System.out.println(" ------------");	 
            break;   
         
          default:System.out.println("O dado caiu no buraco!!");   
     }   


	}

}
