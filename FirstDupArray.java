package peparationQuestions;

public class FirstDupArray {
	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 6, 1, 4, 2, 3 };
		int al = a.length;
		int fd = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && al > j) {
					fd = a[i];
					al = j;
				}
			}

		}
		if (fd < al) {
			System.out.println(fd);
		} else {
			System.out.println("Non Dup");
		}
	}

}
