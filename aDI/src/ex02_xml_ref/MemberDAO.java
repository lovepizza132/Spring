package ex02_xml_ref;

public class MemberDAO {
	
	private MemberBean member;
	
	// (1) constructor 이용
	public MemberDAO(MemberBean member) {
		this.member = member;
	}
	
	// 기본 constructor(생성자)함수
	public MemberDAO() {}
	
	
	// (2) setter 이용
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	public void insert() {
		System.out.println("DB에" + member.getName()+"<"+
							member.getAge()+">"+
							member.getMessage()+"내용을 입력합니다.");
	}
}
