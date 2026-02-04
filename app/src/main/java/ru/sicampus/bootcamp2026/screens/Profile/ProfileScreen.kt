package ru.sicampus.bootcamp2026.screens.Profile

/*import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Фото профиля",
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Gray, CircleShape)
                    .padding(16.dp),
                tint = Color.White
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Добавить фото",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }

        ProfileInfoRow(label = "Имя", value = "Амаль")
        ProfileInfoRow(label = "Фамилия", value = "Шенкао")
        ProfileInfoRow(label = "Email", value = "nt@gmail.com")
        ProfileInfoRow(label = "Телефон", value = "+79999999999")
        ProfileInfoRow(label = "Должность", value = "ген-директор")
        ProfileInfoRow(label = "Отдел", value = "не выбрано")
    }
}

@Composable
fun ProfileInfoRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier.weight(1f),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = value,
            modifier = Modifier.weight(1f),
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Профиль")
@Composable
fun ProfileScreenPreview() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProfileScreen()
        }
    }
}
*/