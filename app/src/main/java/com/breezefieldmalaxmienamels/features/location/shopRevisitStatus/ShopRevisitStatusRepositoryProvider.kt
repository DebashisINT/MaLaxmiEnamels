package com.breezefieldmalaxmienamels.features.location.shopRevisitStatus

import com.breezefieldmalaxmienamels.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldmalaxmienamels.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}