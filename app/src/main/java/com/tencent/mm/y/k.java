package com.tencent.mm.y;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class k
{
  public int dzu;
  public int dzv;
  
  public static final k gv(String paramString)
  {
    k localk = new k();
    paramString = g.a.J(paramString, null);
    if (paramString != null)
    {
      paramString = paramString.dzf;
      if (paramString != null)
      {
        localk.dzu = bi.getInt((String)paramString.get(".msg.appmsg.xmlfulllen"), 0);
        localk.dzv = bi.getInt((String)paramString.get(".msg.appmsg.realinnertype"), 0);
      }
    }
    return localk;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/y/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */