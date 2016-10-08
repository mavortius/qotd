package com.grailsinaction.qotd

/**
 * Created by marcelo on 08/10/2016.
 */

new Quote(
        author: "Peter Ledbrook",
        content: "Time waits for no man").save()
new Quote(
        author: "Glen Smith",
        content: "Groovy solves all problems").save(flush: true)

def analyzer = new QuoteAnalyzer(Quote.list())

try {
    def reportFile = new File("report.txt")

    reportFile.withPrintWriter { w ->
        w.println """\
Quote report
------------
Total: ${analyzer.quoteCount}

Number of quotes per author:
"""
        for (entry in analyzer.quoteCountPerAuthor) {
            w.println " " + entry.key.padRight(20) + entry.value
        }
    }

    println reportFile.text
} catch (IOException ex) {
    println "Unable to write to the 'report.txt' file!"
}
