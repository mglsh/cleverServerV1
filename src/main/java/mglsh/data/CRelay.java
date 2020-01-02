package mglsh.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "crelaies")
public class CRelay {
    @Id
    @GeneratedValue
    private Integer cRelayId;
    @NotBlank
    private String cRelayName;
    @NotBlank
    private String cRelayParameter;

    public CRelay() {
        super();
    }

    public CRelay(Integer CRelayId, @NotBlank String CRelayName, @NotBlank String CRelayParameter) {
        super();
        this.cRelayId = CRelayId;
        this.cRelayName = CRelayName;
        this.cRelayParameter = CRelayParameter;
    }

    public Integer getcRelayId() {
        return cRelayId;
    }

    public void setcRelayId(Integer cRelayId) {
        this.cRelayId = cRelayId;
    }

    public String getcRelayName() {
        return cRelayName;
    }

    public void setcRelayName(String cRelayName) {
        this.cRelayName = cRelayName;
    }

    public String getcRelayParameter() {
        return cRelayParameter;
    }

    public void setcRelayParameter(String cRelayParameter) {
        this.cRelayParameter = cRelayParameter;
    }
}
