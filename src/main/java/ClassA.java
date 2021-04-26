public class ClassA {

    private int value = 0;

    /**
     * @return Get the current value of the counter.
     */
    public int get() {
        return value;
    }

    /**
     * Increment the counter.
     */
    public void increment() {
        value++;
    }

    /**
     * Decrement the counter.
     */
    public void decrement() {
        value--;
    }
}