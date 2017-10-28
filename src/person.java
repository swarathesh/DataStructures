public class person {
    private String Name;
    private String RollNo;

    public person(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", RollNo='" + RollNo + '\'' +
                '}';
    }

    public person() {
    }
}
