/**
 * Created with IntelliJ IDEA.
 * User: Fujinuma
 * Date: 2013/09/13
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class ArrayMaxPQ<Integer> {
    private int[] pq; // pq[i] = ith element on pq
    private int N; // num of elements on pq

    public ArrayMaxPQ(int capacity) {
        pq = new int[capacity];
    }

    public boolean isEmpty() { return N == 0; }

    public void insert(int x) { pq[N++] = x; }

    public int delMax() {
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (less(max, i)) max = i;
        }
        swap(max, N-1);
        return pq[--N];
    }

    public void swap(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
    private boolean less(int max, int i) {
        return pq[max] < pq[i];
    }
}