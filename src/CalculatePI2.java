//itt ki akarom probalni h milyen a profiler ido meres
import java.util.*;


public class CalculatePI2{     
    public static boolean isInside (double xPos, double yPos){  
        double distance = Math.sqrt((xPos * xPos) + (yPos * yPos));
        return (distance < 1.0);
    }
    public static double computePI (int numThrows){ 
        Random randomGen = new Random (System.currentTimeMillis());    
        int hits = 0;
        double PI = 0;     
        for (int i = 1; i <= numThrows; i++)
        { 
            double xPos = (randomGen.nextDouble()) * 2 - 1.0;
            double yPos = (randomGen.nextDouble()) * 2 - 1.0;
            if (isInside(xPos, yPos))
           {
            hits++;
            }
        }
    double dthrows = numThrows;
    PI = (4.0 * (hits/dthrows));
   return PI;
    }
    public static void main (String[] args){
//        eloszor itt volt a kezdeti pont
//        Date start_time = new Date();
        Scanner reader = new Scanner(System.in);
        System.out.println("This program approximates PI using the Monte Carlo method.");
        System.out.println("It simulates throwing darts at a dartboard.");
        System.out.print("Please enter number of throws: ");
        int numThrows = reader.nextInt();
//        most attesszuk ide
        Date start_time = new Date();
        double PI = computePI(numThrows);
//itt a vegpont
        Date stop_time = new Date();
        double etime;
        etime = (stop_time.getTime() - start_time.getTime())/1000;
        double Difference = PI - Math.PI;
        System.out.println ("Number of throws = " + numThrows + ", Computed PI = " + PI + ", Difference = " + Difference );    
        System.out.println("Elapsed time: " +etime);
    }
}
