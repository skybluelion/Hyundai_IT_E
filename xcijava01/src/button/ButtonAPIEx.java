package button;

class Button {
	OnclickListener ocl;
	void setOnClickListener (OnclickListener ocl) {
		this.ocl = ocl;
	}
	interface OnclickListener {
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
}


public class ButtonAPIEx {

	public static void main(String[] args) {
		//개발자 1. 클릭하면 음악재생
			Button btn1 = new Button();
			btn1.setOnClickListener(new Button.OnclickListener() {
				
				@Override
				public void onClick() {
					System.out.println("개발자 1: 음악재생");
				}
			});
			btn1.onClick();
			
			//개발자 2. 클릭하면 네이버 접속
			Button btn2 = new Button();
			btn2.setOnClickListener(new Button.OnclickListener() {
				
				@Override
				public void onClick() {
					System.out.println("개발자 2: 네이버 접속");
				}
			});
			btn2.onClick();
	}

}
