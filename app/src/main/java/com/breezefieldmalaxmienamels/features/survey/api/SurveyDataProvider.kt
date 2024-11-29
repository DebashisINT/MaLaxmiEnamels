package com.breezefieldmalaxmienamels.features.survey.api

import com.breezefieldmalaxmienamels.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldmalaxmienamels.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}