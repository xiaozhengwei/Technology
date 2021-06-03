package com.utunan;

import java.util.HashMap;

public class MaxHeap {

    int maxSize;
    int[] heap;
    public final int DEFAULT_MAX_SIZE = 15;

    public MaxHeap() {
        maxSize = DEFAULT_MAX_SIZE;
        heap = new int[DEFAULT_MAX_SIZE + 1];
    }

    public MaxHeap(int size) {
        maxSize = size;
        heap = new int[size + 1];
    }

    public int swap(int num, int index) {
        int update = heap[index];
        heap[index] = num;
        return update;
    }

    public void add(int data) {

        int endIndex = heap[0] + 1;
        heap[endIndex] = data;


    }

    public int left(int index) {
        return 2 * index;
    }

    public int right(int index) {
        return 2 * index + 1;
    }

    public int parent(int index) {
        return index / 2;
    }

    public boolean isEmpty() {
        return heap[0] == 0;
    }

    public boolean isFull() {
        return heap[0] == maxSize;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int num : heap) {
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MaxHeap []heaps=new MaxHeap[100];
      for (MaxHeap maxHeap:heaps){
          System.out.println(maxHeap);
      }

    }
}
