package Domain;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Volunteer {
    @Id
    @GeneratedValue
    @Column(name = "VOLUNTEER_ID")
    private Long id;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String userId;
    private String userPw;
    @OneToMany(mappedBy = "volunteer")
    private List<Booking> Bookings = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public List<Booking> getBookings() {
        return Bookings;
    }

    public void setBookings(List<Booking> bookings) {
        Bookings = bookings;
    }
}
