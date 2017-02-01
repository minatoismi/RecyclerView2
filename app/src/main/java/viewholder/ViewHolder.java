package viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.learn.recyclerview2.R;

/**
 * Created by sonic on 01/02/2017.
 */
public class ViewHolder extends RecyclerView.ViewHolder
{
    ImageView ivFoto;
    TextView tvJudul;
    TextView tvDeskripsi;

    public ViewHolder(View itemView) {
        super(itemView);
        ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
        tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
    }
}
