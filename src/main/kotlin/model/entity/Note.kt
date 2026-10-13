package org.example.model.entity

import java.time.LocalDate

data class Note (
    var id: Int,
    var note:Float,
    var typeEvaluation: String,
    var dateEvaluation: LocalDate,
    )