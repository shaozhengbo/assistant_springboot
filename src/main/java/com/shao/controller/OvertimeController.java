package com.shao.controller;

import com.shao.dto.OvertimeDto;
import com.shao.pojo.Overtime;
import com.shao.pojo.OvertimeKey;
import com.shao.service.OvertimeService;
import com.shao.utils.DateUtil;
import com.shao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.*;

@RestController
public class OvertimeController {

    @Autowired
    private OvertimeService overtimeService;

    /**
     * 获取加班记录列表（根据创建时间倒序）
     *
     * @return
     * @throws ParseException
     */
    @GetMapping("/overtime/uid/{uid}")
    public R findOvertimeList(@PathVariable("uid") Long uid) throws ParseException {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", overtimeService.findAllOvertimeByUid(uid));
        resultMap.put("msg", "ok");
        return R.ok(resultMap);
    }

    /**
     * 创建加班记录
     * @param overtime
     * @return 创建成功后的对象
     */
    @PostMapping("/overtime")
    public R createOvertime(@RequestBody Overtime overtime) {

        if (overtimeService.findOvertimeByPrimaryKey(overtime.getOvertimeKey()) == null) {
            if (overtimeService.createOvertime(overtime) == 1) {
                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("data", overtimeService.findOvertimeByPrimaryKey(overtime.getOvertimeKey()));
                resultMap.put("msg", "创建加班记录成功");
                return R.ok(resultMap);
            } else {
                return R.error("创建加班记录失败");
            }
        } else {
            return R.error("已存在当前日期的加班记录");
        }

    }
}
