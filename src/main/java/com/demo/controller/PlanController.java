package com.demo.controller;

import com.demo.dao.JobDao;
import com.demo.dao.PlanDao;
import com.demo.dao.UserDao;
import com.demo.entity.Job;
import com.demo.entity.Plan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2016/9/27.
 */
@Controller
@RequestMapping("/plan")
public class PlanController {
    @Resource
    private PlanDao planDao;
    @Resource
    private JobDao JobDao;

    @RequestMapping("/query")
    public String test(Model model){
        List<Plan> plan=planDao.selectALL();
        model.addAttribute("plan",plan);
        return "plan/test";
    }
    @RequestMapping("/Singlequery")
    public String SingleQuery(Model model,int id){
        Plan Singleplan=planDao.selectByPrimaryKey(id);
        model.addAttribute("Singleplan",Singleplan);
        return "plan/query";
    }

    @RequestMapping("/delete")
    public String delete(Model model,int id){
        planDao.deleteByPrimaryKey(id);
        List<Plan> plan=planDao.selectALL();
        model.addAttribute("plan",plan);
        return "plan/test";
    }
    @RequestMapping("/addplan1")
    public String addplan1(){
        return "plan/addplan";
    }
    @RequestMapping("/addplan")
    public String addplan(Model model,String pname,int pid,String organ,String safe,String technique,String project,String schedule,String defect){
        Plan plan1=new Plan();
        plan1.setDefect(defect);
        plan1.setPid(pid);
        plan1.setPname(pname);
        plan1.setOrgan(organ);
        plan1.setProject(project);
        plan1.setTechnique(technique);
        plan1.setSafe(safe);
        plan1.setSchedule(schedule);
        planDao.insert(plan1);
        List<Plan> plan=planDao.selectALL();
        model.addAttribute("plan",plan);
        return "plan/test";
    }
    @RequestMapping("/Update")
    public String Preserve(Model model,int id,String pname,int pid,String organ,String safe,String technique,String project,String schedule,String defect){
        Plan plan1=new Plan();
        plan1.setId(id);
        plan1.setDefect(defect);
        plan1.setPid(pid);
        plan1.setPname(pname);
        plan1.setOrgan(organ);
        plan1.setProject(project);
        plan1.setTechnique(technique);
        plan1.setSafe(safe);
        plan1.setSchedule(schedule);
        model.addAttribute("update",plan1);
        return "plan/update";
    }
    @RequestMapping("/Preserve")
    public String updateplan(Model model,int id,String pname,int pid,String organ,String safe,String technique,String project,String schedule,String defect){
        Plan plan2=new Plan();
        plan2.setId(id);
        plan2.setDefect(defect);
        plan2.setPid(pid);
        plan2.setPname(pname);
        plan2.setOrgan(organ);
        plan2.setProject(project);
        plan2.setTechnique(technique);
        plan2.setSafe(safe);
        plan2.setSchedule(schedule);
        planDao.updateByPrimaryKey(plan2);
        List<Plan> plan=planDao.selectALL();
        model.addAttribute("plan",plan);
        return "plan/test";
    }

    @RequestMapping(value = "/upload.do")
    public String upload(MultipartFile instructor, HttpServletRequest request, ModelMap model,int id) {

        System.out.println("开始");
        String path = request.getSession().getServletContext().getRealPath("resources")+"\\upload";
        String fileName = instructor.getOriginalFilename();
//        String fileName = new Date().getTime()+".jpg";
        System.out.println(path);
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        Plan c=new Plan();
        c.setPupload("/upload/"+fileName);
        c.setId(id);
        planDao.updateByPrimaryKeySelective(c);
//        "/upload/"+fileName
        //保存
        try {
            instructor.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);
        }

        return "redirect:/plan/query";
    }
    @RequestMapping("/upload")
    public String upload(int id,Model model) {
        model.addAttribute("id",id);
        return "plan/upload";
    }

    @RequestMapping("/queryjob")
    public String queryjob(Model model){
        List<Job> job= JobDao.selectALL();
        model.addAttribute("job",job);
        return "plan/job";
    }


    @RequestMapping("/addjob")
    public String addjob(Model model,int pid,String jcontent){
        Job job1=new Job();
        job1.setPid(pid);
        job1.setJcontent(jcontent);
        JobDao.insert(job1);
        List<Job> job= JobDao.selectALL();
        model.addAttribute("job",job);
        return "plan/job";
    }

    @RequestMapping("/addjob1")
    public String addjob1(Model model){
        return "plan/addjob";
    }
}
