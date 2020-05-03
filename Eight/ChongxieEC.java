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
			return -1;// -1代表传入参数比本身要小
		}
		int diff = this.id - p.id;
		if (diff != 0) {
			diff = diff / Math.abs(diff);
			// 要么1要么-1
		}
		return diff;
	}

}
