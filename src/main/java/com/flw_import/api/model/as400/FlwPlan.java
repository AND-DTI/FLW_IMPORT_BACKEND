package com.flw_import.api.model.as400;
import static com.flw_import.api.utils.Auxiliar.*;
import com.flw_import.api.model.as400.Keys.FlwPlanKey;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Immutable;
//import io.swagger.annotations.ApiModelProperty;



@Entity
@Immutable
@Table(name = "FlwPlan")
@IdClass(FlwPlanKey.class)
public class FlwPlan  implements Serializable{
/*
CODCIA *	C(5)	Código Cia.
PONUM *		N(8)	Número PO
POTYPE *	C(2)	Tipo PO
INVOICE *	C(15)	Número Invoice
ANOINVC *	N(4)	Ano invoice
TPPLAN *	C(1)	Plan, Real [P, R]
PLNSEQ *	N(3)	Activity sequence
DTEMISS		C(8)	Emissão PO
ORIGEM		C(3)	País fornecedor
CKPCOD +	C(6)	Código checkpoint
CKPLEVEL -	N(2)	Checkpoint level
PLNDO		C(30)	Activity description
SLA			N(5)	Quantidade Dias
SLAACUM		N(5)	Qtde. dias acumulado
PREDEC		N(3)	Sequência predecessora
PLNDT		C(8)	Activity schedule	
PLNAUDSYS	C(40)	Auditoria sistema
PLNAUDUSR	C(10)	Auditoria usuário
PLNAUDHST	C(10)	Auditoria máquina
PLNAUDDT	C(8)	Auditoria data
PLNAUDHR	C(8)	Auditoria hora
FLEX1FLW	N(10)	Flex Field 1
FLEX2FLW	N(15,5)	Flex Field 2
FLEX3FLW	C(8)	Flex Field 3
FLEX4FLW	C(40)	Flex Field 4
FLEX5FLW	C(1000)	Flex Field 5
*/

	@Id
	@Column( columnDefinition="char(5)" )
	//@ApiModelProperty(value = "Cógico Companhia [05001, 10001, ...]") didint show description
	private String codcia;
	
	@Id
	@Column( columnDefinition="decimal(8,0)" )
	private Integer ponum;

	@Id
	@Column( columnDefinition="char(2)" )
	private String potype;
	
	@Id
	@Column( columnDefinition="char(15)" )
	private String invoice;

	@Id
	@Column( columnDefinition="decimal(4,0)" )
	private Integer anoinvc;

	@Id
	@Column( columnDefinition="char(1)" )
	private String tpplan;

	@Id
	@Column( columnDefinition="decimal(3,0)" )
	private Integer plnseq;

	@Column( columnDefinition="char(8)" )
	private String dtemiss;

	@Column( columnDefinition="char(3)" )
	private String origem;	
	
	@Column( columnDefinition="char(6)" )
	private String ckpcod; 	//c(6)
	
	@Column( columnDefinition="decimal(2,0)" )
	private Integer ckplevel; //n(2)
	
	@Column( columnDefinition="char(30)" )
	private String plndo;	//c(30)
	
	@Column( columnDefinition="decimal(5,0)" )
	private Integer sla;	//n(5)
	
	@Column( columnDefinition="decimal(5,0)" )
	private Integer slaacum;	//n(5)	
	
	@Column( columnDefinition="decimal(3,0)" )
	private Integer predec;	//n(3)	
	
	@Column( columnDefinition="char(8)" )
	private String plndt;	//c(8)	

	//@Size(max=40) **import spring validation on pom
	@Column( columnDefinition="char(40)")
	private String plnaudsys;	//c(40)

	@Column( columnDefinition="char(10)" )
	private String plnaudusr;	//c(10)	

	@Column( columnDefinition="char(00)" )
	private String plnaudhst;	//c(10)	

	@Column( columnDefinition="char(8)" )
	private String plnauddt;	//c(8)	

	@Column( columnDefinition="char(8)" )
	private String plnaudhr;	//c(8)	
	
	@Column( columnDefinition="decimal(10,0)" )
	private String flex1flw;	//n(10)	

	@Column( columnDefinition="decimal(15,5)" )
	private Float flex2flw;	//n(15,5)
	
	@Column( columnDefinition="char(8)" )
	private String flex3flw;	//c(8)

	@Column( columnDefinition="char(40)" )
	private String flex4flw;	//c(40)
	
	@Column( columnDefinition="char(1000)" )
	private String flex5flw;	//c(1000)	
	
	
	public FlwPlan() {
		
	}

