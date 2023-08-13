package bwf.idat.topitopapp.db

import androidx.room.*
import bwf.idat.topitopapp.model.Producto

@Dao
interface ProductoDao {
    @Query("Select * from producto")
    suspend fun getFavorite(): List<Producto>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTooFavorite(producto: Producto)
    @Delete
    suspend fun  deleteFavorite(producto: Producto)


}