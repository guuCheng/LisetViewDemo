package com.example.gucheng.lisetviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gucheng on 2017/7/2.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    private int resouceId; //子项布局的id

    //构造函数
    public PersonAdapter(Context context, int resouceId,List<Person> objects){
        super(context,resouceId,objects);
        this.resouceId = resouceId;
    }

    //getView在每个子项滚动到屏幕的时候调用
    @Override
    public View getView(int position, View contentView, ViewGroup parents){
        //获取当前子项的位置(下标)
        Person person = getItem(position);//通过当前位置获取当前Item，每个Item是一个Person对象的实例
        //为当前滚入屏幕的子项添加自定义的子项布局
        View view = LayoutInflater.from(getContext()).inflate(resouceId,null);

        //为子项布局里面的控件set信息
        ImageView imageView = (ImageView)view.findViewById(R.id.list_view_iamge);
        TextView textViewName = (TextView)view.findViewById(R.id.list_view_name);
        TextView textViewPhoneNumber = (TextView)view.findViewById(R.id.list_view_phoneNumebr);
        //把当前实例person的信息添加到子项布局的控件里面
        imageView.setImageResource(person.getImageId());
        textViewName.setText(person.getName());
        textViewPhoneNumber.setText(person.getPhoneNumber());
        return  view;
    }
}
