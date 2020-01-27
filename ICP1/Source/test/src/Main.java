public class Main{
    public static int iteration = 0;
    public static void main(String[] args) {
        Palindrome(104);
    }
        public static void Palindrome(int num){
         System.out.println(num);
          iteration = iteration +1;
          int reversenum = 0;
          int number = num;
          while(num!=0){
              reversenum = reversenum * 10;
              reversenum = reversenum + (num % 10);
              num = num /10;
          }
          if(number == reversenum){
              System.out.println("Given number " + number + " is palindrome at iteration " +iteration);
          }
          else{
              int newnumber= number+reversenum;
              Palindrome(newnumber);
          }
        }
    }

