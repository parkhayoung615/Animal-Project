package domain;

import java.time.LocalDate;

public class GetterSetter {
	private LocalDate date;

	public GetterSetter() {
		//Nothing
	}
	
	public GetterSetter(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}