package hellojpa;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    private Long id;
    private String username;

    public Member(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
