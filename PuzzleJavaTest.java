public class PuzzleJavaTest {
    public static void main (String[] args){
        PuzzleJava test = new PuzzleJava();
        test.get10Rolls();
        test.getNewPasswordSet(10);
        int[] testNums = {1,7,3,8,9};
        test.arrayShuffle(testNums);
        
    }
}