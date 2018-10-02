package com.chenxy.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chenxy.bean.AdvAdvert;

import java.util.List;

/**
 *
 * @author chxy
 */
public class ImageJsonUtil {

    /**
     * imageList转换成json
     * @param list
     * @return
     */
    public static String imageListToJson(List<AdvAdvert> list){
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObject.put("title", "图片管理");
        jsonObject.put("id", "Images");
        jsonObject.put("start", 0);
        for (int i = 0;i<list.size(); i++){
            JSONObject dataJson = new JSONObject();
            dataJson.put("pic", list.get(i).getPic());
            dataJson.put("url", list.get(i).getUrl());
            dataJson.put("title", list.get(i).getTitle());
            jsonArray.add(dataJson);
        }
        jsonObject.put("data", jsonArray);
        return jsonObject.toString();

    }

}
