package com.tencent.mm.plugin.report.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class d
{
  public String bKg;
  public long mEn;
  public long mEo;
  public String mEp;
  public boolean mEq;
  public String value;
  
  public d() {}
  
  public d(long paramLong1, String paramString, long paramLong2, boolean paramBoolean)
  {
    this.mEn = paramLong1;
    this.value = paramString;
    this.mEo = paramLong2;
    this.mEq = paramBoolean;
    this.mEp = new SimpleDateFormat("[yy-MM-dd HH:mm:ss:SSS]").format(new Date(paramLong2));
  }
  
  public final String toString()
  {
    return this.mEp + ":" + this.value;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */