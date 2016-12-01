import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.作用 常用函数
 * 2.作者 乔鹏宏
 * 3.日期 2016/12/1
 */
public class DataTime {
    public static void main(String[] args) {
        dateFormat();
        FormatXS();
        FormatHM();
        FormatC();
        System.out.println(isPrimes(4));
    }

    //格式化时间
    private static String dateFormat() {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd  hh:mm:ss");
        //转化成字符串
        String format = dateFormat.format(currentTimeMillis);
        System.out.println("当前系统日期" + format);
        return format;
    }

    //格式化小数
    private static String FormatXS() {
        //DecimalFormat 是 NumberFormat 的一个具体子类，用于格式化十进制数字
        DecimalFormat df = new DecimalFormat(",###.00");
        double aNumber = 33665448856.6568975;
        String result = df.format(aNumber);
        System.out.println(result);
        return result;
    }

    //将毫秒数换转成日期类型
    private static void FormatHM() {
        long now = System.currentTimeMillis();
        System.out.println("毫秒数：" + now);
        Date dNow = new Date(now);
        System.out.println("日期类型：" + dNow);
    }

    //从字符串到日期类型的转换
    private static void FormatC() {
        String strDate = "2005年04月22日";
        //注意：SimpleDateFormat构造函数的样式与strDate的样式必须相符
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //必须捕获异常
        try {
            Date date = simpleDateFormat.parse(strDate);
            System.out.println(date);
        } catch (Exception px) {
            px.printStackTrace();
        }
    }

    //判断任意一个整数是否素数
    public static boolean isPrimes(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
