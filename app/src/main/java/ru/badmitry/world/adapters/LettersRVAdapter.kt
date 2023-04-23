package ru.badmitry.world.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.world.databinding.RvItemLetterBinding

class LettersRVAdapter(
    private val context: Context,
    private val action: (text: Char) -> Unit,
    private val letters: List<Char>,
) : RecyclerView.Adapter<LettersRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemLetterBinding

    inner class ViewHolder(private val binding: RvItemLetterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(letter: Char) {
            binding.tvLetter.text = letter.toString()
            binding.item.setOnClickListener {
                action.invoke(letter)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemLetterBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(letters[position])
    }

    override fun getItemCount(): Int {
        return letters.size
    }
}