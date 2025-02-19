package study14;

public class CarVolMake implements CarVolService{
	
	private int volumn;
	private int temp;
	
	public int getVolumn() {
		return volumn;
	}

	@Override
	public void volUp(int volumn) {
		this.volumn+=volumn;
	}

	@Override
	public void volDown(int volumn) {
		if(this.volumn < volumn) {
			volOff();
		}else {
		this.volumn-=volumn;
		}
	}

	@Override
	public void volOff() {
		this.volumn=0;
	}

	@Override
	public void volPause() {
		this.temp=this.volumn;
		volOff();
	}

	@Override
	public void volResume() {
		this.volumn= this.temp;
	}

}
