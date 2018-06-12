package com.tencent.mm.plugin.sns.data;

public final class h
{
  public String bOX = "";
  public String desc = "";
  public int fileSize = 0;
  public int height = -1;
  public int nkW = 0;
  public int nkX;
  public int nkY;
  public int nkZ;
  public String nla = "";
  public String nlb = "";
  public String nlc = "";
  public boolean nld = false;
  public String path = "";
  public int type;
  public int width = -1;
  
  public h() {}
  
  public h(int paramInt1, int paramInt2)
  {
    this.nkZ = paramInt1;
    this.type = paramInt2;
    this.path = "";
  }
  
  public h(String paramString, int paramInt)
  {
    this.path = paramString;
    this.type = paramInt;
    this.nkZ = -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/data/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */