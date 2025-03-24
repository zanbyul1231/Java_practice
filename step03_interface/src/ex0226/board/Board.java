package ex0226.board;

/**
 * 모든 게시판 유형들이 공통으로 사용하는 속성들 관리하는 객체 = VO = DTO
 * (글번호, 제목, 작성자, 내용) 
 * */
public class Board {
  private int bno;
  private String subject;
  private String writer;
  private String content;
  
   public Board() {}
   public Board(int bno, String subject, String writer, String content) {
	super();
	this.bno = bno;
	this.subject = subject;
	this.writer = writer;
	this.content = content;
  }
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bno=");
		builder.append(bno);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", content=");
		builder.append(content);
		builder.append(", ");
		return builder.toString();
	}

  
}
