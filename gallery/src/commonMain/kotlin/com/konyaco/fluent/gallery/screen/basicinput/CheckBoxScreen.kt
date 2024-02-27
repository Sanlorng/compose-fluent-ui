package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection
import com.konyaco.fluent.gallery.component.TodoComponent

@Composable
fun CheckBoxScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "CheckBox",
            "CheckBox controls let the user select a combination of binary options. In contrast, RadioButton controls allow the user to select from mutually exclusive options. The indeterminate state is used to indicate that an option is set for some, but not all, child options. Don't allow users to set an indeterminate state directly to indicate a third option."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                Modifier.fillMaxWidth(), "A 2-state CheckBox.",
                """
                    var checked by remember { mutableStateOf(false) }
                    CheckBox(checked, "Two-state CheckBox", onCheckStateChange = { checked = it })
                """.trimIndent()
            ) {
                var checked by remember { mutableStateOf(false) }
                CheckBox(checked, "Two-state CheckBox", onCheckStateChange = { checked = it })
            }
            Spacer(Modifier.height(32.dp))
            GallerySection(
                Modifier.fillMaxWidth(), "A 3-state CheckBox.", ""
            ) {
                TodoComponent()
            }
            Spacer(Modifier.height(32.dp))
            GallerySection(
                Modifier.fillMaxWidth(), "Using a 3-state CheckBox", ""
            ) {
                TodoComponent()
            }
        }
    }
}