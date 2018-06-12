package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.model.au;
import java.io.IOException;

public final class c
{
  public e mcd;
  
  public c(String paramString)
  {
    this.mcd = new e(paramString, 10);
  }
  
  public static String bV(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = new StringBuilder();
      au.HU();
      return (String)com.tencent.mm.model.c.DT().get(9, null);
    }
    return paramString + "_" + paramInt;
  }
  
  public final d bU(String paramString, int paramInt)
  {
    paramString = e.readFromFile(this.mcd.mcn + bV(paramString, paramInt));
    if ((paramString == null) || (paramString.length == 0)) {
      return null;
    }
    try
    {
      paramString = (d)new d().aG(paramString);
      return paramString;
    }
    catch (IOException paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DraftBoxMgr", paramString, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */