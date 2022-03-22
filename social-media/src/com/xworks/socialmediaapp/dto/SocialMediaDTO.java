package com.xworks.socialmediaapp.dto;

public class SocialMediaDTO {
	private int socialMediaId;
	private String appName;
	private String founder;
	private int size;
	
	public SocialMediaDTO() {
		System.out.println(this.getClass().getSimpleName()+" objrct is created");
	}
	public int getSocialMediaId( ) {
		return socialMediaId;
	}

	public void setSocialMediaId(int socialMediaId) {
		this.socialMediaId=socialMediaId;
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	@Override
	public String toString() {
		return "SocialMediaId- "+socialMediaId+"\tSocialMediaName- "+appName+"\tfounder- "+founder+"\tSize- "+size;
	}
	@Override
	public int hashCode() {
		return this.socialMediaId;
	}
	@Override
	public boolean equals(Object obj) {
		SocialMediaDTO dto= (SocialMediaDTO)obj;
		if (this.hashCode() == dto.hashCode())
		return true;
		if (this.founder == dto.founder)
			return true;
		
		return false;
		
		
	}
	

}
