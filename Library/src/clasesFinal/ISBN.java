//ESTE ES UNA CLASE INMUTABLE
package clasesFinal;

import java.util.Objects;

public final class ISBN {
    //al momento de inicializar el objeto con el constructor, elimina ese error.
    private final String value;

    public ISBN(String value) {
        if(value==null ){
            throw new IllegalArgumentException("ISBN cannot be null");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
        if(value.length() != 13){
            throw new IllegalArgumentException("ISBN must contain 13 characters");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;

        }
        if(getClass()!= obj.getClass()){
            return false;
        }
        if(!(obj instanceof ISBN other)){
            return false;
        }
        return value.equals(other.value);

    }


    @Override
    public int hashCode() {
//        final int prime = 31;
//        int result =1;
//        result =prime * result +((value==null)?0:value.hashCode());
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
