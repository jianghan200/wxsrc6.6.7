package com.tencent.mm.plugin.mmsight.model;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.widget.Toast;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.v.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bn;
import com.tencent.mm.ui.base.s;

public final class j
{
  static int iNj;
  static double lgA;
  public static boolean lgw = true;
  private static boolean lgx = false;
  private static boolean lgy = false;
  public static o lgz;
  
  public static void a(Camera.Parameters paramParameters, boolean paramBoolean)
  {
    Object localObject2;
    if (lgx)
    {
      localObject1 = ad.getContext();
      localObject2 = ad.getResources();
      i = a.a.i_want_you_know;
      if (lgz == null)
      {
        paramParameters = "";
        s.makeText((Context)localObject1, ((Resources)localObject2).getString(i, new Object[] { paramParameters }), 1).show();
      }
    }
    do
    {
      return;
      paramParameters = Integer.valueOf(lgz.lgI);
      break;
      x.i("MicroMsg.MMSightRecorderConfig", "autoConfig, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(q.deT.dfi), Boolean.valueOf(lgy) });
    } while (lgy);
    Object localObject1 = com.tencent.mm.plugin.mmsight.d.bdF();
    int i = bi.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    int k = bi.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight1080pRecordMinApiLevel"), 19);
    int j = bi.getInt(CaptureMMProxy.getInstance().getDynamicConfig("Sight720pRecordMinApiLevel"), 19);
    x.i("MicroMsg.MMSightRecorderConfig", "apiLevel: %s record1080pApiLevel: %s, record720pApiLevel: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j) });
    if ((q.deT.dfh == -1) || ((q.deT.dfh & 0x1) != 0)) {
      if ((q.deT.dfh != -1) && ((q.deT.dfh & 0x1) != 0))
      {
        lgz.bea().lgK = true;
        i = 1;
      }
    }
    for (;;)
    {
      boolean bool;
      if (q.deT.dfc != -1)
      {
        localObject2 = lgz;
        if (q.deT.dfc == 1)
        {
          bool = true;
          label267:
          ((o)localObject2).lgJ = bool;
          label274:
          if ((q.deT.dfh == -1) || ((q.deT.dfh & 0x2) != 0))
          {
            if ((q.deT.dfh == -1) || ((q.deT.dfh & 0x2) == 0)) {
              break label496;
            }
            paramParameters = lgz.bdY();
            paramParameters.lgK = false;
            paramParameters.bdZ();
          }
        }
      }
      label496:
      label607:
      for (;;)
      {
        lgz.lgI = -1;
        x.i("MicroMsg.MMSightRecorderConfig", "autoConfig parameter byserver %s", new Object[] { lgz.toString() });
        return;
        if ((!com.tencent.mm.compatible.util.d.fR(k)) || (iNj < 512) || (lgA < 1725.0D) || (Math.min(((Point)localObject1).x, ((Point)localObject1).y) < 1080)) {
          break label609;
        }
        localObject2 = lgz;
        ((o)localObject2).lgN = g.a(paramParameters, com.tencent.mm.plugin.mmsight.d.bdF(), ((o)localObject2).lem.width * 2, paramBoolean);
        if ((((o)localObject2).lgN != null) && (((o)localObject2).lgN.lgn != null)) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label609;
          }
          lgz.bea().lgK = true;
          i = 1;
          break;
        }
        bool = false;
        break label267;
        lgz.lgJ = false;
        break label274;
        if ((i == 0) && (com.tencent.mm.compatible.util.d.fR(j)) && (iNj >= 512) && (lgA >= 1725.0D) && (Math.min(((Point)localObject1).x, ((Point)localObject1).y) >= 720))
        {
          localObject1 = lgz;
          ((o)localObject1).lgN = g.a(paramParameters, com.tencent.mm.plugin.mmsight.d.bdF(), 720, paramBoolean);
          if ((((o)localObject1).lgN != null) && (((o)localObject1).lgN.lgn != null)) {}
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label607;
            }
            lgz.bdY().lgK = true;
            break;
          }
        }
      }
      label609:
      i = 0;
    }
  }
  
  public static void a(g.b paramb)
  {
    if (paramb.lgn == null)
    {
      x.i("MicroMsg.MMSightRecorderConfig", "checkMore start %s", new Object[] { paramb.toString() });
      paramb.lgn = paramb.lgq;
      paramb.lgo = paramb.lgr;
      paramb.lgp = paramb.lgs;
      if (Math.min(paramb.lgo.y, paramb.lgo.x) >= lgz.lem.width + 16)
      {
        lgz.bdZ();
        lgz.lgK = false;
        lgz.lgJ = false;
        x.i("MicroMsg.MMSightRecorderConfig", "checkMore out %s", new Object[] { paramb.toString() });
      }
    }
  }
  
  public static void bdS()
  {
    x.i("MicroMsg.MMSightRecorderConfig", "initSimple");
    o localo = new o();
    lgz = localo;
    localo.lgJ = false;
    lgz.lgK = false;
    if (com.tencent.mm.compatible.util.d.fR(19))
    {
      lgz.dfb = 2;
      return;
    }
    lgz.dfb = 1;
  }
  
  public static void c(VideoTransPara paramVideoTransPara)
  {
    boolean bool2 = true;
    lgx = false;
    lgy = false;
    iNj = ((ActivityManager)ad.getContext().getSystemService("activity")).getLargeMemoryClass();
    lgA = com.tencent.mm.plugin.mmsight.d.dP(ad.getContext());
    Object localObject = bn.cmZ();
    int k = bi.getInt(CaptureMMProxy.getInstance().getDynamicConfig("SightMediaCodecMinApiLevel"), 19);
    x.i("MicroMsg.MMSightRecorderConfig", "MXM_DynaCfg_AV_Item_Key_SightMediaCodecMinApiLevel: %s", new Object[] { Integer.valueOf(k) });
    if (CaptureMMProxy.getInstance() != null) {
      q.fd(CaptureMMProxy.getInstance().getDeviceInfoConfig());
    }
    x.i("MicroMsg.MMSightRecorderConfig", "init large memory class: %sMB, totalMemory: %sGB  fingerprint: %s mmSightRecorderInfo: %s", new Object[] { Integer.valueOf(iNj), Double.valueOf(lgA), localObject, q.deT });
    int j;
    int i;
    if (CaptureMMProxy.getInstance() != null)
    {
      j = CaptureMMProxy.getInstance().getInt(aa.a.sUE, -1);
      i = CaptureMMProxy.getInstance().getInt(aa.a.sUH, 1);
    }
    for (;;)
    {
      localObject = o.a(j, paramVideoTransPara);
      lgz = (o)localObject;
      if (localObject != null)
      {
        Resources localResources;
        if (i == 1)
        {
          lgz.lgL = true;
          lgx = true;
          localObject = ad.getContext();
          localResources = ad.getResources();
          i = a.a.i_want_you_know;
          if (lgz != null) {
            break label250;
          }
        }
        label250:
        for (paramVideoTransPara = "";; paramVideoTransPara = Integer.valueOf(lgz.lgI))
        {
          s.makeText((Context)localObject, localResources.getString(i, new Object[] { paramVideoTransPara }), 1).show();
          return;
          lgz.lgL = false;
          break;
        }
      }
      j = q.deT.dfi;
      x.i("MicroMsg.MMSightRecorderConfig", "recorderOption: %s", new Object[] { Integer.valueOf(j) });
      if (j != -1) {
        lgz = o.a(j, paramVideoTransPara);
      }
      if (lgz != null)
      {
        if (i == 1) {}
        for (lgz.lgL = true;; lgz.lgL = false)
        {
          lgy = true;
          return;
        }
      }
      lgz = o.a(1, paramVideoTransPara);
      if (i == 1)
      {
        lgz.lgL = true;
        if (q.deT.dfb == -1) {
          break label450;
        }
        lgz.dfb = q.deT.dfb;
        label377:
        if (q.deT.dfe != -1)
        {
          if (q.deT.dfe != 1) {
            break label477;
          }
          bool1 = true;
          label400:
          lgw = bool1;
        }
        if (q.deT.dfc == -1) {
          break label489;
        }
        paramVideoTransPara = lgz;
        if (q.deT.dfc != 1) {
          break label483;
        }
      }
      label450:
      label477:
      label483:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        paramVideoTransPara.lgJ = bool1;
        return;
        lgz.lgL = false;
        break;
        if (com.tencent.mm.compatible.util.d.fR(k))
        {
          lgz.dfb = 2;
          break label377;
        }
        lgz.dfb = 1;
        break label377;
        bool1 = false;
        break label400;
      }
      label489:
      lgz.lgJ = false;
      return;
      i = 1;
      j = -1;
    }
  }
  
  public static boolean f(Point paramPoint)
  {
    if (lgx)
    {
      Context localContext = ad.getContext();
      Resources localResources = ad.getResources();
      int i = a.a.i_want_you_know;
      if (lgz == null) {}
      for (paramPoint = "";; paramPoint = Integer.valueOf(lgz.lgI))
      {
        s.makeText(localContext, localResources.getString(i, new Object[] { paramPoint }), 1).show();
        return false;
      }
    }
    x.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy, deviceInfo recorderType: %s, recorderOption: %s, isUseRecorderOption: %s", new Object[] { Integer.valueOf(q.deT.dfb), Integer.valueOf(q.deT.dfi), Boolean.valueOf(lgy) });
    if (lgy) {
      return false;
    }
    if (q.deT.dfb != -1) {
      return true;
    }
    if ((lgz != null) && (1 == lgz.dfb)) {
      return true;
    }
    if (paramPoint == null) {
      return false;
    }
    if ((com.tencent.mm.plugin.mmsight.d.sL(paramPoint.x)) && (com.tencent.mm.plugin.mmsight.d.sL(paramPoint.y))) {
      return true;
    }
    if (lgz != null)
    {
      x.i("MicroMsg.MMSightRecorderConfig", "checkMediaCodecHappy not happy %s", new Object[] { paramPoint.toString() });
      lgz.dfb = 1;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */