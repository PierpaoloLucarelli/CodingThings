public class MaxHeap{



	public int[] heap;
	public int maxSize;
	public int size;

	public MaxHeap(int size){
		this.maxSize = size;
		this.size = 0;
		this.heap = new int[size];
	}


	public void add(int item){
		if(size+1 < maxSize){

			this.heap[size] = item;
			int pos = size;
			size++;

			// need to bubble it up
			while(heap[pos] > heap[getParent(pos)] && pos > 0){

				// swap elements
				swap(pos, getParent(pos));
				pos = getParent(pos);
			}


		}
		else{
			System.out.println("Heap is full");
		}
	}

	public int poll(){

		int item = -1;
		if(size > 0){

			item = heap[0];

			heap[0] = heap[size];
			size--;
			int pos = 0;
			while(getLeft(pos) <= size){

				int largestChild = getLeft(pos);

				if(getRight(pos) <= size && heap[getRight(pos)] > heap[largestChild])
					largestChild = getRight(pos);


				if(heap[pos] > heap[largestChild])
					break;

				else{
					swap(pos, largestChild);
					pos = largestChild;
				}

			}

			return item;

		} else{
			System.out.println("No item in heap");
		}
		return -1;

	}

	public void swap(int pos1, int pos2){
		int temp = heap[pos1];
		heap[pos1] = heap[pos2];
		heap[pos2] = temp;
	}

	public int getParent(int pos){
		// System.out.println((pos-1)/2);
		return (pos-1)/2;
	}

	public int getLeft(int pos){
		return (pos*2)+1;
	}

	public int getRight(int pos){
		return (pos*2)+2;
	}

	@Override
	public String toString(){
		String output = "";
		for(int i = 0 ; i < this.size ; i++){
			output += heap[i] + " " ;
		}
		return output;
	}


	public static void main(String[] args){

		System.out.println("ok");
		MaxHeap heap = new MaxHeap(10);

		heap.add(6);
		heap.add(5);
		heap.add(4);
		heap.add(8);
		heap.add(12);


		heap.poll();
		heap.poll();

		heap.add(26);
		System.out.println(heap);


	}

}