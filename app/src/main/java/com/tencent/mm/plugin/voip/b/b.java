package com.tencent.mm.plugin.voip.b;

import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static Map<Integer, String> oSV;
  
  static
  {
    HashMap localHashMap = new HashMap();
    oSV = localHashMap;
    localHashMap.put(Integer.valueOf(0), "CALLING_STATE_VIDEO_INVITING");
    oSV.put(Integer.valueOf(1), "CALLING_STATE_VOICE_INVITING");
    oSV.put(Integer.valueOf(2), "CALLING_STATE_VIDEO_WAITTING_ACCEPT");
    oSV.put(Integer.valueOf(3), "CALLING_STATE_VOICE_WAITTING_ACCEPT");
    oSV.put(Integer.valueOf(4), "CALLING_STATE_VIDEO_CONNECTING");
    oSV.put(Integer.valueOf(5), "CALLING_STATE_VOICE_CONNECTING");
    oSV.put(Integer.valueOf(6), "CALLING_STATE_VIDEO_TALKING");
    oSV.put(Integer.valueOf(7), "CALLING_STATE_VOICE_TALKING");
    oSV.put(Integer.valueOf(8), "CALLING_STATE_FINISH");
    oSV.put(Integer.valueOf(256), "CALLED_STATE_VIDEO_INVITING");
    oSV.put(Integer.valueOf(257), "CALLED_STATE_VOICE_INVITING");
    oSV.put(Integer.valueOf(258), "CALLED_STATE_VIDEO_CONNECTING");
    oSV.put(Integer.valueOf(259), "CALLED_STATE_VOICE_CONNECTING");
    oSV.put(Integer.valueOf(260), "CALLED_STATE_VIDEO_TALKING");
    oSV.put(Integer.valueOf(261), "CALLED_STATE_VOICE_TALKING");
    oSV.put(Integer.valueOf(262), "CALLED_STATE_FINISH");
    oSV.put(Integer.valueOf(4096), "ACTION_NOP");
    oSV.put(Integer.valueOf(4097), "ACTION_INVITE_RESPOND");
    oSV.put(Integer.valueOf(4098), "ACTION_CANCEL_INVITE");
    oSV.put(Integer.valueOf(4099), "ACTION_REJECT_INVITE");
    oSV.put(Integer.valueOf(4100), "ACTION_ACCEPT_INVITE");
    oSV.put(Integer.valueOf(4101), "ACTION_CLOSE_CAMERA");
    oSV.put(Integer.valueOf(4102), "ACTION_CONNECT_SUCC");
    oSV.put(Integer.valueOf(4103), "ACTION_SELF_HANGUP");
    oSV.put(Integer.valueOf(4104), "ACTION_ANOTHER_HANGUP");
    oSV.put(Integer.valueOf(4105), "ACTION_INVITE_TIMEOUT");
    oSV.put(Integer.valueOf(4106), "ACTION_SO_SHUTDOWN");
    oSV.put(Integer.valueOf(4107), "ACTION_PHONE_COMING");
    oSV.put(Integer.valueOf(4108), "ACTION_IGNORE_INVITE");
    oSV.put(Integer.valueOf(4109), "ACTION_ON_ERROR");
    oSV.put(Integer.valueOf(4110), "ACTION_SESSION_CALLED");
  }
  
  public static int I(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    if ((true == paramBoolean1) && (true == paramBoolean2)) {
      i = 0;
    }
    while ((true == paramBoolean1) && (!paramBoolean2)) {
      return i;
    }
    if ((!paramBoolean1) && (true == paramBoolean2)) {
      return 256;
    }
    return 257;
  }
  
  public static String yR(int paramInt)
  {
    if (oSV.containsKey(Integer.valueOf(paramInt))) {
      return (String)oSV.get(Integer.valueOf(paramInt));
    }
    return "no found value";
  }
  
  public static c yS(int paramInt)
  {
    c localc = new c(paramInt);
    localc.Y(256, 4098, 262);
    localc.Y(256, 4099, 262);
    localc.Y(256, 4105, 262);
    localc.Y(256, 4106, 262);
    localc.Y(256, 4107, 262);
    localc.Y(256, 4108, 262);
    localc.Y(256, 4109, 262);
    localc.Y(256, 4100, 258);
    localc.Y(256, 4101, 257);
    localc.Y(257, 4100, 259);
    localc.Y(257, 4098, 262);
    localc.Y(257, 4099, 262);
    localc.Y(257, 4105, 262);
    localc.Y(257, 4106, 262);
    localc.Y(257, 4107, 262);
    localc.Y(257, 4108, 262);
    localc.Y(257, 4109, 262);
    localc.Y(258, 4098, 262);
    localc.Y(258, 4106, 262);
    localc.Y(258, 4107, 262);
    localc.Y(258, 4103, 262);
    localc.Y(258, 4109, 262);
    localc.Y(258, 4102, 260);
    localc.Y(259, 4102, 261);
    localc.Y(259, 4098, 262);
    localc.Y(259, 4106, 262);
    localc.Y(259, 4107, 262);
    localc.Y(259, 4103, 262);
    localc.Y(259, 4109, 262);
    localc.Y(260, 4101, 261);
    localc.Y(260, 4103, 262);
    localc.Y(260, 4104, 262);
    localc.Y(260, 4106, 262);
    localc.Y(260, 4107, 262);
    localc.Y(260, 4109, 262);
    localc.Y(261, 4103, 262);
    localc.Y(261, 4104, 262);
    localc.Y(261, 4106, 262);
    localc.Y(261, 4107, 262);
    localc.Y(261, 4109, 262);
    return localc;
  }
  
  public static c yT(int paramInt)
  {
    c localc = new c(paramInt);
    localc.Y(0, 4098, 8);
    localc.Y(0, 4106, 8);
    localc.Y(0, 4107, 8);
    localc.Y(0, 4109, 8);
    localc.Y(0, 4097, 2);
    localc.Y(0, 4101, 1);
    localc.Y(1, 4097, 3);
    localc.Y(1, 4098, 8);
    localc.Y(1, 4106, 8);
    localc.Y(1, 4107, 8);
    localc.Y(1, 4109, 8);
    localc.Y(2, 4098, 8);
    localc.Y(2, 4099, 8);
    localc.Y(2, 4105, 8);
    localc.Y(2, 4106, 8);
    localc.Y(2, 4107, 8);
    localc.Y(2, 4109, 8);
    localc.Y(2, 4100, 4);
    localc.Y(2, 4101, 3);
    localc.Y(3, 4100, 5);
    localc.Y(3, 4098, 8);
    localc.Y(3, 4099, 8);
    localc.Y(3, 4105, 8);
    localc.Y(3, 4106, 8);
    localc.Y(3, 4107, 8);
    localc.Y(3, 4109, 8);
    localc.Y(4, 4102, 6);
    localc.Y(4, 4101, 5);
    localc.Y(5, 4102, 7);
    localc.Y(6, 4103, 8);
    localc.Y(6, 4104, 8);
    localc.Y(6, 4106, 8);
    localc.Y(6, 4107, 8);
    localc.Y(6, 4109, 8);
    localc.Y(6, 4101, 7);
    localc.Y(7, 4103, 8);
    localc.Y(7, 4104, 8);
    localc.Y(7, 4106, 8);
    localc.Y(7, 4107, 8);
    localc.Y(7, 4109, 8);
    localc.Y(4, 4098, 8);
    localc.Y(4, 4099, 8);
    localc.Y(4, 4106, 8);
    localc.Y(4, 4107, 8);
    localc.Y(4, 4103, 8);
    localc.Y(4, 4109, 8);
    localc.Y(5, 4098, 8);
    localc.Y(5, 4099, 8);
    localc.Y(5, 4106, 8);
    localc.Y(5, 4107, 8);
    localc.Y(5, 4103, 8);
    localc.Y(5, 4109, 8);
    localc.Y(0, 4110, 4);
    localc.Y(1, 4110, 5);
    return localc;
  }
  
  public static boolean yU(int paramInt)
  {
    return (260 == paramInt) || (261 == paramInt) || (6 == paramInt) || (7 == paramInt);
  }
  
  public static boolean yV(int paramInt)
  {
    return (paramInt == 0) || (2 == paramInt) || (4 == paramInt) || (6 == paramInt) || (256 == paramInt) || (258 == paramInt) || (260 == paramInt);
  }
  
  public static boolean yW(int paramInt)
  {
    return (1 == paramInt) || (paramInt == 0) || (2 == paramInt) || (3 == paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */