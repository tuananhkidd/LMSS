package com.kidd.projectbase.utils;

import android.app.Activity;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

import com.kidd.projectbase.App;

public class ToastUtil {

    public static Toast showToastCustom(Activity activity, @StringRes int contentId, @DrawableRes int drawableId){
        LayoutInflater inflater = activity.getLayoutInflater();
//        View layout = inflater.inflate(layoutRes,null);

//        ImageView image = (ImageView) layout.findViewById(R.id.img);
//        Glide.with(activity)
//                .load(drawableId)
//                .into(image);
//        TextView tvTitle = (TextView) layout.findViewById(R.id.tvTitle);
//        tvTitle.setVisibility(View.GONE);
//        TextView tvContent = (TextView) layout.findViewById(R.id.tvContent);
//        tvContent.setText(contentId);

        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
        toast.show();
        return toast;
    }

    public static Toast showToastCustom(Activity activity, @StringRes int titleId, @StringRes int contentId, @DrawableRes int drawableId){
        LayoutInflater inflater = activity.getLayoutInflater();
//        View layout = inflater.inflate(R.layout.toast_custom_dialog,null);
//
//        ImageView image = (ImageView) layout.findViewById(R.id.img);
//        Glide.with(activity)
//                .load(drawableId)
//                .into(image);
//        TextView tvTitle = (TextView) layout.findViewById(R.id.tvTitle);
//        tvTitle.setText(titleId);
//        TextView tvContent = (TextView) layout.findViewById(R.id.tvContent);
//        tvContent.setText(contentId);

        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
        toast.show();
        return toast;
    }

    public static void show(String content){
        Toast.makeText(App.getContext(), content, Toast.LENGTH_SHORT).show();
    }
    public static void show(@StringRes int content){
        Toast.makeText(App.getContext(), App.getContext().getString(content), Toast.LENGTH_SHORT).show();
    }
}