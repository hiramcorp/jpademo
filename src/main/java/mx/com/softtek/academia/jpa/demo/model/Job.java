package mx.com.softtek.academia.jpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;

import java.math.BigDecimal;

@Entity
@Table(name="JOBS")
public class Job{

    @Id
    @Column(name="JOB_ID")
    private String id;
    
    @Column(name="JOB_TITLE")
    private String jobTitle;
    
    @Column(name="min_salary")
    private BigDecimal minSalary;
    
    @Column(name="max_salary")
    private BigDecimal maxSalary;
    
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public String getJobTitle(){
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    
    public BigDecimal getMinSalary(){
        return this.minSalary;
    }
    
    public void setMinSalary(BigDecimal minSalary){
        this.minSalary=minSalary;
    }
    
    public BigDecimal getMaxSalary(){
        return this.maxSalary;
    }
    
    public void setMaxSalary(BigDecimal maxSalary){
        this.maxSalary=maxSalary;
    }

}