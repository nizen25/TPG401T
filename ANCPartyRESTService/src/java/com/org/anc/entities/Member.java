/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.anc.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sydney
 */
@Entity
@XmlRootElement
@Table(name = "Member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String name;
    private String surname;
    private String idNumber;
    private String isNominee;
    private String isDelegate; 
    private int nomitationCount;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "email_fk")
    private List<Email> emails;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cell_fk")
    private List<Cell> cells;  
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "addr_fk")
    private Address address;
    
    private String historyDate;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "login_fk")
    private Login login;
    public Member() {
    }

    public Long getId() {
        return id;
    }

    public String getIsNominee() {
        return isNominee;
    }

    public void setIsNominee(String isNominee) {
        this.isNominee = isNominee;
    }

    public int getNomitationCount() {
        return nomitationCount;
    }

    public void setNomitationCount(int nomitationCount) {
        this.nomitationCount = nomitationCount;
    }

    public String getIsDelegate() {
        return isDelegate;
    }

    public void setIsDelegate(String isDelegate) {
        this.isDelegate = isDelegate;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(String historyDate) {
        this.historyDate = historyDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.surname);
        hash = 41 * hash + Objects.hashCode(this.idNumber);
        hash = 41 * hash + Objects.hashCode(this.emails);
        hash = 41 * hash + Objects.hashCode(this.cells);
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.historyDate);
        hash = 41 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Member other = (Member) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.idNumber, other.idNumber)) {
            return false;
        }
        if (!Objects.equals(this.historyDate, other.historyDate)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.emails, other.emails)) {
            return false;
        }
        if (!Objects.equals(this.cells, other.cells)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", idNumber=" + idNumber + ", emails=" + emails + ", cells=" + cells + ", address=" + address + ", historyDate=" + historyDate + ", login=" + login + '}';
    }
    
}
