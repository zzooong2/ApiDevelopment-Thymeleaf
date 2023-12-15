package study.api_member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import study.api_member.domain.ManUnitedVO;
import study.api_member.service.ManUnitedService;

import java.util.List;

@RestController
@RequestMapping("/manunited/*")
public class ManUnitedController {

    @Autowired
    ManUnitedService manUnitedService;

    @RequestMapping("/players")
    public List<ManUnitedVO> getList(){
        System.out.println("맨체스터 유나이티드 선수명단");
        List<ManUnitedVO> list = manUnitedService.getList();
        return list;
    }

//    @RequestMapping("/backnumber")
//    public ManUnitedVO getNumber(int backnumber){
//        System.out.println("선수 등번호");
//        return manUnitedService.get(backnumber);
//    }

}
