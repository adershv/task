

import NumberData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

import com.helenzys.interviewtask.R
import com.helenzys.interviewtask.ui.callback.ItemClickListener

class ColorsListAdapter(private  var listener:ItemClickListener) : RecyclerView.Adapter<ColorsListAdapter.MyViewHolder>() {

    lateinit var  numberData:List<NumberData>
    fun submitList(  numberData: List<NumberData>){
        this.numberData=numberData;
    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var number: TextView = view.findViewById(R.id.txt_number)
        var bg: ConstraintLayout = view.findViewById(R.id.numberBg)



    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.color_item, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = numberData[position]
        holder.number.text = data.number.toString()
        holder.bg.setBackgroundColor(data.color);

        holder.bg.setOnClickListener {
            listener.onItemClickListener(data)
        }
    }
    override fun getItemCount(): Int {
        return numberData.size
    }
}