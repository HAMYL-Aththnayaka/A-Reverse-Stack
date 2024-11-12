public class Rstack{
	int maxSize;int top =-1;
	int[] Array;
	
	Rstack(int size){
		maxSize=size;
		Array = new int[maxSize];
	}
	public boolean isFull(){
		return top == maxSize-1;
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public void push(int value){
		if(!isFull()){
			Array[++top] = value;
		}
		else{
			System.out.println("The Stack is Full ");
		}
	}
	public int pop(){
		int temp =-1;
		
		if(!isEmpty()){
			temp = Array[top];
			top--;
		}
		else{
			System.out.println("The Stack is Empty !!");
		}
		return temp;
	}
	 public void peak(){
		 if(!isEmpty()){
			 System.out.println(Array[top]);
		 }
		 else{
			 System.out.println("The Stack is Empty");
		 }
	 }
	 
	 public void display(){
	 if(!isEmpty()){
		 for(int i = 0; i<= top;i++){
		 System.out.println(Array[i]);
		 }
		}
		else{
			System.out.println("The Stack is Empty");
		}
	 }
	 
	 
	 public static void main(String []args){
		 Rstack R1 = new Rstack(5);
		 
		 
		 R1.push(5);
		 R1.push(5);
		 R1.push(1);
		 R1.push(12);
		 
		 
		 System.out.println();
		 System.out.println(R1.pop());
		 System.out.println();
		 
		 R1.display();
	 }
		
}