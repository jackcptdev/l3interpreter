package l3interpreter.memory;

import java.util.ArrayList;
import java.util.List;

import l3interpreter.inter.IdentifierAlreadyExistException;
import l3interpreter.inter.IdentifierNotExistException;
import l3interpreter.inter.Unit;

public class L3ScopeStack<T extends Unit> {

	private final List<L3Scope<T>> stack = new ArrayList<L3Scope<T>>();
	private volatile L3Scope<T> currentFrame = null;

	public L3ScopeStack() {
		this.enterFrame();
	}

	public L3Scope<T> enterFrame() {
		L3Scope<T> frame = new L3Scope<T>();
		this.stack.add(frame);
		this.currentFrame = frame;
		return frame;
	}

	public void exitFrame() {
		if (this.stack.size() > 0) {
			this.stack.remove(this.stack.size() - 1);
			this.currentFrame = this.stack.size() > 0 ? this.stack
					.get(this.stack.size() - 1) : null;
		}
	}

	public boolean isIdentifierInCurrentFrame(String identifier) {
		return this.currentFrame.isContainKey(identifier);
	}

	public T addressInCurrentFrame(String identifier) {
		return this.currentFrame.get(identifier);
	}

	public T addressInStack(String identifier) {
		int n = this.stack.size() - 1;
		while (n >= 0) {
			L3Scope<T> sp = this.stack.get(n);
			n--;
			if (sp.isContainKey(identifier)) {
				return sp.get(identifier);
			}
		}
		return null;
	}

	public void updateValue(T v) throws IdentifierNotExistException {
		T old = addressInStack(v.identifier);
		if (old == null) {
			throw new IdentifierNotExistException(v.identifier);
		}
		old.updateValue(v);
	}

	public void createNewIdentitier(T v) throws IdentifierAlreadyExistException {
		if (isIdentifierInCurrentFrame(v.identifier)) {
			throw new IdentifierAlreadyExistException(v.identifier);
		}
		this.currentFrame.refreshPut(v);
	}

	public static void main(String[] args) throws IdentifierAlreadyExistException {
		L3ScopeStack<Unit> s = new L3ScopeStack<Unit>();
		System.out.println(s.currentFrame);
		System.out.println(s.currentFrame);
		s.createNewIdentitier(new Unit("a"));
		s.createNewIdentitier(new Unit("a"));
		s.exitFrame();
		System.out.println(s.currentFrame);
	}

}
