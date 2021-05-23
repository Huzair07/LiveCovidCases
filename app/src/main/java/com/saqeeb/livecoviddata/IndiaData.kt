package com.saqeeb.livecoviddata

import java.io.Serializable

/*
regional: (36) [{…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}, {…}]
summary: {total: 26031991, confirmedCasesIndian: 26031943, confirmedCasesForeign: 48, discharged: 22712735, deaths: 291331, …}
unofficial-summary: [{…}]
__proto__: Object
lastOriginUpdate: "2021-05-21T02:30:00.000Z"
lastRefreshed: "2021-05-21T15:04:22.104Z" b
*/
data class IndiaData(val regional: ArrayList<IndiaState>,val summary:IndiaSummary,val lastOriginUpdate:String,val lastRefreshed:String): Serializable