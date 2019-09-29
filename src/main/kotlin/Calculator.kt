import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.*
import java.awt.event.KeyEvent

class Calculator : View() {
    override val root: VBox by fxml()

    @FXML lateinit var display: Label

    init {
        title = "S calculator"

        root.lookupAll(".button").forEach {b ->
            b.setOnMouseClicked {

            }
        }

        root.addEventFilter(KeyEvent.KEY_TYPED) {

        }
    }

    var state: Operator = Operator.add(0)

    fun onAction(fn: Operator) {
        state = fn
        display.text = ""
    }

    val dispalyValue: Long
    get() = when(display.text) {
        "" -> 0
        else -> display.text.toLong()
    }
}
