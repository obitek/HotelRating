
public class HotelRating {
    private int[][] array;
    
    public HotelRating(int nHotels, int nYears){
        this.array = new int[nHotels][nYears];
        randomizeArray();
    }
    
    private void randomizeArray(){
        for(int i = 0; i < this.array.length; i++){
            for(int j = 0; j < this.array[i].length; j++){
                this.array[i][j] = (int)(Math.random() * 5) + 1;
            }
        }
    }
    
    public int[] fiveStarsHotels() {
        int r = this.array.length, c = this.array[0].length;
        int[] fiveStars = new int[r];
        for(int f = 0; f < r; f++){
            fiveStars[f] = -1;
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(this.array[i][j] == 5){
                    fiveStars[i] = i;
                    break;
                } 
            }
        }
        return fiveStars;
    }
    
    public double[] averageRatings(){
        int r = this.array.length, c = this.array[0].length;
        double[] avgArray = new double[r];
        for(int i = 0; i < r; i++){
            double total = 0.0;
            for(int j = 0; j < c; j++){
                total = total + this.array[i][j];
            }
            avgArray[i] = total / c;
        }
        return avgArray;
    }
    
    public int[] fourOrMoreStars(){
        int r = this.array.length, c = this.array[0].length;
        int[] fourOrMore = new int[r];
        for(int f = 0; f < r; f++){
            fourOrMore[f] = -1;
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(this.array[i][j] >= 4){
                    fourOrMore[i] = i;
                    break;
                }
            }
        }
        return fourOrMore;
    }
    
    public boolean anyFiveStars() {
        int r = this.array.length, c = this.array[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(this.array[i][j] == 5){
                    return true;
                }
            }
        }
        return false;
    }
   
    public int bestHotel(){
        int b = averageRatings().length;
        double maxVal = averageRatings()[0];
        int maxIndex = 0;
        for(int i = 1; i < b; i++){
            if(averageRatings()[i] > maxVal){
               maxVal = averageRatings()[i];
               maxIndex = i;
            }   
        }
        return maxIndex;
    }
    
    public int worstHotel(){
        int w = averageRatings().length;
        double minVal = averageRatings()[0];
        int minIndex = 0;
        for(int i = 1; i < w; i++){
            if(averageRatings()[i] < minVal){
               minVal = averageRatings()[i];
               minIndex = i;
            }
        }
        return minIndex;
    }
    
    public void printChart(){
        //System.out.println("\t\t-------------------------");
        for(int i = 0; i < this.array.length; i++){
            System.out.print("Hotel " + i + ":" + "\t\t");
            for(int j = 0; j < this.array[i].length; j++){
                //System.out.print(this.array[i][j] + "  ");
                // print the  * the amount of times the number occurs
                for (int k = 0; k < this.array[i][j]; k++) {
                    System.out.print("*");
                }
                
                // align the tabs
                for (int k = 0; k < this.array[i][j]; k++) {
                  if(this.array[i][j] <= 2){
                     System.out.print("\t\t\t");
                     break;
                  } else {
                     System.out.print("\t\t");
                     break;
                  }
               }
            }
            System.out.println();
        }
    }
}




