
package Heap;
import java.util.ArrayList;

public class Minheap {
    private final ArrayList<Integer> heap;

    // Constructor to initialize the heap array
    public Minheap() {
        heap = new ArrayList<>();
    }

    // Insert a new element into the heap
    public void insert(int value) {
        heap.add(value);  // Add the new element to the end
        int current = heap.size() - 1;

        // Bubble up to maintain the heap property
        while (current > 0 && heap.get(current) < heap.get((current - 1) / 2)) {
            swap(current, (current - 1) / 2);  // Swap with the parent
            current = (current - 1) / 2;       // Move up to the parent
        }
    }

    // Extract the minimum element (root of the heap)
    public int extractMin() {
        if (heap.size() == 0) return -1; // Heap is empty, return -1 or handle error

        int min = heap.get(0);           // The root of the heap (minimum element)
        heap.set(0, heap.get(heap.size() - 1)); // Move last element to root
        heap.remove(heap.size() - 1);    // Remove last element
        heapify(0);                      // Heapify down from the root

        return min;                      // Return the extracted minimum
    }

    // Heapify down to maintain the heap property
    private void heapify(int i) {
        int left = 2 * i + 1;           // Left child index
        int right = 2 * i + 2;          // Right child index
        int smallest = i;               // Assume current index is the smallest

        // Check if left child is smaller than current
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        // Check if right child is smaller than current smallest
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        // If the smallest is not the current element, swap and continue heapifying
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest); // Recursively heapify the affected subtree
        }
    }

    // Swap elements at two indices in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Display the heap elements
    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        Minheap minHeap = new Minheap();

        // Test inserting elements
        minHeap.insert(10);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(17);
        minHeap.insert(8);

        // Print heap after insertions
        System.out.println("Min-Heap:");
        minHeap.printHeap();

        // Test extracting the minimum element
        System.out.println("Extract Min: " + minHeap.extractMin());
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());
        minHeap.printHeap();
    }
}
