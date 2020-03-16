import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Thread Safe Implementation Of List Interface
 * Expensive as for every add, set & update operation, a cloned copy is created.
 * Best Choice if you have frequent read operation.
 * 
 * The "snapshot" style iterator method uses a reference to the state of the array
 * at the point that the iterator was created. This array never changes during the
 * lifetime of the iterator, so interference is impossible and the iterator is 
 * guaranteed not to throw ConcurrentModificationException. The iterator will not 
 * reflect additions, removals, or changes to the list since the iterator was created.
 * 
 * Element-changing operations on iterators themselves (remove, set, and add) 
 * are not supported. These methods throw UnsupportedOperationException.
 */
public class CopyOnWriteArrayListDemo extends Thread{
	static CopyOnWriteArrayList<String> templist = new CopyOnWriteArrayList<>();
	static List<String> temparraylist = new ArrayList<>();
	public void run(){
		templist.add("D");
		temparraylist.add("D");
	}
	public static void main(String[] args) throws InterruptedException {
		templist.add("A");
		templist.add("B");
		templist.add("C");
		CopyOnWriteArrayListDemo objdemo = new CopyOnWriteArrayListDemo();
		objdemo.start();
		Thread.sleep(1000);
		Iterator<String> it = templist.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s =="B"){
				templist.add("E");
			}
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(templist);
		//ArrayListDemo();
	}
	public static void ArrayListDemo() throws InterruptedException{
		temparraylist.add("A");
		temparraylist.add("B");
		temparraylist.add("C");
		CopyOnWriteArrayListDemo objdemo = new CopyOnWriteArrayListDemo();
		objdemo.start();
		Thread.sleep(1000);
		Iterator<String> it = temparraylist.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s =="B"){
				temparraylist.add("E");
			}
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(temparraylist);
	}
}
