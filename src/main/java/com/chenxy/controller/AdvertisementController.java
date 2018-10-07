package com.chenxy.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenxy.bean.AdvAdvert;
import com.chenxy.service.IAdvertismentService;
import com.chenxy.util.FileUtil;
import com.chenxy.util.JsonUtil;
import com.github.pagehelper.PageInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 广告
 * @author chxy
 */
@Controller
@RequestMapping("advert")
public class AdvertisementController {

    @Autowired
    private IAdvertismentService advertismentService;

    /**
     * 图片列表
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public String list(HttpServletRequest request){
        String title = request.getParameter("title");
        AdvAdvert advAdvert = new AdvAdvert();
        advAdvert.setTitle(title);
        List<AdvAdvert> list = advertismentService.select(advAdvert);
        return JsonUtil.imageListToJson(list);
    }

    /**
     * 商家后台列表
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "businessList", method = RequestMethod.GET)
    public String businessList(HttpServletRequest request){
        String title = request.getParameter("title");
        String addTime = request.getParameter("addTime");
        String pageStr = request.getParameter("page");
        String limitStr = request.getParameter("limit");
        AdvAdvert advAdvert = new AdvAdvert();
        advAdvert.setTitle(title);

        int page = 1 ;
        int limit = 10;
        if (pageStr!=""||pageStr!=null){
            page = Integer.parseInt(pageStr);
        }
        if (limitStr!=""||limitStr!=null){
            limit = Integer.parseInt(limitStr);
        }

        PageInfo pageInfo = advertismentService.selectPage(advAdvert,page, limit);

        return JsonUtil.requestListToJson(pageInfo.getList(), (int) pageInfo.getTotal());

    }

    /**
     * 添加广告
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addAdvert", method = RequestMethod.POST)
    public JSONObject addAdvert(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String url = request.getParameter("url");
        String content = request.getParameter("content");
        String title = request.getParameter("title");
        String mustClick = request.getParameter("mustClick");
        String wasteToken = request.getParameter("wasteToken");
        String pic = request.getParameter("pic");

        return jsonObject;
    }

    /**
     *  上传图片
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public JSONObject upload(HttpServletRequest request, MultipartFile file){
        JSONObject jsonObject = new JSONObject();
        String name = FileUtil.uploadFile(file,"upload/");
        if (name!=""||name!=null){
            jsonObject.put("code", 1);
            jsonObject.put("msg", "上传图片成功!");
            jsonObject.put("path", name);
        } else {
            jsonObject.put("code", 0);
            jsonObject.put("msg", "上传图片失败!");
        }
        return jsonObject;


    }

}
