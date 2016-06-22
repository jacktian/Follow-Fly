package com.suixin.vlee.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.suixin.vy.ui.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class GridViewLeePhoto extends Activity {
    private GridView gview;
    private List<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lee);
        gview = (GridView) findViewById(R.id.GridView1);
        //�½�List
        data_list = new ArrayList<Map<String, Object>>();
        //��ȡ����
        getData();
        //�½�������
        String [] from ={"image","text"};
        int [] to = {R.id.tv_usernameno5,R.id.action_settings};
        sim_adapter = new SimpleAdapter(this, data_list, R.layout.activity_main_lee, from, to);
        //����������
        gview.setAdapter(sim_adapter);
    }

    
    
    public List<Map<String, Object>> getData(){        
        //cion��iconName�ĳ�������ͬ�ģ�������ѡ��һ������
        for(int i=0;i<20;i++){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image",20);
            map.put("text", 20);
            data_list.add(map);
        }
            
        return data_list;
    }
    

}
