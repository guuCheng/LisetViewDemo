package com.example.gucheng.lisetviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  List<Person> personList = new ArrayList<Person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化Person信息
        initPerson();
        PersonAdapter personAdapter = new PersonAdapter(MainActivity.this,R.layout.list_item,personList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(personAdapter);
    }

    //初始化Person信息
    private void initPerson(){
        Person person1 = new Person(R.mipmap.ic_launcher,"gucheng","123445555");
        personList.add(person1);

        Person person2 = new Person(R.mipmap.ic_launcher,"guchengcheng","23312313");
        personList.add(person2);

        Person  person3  = new Person(R.mipmap.ic_launcher,"gudacheng","28i40198204");
        personList.add(person3);
    }
}
