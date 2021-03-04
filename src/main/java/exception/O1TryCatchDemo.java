package exception;

/**
 * java异常结构：
 * Throwable类
 *      |
 *      |
 *  -------------------
 *  |                 |
 * Exception        Error
 *
 * (网络故障、文件损坏、设备错误、用户输入非法等情况导致的异常
 * 而Error表示java运行时环境出现的错误，例如：JVM内存资源耗尽
 *
 */
public class O1TryCatchDemo {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        for (;;){
            str+=str;
            System.out.println(str);
        }

    }

}
