package com.uog.project.model;

public class CourseBooks {
	
	    private long COURSEBOOK_ID;
	 
		private Course COURSE_ID;

		private String COURSEBOOK_NAME;
		
	    private String COURSEBOOK_CATAGORY;

	    private long COURSEBOOK_QUANTITY;

	    private long COURSEBOOK_PRICE;
	    
		private String ISACTIVE;

		private Long MODIFIED_BY;

		private String MODIFIED_WHEN;

		private String MODIFIED_WORKSTATION;

		public long getCOURSEBOOK_ID() {
			return COURSEBOOK_ID;
		}

		public void setCOURSEBOOK_ID(long cOURSEBOOK_ID) {
			COURSEBOOK_ID = cOURSEBOOK_ID;
		}

		

		public Course getCOURSE_ID() {
			return COURSE_ID;
		}

		public String getCOURSEBOOK_NAME() {
			return COURSEBOOK_NAME;
		}

		public void setCOURSEBOOK_NAME(String cOURSEBOOK_NAME) {
			COURSEBOOK_NAME = cOURSEBOOK_NAME;
		}

		public String getCOURSEBOOK_CATAGORY() {
			return COURSEBOOK_CATAGORY;
		}

		public void setCOURSEBOOK_CATAGORY(String cOURSEBOOK_CATAGORY) {
			COURSEBOOK_CATAGORY = cOURSEBOOK_CATAGORY;
		}

		public long getCOURSEBOOK_QUANTITY() {
			return COURSEBOOK_QUANTITY;
		}

		public void setCOURSEBOOK_QUANTITY(long cOURSEBOOK_QUANTITY) {
			COURSEBOOK_QUANTITY = cOURSEBOOK_QUANTITY;
		}

		public long getCOURSEBOOK_PRICE() {
			return COURSEBOOK_PRICE;
		}

		public void setCOURSEBOOK_PRICE(long cOURSEBOOK_PRICE) {
			COURSEBOOK_PRICE = cOURSEBOOK_PRICE;
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
			return (long)38;
		}
///
		public void setCOURSE_ID(Course findOne) {
			// TODO Auto-generated method stub
			
		}


		

}

