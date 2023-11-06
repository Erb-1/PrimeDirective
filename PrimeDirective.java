// Import statement:
import java.util.*;

class PrimeDirective {
  
    public static void main(String[] args) {
  
      PrimeDirective pd = new PrimeDirective();
      int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
      System.out.println(pd.isPrime(numbers[1]));
      System.out.println(pd.onlyPrimes(numbers));
    }
    
    public boolean isPrime(int number){
        //checks if param is 2 or less
        if(number == 2){
            return true;
        }else if(number < 2){
            return false;
        }
        //checks if param is divisible by itself
        for(int i = 2; i<number;i++){
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
    
    //Arraylist used to filter the prime numbers out of "numbers"
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        //for each number in numbers, its checking if isPrime returns true to it
            for(int number:numbers){
                if(isPrime(number) == true){
                    //adds number if isPrime is true
                    primes.add(number);
                }

            }
            return primes;


    }  
  
  }