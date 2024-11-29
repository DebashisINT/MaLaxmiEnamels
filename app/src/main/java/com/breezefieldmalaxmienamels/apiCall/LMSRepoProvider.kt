package com.breezefieldmalaxmienamels.features.mylearning.apiCall

import com.breezefieldmalaxmienamels.features.login.api.opportunity.OpportunityListApi
import com.breezefieldmalaxmienamels.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}