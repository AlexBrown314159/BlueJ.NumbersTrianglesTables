 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
                String answer = "";
                Integer tableSize = 5;
                String txtNum = "";
    
        for (Integer i = 1; i <= tableSize; i++) {
            
            
            for (Integer k = 1; k <= tableSize; k++) {
                
                txtNum = Integer.toString(i * k);
                
                while(txtNum.length() < 3) {
                txtNum =  " " + txtNum;
                
            }
                answer = answer + txtNum + " |";
            }
                answer = answer + "\n";
            
        }
        System.out.print(answer);
        
        return answer;
    }

    public static String getLargeMultiplicationTable() {
                String answer = "";
                Integer tableSize = 10;
                String txtNum = "";
    
        for (Integer i = 1; i <= tableSize; i++) {
            
            
            for (Integer k = 1; k <= tableSize; k++) {
                
                txtNum = Integer.toString(i * k);
                
                while(txtNum.length() < 3) {
                txtNum =  " " + txtNum;
                
            }
                answer = answer + txtNum + " |";
            }
                answer = answer + "\n";
            
        }
        System.out.print(answer);
        
        return answer;
    }

    public static String getMultiplicationTable(int tableSize) {
        String answer = "";
        String txtNum = "";
    
        for (Integer i = 1; i <= tableSize; i++) {
            
            
            for (Integer k = 1; k <= tableSize; k++) {
                
                txtNum = Integer.toString(i * k);
                
                while(txtNum.length() < 3) {
                txtNum =  " " + txtNum;
                
            }
                answer = answer + txtNum + " |";
            }
                answer = answer + "\n";
            
        }
        System.out.print(answer);
        
        return answer;
    }
}
