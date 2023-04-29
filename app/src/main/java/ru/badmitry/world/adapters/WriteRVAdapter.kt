package ru.badmitry.world.adapters

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.badmitry.domain.Entity
import ru.badmitry.world.databinding.RvItemWriteBinding

class WriteRVAdapter(
    private val context: Context,
    private val entities: List<Entity>,
    private val nextElementAction: () -> Unit
) : RecyclerView.Adapter<WriteRVAdapter.ViewHolder>() {
    private lateinit var adapterBinding: RvItemWriteBinding

    inner class ViewHolder(private val binding: RvItemWriteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var adapter = LettersRVAdapter(context, ::onLetterClick)
        private var text = ""
        private var listEntity = mutableListOf<Char>()
        var mediaPlayerName: MediaPlayer? = null
        fun bind(entity: Entity) {
            text = context.getString(entity.nameResId).uppercase()
            listEntity = text.uppercase().map { it }.shuffled().toMutableList()
            mediaPlayerName = MediaPlayer.create(context, entity.nameSoundResId)
            binding.title.text = ""
            binding.titleStatic.text = text
            binding.image.setImageDrawable(context.getDrawable(entity.imageResId))
            binding.image.setOnClickListener {
                mediaPlayerName?.start()
            }
            binding.title.setOnClickListener {
                mediaPlayerName?.start()
            }
            binding.run {
                rvLetter.layoutManager =
                    GridLayoutManager(context, 5)
                rvLetter.adapter = adapter
                adapter.submitList(listEntity)
            }
        }

        private fun onLetterClick(index: Int) {
            val currentText = binding.title.text
            val letter = listEntity.getOrNull(index)
            if (letter == text.getOrNull(currentText.length)) {
                listEntity.removeAt(index)
                adapter.submitList(listEntity)
                binding.title.text = "$currentText$letter"
                if (binding.title.text.length == text.length) {
                    mediaPlayerName?.start()
                    nextElementAction.invoke()
                }
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, payloads: MutableList<Any>) {
        super.onBindViewHolder(holder, position, payloads)
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.mediaPlayerName?.start()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        adapterBinding =
            RvItemWriteBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(adapterBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int {
        return entities.size
    }
}