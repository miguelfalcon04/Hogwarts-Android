package com.example.hogwarts.data.local

import com.example.hogwarts.data.Wand
import com.example.hogwarts.data.Wizard

fun Wizard.toLocal(): WizardEntity{
    return WizardEntity(
        id = this.id,
        name = this.name,
        gender = this.gender,
        house = this.house,
        wandId = this.wandId,
        patronous = this.patronous,
        image = this.image,
        actor = this.actor
    )
}


// Cada elemneto de tipo w (Wizard) lo convieto a local
fun List<Wizard>.toLocal(): List<WizardEntity>{
    return this.map{ w -> w.toLocal()}
}

fun WizardEntity.toExternal(): Wizard{
    return Wizard(
        id = this.id,
        name = this.name,
        gender = this.gender,
        house = this.house,
        wandId = this.wandId,
        patronous = this.patronous,
        image = this.image,
        actor = this.actor
    )
}

fun List<WizardEntity>.toExternal(): List<Wizard>{
    return this.map{ w-> w.toExternal()}
}