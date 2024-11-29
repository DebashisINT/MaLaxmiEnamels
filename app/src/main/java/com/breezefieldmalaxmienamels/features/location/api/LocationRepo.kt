package com.breezefieldmalaxmienamels.features.location.api

import com.breezefieldmalaxmienamels.app.Pref
import com.breezefieldmalaxmienamels.base.BaseResponse
import com.breezefieldmalaxmienamels.features.location.model.AppInfoInputModel
import com.breezefieldmalaxmienamels.features.location.model.AppInfoResponseModel
import com.breezefieldmalaxmienamels.features.location.model.GpsNetInputModel
import com.breezefieldmalaxmienamels.features.location.model.ShopDurationRequest
import com.breezefieldmalaxmienamels.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}