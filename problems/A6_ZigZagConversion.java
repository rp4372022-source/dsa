public class A6_ZigZagConversion {
    static String convert(String s, int numRows){

        //if length is smaller than numRows or numRows = 1 then no zigzag pattern
        if(numRows == 1 || s.length() <= numRows) return s;

        //approach -> create array of stringBuilders , iterate through it
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++) 
            rows[i] = new StringBuilder();
        
        int currentRow = 0;
        boolean goingDown = false;
        for(char c: s.toCharArray()){
            rows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows-1)
                goingDown = !goingDown;
            
            currentRow += (goingDown) ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        
        for(StringBuilder row: rows) 
            res.append(row);

        return res.toString();
    }

    // public static void main(String[] args) {
    //     String s = "PAYPALISHIRING";
    //     int numRows = 4;
    //     System.out.println(convert(s, numRows)); 
    // }
}
