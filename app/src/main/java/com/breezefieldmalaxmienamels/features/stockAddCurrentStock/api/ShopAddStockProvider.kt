package com.breezefieldmalaxmienamels.features.stockAddCurrentStock.api

import com.breezefieldmalaxmienamels.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldmalaxmienamels.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}