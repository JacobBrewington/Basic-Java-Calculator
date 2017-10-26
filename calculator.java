import java.util.Scanner;

public class Calculator {
    
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);
        boolean flag = false;

        double total=0.0;
        do{
            System.out.println("Enter calculator type");
            String calculatorType = in.nextLine();
            
        if(calculatorType.equalsIgnoreCase("Scientific")){
            System.out.println("Enter + for addition, - for subtraction, * for multiplication, and / for division");
            String option = in.next();
            switch (option){
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
                
            case "/":
                divide();
                break;
            default :
                System.out.println("Invalid operation");
                break;
            }
            
            
        }
        
        else if(calculatorType.equalsIgnoreCase("Standard")){
            System.out.println("Enter + for addition, - for subtraction, * for multiplication, and / for division");
            String option = in.next();
            switch (option){
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
                
            case "/":
                divide();
                break;
            default :
                System.out.println("Invalid operation");
                break;
            }
        }
        System.out.println("Do you want to start over?");
        String answer = in.next();
        if(answer.equalsIgnoreCase("y")){
            flag = true;
        }else if(answer.equalsIgnoreCase("n")){
            flag = false;
        }
        }while(flag);
            
        }
    public static void add(){
        double result = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int n = in.nextInt();
        double temp = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Enter number "+(i+1)+": ");
            temp = in.nextDouble(); 
        
            result += temp;
        }
    
        System.out.println("Result: "+result);
    
        
        
    }
    
    public static void subtract(){
        double result = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to subtract?");
        int n = in.nextInt();
        double temp = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Enter number "+(i+1)+": ");
            temp = in.nextDouble();
            
            result -= temp;
            
        }
        
        System.out.println("Result: "+result);
    }
    
    public static void multiply(){
        double result = 1.0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to multiply?");
        int n = in.nextInt();
        double temp = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Enter number "+(i+1)+": ");
            temp = in.nextDouble();
            
            result *= temp;
        }
        System.out.println("Result: "+result);
        
    }
    
    public static void divide(){
        double result = 1.0;
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to divide?");
        int n = in.nextInt();
        double temp = 0.0;
        for (int i = 0; i < n; i++){
            System.out.println("Enter number "+(i+1)+": ");
            temp = in.nextDouble();
            
            result /= temp;
        }
        System.out.println("Result: "+result);
    }
     public static void sin(){
         double result = 0.0;
         Scanner in = new Scanner(System.in);
         System.out.println("What do you want to enter into the sine function?");
         double x = in.nextDouble();
         result = Math.sin(x);
         System.out.println("Result: "+result);
     }
     public static void cos(){
         double result = 0.0;
         Scanner in = new Scanner(System.in);
         System.out.println("What do you want to enter into the cosine function?");
         double x = in.nextDouble();
         result = Math.cos(x);
         System.out.println("Result: "+result);
    }
     public static void tan(){
         double result = 0.0;
         Scanner in = new Scanner(System.in);
         System.out.println("What do you want to enter into the tangent function?");
         double x = in.nextDouble();
         result = Math.tan(x);
         System.out.println("Result: "+result);
     }
}
