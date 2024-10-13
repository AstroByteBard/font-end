package mfu.webpost.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Staff_id; 
    private String Staff_Username;
    private Long Staff_Password;
    
    public Long getStaff_id() {
        return Staff_id;
    }
    public void setStaff_id(Long staff_id) {
        Staff_id = staff_id;
    }
    public String getStaff_Username() {
        return Staff_Username;
    }
    public void setStaff_Username(String staff_Username) {
        Staff_Username = staff_Username;
    }
    public Long getStaff_Password() {
        return Staff_Password;
    }
    public void setStaff_Password(Long staff_Password) {
        Staff_Password = staff_Password;
    }

}
