public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertarAlInicio(int dato) {
        Node nuevo = new Node(dato);
        nuevo.setNext(head);
        head = nuevo;
    }

    public void insertarAlFinal(int dato) {
        Node nuevo = new Node(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nuevo);
        }
    }

    public void recorrer() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public boolean buscarElemento(int dato) {
        Node temp = head;
        while (temp != null) {
            if (temp.getDato() == dato) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void borrarElemento(int dato) {
        if (head == null) {
            return;
        }
        if (head.getDato() == dato) {
            head = head.getNext();
            return;
        }
        Node temp = head;
        while (temp.getNext() != null && temp.getNext().getDato() != dato) {
            temp = temp.getNext();
        }
        if (temp.getNext() != null) {
            temp.setNext(temp.getNext().getNext());
        }
    }
}
