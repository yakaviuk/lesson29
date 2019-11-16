package entity;
import javax.persistence.*;

@Entity
@Table(name = "job_experience")
public class JobExperience {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_je")
    private long idJe;

    @Column(name = "id_user")
    private long idUser;
    private String company;
    private String position;

    @ManyToOne(optional=false)
    @JoinColumn(name = "id_user",referencedColumnName="id_user",insertable=false, updatable=false)
    User user; //may be "chemodan"

    public JobExperience(long idUser, String company, String position) {
        this.idUser = idUser;
        this.company = company;
        this.position = position;
    }

    public JobExperience(long idJe, long idUser, String company, String position) {
        this.idJe = idJe;
        this.idUser = idUser;
        this.company = company;
        this.position = position;
    }

    public JobExperience() {
    }

    public long getIdJe() {
        return idJe;
    }

    public void setIdJe(long idJe) {
        this.idJe = idJe;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobExperience that = (JobExperience) o;

        if (idJe != that.idJe) return false;
        if (idUser != that.idUser) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        return position != null ? position.equals(that.position) : that.position == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (idJe ^ (idJe >>> 32));
        result = 31 * result + (int) (idUser ^ (idUser >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
