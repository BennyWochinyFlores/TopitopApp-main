package bwf.idat.topitopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bwf.idat.topitopapp.databinding.ActivityCrearCuentaBinding

class CrearCuenta : AppCompatActivity() {
    private lateinit var binding: ActivityCrearCuentaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCrearCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnvolverlogin.setOnClickListener {
            val intent = Intent(this@CrearCuenta,MenuLogin::class.java )
            startActivity(intent)
            finish()
        }

    }
}