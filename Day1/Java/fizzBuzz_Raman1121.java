public class HelloWorld{
    
    public static void fizzbuzz(int n){
        for(int i=1; i<=n; i++){
 
            if(i%5 == 0 && i%3 == 0){
                System.out.print("Fizz Buzz, ");
            }else if(i%5 == 0 && i%3 != 0){
                System.out.print("Buzz, ");
            }else if(i%3 == 0 && i%5 != 0){
                System.out.print("Fizz, ");
            }else{
                System.out.print(i + ", ");
            }
        }
    }

     public static void main(String []args){
       fizzbuzz(35);
     }
}