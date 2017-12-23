package net.kidpluto.CircularListWithTail;

import java.util.*;

/**
 * A sequential list that will start repeating itself after a certain index. <br>
 *
 * Example:  node_1 points_to node_2 points_to node_3 points_to node_4 points_to node_5 points_to node_2 <br>
 *
 * Original code by Stephan van Hulst https://coderanch.com/u/233178/Stephan-van-Hulst <br>
 *
 * @param <T> The type of the elements of the list.
 */
public final class CircularListWithTail<T> extends AbstractSequentialList<T> {

    private final LinkedList<T> actualList;
    private int circularPartStartIndex;

    /**
     * Creates an empty circular list.
     */
    private CircularListWithTail() {
        actualList = new LinkedList<>();
    }

    /**
     * Creates a fully circular list from a collection of elements.
     *
     * @param collection The collection of elements to create a circular list out of.
     */
    public CircularListWithTail(Collection<? extends T> collection) {
        actualList = new LinkedList<>(collection);
    }

    /**
     * Creates a partially circular list.
     *
     * @param circularPartStartIndex The index where the circular list will start repeating itself.
     *
     * @throws IndexOutOfBoundsException If circularPartStartIndex is negative.
     */
    public CircularListWithTail(int circularPartStartIndex) {
        this();
        setCircularPartStartIndex(circularPartStartIndex);
    }

    /**
     * Creates a partially circular list from a collection of elements.
     *
     * @param circularPartStartIndex The index where the circular list will start repeating itself.
     * @param collection             The collection of elements to create a circular list out of.
     *
     * @throws IndexOutOfBoundsException If circularPartStartIndex is negative.
     */
    public CircularListWithTail(int circularPartStartIndex, Collection<? extends T> collection) {
        this(collection);
        setCircularPartStartIndex(circularPartStartIndex);
    }

    /**
     * Sets the starting index of the circular part of this list. <br>
     * If this value is not set, then you have a circular list with no tail. <br>
     *
     * @param startIndex The index where this list will start reapeating itself.
     *
     * @throws IndexOutOfBoundsException If startIndex is negative.
     */
    private void setCircularPartStartIndex(int startIndex) {
        if (startIndex < 0)
            throw new IndexOutOfBoundsException("Index must not be negative.");

        circularPartStartIndex = startIndex;
    }

    /**
     * Gets the starting index of the circular part of this list.
     *
     * @return The index where this list will start repeating itself.
     */
    public int getCircularPartStartIndex() {
        return circularPartStartIndex;
    }

    /**
     * Returns the number of elements in this list, if it didn't repeat itself.
     *
     * @return The number of elements in the backing list, or Integer.MAX_VALUE if it contains more
     *         than Integer.MAX_VALUE elements.
     */
    @Override
    public int size() {
        return actualList.size();
    }

    /**
     * Gets the index inside the actual list of the indexed element.
     *
     * @param index The index of the element for which to get the index in the backing list.
     *
     * @return An integer {@code x}, where {@code  0 <= x <= size()},
     *         or {@code x > size()} if the index is in the circular part and the non-circular part isn't filled yet.
     */
    private int getActualIndex(int index) {
        int actualSize = size();

        if (index <= actualSize)
            return index;

        if (actualSize <= circularPartStartIndex)
            return circularPartStartIndex;

        int circularPartSize = actualSize - circularPartStartIndex;
        int circularPartIndex = index - circularPartStartIndex;

        return circularPartIndex % circularPartSize + circularPartStartIndex;
    }

    /**
     * Returns a list iterator over the elements in this list (in proper sequence).
     *
     * The returned list iterator will keep iterating after the last element in the backing list,
     * starting with the element at {@code this.getCircularPartStartIndex()}.
     *
     * When iterating backwards, the iterator will eventually move through the non-circular part and stop before the first element.
     *
     * @param index The index of the first element to be returned from the list iterator (by a call to the next method).
     *
     * @return A new ListIterator.
     *
     * @throws IndexOutOfBoundsException If {@code index > size()} and {@code size() < this.getCircularPartStartIndex()}
     */
    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>() {

            private ListIterator<T> actualIterator = actualList.listIterator(getActualIndex(index));
            private int i = index;

            @Override
            public boolean hasNext() {
                return actualIterator.hasNext() || size() > circularPartStartIndex;
            }

            @Override
            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException();

                if (!actualIterator.hasNext())
                    actualIterator = actualList.listIterator(circularPartStartIndex);

                T result = actualIterator.next();
                i++;
                return result;
            }

            @Override
            public boolean hasPrevious() {
                return i > 0;
            }

            @Override
            public T previous() {
                if (actualIterator.previousIndex() == circularPartStartIndex -1 && i > circularPartStartIndex)
                    actualIterator = actualList.listIterator(size());

                T result = actualIterator.previous();
                i--;
                return result;
            }

            @Override
            public int nextIndex() {
                return i;
            }

            @Override
            public int previousIndex() {
                return i-1;
            }

            @Override
            public void add(T e) {
                actualIterator.add(e);
            }

            @Override
            public void remove() {
                actualIterator.remove();
            }

            @Override
            public void set(T e) {
                actualIterator.set(e);
            }
        };
    }
}