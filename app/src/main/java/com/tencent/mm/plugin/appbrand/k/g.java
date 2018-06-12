package com.tencent.mm.plugin.appbrand.k;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class g
{
  public volatile boolean bgH = false;
  String fEl;
  int gkT;
  Map<String, String> gkX;
  ArrayList<String> gkY;
  int gkZ = 15;
  HttpURLConnection glb = null;
  String glc;
  String glh;
  Map<String, String> gli;
  f.a glj;
  String mFileName;
  String mMimeType;
  String mName;
  String mUrl;
  private long startTime;
  
  g(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, f.a parama)
  {
    this.glh = paramString1;
    this.mUrl = paramString2;
    this.glj = parama;
    this.mName = paramString3;
    this.mFileName = paramString4;
    this.gkT = paramInt;
    this.mMimeType = paramString5;
    this.startTime = System.currentTimeMillis();
  }
  
  public final int alt()
  {
    return (int)(System.currentTimeMillis() - this.startTime);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */