package com.breezefieldmalaxmienamels.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldmalaxmienamels.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldmalaxmienamels.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}