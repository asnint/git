package Eight;

public class ChongxieEC implements Comparable {
	int id;
	int age;
	String name;

	public ChongxieEC(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ChongxieEC [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Object o) {
		ChongxieEC p;
		if (o instanceof ChongxieEC) {
			p = (ChongxieEC) o;
		} else {
			return -1;// -1����������ȱ���ҪС
		}
		int diff = this.id - p.id;
		if (diff != 0) {
			diff = diff / Math.abs(diff);
			// Ҫô1Ҫô-1
		}
		return diff;
	}

}
