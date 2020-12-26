package dimikOJ;

import java.util.Scanner;

public class Problem61 {

	public static char[][] dimension;

	public static boolean validateLanding(int x, int y) {
		if (dimension[x - 1][y - 1] == ' ') {
			return true;
		} else if (dimension[x - 1][y - 1] == '*') {
			return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char facing = 'N';
		String line;

		int dx = input.nextInt();
		while (dx < 1 || dx > 60) {
			dx = input.nextInt();
		}

		int dy = input.nextInt();
		while (dy < 1 || dy > 60) {
			dy = input.nextInt();
		}
		input.nextLine();

		dimension = new char[dx][dy];

		for (int i = 0; i < dimension.length; i++) {
			line = input.nextLine();
			for (int j = 0; j < dimension[i].length; j++) {
				dimension[i][j] = line.charAt(j);
			}
		}

		int x = input.nextInt();
		while (x < 1 || x > dy) {
			System.out.println("Can't place here! Out of dimension. Enter x again: ");
			x = input.nextInt();
		}

		int y = input.nextInt();
		while (y < 1 || y > dx) {
			System.out.println("Can't place here! Out of dimension. Enter y again: ");
			y = input.nextInt();
		}

		boolean landing = validateLanding(x, y);

		while (landing == false) {
			System.out.println("Can't place here! It's a wall (*). Try again: ");
			x = input.nextInt();
			while (x < 1 || x > dy) {
				System.out.println("Can't place here! Out of dimension. Enter x again: ");
				x = input.nextInt();
			}

			y = input.nextInt();
			while (y < 1 || y > dx) {
				System.out.println("Can't place here! Out of dimension. Enter y again: ");
				y = input.nextInt();
			}

			landing = validateLanding(x, y);
		}
		input.nextLine();

		dimension[x - 1][y - 1] = 'B';
		System.out.printf("Initial position and facing: %d %d %c. B indicates position:\n", x, y, facing);

		for (int i = 0; i < dimension.length; i++) {
			for (int j = 0; j < dimension[i].length; j++) {
				System.out.printf("%c", dimension[i][j]);
			}
			System.out.printf("\n");
		}
		dimension[x - 1][y - 1] = ' ';

		char command;

		System.out
				.println("Enter just one command at one line. More than one command will not be counted! Now enter: ");

		while (true) {
			command = input.next().charAt(0);

			while (command != 'R' && command != 'L' && command != 'F' && command != 'Q') {
				System.out.println("Invalid command " + command + ". Try again: ");
				command = input.next().charAt(0);
			}

			if (command == 'Q') {
				System.out.println("Program terminated!");
				break;
			} else if (command == 'L') {
				if (facing == 'N') {
					facing = 'W';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'W') {
					facing = 'S';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'S') {
					facing = 'E';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'E') {
					facing = 'N';
					System.out.println("Now faing " + facing + ".");
				}
			} else if (command == 'R') {
				if (facing == 'N') {
					facing = 'E';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'E') {
					facing = 'S';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'S') {
					facing = 'W';
					System.out.println("Now faing " + facing + ".");
				} else if (facing == 'W') {
					facing = 'N';
					System.out.println("Now faing " + facing + ".");
				}
			} else if (command == 'F') {
				if (facing == 'N') {
					x--;
					if (x < 1) {
						System.out.println("Can't move further! Stuck on the border.");
						x++;
					} else if (dimension[x - 1][y - 1] == ' ') {
						System.out.println("Moved one step up.");
						dimension[x][y - 1] = '↑';

					} else if (dimension[x - 1][y - 1] == '*') {
						System.out.println("Can't move up. Stuck on the wall (*)!");
						dimension[x - 1][y - 1] = '*';
						x++;
					}
				} else if (facing == 'E') {
					y++;
					if (y > dy) {
						System.out.println("Can't move further! Stuck on the border.");
						y--;
					} else if (dimension[x - 1][y - 1] == ' ') {
						System.out.println("Moved one step right.");
						dimension[x - 1][y - 2] = '→';
					} else if (dimension[x - 1][y - 1] == '*') {
						System.out.println("Can't move right. Stuck on the wall (*)!");
						dimension[x - 1][y - 2] = '*';
						y--;
					}
				} else if (facing == 'S') {
					x++;
					if (x > dx) {
						System.out.println("Can't move further! Stuck on the border.");
						x--;
					} else if (dimension[x - 1][y - 1] == ' ') {
						System.out.println("Moved one step down.");
						dimension[x - 2][y - 1] = '↓';
					} else if (dimension[x - 1][y - 1] == '*') {
						System.out.println("Can't move right. Stuck on the wall (*)!");
						dimension[x - 1][y - 1] = '*';
						x--;
					}
				} else if (facing == 'W') {
					y--;
					if (y < 1) {
						System.out.println("Can't move further! Stuck on the border.");
						y++;
					} else if (dimension[x - 1][y - 1] == ' ') {
						System.out.println("Moved one step left.");
						dimension[x - 1][y] = '←';
					} else if (dimension[x - 1][y - 1] == '*') {
						System.out.println("Can't move left. Stuck on the wall (*)!");
						dimension[x - 1][y - 1] = '*';
						y++;
					}
				}
			}

		}
		input.close();

		System.out.printf("Final position and facing: %d %d %c. B indicates position:\n", x, y, facing);
		dimension[x - 1][y - 1] = 'B';
		for (int i = 0; i < dimension.length; i++) {
			for (int j = 0; j < dimension[i].length; j++) {
				System.out.printf("%c", dimension[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
