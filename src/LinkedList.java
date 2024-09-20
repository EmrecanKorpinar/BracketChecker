class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void ilkGiren(char data) {
        Link yeniLink = new Link(data);
        yeniLink.next = first;
        first = yeniLink;
    }

    public char ilkSil() {
        Link temp = first;
        first = first.next;
        return temp.data;
    }

    public void displayList() {
        Link güncel= first;
        while (güncel != null) {
            güncel.displayLink();
            güncel = güncel.next;
        }
        System.out.println();
    }
    public Link getFirst() {
        return first;
    }
}
