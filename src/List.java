import Objects.AbstractObject;
import Objects.Heroes;

public class List {
    Elements first;

    AbstractObject object;

    public List() {
        first = null;
    }

    public void addFirst() {
        object.setData(object.promptInput());

        Elements newElement = new Elements(object);

        newElement.next = first;
        first = newElement;
    }

    public void addLast() {
        object.setData(object.promptInput());

        Elements newElement = new Elements(object);
        Elements current = first;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newElement;
    }

    public void add(int index) {
        object.setData(object.promptInput());

        Elements newElement = new Elements(object);
        Elements current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newElement.next = current.next;
        current.next = newElement;
    }

    public void removeFirst() {
        if(first == null) {
            System.out.println("The list is empty");
        } else {
            first = first.next;
        }
    }

    public void removeLast() {
        if(first == null) {
            System.out.println("The list is empty");
        } else {
            Elements current = first;
            Elements previous = first;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            previous.next = null;
        }
    }

    public void remove(int index) {
        if(first == null) {
            System.out.println("The list is empty");
        } else {
            Elements current = first;
            Elements previous = first;

            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
        }
    }

    public void clear() {
        first = null;
    }

    public void print() {
        Elements current = first;

        while (current != null) {
            System.out.println(current.object.getData()[0]);
            current = current.next;
        }
    }

    public void setClassInstance(AbstractObject object) {
        this.object = object;
    }
}
