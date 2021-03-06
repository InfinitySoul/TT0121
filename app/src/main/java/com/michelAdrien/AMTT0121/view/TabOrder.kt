package com.michelAdrien.AMTT0121.view

import com.michelAdrien.AMTT0121.model.device.Heater
import com.michelAdrien.AMTT0121.model.device.Light
import com.michelAdrien.AMTT0121.model.device.RollerShutter
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
            Light::class.java.simpleName,
            Heater::class.java.simpleName,
            RollerShutter::class.java.simpleName
        )

    }

}