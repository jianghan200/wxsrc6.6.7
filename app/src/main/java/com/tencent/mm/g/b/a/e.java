package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Arrays;

public final class e
  extends a
{
  private String cgA = "";
  private long cgH = 0L;
  private long cgI = 0L;
  private String cgN = "";
  private long cgP = 0L;
  private long cgQ = 0L;
  private String cgS = "";
  private long cgT = 0L;
  private long cgU = 0L;
  private long cgV = 0L;
  private long cgW = 0L;
  private long cgX = 0L;
  private long cgY = 0L;
  private long cgZ = 0L;
  private int chA = 0;
  private String chB = "";
  private int chC = 0;
  private long chD = 0L;
  private long cha = 0L;
  private long chb = 0L;
  private long chc = 0L;
  private long chd = 0L;
  private String che = "";
  private long chf = 0L;
  private int chg = 0;
  private long chh = 0L;
  private long chi = 0L;
  private long chj = 0L;
  private long chk = 0L;
  private int chl = 0;
  private long chm = 0L;
  private long chn = 0L;
  private long cho = 0L;
  private long chp = 0L;
  private long chq = 0L;
  private long chr = 0L;
  private long chs = 0L;
  private int cht = 0;
  private int chu = 0;
  private long chv = 0L;
  private int chw = 0;
  private long chx = 0L;
  private long chy = 0L;
  private long chz = 0L;
  
  public e() {}
  
  public e(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 44) {
          break label780;
        }
        String[] arrayOfString = new String[44];
        Arrays.fill(arrayOfString, 0, 44, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label780:
    for (;;)
    {
      this.cgA = paramString[0];
      this.cgS = paramString[1];
      this.cgT = bi.getLong(paramString[2], 0L);
      this.cgH = bi.getLong(paramString[3], 0L);
      this.cgU = bi.getLong(paramString[4], 0L);
      this.cgV = bi.getLong(paramString[5], 0L);
      this.cgW = bi.getLong(paramString[6], 0L);
      this.cgX = bi.getLong(paramString[7], 0L);
      this.cgY = bi.getLong(paramString[8], 0L);
      this.cgZ = bi.getLong(paramString[9], 0L);
      this.cha = bi.getLong(paramString[10], 0L);
      this.chb = bi.getLong(paramString[11], 0L);
      this.chc = bi.getLong(paramString[12], 0L);
      this.chd = bi.getLong(paramString[13], 0L);
      this.che = paramString[14];
      this.chf = bi.getLong(paramString[15], 0L);
      this.chg = bi.getInt(paramString[16], 0);
      this.chh = bi.getLong(paramString[17], 0L);
      this.chi = bi.getLong(paramString[18], 0L);
      this.chj = bi.getLong(paramString[19], 0L);
      this.chk = bi.getLong(paramString[20], 0L);
      this.chl = bi.getInt(paramString[21], 0);
      this.chm = bi.getLong(paramString[22], 0L);
      this.chn = bi.getLong(paramString[23], 0L);
      this.cho = bi.getLong(paramString[24], 0L);
      this.chp = bi.getLong(paramString[25], 0L);
      this.chq = bi.getLong(paramString[26], 0L);
      this.chr = bi.getLong(paramString[27], 0L);
      this.chs = bi.getLong(paramString[28], 0L);
      this.cht = bi.getInt(paramString[29], 0);
      this.chu = bi.getInt(paramString[30], 0);
      this.chv = bi.getLong(paramString[31], 0L);
      this.chw = bi.getInt(paramString[32], 0);
      this.cgI = bi.getLong(paramString[33], 0L);
      this.cgN = paramString[34];
      this.chx = bi.getLong(paramString[35], 0L);
      this.chy = bi.getLong(paramString[36], 0L);
      this.chz = bi.getLong(paramString[37], 0L);
      this.chA = bi.getInt(paramString[38], 0);
      this.chB = paramString[39];
      this.chC = bi.getInt(paramString[40], 0);
      this.chD = bi.getLong(paramString[41], 0L);
      this.cgP = bi.getLong(paramString[42], 0L);
      this.cgQ = bi.getLong(paramString[43], 0L);
      return;
    }
  }
  
  public final int getId()
  {
    return 13570;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgS);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgT);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgU);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgV);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgW);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgX);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgY);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgZ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cha);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chb);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chc);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chd);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.che);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chf);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chg);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chh);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chi);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chj);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chk);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chl);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chm);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chn);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cho);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chp);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chq);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chr);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chs);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cht);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chu);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chv);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chw);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.chD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgQ);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FileId:").append(this.cgA);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FileAesKey:").append(this.cgS);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FileLength:").append(this.cgT);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoDuration:").append(this.cgH);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadLength:").append(this.cgU);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("PlayDuration:").append(this.cgV);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstPlayWaitTime:").append(this.cgW);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovWaitTime:").append(this.cgX);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("BlockCount:").append(this.cgY);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("RegainAvgTime:").append(this.cgZ);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NetworkType:").append(this.cha);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadType:").append(this.chb);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("StartDownloadTime:").append(this.chc);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EndDownloadTime:").append(this.chd);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ChatName:").append(this.che);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MemberCount:").append(this.chf);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("RetCode:").append(this.chg);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("EnterQueueTime:").append(this.chh);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstReqCostTime:").append(this.chi);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstReqSize:").append(this.chj);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstReqDownloadSize:").append(this.chk);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstReqCompleted:").append(this.chl);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AvgSpeed:").append(this.chm);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AvgConnectCost:").append(this.chn);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FirstConnectCostTime:").append(this.cho);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NetConnectTimes:").append(this.chp);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovReqTimes:").append(this.chq);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovCostTime:").append(this.chr);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovSize:").append(this.chs);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovCompleted:").append(this.cht);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovFailReason:").append(this.chu);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("UiStayTime:").append(this.chv);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("PlayErrorCode:").append(this.chw);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoBitrate:").append(this.cgI);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CDNIp:").append(this.cgN);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MessageCreateTime:").append(this.chx);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NewMsgId:").append(this.chy);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("InitialDownloadLength:").append(this.chz);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoFormat:").append(this.chA);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("XClientIp:").append(this.chB);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("IsCrossNet:").append(this.chC);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("MoovPosition:").append(this.chD);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("HadPreloadSize:").append(this.cgP);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("HadPreloadCompletion:").append(this.cgQ);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */