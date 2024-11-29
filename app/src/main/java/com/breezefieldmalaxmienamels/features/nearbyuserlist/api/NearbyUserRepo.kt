package com.breezefieldmalaxmienamels.features.nearbyuserlist.api

import com.breezefieldmalaxmienamels.app.Pref
import com.breezefieldmalaxmienamels.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldmalaxmienamels.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldmalaxmienamels.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}