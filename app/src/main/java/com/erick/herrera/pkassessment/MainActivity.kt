package com.erick.herrera.pkassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.tooling.preview.Preview
import com.erick.herrera.pkassessment.feature_card_list.presentation.card_list.components.CardListScreen
import com.erick.herrera.pkassessment.ui.theme.PKAssessmentTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PKAssessmentTheme {
                Surface(color = MaterialTheme.colors.background) {

                    CardListScreen()

                }
            }
        }
    }
}
