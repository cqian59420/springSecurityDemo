package springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.config.AbstractInterceptorDrivenBeanDefinitionDecorator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.service.IHomeService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/homeController.do")
public class HomeController {
    public static final int DEFAULT_SIZE= 15;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private IHomeService homeService;

    @RequestMapping("login")
    public String login(@RequestParam("userName") String name,@RequestParam("password") String passworld,
    Model model){
        logger.info("成功调用到login方法{},密码{}",name,passworld);
       /*ModelAndView modelAndView = new ModelAndView();*/
        model.addAttribute("name",name);
        model.addAttribute("passworld",passworld);
        if(homeService.login(name,passworld)){
            return  "home/index";
        }else {
            return "home/error";
        }
       /* modelAndView.addObject("name",name);
        modelAndView.addObject("passworld",passworld);
        modelAndView.setViewName("index");
        return modelAndView;*/
    }
}
