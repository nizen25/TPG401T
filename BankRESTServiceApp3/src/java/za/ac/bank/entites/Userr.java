/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.bank.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author leseg
 */
@Entity
@Table(name = "USERR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userr.findAll", query = "SELECT u FROM Userr u"),
    @NamedQuery(name = "Userr.findById", query = "SELECT u FROM Userr u WHERE u.id = :id"),
    @NamedQuery(name = "Userr.findByName", query = "SELECT u FROM Userr u WHERE u.name = :name"),
    @NamedQuery(name = "Userr.findByStatus", query = "SELECT u FROM Userr u WHERE u.status = :status"),
    @NamedQuery(name = "Userr.findBySurname", query = "SELECT u FROM Userr u WHERE u.surname = :surname")})
public class Userr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 255)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 255)
    @Column(name = "SURNAME")
    private String surname;

    public Userr() {
    }

    public Userr(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        if (!(object instanceof Userr)) {
            return false;
        }
        Userr other = (Userr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.bank.entites.Userr[ id=" + id + " ]";
    }
    
}
