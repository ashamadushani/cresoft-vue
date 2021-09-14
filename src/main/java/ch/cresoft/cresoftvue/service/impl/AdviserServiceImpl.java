package ch.cresoft.cresoftvue.service.impl;

import ch.cresoft.cresoftvue.dao.AdviserDao;
import ch.cresoft.cresoftvue.dto.AdviserDto;
import ch.cresoft.cresoftvue.model.Adviser;
import ch.cresoft.cresoftvue.service.AdviserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class AdviserServiceImpl implements AdviserService {
    @Autowired
    private AdviserDao adviserDao;

    @Override
    public List<AdviserDto> findAll() {
        List<Adviser> advisers = adviserDao.findAll();

        List<AdviserDto> adviserDtoList = new ArrayList<>();

        for (Adviser adviser:advisers) {
            adviserDtoList.add(getAdviserDto(adviser));
        }

        return adviserDtoList;
    }


    private AdviserDto getAdviserDto(Adviser adviser){
        AdviserDto adviserDto = new AdviserDto();

        adviserDto.setId(adviser.getId());
        adviserDto.setCode(adviser.getCode());
        adviserDto.setName(adviser.getName());
        adviserDto.setShortName(adviser.getShortName());
        adviserDto.setDdlId(adviser.getDdlId());
        adviserDto.setDepartment(adviser.getDepartment());
        adviserDto.setTelNumber(adviser.getTelNumber());
        adviserDto.setAteId(adviser.getAteId());
        adviserDto.setUsername(adviser.getUsername());
        adviserDto.setRecTyp(adviser.getRecTyp());
        adviserDto.setDepartmentId(adviser.getDepartmentId());
        adviserDto.setRecordStatus(adviser.getRecordStatus());
        adviserDto.setRequestToDelete(adviser.getRequestToDelete());
        adviserDto.setRequestUser(adviser.getRequestUser());
        adviserDto.setRequestDate(adviser.getRequestDate());
        adviserDto.setApproveUser(adviser.getApproveUser());
        adviserDto.setApproveDate(adviser.getApproveDate());
        adviserDto.setRegion(adviser.getRegion());
        adviserDto.setMarket(adviser.getMarket());

        return adviserDto;
    }
}
