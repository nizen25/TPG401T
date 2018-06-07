package com.org.bank.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-07T04:40:00")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> surname;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, String> clientCategory;
    public static volatile SingularAttribute<Customer, String> dateTimeStamp;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, Long> idNumber;
    public static volatile SingularAttribute<Customer, Double> loanAmount;
    public static volatile SingularAttribute<Customer, Double> overallInterestRate;
    public static volatile SingularAttribute<Customer, Integer> loanPeriod;

}