package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.mm.sdk.platformtools.bi;

public final class m
{
  public int backgroundColor;
  public Object data;
  public int end;
  public String fmS;
  public int linkColor;
  public int start;
  public int type;
  public String url;
  public String username;
  
  @Deprecated
  public m(int paramInt1, int paramInt2)
  {
    this.start = paramInt1;
    this.end = paramInt2;
    this.url = null;
    this.type = 0;
    this.data = null;
  }
  
  public m(String paramString, int paramInt, Object paramObject)
  {
    this.url = paramString;
    this.data = paramObject;
    this.type = paramInt;
  }
  
  public final <T> T F(Class<T> paramClass)
  {
    if (paramClass.isInstance(this.data)) {
      return (T)paramClass.cast(this.data);
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof m)) {
      return hashCode() == ((m)paramObject).hashCode();
    }
    return super.equals(paramObject);
  }
  
  public final int hashCode()
  {
    int j = super.hashCode();
    int i = j;
    if (!bi.oW(this.url)) {
      i = j + this.url.hashCode();
    }
    j = i + this.type + this.end + this.start;
    i = j;
    if (this.data != null) {
      i = j + this.data.hashCode();
    }
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */