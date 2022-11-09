package com.flw_import.api.model.as400.Keys;
import java.io.Serializable;



public class FlwPlanKey implements Serializable {

    private String codcia;
		
	//@Column( columnDefinition="decimal(8,0)" )
	private Integer ponum;
	
	//@Column( columnDefinition="char(2)" )
	private String potype;
		
	//@Column( columnDefinition="char(15)" )
	private String invoice;
	
	//@Column( columnDefinition="decimal(4,0)" )
	private Integer anoinvc;
	
	//@Column( columnDefinition="char(1)" )
	private String tpplan;
	
	//@Column( columnDefinition="decimal(3,0)" )
	private Integer plnseq;


    public FlwPlanKey(){

    }

    public FlwPlanKey(String codcia, Integer ponum, String potype, String invoice, Integer anoinvc, String tpplan, Integer plnseq) {        
        this.codcia = codcia;
        this.ponum = ponum;
        this.potype = potype;
        this.invoice = invoice;
        this.anoinvc = anoinvc;
        this.tpplan = tpplan;
        this.plnseq = plnseq;
    }

    // equals() and hashCode()
}