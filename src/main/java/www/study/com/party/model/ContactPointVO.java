package www.study.com.party.model;

public class ContactPointVO {
	
	private String typeName;			// 연락처 종류
	private String contactPoint;		// 연락정보
	
	@Override
	public String toString() {
		return "ContactPointVO [typeName=" + typeName + ", contactPoint=" + contactPoint + "]";
	}
	
}
