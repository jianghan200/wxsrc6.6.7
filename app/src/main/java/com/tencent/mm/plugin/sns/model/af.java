package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteException;
import android.graphics.Point;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.cj;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.nl;
import com.tencent.mm.g.a.rw;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.n;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.w;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.ax.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class af
  implements com.tencent.mm.model.ar, com.tencent.mm.plugin.sns.b.j
{
  private static int npC;
  private static int npD;
  public static boolean npv = true;
  private static int npw = 0;
  private static int npx = 0;
  private static String nqc = "";
  protected static HashMap<Integer, h.d> nqd = new HashMap();
  private static int nql = 103;
  private static Point nqm = new Point();
  private String dIp;
  private com.tencent.mm.bt.h dqq;
  private byte[] dsN = new byte[0];
  private ag handler = new ag(Looper.getMainLooper());
  private com.tencent.mm.sdk.b.c lyA = new af.32(this);
  private ag npA = null;
  private ag npB = null;
  private s npE;
  private com.tencent.mm.plugin.sns.storage.o npF;
  private com.tencent.mm.plugin.sns.storage.f npG;
  private com.tencent.mm.plugin.sns.storage.d npH;
  private y npI;
  private g npJ;
  private com.tencent.mm.plugin.sns.storage.m npK;
  private com.tencent.mm.plugin.sns.storage.k npL;
  private com.tencent.mm.plugin.sns.storage.u npM;
  private ad npN;
  private am.a npO;
  private b npP;
  private aw npQ;
  private aj npR;
  private com.tencent.mm.plugin.sns.f.c npS;
  private com.tencent.mm.plugin.sns.f.g npT;
  private q npU;
  private com.tencent.mm.plugin.sns.a.b.i npV;
  private ao npW = new ao();
  private boolean npX = false;
  private boolean npY = true;
  private w npZ = new w();
  private ag[] npy = new ag[3];
  private ag[] npz = new ag[1];
  private com.tencent.mm.sdk.b.c nqA = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nqB = new af.15(this);
  private com.tencent.mm.sdk.b.c nqC = new af.16(this);
  private com.tencent.mm.sdk.b.c nqD = new af.17(this);
  private com.tencent.mm.sdk.b.c nqE = new af.18(this);
  private com.tencent.mm.sdk.b.c nqF = new af.19(this);
  private com.tencent.mm.sdk.b.c nqG = new af.20(this);
  private com.tencent.mm.sdk.b.c nqH = new af.21(this);
  private com.tencent.mm.sdk.b.c nqI = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nqJ = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nqK = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nqL = new af.26(this);
  private com.tencent.mm.sdk.b.c nqM = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c nqN = new af.28(this);
  private com.tencent.mm.sdk.b.c nqO = new af.29(this);
  private com.tencent.mm.sdk.b.c nqP = new af.30(this);
  private boolean nqQ = false;
  private com.tencent.mm.sdk.b.c nqR = new af.33(this);
  private com.tencent.mm.sdk.b.c nqS = new af.35(this);
  private boolean nqa = false;
  private byte[] nqb = new byte[0];
  private com.tencent.mm.plugin.sns.d nqe;
  private com.tencent.mm.plugin.sns.e.a nqf;
  private ar nqg;
  private com.tencent.mm.plugin.sns.lucky.a.f nqh = new com.tencent.mm.plugin.sns.lucky.a.f();
  private com.tencent.mm.plugin.sns.lucky.a.j nqi = new com.tencent.mm.plugin.sns.lucky.a.j();
  private com.tencent.mm.plugin.sns.lucky.a.d nqj = new com.tencent.mm.plugin.sns.lucky.a.d();
  private com.tencent.mm.plugin.sns.lucky.a.l nqk = new com.tencent.mm.plugin.sns.lucky.a.l();
  private n nqn;
  private com.tencent.mm.plugin.sns.k nqo;
  private com.tencent.mm.plugin.sns.e nqp;
  private com.tencent.mm.plugin.sns.p nqq;
  private com.tencent.mm.plugin.sns.h nqr;
  private com.tencent.mm.plugin.sns.g nqs;
  private com.tencent.mm.plugin.sns.m nqt;
  private com.tencent.mm.plugin.sns.j nqu;
  private com.tencent.mm.plugin.sns.b nqv;
  private com.tencent.mm.plugin.sns.c nqw;
  private com.tencent.mm.plugin.sns.f nqx;
  private com.tencent.mm.sdk.b.c nqy = new af.11(this);
  private com.tencent.mm.sdk.b.c nqz = new af.13(this);
  
  static
  {
    nqd.put(Integer.valueOf("CanvasInfo".hashCode()), new af.12());
    nqd.put(Integer.valueOf("UxCanvasInfo".hashCode()), new af.23());
    nqd.put(Integer.valueOf("SNSMEDIA_TABLE".hashCode()), new af.34());
    nqd.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new af.36());
    nqd.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new af.37());
    nqd.put(Integer.valueOf("ADSNSINFO_TABLE".hashCode()), new af.38());
    nqd.put(Integer.valueOf("SNSEXT_TABLE".hashCode()), new af.39());
    nqd.put(Integer.valueOf("SNSCOMMENT_TABLE".hashCode()), new af.40());
    nqd.put(Integer.valueOf("SNSTAGINFO_TABLE".hashCode()), new af.2());
    nqd.put(Integer.valueOf("SNSKVREPORT_TABLE".hashCode()), new af.3());
  }
  
  public af()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "snscore create! " + Thread.currentThread().getId());
    byA();
    if (this.npA == null) {
      com.tencent.mm.sdk.f.e.d(new af.6(this), "SnsCore_fileTask_handler", 1).start();
    }
    if (this.npB == null) {
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          Looper.prepare();
          af.b(af.this, new ag());
          Looper.loop();
        }
      }, "SnsCore_task_handler", 10).start();
    }
    com.tencent.mm.sdk.platformtools.ah.i(new af.1(this), 3000L);
  }
  
  public static com.tencent.mm.bt.h FO()
  {
    return bxW().dqq;
  }
  
  public static String Gq()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().dqp;
  }
  
  public static ag aRs()
  {
    if (npx > 0) {
      npx = 0;
    }
    ag[] arrayOfag = bxW().npz;
    int i = npx;
    npx = i + 1;
    return arrayOfag[i];
  }
  
  public static ag aRu()
  {
    return bxW().handler;
  }
  
  private static Point bdF()
  {
    WindowManager localWindowManager = (WindowManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    nqm.x = localDisplayMetrics.widthPixels;
    nqm.y = localDisplayMetrics.heightPixels;
    return nqm;
  }
  
  public static String bxU()
  {
    com.tencent.mm.kernel.g.Ek();
    return (String)com.tencent.mm.kernel.g.Ei().DT().get(2, null);
  }
  
  public static int bxV()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eg();
    return com.tencent.mm.kernel.a.Df();
  }
  
  private static af bxW()
  {
    af localaf1 = (af)com.tencent.mm.model.p.v(af.class);
    if (!localaf1.nqa) {}
    for (;;)
    {
      Object localObject3;
      Object localObject2;
      synchronized (localaf1.nqb)
      {
        if (!localaf1.nqa)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "onAccInit because bug!");
          localaf1.bn(true);
        }
        if (!localaf1.npX) {
          break label1567;
        }
        synchronized (localaf1.dsN)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "getCore need reset DB now " + Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + localaf1.hashCode());
          if (!localaf1.npX) {
            break label1564;
          }
          localaf1.npY = false;
          localObject3 = localaf1.npZ;
          localObject2 = nqd;
          if (((w)localObject3).nJO)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "pass hasTrim");
            if (localaf1.dqq != null) {
              break;
            }
            localaf1.dqq = new com.tencent.mm.bt.h();
            com.tencent.mm.kernel.g.Ek();
            localObject2 = com.tencent.mm.kernel.g.Ei().cachePath;
            localObject2 = (String)localObject2 + "SnsMicroMsg.db";
            if (localaf1.dqq.b((String)localObject2, nqd, true)) {
              break;
            }
            throw new SQLiteException("sns db init failed");
          }
        }
      }
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Eg().Dx())
      {
        int i = bi.getInt(com.tencent.mm.k.g.AT().getValue("AndroidCleanSnsDb"), 0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "pass dynamic? " + i);
        if (i <= 0)
        {
          com.tencent.mm.kernel.g.Ek();
          String str = com.tencent.mm.kernel.g.Ei().cachePath;
          if (FileOp.cn(str + "SnsMicroMsg2.db.ini"))
          {
            w.NI(str);
            FileOp.deleteFile(str + "SnsMicroMsg2.db.ini");
          }
          Object localObject4 = com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.chY(), 0);
          if (bi.bG(((SharedPreferences)localObject4).getLong("check_trim_time", 0L)) < 604800L)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "trim sns pass because time short");
          }
          else
          {
            ((SharedPreferences)localObject4).edit().putLong("check_trim_time", bi.VE()).commit();
            ((w)localObject3).nJO = true;
            long l1 = System.currentTimeMillis();
            i = com.tencent.mm.o.a.BP();
            if ((i == 1) || (i == 2))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "trim sns error space dangerous");
            }
            else if (FileOp.cn(str + "sns_mark.ini"))
            {
              if (bi.bH(FileOp.mJ(str + "sns_mark.ini")) < 2592000000L)
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "mark file exist and return");
                w.NI(str);
              }
              else
              {
                FileOp.deleteFile(str + "sns_mark.ini");
              }
            }
            else
            {
              long l2 = FileOp.mI(str + "SnsMicroMsg.db");
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "trim sns " + l2);
              if (l2 < 52428800L)
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "trim sns free pass: " + (System.currentTimeMillis() - l1));
              }
              else
              {
                FileOp.mM(str + "sns_mark.ini");
                localObject4 = str + "SnsMicroMsg2.db";
                localObject3 = new com.tencent.mm.bt.h();
                if (!((com.tencent.mm.bt.h)localObject3).b((String)localObject4, null, false)) {
                  throw new com.tencent.mm.model.b((byte)0);
                }
                localObject4 = new com.tencent.mm.bt.h();
                if (!((com.tencent.mm.bt.h)localObject4).b(str + "SnsMicroMsg.db", (HashMap)localObject2, true)) {
                  throw new com.tencent.mm.model.b((byte)0);
                }
                l2 = System.currentTimeMillis();
                if (!w.a((com.tencent.mm.bt.h)localObject4, (com.tencent.mm.bt.h)localObject3)) {}
                for (i = -1;; i = 1)
                {
                  long l3 = System.currentTimeMillis() - l2;
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "copysns insert all %d passed ret:" + i, new Object[] { Long.valueOf(l3) });
                  ((com.tencent.mm.bt.h)localObject4).closeDB();
                  ((com.tencent.mm.bt.h)localObject3).closeDB();
                  if (i >= 0)
                  {
                    com.tencent.mm.kernel.g.Ek();
                    localObject2 = com.tencent.mm.kernel.g.Ei().cachePath;
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db");
                    bool = FileOp.i((String)localObject2, "SnsMicroMsg2.db", "SnsMicroMsg.db");
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "rename file " + bool);
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-shm");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-wal");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db.ini");
                    FileOp.y("SnsMicroMsg2.db.ini", "SnsMicroMsg.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db");
                    FileOp.deleteFile((String)localObject2 + "sns_mark.ini");
                  }
                  l2 = System.currentTimeMillis() - l2;
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "copysns data ret=%d all: %d copytime %d ", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l2 - l3) });
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "trim sns done pass: " + (System.currentTimeMillis() - l1));
                  break;
                  l3 = System.currentTimeMillis();
                  w.a((com.tencent.mm.bt.h)localObject4, (com.tencent.mm.bt.h)localObject3, "snsExtInfo3");
                  boolean bool = ((com.tencent.mm.bt.h)localObject3).fV("", "insert into " + "snsExtInfo3" + " select * from old." + "snsExtInfo3");
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "copysns ret_ext:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  w.a((com.tencent.mm.bt.h)localObject4, (com.tencent.mm.bt.h)localObject3, "SnsComment");
                  bool = ((com.tencent.mm.bt.h)localObject3).fV("", "insert into " + "SnsComment" + " select * from old." + "SnsComment");
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "copysns ret_msg:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  w.a((com.tencent.mm.bt.h)localObject4, (com.tencent.mm.bt.h)localObject3, "SnsInfo");
                  bool = ((com.tencent.mm.bt.h)localObject3).fV("", "insert into " + "SnsInfo" + " select * from old." + "SnsInfo" + " where  (sourceType & 2 != 0 ) " + com.tencent.mm.plugin.sns.storage.o.nJs + " limit 200");
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "copysns ret_sns:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  bool = ((com.tencent.mm.bt.h)localObject3).fV("", "update snsExtinfo3 set md5 = '', faults = '';");
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TrimSnsDb", "update ext info  passed  %s  updateRet %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l3), Boolean.valueOf(bool) });
                  ((com.tencent.mm.bt.h)localObject3).fV("", "DETACH DATABASE old");
                }
              }
            }
          }
        }
      }
    }
    localaf2.npX = false;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "resetdb done");
    label1564:
    label1567:
    return localaf2;
  }
  
  public static boolean bxX()
  {
    bxW();
    return !com.tencent.mm.kernel.g.Eg().Dx();
  }
  
  public static ag bxY()
  {
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Em().cil();
  }
  
  public static ag bxZ()
  {
    if ((npw >= z.sOq) || (npw >= 3)) {
      npw = 0;
    }
    ag[] arrayOfag = bxW().npy;
    int i = npw;
    npw = i + 1;
    return arrayOfag[i];
  }
  
  private void byA()
  {
    int i = 0;
    while (i < 3)
    {
      if (this.npy[i] == null) {
        com.tencent.mm.sdk.f.e.d(new af.4(this, i), "SnsCore_CDNDownload_handler", 1).start();
      }
      i += 1;
    }
    i = 0;
    while (i <= 0)
    {
      if (this.npz[0] == null) {
        com.tencent.mm.sdk.f.e.d(new af.5(this), "SnsCore_thumbDecode_handler", 1).start();
      }
      i += 1;
    }
  }
  
  public static String byB()
  {
    if (bi.oW(nqc))
    {
      Iterator localIterator = ax.ciH().iterator();
      while (localIterator.hasNext())
      {
        ax.a locala = (ax.a)localIterator.next();
        if (com.tencent.mm.compatible.util.e.bnC.equals(locala.sIK)) {
          nqc = locala.sIL;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "get filesys " + nqc);
    }
    return bi.aG(nqc, "");
  }
  
  protected static ag bya()
  {
    return bxW().npA;
  }
  
  public static ag byb()
  {
    return bxW().npB;
  }
  
  public static ay byc()
  {
    com.tencent.mm.kernel.g.Ek();
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR();
  }
  
  public static s byd()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npE == null) {
      bxW().npE = new s(bxW().dqq);
    }
    return bxW().npE;
  }
  
  public static am.a bye()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npO == null)
    {
      bxW().npO = new am.a();
      com.tencent.mm.plugin.sns.b.n.nkC = bxW().npO;
    }
    return bxW().npO;
  }
  
  public static com.tencent.mm.plugin.sns.f.c byf()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npS == null) {
      bxW().npS = new com.tencent.mm.plugin.sns.f.c();
    }
    return bxW().npS;
  }
  
  public static com.tencent.mm.plugin.sns.f.g byg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npT == null) {
      bxW().npT = new com.tencent.mm.plugin.sns.f.g();
    }
    return bxW().npT;
  }
  
  public static q byh()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npU == null) {
      bxW().npU = new q(bxW().dqq);
    }
    return bxW().npU;
  }
  
  public static com.tencent.mm.plugin.sns.a.b.i byi()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npV == null) {
      bxW().npV = new com.tencent.mm.plugin.sns.a.b.i();
    }
    return bxW().npV;
  }
  
  public static b byj()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npP == null) {
      bxW().npP = new b();
    }
    return bxW().npP;
  }
  
  public static aw byk()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npQ == null)
    {
      bxW().npQ = new aw();
      com.tencent.mm.plugin.sns.b.n.nkw = bxW().npQ;
    }
    return bxW().npQ;
  }
  
  public static g byl()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npJ == null)
    {
      bxW().npJ = new g();
      com.tencent.mm.plugin.sns.b.n.nkx = bxW().npJ;
    }
    return bxW().npJ;
  }
  
  public static ar bym()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().nqg == null) {
      bxW().nqg = new ar();
    }
    return bxW().nqg;
  }
  
  public static ad byn()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npN == null)
    {
      af localaf = bxW();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Ek();
      localaf.npN = new ad(com.tencent.mm.kernel.g.Ei().cachePath + "snsAsyncQueue.data");
    }
    return bxW().npN;
  }
  
  public static com.tencent.mm.plugin.sns.storage.o byo()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npF == null)
    {
      bxW().npF = new com.tencent.mm.plugin.sns.storage.o(bxW().dqq);
      com.tencent.mm.plugin.sns.b.n.nkD = bxW().npF;
    }
    return bxW().npF;
  }
  
  public static com.tencent.mm.plugin.sns.storage.d byp()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npH == null) {
      bxW().npH = new com.tencent.mm.plugin.sns.storage.d(bxW().dqq);
    }
    return bxW().npH;
  }
  
  public static y byq()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npI == null) {
      bxW().npI = new y(bxW().dqq);
    }
    return bxW().npI;
  }
  
  public static com.tencent.mm.plugin.sns.storage.f byr()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npG == null) {
      bxW().npG = new com.tencent.mm.plugin.sns.storage.f(bxW().dqq);
    }
    return bxW().npG;
  }
  
  public static com.tencent.mm.plugin.sns.storage.m bys()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npK == null)
    {
      bxW().npK = new com.tencent.mm.plugin.sns.storage.m(bxW().dqq, new ah());
      com.tencent.mm.plugin.sns.b.n.nky = bxW().npK;
    }
    return bxW().npK;
  }
  
  public static com.tencent.mm.plugin.sns.storage.k byt()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npL == null)
    {
      bxW().npL = new com.tencent.mm.plugin.sns.storage.k(bxW().dqq);
      com.tencent.mm.plugin.sns.b.n.nkz = bxW().npL;
    }
    return bxW().npL;
  }
  
  public static com.tencent.mm.plugin.sns.storage.u byu()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npM == null)
    {
      bxW().npM = new com.tencent.mm.plugin.sns.storage.u(bxW().dqq);
      com.tencent.mm.plugin.sns.b.n.nkA = bxW().npM;
    }
    return bxW().npM;
  }
  
  public static aj byv()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (bxW().npR == null) {
      bxW().npR = new aj();
    }
    return bxW().npR;
  }
  
  public static int byw()
  {
    if (bdF().y < bdF().x) {}
    for (int i = bdF().y;; i = bdF().x - com.tencent.mm.bp.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ad.getContext(), nql))
    {
      i /= 3;
      npC = i;
      if (i > 10) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
      return 150;
    }
    return npC;
  }
  
  public static int byx()
  {
    if (npD <= 0)
    {
      npD = 200;
      npD = com.tencent.mm.bp.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ad.getContext(), npD);
    }
    return npD;
  }
  
  public static boolean byy()
  {
    SharedPreferences localSharedPreferences = an.m(com.tencent.mm.sdk.platformtools.ad.getContext(), "sp_sns_dynswitch_stg", 4);
    if (localSharedPreferences.contains("st_sw_use_vcodec_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_vcodec_img", false);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    boolean bool = localSharedPreferences.getBoolean("sw_use_vcodec_img", false);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsCore", "isUseVCodecImg: %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean byz()
  {
    SharedPreferences localSharedPreferences = an.m(com.tencent.mm.sdk.platformtools.ad.getContext(), "sp_sns_dynswitch_stg", 4);
    if (localSharedPreferences.contains("st_sw_use_wxpc_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_wxpc_img", false);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    boolean bool = localSharedPreferences.getBoolean("sw_use_wxpc_img", false);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsCore", "isUseWxpcImg: %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  private static void checkDir()
  {
    FileOp.mL(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath());
    FileOp.mL(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath());
  }
  
  public static String getAccSnsPath()
  {
    return ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
  }
  
  public static String getAccSnsTmpPath()
  {
    return ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void a(com.tencent.mm.model.ap paramap)
  {
    u.a(paramap);
  }
  
  public final void b(com.tencent.mm.model.ap paramap)
  {
    u.b(paramap);
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCore", "onAccountPostReset " + Thread.currentThread().getId() + " isAccInit: " + this.nqa);
    if (this.nqa) {
      return;
    }
    this.nqa = true;
    this.npX = true;
    FileOp.mL(Gq() + "sfs");
    this.dIp = getAccSnsPath();
    checkDir();
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("NewYearSNSCtrl2016", this.nqh, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("NewYearSNSTips2016", this.nqi, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("NewYearSNSAmountLevelCtrl2016", this.nqj, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("SnsAd", this.nqk, true);
    com.tencent.mm.plugin.sns.b.n.nkw = byk();
    com.tencent.mm.plugin.sns.b.n.nkx = byl();
    com.tencent.mm.plugin.sns.b.n.nky = bys();
    com.tencent.mm.plugin.sns.b.n.nkz = byt();
    com.tencent.mm.plugin.sns.b.n.nkA = byu();
    com.tencent.mm.plugin.sns.b.n.nkC = bye();
    com.tencent.mm.plugin.sns.b.n.nkB = this;
    com.tencent.mm.plugin.sns.b.n.nkD = byo();
    com.tencent.mm.sdk.b.a.sFg.b(this.nqO);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqP);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqC);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqA);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqB);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqD);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqE);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqF);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqG);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqH);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqI);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqJ);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqK);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqS);
    this.nqn = new n();
    this.nqo = new com.tencent.mm.plugin.sns.k();
    this.nqp = new com.tencent.mm.plugin.sns.e();
    this.nqq = new com.tencent.mm.plugin.sns.p();
    this.nqr = new com.tencent.mm.plugin.sns.h();
    this.nqs = new com.tencent.mm.plugin.sns.g();
    this.nqt = new com.tencent.mm.plugin.sns.m();
    this.nqu = new com.tencent.mm.plugin.sns.j();
    this.nqv = new com.tencent.mm.plugin.sns.b();
    this.nqw = new com.tencent.mm.plugin.sns.c();
    this.nqx = new com.tencent.mm.plugin.sns.f();
    com.tencent.mm.sdk.b.a.sFg.b(this.nqN);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqM);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqq);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqn);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqo);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqp);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqr);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqs);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqt);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqu);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqv);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqw);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqx);
    com.tencent.mm.sdk.b.a.sFg.b(this.lyA);
    this.nqe = new com.tencent.mm.plugin.sns.d();
    com.tencent.mm.sdk.b.a.sFg.b(this.nqe);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqR);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqy);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqz);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqL);
    Object localObject1 = byi();
    com.tencent.mm.plugin.sns.a.b.i.njw = com.tencent.mm.k.g.AT().getInt("MMUxAdLog2GSendSize", 20480);
    com.tencent.mm.plugin.sns.a.b.i.njx = com.tencent.mm.k.g.AT().getInt("MMUxAdLog3GSendSize", 30720);
    com.tencent.mm.plugin.sns.a.b.i.njy = com.tencent.mm.k.g.AT().getInt("MMUxAdLogWifiSendSize", 51200);
    com.tencent.mm.plugin.sns.a.b.i.njz = com.tencent.mm.k.g.AT().getInt("MMUxAdLogMinRandTime", 60);
    com.tencent.mm.plugin.sns.a.b.i.njA = com.tencent.mm.k.g.AT().getInt("MMUxAdLogMaxRandTime", 1800);
    com.tencent.mm.plugin.sns.a.b.i.njB = com.tencent.mm.k.g.AT().getInt("MMUxAdLogMaxExceptionTime", 43200);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsLogMgr", "init " + com.tencent.mm.plugin.sns.a.b.i.njw + ";" + com.tencent.mm.plugin.sns.a.b.i.njx + ";" + com.tencent.mm.plugin.sns.a.b.i.njy + ";" + com.tencent.mm.plugin.sns.a.b.i.njz + ";" + com.tencent.mm.plugin.sns.a.b.i.njA + ";" + com.tencent.mm.plugin.sns.a.b.i.njB);
    if (com.tencent.mm.plugin.sns.a.b.i.njA - com.tencent.mm.plugin.sns.a.b.i.njz < 0) {
      com.tencent.mm.plugin.sns.a.b.i.njA = com.tencent.mm.plugin.sns.a.b.i.njz;
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1802, (com.tencent.mm.ab.e)localObject1);
    localObject1 = byk();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(207, (com.tencent.mm.ab.e)localObject1);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(209, (com.tencent.mm.ab.e)localObject1);
    localObject1 = this.npW;
    com.tencent.mm.sdk.b.a.sFg.b(((ao)localObject1).nry);
    com.tencent.mm.sdk.b.a.sFg.b(((ao)localObject1).nrz);
    com.tencent.mm.sdk.b.a.sFg.b(((ao)localObject1).nrA);
    this.nqf = new com.tencent.mm.plugin.sns.e.a();
    ap.init();
    localObject1 = com.tencent.mm.modelsns.c.ehc;
    com.tencent.mm.modelsns.c.RE();
    if (com.tencent.mm.memory.l.Fv())
    {
      localObject1 = com.tencent.mm.memory.c.duT;
      localObject2 = com.tencent.mm.memory.c.duT;
      localObject2.getClass();
      ((com.tencent.mm.memory.c)localObject1).a(new af.8(this, (com.tencent.mm.memory.c)localObject2));
    }
    localObject1 = com.tencent.mm.memory.o.dvq;
    Object localObject2 = com.tencent.mm.memory.o.dvq;
    localObject2.getClass();
    ((com.tencent.mm.memory.o)localObject1).a(new af.9(this, (com.tencent.mm.memory.o)localObject2));
    localObject1 = com.tencent.mm.memory.g.dva;
    localObject2 = com.tencent.mm.memory.g.dva;
    localObject2.getClass();
    ((com.tencent.mm.memory.g)localObject1).a(new af.10(this, (com.tencent.mm.memory.g)localObject2));
    bym();
  }
  
  public final void bo(boolean paramBoolean)
  {
    FileOp.mL(Gq() + "sfs");
    checkDir();
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ??? = byi();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1802, (com.tencent.mm.ab.e)???);
    ??? = this.npW;
    com.tencent.mm.sdk.b.a.sFg.c(((ao)???).nry);
    com.tencent.mm.sdk.b.a.sFg.c(((ao)???).nrz);
    com.tencent.mm.sdk.b.a.sFg.c(((ao)???).nrA);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqO);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqP);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqN);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqM);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqC);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqA);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqB);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqD);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqE);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqF);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqq);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqr);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqH);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqI);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqn);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqo);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqp);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqs);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqt);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqu);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqv);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqw);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqx);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqG);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqe);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqJ);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqK);
    com.tencent.mm.sdk.b.a.sFg.c(this.lyA);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqR);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqL);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqy);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqz);
    com.tencent.mm.sdk.b.a.sFg.c(this.nqS);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("NewYearSNSCtrl2016", this.nqh, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("NewYearSNSTips2016", this.nqi, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("NewYearSNSAmountLevelCtrl2016", this.nqj, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.o)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().b("SnsAd", this.nqk, true);
    ??? = byk();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(207, (com.tencent.mm.ab.e)???);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(209, (com.tencent.mm.ab.e)???);
    ??? = (af)com.tencent.mm.model.p.v(af.class);
    if (??? != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsCore", "SnsCore close db");
      if (((af)???).dqq != null)
      {
        ((af)???).dqq.closeDB();
        ((af)???).dqq = null;
      }
      int i = 0;
      while (i < 3)
      {
        if (???.npy[i] != null) {
          ???.npy[i].getLooper().quit();
        }
        i += 1;
      }
      i = 0;
      while (i <= 0)
      {
        if (???.npz[0] != null) {
          ???.npz[0].getLooper().quit();
        }
        i += 1;
      }
      if (((af)???).npA != null) {
        ((af)???).npA.getLooper().quit();
      }
      if (((af)???).npB != null) {
        ((af)???).npB.getLooper().quit();
      }
    }
    ??? = this.nqf;
    byj().b((b.b)???);
    com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.sns.e.a)???).nll);
    ap.Wa();
    com.tencent.mm.memory.g.dva.Fm();
    com.tencent.mm.memory.c.duT.Fm();
    com.tencent.mm.memory.o.dvq.Fm();
    ar localar = bym();
    localar.nrJ = null;
    localar.emO = null;
    localar.nrL.clear();
    localar.nrK.clear();
    synchronized (localar.nrM)
    {
      localar.nrM.clear();
      com.tencent.mm.sdk.b.a.sFg.c(localar.nrN);
      com.tencent.mm.sdk.b.a.sFg.c(localar.nrz);
      com.tencent.mm.sdk.b.a.sFg.c(localar.nrA);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */