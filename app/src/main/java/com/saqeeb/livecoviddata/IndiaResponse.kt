package com.saqeeb.livecoviddata

import java.io.Serializable

//success: true, data: {…}, lastRefreshed: "2021-05-21T15:04:22.104Z", lastOriginUpdate: "2021-05-21T02:30:00.000Z"
data class IndiaResponse(val success:Boolean, val data:IndiaData,val regional:ArrayList<IndiaState>,val lastRefreshed:String,val lastOriginUpdate:String) :Serializable