package hyunjuuun.java;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal>";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year;
		while (true) {
			System.out.println("출력 연도를 입력해주세요. ");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("출력 달을 입력해주세요. ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12|| month<1) {
				continue;
			}
			cal.printCalendar(year, month);
		}

		System.out.println("Bye~");
		scanner.close();

	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
