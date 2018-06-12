package com.tencent.pb.a.a;

import com.tencent.pb.common.c.g;

public final class a
{
  private static String TAG = "AccountEngine";
  private static int vgk = 0;
  private static String vgl = "";
  
  public static void Hi(int paramInt)
  {
    vgk = paramInt;
  }
  
  public static void aci(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    vgl = str;
  }
  
  public static String cEG()
  {
    return vgl;
  }
  
  public static boolean cEH()
  {
    return !g.isEmpty(vgl);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/pb/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */