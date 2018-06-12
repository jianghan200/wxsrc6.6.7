package com.tencent.mm.sdk.platformtools;

public final class g
{
  public static String gVK = "]]>";
  public StringBuffer gVP = new StringBuffer();
  public String sFG = "";
  
  public g() {}
  
  public g(String paramString)
  {
    this.sFG = paramString;
    wA(this.sFG);
  }
  
  private void wA(String paramString)
  {
    this.gVP.append("<" + paramString + ">");
  }
  
  public final void bR(String paramString1, String paramString2)
  {
    wA(paramString1);
    if (!bi.oW(paramString2))
    {
      if (!paramString2.contains(gVK)) {
        break label60;
      }
      this.gVP.append("<![CDATA[" + bi.WS(paramString2) + "]]>");
    }
    for (;;)
    {
      wB(paramString1);
      return;
      label60:
      this.gVP.append("<![CDATA[" + paramString2 + "]]>");
    }
  }
  
  public final void wB(String paramString)
  {
    this.gVP.append("</" + paramString + ">");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/sdk/platformtools/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */