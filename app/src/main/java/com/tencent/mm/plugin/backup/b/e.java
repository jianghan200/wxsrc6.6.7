package com.tencent.mm.plugin.backup.b;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  public static int gTj;
  public static int gTk;
  public static int gTl;
  public static int gTm;
  public static int gTn;
  public static int gTo;
  public static int gTp;
  public static long gTq;
  public static long gTr;
  public static long gTs;
  
  public static void aro()
  {
    x.d("MicroMsg.TestInfo", "total_count: " + gTp + "text_count: " + gTl + "normal_count : " + gTk + " image_count: " + gTj + " voice_count : " + gTn + " video_count " + gTm + " app_count : " + gTo + " time: " + (bi.VF() - gTq) + " net: " + gTs);
  }
  
  public static void arp()
  {
    x.d("MicroMsg.TestInfo", "netTime" + (bi.VF() - gTr));
  }
  
  public static void mz(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      gTp += 1;
      return;
      gTl += 1;
      continue;
      gTo += 1;
      continue;
      gTn += 1;
      continue;
      gTm += 1;
      continue;
      gTj += 1;
      continue;
      gTk += 1;
    }
  }
  
  public static void reset()
  {
    gTj = 0;
    gTk = 0;
    gTl = 0;
    gTm = 0;
    gTn = 0;
    gTo = 0;
    gTp = 0;
    long l = bi.VF();
    gTq = l;
    gTs = l - gTr;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */