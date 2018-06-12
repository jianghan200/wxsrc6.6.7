package com.tencent.mm.plugin.appbrand.widget.input.c;

public enum c
{
  public final int style;
  
  private c(int paramInt)
  {
    this.style = paramInt;
  }
  
  public static c wk(String paramString)
  {
    paramString = d.h(paramString, c.class);
    c localc = gLs;
    if (paramString == null) {
      paramString = localc;
    }
    for (;;)
    {
      return (c)paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */