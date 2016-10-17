package com.demo.controller;
import com.demo.dao.*;
import com.demo.entity.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.mail.Session;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 67380 on 2016/9/26.
 */
@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class UserController{

    @Resource
    private UserDao userDao;

    @Resource
    private Pro_messageDao pro_messageDao;

    @Resource
    private JobDao jobDao;

    @Resource
    private Examine_recordDao examine_recordDao;

    @Resource
    private ReportDao reportDao;

    @RequestMapping("/login")
    public String login(Model model,String name,String pwd){
        User user=userDao.login(name,pwd);
        model.addAttribute("user",user);
        List<Pro_message> pro_messages=pro_messageDao.selectALLNo();
        model.addAttribute("proes",pro_messages);
        if(user.getRole().equals("2"))
            return "test/test";
        else if(user.getRole().equals("0"))
            return "/project/addview";
        else if(user.getRole().equals("3"))
            return "redirect:/project/checker";
        else
            return "redirect:/plan/query";

    }



    @RequestMapping("/test")
    public String test(Model model){
//        User user=userDao.selectByPrimaryKey(1);
        List<Pro_message> pro_messages=pro_messageDao.selectALLNo();
        model.addAttribute("proes",pro_messages);
        return "test/test";
    }

    @RequestMapping("/job")
    public String job(Model model,int pid){
        List<Job> jobs=jobDao.selectByPro(pid);
        model.addAttribute("jobs",jobs);
        return "test/job";
    }

    @RequestMapping("/report")
    public String report(Model model,int pid){
        Pro_message pro_message=pro_messageDao.selectByPrimaryKey(pid);
        Report report=reportDao.selectBypid(pid);
        pro_message.setReport(report);
        model.addAttribute("pro_message",pro_message);
        return "test/report";
    }

    @RequestMapping("/detail")
    public String detail(Model model,int pid){
        Pro_message pro_message=pro_messageDao.selectByPrimaryKey(pid);
        Report report=reportDao.selectBypid(pid);
        User user=userDao.selectByPrimaryKey(report.getPerson());
        pro_message.setReport(report);
        List<Examine_record> examine_records=examine_recordDao.selectByAll(pid);
        model.addAttribute("pro_message",pro_message);
        model.addAttribute("exm",examine_records);
        model.addAttribute("cus",user);
        return "test/detail";
    }

    @RequestMapping("/reportmanager")
    public String reportmanager(Model model,int optty){
        List<Pro_message> pro_messages;
        if(optty==0)
            pro_messages=pro_messageDao.selectALL();
        else  if(optty==1)
            pro_messages=pro_messageDao.selectALLon();
        else  if(optty==2)
            pro_messages=pro_messageDao.selectALLsucc();
        else
            pro_messages=pro_messageDao.selectALLfalue();
        model.addAttribute("pro_message",pro_messages);

        return "test/reportmanager";
    }

    @RequestMapping("/query")
    public String query(Model model,Report report){
        List<Pro_message> pro_messages;

            pro_messages=pro_messageDao.query(report);
        model.addAttribute("pro_message",pro_messages);

        return "test/reportmanager";
    }

    @RequestMapping("/form")
    public String form(Model model,int jid){
        Job job=jobDao.selectByPrimaryKey(jid);
        Examine_record examine_record=examine_recordDao.selectBypid(jid);
        model.addAttribute("recode",examine_record);
        model.addAttribute("job",job);
        return "test/form";
    }

    @RequestMapping("/suform")
    public String suform(@ModelAttribute User user, Model model, Examine_record examine_record,@RequestParam(value = "eid",required = false) Integer eid){

        examine_record.setDid(user.getId()+"");
        examine_record.setId(eid);
        if(examine_record.getId()!=null){
            examine_recordDao.updateByPrimaryKeySelective(examine_record);
        }
        else{
            examine_recordDao.insertSelective(examine_record);

            Job job=new Job();
            job.setJid(examine_record.getPid());
            job.setJstatus(1);
            jobDao.updateByPrimaryKeySelective(job);
         }
        return "redirect:/test";
    }

    @RequestMapping("/reportform")
    public String reportform(@ModelAttribute User user,Model model,Report report){
        if(report.getRid()!=null){
            report.setPerson(user.getId());
            report.setStatus(2);
            reportDao.updateByPrimaryKeySelective(report);
        }

        else{
            report.setStatus(2);
            report.setPerson(user.getId());
            reportDao.insertSelective(report);
        }
        return "redirect:/test";
    }
}
