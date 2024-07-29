package idv.eric.entity;

import java.time.LocalDate;

public class Users {
    private Integer id;
    private String name;
    private String rocId;
    private LocalDate birthday;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRocId() {
        return rocId;
    }

    public void setRocId(String rocId) {
        this.rocId = rocId;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users() {
    }

    public Users(Integer id, String name, String rocId, LocalDate birthday, String email) {
        this.id = id;
        this.name = name;
        this.rocId = rocId;
        this.birthday = birthday;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rocId='" + rocId + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
