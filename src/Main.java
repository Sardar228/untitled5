import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] number = new double[15];
        number[0]=2.3;
        number[1]=-2.3;
        number[2]=3.43;
        number[3]=-6.2;
        number[4]=9.4;
        number[5]=-1.87;
        number[6]=-2.4;
        number[7]=5.3;
        number[8]=-8.5;
        number[9]=4.5;
        number[10]=8.9;
        number[11]=-4.6;
        number[12]=7.6;
        number[13]=-2.1;
        number[14]=4.3;
        System.out.println(Arrays.toString(number));
        for (int i = 0; i< number.length; i++) {
            if (number[i] < 0) {
                continue;
            }
            System.out.println(number[i]);
        }
        int [] numbers ={-7, -4, -2, 2, 3, 6, 8};
        printArray(numbers);
        SelectionSort(numbers);
        printArray(numbers);

    }
    public static void printArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ "");
        }
    }
    public static void SelectionSort(int [] array){
        for(int i=0;i<array.length;i++){
            int min = array[i];
            int min_i = i;
            for(int j=1;j< array.length;j++){
                if (array[j]<min){
                    min = array[j];
                    min_i= j;
                }
            }
            if (i!=min_i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}


