package top.koguma.gymclub.helper;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.youth.banner.loader.ImageLoader;

public class BannerImageLoader extends ImageLoader {

    @Override public void displayImage(Context context, Object path, ImageView imageView) {
        Uri uri = Uri.parse((String) path);
        imageView.setImageURI(uri);
    }

    @Override public ImageView createImageView(Context context) {
        return new SimpleDraweeView(context);
    }
}
