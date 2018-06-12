package com.tencent.mm.plugin.music.cache;

public abstract interface b
{
  public static final Long gin = Long.valueOf(86400000L);
  public static final Long gio = Long.valueOf(43200000L);
  public static final Long gip = Long.valueOf(240000L);
  public static final Long hQA;
  public static final Long lxt = Long.valueOf(2592000000L);
  public static final Long lxu = gin;
  public static final Long lxv = Long.valueOf(60000L);
  
  static
  {
    hQA = Long.valueOf(604800000L);
  }
  
  public abstract void bhJ();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/cache/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */