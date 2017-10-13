package net.corda.examples.attachments

const val BLACKLIST_JAR_PATH = "src/test/resources/blacklist.jar"
// These blacklisted parties are named in the file blacklisted.txt file in blacklist.jar.
val BLACKLISTED_PARTIES = listOf(
        "Crossland Savings",
        "TCF National Bank Wisconsin",
        "George State Bank",
        "The James Polk Stone Community Bank",
        "Tifton Banking Company"
)