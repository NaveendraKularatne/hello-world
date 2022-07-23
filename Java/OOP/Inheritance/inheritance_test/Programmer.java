package inheritance_test;

class Programmer extends Employee{
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer javaProgrammer = new Programmer();

        System.out.println("Salary of the Programmer is : " + javaProgrammer.salary);
        System.out.println("Bonus of the Programmer is : " + javaProgrammer.bonus);
    }
}
