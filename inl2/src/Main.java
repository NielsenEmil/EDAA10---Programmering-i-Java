
public class Main {

	public static void main(String[] args) {

		Dialog dialog = new Dialog();
		Register register = new Register(dialog);
		int command = 0;
		String name, date;
		while (true) {

			command = dialog.readInt(
					"MENY \n 1. L�gg till person \n 2. Ta bort person \n 3. Skriv ut alla namn och datum \n 4. Search by name \n 5. Search by date \n 6. Sort by name \n 7. Sort by date \n 8. Spara registret p� en fil \n 9. H�mta registret fr�n fil");
			switch (command) {
			case 1:
				name = dialog.readString("Ange namn: ");
				date = dialog.readString("Ange f�delsedatum (yyyymmdd): ");
				Person p = new Person(name, date);
				register.put(p);
				break;
			case 2:
				name = dialog.readString("Ange namn: ");
				register.remove(name);
				break;
			case 3:
				register.printReg();
				break;
			case 4:
				name = dialog.readString("Namnet du vill s�ka efter: ");
				register.searchByName(name);
				break;
			case 5:
				date = dialog.readString("F�delsedatumet du vill s�ka efter (yyyymmdd):");
				register.searchByDate(date);
				break;
			case 6:
				register.sortByName();
				break;
			case 7:
				register.sortByDate();
				break;
			case 8:
				register.writeToFile();
				break;
			case 9:
				register.readFromFile();
				break;
			case Integer.MAX_VALUE:
				System.exit(0);

			}

		}

	}

}
