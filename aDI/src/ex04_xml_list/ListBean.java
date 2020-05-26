package ex04_xml_list;

import java.util.List;

public class ListBean {
	private List<Integer> intList;
	private List<MemberBean> memberList;
	
	
	public ListBean() {}


	public ListBean(List<Integer> intList, List<MemberBean> memberList) {
		super();
		this.intList = intList;
		this.memberList = memberList;
	}
	
	
	// getter setter
	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public List<MemberBean> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<MemberBean> memberList) {
		this.memberList = memberList;
	}
	
}
