public class Stack {
private static int size=0;
private LinkedList list = new LinkedList();
/**
 * @push(Element e) - pushes the current element on the stack
 * @param e
 */
public void push(Element e){
	list.addFirst(e);
	size++;
}
/**
 * @isEmpty() - checks whether the stack is empty
 * @return
 */
public boolean isEmpty(){
	return size == 0;
}
/**
 * @top() - returns the element on top of the stack or the first element  of the stack
 * @return
 */
public Element top(){
	if(list.isEmpty()){
	System.out.println("The stack is empty");
	}
	else
	return list.first();
	return null;
	
}
/**
 * @pop() - returns and removes the first element on the stack
 * @return
 */
public Element pop(){
	Element temp = list.first();
	if(!list.isEmpty()){
		list.removeFirst();
		size--;
	}
	return temp;	
}
/**
 * @size() - returns the size of the stack.
 * @return
 */
public int size(){
return size;
}
}
