package com.shao.service;

import com.shao.pojo.Overtime;
import com.shao.pojo.OvertimeKey;

import java.util.List;

public interface OvertimeService {

    /**
     * 创建加班记录
     * @param overtime
     * @return 插入结果
     */
    public int createOvertime(Overtime overtime);

    /**
     * 更新加班记录
     * @param overtime
     * @return 更新结果
     */
    public int updateOvertime(Overtime overtime);

    /**
     * 删除加班记录
     * @param key 主键对象
     * @return 删除结果
     */
    public int deleteOvertime(OvertimeKey key);

    /**
     * 根据用户id查询所有加班记录，根据创建日期正序排列
     * @param uid
     * @return
     */
    public List<Overtime> findAllOvertimeByUid(long uid);

    public Overtime findOvertimeByPrimaryKey(OvertimeKey key);
}
