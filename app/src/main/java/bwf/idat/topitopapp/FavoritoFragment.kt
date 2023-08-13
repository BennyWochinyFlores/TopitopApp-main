package bwf.idat.topitop

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bwf.idat.topitopapp.HomeViewModel
import bwf.idat.topitopapp.ProductDeatilsActivity
import bwf.idat.topitopapp.adapter.RVProductoAdapter
import bwf.idat.topitopapp.databinding.FragmentMenuBinding


class FavoritoFragment : Fragment() {
    private lateinit var binding: FragmentMenuBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root



    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = RVProductoAdapter(listOf())/*{producto ->
            findNavController().navigate(R.id.action_navigation_favorito_to_productDeatilsFragment)
        };*/

        binding.rbProductos.adapter = adapter
        binding.rbProductos.layoutManager = GridLayoutManager(requireContext(),2,
            RecyclerView.VERTICAL,false)

        viewModel.products.observe(requireActivity()){product ->

            adapter.productos = product
            adapter.notifyDataSetChanged()
        }
        adapter.onItemClick={
            val intent= Intent(context, ProductDeatilsActivity::class.java)
            intent.putExtra("producto",it)
            startActivity(intent)
        }

        viewModel.getMealService()
    }
}