package com.example.administrator.gamecat.retrofit;

import com.example.administrator.gamecat.bean.MessageBean;
import com.example.administrator.gamecat.bean.LiveBean;
import com.example.administrator.gamecat.bean.UnionBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/8/30.
 */
public interface IGemeCat {
    @GET()
    Call<MessageBean> getMessageData(@QueryMap()Map<String,String> params);
    @GET()
    Call<UnionBean> getUnionData(@QueryMap()Map<String,String> params);
    @GET()
    Call<LiveBean> getPlayData(@QueryMap()Map<String,String> params);
}
