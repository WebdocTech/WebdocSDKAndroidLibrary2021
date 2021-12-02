package com.webdoc.webdoc_library.InitiateSDK.modelclasses.KK_modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllocateDoctorModel {

    @SerializedName("AllocateDoctorNewResult")
    @Expose
    private AllocateDoctorNewResult allocateDoctorNewResult;

    public AllocateDoctorNewResult getAllocateDoctorNewResult() {
        return allocateDoctorNewResult;
    }

    public void setAllocateDoctorNewResult(AllocateDoctorNewResult allocateDoctorNewResult) {
        this.allocateDoctorNewResult = allocateDoctorNewResult;
    }


}