public class Ordenamiento {

    
    public void insertionSort(int[] array, boolean mostrarPasos) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

              
                if (mostrarPasos) {
                    imprimirArray(array);
                }
            }
            array[j + 1] = key;

         
            if (mostrarPasos) {
                System.out.println("Después de insertar el elemento " + key + ":");
                imprimirArray(array);
            }
        }
    }

  
    public void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

