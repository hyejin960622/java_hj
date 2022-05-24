package day19;

import java.util.Scanner;

public class Ex02_BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardManager bm = new BoardManager(scan);
		bm.run();
	}

}
