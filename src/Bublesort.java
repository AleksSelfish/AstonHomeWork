public class Bublesort {
    static void swap(int[] array) {
        boolean isFlag = false;
        int temp;
        while (!isFlag) {
            isFlag = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isFlag = false;


                }

            }

        }

    }
}


