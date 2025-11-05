import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<? super E>> {
    private final List<E> items = new ArrayList<>();

    public void add(E element) {
        items.add(element);
    }

    public void addAll(List<E> elements) {
        items.addAll(elements);
    }

    public void print() {
        List<E> copy = new ArrayList<>(items);
        Collections.sort(copy);
        for (E e : copy) {
            System.out.println(e);
        }
    }
}