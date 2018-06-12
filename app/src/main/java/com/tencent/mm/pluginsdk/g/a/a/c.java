package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bi;

final class c
  extends l
{
  private final boolean bIJ;
  final String bKg;
  final long fileSize;
  volatile boolean pON;
  final long qBG;
  volatile byte[] qCe;
  
  private c(String paramString1, int paramInt1, String paramString2, boolean paramBoolean, long paramLong1, String paramString3, int paramInt2, long paramLong2, int paramInt3, int paramInt4)
  {
    super(paramString1, i.Ti(paramString1), String.valueOf(paramInt1), "CheckResUpdate", paramString3, "GET", paramInt2, paramInt3, paramInt4);
    this.bKg = paramString2;
    this.qBG = paramLong1;
    this.bIJ = paramBoolean;
    this.fileSize = paramLong2;
  }
  
  static c c(s params)
  {
    return new c(params.field_urlKey, bi.getInt(params.field_fileVersion, 0), params.field_md5, bi.oV(params.field_groupId2).equals("NewXml"), params.field_reportId, params.field_url, params.field_maxRetryTimes, params.field_fileSize, params.field_networkType, params.field_priority);
  }
  
  public final String aca()
  {
    return "CheckResUpdate";
  }
  
  public final boolean ccs()
  {
    return true;
  }
  
  public final String getFilePath()
  {
    return i.Ti(this.qBy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */