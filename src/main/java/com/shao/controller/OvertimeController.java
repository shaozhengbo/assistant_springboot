package com.shao.controller;

import com.shao.dto.OvertimeDto;
import com.shao.utils.DateUtil;
import com.shao.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.*;

@RestController
public class OvertimeController {

    @GetMapping("/getOvertimeList")
    public R getOvertimeList() throws ParseException {
        List<OvertimeDto> overtimeDtoList = new ArrayList<>();
        OvertimeDto dto = null;
        int day = 18;
        for (int i = 0; i < 10; i++) {
            dto = new OvertimeDto();
            dto.setDate(DateUtil.formatDate("2020-02-" + day, "yyyy-MM-dd"));
            dto.setTime((float) (i + 5));
            dto.setStatus((byte) 0);
            overtimeDtoList.add(dto);
            day--;
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data", overtimeDtoList);
        resultMap.put("msg", "ok");
        return R.ok(resultMap);
    }
}
