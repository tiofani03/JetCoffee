package com.tiooooo.jetcoffee.model

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.tiooooo.jetcoffee.CategoryRow
import com.tiooooo.jetcoffee.MenuRow
import com.tiooooo.jetcoffee.R

data class Home(
    @StringRes val title: Int,
    val content: @Composable () -> Unit,
)

val dummyHome = listOf(
    Home(title = R.string.section_category, content = { CategoryRow() }),
    Home(title = R.string.section_favorite_menu, content = { MenuRow(dummyMenu) }),
    Home(title = R.string.section_best_seller_menu, content = { MenuRow(dummyMenu) }),
)

