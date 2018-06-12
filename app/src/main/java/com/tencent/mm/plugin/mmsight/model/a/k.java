package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.storage.aa.a;

public final class k
{
  private static k lio = new k();
  public SightParams lip;
  
  public static int beA()
  {
    return j.lgz.lfa;
  }
  
  public static String beB()
  {
    switch (j.lgz.dfb)
    {
    default: 
      return "";
    case 2: 
      return "ENCODER_MEDIACODEC";
    }
    return "RECORDER_TYPE_FFMPEG";
  }
  
  public static k bey()
  {
    return lio;
  }
  
  public static int bez()
  {
    return j.lgz.videoBitrate;
  }
  
  public static d d(VideoTransPara paramVideoTransPara)
  {
    switch (j.lgz.dfb)
    {
    default: 
      return null;
    case 2: 
      return new n(paramVideoTransPara);
    }
    return new l(paramVideoTransPara);
  }
  
  public static boolean isDebug()
  {
    return CaptureMMProxy.getInstance().getInt(aa.a.sUA, 0) == 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */