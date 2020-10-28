package Task1;


import java.util.Iterator;

// итератор для двумерного массива
public class ArrayIterator implements Iterator<Integer>
    {
        
        private int[][] arr;
        private int i, j;
        public ArrayIterator(int[][] arr) {
            this.arr = arr;
        }
        @Override
        public boolean hasNext() {
            return i < arr.length && j < arr[i].length;
        }
        @Override
        public Integer next() {
            Integer r = arr[i][j++];
            if (j >= arr[i].length) {
                i++;
                j = 0;
            }
            return r;
        }
    }

