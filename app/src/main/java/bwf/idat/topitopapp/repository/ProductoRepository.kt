package bwf.idat.topitopapp.repository

import bwf.idat.topitopapp.db.ProductoDao
import bwf.idat.topitopapp.model.Producto
import bwf.idat.topitopapp.retrofit.RetrofitHelper

class ProductoRepository(val productoDao: ProductoDao? =null) {

   //suspend fun getMeals(): List<Producto>{

   //    val response = RetrofitHelper.productInstance.getAllMeans()
   //    return response.products
   //}
   //suspend fun getFavorite():List<Producto>{
   //    return productoDao?.getFavorite()!!

   //}
   //suspend fun addtooFavorite(producto: Producto){
   //    productoDao?.addTooFavorite(producto)
   //}

}