import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Register {
	private ArrayList<Person> reg;
	private int counter;
	private Dialog dialog;

	public Register(Dialog dialog) {
		reg = new ArrayList<Person>();
		counter = 0;
		this.dialog = dialog;
	}

	public void put(Person p) {
		int nbr = 0;
		while (nbr < counter && p.getName().compareToIgnoreCase(reg.get(nbr).getName()) > 0) {
			nbr++;
		}
		reg.add(nbr, p);
		counter++;
	}

	public void remove(String name) {
		for (int i = 0; i < counter; i++) {
			Person p = reg.get(i);
			if (p.getName().toLowerCase().equals(name.toLowerCase())) {
				reg.remove(i);
				counter--;
				i--;
			}
		}
	}

	public void printReg() {
		String all = "";
		for (int i = 0; i < counter; i++) {
			Person p = reg.get(i);
			all = all + p.toString() + "\n";
		}
		dialog.printString(all);
	}

	public void searchByName(String name) {
		String all = "";
		for (int i = 0; i < counter; i++) {
			if (reg.get(i).getName().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				Person p = reg.get(i);
				all = all + p.toString() + "\n";
			}
		}
		dialog.printString(all);
	}

	public void searchByDate(String date) {
		String all = "";
		for (int i = 0; i < counter; i++) {
			if (reg.get(i).getDate().equals(date)) {
				Person p = reg.get(i);
				all = all + p.toString() + "\n";
			}
		}
		dialog.printString(all);
	}

	public void sortByName() {
		int nbr = counter;
		for (int i = 0; i < counter; i++) {
			for (int j = nbr - 1; j > 0; j--) {
				if (reg.get(j).getName().compareToIgnoreCase(reg.get(j - 1).getName()) < 0) {
					Person temp = reg.get(j - 1);
					reg.remove(j - 1);
					reg.add(j, temp);
				}
			}
		}
	}

	public void sortByDate() {
		int nbr = counter;
		for (int i = 0; i < counter; i++) {
			for (int j = nbr - 1; j > 0; j--) {
				int x = Integer.parseInt(reg.get(j).getDate());
				int y = Integer.parseInt(reg.get(j - 1).getDate());
				if (x < y) {
					Person temp = reg.get(j - 1);
					reg.remove(j - 1);
					reg.add(j, temp);
				}
			}
		}
	}

	public void readFromFile() {
		String person;
		Scanner scan = null;
		try {
			scan = new Scanner(new File("Register.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Filen kunde inte öppnas");
			System.exit(1);
		}
		while (scan.hasNextLine()) {
			person = scan.nextLine();
			String[] namedate = person.split(" ");
			Person p = new Person(namedate[0], namedate[1]);
			this.put(p);
		}

	}

	public void writeToFile() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new File("Register.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Filen kunde inte öppnas");
			System.exit(1);
		}
		for (int i = 0; i < counter; i++) {
			out.println(reg.get(i).toString());
		}
		out.close();
	}

}
