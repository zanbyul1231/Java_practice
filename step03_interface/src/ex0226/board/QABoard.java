package ex0226.board;

/**
 * QA에 관련된 속성 관리하는 객체
 * */
public class QABoard extends Board {
   private boolean replyState; //답변여부
   
   public QABoard() {}
   public QABoard(int bno, String subject, String writer, String content , boolean replyState) {
	super(bno, subject, writer, content);
	this.replyState=replyState;
	
  }
	public boolean isReplyState() {
		return replyState;
	}
	public void setReplyState(boolean replyState) {
		this.replyState = replyState;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		
		builder.append(", replyState=");
		builder.append(replyState);
		
		return builder.toString();
	}
   
   
   
}
