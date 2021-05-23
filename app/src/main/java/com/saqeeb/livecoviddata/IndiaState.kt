package com.saqeeb.livecoviddata

import java.io.Serializable

/*{
        "loc": "West Bengal",
        "confirmedCasesIndian": 1209958,
        "confirmedCasesForeign": 0,
        "discharged": 1064553,
        "deaths": 13895,
        "totalConfirmed": 1209958
      }*/
data class IndiaState(val loc:String, val confirmedCasesIndian:Long ,val confirmedCasesForeign:Int, val discharged:Long, val deaths:Long,val totalConfirmed:Long):Serializable