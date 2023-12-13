package study.api_member.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.api_member.domain.ManUnitedVO;
import study.api_member.mapper.ManUnitedMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class ManUnitedServiceImpl implements ManUnitedService{

    @Autowired
    private ManUnitedMapper mapper;

    @Override
    public List<ManUnitedVO> getList(){
        return mapper.getList();
    }

    @Override
    public ManUnitedVO get(int backnumber) {
        return mapper.read(backnumber);
    }
}
