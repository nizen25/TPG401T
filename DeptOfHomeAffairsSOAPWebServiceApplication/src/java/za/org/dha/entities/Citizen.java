/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Katlego
 */
@Entity
@XmlRootElement
public class Citizen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Citizen_ID_Number")
    private Long id;
    
    @Column(name="Citizen_First_Name")
    private String firstName;
    @Column(name="Citizen_Last_Name")
    private String lastName;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="email_fk")
    private List<Email> citizenEmails;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="cell_fk")
    private List<Cell> cellphoneNo;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="addr_fk")
    private Address physicalAddress;
    
    @Column(name="Citizen_UserName")
    private String username;
    @Column(name="Citizen_HistoryDate")
    private String historyDate;
    @Column(name="Citizen_Password")
    private String password;

    public Citizen() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Email> getCitizenEmails() {
        return citizenEmails;
    }

    public void setCitizenEmails(List<Email> citizenEmails) {
        this.citizenEmails = citizenEmails;
    }

    public List<Cell> getCellphoneNo() {
        return cellphoneNo;
    }

    public void setCellphoneNo(List<Cell> cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }

    public Address getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(Address physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(String historyDate) {
        this.historyDate = historyDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof Citizen)) {
            return false;
        }
        Citizen other = (Citizen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.org.dha.entities.Citizen[ id=" + id + " ]";
    }
    
}
