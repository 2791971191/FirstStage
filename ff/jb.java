
import java.math.BigDecimal;

public class FhWork {
    public static void main(String[] args) {
//        1、编写程序检查“hello” 是否包含e
        System.out.println("hello".contains("e"));

//        2、编写程序去除“      ha he    ”的前后空格
        System.out.println("      ha he    ".trim());

//        3、编写程序将 “hello” 全部变为大写,并输出到屏幕,截取子串”LLO” 并输出到屏幕
        System.out.println("hello".toUpperCase());
        System.out.println("hello".substring(2,5).toUpperCase());

//        4、String s = "富家不用买良田，书中自有千钟粟。
//        安居不用架高堂，书中自有黄金屋。出门莫恨无人随，
//        书中车马多如簇。娶妻莫恨无良媒，书中自有颜如玉。
//        男儿欲遂平生志，五经勤向窗前读。"
//        请分段输出诗句，按'。,'分段即可
//        提示:如果按照,和。拆分，需要写成[,。]
        String s = "富家不用买良田，书中自有千钟粟。安居不用架高堂，书中自有黄金屋。出门莫恨无人随，书中车马多如簇。娶妻莫恨无良媒，书中自有颜如玉。男儿欲遂平生志，五经勤向窗前读。";
        String[] ss = s.split("[。，]");
        for (String s1:ss) {
            System.out.println(s1);
        }

//        5、倒叙输出字符串“abcdefg”两种方式：StringBuilder， toCharArray
        System.out.println(new StringBuilder("abcdefg").reverse());
        char[] aa= "abcdefg".toCharArray();
        for (int i = aa.length-1; i >= 0; i--) {
            System.out.print(aa[i]);
        }
        System.out.println();

//        6、使用BigDecimal做加、减、乘、除计算
        BigDecimal bdc = new BigDecimal("1.5");
        System.out.println(bdc.add(new BigDecimal("1.23")));//加
        System.out.println(bdc.subtract(new BigDecimal("0.01")));//减
        System.out.println(bdc.multiply(new BigDecimal("0.1")));//乘
        System.out.println(bdc.divide(new BigDecimal("0.13"),3,BigDecimal.ROUND_HALF_UP));//除,四舍五入保留3位小数

//        7、输入一个字符串，输入要查找的字符，求出查找特定字符出现的次数
        String s1 = "asdafsdfafadafgfgfgdgqrzvsfhaDAS";
        System.out.println("字符串\""+s1+"\"中出现\'a\'的数量为："+getCount(s1,"a"));
        System.out.println("字符串\""+s1+"\"中出现\'f\'的数量为："+getCount(s1,"f"));
    }
    public static int getCount(String s,String a){
        int count = 0;
        if (!s.contains(a)) {
            return 0;
        }
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a.charAt(0)){
                count++;
            }
        }
        return count;
    }


}
