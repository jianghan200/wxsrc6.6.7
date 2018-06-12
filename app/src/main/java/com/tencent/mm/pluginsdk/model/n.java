package com.tencent.mm.pluginsdk.model;

public final class n
{
  public String bKk;
  private int qzc;
  public String qzd;
  public String qze;
  public String qzf;
  public int qzg;
  
  n(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    this.qzc = paramInt1;
    this.bKk = paramString1;
    this.qzd = paramString2;
    this.qzg = paramInt2;
    this.qze = paramString3;
    this.qzf = paramString4;
  }
  
  public final String toString()
  {
    return "id:" + this.qzc + ";productId:" + this.bKk + ";full:" + this.qzd + ";productState:" + this.qzg + ";priceCurrencyCode:" + this.qze + ";priceAmountMicros:" + this.qzf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */