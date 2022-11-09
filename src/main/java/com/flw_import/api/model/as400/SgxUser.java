package com.flw_import.api.model.as400;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;




@Entity
@Immutable
@Table(name = "SGXUSER")
public class SgxUser {                 
    
    @Id
    @Column(name="usrid", columnDefinition="char(10)")
    String USRID;  

    @Column(name="usrname", columnDefinition="char(50)") //length=50
    String USRNAME;

    @Column(name="usrsts", columnDefinition="decimal(1,0)")
    Integer USRSTS;

    public String getUSRID() {
        return USRID;
    }
    public String getUSRNAME() {
        return USRNAME;
    }
    public Integer getUSRSTS() {
        return USRSTS;
    } 

    public SgxUser(){

    }

}