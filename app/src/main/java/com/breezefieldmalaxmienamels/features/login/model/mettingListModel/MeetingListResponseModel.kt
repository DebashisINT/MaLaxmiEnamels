package com.breezefieldmalaxmienamels.features.login.model.mettingListModel

import com.breezefieldmalaxmienamels.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 17-01-2020.
 */
class MeetingListResponseModel : BaseResponse(), Serializable {
    var meeting_type_list: ArrayList<MeetingListDataModel>? = null
}