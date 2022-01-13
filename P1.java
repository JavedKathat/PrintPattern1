public class P1 {
    public static int count = 0;

    public static void printPattern(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            
            System.out.print(" *");
        }
        count++;
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
        printPattern(n-1);
    }

     public static void main(String[] args) {
         int n = 5;
         printPattern(n);
     }
}