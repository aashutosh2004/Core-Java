public class impArrayList {
    private int[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    // Constructor to initialize the array
    public impArrayList() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // Function to add an element
    public void addElement(int element) {
        if (size == array.length) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    // Function to get an element at a specific index
    public int getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range.");
        }
        return array[index];
    }


    // Function to get the size of the list
    public int size() {
        return size;
    }

    // Function to remove the last element
    public void removeLastElement() {
        if (size > 0) {
            size--; // Reduce size, effectively removing the last element
        } else {
            System.out.println("Array is empty. No element to remove.");
        }
    }

    public void display() {
        System.out.print("ArrayList Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Private function to resize the array when it's full
    private void resizeArray() {
        int newCapacity = array.length * 2; // Double the size
        int[] newArray = new int[newCapacity];

        // Copy elements to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray; // Replace the old array
    }

    // Main function to test the CustomArrayList
    public static void main(String[] args) {
        impArrayList customList = new impArrayList();

        // Add elements
        customList.addElement(10);
        customList.addElement(20);
        customList.addElement(30);

        // Print size
        System.out.println("Size: " + customList.size());

        // Get elements
        System.out.println("Element at index 1: " + customList.getElement(1));

        // Remove last element
        System.out.println("Size before removing last element: " + customList.size());
        customList.removeLastElement();
        System.out.println("Size after removing last element: " + customList.size());

        customList.display();
    }
}
