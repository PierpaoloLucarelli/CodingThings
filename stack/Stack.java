public class Stack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;
		}

	}

	private StackNode<T> top;

	public void push(T item){
		StackNode<T> n = new StackNode<T>(item);
		n.next = this.top;
		this.top = n;
	}

	public void print(){
		StackNode<T> curr = this.top;
		while(curr != null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

	public T pop(){
		if(this.top != null){
			T val = this.top.data;
			this.top = this.top.next;
			return val;
		}
		return null;
	}

	public boolean isEmpty(){
		return this.top == null;
	}

	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);


		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}