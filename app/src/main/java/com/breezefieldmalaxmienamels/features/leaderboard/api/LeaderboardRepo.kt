package com.breezefieldmalaxmienamels.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldmalaxmienamels.app.FileUtils
import com.breezefieldmalaxmienamels.app.Pref
import com.breezefieldmalaxmienamels.base.BaseResponse
import com.breezefieldmalaxmienamels.features.addshop.model.AddLogReqData
import com.breezefieldmalaxmienamels.features.addshop.model.AddShopRequestData
import com.breezefieldmalaxmienamels.features.addshop.model.AddShopResponse
import com.breezefieldmalaxmienamels.features.addshop.model.LogFileResponse
import com.breezefieldmalaxmienamels.features.addshop.model.UpdateAddrReq
import com.breezefieldmalaxmienamels.features.contacts.CallHisDtls
import com.breezefieldmalaxmienamels.features.contacts.CompanyReqData
import com.breezefieldmalaxmienamels.features.contacts.ContactMasterRes
import com.breezefieldmalaxmienamels.features.contacts.SourceMasterRes
import com.breezefieldmalaxmienamels.features.contacts.StageMasterRes
import com.breezefieldmalaxmienamels.features.contacts.StatusMasterRes
import com.breezefieldmalaxmienamels.features.contacts.TypeMasterRes
import com.breezefieldmalaxmienamels.features.dashboard.presentation.DashboardActivity
import com.breezefieldmalaxmienamels.features.login.model.WhatsappApiData
import com.breezefieldmalaxmienamels.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}