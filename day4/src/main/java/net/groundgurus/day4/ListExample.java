import java.util.ArrayList;

void main() {
    var myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("Hi");
    myList.add("Howdy");
    myList.add("Howdy");
    myList.add("Hi");
    System.out.println(myList);
    System.out.println(myList.get(1));
}