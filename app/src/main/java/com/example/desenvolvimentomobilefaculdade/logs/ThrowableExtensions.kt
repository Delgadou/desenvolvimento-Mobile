package com.example.desenvolvimentomobilefaculdade.logs

fun Throwable.getPropertiesTree(
    thirdPartyExceptionDebugger: ThrowableDebugger<*>
): Map<String, Any?> {
    val causeProperties = cause?.getPropertiesTree(thirdPartyExceptionDebugger).orEmpty()
    return if (this is Debuggable) {
        causeProperties + logProperties()
    } else {
        causeProperties
    }
}