package com.saqeeb.livecoviddata

import java.io.Serializable

/*
* {
      "total": 26031991,
      "confirmedCasesIndian": 26031943,
      "confirmedCasesForeign": 48,
      "discharged": 22712735,
      "deaths": 291331,
      "confirmedButLocationUnidentified": 0
    }*/
data class IndiaSummary(val total:Long,val confirmedCasesIndian:String,val discharged:Long,val deaths:Long,val confirmedButLocationUnidentified:Int) :Serializable