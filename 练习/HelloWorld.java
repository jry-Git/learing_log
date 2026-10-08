public class HelloWorld {

    public static void main(String[] args) {
        // 1. 确认环境
        System.out.println("Hello, 后端工程师！");
        System.out.println("JDK 版本: " + System.getProperty("java.version"));
        System.out.println("系统: " + System.getProperty("os.name"));

        // 2. 顺手练第一个语法点：变量 + 字符串拼接
        String name = "john";
        int daysToApply = 125;   // 今天到 2027-02-10 投递高峰的天数
        double hoursPerDay = 3.0;

        System.out.println(name + "，距离投递高峰还有 " + daysToApply + " 天。");
        System.out.println("每天 " + hoursPerDay + " 小时，累计可投入 "
                + (daysToApply * hoursPerDay) + " 小时。");

        // 3. 顺手练流程控制
        if (daysToApply * hoursPerDay >= 300) {
            System.out.println("时间够用，按计划走。");
        } else {
            System.out.println("时间紧张，启动降级预案。");
        }
    }
}
