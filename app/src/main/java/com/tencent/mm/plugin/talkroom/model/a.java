package com.tencent.mm.plugin.talkroom.model;

import com.tencent.mm.compatible.e.m;

public final class a
{
  public static final int ovJ;
  private static int ovW;
  
  static
  {
    int i = m.zj();
    ovW = i;
    if ((i & 0x400) != 0) {}
    for (i = 16000;; i = 8000)
    {
      ovJ = i;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */