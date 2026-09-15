package wrong;

public class Customer {
    private String id;
    private String lastName;
    private String foreName;
    
    public Customer(String id, String lastName, String foreName) {
        this.id = id;
        this.lastName = lastName;
        this.foreName = foreName;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }  
    
    public String getForeName() {
        return this.foreName;
    }
    
    public void setForeName(String foreName) {
        this.foreName = foreName;
    }
        
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}