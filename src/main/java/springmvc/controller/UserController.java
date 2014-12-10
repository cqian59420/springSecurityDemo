package springmvc.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.Splittle;


@Controller
@RequestMapping("/UserController.do")
public class UserController {
private Logger logger = LoggerFactory.getLogger(this.getClass());

    public UserController() {
        logger.info("啦啦啦啦啦阿拉蕾11111111111");
    }

    /*
     *如果不加requestParam,就根据参数的名称
     * 如果加上requestParam，则优先按照param的value对应参数
    */
    @RequestMapping(params = "newPage")
    public String getPageNew(@RequestParam("param") String paramsssss,Model model,ModelMap map){
        logger.info("啦啦啦啦啦阿拉蕾{}" , paramsssss);
        model.addAttribute(paramsssss);
        map.put("sda",paramsssss);
        return "newPagel/ds";
    }

    @RequestMapping("parseForm")
    public String getPageNewl(@RequestParam("param") String paramsssss,Model model,ModelMap map){
        logger.info("啦啦啦啦啦阿拉蕾" + paramsssss);
        model.addAttribute(paramsssss);
        map.put("sda",paramsssss);
        Splittle splittle = new Splittle();
        model.addAttribute(splittle);
        return  "newPagel/ds" ;
    }

    @RequestMapping("addSpitter")
    public String addSpitterForm(Splittle splittle,BindingResult bindingResult){
        logger.info("执行addSpitter方法");
        if(bindingResult.hasErrors()){
            return "newPagel/edit";
        }
        return "redirect:/newPagel"+splittle.getUsername();
    }
}
