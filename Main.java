public class Main {
    public static void main(String[] args) {
		Person p1 = new Person("Voro", "Elena");
        Person p2 = new Person("Belova", "Valeria");
        Person p3 = new Person("Ind", "Mark");
        Company c1 = new Company("Roga&Kopyta");
        c1.setBoss(p3);
        c1.addEmployee(p1);
        c1.addEmployee(p2);
    }
}