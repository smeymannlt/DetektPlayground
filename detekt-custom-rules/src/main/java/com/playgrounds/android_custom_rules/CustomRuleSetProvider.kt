package com.playgrounds.android_custom_rules

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class CustomRuleSetProvider : RuleSetProvider {
//    GIBBERISH-DO-NOT-COMPILE
    override val ruleSetId: String = "detekt-custom-rules"

    override fun instance(config: Config) =
        RuleSet(ruleSetId, listOf(SomeCustomRule(config)))
}
