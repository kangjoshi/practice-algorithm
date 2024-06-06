package linked_list;

public class ListNodeObject {

    Object val;
    ListNodeObject next;

    ListNodeObject() {}
    ListNodeObject(Object val) {
        this.val = val;
    }
    ListNodeObject(Object val, ListNodeObject next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        System.out.print(val + " ");
    }

    public void printAll() {
        var n = this;
        while (n != null) {
            n.print();
            n = n.next;
        }
        System.out.println();
    }
}
