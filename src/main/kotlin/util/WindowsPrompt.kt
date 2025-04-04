package util

fun runPrompt(rule: String) {
    Runtime.getRuntime().exec(rule)
}

const val PROMPT_SHUTDOWN_SET = "shutdown -s -t 3600"
const val PROMPT_SHUTDOWN_CANCEL = "shutdown -a"