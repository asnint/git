package Eight;

public class SynchornizedTest implements Runnable {
	int num = 10; // ���õ�ǰ��Ʊ��

	public void run() {
		while (true) {// ��������ѭ��
			synchronized (this) {// ����ͬ�������
				if (num > 0) {// �жϵ�ǰƱ���Ƿ����0
					try {
						Thread.sleep(1000);// ʹ��ǰ�߳�����100����
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"----Ʊ��" +num--);// Ʊ����1
				}
			}
		}
	}

	public static void main(String[] args) {
		SynchornizedTest t = new SynchornizedTest();// ʵ���������
		Thread tA = new Thread(t,"�߳�һ");// �Ը������ֱ�ʵ����4���߳�
		Thread tB = new Thread(t,"�̶߳�");
		Thread tC = new Thread(t,"�߳���");
		Thread tD = new Thread(t,"�߳���");
		tA.start();// �ֱ������߳�
		tB.start();
		tC.start();
		tD.start();
	}
}
