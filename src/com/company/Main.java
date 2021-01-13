package com.company;
import java.util.Arrays;
import static java.lang.Double.valueOf;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30};
        int sum=0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of array is: "+sum);
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your result is: "+ Arrays.toString(result));
}       public static double[] toPower(int size, int power){
            double[] result = new double[size];
            for(int i=0; i<size; i++){
                result[i] = Math.pow(valueOf(i), valueOf(power));
            }
            return result;
        }
        }


