package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class a
{
  static a leG;
  public int bYE = 0;
  public int dfc;
  JSONObject fFc = null;
  public long fileSize;
  int iNj;
  String leH = Build.VERSION.SDK_INT;
  int leI;
  String leJ;
  int leK;
  int leL;
  public String leM;
  public String leN;
  public String leO;
  public String leP;
  public int leQ;
  public int leR;
  public int leS;
  public int leT;
  public int leU;
  public int leV;
  public int leW;
  public int leX;
  public int leY;
  public int leZ;
  public int lfa;
  public int lfb;
  public int lfc;
  int lfd;
  public int lfe;
  public int lff;
  public int lfg;
  public long lfh;
  public int lfi;
  String model = Build.MODEL;
  public int videoBitrate;
  
  public static a bdH()
  {
    if (leG == null) {
      reset();
    }
    return leG;
  }
  
  public static void reset()
  {
    Object localObject = new a();
    leG = (a)localObject;
    ((a)localObject).iNj = ((ActivityManager)ad.getContext().getSystemService("activity")).getLargeMemoryClass();
    leG.leI = d.dP(ad.getContext());
    leG.leJ = m.zk();
    localObject = d.dO(ad.getContext());
    leG.leK = ((Point)localObject).x;
    leG.leL = ((Point)localObject).y;
  }
  
  public final String bdI()
  {
    if (this.fFc == null) {}
    for (;;)
    {
      try
      {
        this.fFc = new JSONObject();
        JSONObject localJSONObject = new JSONObject();
        this.fFc.put("wxcamera", localJSONObject);
        localJSONObject.put("model", this.model);
        localJSONObject.put("apiLevel", this.leH);
        localJSONObject.put("screen", String.format("%dx%d", new Object[] { Integer.valueOf(this.leK), Integer.valueOf(this.leL) }));
        localJSONObject.put("crop", String.format("%dx%d", new Object[] { Integer.valueOf(this.leQ), Integer.valueOf(this.leR) }));
        localJSONObject.put("preview", String.format("%dx%d", new Object[] { Integer.valueOf(this.leS), Integer.valueOf(this.leT) }));
        localJSONObject.put("encoder", String.format("%dx%d", new Object[] { Integer.valueOf(this.leU), Integer.valueOf(this.leV) }));
        localJSONObject.put("rotate", this.bYE);
        localJSONObject.put("deviceoutfps", this.leW);
        localJSONObject.put("recordfps", this.leX);
        localJSONObject.put("recordertype", this.leY);
        localJSONObject.put("needRotateEachFrame", this.dfc);
        localJSONObject.put("isNeedRealtimeScale", this.leZ);
        localJSONObject.put("resolutionLimit", this.lfa);
        localJSONObject.put("videoBitrate", this.videoBitrate);
        localJSONObject.put("wait2playtime", this.lfh);
        localJSONObject.put("useback", this.lfi);
        if (j.lgz == null) {
          continue;
        }
        i = j.lgz.lgI;
        localJSONObject.put("presetIndex", i);
        localJSONObject.put("recorderOption", q.deT.dfi);
      }
      catch (Exception localException)
      {
        int i;
        x.printErrStackTrace("MicroMsg.CaptureStatistics", localException, "buildJson error", new Object[0]);
        continue;
      }
      return this.fFc.toString();
      i = -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */