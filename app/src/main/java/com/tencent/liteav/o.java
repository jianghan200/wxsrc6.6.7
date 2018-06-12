package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;

public class o
{
  public static m a(Context paramContext, int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 4) || (paramInt == 4) || (paramInt == 6) || (paramInt == 3))
    {
      TXCLog.e("TXSDKUtil", "create player error not support type : " + paramInt);
      return null;
    }
    return new e(paramContext);
  }
  
  public static String a()
  {
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/liteav/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */