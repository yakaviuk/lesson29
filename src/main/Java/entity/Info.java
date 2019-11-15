package entity;

import javax.persistence.*;

@Entity
@Table(name = "info")
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_info")
    private long idInfo;

    @Column(name = "id_user")
    private long idUser;
    private String name;
    private String lastname;
    private String email;
    private String gender;
    private int age;


    @OneToOne
    @JoinColumn(name = "id_user")
    public User user;

    public Info() {
    }

    public Info(long idInfo, long idUser, String name, String lastname, String email, String gender, int age) {
        this.idInfo = idInfo;
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public Info(long idUser, String name, String lastname, String email, String gender, int age) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public long getId() {
        return idInfo;
    }

    public void setId(long id) {
        this.idInfo = idInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Info info = (Info) o;

        if (idInfo != info.idInfo) return false;
        if (idUser != info.idUser) return false;
        if (age != info.age) return false;
        if (name != null ? !name.equals(info.name) : info.name != null) return false;
        if (lastname != null ? !lastname.equals(info.lastname) : info.lastname != null) return false;
        if (email != null ? !email.equals(info.email) : info.email != null) return false;
        if (gender != null ? !gender.equals(info.gender) : info.gender != null) return false;
        return user != null ? user.equals(info.user) : info.user == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (idInfo ^ (idInfo >>> 32));
        result = 31 * result + (int) (idUser ^ (idUser >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
