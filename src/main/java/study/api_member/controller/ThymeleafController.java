package study.api_member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study.api_member.domain.ManUnitedVO;
import study.api_member.service.ManUnitedService;

import java.util.List;

@Controller
@RequestMapping("/mu/*")
public class ThymeleafController {

    @Autowired
    ManUnitedService manUnitedService;

    @RequestMapping("/fc")
    public String fc(Model model){
        model.addAttribute("mufc","Manchester United");
        return "manunited";
    }

    @ResponseBody
    @RequestMapping("/players")
    public List<ManUnitedVO> getList(Model model){
        List<ManUnitedVO> list = manUnitedService.getList();
        model.addAttribute("players", list);
        return list;
    }
}
