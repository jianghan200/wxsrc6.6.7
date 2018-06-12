package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.g;

public final class m
{
  public String appId;
  public int bGF;
  public final String bJK;
  public int cbu;
  public final g fdD;
  public String grI;
  public volatile long gsj;
  public volatile boolean gsk = false;
  public int gsl;
  public int gsm;
  public long gsn;
  public long gso;
  public int scene;
  
  public m(g paramg)
  {
    this.fdD = paramg;
    this.bJK = paramg.fct.fdE;
  }
  
  public final String toString()
  {
    return "kv_14576{, networkType='" + this.grI + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.cbu + ", appState=" + this.bGF + ", scene=" + this.scene + ", sessionId='" + this.bJK + '\'' + ", is_download_code=" + this.gsl + ", is_load_x5=" + this.gsm + ", cost_time=" + this.gsn + ", event_time=" + this.gso + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */