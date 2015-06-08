/**
定义一个防止视图重复点击的静态类，在需要做防止重复点击的地方加上该判断

*/
public class BtnClickUtils {
	private static long mLastClickTime = 0;
	
	private BtnClickUtils( ){
		
	}
	
    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - mLastClickTime;
        if ( 0 < timeD && timeD < 500) {   
            return true;   
        }
        
        mLastClickTime = time;
        
        return false;   
    }
}