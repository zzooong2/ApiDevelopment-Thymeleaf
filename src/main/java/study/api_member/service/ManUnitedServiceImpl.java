package study.api_member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.api_member.domain.ManUnitedVO;
import study.api_member.mapper.ManUnitedMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManUnitedServiceImpl implements ManUnitedService{

    private final ManUnitedMapper mapper;

    @Override
    public List<ManUnitedVO> getList(){
        return mapper.getList();
    }

    @Override
    public ManUnitedVO getPlayer(int backNumber){
        return mapper.getPlayer(backNumber);
    }

    @Override
    public void register(ManUnitedVO vo){
        mapper.register(vo);
    }

    @Override
    public int delete(int backNumber) {
        return mapper.delete(backNumber);
    }

    @Override
    public int modify(ManUnitedVO vo){
        return mapper.modify(vo);
    }
}
