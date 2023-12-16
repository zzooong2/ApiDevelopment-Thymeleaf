package study.api_member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.api_member.domain.ManUnitedVO;
import study.api_member.service.ManUnitedService;

import java.util.List;

@Controller
@RequestMapping("/mu/*")
@RequiredArgsConstructor
public class ThymeleafController {

    private final ManUnitedService manUnitedService;

    // 선수 명단 출력
    @RequestMapping("/players")
    public String getAllPlayers(Model model){
        List<ManUnitedVO> list = manUnitedService.getList();
        model.addAttribute("mufc",list);
        return "playerlist";
    }

    // 선수 개인 프로필 보기
    @GetMapping("/get")
    public String getPlayer(Model model, int backNumber){
        ManUnitedVO player = manUnitedService.getPlayer(backNumber);
        model.addAttribute("get", player);
        return "getplayer";
    }

    // 선수 명단 추가
    /*
    * GetMapping을 통해 register.html 파일을 호출
    * PostMapping을 통해 service-> mapper interface -> mapper.xml 순서로 insert 쿼리 호출
    * 이 때, 파라미터인 ManUnitedVO vo는 html 파일에서 전달된 name과 일치하는 클래스(도메인)를 찾아 매핑
    * 이후 redirect:/mu/players 를 return 함으로서 글 작성이 완료되면 main 페이지로 이동
    */
    @GetMapping("/register")
    public String addPlayerForm(){
        return "register";
    }
    @PostMapping("/register")
    public String addPlayer(ManUnitedVO vo){
        manUnitedService.register(vo);
        return "redirect:/mu/players";
    }

    // 선수 삭제
    @RequestMapping("/delete")
    public String deletePlayer(Integer backNumber) {
        manUnitedService.delete(backNumber);
        return "redirect:/mu/players";
    }

}
