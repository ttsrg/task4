import java.util.Arrays;


public class Task41 {
    public static void main(String[] args) {
        int n = 4;// in order -10
        System.out.println("Enter " + n + "  massive's digitals, please:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = InputArray.scan();
            // array[i]= new InputArray();
        }
        System.out.println("\nOriginal Array:");
        System.out.print(Arrays.toString(array));


        System.out.println("\n\n Sorting Array:");
        System.out.print("| ");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int same = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = same;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            OutputArray.output(array[i], i);
            // array[i]= new InputArray();
        }
        System.out.println("\n");

        //System.out.println("\nArray:");
        //OutputArray outArray= new OutputArray();
        // OutputArray.output(array.length, );
        //OutputArray.output(array);
    }
}
