
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	private Queue<Integer> queue;
	
	@Before
	public void setUp(){
		queue = new Queue<Integer>(5);
	}
	
	@Test
	public void testEmptyQueueReturnsTrue(){
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testEmptyQueuehasZeroSize(){
		assertEquals(0, queue.size());
	}
	
	@Test(expected = IllegalStateException.class)
	public void testDequeueEmptyQueueThrowsException(){
		queue.dequeue();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testGetFrontEmptyQueueThrowsException(){
		queue.front();
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testGetRearEmptyQueueThrowsException(){
		queue.rear();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExceptionThrownWhenFull(){
		for(int i=1; i<10;i++){
			queue.enqueue(i);
		}
	}
	
	@Test
	public void testQueueWrappingAround(){
		for(int i=1;i<=3;i++){
			queue.enqueue(i);
		}
		assertEquals(1, (int) queue.dequeue());
		assertEquals(2, (int) queue.dequeue());
		for (int i = 4; i <= 6; i++) {
			queue.enqueue(i);
		}

		assertEquals(3, (int)queue.front());
		assertEquals(6, (int)queue.rear());

		for(int i=3;i<=6;i++){
			assertEquals(i, (int)queue.dequeue());
		}
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testInsertTwoElementsAndDequeue(){
		queue.enqueue(1);
		queue.enqueue(2);
		
		assertEquals(1, (int) queue.dequeue());
		assertEquals(2, (int) queue.dequeue());
	}
	
	
}
