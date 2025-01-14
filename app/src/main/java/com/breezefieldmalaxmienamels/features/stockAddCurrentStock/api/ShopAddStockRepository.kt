package com.breezefieldmalaxmienamels.features.stockAddCurrentStock.api

import com.breezefieldmalaxmienamels.base.BaseResponse
import com.breezefieldmalaxmienamels.features.location.model.ShopRevisitStatusRequest
import com.breezefieldmalaxmienamels.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldmalaxmienamels.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldmalaxmienamels.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldmalaxmienamels.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}