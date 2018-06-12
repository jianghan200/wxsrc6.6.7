package com.tencent.wecall.talkroom.model;

import com.tencent.pb.common.c.c;

public class a
{
  private static a vwV = null;
  private f vwW = null;
  
  public static a cHt()
  {
    if (vwV == null) {}
    try
    {
      if (vwV == null) {
        vwV = new a();
      }
      return vwV;
    }
    finally {}
  }
  
  public static f cHu()
  {
    a locala = cHt();
    if (locala.vwW == null) {}
    try
    {
      if (locala.vwW == null) {
        locala.vwW = new f();
      }
      return locala.vwW;
    }
    finally {}
  }
  
  public static void cHv()
  {
    c.d("MicroMsg.Voip", new Object[] { "registerEvents" });
    cHu();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/wecall/talkroom/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */