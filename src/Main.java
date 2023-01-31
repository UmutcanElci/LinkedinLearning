import IntroToDataStructuresAndAlgorithms.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(6);
        list.insertAtHead(78);
        list.insertAtHead(5);
        System.out.println(list.toString());
        System.out.println(list.length());
        System.out.println(list.find(5));
    }
}