package com.tencent.mm.plugin.appbrand.k;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class d
{
  String fEl;
  int gkT;
  byte[] gkU;
  String gkV;
  c.a gkW;
  Map<String, String> gkX;
  ArrayList<String> gkY;
  int gkZ = 15;
  String gla;
  HttpURLConnection glb;
  String glc;
  String mUrl;
  private long startTime;
  
  public d(String paramString1, byte[] paramArrayOfByte, int paramInt, c.a parama, String paramString2)
  {
    this.mUrl = paramString1;
    this.gkU = paramArrayOfByte;
    this.gkW = parama;
    this.gkT = paramInt;
    this.gkV = paramString2;
    this.startTime = System.currentTimeMillis();
  }
  
  public final int alt()
  {
    return (int)(System.currentTimeMillis() - this.startTime);
  }
  
  public final long getDataSize()
  {
    if (this.gkU != null) {
      return this.gkU.length;
    }
    return 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */