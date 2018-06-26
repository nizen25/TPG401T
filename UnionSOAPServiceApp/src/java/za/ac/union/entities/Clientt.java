/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.union.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author leseg
 */
@Entity
@XmlRootElement
public class Clientt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long idno;
    private String firstname;
    private String lastname;
    private String status;

    public Clientt() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    

    public Long getIdno() {
        return idno;
    }

    public void setIdno(Long idno) {
        this.idno = idno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idno != null ? idno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientt)) {
            return false;
        }
        Clientt other = (Clientt) object;
        if ((this.idno == null && other.idno != null) || (this.idno != null && !this.idno.equals(other.idno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.union.entities.Clientt[ id=" + idno + " ]";
    }
    
}
