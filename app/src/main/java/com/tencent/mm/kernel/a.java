package com.tencent.mm.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.w;
import com.tencent.mm.vfs.RC4EncryptedFileSystem;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class a
{
  private static int dpA = -1;
  private static boolean dpm = true;
  private static boolean dpn = false;
  static b dpp = new b();
  private static String dpq = "NoResetUinStack";
  private static String dpr = null;
  long dpB;
  private volatile int dpC = a.dpH;
  public volatile boolean dpD = false;
  private String dpE = "";
  private Map<String, Integer> dpF = new HashMap();
  private com.tencent.mm.kernel.api.c dpk;
  private com.tencent.mm.ab.x dpl;
  byte[] dpo = new byte[0];
  public com.tencent.mm.model.a dps;
  public e.c dpt;
  public int dpu;
  public boolean dpv = false;
  private boolean dpw = false;
  public int dpx = 0;
  public int dpy;
  public List<aq> dpz = new LinkedList();
  
  public a(com.tencent.mm.kernel.api.c paramc)
  {
    Assert.assertNotNull(dpp);
    g.Ek();
    if (bi.f((Integer)g.Ei().dqk.get(17)) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      dpm = bool;
      com.tencent.mm.protocal.i.c.a.qWj = new av(702);
      this.dpk = paramc;
      return;
    }
  }
  
  public static String DA()
  {
    g.Ek();
    if (bi.oW(g.Eg().dpE)) {
      DB();
    }
    g.Ek();
    return g.Eg().dpE;
  }
  
  public static void DB()
  {
    g.Ek();
    g.Eg().dpE = (q.zz() + "_" + System.currentTimeMillis());
    g.Ek();
    g.Eg().dpF.clear();
  }
  
  public static int Df()
  {
    return b.a(dpp);
  }
  
  public static String Dg()
  {
    return new com.tencent.mm.a.o(b.a(dpp)).toString();
  }
  
  public static String Dh()
  {
    return dpr;
  }
  
  public static String Di()
  {
    return dpq;
  }
  
  protected static void Dj()
  {
    b.a(dpp, 0);
  }
  
  protected static void Dk()
  {
    b.a(dpp, 0);
  }
  
  private void Dl()
  {
    this.dpC = a.dpH;
    this.dpD = false;
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "mAccountStatus to NotReady");
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putBoolean("isLogin", false).commit();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", new Object[] { Integer.valueOf(b.a(dpp)), dpq, localSimpleDateFormat.format(new Date()) });
  }
  
  public static boolean Dq()
  {
    return dpn;
  }
  
  public static boolean Dr()
  {
    if (dpm)
    {
      g.Ek();
      if (g.Eg() == null) {
        break label66;
      }
      g.Ek();
      g.Eg();
    }
    label66:
    for (String str = com.tencent.mm.a.o.getString(b.a(dpp));; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "account holded :%s init:%b", new Object[] { str, Boolean.valueOf(g.Eg().Dx()) });
      return dpm;
    }
  }
  
  public static int Du()
  {
    return Dv().getInt("notification.user.state", 0);
  }
  
  public static SharedPreferences Dv()
  {
    return ad.getContext().getSharedPreferences("notify_key_pref_settings", 4);
  }
  
  public static boolean Dw()
  {
    return b.a(dpp) != 0;
  }
  
  public static int Dz()
  {
    return Integer.valueOf(ad.getContext().getSharedPreferences("system_config_prefs", 4).getInt("default_uin", 0)).intValue();
  }
  
  public static void bt(boolean paramBoolean)
  {
    dpn = paramBoolean;
  }
  
  static boolean gG(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void gH(int paramInt)
  {
    if ((dpA != -1) && (dpA == paramInt)) {
      return;
    }
    dpA = paramInt;
    Dv().edit().putInt("notification.user.state", paramInt).commit();
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "[NOTIFICATION SETTINGS]save UserStatus: %d", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static boolean gI(int paramInt)
  {
    return (paramInt & 0x1) != 0;
  }
  
  public static String gb(String paramString)
  {
    dpr = paramString;
    return paramString;
  }
  
  public static void gc(String paramString)
  {
    dpq = paramString;
  }
  
  public static int gd(String paramString)
  {
    g.Ek();
    int i;
    int k;
    if (g.Eg().dpF.get(paramString) == null)
    {
      i = 0;
      k = (int)bi.VE();
      if (i != 0) {
        break label79;
      }
      g.Ek();
      g.Eg().dpF.put(paramString, Integer.valueOf(k));
    }
    label79:
    int j;
    do
    {
      return i;
      g.Ek();
      i = ((Integer)g.Eg().dpF.get(paramString)).intValue();
      break;
      j = k - i;
      g.Ek();
      g.Eg().dpF.put(paramString, Integer.valueOf(k));
      i = j;
    } while (j >= 0);
    return 0;
  }
  
  public static void hold()
  {
    g.Ek();
    if (g.Eg() != null)
    {
      g.Ek();
      g.Eg();
    }
    for (String str = com.tencent.mm.a.o.getString(b.a(dpp));; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", " HOLD ACCOUNT! uin:%s stack:%s init:%b", new Object[] { str, bi.cjd(), Boolean.valueOf(g.Eg().Dx()) });
      dpm = true;
      g.Ek();
      g.Ei().dqk.set(17, Integer.valueOf(1));
      return;
    }
  }
  
  public static void unhold()
  {
    g.Ek();
    if (g.Eg() != null)
    {
      g.Ek();
      g.Eg();
    }
    for (String str = com.tencent.mm.a.o.getString(b.a(dpp));; str = "-1")
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", " UN HOLD ACCOUNT! uin:%s init:%b", new Object[] { str, Boolean.valueOf(g.Eg().Dx()) });
      dpm = false;
      g.Ek();
      g.Ei().dqk.set(17, Integer.valueOf(0));
      return;
    }
  }
  
  final void Dm()
  {
    com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "account storage release  uin:%s thread:%s stack:%s", new Object[] { com.tencent.mm.a.o.getString(b.a(dpp)), Thread.currentThread().getName(), bi.cjd() });
    if (!Dx())
    {
      com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "Fatal crash error!!! status is not initialized when release(), this callStack is:%s, last reset stack is:%s", new Object[] { bi.cjd().toString(), dpq });
      return;
    }
    this.dpk.onAccountRelease();
    g.Ek();
    g.Ei().ex(null);
    Dl();
    g.Ek();
    g.Ei().dqy.clear();
  }
  
  public final void Dn()
  {
    if (!this.dpw)
    {
      com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "no need do account initialized notify.");
      return;
    }
    this.dpw = false;
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized tid:%d, stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), bi.cjd() });
    long l = System.currentTimeMillis();
    this.dpk.onAccountInitialized(this.dpt);
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerasyncinit onAccountInitialized run tid[%d] take[%d]ms", new Object[] { Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l) });
    Do();
  }
  
  public final void Do()
  {
    if ((Dx()) && (com.tencent.mm.kernel.a.c.Et().drB))
    {
      com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "Flush client version.");
      g.Ei().dqs.set(14, Integer.valueOf(d.qVN));
    }
  }
  
  public final com.tencent.mm.ab.x Dp()
  {
    try
    {
      if (this.dpl == null) {
        this.dpl = new com.tencent.mm.ab.x();
      }
      com.tencent.mm.ab.x localx = this.dpl;
      return localx;
    }
    finally {}
  }
  
  public final void Ds()
  {
    if (!Dx()) {
      throw new com.tencent.mm.model.b();
    }
  }
  
  public final void Dt()
  {
    new ag(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        aq[] arrayOfaq = new aq[a.b(a.this).size()];
        a.b(a.this).toArray(arrayOfaq);
        int j = arrayOfaq.length;
        int i = 0;
        while (i < j)
        {
          arrayOfaq[i].HK();
          i += 1;
        }
      }
    });
  }
  
  public final boolean Dx()
  {
    return this.dpC == a.dpI;
  }
  
  public final void Dy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerasyncinit setInitializedNotifyAllDone[%b] to true stack[%s]", new Object[] { Boolean.valueOf(this.dpD), bi.cjd() });
    this.dpD = true;
    long l = SystemClock.elapsedRealtime();
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerhardcoder setInitializedNotifyAllDone [%d %d] take[%d]ms, stack[%s]", new Object[] { Long.valueOf(this.dpB), Long.valueOf(l), Long.valueOf(l - this.dpB), bi.cjd() });
    by localby = new by();
    com.tencent.mm.sdk.b.a.sFg.m(localby);
  }
  
  public final void aW(int paramInt1, int paramInt2)
  {
    if ((this.dpx != paramInt1) || (this.dpy != paramInt2)) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MMKernel.CoreAccount", "online status, %d, %d, %d ,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.dpy), Integer.valueOf(this.dpx) });
      if (i != 0) {
        break;
      }
      return;
    }
    this.dpx = paramInt1;
    this.dpy = paramInt2;
    new ag(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        a.this.Dt();
      }
    });
  }
  
  final void bs(boolean paramBoolean)
  {
    int j;
    int k;
    int m;
    int i;
    if (!paramBoolean)
    {
      bool1 = HardCoderJNI.hcBootEnable;
      j = HardCoderJNI.hcBootDelay;
      k = HardCoderJNI.hcBootCPU;
      m = HardCoderJNI.hcBootIO;
      if (HardCoderJNI.hcBootThr)
      {
        i = g.Em().cij();
        this.dpu = HardCoderJNI.startPerformance(bool1, j, k, m, i, HardCoderJNI.hcBootTimeout, 101, HardCoderJNI.hcBootAction, "MMKernel.CoreAccount");
        com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerhardcoder startPerformance[%s] stack[%s]", new Object[] { Integer.valueOf(this.dpu), bi.cjd() });
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "UserStatusChange: clear");
    }
    for (;;)
    {
      synchronized (this.dpz)
      {
        this.dpz.clear();
        long l1 = System.currentTimeMillis();
        k = b.a(dpp);
        com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "dkacc setAccuin %s hash:%d thread:%d[%s] stack:%s", new Object[] { com.tencent.mm.a.o.getString(k), Integer.valueOf(com.tencent.mm.a.h.aM(k, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bi.cjd() });
        if (k != 0)
        {
          i = 1;
          if (i != 0) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "setAccUin, Reset by MMCore.resetAccUin");
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "start time check setUinImpl end total time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "mAccountStatus to AccountHasReady");
          return;
          i = 0;
        }
      }
      i = 0;
    }
    com.tencent.mm.a.o.getString(k);
    g.Ek();
    ??? = g.Ei();
    Object localObject3 = new Runnable()
    {
      public final void run()
      {
        a.a(a.this);
      }
    };
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putBoolean("isLogin", true).commit();
    String str1 = com.tencent.mm.a.g.u(("mm" + k).getBytes());
    ((e)???).dqp = (((e)???).dqo + str1 + "/");
    ((e)???).cachePath = (aa.duN + str1 + "/");
    Object localObject4 = new File(((e)???).cachePath);
    com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreStorage", "dkacc cachePath:" + ((e)???).cachePath + " accPath:" + ((e)???).dqp);
    long l2;
    if (!((File)localObject4).exists())
    {
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreStorage", "setUin REBUILD data now ! DO NOT FUCKING TELL ME DB BROKEN !!! uin:%s data:%s sd:%s", new Object[] { com.tencent.mm.a.o.getString(k), ((e)???).cachePath, ((e)???).dqp });
      ((File)localObject4).mkdirs();
      if (!((e)???).cachePath.equalsIgnoreCase(((e)???).dqp))
      {
        l2 = System.currentTimeMillis();
        localObject4 = new File(((e)???).dqp);
        str1 = str1 + "temp" + System.currentTimeMillis();
        str1 = com.tencent.mm.compatible.util.e.bnE + str1;
        ((File)localObject4).renameTo(new File(str1));
        com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreStorage", "find the old files and rename then %s" + (System.currentTimeMillis() - l2), new Object[] { str1 });
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      ((e)???).dqx = new cb(((e)???).cachePath, bool1);
      ((e)???).DO();
      localObject4 = ((e)???).cachePath + "MicroMsg.db";
      str1 = ((e)???).cachePath + "EnMicroMsg.db";
      String str2 = ((e)???).cachePath + "EnMicroMsg2.db";
      ((e)???).ex(null);
      ((e)???).gg(str1);
      ((e)???).dqq = new com.tencent.mm.bt.h(new e.2((e)???));
      if (!((e)???).dqq.a((String)localObject4, str1, str2, k, q.zy(), e.Ci(), true)) {
        throw new SQLiteException("main db init failed");
      }
      Object localObject5 = ((e)???).dqq.tdP;
      if (!bi.oW((String)localObject5))
      {
        com.tencent.mm.sdk.platformtools.x.e("MMKernel.CoreStorage", "dbinit failed :" + (String)localObject5);
        com.tencent.mm.sdk.a.b.A("init db Failed: [ " + (String)localObject5 + "]", "DBinit");
      }
      localObject5 = ((e)???).dqq;
      if (((com.tencent.mm.bt.h)localObject5).tdM != null) {}
      for (boolean bool2 = ((com.tencent.mm.bt.h)localObject5).tdM.tdo;; bool2 = false)
      {
        if (bool2) {
          ((e)???).dqw = true;
        }
        ((e)???).dqs = new com.tencent.mm.storage.x(((e)???).dqq);
        ((e)???).dqu = new bt(((e)???).dqq);
        ((e)???).dqq.tdO = new e.3((e)???);
        ((e)???).dqv = ((e)???).dqu.cnb();
        ((e)???).dqr = new com.tencent.mm.bt.h(((e)???).dqn);
        if (((e)???).dqr.a((String)localObject4, str1, str2, k, q.zy(), new HashMap(), true)) {
          break;
        }
        throw new com.tencent.mm.model.b((byte)0);
      }
      ((e)???).dqt = new bn(((e)???).dqs);
      ((e)???).dqt.c(new e.4((e)???));
      ((e)???).dqt.cmW();
      ((Runnable)localObject3).run();
      if (bool1)
      {
        l2 = ((Long)((e)???).dqs.get(aa.a.sUT, Long.valueOf(0L))).longValue();
        i = ((Integer)((e)???).dqs.get(aa.a.sUU, Integer.valueOf(0))).intValue();
        if (l2 > 0L)
        {
          com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreStorage", "summerinstall new install but firsttime[%d] > 0", new Object[] { Long.valueOf(l2) });
          label1191:
          if (i <= 0) {
            break label1672;
          }
          com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreStorage", "summerinstall new install but version[%d] > 0", new Object[] { Integer.valueOf(i) });
          label1215:
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreStorage", "edw setAccUin, summerinstall time[%d]，version[%d], clientversion[%d]", new Object[] { (Long)((e)???).dqs.get(aa.a.sUT, Long.valueOf(0L)), (Integer)((e)???).dqs.get(aa.a.sUU, Integer.valueOf(0)), Integer.valueOf(d.qVN) });
        }
      }
      else
      {
        localObject3 = new StringBuilder();
        g.Eg();
        localObject4 = com.tencent.mm.a.g.v((Dg() + "mmbiz").getBytes());
        localObject3 = new com.tencent.mm.vfs.a.a(com.tencent.mm.vfs.a.cBR(), (byte)0);
        ((com.tencent.mm.vfs.a.a)localObject3).cBT();
        ((com.tencent.mm.vfs.a.a)localObject3).uRY.clear();
        ((com.tencent.mm.vfs.a.a)localObject3).uSf.clear();
        ((com.tencent.mm.vfs.a.a)localObject3).uSa = com.tencent.mm.vfs.a.cBS();
        localObject4 = new RC4EncryptedFileSystem(((e)???).dqp + "bizmsg", (byte[])localObject4);
        ((com.tencent.mm.vfs.a.a)localObject3).cBT();
        ((com.tencent.mm.vfs.a.a)localObject3).uRY.put("bizmsg", localObject4);
        ??? = ((e)???).dqp + "bizmsg";
        ((com.tencent.mm.vfs.a.a)localObject3).cBT();
        ??? = com.tencent.mm.vfs.a.jg((String)???);
        ((com.tencent.mm.vfs.a.a)localObject3).uSf.put(???, "bizmsg");
        ((com.tencent.mm.vfs.a.a)localObject3).cBT();
        com.tencent.mm.vfs.a.a(((com.tencent.mm.vfs.a.a)localObject3).uSd, ((com.tencent.mm.vfs.a.a)localObject3).uRY, ((com.tencent.mm.vfs.a.a)localObject3).uSf, ((com.tencent.mm.vfs.a.a)localObject3).uSa);
        ((com.tencent.mm.vfs.a.a)localObject3).uRY = null;
        ((com.tencent.mm.vfs.a.a)localObject3).uSf = null;
        ((com.tencent.mm.vfs.a.a)localObject3).uSa = null;
        if (paramBoolean) {
          break label1697;
        }
        g.Ek();
        ??? = bi.oV((String)g.Ei().DT().get(2, null));
        com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "summerinit validateUsername username[%s]", new Object[] { ??? });
        if (((String)???).length() > 0) {
          break label1692;
        }
        com.tencent.mm.sdk.platformtools.x.e("MMKernel.CoreAccount", "username of acc stg not set: uin=" + b.a(dpp));
        Dl();
        b.a(dpp, 0);
        dpq = bi.cjd().toString();
        ah.A(new Runnable()
        {
          public final void run()
          {
            g.Ek().releaseAll();
          }
        });
      }
      label1672:
      label1692:
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label1697;
        }
        f.mDy.a(598L, 21L, 1L, true);
        com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "setAccUin, validateUsername false no need initialize!");
        break;
        ((e)???).dqs.a(aa.a.sUT, Long.valueOf(System.currentTimeMillis()));
        break label1191;
        ((e)???).dqs.a(aa.a.sUU, Integer.valueOf(d.qVN));
        break label1215;
      }
      label1697:
      ??? = new bz();
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)???);
      g.Ek();
      ??? = g.Ei();
      localObject3 = new e.c();
      j = bi.f((Integer)((e)???).dqs.get(14, null));
      m = d.qVN;
      if (m == j) {
        paramBoolean = false;
      }
      for (;;)
      {
        label1764:
        if (paramBoolean)
        {
          ((e)???).dqs.set(8197, "");
          ((e)???).dqs.set(15, Integer.valueOf(0));
        }
        if (j != m)
        {
          bool1 = true;
          label1804:
          if ((j > 620822536) || (j == m)) {
            break label2476;
          }
          ((e)???).dqs.set(274480, Boolean.valueOf(true));
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreStorage", "[initialize] need init emoji");
          label1841:
          if ((j != 0) && (j < 637599744)) {
            ((e)???).dqs.set(348162, Boolean.valueOf(true));
          }
          if (j == m) {
            break label2503;
          }
          i = 1;
          label1875:
          if (i != 0)
          {
            com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreStorage", "account storage version changed from " + Integer.toHexString(j) + " to " + Integer.toHexString(m) + ", init=" + paramBoolean);
            if (((Integer)((e)???).dqk.get(37, Integer.valueOf(0))).intValue() == 0) {
              ((e)???).dqk.set(37, Integer.valueOf(j));
            }
            ((e)???).dqs.set(30, Boolean.valueOf(false));
            ((e)???).dqs.set(-2046825377, Boolean.valueOf(false));
            ((e)???).dqs.set(-2046825369, Boolean.valueOf(false));
            ((e)???).dqs.set(54, Boolean.valueOf(false));
            ((e)???).dqs.set(-2046825368, Boolean.valueOf(false));
            ((e)???).dqs.set(-2046825366, Boolean.valueOf(true));
            ((e)???).dqs.set(62, Boolean.valueOf(true));
            ad.getContext().getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
            if ((j & 0xFF00) == (m & 0xFF00)) {
              af.Wp("show_whatsnew");
            }
          }
          ((e.c)localObject3).dqH = bool1;
          ((e.c)localObject3).dqI = j;
          this.dpt = ((e.c)localObject3);
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "check is update :%b ", new Object[] { Boolean.valueOf(((e.c)localObject3).dqH) });
          this.dpw = true;
          if (!this.dpv)
          {
            Dn();
            g.Eg().Dy();
          }
          at.dBv.T("last_login_uin", com.tencent.mm.a.o.getString(k));
          f.mDy.eK(k);
          if (getClass().getClassLoader() != null) {
            break label2508;
          }
          i = -1;
          label2213:
          if (Thread.currentThread().getContextClassLoader() != null) {
            break label2522;
          }
        }
        label2476:
        label2503:
        label2508:
        label2522:
        for (j = -1;; j = Thread.currentThread().getContextClassLoader().hashCode())
        {
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "SmcLogic.setUin, class loader %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          this.dps = new com.tencent.mm.model.a();
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "setAccUin done :%s", new Object[] { com.tencent.mm.a.o.getString(k) });
          g.Ek();
          if (g.Eh().dpP == null) {
            break;
          }
          g.Ek();
          if (g.Eh().dpP.dJs == null) {
            break;
          }
          g.Ek();
          g.Eh().dpP.dJs.bD(true);
          g.Ek();
          ??? = g.Eh().dpP.dJs.Lr();
          if ((k == 0) || (??? == null) || (k == ((com.tencent.mm.network.c)???).Df())) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "summerauth update acc info with acc stg: old acc uin=%d, this uin=%d", new Object[] { Integer.valueOf(((com.tencent.mm.network.c)???).Df()), Integer.valueOf(k) });
          f.mDy.a(148L, 46L, 1L, false);
          ((com.tencent.mm.network.c)???).eK(k);
          break;
          if ((m > 570425344) && (j <= 570425344))
          {
            paramBoolean = true;
            break label1764;
          }
          if ((m <= 570556456) || (j > 570556456)) {
            break label2535;
          }
          paramBoolean = true;
          break label1764;
          bool1 = false;
          break label1804;
          ((e)???).dqs.set(274480, Boolean.valueOf(false));
          com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreStorage", "[initialize] need not init emoji");
          break label1841;
          i = 0;
          break label1875;
          i = getClass().getClassLoader().hashCode();
          break label2213;
        }
        label2535:
        paramBoolean = false;
      }
    }
  }
  
  public final void initialize()
  {
    if (Dx()) {
      return;
    }
    synchronized (this.dpo)
    {
      if (Dx()) {
        return;
      }
    }
    int i = b.a(dpp);
    if (i != 0)
    {
      this.dpB = SystemClock.elapsedRealtime();
      com.tencent.mm.sdk.platformtools.x.w("MMKernel.CoreAccount", "auto set up account storage uin: %d, stack: %s", new Object[] { Integer.valueOf(i), bi.cjd() });
      bs(false);
    }
  }
  
  public final void release()
  {
    synchronized (this.dpo)
    {
      Dm();
      return;
    }
  }
  
  private static enum a {}
  
  static final class b
  {
    private static boolean dpM = true;
    private boolean dpK = false;
    private w dpL;
    private int uin = 0;
    
    /* Error */
    private void DC()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: aload_0
      //   3: monitorenter
      //   4: aload_0
      //   5: getfield 29	com/tencent/mm/kernel/a$b:dpL	Lcom/tencent/mm/storage/w;
      //   8: invokestatic 35	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
      //   11: aload_0
      //   12: getfield 29	com/tencent/mm/kernel/a$b:dpL	Lcom/tencent/mm/storage/w;
      //   15: astore 5
      //   17: aload 5
      //   19: ifnonnull +18 -> 37
      //   22: ldc 37
      //   24: ldc 39
      //   26: invokestatic 45	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   29: aload_0
      //   30: iload_1
      //   31: putfield 24	com/tencent/mm/kernel/a$b:uin	I
      //   34: aload_0
      //   35: monitorexit
      //   36: return
      //   37: aload 5
      //   39: iconst_1
      //   40: invokevirtual 51	com/tencent/mm/storage/w:get	(I)Ljava/lang/Object;
      //   43: checkcast 53	java/lang/Integer
      //   46: astore_3
      //   47: aload_3
      //   48: astore_2
      //   49: aload_3
      //   50: ifnonnull +154 -> 204
      //   53: aload 5
      //   55: getfield 56	com/tencent/mm/storage/w:sOk	Z
      //   58: ifeq +17 -> 75
      //   61: getstatic 62	com/tencent/mm/plugin/report/f:mDy	Lcom/tencent/mm/plugin/report/f;
      //   64: ldc2_w 63
      //   67: ldc2_w 65
      //   70: lconst_1
      //   71: iconst_0
      //   72: invokevirtual 70	com/tencent/mm/plugin/report/f:a	(JJJZ)V
      //   75: invokestatic 76	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
      //   78: ldc 78
      //   80: iconst_4
      //   81: invokevirtual 84	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
      //   84: ldc 86
      //   86: iconst_0
      //   87: invokeinterface 92 3 0
      //   92: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   95: astore 4
      //   97: aload_3
      //   98: astore_2
      //   99: aload 4
      //   101: ifnull +103 -> 204
      //   104: ldc 37
      //   106: ldc 98
      //   108: iconst_3
      //   109: anewarray 4	java/lang/Object
      //   112: dup
      //   113: iconst_0
      //   114: aload_3
      //   115: aastore
      //   116: dup
      //   117: iconst_1
      //   118: aload 4
      //   120: aastore
      //   121: dup
      //   122: iconst_2
      //   123: aload 5
      //   125: getfield 56	com/tencent/mm/storage/w:sOk	Z
      //   128: invokestatic 103	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   131: aastore
      //   132: invokestatic 107	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   135: getstatic 18	com/tencent/mm/kernel/a$b:dpM	Z
      //   138: ifeq +53 -> 191
      //   141: ldc 37
      //   143: ldc 109
      //   145: iconst_2
      //   146: anewarray 4	java/lang/Object
      //   149: dup
      //   150: iconst_0
      //   151: aload 4
      //   153: aastore
      //   154: dup
      //   155: iconst_1
      //   156: invokestatic 115	com/tencent/mm/sdk/platformtools/bi:cjd	()Lcom/tencent/mm/sdk/platformtools/aj;
      //   159: aastore
      //   160: invokestatic 117	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   163: getstatic 62	com/tencent/mm/plugin/report/f:mDy	Lcom/tencent/mm/plugin/report/f;
      //   166: sipush 11911
      //   169: iconst_1
      //   170: anewarray 4	java/lang/Object
      //   173: dup
      //   174: iconst_0
      //   175: aload 4
      //   177: invokestatic 121	com/tencent/mm/sdk/platformtools/bi:f	(Ljava/lang/Integer;)I
      //   180: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   183: aastore
      //   184: invokevirtual 125	com/tencent/mm/plugin/report/f:h	(I[Ljava/lang/Object;)V
      //   187: iconst_0
      //   188: putstatic 18	com/tencent/mm/kernel/a$b:dpM	Z
      //   191: aload 5
      //   193: aload 4
      //   195: invokevirtual 129	java/lang/Integer:intValue	()I
      //   198: invokestatic 132	com/tencent/mm/kernel/a$b:a	(Lcom/tencent/mm/storage/w;I)V
      //   201: aload 4
      //   203: astore_2
      //   204: ldc 37
      //   206: ldc -122
      //   208: iconst_1
      //   209: anewarray 4	java/lang/Object
      //   212: dup
      //   213: iconst_0
      //   214: aload_2
      //   215: invokestatic 121	com/tencent/mm/sdk/platformtools/bi:f	(Ljava/lang/Integer;)I
      //   218: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   221: aastore
      //   222: invokestatic 107	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   225: aload_2
      //   226: invokestatic 121	com/tencent/mm/sdk/platformtools/bi:f	(Ljava/lang/Integer;)I
      //   229: istore_1
      //   230: goto -201 -> 29
      //   233: astore_2
      //   234: aload_0
      //   235: monitorexit
      //   236: aload_2
      //   237: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	238	0	this	b
      //   1	229	1	i	int
      //   48	178	2	localObject1	Object
      //   233	4	2	localObject2	Object
      //   46	69	3	localInteger1	Integer
      //   95	107	4	localInteger2	Integer
      //   15	177	5	localw	w
      // Exception table:
      //   from	to	target	type
      //   4	17	233	finally
      //   22	29	233	finally
      //   29	34	233	finally
      //   37	47	233	finally
      //   53	75	233	finally
      //   75	97	233	finally
      //   104	191	233	finally
      //   191	201	233	finally
      //   204	230	233	finally
    }
    
    private int Df()
    {
      try
      {
        if (!this.dpK)
        {
          DC();
          this.dpK = true;
        }
        int i = this.uin;
        return i;
      }
      finally {}
    }
    
    private static void a(w paramw, int paramInt)
    {
      com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "setSysUin uin: %d, stack: %s", new Object[] { Integer.valueOf(paramInt), bi.cjd() });
      ad.getContext().getSharedPreferences("system_config_prefs", 4).edit().putInt("default_uin", paramInt).commit();
      paramw.set(1, Integer.valueOf(paramInt));
    }
    
    private void eK(int paramInt)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.x.i("MMKernel.CoreAccount", "Uin From %s To %s hash:%d thread:%d[%s] stack:%s", new Object[] { com.tencent.mm.a.o.getString(this.uin), com.tencent.mm.a.o.getString(paramInt), Integer.valueOf(com.tencent.mm.a.h.aM(paramInt, 100)), Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName(), bi.cjd() });
        Assert.assertNotNull(this.dpL);
        a(this.dpL, paramInt);
        this.uin = paramInt;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void a(w paramw)
    {
      try
      {
        this.dpL = paramw;
        return;
      }
      finally
      {
        paramw = finally;
        throw paramw;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */