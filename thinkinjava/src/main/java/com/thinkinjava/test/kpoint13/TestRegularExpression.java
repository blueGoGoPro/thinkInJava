package com.thinkinjava.test.kpoint13;

//:strings/TestRegularExpression
//{Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}"}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yongQiang_Wang on 2018/4/24.
 */
public class TestRegularExpression {
    public static void match(String[] args) {
        if (args.length <2){
            System.out.println("Usage: \njava TestRegularExpression " +
                    "characterSequence regularExpression");
            System.exit(0);
        }
        System.out.println("input: \"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("-----------------------------------");
            System.out.println("Regular expression: \"" +arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at positions " +
                    m.start() + "-" + (m.end() -1)
                );
            }
        }

    }

    /**
     * "abc+" 表示匹配ab 后面跟1个或多个c
     * "(abc)+" 表示匹配 一个或多个abc
     * "(abc){2,} 表示至少匹配两个abc
     * @param args
     */
    public static void main(String[] args) {
        String [] a = {"abcabcabcdefabc" ,"abc+" ,"(abc)+", "(abc){2,}"};
        String[] b = {"java now has regular expression","^java","\\Breg.*","n.w\\sh(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"};
        match(b);
    }
}
