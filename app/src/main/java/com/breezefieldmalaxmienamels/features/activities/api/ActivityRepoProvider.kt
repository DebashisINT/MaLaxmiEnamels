package com.breezefieldmalaxmienamels.features.activities.api

import com.breezefieldmalaxmienamels.features.member.api.TeamApi
import com.breezefieldmalaxmienamels.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}