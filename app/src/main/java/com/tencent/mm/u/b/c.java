package com.tencent.mm.u.b;

import org.json.JSONObject;

public abstract class c
  implements e
{
  private int index;
  public String name;
  
  public c(String paramString)
  {
    this.name = paramString;
  }
  
  public c(String paramString, int paramInt)
  {
    this.name = paramString;
    this.index = paramInt;
  }
  
  public final int getIndex()
  {
    return this.index;
  }
  
  public final String getName()
  {
    return this.name;
  }
  
  public abstract JSONObject tR();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/u/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */