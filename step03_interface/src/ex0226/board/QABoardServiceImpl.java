package ex0226.board;

public class QABoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("QA = " + board);
		System.out.println(super.getClass().getSimpleName() +"의 insert입니다.");
		return 1;
	}

	@Override
	public int update(Board board) {
		System.out.println("QA = " + board);
		System.out.println(super.getClass().getSimpleName() +"의 update입니다.");
		return 1;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println(super.getClass().getSimpleName() +"의 selectByBno입니다.");
	
		return new QABoard(bno, "interface연습", "장희정", "재미있다.", false);
	}
	
	///////////////////////////////////////////
	@Override
	public boolean delete(int bno) {
		System.out.println("재정의된 QA 삭제입니다...");
		return false;
	}

}













