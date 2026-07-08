package enums;

public enum UserRole {
    ADMIN,
    EMPLOYEE,
    CLIENTE;


    //metodo de intancia
    public boolean isAdmin() {
        return this == ADMIN;
    }


}
