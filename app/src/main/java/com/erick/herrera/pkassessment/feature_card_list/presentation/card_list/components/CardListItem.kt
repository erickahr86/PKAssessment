package com.erick.herrera.pkassessment.feature_card_list.presentation.card_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.erick.herrera.pkassessment.common.color
import com.erick.herrera.pkassessment.feature_card_list.data.remote.dto.CardData


@Composable
fun CardListItem(
    card: CardData,
    //onItemClick: (CardData) -> Unit
) {

    when (card.cardType) {
        "text" -> TextCarditem(card)
        "image_title_description" -> ImageCardItem(card)
        "title_description" -> TitleDescriptionCarditem(card)
    }
}

@Composable
fun TextCarditem(card: CardData) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        //.clickable { onItemClick },
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()

                .padding(20.dp)
        ) {

            Text(
                text = card.card.value,
                overflow = TextOverflow.Visible,
                style = TextStyle(
                    color = card.card.attributes.textColor.color,
                    fontSize = card.card.attributes.font.size.sp
                )
            )

        }
    }
}

@Composable
fun TitleDescriptionCarditem(card: CardData) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        //.clickable { onItemClick },
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Text(
                text = card.card.title.value,
                overflow = TextOverflow.Visible,
                style = TextStyle(
                    color = card.card.title.attributes.textColor.color,
                    fontSize = card.card.title.attributes.font.size.sp
                )
            )
            Text(
                text = card.card.description.value,
                overflow = TextOverflow.Visible,
                style = TextStyle(
                    color = card.card.description.attributes.textColor.color,
                    fontSize = card.card.description.attributes.font.size.sp
                )
            )

        }
    }
}

@Composable
fun ImageCardItem(card: CardData) {

    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .height(500.dp)
            .wrapContentHeight(align = CenterVertically)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = rememberImagePainter(card.card.image.url),
                contentDescription = card.card.title.value,
                contentScale = ContentScale.None
            )

        }

    }
}


