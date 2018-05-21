package com.org.anc.entities;

import com.org.anc.entities.Address;
import com.org.anc.entities.Cell;
import com.org.anc.entities.Email;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-21T16:36:09")
@StaticMetamodel(Member.class)
public class Member_ { 

    public static volatile ListAttribute<Member, Email> emails;
    public static volatile SingularAttribute<Member, String> historyDate;
    public static volatile SingularAttribute<Member, String> passwod;
    public static volatile ListAttribute<Member, Cell> cells;
    public static volatile SingularAttribute<Member, Address> address;
    public static volatile SingularAttribute<Member, String> surname;
    public static volatile SingularAttribute<Member, String> name;
    public static volatile SingularAttribute<Member, Long> id;
    public static volatile SingularAttribute<Member, String> username;

}