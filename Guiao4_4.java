public class Guiao4_4{
    public static void main(String[] abs){
        int n  = 8;
        int soDivi = 0;
        int sDivi = 0;
        //Divisores
        for(int c = 1;c <= n;c++){
            if(n%c==0){
                System.out.print(c + " ");
                sDivi+=1;
                soDivi+= c;
            }
        }
        System.out.println(" ");
        System.out.println("O " +n+" tem " +sDivi+ " divisores.");
        System.out.println("O " + n+ "! é: " +factorial(n));
        System.out.println("A soma dos divisores de " + n + " é " + soDivi);
    }
    //fatorial
    public static int factorial( int n ) {
        int fact = 1;
        for( int i = 1; i <= n; i++ ) {
           fact *= i;
        }
        return fact;
    }
}