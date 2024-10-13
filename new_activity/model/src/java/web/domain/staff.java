package java.web.domain;


@Entity
public class staff {
    
    @Id
    private Long Staff_ID;
    private String Staff_Username;
    private Integer Staff_Password;
    
    public Long getStaff_ID() {
        return Staff_ID;
    }
    public void setStaff_ID(Long staff_ID) {
        Staff_ID = staff_ID;
    }
    public String getStaff_Username() {
        return Staff_Username;
    }
    public void setStaff_Username(String staff_Username) {
        Staff_Username = staff_Username;
    }
    public Integer getStaff_Password() {
        return Staff_Password;
    }
    public void setStaff_Password(Integer staff_Password) {
        Staff_Password = staff_Password;
    }
    
}
