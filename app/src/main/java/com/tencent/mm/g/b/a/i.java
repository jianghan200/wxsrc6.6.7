package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Arrays;

public final class i
  extends a
{
  private String cgB = "";
  private int cgC = 0;
  private String cgD = "";
  private String cgN = "";
  private long cgO = 0L;
  private String chT = "";
  private String chU = "";
  private String chV = "";
  private String chW = "";
  private long chX = 0L;
  private long chY = 0L;
  private long chZ = 0L;
  private long cia = 0L;
  private long cib = 0L;
  private long cic = 0L;
  private long cid = 0L;
  private long cie = 0L;
  private long cif = 0L;
  private int cig = 0;
  private long cih = 0L;
  private long cii = 0L;
  private long cij = 0L;
  private long cik = 0L;
  private long cil = 0L;
  private long cim = 0L;
  private long cin = 0L;
  private long cio = 0L;
  
  public i() {}
  
  public i(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 27) {
          break label485;
        }
        String[] arrayOfString = new String[27];
        Arrays.fill(arrayOfString, 0, 27, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label485:
    for (;;)
    {
      this.chT = paramString[0];
      this.chU = paramString[1];
      this.cgC = bi.getInt(paramString[2], 0);
      this.chV = paramString[3];
      this.cgD = paramString[4];
      this.chW = paramString[5];
      this.chX = bi.getLong(paramString[6], 0L);
      this.chY = bi.getLong(paramString[7], 0L);
      this.chZ = bi.getLong(paramString[8], 0L);
      this.cia = bi.getLong(paramString[9], 0L);
      this.cib = bi.getLong(paramString[10], 0L);
      this.cic = bi.getLong(paramString[11], 0L);
      this.cid = bi.getLong(paramString[12], 0L);
      this.cie = bi.getLong(paramString[13], 0L);
      this.cif = bi.getLong(paramString[14], 0L);
      this.cig = bi.getInt(paramString[15], 0);
      this.cih = bi.getLong(paramString[16], 0L);
      this.cii = bi.getLong(paramString[17], 0L);
      this.cij = bi.getLong(paramString[18], 0L);
      this.cik = bi.getLong(paramString[19], 0L);
      this.cil = bi.getLong(paramString[20], 0L);
      this.cim = bi.getLong(paramString[21], 0L);
      this.cin = bi.getLong(paramString[22], 0L);
      this.cio = bi.getLong(paramString[23], 0L);
      this.cgN = paramString[24];
      this.cgO = bi.getLong(paramString[25], 0L);
      this.cgB = paramString[26];
      return;
    }
  }
  
  public final int getId()
  {
    return 13794;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.chT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cia);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cib);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cic);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cid);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cie);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cif);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cig);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cih);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cii);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cij);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cik);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cil);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cim);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cin);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cio);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgB);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ToUser:").append(this.chT);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MsgSource:").append(this.chU);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NetType:").append(this.cgC);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FieldId:").append(this.chV);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NewMd5:").append(this.cgD);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SnsInfoId:").append(this.chW);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("UploadStartTime:").append(this.chX);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("UploadEndTime:").append(this.chY);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalSize:").append(this.chZ);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalDuration:").append(this.cia);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalVideoBitrate:").append(this.cib);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalAudioBitrate:").append(this.cic);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalFps:").append(this.cid);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalWidth:").append(this.cie);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalHeight:").append(this.cif);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpStatus:").append(this.cig);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpSize:").append(this.cih);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpDuration:").append(this.cii);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpVideoBitrate:").append(this.cij);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpAudioiBitrate:").append(this.cik);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpFps:").append(this.cil);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpWidth:").append(this.cim);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CpHeight:").append(this.cin);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SendScene:").append(this.cio);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CDNIp:").append(this.cgN);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalAudioChannel:").append(this.cgO);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SnsUrl:").append(this.cgB);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/g/b/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */