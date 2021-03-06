package org.kuro.jlpt.utils;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 读取json文件中的内容
 */
public class LocalJsonResolution {

    public static String getJson(Context context, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        // 获得assets资源管理器
        AssetManager assetManager = context.getAssets();
        // 使用IO流读取json文件内容
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(assetManager.open(fileName), StandardCharsets.UTF_8)
            );
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
