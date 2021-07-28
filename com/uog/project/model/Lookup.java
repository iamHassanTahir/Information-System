package com.uog.project.model;

public class Lookup {

	private long ID;

	private String ENTITYNAME;

	private String CODE;

	private String DESCRIPTION;

	private String ENTITY_STATUS;

	private String ISACTIVE;

	private Long MODIFIED_BY;

	private String MODIFIED_WHEN;

	private String MODIFIED_WORKSTATION;


	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getENTITYNAME() {
		return ENTITYNAME;
	}

	public void setENTITYNAME(String eNTITYNAME) {
		ENTITYNAME = eNTITYNAME;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getENTITY_STATUS() {
		return ENTITY_STATUS;
	}

	public void setENTITY_STATUS(String eNTITY_STATUS) {
		if (eNTITY_STATUS.compareTo("o") == 0)
			ENTITY_STATUS = eNTITY_STATUS.toUpperCase();
		else
			ENTITY_STATUS = eNTITY_STATUS;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}

    public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}

	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}

	public static long getDatabaseTableID() {
		return (long) 12;
	}

}
