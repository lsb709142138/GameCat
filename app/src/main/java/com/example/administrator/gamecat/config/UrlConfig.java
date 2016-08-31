package com.example.administrator.gamecat.config;

/**
 * Created by Administrator on 2016/8/22.
 */
public class UrlConfig {

    public static class Base{
        public static String BASE_URL = "http://app.show.youximao.tv/";
        public static String BASE_UNION_DETAILS_URL = "http://guild.youximao.tv/";

        public static String LIVE_HOT_VERTICAL = "m/getRecommendMasters.action";
        public static String LIVE_NEWEST_VERTICAL = "m/getDistractionLive.action";
        public static String UNION_VERTICAL= "apppinteracerpc/appmainuc/guild.app";
        public static String UNION_DETAILS_VERTICAL= "guild/guildIndex.html";
    }
    public static class UnionKey{
        public static String CURRENT = "current";
        public static String PAGESIZE = "pageSize";
        public static String TOKEN = "token";
        public static String PPINF = "ppinf";
        public static String METHODNAME = "methodName";
        public static String LENGTH = "length";
        public static String GUILDID = "guildId";
        public static String SOURCE = "source";
        public static String MID = "mId";
        public static String NAME = "name";
    }
    public static class UnionHome{

        //工会首页
        //a8c59ae5266fb6ee14eb6bb49a1e7797
        //a8c59ae5266fb6ee14eb6bb49a1e7797
//        public static final String union =
//                "http://api.youximao.tv/apppinteracerpc/appmainuc/guild.app?token=a8c59ae5266fb6ee14eb6bb49a1e7797&methodName=guild_guildHomePage";

        public static String TOKEN = "a8c59ae5266fb6ee14eb6bb49a1e7797";
        public static String METHODNAME = "guild_guildHomePage";
    }

    public static class UnionAll{

        //全部工会
//        public static final String allUnion =
//                "http://api.youximao.tv/apppinteracerpc/appmainuc/guild.app?token=01a30e837881ad7a17b8fce9def84956current=0&length=10&methodName=guild_searchGuild&guildId=";
        public static String TOKEN = "a8c59ae5266fb6ee14eb6bb49a1e7797";
        public static String METHODNAME = "guild_searchGuild";
        public static String current = "0";
        public static String length = "10";

    }
    public static class UnionDetail{

        //工会详情
        //需拼接其中的guildId，通过工会首页guildList的mId获得
//        public static final String UnionDetails =
//                "http://guild.youximao.tv/guild/guildIndex.html?guildId=%d" +
//                        "&source=app";
        public static String SOURCE = "app";

    }

    public static class Unioning{
        //工会都在玩 点击跳转
        //需拼接最后的%d，通过工会首页gameList的mId获取
//        public static final String allPlay =
//                "http://api.youximao.tv/apppinteracerpc/appmainuc/guild.app?token=a8c59ae5266fb6ee14eb6bb49a1e7797
// &current=0&length=10&name=&methodName=guild_getGuildsByGame&mId=%d";
        public static String TOKEN = "a8c59ae5266fb6ee14eb6bb49a1e7797";
        public static String CURRENT = "0";
        public static String length = "10";
        public static String name = "";
        public static String methodName = "guild_getGuildsByGame";

    }

    public static class BabyAll{
        //全部宝贝
//        public static final String allBaby =
//                "http://api.youximao.tv/apppinteracerpc/appmainuc/guild.app?
// token=a8c59ae5266fb6ee14eb6bb49a1e7797&current=0&length=20&methodName=guild_getGuildBabyList";
        public static String TOKEN = "a8c59ae5266fb6ee14eb6bb49a1e7797";
        public static String current = "0";
        public static String length = "20";
        public static String methodName = "guild_getGuildBabyList";
    }
    //直播中热门类的url
    public static class LiveKey{
        //直播中最新类的URL
//        public static String BASE_PLAY_NEWEST_PATH = "http://app.show.youximao.tv/m/getDistractionLive.action?current=";
//        public static String PLAY_PATH = "&pageSize=20&token=a8c59ae5266fb6ee14eb6bb49a1e7797&ppinf=0%7C1471827401%7C0%7CdWlkOjk2NzE5OHxuaWNrbmFtZTolRTclQkIlOTklRTYlODglOTElRTQlQjglODAlRTklQTYlOTYlRTYlQUQlOEMlRTclOUElODQlRTYlOTclQjYlRTklOTclQjQwMHx2ZXJpZmllZDowfHJlZ3RpbWU6MTQ3MTgyNzQwMXx1c2VybmFtZToxMTQyNTYw";

        //    public static String BASE_PLAY_HOT_PATH = "http://app.show.youximao.tv/m/getRecommendMasters.action?current=";
        public static String current = "0";
        public static String pageSize = "20";
        public static String token = "a8c59ae5266fb6ee14eb6bb49a1e7797";
        public static String ppinf = "0%7C1471827401%7C0%7CdWlkOjk2NzE5OHxuaWNrbmFtZTolRTclQkIlOTklRTYlODglOTElRTQlQjglODAlRTklQTYlOTYlRTYlQUQlOEMlRTclOUElODQlRTYlOTclQjYlRTklOTclQjQwMHx2ZXJpZmllZDowfHJlZ3RpbWU6MTQ3MTgyNzQwMXx1c2VybmFtZToxMTQyNTYw";


    }


}
