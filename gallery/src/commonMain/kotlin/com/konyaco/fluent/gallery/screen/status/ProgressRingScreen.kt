package com.konyaco.fluent.gallery.screen.status

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.component.ProgressRing
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.GalleryHeader
import com.konyaco.fluent.gallery.component.GallerySection

@Component(
    index = 2,
    description = "Shows the apps progress on a task, or that the app is performing ongoing work that does block user interaction."
)
@Composable
fun ProgressRingScreen() {
    Column(Modifier.fillMaxSize()) {
        GalleryHeader(
            "ProgressRing",
            "The ProgressRing has two different visual representations:\n" +
                    "Indeterminate - shows that a task is ongoing, but blocks user interaction.\n" +
                    "Determinate - shows how much progress has been made on a known amount of work."
        )
        Column(
            Modifier.weight(1f).verticalScroll(rememberScrollState())
                .padding(start = 32.dp, end = 32.dp, top = 0.dp, bottom = 32.dp)
        ) {
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "An indeterminate progress ring.",
                sourceCode = sourceCodeOfProgressRingSample
            ) {
                ProgressRingSample()
            }
            Spacer(Modifier.height(24.dp))
            GallerySection(
                modifier = Modifier.fillMaxWidth(),
                title = "A determinate progress ring.",
                sourceCode = sourceCodeOfDeterminateProgressRingSample
            ) {
                DeterminateProgressRingSample()
            }
        }
    }
}

@Sample
@Composable
private fun ProgressRingSample() {
    ProgressRing()
}

@Sample
@Composable
private fun DeterminateProgressRingSample() {
    var progress by remember { mutableStateOf(0.5f) }
    ProgressRing(progress)
    // TODO: Use NumberBox to change progress
}