package com.uog.project.model;

public class CourseModule {
	
	    private long COURSEMODULE_ID;

		private Course COURSE_ID;
		
		private Module MODULE_ID;

		private String ISACTIVE;

		private Long MODIFIED_BY;
		
		private String MODIFIED_WHEN;
		
		private String MODIFIED_WORKSTATION;

		public long getCOURSEMODULE_ID() {
			return COURSEMODULE_ID;
		}

		public void setCOURSEMODULE_ID(long cOURSEMODULE_ID) {
			COURSEMODULE_ID = cOURSEMODULE_ID;
		}

		public Course getCOURSE_ID() {
			return COURSE_ID;
		}

		public void setCOURSE_ID(Course cOURSE_ID) {
			COURSE_ID = cOURSE_ID;
		}

		public Module getMODULE_ID() {
			return MODULE_ID;
		}

		public void setMODULE_ID(Module mODULE_ID) {
			MODULE_ID = mODULE_ID;
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
			return (long) 8;
		}

}

