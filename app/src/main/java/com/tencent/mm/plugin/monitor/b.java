package com.tencent.mm.plugin.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class b
  implements ar
{
  private static final long startTime = ;
  private j.a dEC = new j.a()
  {
    public final void a(String paramAnonymousString, l paramAnonymousl)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv abTestListener onNotifyChange stack[%s]", new Object[] { bi.cjd() });
      if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0) && ("event_updated".equals(paramAnonymousString))) {
        g.Em().h(new Runnable()
        {
          public final void run()
          {
            b.a(b.this);
            b.bfC();
          }
        }, 100L);
      }
    }
  };
  private boolean hsR = false;
  private boolean hsS = true;
  private BroadcastReceiver hsT;
  private Runnable hsU;
  private long lrI = 1024L;
  private long lrJ = 10L;
  private long lrK = 1800L;
  private long lrL = 3000000L;
  private long lrM = 15000L;
  private long lrN = 100000L;
  private long lrO = 10000L;
  private long lrP = 1024L;
  private long lrQ = 1440L;
  private long lrR = 20L;
  private long lrS = 1440L;
  private long lrT = 0L;
  private a.a lrU;
  private long lrV = 0L;
  private com.tencent.mm.ab.e lrW = new b.1(this);
  private Runnable lrX = new b.9(this);
  private Runnable lrY = new b.10(this);
  private com.tencent.mm.sdk.b.c lrZ = new b.11(this);
  private al lsa = new al(g.Em().lnJ.getLooper(), new b.12(this), true);
  
  private a.a a(File paramFile, a.a parama, a.b paramb, a.c paramc, Map<String, Integer> paramMap, boolean paramBoolean, int paramInt)
  {
    if (parama.dZm)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summclean scanFile been canceled fileResult[%s], subDirResult[%s]", new Object[] { parama, paramb });
      return parama;
    }
    if (parama.axZ < paramInt) {
      parama.axZ += 1;
    }
    Object localObject;
    if (paramFile.isDirectory())
    {
      localObject = paramFile.getAbsolutePath();
      if ((paramb != null) || (paramMap == null) || (paramMap.size() <= 0) || (paramMap.get(localObject) == null)) {
        break label806;
      }
      paramb = new a.b((String)localObject, ((Integer)paramMap.get(localObject)).intValue());
      paramMap.remove(localObject);
      parama.lrF.add(paramb);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile start scan subDir[%s], fileResult[%s], newSubDirResult[%s]", new Object[] { localObject, parama, paramb });
    }
    label429:
    label803:
    label806:
    for (;;)
    {
      parama.lrC += 1L;
      if (paramb != null) {
        paramb.lrC += 1L;
      }
      if (paramc != null) {
        paramc.lrC += 1L;
      }
      if (paramInt > 15)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile been stopped as depth[%d] over limit path[%s], fileResult[%s]", new Object[] { Integer.valueOf(paramInt), paramFile.getAbsolutePath(), parama });
        return parama;
      }
      String[] arrayOfString = paramFile.list();
      int j;
      if (arrayOfString != null)
      {
        if (paramBoolean)
        {
          j = arrayOfString.length;
          i = 0;
          while (i < j)
          {
            String str = arrayOfString[i];
            localObject = paramc;
            if (!bi.oW(str))
            {
              localObject = paramc;
              if (Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", str))
              {
                localObject = new a.c(paramFile.getAbsolutePath() + File.separator + str);
                parama.lrG.add(localObject);
              }
            }
            a(new File(paramFile.getAbsolutePath() + File.separator + str), parama, paramb, (a.c)localObject, paramMap, false, paramInt + 1);
            i += 1;
            paramc = (a.c)localObject;
          }
          break;
        }
        int i = 1;
        int k = arrayOfString.length;
        j = 0;
        if (j < k)
        {
          localObject = arrayOfString[j];
          a(new File(paramFile.getAbsolutePath() + File.separator + (String)localObject), parama, paramb, paramc, paramMap, false, paramInt + 1);
          if ((i == 0) || (parama.axZ <= 15)) {
            break label803;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.a(418L, 7L, 1L, true);
          com.tencent.mm.plugin.report.service.h.mEJ.h(13778, new Object[] { Integer.valueOf(2), Integer.valueOf(2), paramFile.getAbsolutePath() + File.separator + (String)localObject });
          i = 0;
        }
      }
      for (;;)
      {
        j += 1;
        break label429;
        break;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile dir is empty[%s] ret", new Object[] { paramFile.getAbsolutePath() });
        return parama;
        parama.lrD += 1L;
        if (paramb != null) {
          paramb.lrD += 1L;
        }
        if (paramc != null) {
          paramc.lrD += 1L;
        }
        if (!paramFile.exists())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile file not exist[%s][%d] ret", new Object[] { paramFile.getAbsolutePath(), Long.valueOf(parama.lrD) });
          return parama;
        }
        long l = paramFile.length();
        if ((l > 0L) && (l < 2147483648L))
        {
          parama.gTK += l;
          if (paramb != null) {
            paramb.gTK += l;
          }
          if (paramc == null) {
            break;
          }
          paramc.gTK = (l + paramc.gTK);
          return parama;
        }
        parama.fileLenInvalidCount += 1L;
        if (paramb != null) {
          paramb.fileLenInvalidCount += 1L;
        }
        if (paramc == null) {
          break;
        }
        paramc.lrH += 1L;
        return parama;
      }
    }
  }
  
  private boolean gC(boolean paramBoolean)
  {
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100212");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg update[%b] abTest[%s][%b][%s] default[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d]", new Object[] { Boolean.valueOf(paramBoolean), localObject, Boolean.valueOf(((com.tencent.mm.storage.c)localObject).isValid()), ((com.tencent.mm.storage.c)localObject).ckq(), Long.valueOf(1024L), Long.valueOf(10L), Long.valueOf(1800L), Long.valueOf(3000000L), Long.valueOf(15000L), Long.valueOf(15000L), Long.valueOf(100000L), Long.valueOf(10000L), Long.valueOf(1440L), Long.valueOf(20L), Long.valueOf(1440L) });
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg abTest valid!");
      localObject = ((com.tencent.mm.storage.c)localObject).ckq();
      long l1 = bi.getLong((String)((Map)localObject).get("sdsize"), 1024L);
      long l2 = bi.getLong((String)((Map)localObject).get("sdratio"), 10L);
      long l3 = bi.getLong((String)((Map)localObject).get("dbsize"), 1800L);
      long l4 = bi.getLong((String)((Map)localObject).get("fdbsize"), 1024L);
      long l5 = bi.getLong((String)((Map)localObject).get("msg"), 3000000L);
      long l6 = bi.getLong((String)((Map)localObject).get("conv"), 15000L);
      long l7 = bi.getLong((String)((Map)localObject).get("contact"), 100000L);
      long l8 = bi.getLong((String)((Map)localObject).get("chatroom"), 10000L);
      long l9 = bi.getLong((String)((Map)localObject).get("sditv"), 1440L);
      long l10 = bi.getLong((String)((Map)localObject).get("sdwait"), 20L);
      long l11 = bi.getLong((String)((Map)localObject).get("dbitv"), 1440L);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg sd[%d, %d] sdr[%d, %d] db[%d, %d] fdbsize[%d, %d] msg[%d, %d] conv[%d, %d] contact[%d, %d] chatroom[%d, %d] sditv[%d, %d] sdwait[%d, %d] dbitv[%d, %d]", new Object[] { Long.valueOf(this.lrI), Long.valueOf(l1), Long.valueOf(this.lrJ), Long.valueOf(l2), Long.valueOf(this.lrK), Long.valueOf(l3), Long.valueOf(this.lrP), Long.valueOf(l4), Long.valueOf(this.lrL), Long.valueOf(l5), Long.valueOf(this.lrM), Long.valueOf(l6), Long.valueOf(this.lrN), Long.valueOf(l7), Long.valueOf(this.lrO), Long.valueOf(l8), Long.valueOf(this.lrQ), Long.valueOf(l9), Long.valueOf(this.lrR), Long.valueOf(l10), Long.valueOf(this.lrS), Long.valueOf(l11) });
      if (this.lrI != l1)
      {
        this.lrI = l1;
        bool = true;
        if (this.lrJ != l2)
        {
          this.lrJ = l2;
          bool = true;
        }
        if (this.lrK != l3)
        {
          this.lrK = l3;
          bool = true;
        }
        if (this.lrP != l4)
        {
          this.lrP = l4;
          bool = true;
        }
        if (this.lrL != l5)
        {
          this.lrL = l5;
          bool = true;
        }
        if (this.lrM != l6)
        {
          this.lrM = l6;
          bool = true;
        }
        if (this.lrN != l7)
        {
          this.lrN = l7;
          bool = true;
        }
        if (this.lrO != l8)
        {
          this.lrO = l8;
          bool = true;
        }
        if (this.lrQ != l9)
        {
          this.lrQ = l9;
          bool = true;
        }
        if (this.lrR != l10)
        {
          this.lrR = l10;
          bool = true;
        }
        if (this.lrS != l11) {
          this.lrS = l11;
        }
      }
    }
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 0L, 1L, true);
        if (paramBoolean) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 18L, 1L, true);
        }
      }
      if (this.lrI <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 30L, 1L, true);
        this.lrI = 1024L;
      }
      if (this.lrJ <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 31L, 1L, true);
        this.lrJ = 10L;
      }
      if (this.lrK <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 32L, 1L, true);
        this.lrK = 1800L;
      }
      if (this.lrL <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 33L, 1L, true);
        this.lrL = 3000000L;
      }
      if (this.lrM <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 34L, 1L, true);
        this.lrM = 15000L;
      }
      if (this.lrN <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 35L, 1L, true);
        this.lrN = 100000L;
      }
      if (this.lrO <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 36L, 1L, true);
        this.lrO = 10000L;
      }
      if (this.lrQ <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 37L, 1L, true);
        this.lrQ = 1440L;
      }
      if (this.lrR <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 38L, 1L, true);
        this.lrR = 20L;
      }
      if (this.lrS <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 39L, 1L, true);
        this.lrS = 1440L;
      }
      if (this.lrP <= 0L)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 40L, 1L, true);
        this.lrP = 1024L;
      }
      return bool;
      bool = false;
      break;
    }
  }
  
  private void i(int paramInt, final long paramLong1, long paramLong2)
  {
    boolean bool;
    if (paramLong1 > paramLong2)
    {
      bool = true;
      if (!bool) {
        break label205;
      }
    }
    for (;;)
    {
      label171:
      label205:
      label239:
      label274:
      label309:
      label344:
      label379:
      label414:
      try
      {
        l = this.lrV | paramInt;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser type[%d] value[%d] limit[%d] heavy[%b] mHeavyUser[%d] newHeavyUser[%d] tid[%s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool), Long.valueOf(this.lrV), Long.valueOf(l), Long.valueOf(Thread.currentThread().getId()) });
        if (l == this.lrV) {
          break label520;
        }
        if (this.lrV == 0L) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 1L, 1L, true);
        }
        if (l != 0L) {
          break label520;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(509L, 2L, 1L, true);
      }
      finally {}
      this.lrV = l;
      if (l == 0L) {
        continue;
      }
      bool = true;
      com.tencent.mm.plugin.report.service.e.ht(bool);
      g.Em().H(new Runnable()
      {
        public final void run()
        {
          g.Ek();
          g.Ei().DT().a(aa.a.sVO, Long.valueOf(l));
          if (paramLong1 != null)
          {
            g.Ek();
            g.Ei().DT().a(paramLong1, Long.valueOf(this.lsl));
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", new Object[] { Long.valueOf(l), Long.valueOf(b.r(b.this)), paramLong1, Long.valueOf(this.lsl) });
        }
      });
      return;
      bool = false;
      break;
      final long l = this.lrV & (paramInt ^ 0xFFFFFFFF);
      continue;
      locala = aa.a.sVQ;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label603;
      }
      paramLong2 = 3L;
      localh.a(509L, paramLong2, 1L, true);
      continue;
      locala = aa.a.sVR;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label611;
      }
      paramLong2 = 5L;
      localh.a(509L, paramLong2, 1L, true);
      continue;
      locala = aa.a.sVS;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label619;
      }
      paramLong2 = 7L;
      localh.a(509L, paramLong2, 1L, true);
      continue;
      locala = aa.a.sVT;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label627;
      }
      paramLong2 = 9L;
      localh.a(509L, paramLong2, 1L, true);
      continue;
      locala = aa.a.sVU;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label635;
      }
      paramLong2 = 11L;
      localh.a(509L, paramLong2, 1L, true);
      continue;
      locala = aa.a.sVV;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (!bool) {
        break label643;
      }
      paramLong2 = 13L;
      localh.a(509L, paramLong2, 1L, true);
    }
    aa.a locala = aa.a.sVW;
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.mEJ;
    if (bool) {}
    for (paramLong2 = 15L;; paramLong2 = 16L)
    {
      localh.a(509L, paramLong2, 1L, true);
      break;
      locala = aa.a.sVX;
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      if (bool) {}
      for (paramLong2 = 19L;; paramLong2 = 20L)
      {
        localh.a(509L, paramLong2, 1L, true);
        break;
      }
      bool = false;
      break label171;
      label520:
      Object localObject2 = null;
      switch (paramInt)
      {
      }
      break;
      label603:
      paramLong2 = 4L;
      break label239;
      label611:
      paramLong2 = 6L;
      break label274;
      label619:
      paramLong2 = 8L;
      break label309;
      label627:
      paramLong2 = 10L;
      break label344;
      label635:
      paramLong2 = 12L;
      break label379;
      label643:
      paramLong2 = 14L;
      break label414;
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.a(this.lrZ);
    com.tencent.mm.model.c.c.Jx().c(this.dEC);
    boolean bool = gC(false);
    g.Ek();
    this.lrV = ((Long)g.Ei().DT().get(aa.a.sVO, Long.valueOf(0L))).longValue();
    Object localObject1;
    Object localObject2;
    if (this.lrV != 0L)
    {
      paramBoolean = true;
      com.tencent.mm.plugin.report.service.e.ht(paramBoolean);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountPostReset heavyuser[%d], reloadHeavyUser[%b] abTestListener[%s]", new Object[] { Long.valueOf(this.lrV), Boolean.valueOf(bool), this.dEC });
      localObject1 = ad.getContext().getSharedPreferences("hardcoder_setting", 0);
      g.Ek();
      g.Eg();
      int i = com.tencent.mm.kernel.a.Df();
      if (i != 0)
      {
        g.Ek();
        g.Eg();
        int j = com.tencent.mm.a.h.aM(com.tencent.mm.kernel.a.Df(), 100);
        if (j != ((SharedPreferences)localObject1).getInt("KEY_HC_UIN_HASH", 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv hardcoder uin[%d, %d] reloadSPConfig", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          ((SharedPreferences)localObject1).edit().putInt("KEY_HC_UIN_HASH", j).apply();
          HardCoderJNI.reloadSPConfig(HardCoderJNI.RELOAD_SCENE_POST_RESET);
        }
      }
      g.Ek();
      g.Eh().dpP.a(989, this.lrW);
      g.Ek();
      g.Eh().dpP.a(988, this.lrW);
      g.Ek();
      g.Eh().dpP.a(987, this.lrW);
      g.Ek();
      g.Eh().dpP.a(986, this.lrW);
      g.Ek();
      this.lrT = ((Long)g.Ei().DT().get(aa.a.sUQ, Long.valueOf(0L))).longValue();
      localObject1 = ad.getContext();
      localObject2 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (localObject2 == null) {
        break label607;
      }
      i = ((Intent)localObject2).getIntExtra("status", -1);
      if ((i != 2) && (i != 5)) {
        break label602;
      }
      paramBoolean = true;
      label383:
      this.hsR = paramBoolean;
      label388:
      this.hsS = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
      this.hsT = new b.13(this);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.TIME_SET");
      ((IntentFilter)localObject2).addAction("android.intent.action.DATE_CHANGED");
      ((Context)localObject1).registerReceiver(this.hsT, (IntentFilter)localObject2);
      if (this.lrU == null) {
        break label615;
      }
      localObject1 = "enabled";
      label499:
      if (!this.hsS) {
        break label623;
      }
      localObject2 = "";
      label511:
      if (!this.hsR) {
        break label631;
      }
    }
    label602:
    label607:
    label615:
    label623:
    label631:
    for (String str = "";; str = " not")
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv registerReceiver auto scan %s. Device status:%s interactive,%s charging mLastAutoScanTime[%d], mAutoScanInterval[%d], mAutoScanWaitTime[%d].", new Object[] { localObject1, localObject2, str, Long.valueOf(this.lrT), Long.valueOf(this.lrQ * 60000L), Long.valueOf(this.lrR * 60000L) });
      this.lsa.SO();
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label383;
      this.hsR = false;
      break label388;
      localObject1 = "disabled";
      break label499;
      localObject2 = " not";
      break label511;
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountRelease [%d]", new Object[] { Long.valueOf(startTime), Long.valueOf(System.currentTimeMillis()) });
    if (this.hsT != null)
    {
      ad.getContext().unregisterReceiver(this.hsT);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver mChargeAndInteractiveReceiver[%s]", new Object[] { this.hsT });
      this.hsT = null;
    }
    if (this.hsU != null)
    {
      g.Em().cil().removeCallbacks(this.hsU);
      this.hsU = null;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver remove[%s]", new Object[] { this.lrU });
    }
    if (this.lrU != null)
    {
      this.lrU.dZm = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver canceled[%s]", new Object[] { this.lrU });
      this.lrU = null;
    }
    g.Ek();
    g.Eh().dpP.b(989, this.lrW);
    g.Ek();
    g.Eh().dpP.b(988, this.lrW);
    g.Ek();
    g.Eh().dpP.b(987, this.lrW);
    g.Ek();
    g.Eh().dpP.b(986, this.lrW);
    com.tencent.mm.model.c.c.Jx().d(this.dEC);
    com.tencent.mm.sdk.b.a.sFg.c(this.lrZ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/monitor/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */