
import java.util.Scanner;

public class TestHotelRating {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     String sentiVal = "y";
     
     while(sentiVal.equalsIgnoreCase("y") || sentiVal.equalsIgnoreCase("yes")){
         System.out.print("\nEnter the number of hotels: ");
         int r = scan.nextInt();
         System.out.print("Enter the number of years: ");
         int c = scan.nextInt();
         scan.nextLine();
         
         HotelRating obj = new HotelRating(r, c);
         //Print out Five stars hotels indices:
         System.out.print("Five stars hotels indices: \t\t\t");
         for(int i = 0; i < r; i++){
            if(obj.fiveStarsHotels()[i] >= 0){
               System.out.print(obj.fiveStarsHotels()[i] + ", "); 
            } 
         }
         System.out.println();
         
         // Average Ratings are:
         System.out.print("Average Ratings are: \t\t");
         for(int i = 0; i < r; i++){
            System.out.print("\n\t\t"); 
            System.out.printf("Hotel %d: \t\t\t\t\t\t\t", i);
            System.out.print(String.format("%.2f", obj.averageRatings()[i])); 
         }
         System.out.println();         
         
         // Four or more stars hotels indices:
         System.out.print("Four or more stars hotels indices: \t");
         for(int i = 0; i < r; i++){
            if(obj.fourOrMoreStars()[i] >= 0){
               System.out.print(obj.fourOrMoreStars()[i] + ", "); 
            } 
         }
         System.out.println();
         
         //Any five stars hotel? true
         System.out.println("Any five stars hotel? \t\t\t\t\t" + obj.anyFiveStars());
         //Best hotel index:
         System.out.println("Best hotel index: \t\t\t\t\t\t" + obj.bestHotel());
         //Worst hotel index:
         System.out.println("Worst hotel index: \t\t\t\t\t\t" + obj.worstHotel());
         
         System.out.print("\n\n");
         // Ratings chart:
         System.out.println("Ratings chart:");
         System.out.print("\n\n");
         
         //print column headers
         System.out.print("\t\t\t\t");
         for(int i = 0; i < c; i++){
            System.out.printf("Year" + (i + 1) + "\t\t");
         }
         System.out.println();  // line break
         
         // print the dashes               
         //System.out.print("\t\t\t");
         /*
            algorithm: 
            year1 -> 5 dashes
            year1 + space + year2 = 14 dashes
            year1 + space + year2 + space + year3 = 23 dashes
            NumberOfColums ->    NumberOfDashes
                  Nc       ->    9(c - 1) + 5 = 9c - 4
            ConstantBeforeCountBegins = 12
         */
         for(int i = 0; i < 9 * c + 8; i++){
            System.out.print("-");
         }
         System.out.println(); // line break
         obj.printChart();    // print chart
         System.out.print("\nWould you like to run the program again (y/n)?  ");
         sentiVal = scan.nextLine();
         System.out.println();
     }
   }
}
