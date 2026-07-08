package records;

public record Person(String name, int age) {

    public Person{
        if(name.isBlank()){
            throw new IllegalArgumentException("name is blank");
        }
        if(age<0){
            throw new IllegalArgumentException("age is negative");
        }


    }

    public double edadPorDos(){
        return age * 2 ;
    }
}
