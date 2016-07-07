package model;

public class reportEagleHib {
	private int id;
	private String stateCounties;

	public reportEagleHib() {
	}

	public reportEagleHib(String scount) {
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
