package com.playgrounds.android_custom_rules

import io.gitlab.arturbosch.detekt.api.*
import io.gitlab.arturbosch.detekt.api.internal.ActiveByDefault
import org.jetbrains.kotlin.psi.KtImportDirective
import java.lang.RuntimeException

// THIS RULE SHOULD ALWAYS REPORT
@ActiveByDefault(since = "now")
class SomeCustomRule(config: Config) : Rule(config) {
    override val issue: Issue
        get() = Issue("ImportThingy", Severity.CodeSmell, "I don't like this string", Debt(10))

    override fun visitImportDirective(importDirective: KtImportDirective) {
        report(CodeSmell(issue, Entity.from(importDirective), "An import"))
    }
}
