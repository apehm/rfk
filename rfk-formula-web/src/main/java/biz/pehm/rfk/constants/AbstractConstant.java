package biz.pehm.rfk.constants;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Properties and behavior shared by all constant.
 * Subclasses should be created by subject area (e.g. density of materials,
 * relative mass of materials).
 * @author Alexander Pehm <alexander at pehm.biz>
 */
@Entity
@Table(name="CONSTANT")
public class AbstractConstant implements Serializable{

	private static final long serialVersionUID = 1L;
	private BigDecimal constantValue;
    private String subject;
    private String description;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
        return subject;
    }

    public void getSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return constantValue;
    }

    public void setValue(BigDecimal value) {
        this.constantValue = value;
    }
}
