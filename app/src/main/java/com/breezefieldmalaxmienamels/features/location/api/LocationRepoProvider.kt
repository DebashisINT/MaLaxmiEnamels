package com.breezefieldmalaxmienamels.features.location.api

import com.breezefieldmalaxmienamels.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldmalaxmienamels.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}