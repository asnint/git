package Six;
import java.util.Random;

class line {
	private static Random random = new Random();
	float x1, y1, x2, y2;
	float A = 0, B = 0, C = 0;
	float k = 0;
	boolean kexist = true;

	public line() {
		x1 = random.nextInt(100);
		y1 = random.nextInt(100);
		x2 = random.nextInt(100);
		y2 = random.nextInt(100);
	}

	public line(float x1, float y1, float x2, float y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void calck() {
		if (x1 - x2 == 0) {
			this.kexist = false;
			System.out.printf("斜率k不存在！\n");
		}

		else {
			this.k = (y1 - y2) / (x1 - x2);
			if (this.k != 0)// 防止输出-0.00
				System.out.printf("斜率k:%.2f\n", this.k);
			else
				System.out.printf("斜率k:0\n");
		}
	}

	public void generalFormula() {
		System.out.printf("特殊的一般式为：");
		if (kexist) {
			if (this.k != 0) {
				this.A = this.k;// y-y1=k(x-x1) is kx-y+y1-kx1==0
				this.B = -1;
				this.C = -this.k * this.x1 + this.y1;
				System.out.printf("%.2fx%+.2fy%+.2f=0\n\n", this.A, this.B, this.C);
			}

			else {
				this.B = 1;
				this.C = -this.y1;
				System.out.printf("y=%.2f\n\n", this.y1);
			}
		}

		else {
			this.A = 1;
			this.C = -this.x1;
			System.out.printf("x=%.2f\n\n", this.x1);
		}
	}
}

public class test {
	public static void print(int flag) {
		switch (flag) {
		case 1:
			System.out.printf("两直线相交但不垂直，交点为：");
			break;
		case 2:
			System.out.printf("两直线相交且垂直，交点为：");
			break;
		case 3:
			System.out.printf("两直线平行，无交点！");
			break;
		case 4:
			System.out.printf("两直线重合，有无数交点！");
			break;
		case 5:
			System.out.printf("\n两直线与x轴围成的三角形面积为：");
			break;
		case 6:
			System.out.printf("\n两直线与x轴没有围成三角形！");
			break;
		}
	}

	public static void print(float x, float y) {
		System.out.printf("( %.2f , %.2f )\n", x, y);
	}

	public static void calcArea(line a, line b, float high) {
		float under1, under2;
		under1 = Math.abs(-a.C / a.A);
		under2 = Math.abs(-b.C / b.A);
		System.out.printf("%.2f", (under1 + under2) * high / 2);
	}

	public static void calcRelationship(line a, line b) {
		float x, y;
		if (!a.kexist && b.kexist) {
			x = a.x1;
			if (b.k != 0)
				y = b.A * x + b.C;
			else
				y = b.y1;
			if (b.k == 0) {
				print(2);
				print(x, y);
				print(6);
			} else {
				print(1);
				print(x, y);
				print(5);
				calcArea(a, b, y);
			}

		}

		else if (a.kexist && !b.kexist) {
			x = b.x1;
			if (a.k != 0)
				y = a.A * x + a.C;
			else
				y = a.y1;
			if (a.k == 0) {
				print(2);
				print(x, y);
				print(6);
			} else {
				print(1);
				print(x, y);
				print(5);
				calcArea(a, b, y);
			}
		}

		else if (a.k != 0 && b.k == 0) {
			y = b.y1;
			x = -(-y + a.C) / a.A;
			print(1);
			print(x, y);
			print(6);
			calcArea(a, b, y);
		}

		else if (a.k == 0 && b.k != 0) {
			y = a.y1;
			x = -(-y + b.C) / b.A;
			print(1);
			print(x, y);
			print(6);
			calcArea(a, b, y);
		}

		else if (a.k != b.k) {
			x = (-a.C - (-b.C)) / (a.A - b.A);
			y = a.A * x + a.C;
			if (a.k * b.k == -1)
				print(2);
			else
				print(1);
			print(x, y);
			print(5);
			calcArea(a, b, y);
		}

		else {
			if (a.A == b.A && a.B == b.B && a.C == b.C && a.kexist == b.kexist && a.k == b.k)
				print(4);
			else
				print(3);
			print(6);
		}
	}

	public static void main(String[] args) {
		line myLine[] = new line[2];
		myLine[0] = new line(4, 8, 4, 9);
		myLine[1] = new line(5, 8, 6, 8);
		for (int i = 0; i < 2; i++) {
			// myLine[i] = new line();
			myLine[i].calck();
			myLine[i].generalFormula();
		}

		calcRelationship(myLine[0], myLine[1]);
	}

}
