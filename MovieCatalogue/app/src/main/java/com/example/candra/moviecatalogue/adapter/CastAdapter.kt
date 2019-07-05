package com.example.candra.moviecatalogue.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.candra.moviecatalogue.R
import com.example.candra.moviecatalogue.model.Cast


class CastAdapter(
    private val glide: RequestManager,
    private val casts: List<Cast>,
    private val listener: (Cast) -> Unit
) :
    RecyclerView.Adapter<CastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sample_layout_list, parent, false)

        return CastViewHolder(view)
    }

    override fun getItemCount(): Int = casts.size

    override fun onBindViewHolder(holder: CastViewHolder, position: Int) {
        holder.bindItem(glide, casts[position], listener)
    }

}

class CastViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val castPhoto: ImageView = view.findViewById(R.id.castPhoto)
    private val nameAndRoleField: TextView = view.findViewById(R.id.nameAndRole)

    fun bindItem(glide: RequestManager, cast: Cast, listener: (Cast) -> Unit) {
        var nameAndRoleText = "${cast.castName} as ${cast.castRole}"
        nameAndRoleField.text = nameAndRoleText
        glide.load(cast.castPhotoFileName)
            .apply(RequestOptions().error(R.drawable.poster_a_star))
            .into(castPhoto)

        itemView.setOnClickListener {
            listener(cast)
        }
    }
}
