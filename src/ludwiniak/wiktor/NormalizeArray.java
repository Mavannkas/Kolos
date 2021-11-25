package ludwiniak.wiktor;

public class NormalizeArray {
    public static int[][] normalize(int[][] arr) {
        int maxLengths = getMaxLength(arr);
        int[][] resultArray = createNewArray(arr.length, maxLengths);

        return copyValues(arr, resultArray);
    }

    private static int[][] copyValues(int[][] arr, int[][] resultArray) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resultArray[i][j] = arr[i][j];
            }
        }
        return resultArray;
    }

    private static int[][] createNewArray(int rows, int maxLengths) {
        int[][] numbers = new int[rows][maxLengths];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < maxLengths; j++) {
                numbers[i][j] = -1;
            }
        }
        return numbers;
    }

    private static int getMaxLength(int[][] arr) {
        int max = -1;
        for(int[] numbers : arr) {
            if(numbers.length > max) {
                max = numbers.length;
            }
        }
        return max;
    }

}
