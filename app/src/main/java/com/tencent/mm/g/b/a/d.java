package com.tencent.mm.g.b.a;

import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Arrays;

public final class d
  extends a
{
  private String cgA = "";
  private String cgB = "";
  private int cgC = 0;
  private String cgD = "";
  private long cgE = 0L;
  private long cgF = 0L;
  private long cgG = 0L;
  private long cgH = 0L;
  private long cgI = 0L;
  private long cgJ = 0L;
  private long cgK = 0L;
  private long cgL = 0L;
  private long cgM = 0L;
  private String cgN = "";
  private long cgO = 0L;
  private long cgP = 0L;
  private long cgQ = 0L;
  private String cgR = "";
  private String cgx = "";
  private String cgy = "";
  private long cgz = 0L;
  
  public d() {}
  
  public d(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.split(",");
      if (paramString != null)
      {
        if (paramString.length >= 21) {
          break label383;
        }
        String[] arrayOfString = new String[21];
        Arrays.fill(arrayOfString, 0, 21, "");
        System.arraycopy(paramString, 0, arrayOfString, 0, paramString.length);
        paramString = arrayOfString;
      }
    }
    label383:
    for (;;)
    {
      this.cgx = paramString[0];
      this.cgy = paramString[1];
      this.cgz = bi.getLong(paramString[2], 0L);
      this.cgA = paramString[3];
      this.cgB = paramString[4];
      this.cgC = bi.getInt(paramString[5], 0);
      this.cgD = paramString[6];
      this.cgE = bi.getLong(paramString[7], 0L);
      this.cgF = bi.getLong(paramString[8], 0L);
      this.cgG = bi.getLong(paramString[9], 0L);
      this.cgH = bi.getLong(paramString[10], 0L);
      this.cgI = bi.getLong(paramString[11], 0L);
      this.cgJ = bi.getLong(paramString[12], 0L);
      this.cgK = bi.getLong(paramString[13], 0L);
      this.cgL = bi.getLong(paramString[14], 0L);
      this.cgM = bi.getLong(paramString[15], 0L);
      this.cgN = paramString[16];
      this.cgO = bi.getLong(paramString[17], 0L);
      this.cgP = bi.getLong(paramString[18], 0L);
      this.cgQ = bi.getLong(paramString[19], 0L);
      this.cgR = paramString[20];
      return;
    }
  }
  
  public final int getId()
  {
    return 13795;
  }
  
  public final String wE()
  {
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.cgx);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgy);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgz);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgA);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgB);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgC);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgD);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgE);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgF);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgG);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgH);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgI);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgJ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgK);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgL);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgM);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgN);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgO);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgP);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgQ);
    ((StringBuffer)localObject).append(",");
    ((StringBuffer)localObject).append(this.cgR);
    localObject = ((StringBuffer)localObject).toString();
    KD((String)localObject);
    return (String)localObject;
  }
  
  public final String wF()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FromUser:").append(this.cgx);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Session:").append(this.cgy);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("ChatNum:").append(this.cgz);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("FileId:").append(this.cgA);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("SnsUrl:").append(this.cgB);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NetType:").append(this.cgC);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("NewMd5:").append(this.cgD);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadStartTime:").append(this.cgE);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("DownloadEndTime:").append(this.cgF);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoSize:").append(this.cgG);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoDuration:").append(this.cgH);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoBitrate:").append(this.cgI);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("AudioBitrate:").append(this.cgJ);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoFps:").append(this.cgK);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoWidth:").append(this.cgL);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("VideoHeight:").append(this.cgM);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("CDNIp:").append(this.cgN);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("OriginalAudioChannel:").append(this.cgO);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("HadPreloadSize:").append(this.cgP);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("HadPreloadCompletion:").append(this.cgQ);
    localStringBuffer.append("\r\n");
    localStringBuffer.append("Publishid:").append(this.cgR);
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/g/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */