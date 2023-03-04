package com.tiooooo.jetcoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiooooo.jetcoffee.model.Category
import com.tiooooo.jetcoffee.model.dummyCategory
import com.tiooooo.jetcoffee.ui.theme.JetCoffeeTheme

@Composable
fun CategoryItem(
    category: Category,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = category.imageCategory),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(id = category.textCategory),
            fontSize = 10.sp,
            modifier = Modifier.paddingFromBaseline(16.dp, 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryItemPreview() {
    JetCoffeeTheme {
        CategoryItem(
            category = dummyCategory.first(),
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}
