package Domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Center {
    @Id
    @GeneratedValue
    @Column(name = "CENTER_ID")
    private Long id;
    private String name;
    private String businessNumber;
    private String region;
    private String number;
    private String CenterId;
    private String CenterPw;

    @OneToMany(mappedBy = "center")
    private List<Board> boardList = new ArrayList<>();


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

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCenterId() {
        return CenterId;
    }

    public void setCenterId(String centerId) {
        CenterId = centerId;
    }

    public String getCenterPw() {
        return CenterPw;
    }

    public void setCenterPw(String centerPw) {
        CenterPw = centerPw;
    }

    public List<Board> getBoardList() {
        return boardList;
    }

    public void setBoardList(List<Board> boardList) {
        this.boardList = boardList;
    }
}
