public class App {
    public static void main(String[] args) {
        
        int[] array = {12, 11, 13, 5, 6};

       
        Ordenamiento ordenamiento = new Ordenamiento();

        
        System.out.println("Array original:");
        ordenamiento.imprimirArray(array);

     
        System.out.println("\nOrdenando el array:");
        ordenamiento.insertionSort(array, true);  

       
        System.out.println("\nArray ordenado:");
        ordenamiento.imprimirArray(array);
    }
}

