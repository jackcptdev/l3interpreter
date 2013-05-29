package l3interpreter.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import l3interpreter.inter.Unit;

public class L3Stack<T extends Unit> {

	private final Stack<T> stack = new Stack<T>();
	private final Map<String, Integer> label2Index = new HashMap<String, Integer>();

	private final Stack<Integer> frameMarker = new Stack<Integer>();

	public L3Stack() {

	}

	public void enterFrame() {
		Integer n = this.stack.size();
		this.frameMarker.push(n);
	}

	public void exitFrame() {

		if (this.frameMarker.size() > 0) {
			Integer b = this.frameMarker.pop();
			Integer h = this.stack.size() - 1;
			while (h >= b) {
				T p = this.stack.pop();
				this.label2Index.remove(p.identifier);
				h--;
			}
		}
	}

	public void push(T v) {
		this.stack.push(v);
		this.label2Index.put(v.identifier, this.stack.size() - 1);
	}

	public T pop() {
		T p = this.stack.pop();
		if (p != null) {
			this.label2Index.remove(p.identifier);
		}
		return p;
	}

	private void printCurrentFrame() {
		if (this.frameMarker.size() > 0) {
			System.out.println("Current Frame:");
			int n = this.stack.size() - 1;
			int b = this.frameMarker.peek();
			while (n >= b) {
				T p = this.stack.get(n);
				int index = this.label2Index.get(p.identifier);
				System.out.println(p.identifier + " -> " + index);
				n --;
			}
			System.out.println("End:Current Frame.");
		}
	}

	public static void main(String[] args) {
		L3Stack<Unit> s = new L3Stack<Unit>();
		s.printCurrentFrame();

		s.enterFrame();

		s.push(new Unit("A"));
		s.push(new Unit("B"));
		s.push(new Unit("A"));
		s.printCurrentFrame();
		s.pop();
		s.printCurrentFrame();
		
		s.exitFrame();
		
		s.printCurrentFrame();

	}

}
