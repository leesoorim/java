package study14;

// 캡슐화, 상속(implements),다형성(오버라이딩),추상화(interface)
public class VolMake implements VolService{

	private int volLever;	// 맴버변수, 인스턴스변수->기본 값 0이 자동 세팅됨
	public VolMake() {
		volLever = 1;
	}

	public int getVolLever() {
		return volLever;
	}

	public void setVolLever(int volLever) {
		this.volLever = volLever;
	}

	@Override
	public void volUp(int level) {
		this.volLever+=level;
	}
	@Override
	public void volDown(int level) {
		this.volLever-=level;
	}
	

	
	
	
}
