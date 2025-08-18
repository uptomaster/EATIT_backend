package com.bapseguen.app.admin;

public class AdminDTO extends MemberDTO {
	private String treeGrade;

	public AdminDTO() {
	}

	public String getTreeGrade() {
		return treeGrade;
	}

	public void setTreeGrade(String treeGrade) {
		this.treeGrade = treeGrade;
	}
}