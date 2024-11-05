package com.example.hogwarts.data.local

import com.example.hogwarts.data.Wizard
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class WizardLocalDatabase
@Inject constructor(
    private val dao: WizardDao
): WizardLocalDataSource {

    override suspend fun insert(wizards: List<Wizard>) {
        return dao.create(wizards.toLocal())
    }

    override suspend fun readAll(): List<Wizard> {
        return dao.readAll().toExternal()
    }

    override fun observeAll(): Flow<List<Wizard>> {
        return dao.observeAll().map {
            localWizards -> localWizards.toExternal()
        }
    }
}