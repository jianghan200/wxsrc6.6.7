package com.tencent.matrix.c;

import org.json.JSONObject;

public final class b
{
  public String aAL;
  public Integer brl;
  public JSONObject brm;
  public com.tencent.matrix.b.b brn;
  public String tag;
  
  public b() {}
  
  public b(int paramInt)
  {
    this.brl = Integer.valueOf(paramInt);
  }
  
  public b(JSONObject paramJSONObject)
  {
    this.brm = paramJSONObject;
  }
  
  public final String toString()
  {
    return String.format("tag[%s]type[%d];key[%s];content[%s]", new Object[] { this.tag, this.brl, this.aAL, this.brm });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */