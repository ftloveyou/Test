package demo05;


public class Test09 {
    public static void main(String[] args) {
        Test t1 = new Test(1, "xxx");
        Long i = t1.getId();
        t1.setId(2);
        System.out.println(i);

    }
}

class Test{
    private Long id;
    private String name;

    Test() {

    }

    Test(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
