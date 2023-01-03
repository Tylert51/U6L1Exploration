public class Main {
    public static void main(String[] args) {

        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;


        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};

        String temp = alphabeticalNames[2];
        alphabeticalNames[2] = alphabeticalNames[1];
        alphabeticalNames[1] = temp;

        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);


        double[] array1 = {7.5, 10};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];
        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];
        System.out.println(array3[0]);
        System.out.println(array3[1]);

    }
}
