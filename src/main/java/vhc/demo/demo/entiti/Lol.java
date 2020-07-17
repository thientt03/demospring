package vhc.demo.demo.entiti;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Lol {
    private long nonameId;
    private String noname;
    private long dame;
    private long different;

    @Id
    @Column(name = "NONAME_ID", nullable = false, precision = 0)
    public long getNonameId() {
        return nonameId;
    }

    public void setNonameId(long nonameId) {
        this.nonameId = nonameId;
    }

    @Basic
    @Column(name = "NONAME", nullable = false, length = 20)
    public String getNoname() {
        return noname;
    }

    public void setNoname(String noname) {
        this.noname = noname;
    }

    @Basic
    @Column(name = "DAME", nullable = false, precision = 0)
    public long getDame() {
        return dame;
    }

    public void setDame(long dame) {
        this.dame = dame;
    }

    @Basic
    @Column(name = "DIFFERENT", nullable = false, precision = 0)
    public long getDifferent() {
        return different;
    }

    public void setDifferent(long different) {
        this.different = different;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lol lol = (Lol) o;
        return nonameId == lol.nonameId &&
                dame == lol.dame &&
                different == lol.different &&
                Objects.equals(noname, lol.noname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nonameId, noname, dame, different);
    }
}
