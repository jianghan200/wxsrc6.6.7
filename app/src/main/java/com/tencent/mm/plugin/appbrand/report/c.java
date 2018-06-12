package com.tencent.mm.plugin.appbrand.report;

import android.os.Bundle;
import com.tencent.mm.compatible.util.p;

public final class c
{
  public static int h(int paramInt, Bundle paramBundle)
  {
    if ((paramBundle == null) || (!lC(paramInt))) {
      return 0;
    }
    return paramBundle.getInt("stat_scene");
  }
  
  public static String i(int paramInt, Bundle paramBundle)
  {
    if ((paramBundle == null) || (!lC(paramInt))) {
      return "";
    }
    switch (paramBundle.getInt("stat_scene"))
    {
    case 5: 
    default: 
      return "";
    case 1: 
      return paramBundle.getString("stat_send_msg_user");
    case 2: 
      str = paramBundle.getString("stat_chat_talker_username");
      paramBundle = paramBundle.getString("stat_send_msg_user");
      return str + ":" + paramBundle;
    case 3: 
      str = paramBundle.getString("stat_msg_id");
      paramBundle = paramBundle.getString("stat_send_msg_user");
      return str + ":" + paramBundle;
    case 4: 
      return p.encode(paramBundle.getString("stat_url"));
    case 6: 
      str = paramBundle.getString("stat_app_id");
      paramBundle = paramBundle.getString("stat_url");
      return str + ":" + p.encode(paramBundle);
    case 7: 
      return paramBundle.getString("stat_chat_talker_username");
    case 8: 
      return "search:" + paramBundle.getString("stat_search_id");
    }
    String str = paramBundle.getString("stat_chat_talker_username");
    paramBundle = paramBundle.getString("stat_send_msg_user");
    return str + ":" + paramBundle;
  }
  
  private static boolean lC(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */