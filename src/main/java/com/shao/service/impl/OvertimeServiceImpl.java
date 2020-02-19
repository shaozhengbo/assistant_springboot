package com.shao.service.impl;

import com.shao.dao.OvertimeMapper;
import com.shao.pojo.Overtime;
import com.shao.pojo.OvertimeExample;
import com.shao.pojo.OvertimeKey;
import com.shao.service.OvertimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvertimeServiceImpl implements OvertimeService {

    private final static String CREATETIME = "createtime";

    @Autowired
    private OvertimeMapper overtimeMapper;

    @Override
    public int createOvertime(Overtime overtime) {
        overtime.setStatus((byte) 0);
        overtime.setUsed((float) 0);
        overtime.setUnused(overtime.getTime());
        return overtimeMapper.insert(overtime);
    }

    @Override
    public int updateOvertime(Overtime overtime) {
        return overtimeMapper.updateByPrimaryKeySelective(overtime);
    }

    @Override
    public int deleteOvertime(OvertimeKey key) {
        return overtimeMapper.deleteByPrimaryKey(key);
    }

    @Override
    public List<Overtime> findAllOvertimeByUid(long uid) {
        OvertimeExample example = new OvertimeExample();
        example.createCriteria().andUidEqualTo(uid);
        example.setOrderByClause("year ASC, month ASC, day ASC");
        return overtimeMapper.selectByExample(example);
    }

    @Override
    public Overtime findOvertimeByPrimaryKey(OvertimeKey key) {
        return overtimeMapper.selectByPrimaryKey(key);
    }
}
