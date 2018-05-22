package za.org.dha.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.org.dha.entities.Address;
import za.org.dha.entities.Cell;
import za.org.dha.entities.Email;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2018-05-22T09:46:36")
@StaticMetamodel(Citizen.class)
public class Citizen_ { 

    public static volatile SingularAttribute<Citizen, String> firstName;
    public static volatile SingularAttribute<Citizen, String> lastName;
    public static volatile SingularAttribute<Citizen, String> historyDate;
    public static volatile SingularAttribute<Citizen, String> password;
    public static volatile ListAttribute<Citizen, Cell> cellphoneNo;
    public static volatile SingularAttribute<Citizen, Address> physicalAddress;
    public static volatile ListAttribute<Citizen, Email> citizenEmails;
    public static volatile SingularAttribute<Citizen, Long> id;
    public static volatile SingularAttribute<Citizen, String> username;

}