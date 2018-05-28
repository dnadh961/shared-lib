package com.dev.util

@groovy.lang.Grab("com.google.code.gson:gson:2.8.5")
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
/**
 * Created by vempc on 28-05-2018.
 */
class JsonUtil {

    static def loadJson(String jsonData){
        Gson gson = new Gson();
        JsonElement element = gson.fromJson(jsonData, JsonElement.class);
        JsonObject jsonObj = element.getAsJsonObject();
        return jsonObj
    }
}
