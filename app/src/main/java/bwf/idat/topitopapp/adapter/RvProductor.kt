package bwf.idat.topitopapp.adapter

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bwf.idat.topitopapp.databinding.ItemProductoBinding
import bwf.idat.topitopapp.model.Producto
import coil.load

class RVProductoAdapter(var productos: List<Producto>,/*,val onClickProducto:(Producto)-> Unit*/): RecyclerView.Adapter<ProductVH>() {

    var onItemClick:((Producto)->Unit)? =null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {

        val binding = ItemProductoBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ProductVH(binding,/*onClickProducto*/)
    }

    override fun getItemCount(): Int {

        return productos.size
    }

    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        val productox=productos[position]
        holder.bind(productos[position])
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(productox)
        }
    }

}


class ProductVH(private val binding : ItemProductoBinding /*,val onClickProducto:(Producto)-> Unit*/ ): RecyclerView.ViewHolder(binding.root){
    fun bind(producto: Producto) {


        binding.txtproducto.text = producto.name
        binding.txtprecio.text ="S/ "+ producto.precio.toString()
        binding.productImageView.load(producto.imgUrl)
        if(producto.favoriteImg) {
            binding.favoriteButton.setImageResource(bwf.idat.topitopapp.R.drawable.baseline_favorite_1)
        }else {
            producto.favoriteImg == false
            binding.favoriteButton.setImageResource(bwf.idat.topitopapp.R.drawable.baseline_favorite_24)
        }
       // binding.root.setOnClickListener {
       //     onClickProducto(producto)
//
       // }

    }

}
/*
class RvProductor(private val productos:List<Producto>): RecyclerView.Adapter<ProductoRv>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoRv {
        val binding = ItemProductoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductoRv(binding)
    }

    override fun getItemCount(): Int =productos.size

    override fun onBindViewHolder(holder: ProductoRv, position: Int) {
        holder.bind(productos[position])
    }
}
class ProductoRv(private val binding: ItemProductoBinding ):RecyclerView.ViewHolder(binding.root){
    fun bind(producto: Producto){
        binding.txtproducto.text= producto.nombre
        binding.txtprecio.text= producto.precio.toString()+"/$"
        binding.txtdescuento.text=producto.descuento.toString()+"/$"
        binding.txtprecio.paintFlags=Paint.STRIKE_THRU_TEXT_FLAG

    }

}*/