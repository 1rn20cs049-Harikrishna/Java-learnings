package collectionFramework;
import java.util.ArrayList;


/* ArrayList Class
 * Internally uses Dynamic array data structure..
 * it allows duplicates values..
 * it implements List interface..
 * initiall capacity 10
 * order of insertion is maintained.
 */

public class ArrayListClass {
	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size());
		a1.ensureCapacity(20);//it ensures minimum capacity
		a1.add(1);
		boolean a=a1.add(2);
		//System.out.println(a);
		a1.add(0,0);
		
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		a1.clear();
		

		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
	}
}