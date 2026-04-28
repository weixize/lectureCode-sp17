/** Array based list.
 *  @author Josh Hug
 */

public class AList<Item> {
    /** Creates an empty list. */
    private Item[] container;
    private int size;

    public AList() {
        container = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity, int start) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(container, 0, a, start, size);
        container = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == container.length) {
            resize(size * 2, 0);
        }

        container[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return container[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return container[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
        Item x = getLast();
        container[size - 1] = null;
        size -= 1;
        return x;
    }

    public void addFirst(Item x) {
        resize(size + 1, 1);
        container[0] = x;
        size += 1;
    }
} 