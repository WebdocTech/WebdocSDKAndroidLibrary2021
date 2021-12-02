package com.webdoc.webdoc_library.InitiateSDK.modelclasses.lawyerModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnswerQuestionsModel {
    @SerializedName("AllocateLawyerNewResult")
    @Expose
    private AllocateLawyerNewResult allocateLawyerNewResult;

    public AllocateLawyerNewResult getAllocateLawyerNewResult() {
        return allocateLawyerNewResult;
    }

    public void setAllocateLawyerNewResult(AllocateLawyerNewResult allocateLawyerNewResult) {
        this.allocateLawyerNewResult = allocateLawyerNewResult;
    }

}
