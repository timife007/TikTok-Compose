package com.puskal.core.extension

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

/**
 * Created by Puskal Khadka on 3/15/2023.
 */


@Composable
fun Dp.Space() = Spacer(
    modifier = Modifier
        .height(this)
)