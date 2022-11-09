package com.flw_import.api.dto.as400;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import io.swagger.annotations.ApiParam;


@ApiModel
public class FlwPlanDTO {
    
	
    /*@ApiParam(
        //name =  "firstName",
        //type = "String",
        value = "Cod cia",
        example = "05001"
        //required = true
    )*/
    //@ApiModelProperty(name= "name", dataType= "List", example = "[\"str1\", \"str2\", \"str3\"]")
    @ApiModelProperty(value="Código Companhia", example="05001") 
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

	//@Column( columnDefinition="char(8)" )
	private String dtemiss;

	//@Column( columnDefinition="char(3)" )
	private String origem;	
	
	//@Column( columnDefinition="char(6)" )
	private String ckpcod; 	//c(6)
	
	//@Column( columnDefinition="decimal(2,0)" )
	private Integer ckplevel; //n(2)
	
	//@Column( columnDefinition="char(30)" )
	private String plndo;	//c(30)
	
	//@Column( columnDefinition="decimal(5,0)" )
	private Integer sla;	//n(5)
	
	//@Column( columnDefinition="decimal(5,0)" )
	private Integer slaacum;	//n(5)	
	
	//@Column( columnDefinition="decimal(3,0)" )
	private Integer predec;	//n(3)	
	
	//@Column( columnDefinition="char(8)" )
	private String plndt;	//c(8)	


    public String getCodcia() {		return codcia;	}
	//public void setCodcia(String codcia) {		this.codcia = codcia;	}

	public Integer getPonum() {		return ponum;	}
	//public void setPonum(Integer ponum) {		this.ponum = ponum;	}

	public String getPotype() {		return potype;	}
	//public void setPotype(String potype) {		this.potype = potype;	}

	public String getInvoice() {		return invoice.trim();	}
	//public void setInvoice(String invoice) {		this.invoice = invoice;	}

	public Integer getAnoinvc() {		return anoinvc;	}
	//public void setAnoinvc(String anoinvc) {		this.anoinvc = anoinvc;	}

	public String getTpplan() {		return tpplan;	}
	//public void setTpplan(String tpplan) {		this.tpplan = tpplan;	}

	public Integer getPlnseq() {		return plnseq;	}
	//public void setPlnseq(Integer plnseq) {		this.plnseq = plnseq;	}

	public String getDtemiss() {		return dtemiss;	}
	//public void setDtemiss(String dtemiss) {		this.dtemiss = dtemiss;	}

	public String getOrigem() {		return origem;	}
	//public void setOrigem(String origem) {		this.origem = origem;	}

	public String getCkpcod() {		return ckpcod.trim();	}
	//public void setCkpcod(String ckpcod) {		this.ckpcod = ckpcod;	}

	public Integer getCkplevel() {		return ckplevel;	}
	//public void setCkplevel(Integer ckplevel) {		this.ckplevel = ckplevel;	}

	public String getPlndo() {		return plndo.trim();	}
	//public void setPlndo(String plndo) {		this.plndo = plndo;	}

	public Integer getSla() {		return sla;	}
	//public void setSla(String sla) {		this.sla = sla;	}

	public Integer getSlaacum() {		return slaacum;	}
	//public void setSlaacum(String slaacum) {		this.slaacum = slaacum;	}
	
	public Integer getPredec() {		return predec;	}
	//public void setPredec(String predec) {		this.predec = predec;	}

	public String getPlndt() {		return plndt;	}


}