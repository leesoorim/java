package study14;

public class MemberImpl implements MemberVO{

	@Override
	public void insert() {
		System.out.println("저장처리");
	}

	@Override
	public void select() {
		System.out.println("출력처리");
	}

	@Override
	public void update() {
		System.out.println("수정처리");
	}

	@Override
	public void delete() {
		System.out.println("삭제처리");
	}
	
	public static void main(String[] args) {
		
		MemberImpl member = new MemberImpl();
		member.insert();
		member.select();
		member.update();
		member.delete();
		
	}


}
