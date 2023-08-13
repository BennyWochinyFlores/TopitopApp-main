package bwf.idat.topitopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import bwf.idat.topitopapp.databinding.ActivityMenuLoginBinding
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MenuLogin : AppCompatActivity() {
    private lateinit var binding: ActivityMenuLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnregistrar.setOnClickListener {
            val intent = Intent(this@MenuLogin, CrearCuenta::class.java)
            startActivity(intent)
            finish()

        }
        binding.btnlogin.setOnClickListener {
            val intent = Intent(this@MenuLogin, MenuPrincipal::class.java)
            startActivity(intent)
            finish()
        }
    }
        fun clicLogin(view : View) {
            val url="https://inventory-store-production.up.railway.app/login/login"
            val queue= Volley.newRequestQueue(this)
            val resultadoLog= object : StringRequest(Method.POST,url,
            Response.Listener<String> { response ->
                Toast.makeText(this,"Bienvenido a Topitop",Toast.LENGTH_SHORT).show()
            },Response.ErrorListener { error ->
                    Toast.makeText(this,"Ingrese usuario y contraseña validos",Toast.LENGTH_SHORT).show()

                }){
                override fun getParams(): MutableMap<String, String>? {
                    val parametros = HashMap<String,String>()
                    parametros.put("username",binding.txtnombre.text.toString())
                    parametros.put("password",binding.txtpassword.text.toString())
                    return parametros
                }
            }
            queue.add(resultadoLog)
        }

}