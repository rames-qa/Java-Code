package Interview;

	import java.util.Scanner;
	public class AdvanceJava {
	  
		static final int MAX = 10;
	    static int[] ids = new int[MAX];
	    static String[] names = new String[MAX];
	    static int[][] marks = new int[MAX][5];
	    static int count = 0;
	    static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        int choice;

	        do {
	            System.out.println("STUDENT MANAGEMENT SYSTEM");
	            System.out.println("1. Add Students");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student by ID");
	            System.out.println("4. Find Topper");
	            System.out.println("5. Find Failed Students");
	            System.out.println("6. Sort by Total Marks (Descending)");
	            System.out.println("7. Sort by Name (Ascending)");
	            System.out.println("8. Update Student Marks");
	            System.out.println("9. Delete Student");
	            System.out.println("10. Exit");
	            System.out.println("11. Display Rank List");
	            System.out.print("Enter Choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudents();
	                    break;
	                case 2:
	                    displayStudents();
	                    break;
	                case 3:
	                    searchStudent();
	                    break;
	                case 4:
	                    findTopper();
	                    break;
	                case 5:
	                    findFailedStudents();
	                    break;
	                case 6:
	                    sortByTotalMarks();
	                    break;
	                case 7:
	                    sortByName();
	                    break;
	                case 8:
	                    updateStudent();
	                    break;
	                case 9:
	                    deleteStudent();
	                    break;
	                case 10:
	                    System.out.println("Exiting...");
	                    break;
	                case 11:
	                    displayRankList();
	                    break;
	                default:
	                    System.out.println("Invalid Choice!");
	            }

	        } while (choice != 10);
	    }

	    static void addStudents() {

	        int n;

	        System.out.print("How many students to add? ");
	        n = sc.nextInt();

	        if (count + n > MAX) {
	            System.out.println("Only " + (MAX - count) + " seats available.");
	            return;
	        }

	        for (int i = 0; i < n; i++) {

	            System.out.print("Enter Student ID: ");
	            ids[count] = sc.nextInt();

	            sc.nextLine();

	            System.out.print("Enter Student Name: ");
	            names[count] = sc.nextLine();

	            System.out.println("Enter Marks for 5 Subjects:");

	            for (int j = 0; j < 5; j++) {
	                System.out.print("Subject " + (j + 1) + ": ");
	                marks[count][j] = sc.nextInt();
	            }

	            count++;
	        }
	    }

	    static void displayStudents() {

	        if (count == 0) {
	            System.out.println("No Records Found.");
	            return;
	        }

	        System.out.println("\n----- STUDENT DETAILS -----");

	        for (int i = 0; i < count; i++) {

	            int total = getTotal(i);
	            double avg = total / 5.0;

	            System.out.println("\nID : " + ids[i]);
	            System.out.println("Name : " + names[i]);

	            System.out.print("Marks : ");
	            for (int j = 0; j < 5; j++) {
	                System.out.print(marks[i][j] + " ");
	            }

	            System.out.println("\nTotal : " + total);
	            System.out.println("Average : " + avg);
	            System.out.println("Grade : " + getGrade(avg));
	        }
	    }

	    static void searchStudent() {

	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();

	        for (int i = 0; i < count; i++) {

	            if (ids[i] == id) {

	                System.out.println("Student Found");
	                System.out.println("ID : " + ids[i]);
	                System.out.println("Name : " + names[i]);
	                System.out.println("Total : " + getTotal(i));

	                return;
	            }
	        }

	        System.out.println("Student Not Found.");
	    }

	    static void findTopper() {

	        if (count == 0) {
	            System.out.println("No Records.");
	            return;
	        }

	        int topper = 0;

	        for (int i = 1; i < count; i++) {

	            if (getTotal(i) > getTotal(topper)) {
	                topper = i;
	            }
	        }

	        System.out.println("\nTopper Details");
	        System.out.println("ID : " + ids[topper]);
	        System.out.println("Name : " + names[topper]);
	        System.out.println("Total : " + getTotal(topper));
	    }

	    static void findFailedStudents() {

	        boolean found = false;

	        System.out.println("\nFailed Students:");

	        for (int i = 0; i < count; i++) {

	            boolean fail = false;

	            for (int j = 0; j < 5; j++) {

	                if (marks[i][j] < 35) {
	                    fail = true;
	                    break;
	                }
	            }

	            if (fail) {
	                found = true;
	                System.out.println(ids[i] + " - " + names[i]);
	            }
	        }

	        if (!found) {
	            System.out.println("No Failed Students.");
	        }
	    }

	    static void sortByTotalMarks() {

	        for (int i = 0; i < count - 1; i++) {

	            for (int j = 0; j < count - i - 1; j++) {

	                if (getTotal(j) < getTotal(j + 1)) {
	                    swap(j, j + 1);
	                }
	            }
	        }

	        System.out.println("Sorted by Total Marks Descending.");
	    }

	    static void sortByName() {

	        for (int i = 0; i < count - 1; i++) {

	            for (int j = 0; j < count - i - 1; j++) {

	                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
	                    swap(j, j + 1);
	                }
	            }
	        }

	        System.out.println("Sorted by Name Ascending.");
	    }

	    static void updateStudent() {

	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();

	        for (int i = 0; i < count; i++) {

	            if (ids[i] == id) {

	                System.out.println("Enter New Marks:");

	                for (int j = 0; j < 5; j++) {

	                    System.out.print("Subject " + (j + 1) + ": ");
	                    marks[i][j] = sc.nextInt();
	                }

	                System.out.println("Marks Updated Successfully.");
	                return;
	            }
	        }

	        System.out.println("Student Not Found.");
	    }

	    static void deleteStudent() {

	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();

	        int pos = -1;

	        for (int i = 0; i < count; i++) {

	            if (ids[i] == id) {
	                pos = i;
	                break;
	            }
	        }

	        if (pos == -1) {
	            System.out.println("Student Not Found.");
	            return;
	        }

	        for (int i = pos; i < count - 1; i++) {

	            ids[i] = ids[i + 1];
	            names[i] = names[i + 1];

	            for (int j = 0; j < 5; j++) {
	                marks[i][j] = marks[i + 1][j];
	            }
	        }

	        count--;

	        System.out.println("Student Deleted Successfully.");
	    }

	    static void displayRankList() {

	        sortByTotalMarks();

	        System.out.println("\n===== RANK LIST =====");

	        for (int i = 0; i < count; i++) {

	            System.out.println(
	                    "Rank " + (i + 1) + " : " +
	                            names[i] + " - " +
	                            getTotal(i));
	        }
	    }

	    static int getTotal(int index) {

	        int total = 0;

	        for (int i = 0; i < 5; i++) {
	            total += marks[index][i];
	        }

	        return total;
	    }

	    static String getGrade(double avg) {

	        if (avg >= 90)
	            return "A";
	        else if (avg >= 80)
	            return "B";
	        else if (avg >= 70)
	            return "C";
	        else if (avg >= 60)
	            return "D";
	        else
	            return "F";
	    }

	    static void swap(int a, int b) {

	        int tempId = ids[a];
	        ids[a] = ids[b];
	        ids[b] = tempId;

	        String tempName = names[a];
	        names[a] = names[b];
	        names[b] = tempName;

	        int[] tempMarks = marks[a];
	        marks[a] = marks[b];
	        marks[b] = tempMarks;
	    }
	}

