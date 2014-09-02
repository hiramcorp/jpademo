package mx.com.softtek.academia.jpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="EMPLOYEES")
public class Employee{

    @Id
    @Column(name="EMPLOYEE_ID")
    private Long id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email")
    private String email;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID")
    private Job job;
    
    @Column(name = "hire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;
    
    public Long getId (){
        return this.id;
    }
    
    public void setId (Long id){
        this.id = id;
    }
    
    public String getFirstName (){
        return this.firstName;
    }
    
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName (){
        return this.lastName;
    }
    
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail (){
        return this.email;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public Job getJob (){
        return this.job;
    }
    
    public void setJob (Job job){
        this.job = job;
    }
    
    public Date getHireDate (){
        return this.hireDate;
    }
    
    public void setHireDate (Date hireDate){
        this.hireDate = hireDate;
    }
}