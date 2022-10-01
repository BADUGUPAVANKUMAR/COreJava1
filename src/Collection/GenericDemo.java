package Collection;


class Sample<K>{
	void show(K a) {
		System.out.println(a);
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Sample<Integer> a = new Sample<Integer>();
		a.show(100);
		Sample<Double> g = new Sample<Double>();
		g.show(6.5);
		Sample <String> v = new Sample<String>();
		v .show("pavan");
		

	}

}
