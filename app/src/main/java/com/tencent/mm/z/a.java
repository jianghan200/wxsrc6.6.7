package com.tencent.mm.z;

public final class a
{
  public String appId = "";
  public String bGW = "";
  public int bGX = 0;
  public String cfD = "";
  public int dGs = 0;
  public int dGt = 0;
  public boolean dGu = false;
  public boolean dGv = false;
  public long dGw = 0L;
  public double dGx = 1.0D;
  public d dGy;
  public String filePath = "";
  public int fromScene = 0;
  public String processName = "";
  
  public final boolean a(a parama)
  {
    if (parama == null) {}
    while ((this.bGW == null) || (!this.bGW.equalsIgnoreCase(parama.bGW)) || (this.cfD == null) || (!this.cfD.equalsIgnoreCase(parama.cfD))) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */