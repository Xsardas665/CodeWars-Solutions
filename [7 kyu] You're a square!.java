public class Square {    
    public static boolean isSquare(int n) {        
        double sq = Math.sqrt(n); 
        return ((sq - Math.floor(sq)) == 0); 
    }
}