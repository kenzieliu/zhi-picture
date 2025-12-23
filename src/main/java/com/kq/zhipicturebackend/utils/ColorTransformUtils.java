package com.kq.zhipicturebackend.utils;

/**
 * 颜色转换工具类
 */
public class ColorTransformUtils {

    private ColorTransformUtils() {
        // 工具类不需要实例化
    }

    /**
     * 获取标准颜色（将数据万象的 5 位色值转为 6 位）
     *
     * @param color
     * @return
     */
    public static String getStandardColor(String color) {
        // 每一种 rgb 色值都有可能只有一个 0，要转换为 00
        // 将不标准的7位十六进制颜色字符串转换为标准的8位格式。
        // 该方法假设7位格式是由于某个颜色分量缺少前导零造成的。
        // 它通过在第4个字符后插入一个"0"来补全。
        // 示例：
        // 0x080e0 => 0x0800e0
        if (color.length() == 7) {
            color = color.substring(0, 4) + "0" + color.substring(4, 7);
        }
        return color;
    }
}