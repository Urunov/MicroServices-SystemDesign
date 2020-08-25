package com.urunov.controller.doctor;

import com.urunov.model.doctor.Doctor;
import com.urunov.service.doctor.DoctorService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: apple
 * @created on 25/08/2020
 * @Project is multi-module-project
 */
@RestController
public class DoctorController {

    private DoctorService doctorService;

    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }
}
