import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 6){
                System.out.println("Size should not exceed 6");
            }
        }while (size > 6);

        int[] array = new int[size];

        for (int i =0; i < array.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        int[] newArray = new int[size+1];
        int index;
        do {
            System.out.print("Enter the index: ");
            index = sc.nextInt();
            if (index <=0 || index >= size-1){
                System.out.println("Cannot add!");
            }
        }while (index <=0 || index >= size-1);

        System.out.print("Enter the element: ");
        int element = sc.nextInt();

        for (int i = 0; i < size;i++){
            newArray[i] = array[i];
        }

        newArray[index] = element;

        for (int i = index + 1; i < newArray.length; i++){
            newArray[i] = array[i -1];
        }
        System.out.print("Old array: ");
        for (int a: array){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("New array: ");
        for (int a: newArray){
            System.out.print(a + " ");
        }

    }
}
