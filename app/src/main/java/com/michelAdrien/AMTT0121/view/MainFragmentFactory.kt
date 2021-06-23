package com.michelAdrien.AMTT0121.view


import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.michelAdrien.AMTT0121.view.list.DeviceListFragment
import com.michelAdrien.AMTT0121.view.profile.ProfileFragment

class MainFragmentFactory() : FragmentFactory() {
    /*Variables
    lateinit var test : String

    //Put arguments here so they are given to the variables defined above
    public fun ListFragmentFactory(test : String){
        this.test = test
    } */

    @NonNull
    override fun instantiate(@NonNull  classLoader : ClassLoader, @NonNull  className : String)  : Fragment {

        val clazz : Class<out Fragment> = loadFragmentClass(classLoader, className)
        if (clazz == DeviceListFragment::class.java) {
                return DeviceListFragment()
        }
        else if(clazz == ProfileFragment::class.java) {
            return ProfileFragment()
        }
        else {
            return super.instantiate(classLoader, className)
        }
    }



}

/*
class CustomFragmentFactory(private val dependency: Dependency) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        if (className == CustomFragment::class.java.name) {
            return CustomFragment(dependency)
        }
        return super.instantiate(classLoader, className)
    }
} */