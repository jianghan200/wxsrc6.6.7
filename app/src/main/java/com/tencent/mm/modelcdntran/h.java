package com.tencent.mm.modelcdntran;

public final class h
  extends i
{
  public int csS = -1;
  public String dPP;
  public String[] dPQ;
  public String[] dPR;
  public int dPS;
  public int dPT;
  public int dPU = -1;
  public int fileType = 0;
  public String host;
  public boolean isColdSnsData;
  public String referer;
  public String signalQuality;
  public String snsCipherKey = "";
  public String snsScene;
  public String url;
  
  public h()
  {
    this.dQf = true;
  }
  
  private static String g(String[] paramArrayOfString)
  {
    Object localObject;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      localObject = "";
      return (String)localObject;
    }
    String str = "";
    int j = paramArrayOfString.length;
    int i = 0;
    for (;;)
    {
      localObject = str;
      if (i >= j) {
        break;
      }
      localObject = paramArrayOfString[i];
      str = str + (String)localObject + ",";
      i += 1;
    }
  }
  
  public final String toString()
  {
    return String.format("mediaId:%s, url:%s, host:%s, referer:%s, savepath:%s, iplist:%s, slaveIplist:%siplistSource:%d, dcSource:%d, isColdSnsData:%b, signalQuality:%s, snsScene:%s", new Object[] { this.field_mediaId, this.url, this.host, this.referer, this.dPP, g(this.dPQ), g(this.dPR), Integer.valueOf(this.dPS), Integer.valueOf(this.dPT), Boolean.valueOf(this.isColdSnsData), this.signalQuality, this.snsScene });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelcdntran/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */