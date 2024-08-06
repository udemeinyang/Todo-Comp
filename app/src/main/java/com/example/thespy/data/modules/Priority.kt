package com.example.thespy.data.modules

import com.example.thespy.ui.theme.HighPriorityColor
import com.example.thespy.ui.theme.LowPriorityColor
import com.example.thespy.ui.theme.MediumPriorityColor
import com.example.thespy.ui.theme.NonePriorityColor

enum class Priority(val color: androidx.compose.ui.graphics.Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}