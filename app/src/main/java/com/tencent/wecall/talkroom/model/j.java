package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.common.c.c;

public final class j
{
  public static boolean ads(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.startsWith("client_");
  }
  
  public static int cIc()
  {
    try
    {
      int i = a.cHu().kvL;
      return i;
    }
    catch (Exception localException)
    {
      c.x("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomId err: ", localException });
    }
    return 0;
  }
  
  public static long cId()
  {
    try
    {
      long l = a.cHu().vxz;
      return l;
    }
    catch (Exception localException)
    {
      c.x("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomKey err: ", localException });
    }
    return 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wecall/talkroom/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */