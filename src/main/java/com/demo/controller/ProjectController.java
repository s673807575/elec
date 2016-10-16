package com.demo.controller;

import com.demo.dao.DeviceDao;
import com.demo.dao.ReportDao;
import com.demo.dao.UserDao;
import com.demo.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xia on 2016/9/27.
 */
@Controller
@RequestMapping("/project")
public class ProjectController {
    @Resource
    private DeviceDao devdao;
    @Resource
    private Pro_messageDao pro_dao;
    @Resource
    private ReportDao rep_dao;
    @Resource
    private UserDao userDao;
    @Resource
    private UserDao examine_recordDao;
    @RequestMapping("/test")
    public String test(Model model){
    List<Device> devlist=devdao.selectAll();
//       for(Device d:devlist){
//           System.out.println(d.getName());
//       }
        model.addAttribute("a",devlist);
        return "project/test";
    }
    @RequestMapping("/add")
    public String add(Pro_message pro_message ){
       pro_message.setPeriod((pro_message.getEndTime().getTime() - pro_message.getStartTime().getTime())/(1000*60*60*24)+"");
        pro_message.setIsqualified(0);
        System.out.println(pro_message.getPeriod());
        pro_dao.insertSelective(pro_message);
        return "redirect:/project/unpass_pro";
    }
    @RequestMapping("/editview")
    public String editview(String id ,Model model ){


        model.addAttribute("a", pro_dao.selectByPrimaryKey(Integer.parseInt(id)));
        return "project/editview";
    }
    @RequestMapping("/edit")
    public String edit(Pro_message pro_message){
        pro_message.setPeriod((pro_message.getEndTime().getTime() - pro_message.getStartTime().getTime())/(1000*60*60*24)+"");
        pro_dao.updateByPrimaryKeySelective(pro_message);
        System.out.println(pro_dao.updateByPrimaryKeySelective(pro_message));
        return "redirect:/project/unpass_pro";
    }
    @RequestMapping("/delete")
    public String delete(String id){
        pro_dao.deleteByPrimaryKey(Integer.parseInt(id));
    return "redirect:/project/unpass_pro";
    }

    @RequestMapping("/nopass_pro")
    public String nopass_pro(Model model){
        List<Pro_message> nopass_pro=pro_dao.selectnopass();

        model.addAttribute("a",nopass_pro);
        return "project/nopass_pro";
    }
    @RequestMapping("/unpass_pro")
    public String unpass_pro(Model model){
        List<Pro_message> unpass_pro=pro_dao.selectunpass();

        model.addAttribute("a",unpass_pro);
        return "project/unpass_pro";
    }
    @RequestMapping("/checker")
    public String checker(Model model){
        List<Pro_message> unpass_pro=pro_dao.selectunpass();

        model.addAttribute("a",unpass_pro);
        return "project/checker";
    }
    @RequestMapping("/checker2")
    public String checker2(Model model){
        List<Report> a=rep_dao.selectunpass();

        model.addAttribute("a",a);
        return "project/checker2";
    }
    @RequestMapping("/checker_nopass2")
    public String checker_nopass2(String id){
        Report report=rep_dao.selectByPrimaryKey(Integer.parseInt(id));
        report.setStatus(3);
        rep_dao.updateByPrimaryKeySelective(report);
        return "redirect:/project/checker2";
    }
    @RequestMapping("/checker_pass2")
    public String checker_pass2(String id){
        Report report=rep_dao.selectByPrimaryKey(Integer.parseInt(id));
        report.setStatus(1);
        rep_dao.updateByPrimaryKeySelective(report);
        return "redirect:/project/checker2";
    }
    @RequestMapping("/addview")
    public String addview(){

        return "project/addview";
    }
    @RequestMapping("/home")
    public String home(){

        return "project/home";
    }

    @RequestMapping("/checker_nopass")
    public String checker_nopass(String id){
        Pro_message pro_nopass=pro_dao.selectByPrimaryKey(Integer.parseInt(id));
        pro_nopass.setIsqualified(1);
        pro_dao.updateByPrimaryKeySelective(pro_nopass);
        return "redirect:/project/checker";
    }
    @RequestMapping("/checker_pass")
    public String checker_pass(String id){
        Pro_message pro_pass=pro_dao.selectByPrimaryKey(Integer.parseInt(id));
        pro_pass.setIsqualified(2);
        pro_dao.updateByPrimaryKeySelective(pro_pass);
        return "redirect:/project/checker";
    }

    @RequestMapping("/pass_pro")
    public String pass_pro(Model model){
        List<Pro_message> pass_pro=pro_dao.selectpass();

        model.addAttribute("a",pass_pro);
        return "project/pass_pro";
    }
//    @RequestMapping("/detail")
//    public String detail(Model model,int pid){
//        Pro_message pro_message=pro_dao.selectByPrimaryKey(pid);
//        Report report=rep_dao.selectBypid(pid);
//        User user=userDao.selectByPrimaryKey(report.getPerson());
//        pro_message.setReport(report);
//        List<Examine_record> examine_records=examine_recordDao.selectByAll(pid);
//        model.addAttribute("pro_message",pro_message);
//        model.addAttribute("exm",examine_records);
//        model.addAttribute("cus",user);
//        return "test/detail";
//    }

}