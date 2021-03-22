package ch25;
interface Viewable1 {
	@Deprecated
	public void showIt(String str);
	public void brShowIt(String str);
}
class Viewer1 implements Viewable1 {
	@Override
	@SuppressWarnings("deprecation")
	public void showIt(String str) {
		System.out.println(str);
	}
	@Override
	public void brShowIt(String str) {
		System.out.println('[' + str + ']');
	}
}
class AtSuppressWarnings {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Viewable1 view = new Viewer1();
		view.showIt("Hello Annotations");
		view.brShowIt("Hello Annotations");
	

	}

}
