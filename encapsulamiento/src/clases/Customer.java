package clases;

public class Customer {
    static private Integer id=0;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.id++;
//        this.name = name;
        updateName(name);
//        this.email = email;
        updateEmail(email);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        if(name ==null || name.isBlank()){
            throw new IllegalArgumentException("Invalid Name");

        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email ==null || email.isBlank()){
            throw new IllegalArgumentException("Invalid Name");

        }
        this.email = email;
    }
    public void updateEmail(String email) {
        this.email = email;
    }

    public void showInformation(){
        System.out.println("id %d\tname %s\tEmail %s".formatted(id,name,email));
    }
}
