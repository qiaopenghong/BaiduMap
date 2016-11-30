package com.bwie.test.startmode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 1.作用  计算字符串中子串出现的次数
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/30
 */
public class StrCount {
    public static void main(String[] args) {
        String str = "Hello Word safadgaa";
        HashMap<Character, Integer> strhash = new HashMap<Character, Integer>();
        int num = 0;
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char c = str.charAt(i);
            int temp = 0;
            for (int j = 0; j <= str.length() - 1; j++) {
                num = str.indexOf(c, temp);
                if (num != -1) {
                    count++;
                    temp = num + 1;
                    continue;

                }

                else {
                    strhash.put(c, count);
                    count = 0;
                    break;
                }

            }
        }

        // 上面是访问hashmap中的value值
        // 下面是获得一个做为map.entry(k,v)做为一个整体的值
        // 而且是效率最高的一种写法。

        Iterator iter = strhash.entrySet().iterator();// 返回一个set集合
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) iter
                    .next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            //System.out.println(key + "=" + value);
        }
        // Set<K> keySet()
        // 返回此映射中包含的键的 Set 视图。 写的很清楚就是key的Set
        // Set<Map.Entry<K,V>> entrySet()
        // 返回此映射中包含的映射关系的 Set 视图。
        // 也是一个Set,而Set中每个元素是内部类Map.Entry。

        // 下面也是一种获得的方法
        // 思路是通过先获得hashmap中的键值，然后用get方法来获得相对应的值。但是这个值相对来说是效率低的。

        Iterator iter1 = strhash.keySet().iterator();
        while (iter1.hasNext()) {
            Object key = iter1.next();
            Object value = strhash.get(key);
            System.err.println(key + "=" + value);
        }

    }

}
