package com.laurastasiule.app.controller;

import com.laurastasiule.app.domain.CountryWeeklyData;
import com.laurastasiule.app.dto.CountryWeeklyDataDto;
import com.laurastasiule.app.service.CountryWeeklyDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "data")
@RequestMapping("/data")
public class CountryWeeklyDataController {

    private final CountryWeeklyDataService service;

    public CountryWeeklyDataController(CountryWeeklyDataService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<CountryWeeklyData> getAll () {
        return service.getAll();
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/countries")
//    @ApiOperation(value = "Get Data by country", notes = "Returns all weekly Data by country name")
//    List<String> getAllCountries() {
//        return service.getAllCountries();
//    }
}