package com.uog.project;

public class Room{

    private long ROOM_ID;

	private Building BUILDING_ID;
	
    private String ROOM_CODE;

    private String ROOM_NAME;

    private long ROOM_FLOOR;

    private long ROOM_CAPACITY;

	private String ISACTIVE;

	private Long MODIFIED_BY;

	private String MODIFIED_WHEN;

	private String MODIFIED_WORKSTATION;

	public long getROOM_ID() {
		return ROOM_ID;
	}

	public void setROOM_ID(long rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}

	public Building getBUILDING_ID() {
		return BUILDING_ID;
	}

	public void setBUILDING_ID(Building bUILDING_ID) {
		BUILDING_ID = bUILDING_ID;
	}

	public String getROOM_CODE() {
		return ROOM_CODE;
	}

	public void setROOM_CODE(String rOOM_CODE) {
		ROOM_CODE = rOOM_CODE;
	}

	public String getROOM_NAME() {
		return ROOM_NAME;
	}

	public void setROOM_NAME(String rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}

	public long getROOM_FLOOR() {
		return ROOM_FLOOR;
	}

	public void setROOM_FLOOR(long rOOM_FLOOR) {
		ROOM_FLOOR = rOOM_FLOOR;
	}

	public long getROOM_CAPACITY() {
		return ROOM_CAPACITY;
	}

	public void setROOM_CAPACITY(long rOOM_CAPACITY) {
		ROOM_CAPACITY = rOOM_CAPACITY;
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
		return (long) 17;
	}

}