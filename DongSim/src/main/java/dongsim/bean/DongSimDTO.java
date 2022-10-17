package dongsim.bean;

public class DongSimDTO {
     
	private int idx;
    private int dx_book_idx;
    private int gradations;;
    private String qestion;
    private String answer;
    private String use_yn;
    
    
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getDx_book_idx() {
		return dx_book_idx;
	}
	public void setDx_book_idx(int dx_book_idx) {
		this.dx_book_idx = dx_book_idx;
	}
	public int getGradations() {
		return gradations;
	}
	public void setGradations(int gradations) {
		this.gradations = gradations;
	}
	public String getQestion() {
		return qestion;
	}
	public void setQestion(String qestion) {
		this.qestion = qestion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
    
    
}
