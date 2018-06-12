package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.mm.pluginsdk.g.a.c.f.b;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  implements f.b
{
  final int bIC;
  final int bID;
  final int bIE;
  final boolean bIF;
  final String filePath;
  final boolean qBA;
  final String qBB;
  final int qBC;
  final byte[] qBD;
  final String qBE;
  final boolean qBF;
  final long qBG;
  final String qBH;
  final int qBI;
  final int qBJ;
  final String qBy;
  final boolean qBz;
  final String url;
  
  private a(String paramString1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3, String paramString3, int paramInt4, byte[] paramArrayOfByte, String paramString4, boolean paramBoolean4, long paramLong, String paramString5, String paramString6, int paramInt5, int paramInt6)
  {
    this.qBy = paramString1;
    this.bIC = paramInt1;
    this.bID = paramInt2;
    this.bIE = paramInt3;
    this.bIF = paramBoolean1;
    this.filePath = paramString2;
    this.qBz = paramBoolean2;
    this.qBA = paramBoolean3;
    this.qBB = paramString3;
    this.qBC = paramInt4;
    this.qBD = paramArrayOfByte;
    this.qBE = paramString4;
    this.qBF = paramBoolean4;
    this.qBG = paramLong;
    this.qBH = paramString5;
    this.url = paramString6;
    this.qBI = paramInt5;
    this.qBJ = paramInt6;
  }
  
  public static a a(s params)
  {
    return new a(params.field_urlKey, params.field_resType, params.field_subType, bi.getInt(params.field_fileVersion, 0), params.field_fileUpdated, params.field_filePath, params.field_fileEncrypt, params.field_fileCompress, params.field_encryptKey, params.field_keyVersion, params.field_eccSignature, params.field_originalMd5, bi.oV(params.field_groupId2).equals("NewXml"), params.field_reportId, params.field_sampleId, params.field_url, params.field_maxRetryTimes, params.field_retryTimes);
  }
  
  public final String cco()
  {
    return this.qBy;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */