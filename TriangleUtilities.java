 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String answer = "";
        
        for (int i = 0; i < numberOfStars; i++) {
            answer = answer + "*";
        }
        
        return answer;
    }
    
    public static String getTriangle(int numberOfRows) {
        String answer = "";
        
        for (int i = 1; i <= numberOfRows; i++) {
            answer = answer + getRow(i) + "\n";
        }
        System.out.println(answer);
        return answer;
    }


    public static String getSmallTriangle() {
        String answer = "";
        
        for (int i = 1; i <= 4; i++) {
            answer = answer + getRow(i) + "\n";
        }
        System.out.println(answer);
        return answer;
    }

    public static String getLargeTriangle() {
        String answer = "";
        
        for (int i = 1; i <= 9; i++) {
            answer = answer + getRow(i) + "\n";
        }
        System.out.println(answer);
        return answer;
    }
}
