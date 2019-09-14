public class Element {
private char mathExpression;
/**
*@Element() - default constructor
*/
public Element(){
mathExpression = 0;

}
/**
*@Element(char c) - overloaded constructor
* @param c
* @param s
*/
public Element(char c){
mathExpression = c;
}
/**
 * @setExpression(char n) - will set a character argument to mathExpression
 */
public void setExpression(char n){
mathExpression = n;
}
/**
 * @getMathExpression() - will return dlimeter character argument 
 * @return
 */
public char getMathExpression(){
return mathExpression;
}
/**
 * @toString - prints delimeter character value
 */
public String toString(){
return " " + getMathExpression();
}
}