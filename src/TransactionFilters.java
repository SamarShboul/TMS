import java.time.LocalDate;

public class TransactionFilters {
	private Integer type;
	private Integer category;
	private LocalDate from;
	private LocalDate to ;
	private Boolean frequent;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public Boolean getFrequent() {
		return frequent;
	}
	public void setFrequent(Boolean frequent) {
		this.frequent = frequent;
	}
	

}
