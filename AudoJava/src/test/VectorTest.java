package test;

import java.util.Vector;

public class VectorTest {
	private static Vector<Integer> vector=new Vector<Integer>();
	public static void main(String[] args) {
		while(true){
			for (int i = 0; i < 10; i++) {
				vector.add(i);
			}
			Thread removeThread=new Thread(new Runnable() {
				
				@Override
				public void run() {
					synchronized (vector) {						
						for (int i = 0; i < vector.size(); i++) {
							vector.remove(i);
						}
					}
				}
			});
			removeThread.start();
			Thread getThread=new Thread(new Runnable() {
				
				@Override
				public void run() {
					synchronized (vector) {						
						for (int i = 0; i < vector.size(); i++) {
							vector.get(i);
						}
					}
				}
			});
			getThread.start();
		}
	}

}
