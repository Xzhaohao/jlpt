package org.kuro.jlpt.utils;

import com.google.gson.Gson;

public class JsonUtil {

    public static <T> T JsonToPojo(String json, Class<T> type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }

}
