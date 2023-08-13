package bwf.idat.topitopapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import bwf.idat.topitopapp.model.Producto
import java.security.AccessControlContext

//@Database(entities = [Producto::class], version =1)
abstract class ProductoDatabase : RoomDatabase(){
    abstract fun productoDao():ProductoDao

  //companion object{
  //    private var instance: ProductoDatabase? =null
  //    fun getDatabase(context:Context): ProductoDatabase{
  //        val temp = instance
  //        if(instance != null){
  //            return temp!!
  //        }
  //        synchronized(this){
  //            val _instance= Room.databaseBuilder(
  //                context.applicationContext,
  //                ProductoDatabase::class.java,
  //                "Topitop").build()
  //            instance=_instance
  //            return _instance


  //        }
  //    }
  //}

}