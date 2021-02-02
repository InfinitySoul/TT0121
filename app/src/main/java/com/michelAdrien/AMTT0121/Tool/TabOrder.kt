package com.michelAdrien.AMTT0121.Tool

import com.michelAdrien.AMTT0121.Model.device.Heater
import com.michelAdrien.AMTT0121.Model.device.Light
import com.michelAdrien.AMTT0121.Model.device.RollerShutter
import com.michelAdrien.AMTT0121.R

class TabOrder {

    companion object {
        val TAB_TITLES = arrayOf(
                R.string.tab_all,
                R.string.tab_light,
                R.string.tab_heater,
                R.string.tab_roller_shutter
        )

        val filters = arrayOf(
            "",
            Light::class.java.name,
            Heater::class.java.name,
            RollerShutter::class.java.name
        )

    }

}