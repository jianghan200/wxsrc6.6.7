package com.tencent.mm.plugin.ipcall.ui;

final class a
{
  String countryCode;
  String dYy;
  String dYz;
  private int ksI;
  
  public a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this.dYy = paramString1;
    this.countryCode = paramString2;
    this.ksI = paramInt;
    this.dYz = paramString3;
  }
  
  public final int aXZ()
  {
    if (this.ksI == 0) {
      return 0;
    }
    String[] arrayOfString = IPCallCountryCodeScrollbar.kuT;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(String.valueOf((char)this.ksI))) {
        return this.ksI;
      }
      i += 1;
    }
    return "#".charAt(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */