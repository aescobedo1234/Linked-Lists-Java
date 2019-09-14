/**
 * Arnold Escobedo
 * CECS 274
 * Tu/Thur 2:00pm
 * Project 7 part a
 */
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Stack myStack = new Stack();
	Scanner input = new Scanner(System.in);
	Element myChar;
	System.out.println("Hello, Please enter a mathematical expression: ");
	String mathExp = input.nextLine();
	/**
	 * @myElement - the array is used to store each opening delimeter where
	 * it will be pushed to the stack
	 */
	Element myElement[] = new Element[mathExp.length()];

	for(int x = 0 ; x < mathExp.length(); x++){
		myElement[x] = new Element();
		myElement[x].setExpression(mathExp.charAt(x));
		switch(myElement[x].getMathExpression()){
		case'{':
		case'[':
		case'(':
			/**
			 * If an opening delimeter is found it will be pushed onto the stack
			 */
		myStack.push(myElement[x]);
		break;
		case'}':
		case']':
		case')':			
		if(!myStack.isEmpty()){
			/**
			 * When a closing delimeter is found the stack will be pop()
			 */
			myChar = myStack.pop();
			if(myElement[x].getMathExpression()==')'&& myChar.getMathExpression()!='('||
					myElement[x].getMathExpression()==']'&& myChar.getMathExpression()!='['||
					myElement[x].getMathExpression()=='}'&& myChar.getMathExpression()!='{')
				System.out.println("Error: " + myElement[x].getMathExpression() + " at " + (x+1) +"nd"+ " delimeter");
			}
		else
		System.out.println("!missing delimeters");
        break;
      default:
        break;
      }
    }
    if (!myStack.isEmpty()){
      System.out.println("(Error: missing the right delimiters)");
    }
 
  }
}
