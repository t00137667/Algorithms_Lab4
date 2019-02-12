public class MyArrays {
    public static int insert(int values[], int currentSize, int pos, int newElement){

        if (currentSize < values.length){

            for(int i = currentSize - 1; i >= pos; i--){
                values[i+1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        else
            System.out.println("Error, could not insert, Array full");

        return currentSize;
    }


}
