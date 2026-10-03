package com.lizongying.mytv0.data


data class AppInfoResponse(
    val applist: List<AppInfo>?,
)

data class AppInfo(
    val packageName: String?,
    val versionCode: String?,
    val versionName: String?,
    val url: String?,
)
