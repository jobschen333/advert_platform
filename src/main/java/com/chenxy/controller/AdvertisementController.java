package com.chenxy.controller;

import com.chenxy.bean.AdvAdvert;
import com.chenxy.service.IAdvertismentService;
import com.chenxy.util.ImageJsonUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

        return ImageJsonUtil.imageListToJson(list);
    }

}
