package ru.badmitry.world

import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.android.support.DaggerAppCompatActivity
import ru.badmitry.world.databinding.ActivityMainBinding
import ru.badmitry.world.viewmodels.MainViewModel
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this, vmFactory)[MainViewModel::class.java]
        viewModel.setNavigator(AppNavigator(this, binding.container.id))
        if (supportFragmentManager.findFragmentById(binding.container.id) == null) {
            viewModel.showMainScreen()
        }
    }

    fun initToolbar(idTitle: Int, onBackBtnVisible: Boolean) {
        setSupportActionBar(binding.materialToolbar)
        binding.materialToolbar.title = getString(idTitle)
        supportActionBar?.apply {
            setHomeButtonEnabled(onBackBtnVisible)
            setDisplayHomeAsUpEnabled(onBackBtnVisible)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if( item.itemId == android.R.id.home) viewModel.onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}