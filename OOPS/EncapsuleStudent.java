public class EncapsuleStudent {

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public EncapsuleStudent(int id, int age, String name, int nos, String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void gfchatting() {
        System.out.println(name + " gf chatting");
    }

    public static void main(String args[]) {

        EncapsuleStudent A = new EncapsuleStudent(1, 12, "Yash", 3, "Sadie");

        System.out.println(A.getName());
        System.out.println(A.getAge());

        A.study();
        A.sleep();
        A.gfchatting();
    }
}
