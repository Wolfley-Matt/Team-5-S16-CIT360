package model;

public class findEagleHib {
	private int id;
	private String stateCounties;

	public findEagleHib() {
	}

	public findEagleHib(String scount) {
		this.stateCounties = scount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStateCounties() {
		return stateCounties;
	}

	public void setStateCounties(String state_counties) {
		this.stateCounties = state_counties;
	}

}
