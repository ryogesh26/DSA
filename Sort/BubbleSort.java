public class BubbleSort {
    public static void main(String...args){

        int[] intArray = {23, 43, 43, 7, -15, 65, 12};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex -- ){
            for(int i = 0; i < lastUnsortedIndex; i ++ ){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i + 1);
                }
            }
        }
        for(int i = 0; i < intArray.length; i ++ ){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(array[i] == array[j]){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
