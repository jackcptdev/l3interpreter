package l3interpreter.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import l3interpreter.inter.Unit;

public class L3Scope<T extends Unit> {
	private final Map<String, T> mem = new HashMap<String, T>();

	public void refreshPut(T value) {
		this.mem.put(value.identifier, value);
	}

	public T get(String key) {
		return this.mem.get(key);
	}

	public boolean conditionPut(T value) {
		if (this.mem.containsKey(value.identifier)) {
			return false;
		}
		this.mem.put(value.identifier, value);
		return true;
	}

	public L3Scope<T> deepClone() {
		L3Scope<T> dest = new L3Scope<T>();
		for (Entry<String, T> entry : this.mem.entrySet()) {
			dest.refreshPut(entry.getValue());
		}
		return dest;
	}

	public boolean isContainKey(String key) {
		return this.mem.containsKey(key);
	}

	public void clearScope() {
		this.mem.clear();
	}

}
