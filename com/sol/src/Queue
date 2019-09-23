import java.util.NoSuchElementException;

/**
 * 
 *
 *
 *	-------------------------
 *	|0	|1	|2	|3  |4	|5	|
 *	-------------------------
 *
 * @param <T>
 */
public class Queue<T> {
	
	private int size;
	private int front;
	private int rear;
	private T[] arr;
	private String strEMPTYQUEUE = "Queue is Empty";
	/**
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public Queue(int size){
		front = rear = -1;
		this.size = 0;
		arr = (T[]) new Object[size];
	}
	
	/**
	 * @param x
	 */
	public void enqueue(T x){
		if(isFull())
			throw new IllegalStateException("Queue is Full");
		if(isEmpty()){
			front = rear = 0;
			arr[0] = x;
		}
		else{
			rear++;
			if(rear > arr.length-1){
				rear = 0;
			}
				arr[rear] = x;
		}
		size++;
	}
	
	/**
	 * @return
	 */
	public T dequeue(){
		if(isEmpty())
			throw new IllegalStateException(strEMPTYQUEUE);
		
		if(front > arr.length-1){
			front =0;
		}
		T val = arr[front];
		front++;
		size--;
		return val;
	}
	
	/**
	 * @return
	 */
	public T front(){
		if(isEmpty())
			throw new NoSuchElementException(strEMPTYQUEUE);
		return arr[front];
		
	}
	
	/**
	 * @return
	 */
	public T rear(){
		if(isEmpty())
			throw new NoSuchElementException(strEMPTYQUEUE);
		return arr[rear];
	}
	
	public boolean isEmpty(){
		return size == 0;
		
	}
	
	public boolean isFull(){
		return size == arr.length;
		
	}

	/**
	 * @return
	 */
	public int size(){
		return size;
		
	}
}
