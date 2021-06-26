package com.playgrounds.detekt.customrule

import io.gitlab.arturbosch.detekt.api.*
import io.gitlab.arturbosch.detekt.api.internal.ActiveByDefault
import org.jetbrains.kotlin.psi.KtImportDirective

@ActiveByDefault(since = "now")
class SomeCustomRule(config: Config) : Rule(config) {
    override val issue: Issue
        get() = Issue("ImportThingy", Severity.CodeSmell, "I don't like this string", Debt(10))

    override fun visitImportDirective(importDirective: KtImportDirective) {
        val import: String = importDirective.importPath?.pathStr ?: ""
        println("Import $import")
        if ("appcompat" in import) {
            report(CodeSmell(
                issue,
                Entity.from(importDirective),
                "Importing $import which is an internal import"))
        }
    }
}
