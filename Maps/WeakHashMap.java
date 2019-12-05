package com.begin.src;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		WeakHashMap map =   new WeakHashMap();
		map.put("Maine", "Augusta");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				while(map.containsKey("Maine")) {
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException ignored) {
						
					}
					System.out.println("Thread Waiting");
					System.gc();
				}
				
			}
		};
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("Main Waiting");
		try {
			t.join();
		}
		catch(InterruptedException ignored) {
			
		}
		
	}
}