	public FlwPlan(String codcia, Integer ponum, String potype, String invoice, Integer anoinvc, String tpplan, Integer plnseq, 
				   String dtemiss, String origem, String ckpcod, Integer ckplevel, String plndo, Integer sla, Integer slaacum, Integer predec) {
		this.codcia = codcia;
		this.ponum = ponum;
		this.potype = potype;
		this.invoice = invoice;
		this.anoinvc = anoinvc;
		this.tpplan = tpplan;
		this.plnseq = plnseq;
		this.dtemiss = dtemiss;
		this.origem = origem;
		this.ckpcod = ckpcod;
		this.ckplevel = ckplevel;
		this.plndo = plndo;
		this.sla = sla;
		this.slaacum = slaacum;
		this.predec = predec;
		this.plndt = "20221101";
		this.plnaudsys = "teste.jar";
		this.plnaudusr = "ADM";
		this.plnaudhst = "DEV";
		this.plnauddt = "20221111";
		this.plnaudhr = "07:00:49";
		//this.flex1flw = null;
		//this.flex2flw = null;
		//this.flex3flw = flex3flw;
		//this.flex4flw = flex4flw;
		//this.flex5flw = flex5flw;
	}

	public String getCodcia() {		return codcia;	}
	//public void setCodcia(String codcia) {		this.codcia = codcia;	}

	public Integer getPonum() {		return ponum;	}
	//public void setPonum(Integer ponum) {		this.ponum = ponum;	}

	public String getPotype() {		return potype;	}
	//public void setPotype(String potype) {		this.potype = potype;	}

	public String getInvoice() {		return trimNull(invoice);	}
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

	public String getCkpcod() {		return trimNull(ckpcod);	}
	//public void setCkpcod(String ckpcod) {		this.ckpcod = ckpcod;	}

	public Integer getCkplevel() {		return ckplevel;	}
	//public void setCkplevel(Integer ckplevel) {		this.ckplevel = ckplevel;	}

	public String getPlndo() {		return trimNull(plndo);	}
	//public void setPlndo(String plndo) {		this.plndo = plndo;	}

	public Integer getSla() {		return sla;	}
	//public void setSla(String sla) {		this.sla = sla;	}

	public Integer getSlaacum() {		return slaacum;	}
	//public void setSlaacum(String slaacum) {		this.slaacum = slaacum;	}
	
	public Integer getPredec() {		return predec;	}
	//public void setPredec(String predec) {		this.predec = predec;	}

	public String getPlndt() {		return plndt;	}
	//public void setPlndt(String plndt) {		this.plndt = plndt;	}

	public String getPlnaudsys() {		return trimNull(plnaudsys);	}
	//public void setPlnaudsys(String plnaudsys) {		this.plnaudsys = plnaudsys;	}

	public String getPlnaudusr() {		return plnaudusr;	}
	//public void setPlnaudusr(String plnaudusr) {		this.plnaudusr = plnaudusr;	}

	public String getPlnaudhst() {		return plnaudhst;	}
	//public void setPlnaudhst(String plnaudhst) {		this.plnaudhst = plnaudhst;	}

	public String getPlnauddt() {		return plnauddt;	}
	//public void setPlnauddt(String plnauddt) {		this.plnauddt = plnauddt;	}

	public String getPlnaudhr() {		return plnaudhr;	}
	//public void setPlnaudhr(String plnaudhr) {		this.plnaudhr = plnaudhr;	}

	public String getFlex1flw() {		return flex1flw;	}
	//public void setFlex1flw(String flex1flw) {		this.flex1flw = flex1flw;	}

	public Float getFlex2flw() {		return flex2flw;	}
	//public void setFlex2flw(Float flex2flw) {		this.flex2flw = flex2flw;	}

	public String getFlex3flw() {		return flex3flw;	}
	//public void setFlex3flw(String flex3flw) {		this.flex3flw = flex3flw;	}

	public String getFlex4flw() {		return flex4flw;	}
	//public void setFlex4flw(String flex4flw) {		this.flex4flw = flex4flw;	}

	public String getFlex5flw() {		return flex5flw;	}
	//public void setFlex5flw(String flex5flw) {		this.flex5flw = flex5flw;	}




	/*public String FlwPlanStr() {		
		return this.codcia +", "+
		       this.ponum;
	}*/	

	/*public FlwPlan(String codcia, Integer ponum) {
		super();
		this.codcia = codcia;
		this.ponum = ponum;
	}*/





}






