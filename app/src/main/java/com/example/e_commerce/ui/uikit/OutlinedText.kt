package com.example.e_commerce.ui.uikit

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.e_commerce.R
import com.example.e_commerce.ui.theme.E_commerceTheme

@Composable
fun OutlinedText(
    placeholder: String,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.titleMedium,
    textColor: Color = MaterialTheme.colorScheme.inversePrimary,
    focusColor: Color = MaterialTheme.colorScheme.primary,
    unFocusColor: Color = MaterialTheme.colorScheme.outline,
) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = modifier,
        textStyle = textStyle.copy(color = textColor, fontWeight = FontWeight.Bold),
        placeholder = { Text(placeholder, style = textStyle) },
        leadingIcon = { Icon(painter = painterResource(id = icon), contentDescription = null) },
        singleLine = true,
        shape = MaterialTheme.shapes.small,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = focusColor,
            unfocusedBorderColor = unFocusColor,
            focusedLeadingIconColor = focusColor,
            unfocusedLeadingIconColor = textColor,
        )
    )
}

@Preview(showBackground = true)
@Composable
private fun OutlinedTextPreview() {
    E_commerceTheme {
        OutlinedText("Your Email", R.drawable.ic_email)
    }

}