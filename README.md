# Asik2_ADS
Project Overview

This repository contains custom Java implementations of core data structures without using java.util.* (except for Iterator). It includes:

MyList interface

MyArrayList dynamic array

MyLinkedList doubly-linked list

MyStack

MyQueue

MyMinHeap<T extends Comparable>

MyList Interface

Defines the common operations for list structures:

void add(T item);
void add(int index, T item);
void addFirst(T item);
void addLast(T item);
void set(int index, T item);
T get(int index);
T getFirst();
T getLast();
void remove(int index);
void removeFirst();
void removeLast();
int size();
void clear();
Iterator<T> iterator();

Implementations

MyArrayList

Backed by an Object[] buffer, doubles capacity when full.

Time complexities:

add(item), addLast(item), get(index), set(index, item): amortized O(1)

add(index, item), remove(index): O(n)

removeLast(): O(1)

MyLinkedList

Doubly-linked list with prev and next pointers.

Tracks head, tail, and length.

Time complexities:

addFirst(item), addLast(item), removeFirst(), removeLast(): O(1)

get(index), set(index, item), add(index, item), remove(index): O(n)

MyStack

LIFO stack implemented with MyLinkedList<T>:

push(item): addFirst — O(1)

pop(): removeFirst — O(1)

peek(): getFirst — O(1)

size(), isEmpty(): O(1)

MyQueue

FIFO queue implemented with MyLinkedList<T>:

enqueue(item): addLast — O(1)

dequeue(): removeFirst — O(1)

peek(): getFirst — O(1)

size(), isEmpty(): O(1)

MyMinHeap<T extends Comparable>

Min-heap implemented with MyArrayList<T>:

insert(item): addLast + siftUp — O(log n)

peekMin(): get(0) — O(1)

extractMin(): swap root with last, removeLast, siftDown — O(log n)

size(), isEmpty(): O(1)

Usage Examples

// Stack example
MyStack<Integer> stack = new MyStack<>();
stack.push(1);
stack.push(2);
System.out.println(stack.peek()); // 2
System.out.println(stack.pop());  // 2
System.out.println(stack.isEmpty()); // false

// Queue example
MyQueue<String> queue = new MyQueue<>();
queue.enqueue("a");
queue.enqueue("b");
System.out.println(queue.peek()); // a
System.out.println(queue.dequeue()); // a

// MinHeap example
MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.insert(5);
heap.insert(3);
heap.insert(7);
System.out.println(heap.peekMin());    // 3
System.out.println(heap.extractMin()); // 3

License

This project is licensed under the MIT License.