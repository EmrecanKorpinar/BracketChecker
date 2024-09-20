class LinkStack {
    private LinkedList list;
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public LinkStack() {
        list = new LinkedList();
    }
    public void push(char data) {
        list.ilkGiren(data);
    }

    public char peek() {
        return list.isEmpty() ? ' ' : list.getFirst().data;
    }
    public void displayStack() {
        System.out.print(" Stack top to bottom: ");
        list.displayList();
    }
    public char pop() {
        return list.ilkSil();
    }

}