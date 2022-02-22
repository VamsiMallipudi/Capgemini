
public class swap<T> {
	private T a[];

	public swap(T a[]) {
		super();
		this.a = a;
	}
	
	public void swap(int b,int c) {
		T temp;
		temp = this.a[b];
		a[b] = a[c];
		a[c] = temp;
	}

	public T[] getA() {
		return a;
	}
	
	public int size(T l[]) {
		return l.length;
	}
}
