package com.flw_import.api.dto.as400;
import static com.flw_import.api.utils.Auxiliar.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
//import io.swagger.annotations.ApiParam;



@ApiModel
public class FlwPlanDTO {
    
	
    //@ApiParam(name="firstName", type="String", value="Cod cia", example="05001", required=true)
    //@ApiModelProperty(name= "name", dataType= "List", example = "[\"str1\", \"str2\", \"str3\"]")
    @ApiModelProperty(value="Código Companhia", example="05001") 
    private String codcia;
	
	@ApiModelProperty(value="PO Number", example="90000123") 
	private Integer ponum;
	
	@ApiModelProperty(value="PO Typte", example="X3")	
	private String potype;
		
	@ApiModelProperty(value="Invoice Cod.", example="HDA0014892690") 	
	private String invoice;
	
	@ApiModelProperty(value="Invoice Year", example="2022") 	
	private Integer anoinvc;
	
	@ApiModelProperty(value="Plann type", example="P") 	
	private String tpplan;
	
	@ApiModelProperty(value="Activity seq.", example="5") 	
	private Integer plnseq;

	@ApiModelProperty(value="Order date", example="20220619") 	
	private String dtemiss;

	@ApiModelProperty(value="Siscomex Country", example="479") 	
	private String origem;	
	
	@ApiModelProperty(value="Checkpoint cod.", example="CP_2") 	
	private String ckpcod; 	
	
	@ApiModelProperty(value="Checkpoint level", example="1") 	
	private Integer ckplevel; 
	
	@ApiModelProperty(value="Activity", example="DI registration") 	
	private String plndo;	
	
	@ApiModelProperty(value="SLA days", example="7") 	
	private Integer sla;
	
	@ApiModelProperty(value="Acummulated SLA", example="21") 	
	private Integer slaacum;
	
	@ApiModelProperty(value="Predec. activity", example="4") 	
	private Integer predec;	
	
	@ApiModelProperty(value="Plan register date", example="20221110") 
	private String plndt;


    public String getCodcia() 	{	return codcia;	}
	//public void setCodcia(String codcia) {		this.codcia = codcia;	}

	public Integer getPonum() 	{	return ponum;	}
	//public void setPonum(Integer ponum) {		this.ponum = ponum;	}

	public String getPotype() 	{	return potype;	}
	//public void setPotype(String potype) {		this.potype = potype;	}

	public String getInvoice() 	{	return  trimNull(invoice);	}
	//public void setInvoice(String invoice) {		this.invoice = invoice;	}

	public Integer getAnoinvc()	{	return anoinvc;	}
	//public void setAnoinvc(String anoinvc) {		this.anoinvc = anoinvc;	}

	public String getTpplan() 	{	return tpplan;	}
	//public void setTpplan(String tpplan) {		this.tpplan = tpplan;	}

	public Integer getPlnseq() 	{	return plnseq;	}
	//public void setPlnseq(Integer plnseq) {		this.plnseq = plnseq;	}

	public String getDtemiss() 	{	return dtemiss;	}
	//public void setDtemiss(String dtemiss) {		this.dtemiss = dtemiss;	}

	public String getOrigem() 	{	return origem;	}
	//public void setOrigem(String origem) {		this.origem = origem;	}

	public String getCkpcod() 	{	return trimNull(ckpcod);	}
	//public void setCkpcod(String ckpcod) {		this.ckpcod = ckpcod;	}

	public Integer getCkplevel(){	return ckplevel;	}
	//public void setCkplevel(Integer ckplevel) {		this.ckplevel = ckplevel;	}

	public String getPlndo() 	{	return trimNull(plndo);	}
	//public void setPlndo(String plndo) {		this.plndo = plndo;	}

	public Integer getSla() 	{	return sla;	}
	//public void setSla(String sla) {		this.sla = sla;	}

	public Integer getSlaacum() {	return slaacum;	}
	//public void setSlaacum(String slaacum) {		this.slaacum = slaacum;	}
	
	public Integer getPredec()  {	return predec;	}
	//public void setPredec(String predec) {		this.predec = predec;	}

	public String getPlndt() 	{	return plndt;	}


}