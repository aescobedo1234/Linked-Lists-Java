public class Node {
private Element e;
private Node next;
private Node prev;
/**
*@Node - overloaded constructor
* @param e
* @param n
*/
public Node(Element e, Node n){
this.e = e;
next = n;

}
/**
 * @Node() - default constructor
 */
public Node() {
	this.e = null;
	next = null;
	prev = null;
	
	// TODO Auto-generated constructor stub
}
/**
*@setE(Element E) - sets node to element
* @param E
*/
public void setE(Element E){
e = E;
}
/**
*@setNext(Node nectValue) - sets the next value on the node
* @param nextValue
*/
public void setNext(Node nextValue){
next = nextValue;
}
/**
*@getNext() - returns the next value on the node
* @return
*/
public Node getNext(){
return next;
}
/**
*@getElement() - returns element on node
* @return
*/
public Element getElement(){
return e;
}
/**
*
*/

}

