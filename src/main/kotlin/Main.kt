import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.theme.dimen_16dp

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {

        Row(
            modifier = Modifier.padding(dimen_16dp)
        ) {
            Column(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {

                Button(onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }

                Text(
                    text = "Oke"
                )

                Greeting(name = "Desktop")

            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
