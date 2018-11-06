package top.koguma.gymclub.adapter;

import android.content.Context;
import android.icu.util.ValueIterator;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.laputapp.ui.adapter.RxRecyclerAdapter;
import top.koguma.gymclub.R;
import top.koguma.gymclub.model.ListItem;

public class ListAdapter extends RxRecyclerAdapter<ListItem> {

    public ListAdapter(Context context) {
        super(context);
    }

    @Override
    public void bindView(ListItem item, int position, RecyclerView.ViewHolder viewHolder) {
        ListViewHolder holder = (ListViewHolder) viewHolder;
        holder.bind(item);
    }

    @NonNull @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        private SimpleDraweeView image;
        private SimpleDraweeView userAvatar;
        private TextView title;
        private TextView userName;
        private TextView flavor;

        ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img_item);
            title = itemView.findViewById(R.id.txt_title);
            userName = itemView.findViewById(R.id.txt_name);
            flavor = itemView.findViewById(R.id.txt_flavor);
            image.setAspectRatio(1.33f);
        }

        public void bind(ListItem item) {
            title.setText(item.title);
            userName.setText(item.userName);
            flavor.setText(item.flavors);
        }

    }
}
