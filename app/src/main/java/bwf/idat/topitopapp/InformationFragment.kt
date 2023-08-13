package bwf.idat.topitop

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bwf.idat.topitopapp.databinding.FragmentInformacionBinding

class InformationFragment : Fragment() {
    private lateinit var binding: FragmentInformacionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInformacionBinding.inflate(inflater,container,false)
        return binding.root
    }


}