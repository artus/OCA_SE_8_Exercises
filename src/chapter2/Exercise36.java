package src.chapter2;

public class Exercise36 {

    public static void main(String[] args) {

        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        for(int[] myComplexArray: mySimpleArray) {

            for(int i=0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }

            System.out.println();
        }
    }
}
