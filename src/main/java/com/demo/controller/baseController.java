package com.demo.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 67380 on 2016/9/27.
 */
@Controller
public class BaseController {
    @InitBinder
    public void InitBinder(HttpServletRequest request,
                           ServletRequestDataBinder binder) {
        // 不要删除下行注释!!! 将来"yyyy-MM-dd"将配置到properties文件中
        // SimpleDateFormat dateFormat = new
        // SimpleDateFormat(getText("date.format", request.getLocale()));
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, null, new CustomDateEditor(
                dateFormat, true));
    }
}
