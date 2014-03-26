package dom.entity;

import com.namoo.ns1.common.Identifiable;

public class IdValue implements Identifiable{

	private static final long serialVersionUID = -3451103639698915547L;
	
	private String communityName;
	private int value;
	
	public IdValue(String communityName) {
		// 
		this.communityName = communityName;
	}
	public String getName() {
		return communityName;
	}
	public void setName(String communityName) {
		this.communityName = communityName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String getOId() {
		// 
		return communityName;
	}
	public void increase() {
		// 
		value++;
	}
	
	
}
