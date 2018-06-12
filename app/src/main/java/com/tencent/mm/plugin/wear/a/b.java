package com.tencent.mm.plugin.wear.a;

public final class b
{
  public static final boolean PS(String paramString)
  {
    try
    {
      boolean bool = paramString.split("/")[2].equals("wear");
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static final int PT(String paramString)
  {
    try
    {
      int i = Integer.valueOf(paramString.split("/")[4]).intValue();
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wear/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */