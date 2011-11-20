package biz.pehm.rfk.constants;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Properties and behavior shared by all constant.
 * Subclasses should be created by subjectArea area (e.g. density of materials,
 * relative mass of materials).
 * @author Alexander Pehm <alexander at pehm.biz>
 */
@XmlRootElement
@Entity
@Table(name="CONSTANT")
@NamedQuery(name = "findAllConstants", query = "SELECT c FROM Constant c")
public class Constant implements Serializable{

	private static final long serialVersionUID = 1L;
	private BigDecimal constantValue;
	@OneToOne
    private SubjectArea subjectArea;
    private String description;
    private String unit;
    
    public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SubjectArea getSubject() {
        return subjectArea;
    }

    public void getSubject(SubjectArea subjectArea) {
        this.subjectArea = subjectArea;
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
