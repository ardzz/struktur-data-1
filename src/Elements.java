import Objects.AbstractObject;

public class Elements {
    public AbstractObject object;
    public Elements next;
    public Elements(AbstractObject object) {
        this.object = object;
        this.next = null;
    }
}
