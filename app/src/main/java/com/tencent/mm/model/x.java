package com.tencent.mm.model;

public class x
{
  public final boolean bKe;
  private final String bWI;
  private final String dBm;
  private boolean dBn;
  private final String name;
  private final String type;
  
  public x()
  {
    this.type = "";
    this.name = "";
    this.bWI = "";
    this.dBm = "";
    this.bKe = true;
  }
  
  public x(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.type = paramString1;
    this.name = paramString2;
    this.bWI = paramString3;
    this.dBm = paramString4;
    this.bKe = paramBoolean1;
    this.dBn = paramBoolean2;
  }
  
  public final String BK()
  {
    if (this.bWI == null) {
      return "";
    }
    return this.bWI;
  }
  
  public final String Hz()
  {
    if (this.dBm == null) {
      return "";
    }
    return this.dBm;
  }
  
  public final String getType()
  {
    if (this.type == null) {
      return "";
    }
    return this.type;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */