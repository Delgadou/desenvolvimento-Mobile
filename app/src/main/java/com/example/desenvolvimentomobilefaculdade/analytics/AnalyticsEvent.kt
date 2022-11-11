package com.example.desenvolvimentomobilefaculdade.analytics

/**
 * An event to be sent to the [AnalyticsTool]
 */
interface AnalyticsEvent {

    /**
     * Name of the event. Should be a unique identifier
     */
    val name: String

    /**
     * Provides the list of the params for this event
     */
    fun params(): Map<String, Any?>

}