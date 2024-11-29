package com.breezefieldmalaxmienamels.features.login.model

import com.breezefieldmalaxmienamels.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}