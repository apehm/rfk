/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.pehm.rfk.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alex
 */
@Entity
@Table(name = "OBJEKT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Objekt.findAll", query = "SELECT o FROM Objekt o"),
    @NamedQuery(name = "Objekt.findById", query = "SELECT o FROM Objekt o WHERE o.id = :id")})
public class Objekt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public Objekt() {
    }

    public Objekt(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Objekt)) {
            return false;
        }
        Objekt other = (Objekt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biz.pehm.rfk.entity.Objekt[ id=" + id + " ]";
    }
    
}
