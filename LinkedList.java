import java.awt.List;
public class LinkedList {
private static int size;
private Node head;
private Node tail;
/**
 * @LinkedList() - Default constructor
 */
public LinkedList(){
size =0;
head = null;
tail = null;
}
/**
*@size() - returns size
* @return
*/
public int size(){
return size;
}
/**
*@isEmpty() checks whether the list is empty
* @return
*/
public boolean isEmpty(){
return size ==0;
}
/**
 * @first() - returns the first value in list 
 * @return
 */
public Element first(){
if (isEmpty())
{
return null;
}
return head.getElement();
}

/**
*@last()- returns last element
* @return
*/
public Element last(){
if (isEmpty())
return null;
return tail.getElement();
}
//update methods
//add element to the front of the list
/**
*
* @param e
*/
//add element to the front of the list
public void addFirst(Element e){
//create and link a new node
head = new Node(e, head);
// special case: new node becomes tail
if (size == 0 )
tail = head;
size++;
}
//add element to the end of the list
public void addLast(Element e){
	Node newest = new Node(e, null);
	tail.setNext(newest);
	tail = newest;
	if(size==0){
		head = tail;
		size++;
	}
}
// remove and return the first element
public Element removeFirst() {
	Element answer = new Element();
	if(isEmpty()){
		return null;
	}
	else if(size == 0){
		tail = head;
		return answer;
	}
	else
	{
		 answer = head.getElement();
		 head = head.getNext();
		 size--;
	}
	return answer;
}
// inserts the specified element at the specified position in this list
public void add(Element data, int index) {
	Node before = new Node();
	Node newNode = new Node(data,null);
	Node current = new Node();
	before = head;
	int count = 1;
	while(count < index-1){
		before = before.getNext();
		count++;
	}
	current = before.getNext();
	newNode.setNext(current);
	before.setNext(newNode);

}

// returns the element at the specified position in this list.
public Element get(int index){
	for(int i = 1; index > i && index < size; i++){
		head = head.getNext();
	}
	return head.getElement();
	
}
// removes the element at the specified position in this list.
public boolean remove(int index) {
	if(isEmpty()){
		return false;
	}
	Node previous = new Node();
	Node current = new Node();
	previous = head;
	int count = 1;
	while(count < index-1){
		previous = previous.getNext();
		count++;
	}
	current = previous.getNext();
	previous.setNext(current.getNext());
	current.setNext(null);
	return true;
	}
}