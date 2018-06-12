package com.tencent.mm.plugin.voip.model;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Looper;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.ih;
import com.tencent.mm.g.a.su;
import com.tencent.mm.model.au;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.voip.b.d;
import com.tencent.mm.plugin.voip.model.a.e;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.protocal.c.aqd;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.protocal.c.bxi;
import com.tencent.mm.protocal.c.bzb;
import com.tencent.mm.protocal.c.caa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r
{
  private static final com.tencent.mm.a.f<Integer, n.a> dzj = new com.tencent.mm.a.f(5);
  public boolean bCI = false;
  public al ltH = new al(Looper.getMainLooper(), new r.3(this), true);
  private n mHI = new com.tencent.mm.network.n.a()
  {
    public final void ev(int paramAnonymousInt)
    {
      x.d("MicroMsg.Voip.VoipService", "network status change from " + paramAnonymousInt);
      if ((r.a(r.this)) && (paramAnonymousInt == 4))
      {
        localObject = r.this.oNa.oHa;
        if (((j)localObject).oKh == 0) {
          ((j)localObject).oKh = ((j)localObject).oJX.oOj;
        }
        paramAnonymousInt = com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext());
        if (paramAnonymousInt != ((j)localObject).oKh) {
          com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + ((j)localObject).oKh + " to " + paramAnonymousInt);
        }
      }
      try
      {
        byte[] arrayOfByte = new byte[4];
        arrayOfByte[0] = ((byte)paramAnonymousInt);
        int i = ((j)localObject).oJX.setAppCmd(301, arrayOfByte, 4);
        if (i < 0) {
          com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + paramAnonymousInt + "fail:" + i + ", [roomid=" + ((j)localObject).oJX.kpw + ", roomkey=" + ((j)localObject).oJX.kpp + "]");
        }
        bxi localbxi = new bxi();
        localbxi.stM = 3;
        localbxi.stN = new com.tencent.mm.bk.b(arrayOfByte, 0, 1);
        ((j)localObject).oJX.SendRUDP(localbxi.toByteArray(), localbxi.toByteArray().length);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
        }
      }
      ((j)localObject).oKh = paramAnonymousInt;
      Object localObject = r.this.oNa;
      new com.tencent.mm.plugin.voip.model.a.h(((s)localObject).oHa.oJX.kpo, ((s)localObject).oHa.oJX.kpp, ((s)localObject).oHa.oJX.kpw, 0, 0, null).bLp();
    }
  };
  public String oMr = null;
  public s oNa = new s();
  public o oNb;
  public boolean oNc = false;
  public boolean oNd = false;
  private long oNe = 0L;
  public Map<Integer, Long> oNf = new HashMap();
  public int oNg = -1;
  public long oNh = 0L;
  public long oNi = 0L;
  public Point oNj;
  public boolean oNk = false;
  public boolean oNl = false;
  public boolean oNm = false;
  public caa oNn = null;
  public long oNo = 0L;
  List<a> oNp = null;
  public String talker = null;
  
  public r()
  {
    au.a(this.mHI);
  }
  
  public static n.a OG(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      localObject = null;
    }
    int i;
    n.a locala;
    do
    {
      return (n.a)localObject;
      i = paramString.hashCode();
      locala = (n.a)dzj.get(Integer.valueOf(i));
      localObject = locala;
    } while (locala != null);
    Object localObject = new n.a();
    if (!((n.a)localObject).parse(paramString)) {
      return null;
    }
    dzj.m(Integer.valueOf(i), localObject);
    return (n.a)localObject;
  }
  
  private static byte[] P(Map<Integer, Long> paramMap)
  {
    bsb localbsb = new bsb();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      aqd localaqd = new aqd();
      localaqd.mEb = localInteger.intValue();
      localaqd.rSE = ((Long)paramMap.get(localInteger)).intValue();
      localLinkedList.push(localaqd);
    }
    localbsb.slI = localLinkedList;
    localbsb.slH = localLinkedList.size();
    try
    {
      paramMap = localbsb.toByteArray();
      return paramMap;
    }
    catch (IOException paramMap)
    {
      x.printErrStackTrace("MicroMsg.Voip.VoipService", paramMap, "", new Object[0]);
    }
    return null;
  }
  
  public static byte[] R(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 12;
    while (i < paramInt + 12)
    {
      arrayOfByte[(i - 12)] = paramArrayOfByte[i];
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    long l = System.currentTimeMillis();
    paramContext = new ih();
    paramContext.bRN.bRQ = false;
    paramContext.bRN.bRP = l;
    paramContext.bRN.bRO = localContext;
    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
    x.i("MicroMsg.Voip.VoipService", "start VideoActivity");
    paramContext = new Intent(localContext, VideoActivity.class);
    paramContext.putExtra("Voip_User", paramString);
    paramContext.putExtra("Voip_Outcall", paramBoolean1);
    paramContext.putExtra("Voip_VideoCall", paramBoolean2);
    paramContext.putExtra("Voip_LastPage_Hash", l);
    if (paramBoolean3)
    {
      paramContext.setFlags(603979776);
      paramContext.addFlags(268435456);
    }
    localContext.startActivity(paramContext);
  }
  
  private static Map<Integer, Long> aS(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte)) {
      return null;
    }
    try
    {
      paramArrayOfByte = (bsb)new bsb().aG(paramArrayOfByte);
      if (paramArrayOfByte == null) {
        return null;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      return null;
    }
    x.d("MicroMsg.Voip.VoipService", "dkpush : keyCount:" + paramArrayOfByte.slH);
    LinkedList localLinkedList = paramArrayOfByte.slI;
    if (localLinkedList.size() != paramArrayOfByte.slH) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayOfByte.slH)
    {
      localHashMap.put(Integer.valueOf(((aqd)localLinkedList.get(i)).mEb), Long.valueOf(0xFFFFFFFF & ((aqd)localLinkedList.get(i)).rSE));
      i += 1;
    }
    if (localHashMap.size() != paramArrayOfByte.slH) {
      return null;
    }
    return localHashMap;
  }
  
  private static String aT(byte[] paramArrayOfByte)
  {
    String str1 = "";
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str3 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str2 = str3;
      if (str3.length() == 1) {
        str2 = "0" + str3;
      }
      str1 = str1 + str2.toUpperCase();
      i += 1;
    }
    return str1;
  }
  
  private static void bKQ()
  {
    su localsu = new su();
    localsu.cdE.bOh = 7;
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
  }
  
  public static void bKZ() {}
  
  public static void bLa() {}
  
  private static boolean dE(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      x.d("MicroMsg.Voip.VoipService", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        x.i("MicroMsg.Voip.VoipService", "is in backGround.");
        return false;
      }
    }
    if (((KeyguardManager)ad.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
      return false;
    }
    x.i("MicroMsg.Voip.VoipService", "is in foreGround.");
    return true;
  }
  
  public static float iS(boolean paramBoolean)
  {
    float f1 = 0.74766356F;
    f2 = f1;
    try
    {
      Object localObject = i.bJI();
      if (paramBoolean) {
        f2 = f1;
      }
      for (localObject = ((r)localObject).oNa.oHa.oJX.field_capInfo;; localObject = ((r)localObject).oNa.oHa.oJX.oOn)
      {
        f2 = f1;
        if (localObject == null) {
          break;
        }
        f2 = f1;
        localObject = ByteBuffer.wrap((byte[])localObject);
        f2 = f1;
        if (((ByteBuffer)localObject).getInt() > 65535)
        {
          f2 = f1;
          ((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN);
        }
        f2 = f1;
        ((ByteBuffer)localObject).getShort();
        f2 = f1;
        ((ByteBuffer)localObject).getShort();
        f2 = f1;
        float f3 = ((ByteBuffer)localObject).getInt() / 100.0F;
        if (f3 != 0.0F) {
          f1 = f3;
        }
        f2 = f1;
        x.d("MicroMsg.Voip.VoipService", "use rate: %s, changed: %s", new Object[] { Float.valueOf(f1), Boolean.valueOf(paramBoolean) });
        return f1;
        f2 = f1;
      }
      return f2;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Voip.VoipService", "update failed: " + localException.getMessage());
    }
  }
  
  public final void F(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.oNl = paramBoolean1;
    this.oNm = paramBoolean2;
    x.d("MicroMsg.Voip.VoipService", "isMinimize: %b, miniOnlyHideVoip: %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
  }
  
  public final int G(boolean paramBoolean1, boolean paramBoolean2)
  {
    s locals = this.oNa;
    locals.bLk();
    if (!locals.oNF.ciq()) {
      locals.oNF.SO();
    }
    m localm = locals.oHa.oJX.oPS;
    localm.oLx = System.currentTimeMillis();
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.VoipDailReport", "devin:acceptCallTime:" + localm.oLx);
    x.i("MicroMsg.Voip.VoipServiceEx", "accept onlyAudio:" + paramBoolean1);
    if (!locals.oHa.bJO())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to accept with calling, status =" + locals.oHa.mStatus);
      return -1;
    }
    if (locals.oHa.oJX.kpo == 0)
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to accept with roomid = 0. ");
      return -1;
    }
    com.tencent.mm.plugin.voip.b.a.eV("MicroMsg.Voip.VoipServiceEx", g.Ac() + "accept invite, roomid:" + locals.oHa.oJX.kpo);
    locals.oNE.J(50000L, 50000L);
    locals.oHa.oJX.oPS.bKf();
    new com.tencent.mm.plugin.voip.model.a.b(1, locals.oHa.oJX.netType, locals.oHa.oJX.kpo, locals.oHa.oJX.field_peerId, locals.oHa.oJX.field_capInfo, locals.oHa.oJX.kpp, paramBoolean1, paramBoolean2).bLp();
    locals.oHa.setStatus(4);
    locals.oHa.oJZ.oKv = 1;
    locals.oHa.bXc = true;
    return 0;
  }
  
  public final void O(final int paramInt, final long paramLong)
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.Voip.VoipService", "onDelayInvite, roomId:%s, roomKey:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        if ((!com.tencent.mm.k.f.Ak()) && (!r.el(ad.getContext())))
        {
          x.i("MicroMsg.Voip.VoipService", "background now and notification Is closed.");
          return;
        }
        if (r.this.oNa.bLd())
        {
          x.i("MicroMsg.Voip.VoipService", "room is ready, ingore the msg");
          return;
        }
        new e(paramInt, paramLong, "").bLp();
      }
    });
  }
  
  public final void OH(String paramString)
  {
    int i = 0;
    while (i < 2)
    {
      ah.i(new r.4(this, paramString), 1000L);
      i += 1;
    }
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, boolean paramBoolean)
  {
    l locall = this.oNa.oHa.oJZ;
    int i;
    if (locall.oKv == l.oKu)
    {
      i = 1;
      if (paramBoolean) {
        break label50;
      }
    }
    label50:
    for (int j = 1;; j = 0)
    {
      if ((j & i) == 0) {
        break label56;
      }
      return -1;
      i = 0;
      break;
    }
    label56:
    if (!locall.oHa.oJX.lkO) {
      return -1;
    }
    return locall.oHa.oJX.videoEncodeToLocal(paramArrayOfByte, paramInt1, paramInt3, paramInt4, paramInt2, 0, 75, paramArrayOfInt);
  }
  
  public final void a(caa paramcaa)
  {
    if ((!com.tencent.mm.k.f.Ak()) && (!dE(ad.getContext())))
    {
      x.i("MicroMsg.Voip.VoipService", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
      if ((this.oNn == null) && (this.ltH.ciq()))
      {
        x.i("MicroMsg.Voip.VoipService", "voipGetRoomInfoResp is null and time is stopped.");
        this.oNn = paramcaa;
        this.ltH.J(2000L, 2000L);
        this.oNo = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.h.mEJ.a(500L, 4L, 1L, false);
      }
      return;
    }
    String str = paramcaa.svS;
    Object localObject1 = com.tencent.mm.model.q.GF();
    int j = paramcaa.svK;
    x.i("MicroMsg.Voip.VoipService", "doTaskCallin self:%s talker:%s type:%d roomid:%d", new Object[] { localObject1, str, Integer.valueOf(j), Integer.valueOf(paramcaa.rxG) });
    if (this.oNa.bJP())
    {
      s.a(paramcaa.rxG, paramcaa.rxH, 2, null, null, str);
      x.d("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because voip busy:roomid " + paramcaa.rxG);
      com.tencent.mm.plugin.report.service.h.mEJ.a(11525, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(2), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.h.mEJ.a(11526, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(7) });
      return;
    }
    if (s.bLe())
    {
      s.a(paramcaa.rxG, paramcaa.rxH, 3, null, null, str);
      x.e("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because telephone busy:roomid " + paramcaa.rxG);
      com.tencent.mm.plugin.report.service.h.mEJ.a(11525, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(3), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.h.mEJ.a(11526, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(7) });
      return;
    }
    this.oNa.bLf();
    localObject1 = this.oNa;
    int i;
    if (((s)localObject1).oHa.bJP())
    {
      com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to setInviteContent during calling, status =" + ((s)localObject1).oHa.mStatus);
      i = 0;
    }
    while (i == 0)
    {
      x.e("MicroMsg.Voip.VoipService", "doTaskCallin setInviteContent failed!");
      com.tencent.mm.plugin.report.service.h.mEJ.a(11525, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(5), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.h.mEJ.a(11526, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(7) });
      return;
      if (paramcaa == null)
      {
        i = 0;
      }
      else
      {
        ((s)localObject1).oHa.oJX.oPS.oLb = paramcaa.svK;
        x.d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + ((s)localObject1).oHa.oJX.oPS.oLb);
        if (((s)localObject1).oHa.oJX.lkO)
        {
          com.tencent.mm.plugin.voip.b.a.eW("MicroMsg.Voip.VoipServiceEx", g.Ac() + "v2protocal already init.");
          ((s)localObject1).oHa.oJX.iT(false);
          ((s)localObject1).oHa.oJX.reset();
        }
        Object localObject2 = ((s)localObject1).oHa;
        ((j)localObject2).oKc = paramcaa;
        ((j)localObject2).oJX.kFn = ((j)localObject2).oKc.svS;
        ((j)localObject2).oJX.kpo = ((j)localObject2).oKc.rxG;
        ((j)localObject2).oJX.kpp = ((j)localObject2).oKc.rxH;
        ((j)localObject2).oJX.kpw = 1;
        ((j)localObject2).oJX.oOk = 0;
        ((j)localObject2).mStatus = 3;
        if ((d.bLS()) || (com.tencent.mm.p.a.BQ()) || (d.bLV()))
        {
          x.e("MicroMsg.Voip.VoipServiceEx", "setInviteContent, reject, pstn/multitak/f2f talking");
          if (d.bLS())
          {
            s.a(paramcaa.rxG, paramcaa.rxH, 2, null, null, paramcaa.svS);
            i = 0;
          }
          else
          {
            ((s)localObject1).bLh();
            if (paramcaa.svK == 0)
            {
              i = 1;
              label1023:
              localObject2 = paramcaa.svS;
              if (i == 0) {
                break label1066;
              }
            }
            label1066:
            for (localObject1 = bd.tby;; localObject1 = bd.tbx)
            {
              q.a((String)localObject2, (String)localObject1, 0, 6, ad.getContext().getString(R.l.voip_callfrom_reject_msg));
              break;
              i = 0;
              break label1023;
            }
          }
        }
        else if (((s)localObject1).oHa.oJX.bGN() < 0)
        {
          com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
          i = 0;
        }
        else
        {
          if (v2protocal.oPU != null) {
            v2protocal.oPU.a(((s)localObject1).oHa);
          }
          com.tencent.mm.plugin.report.service.h.mEJ.a(11524, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          ((s)localObject1).oHa.oJY.bKw();
          i = 1;
        }
      }
    }
    localObject1 = ad.getContext();
    au.HU();
    if (com.tencent.mm.model.c.FR().Yg(str) == null)
    {
      s.a(paramcaa.rxG, paramcaa.rxH, 4, null, null, str);
      x.d("MicroMsg.Voip.VoipService", "doTaskCallin invite ignor because talker nil:roomid " + paramcaa.rxG);
      com.tencent.mm.plugin.report.service.h.mEJ.a(11525, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(4), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext())), Long.valueOf(System.currentTimeMillis()) });
      com.tencent.mm.plugin.report.service.h.mEJ.a(11526, true, true, new Object[] { Integer.valueOf(i.bJI().oNa.oHa.oJX.kpo), Long.valueOf(i.bJI().bKT()), Long.valueOf(i.bJI().bKU()), Integer.valueOf(7) });
      return;
    }
    if ((1 == j) || (j == 0)) {
      if (j != 0) {
        break label1609;
      }
    }
    label1609:
    for (boolean bool = true;; bool = false)
    {
      a((Context)localObject1, str, false, bool, true);
      if (this.oNa != null)
      {
        localObject1 = this.oNa;
        ((s)localObject1).oNu = paramcaa.rxG;
        if (!((s)localObject1).oNF.ciq()) {
          ((s)localObject1).oNF.SO();
        }
        ((s)localObject1).oNF.J(70000L, 70000L);
      }
      x.d("MicroMsg.Voip.VoipService", "doTaskCallin invite startActivity VideoActivity");
      s.a(paramcaa.rxG, paramcaa.rxH, 1, this.oNa.oHa.oJX.field_peerId, this.oNa.oHa.oJX.field_capInfo, str);
      com.tencent.mm.plugin.report.service.h.mEJ.a(11525, true, true, new Object[] { Integer.valueOf(paramcaa.rxG), Long.valueOf(paramcaa.rxH), Integer.valueOf(paramcaa.svK), Integer.valueOf(1), Integer.valueOf(com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext())), Long.valueOf(System.currentTimeMillis()) });
      return;
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    x.i("MicroMsg.Voip.VoipService", "setCalling " + paramBoolean1 + "  videoCall " + paramBoolean2);
    this.bCI = paramBoolean1;
    if (paramBoolean2)
    {
      this.oNc = paramBoolean1;
      this.oNa.oHa.oJX.oOw = 0;
    }
    for (;;)
    {
      this.talker = paramString;
      return;
      this.oNa.oHa.oJX.oOw = 1;
      this.oNd = paramBoolean1;
    }
  }
  
  public final void aO(Context paramContext, String paramString)
  {
    x.i("MicroMsg.Voip.VoipService", "startVoiceCall, toUser:" + paramString);
    if ((bi.oW(paramString)) || (System.currentTimeMillis() - this.oNe < 2000L)) {}
    do
    {
      return;
      if (System.currentTimeMillis() - this.oNh < this.oNi)
      {
        x.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
        com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_server_not_available, R.l.voip_warnning_title, null);
        return;
      }
      this.oNe = System.currentTimeMillis();
      au.HU();
    } while (com.tencent.mm.model.c.FR().Yg(paramString) == null);
    a(paramContext, paramString, true, false, false);
    bKQ();
  }
  
  public final void aP(Context paramContext, String paramString)
  {
    x.i("MicroMsg.Voip.VoipService", "startVideoCall, toUser:" + paramString);
    if ((bi.oW(paramString)) || (System.currentTimeMillis() - this.oNe < 2000L)) {}
    do
    {
      return;
      if (System.currentTimeMillis() - this.oNh < this.oNi)
      {
        x.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
        com.tencent.mm.ui.base.h.a(paramContext, R.l.voip_server_not_available, R.l.voip_warnning_title, null);
        return;
      }
      this.oNe = System.currentTimeMillis();
      au.HU();
    } while (com.tencent.mm.model.c.FR().Yg(paramString) == null);
    a(paramContext, paramString, true, true, false);
    bKQ();
  }
  
  /* Error */
  public final int b(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 18
    //   3: lconst_0
    //   4: lstore 16
    //   6: lconst_0
    //   7: lstore 8
    //   9: lconst_0
    //   10: lstore 12
    //   12: lconst_0
    //   13: lstore 10
    //   15: ldc -28
    //   17: ldc_w 923
    //   20: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: aload_0
    //   24: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   27: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   30: getfield 926	com/tencent/mm/plugin/voip/model/j:oKb	[B
    //   33: invokestatic 928	com/tencent/mm/plugin/voip/model/r:aS	([B)Ljava/util/Map;
    //   36: astore 24
    //   38: aload 24
    //   40: ifnonnull +335 -> 375
    //   43: ldc -28
    //   45: ldc_w 930
    //   48: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: lconst_0
    //   52: lstore 14
    //   54: ldc -28
    //   56: new 344	java/lang/StringBuilder
    //   59: dup
    //   60: ldc_w 932
    //   63: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   66: lload 18
    //   68: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   71: ldc_w 934
    //   74: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: lload 16
    //   79: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   82: ldc_w 936
    //   85: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: lload 14
    //   90: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   93: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: new 938	com/tencent/mm/protocal/c/bzw
    //   102: dup
    //   103: invokespecial 939	com/tencent/mm/protocal/c/bzw:<init>	()V
    //   106: aload_1
    //   107: invokevirtual 940	com/tencent/mm/protocal/c/bzw:aG	([B)Lcom/tencent/mm/bk/a;
    //   110: checkcast 938	com/tencent/mm/protocal/c/bzw
    //   113: astore 24
    //   115: iconst_0
    //   116: istore 5
    //   118: iload 5
    //   120: aload 24
    //   122: getfield 943	com/tencent/mm/protocal/c/bzw:svL	Ljava/util/LinkedList;
    //   125: invokevirtual 219	java/util/LinkedList:size	()I
    //   128: if_icmpge +1065 -> 1193
    //   131: aload 24
    //   133: getfield 943	com/tencent/mm/protocal/c/bzw:svL	Ljava/util/LinkedList;
    //   136: iload 5
    //   138: invokevirtual 363	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   141: checkcast 945	com/tencent/mm/protocal/c/bzv
    //   144: astore 25
    //   146: ldc -28
    //   148: new 344	java/lang/StringBuilder
    //   151: dup
    //   152: ldc_w 947
    //   155: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload 25
    //   160: getfield 950	com/tencent/mm/protocal/c/bzv:rtM	I
    //   163: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   166: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload 25
    //   174: getfield 950	com/tencent/mm/protocal/c/bzv:rtM	I
    //   177: iconst_1
    //   178: if_icmpne +458 -> 636
    //   181: new 952	com/tencent/mm/protocal/c/cav
    //   184: dup
    //   185: invokespecial 953	com/tencent/mm/protocal/c/cav:<init>	()V
    //   188: aload 25
    //   190: getfield 957	com/tencent/mm/protocal/c/bzv:rfy	Lcom/tencent/mm/protocal/c/bhy;
    //   193: getfield 963	com/tencent/mm/protocal/c/bhy:siK	Lcom/tencent/mm/bk/b;
    //   196: getfield 968	com/tencent/mm/bk/b:lR	[B
    //   199: invokevirtual 969	com/tencent/mm/protocal/c/cav:aG	([B)Lcom/tencent/mm/bk/a;
    //   202: checkcast 952	com/tencent/mm/protocal/c/cav
    //   205: astore_1
    //   206: aload_1
    //   207: ifnull +406 -> 613
    //   210: ldc -28
    //   212: new 344	java/lang/StringBuilder
    //   215: dup
    //   216: ldc_w 971
    //   219: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: aload_1
    //   223: getfield 974	com/tencent/mm/protocal/c/cav:hcd	I
    //   226: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   229: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: lload 8
    //   237: aload 25
    //   239: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   242: i2l
    //   243: lcmp
    //   244: ifge +1170 -> 1414
    //   247: aload 25
    //   249: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   252: i2l
    //   253: lstore 6
    //   255: lload 6
    //   257: lstore 8
    //   259: aload 25
    //   261: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   264: i2l
    //   265: lload 18
    //   267: lcmp
    //   268: ifle +353 -> 621
    //   271: ldc -28
    //   273: new 344	java/lang/StringBuilder
    //   276: dup
    //   277: ldc_w 977
    //   280: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   283: aload 25
    //   285: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   288: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   291: ldc_w 979
    //   294: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: lload 18
    //   299: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   302: ldc_w 981
    //   305: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: aload_1
    //   309: getfield 974	com/tencent/mm/protocal/c/cav:hcd	I
    //   312: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   315: ldc_w 983
    //   318: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   327: aload_0
    //   328: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   331: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   334: getfield 987	com/tencent/mm/plugin/voip/model/j:oKa	Lcom/tencent/mm/plugin/voip/model/t;
    //   337: aload_1
    //   338: iconst_1
    //   339: invokevirtual 992	com/tencent/mm/plugin/voip/model/t:a	(Lcom/tencent/mm/protocal/c/cav;I)V
    //   342: lload 6
    //   344: lstore 20
    //   346: lload 10
    //   348: lstore 22
    //   350: lload 12
    //   352: lstore 6
    //   354: iload 5
    //   356: iconst_1
    //   357: iadd
    //   358: istore 5
    //   360: lload 20
    //   362: lstore 8
    //   364: lload 6
    //   366: lstore 12
    //   368: lload 22
    //   370: lstore 10
    //   372: goto -254 -> 118
    //   375: aload 24
    //   377: invokeinterface 176 1 0
    //   382: invokeinterface 182 1 0
    //   387: astore 25
    //   389: lconst_0
    //   390: lstore 6
    //   392: aload 25
    //   394: invokeinterface 188 1 0
    //   399: ifeq +1022 -> 1421
    //   402: aload 25
    //   404: invokeinterface 192 1 0
    //   409: checkcast 141	java/lang/Integer
    //   412: astore 26
    //   414: aload 24
    //   416: aload 26
    //   418: invokeinterface 202 2 0
    //   423: checkcast 204	java/lang/Long
    //   426: astore 27
    //   428: aload 26
    //   430: invokevirtual 198	java/lang/Integer:intValue	()I
    //   433: tableswitch	default:+27->460, 1:+67->500, 2:+77->510, 3:+87->520
    //   460: ldc -28
    //   462: new 344	java/lang/StringBuilder
    //   465: dup
    //   466: ldc_w 994
    //   469: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   472: aload 26
    //   474: invokevirtual 198	java/lang/Integer:intValue	()I
    //   477: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   480: ldc_w 996
    //   483: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: aload 27
    //   488: invokevirtual 999	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   491: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   494: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   497: goto -105 -> 392
    //   500: aload 27
    //   502: invokevirtual 1002	java/lang/Long:longValue	()J
    //   505: lstore 18
    //   507: goto -115 -> 392
    //   510: aload 27
    //   512: invokevirtual 1002	java/lang/Long:longValue	()J
    //   515: lstore 16
    //   517: goto -125 -> 392
    //   520: aload 27
    //   522: invokevirtual 1002	java/lang/Long:longValue	()J
    //   525: lstore 6
    //   527: goto -135 -> 392
    //   530: astore 24
    //   532: ldc -28
    //   534: aload 24
    //   536: ldc -26
    //   538: iconst_0
    //   539: anewarray 4	java/lang/Object
    //   542: invokestatic 236	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: aload_1
    //   546: invokestatic 1004	com/tencent/mm/plugin/voip/model/r:aT	([B)Ljava/lang/String;
    //   549: astore 24
    //   551: ldc -28
    //   553: new 344	java/lang/StringBuilder
    //   556: dup
    //   557: ldc_w 1006
    //   560: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   563: aload_1
    //   564: arraylength
    //   565: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   568: ldc_w 1008
    //   571: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   574: aload 24
    //   576: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   582: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   585: iconst_0
    //   586: ireturn
    //   587: astore_1
    //   588: ldc -28
    //   590: ldc_w 1010
    //   593: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   596: ldc -28
    //   598: aload_1
    //   599: ldc -26
    //   601: iconst_0
    //   602: anewarray 4	java/lang/Object
    //   605: invokestatic 236	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   608: aconst_null
    //   609: astore_1
    //   610: goto -404 -> 206
    //   613: ldc -28
    //   615: ldc_w 1010
    //   618: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   621: lload 8
    //   623: lstore 20
    //   625: lload 12
    //   627: lstore 6
    //   629: lload 10
    //   631: lstore 22
    //   633: goto -279 -> 354
    //   636: aload 25
    //   638: getfield 950	com/tencent/mm/protocal/c/bzv:rtM	I
    //   641: iconst_2
    //   642: if_icmpne +337 -> 979
    //   645: new 1012	com/tencent/mm/protocal/c/cak
    //   648: dup
    //   649: invokespecial 1013	com/tencent/mm/protocal/c/cak:<init>	()V
    //   652: aload 25
    //   654: getfield 957	com/tencent/mm/protocal/c/bzv:rfy	Lcom/tencent/mm/protocal/c/bhy;
    //   657: getfield 963	com/tencent/mm/protocal/c/bhy:siK	Lcom/tencent/mm/bk/b;
    //   660: getfield 968	com/tencent/mm/bk/b:lR	[B
    //   663: invokevirtual 1014	com/tencent/mm/protocal/c/cak:aG	([B)Lcom/tencent/mm/bk/a;
    //   666: checkcast 1012	com/tencent/mm/protocal/c/cak
    //   669: astore_1
    //   670: aload_1
    //   671: ifnull +285 -> 956
    //   674: ldc -28
    //   676: new 344	java/lang/StringBuilder
    //   679: dup
    //   680: ldc_w 1016
    //   683: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   686: aload_1
    //   687: getfield 1019	com/tencent/mm/protocal/c/cak:hcE	I
    //   690: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   693: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   696: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   699: lload 12
    //   701: aload 25
    //   703: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   706: i2l
    //   707: lcmp
    //   708: ifge +699 -> 1407
    //   711: aload 25
    //   713: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   716: i2l
    //   717: lstore 6
    //   719: aload 25
    //   721: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   724: i2l
    //   725: lload 16
    //   727: lcmp
    //   728: ifle +174 -> 902
    //   731: ldc -28
    //   733: new 344	java/lang/StringBuilder
    //   736: dup
    //   737: ldc_w 1021
    //   740: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   743: aload 25
    //   745: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   748: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   751: ldc_w 1023
    //   754: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   757: lload 16
    //   759: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   762: ldc_w 983
    //   765: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   768: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   771: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   774: aload_1
    //   775: getfield 1019	com/tencent/mm/protocal/c/cak:hcE	I
    //   778: iconst_5
    //   779: if_icmpne +54 -> 833
    //   782: aload_0
    //   783: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   786: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   789: getfield 987	com/tencent/mm/plugin/voip/model/j:oKa	Lcom/tencent/mm/plugin/voip/model/t;
    //   792: aload_1
    //   793: invokevirtual 1026	com/tencent/mm/plugin/voip/model/t:a	(Lcom/tencent/mm/protocal/c/cak;)V
    //   796: lload 8
    //   798: lstore 20
    //   800: lload 10
    //   802: lstore 22
    //   804: goto -450 -> 354
    //   807: astore_1
    //   808: ldc -28
    //   810: ldc_w 1028
    //   813: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   816: ldc -28
    //   818: aload_1
    //   819: ldc -26
    //   821: iconst_0
    //   822: anewarray 4	java/lang/Object
    //   825: invokestatic 236	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   828: aconst_null
    //   829: astore_1
    //   830: goto -160 -> 670
    //   833: aload_1
    //   834: getfield 1019	com/tencent/mm/protocal/c/cak:hcE	I
    //   837: iconst_1
    //   838: if_icmpne +28 -> 866
    //   841: aload_0
    //   842: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   845: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   848: getfield 987	com/tencent/mm/plugin/voip/model/j:oKa	Lcom/tencent/mm/plugin/voip/model/t;
    //   851: aload_1
    //   852: invokevirtual 1030	com/tencent/mm/plugin/voip/model/t:b	(Lcom/tencent/mm/protocal/c/cak;)V
    //   855: lload 8
    //   857: lstore 20
    //   859: lload 10
    //   861: lstore 22
    //   863: goto -509 -> 354
    //   866: ldc -28
    //   868: new 344	java/lang/StringBuilder
    //   871: dup
    //   872: ldc_w 1032
    //   875: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   878: aload_1
    //   879: getfield 1019	com/tencent/mm/protocal/c/cak:hcE	I
    //   882: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   885: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   888: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   891: lload 8
    //   893: lstore 20
    //   895: lload 10
    //   897: lstore 22
    //   899: goto -545 -> 354
    //   902: ldc -28
    //   904: new 344	java/lang/StringBuilder
    //   907: dup
    //   908: ldc_w 1034
    //   911: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   914: aload 25
    //   916: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   919: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   922: ldc_w 1036
    //   925: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   928: lload 16
    //   930: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   933: ldc_w 983
    //   936: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   939: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   942: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   945: lload 8
    //   947: lstore 20
    //   949: lload 10
    //   951: lstore 22
    //   953: goto -599 -> 354
    //   956: ldc -28
    //   958: ldc_w 1028
    //   961: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   964: lload 8
    //   966: lstore 20
    //   968: lload 12
    //   970: lstore 6
    //   972: lload 10
    //   974: lstore 22
    //   976: goto -622 -> 354
    //   979: lload 8
    //   981: lstore 20
    //   983: lload 12
    //   985: lstore 6
    //   987: lload 10
    //   989: lstore 22
    //   991: aload 25
    //   993: getfield 950	com/tencent/mm/protocal/c/bzv:rtM	I
    //   996: iconst_3
    //   997: if_icmpne -643 -> 354
    //   1000: new 959	com/tencent/mm/protocal/c/bhy
    //   1003: dup
    //   1004: invokespecial 1037	com/tencent/mm/protocal/c/bhy:<init>	()V
    //   1007: aload 25
    //   1009: getfield 957	com/tencent/mm/protocal/c/bzv:rfy	Lcom/tencent/mm/protocal/c/bhy;
    //   1012: getfield 963	com/tencent/mm/protocal/c/bhy:siK	Lcom/tencent/mm/bk/b;
    //   1015: getfield 968	com/tencent/mm/bk/b:lR	[B
    //   1018: invokevirtual 1041	com/tencent/mm/protocal/c/bhy:br	([B)Lcom/tencent/mm/protocal/c/bhy;
    //   1021: astore_1
    //   1022: lload 8
    //   1024: lstore 20
    //   1026: lload 12
    //   1028: lstore 6
    //   1030: lload 10
    //   1032: lstore 22
    //   1034: aload_1
    //   1035: ifnull -681 -> 354
    //   1038: lload 10
    //   1040: aload 25
    //   1042: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   1045: i2l
    //   1046: lcmp
    //   1047: ifge +353 -> 1400
    //   1050: aload 25
    //   1052: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   1055: i2l
    //   1056: lstore 6
    //   1058: aload 25
    //   1060: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   1063: i2l
    //   1064: lload 14
    //   1066: lcmp
    //   1067: ifle +93 -> 1160
    //   1070: ldc -28
    //   1072: new 344	java/lang/StringBuilder
    //   1075: dup
    //   1076: ldc_w 1043
    //   1079: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1082: aload 25
    //   1084: getfield 975	com/tencent/mm/protocal/c/bzv:mEb	I
    //   1087: invokevirtual 353	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1090: ldc_w 1045
    //   1093: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1096: lload 14
    //   1098: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1101: ldc_w 983
    //   1104: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1107: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1110: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1113: aload_0
    //   1114: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   1117: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   1120: getfield 987	com/tencent/mm/plugin/voip/model/j:oKa	Lcom/tencent/mm/plugin/voip/model/t;
    //   1123: aload_1
    //   1124: invokevirtual 1048	com/tencent/mm/plugin/voip/model/t:c	(Lcom/tencent/mm/protocal/c/bhy;)V
    //   1127: aload_0
    //   1128: getfield 91	com/tencent/mm/plugin/voip/model/r:oNn	Lcom/tencent/mm/protocal/c/caa;
    //   1131: ifnull +29 -> 1160
    //   1134: aload_1
    //   1135: getfield 963	com/tencent/mm/protocal/c/bhy:siK	Lcom/tencent/mm/bk/b;
    //   1138: invokevirtual 1049	com/tencent/mm/bk/b:toByteArray	()[B
    //   1141: invokestatic 1053	com/tencent/mm/plugin/voip/b/a:aV	([B)I
    //   1144: sipush 255
    //   1147: iand
    //   1148: iconst_1
    //   1149: if_icmpne +11 -> 1160
    //   1152: aload_0
    //   1153: getfield 91	com/tencent/mm/plugin/voip/model/r:oNn	Lcom/tencent/mm/protocal/c/caa;
    //   1156: iconst_1
    //   1157: putfield 725	com/tencent/mm/protocal/c/caa:svK	I
    //   1160: lload 6
    //   1162: lstore 22
    //   1164: lload 8
    //   1166: lstore 20
    //   1168: lload 12
    //   1170: lstore 6
    //   1172: goto -818 -> 354
    //   1175: astore_1
    //   1176: ldc -28
    //   1178: aload_1
    //   1179: ldc -26
    //   1181: iconst_0
    //   1182: anewarray 4	java/lang/Object
    //   1185: invokestatic 236	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1188: aconst_null
    //   1189: astore_1
    //   1190: goto -168 -> 1022
    //   1193: lload 8
    //   1195: lload 18
    //   1197: lcmp
    //   1198: ifle +195 -> 1393
    //   1201: lload 12
    //   1203: lload 16
    //   1205: lcmp
    //   1206: ifle +180 -> 1386
    //   1209: lload 10
    //   1211: lload 14
    //   1213: lcmp
    //   1214: ifle +165 -> 1379
    //   1217: new 74	java/util/HashMap
    //   1220: dup
    //   1221: invokespecial 75	java/util/HashMap:<init>	()V
    //   1224: astore_1
    //   1225: aload_1
    //   1226: iconst_1
    //   1227: invokestatic 145	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1230: lload 8
    //   1232: invokestatic 368	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1235: invokeinterface 372 3 0
    //   1240: pop
    //   1241: aload_1
    //   1242: iconst_2
    //   1243: invokestatic 145	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1246: lload 12
    //   1248: invokestatic 368	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1251: invokeinterface 372 3 0
    //   1256: pop
    //   1257: aload_1
    //   1258: iconst_3
    //   1259: invokestatic 145	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1262: lload 10
    //   1264: invokestatic 368	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1267: invokeinterface 372 3 0
    //   1272: pop
    //   1273: aload_1
    //   1274: invokestatic 1055	com/tencent/mm/plugin/voip/model/r:P	(Ljava/util/Map;)[B
    //   1277: astore_1
    //   1278: iload_2
    //   1279: aload_0
    //   1280: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   1283: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   1286: getfield 485	com/tencent/mm/plugin/voip/model/j:oJX	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1289: getfield 601	com/tencent/mm/plugin/voip/model/v2protocal:kpo	I
    //   1292: if_icmpne +77 -> 1369
    //   1295: lload_3
    //   1296: aload_0
    //   1297: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   1300: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   1303: getfield 485	com/tencent/mm/plugin/voip/model/j:oJX	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1306: getfield 632	com/tencent/mm/plugin/voip/model/v2protocal:kpp	J
    //   1309: lcmp
    //   1310: ifne +59 -> 1369
    //   1313: aload_0
    //   1314: getfield 123	com/tencent/mm/plugin/voip/model/r:oNa	Lcom/tencent/mm/plugin/voip/model/s;
    //   1317: getfield 479	com/tencent/mm/plugin/voip/model/s:oHa	Lcom/tencent/mm/plugin/voip/model/j;
    //   1320: aload_1
    //   1321: putfield 926	com/tencent/mm/plugin/voip/model/j:oKb	[B
    //   1324: ldc -28
    //   1326: new 344	java/lang/StringBuilder
    //   1329: dup
    //   1330: ldc_w 1057
    //   1333: invokespecial 349	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1336: lload 8
    //   1338: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1341: ldc_w 1059
    //   1344: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1347: lload 12
    //   1349: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1352: ldc_w 1059
    //   1355: invokevirtual 385	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1358: lload 10
    //   1360: invokevirtual 575	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1363: invokevirtual 357	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1366: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1369: ldc -28
    //   1371: ldc_w 1061
    //   1374: invokestatic 287	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1377: iconst_0
    //   1378: ireturn
    //   1379: lload 14
    //   1381: lstore 10
    //   1383: goto -166 -> 1217
    //   1386: lload 16
    //   1388: lstore 12
    //   1390: goto -181 -> 1209
    //   1393: lload 18
    //   1395: lstore 8
    //   1397: goto -196 -> 1201
    //   1400: lload 10
    //   1402: lstore 6
    //   1404: goto -346 -> 1058
    //   1407: lload 12
    //   1409: lstore 6
    //   1411: goto -692 -> 719
    //   1414: lload 8
    //   1416: lstore 6
    //   1418: goto -1163 -> 255
    //   1421: lload 6
    //   1423: lstore 14
    //   1425: goto -1371 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1428	0	this	r
    //   0	1428	1	paramArrayOfByte	byte[]
    //   0	1428	2	paramInt	int
    //   0	1428	3	paramLong	long
    //   116	243	5	i	int
    //   253	1169	6	l1	long
    //   7	1408	8	l2	long
    //   13	1388	10	l3	long
    //   10	1398	12	l4	long
    //   52	1372	14	l5	long
    //   4	1383	16	l6	long
    //   1	1393	18	l7	long
    //   344	823	20	l8	long
    //   348	815	22	l9	long
    //   36	379	24	localObject1	Object
    //   530	5	24	localException	Exception
    //   549	26	24	str	String
    //   144	939	25	localObject2	Object
    //   412	61	26	localInteger	Integer
    //   426	95	27	localLong	Long
    // Exception table:
    //   from	to	target	type
    //   99	115	530	java/lang/Exception
    //   181	206	587	java/io/IOException
    //   645	670	807	java/io/IOException
    //   1000	1022	1175	java/io/IOException
  }
  
  public final int bJx()
  {
    l locall = this.oNa.oHa.oJZ;
    if (locall.oKt != null) {
      return locall.oKt.bJx();
    }
    return 0;
  }
  
  public final int bKR()
  {
    s locals = this.oNa;
    x.i("MicroMsg.Voip.VoipServiceEx", "hangUp");
    if (locals.oHa.oJX.kpo == 0)
    {
      locals.oHa.oJZ.bKe();
      locals.reset();
      return 0;
    }
    locals.oHa.oJX.oPS.oKQ = locals.oHa.bJN();
    return locals.bLi();
  }
  
  public final int bKS()
  {
    return this.oNa.oHa.oJX.kpo;
  }
  
  public final long bKT()
  {
    return this.oNa.oHa.oJX.kpp;
  }
  
  public final long bKU()
  {
    return this.oNa.oHa.oJX.oOw;
  }
  
  public final boolean bKV()
  {
    return this.oNa.oHa.bJV();
  }
  
  public final boolean bKW()
  {
    return this.oNa.oHa.bJW();
  }
  
  public final void bKX()
  {
    x.d("MicroMsg.Voip.VoipService", "devin: setCallResult: %d", new Object[] { Integer.valueOf(1) });
    this.oNa.oHa.oJX.oPS.oLc = 1;
  }
  
  public final boolean bKY()
  {
    s locals = this.oNa;
    if (locals.oNt != null) {
      return locals.oNt.alf();
    }
    return true;
  }
  
  public final void bLb()
  {
    this.oNa.oND.J(1000L, 1000L);
  }
  
  public final void bLc()
  {
    l locall = this.oNa.oHa.oJZ;
    x.l("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord, recorder %s", new Object[] { locall.ltc });
    synchronized (locall.oKF)
    {
      if (locall.ltc != null)
      {
        x.i("MicroMsg.Voip.VoipDeviceHandler", "do stop record");
        locall.ltc.we();
        locall.ltc = null;
      }
      return;
    }
  }
  
  public final void dO(int paramInt1, int paramInt2)
  {
    s locals = this.oNa;
    if ((locals.oNt != null) && (paramInt1 > 0)) {
      locals.oNt.o(paramInt1, paramInt2, true);
    }
  }
  
  protected final void finalize()
  {
    this.oNa.stop();
    this.oNa = null;
    au.b(this.mHI);
    super.finalize();
  }
  
  public final boolean iJ(boolean paramBoolean)
  {
    l locall = this.oNa.oHa.oJZ;
    if (locall.oKt != null) {
      return locall.oKt.iJ(paramBoolean);
    }
    return false;
  }
  
  public final int iQ(boolean paramBoolean)
  {
    j localj = this.oNa.oHa;
    if (paramBoolean) {}
    for (int i = localj.oJX.tf(412);; i = localj.oJX.tf(413))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.eT("MicroMsg.Voip.VoipContext", "voipContext tryMuteMicrophone ret:" + i);
      }
      return i;
    }
  }
  
  public final int iR(boolean paramBoolean)
  {
    j localj = this.oNa.oHa;
    if (paramBoolean) {}
    for (int i = localj.oJX.tf(401);; i = localj.oJX.tf(402))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "voipContext trySwitchSpeakerPhone ret:" + i);
      }
      return i;
    }
  }
  
  public final void l(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    s locals = this.oNa;
    if ((locals.oNt != null) && (paramInt1 > 0)) {
      locals.oNt.n(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public final void stopRing()
  {
    s locals = this.oNa;
    if (locals.oNt != null) {
      locals.oNt.stop();
    }
  }
  
  public final void yH(int paramInt)
  {
    if ((this.oNp == null) || (this.oNp.isEmpty())) {}
    a locala;
    do
    {
      return;
      Iterator localIterator;
      while (!localIterator.hasNext()) {
        localIterator = this.oNp.iterator();
      }
      locala = (a)localIterator.next();
    } while ((locala == null) || (locala.oNr == null) || (locala.oNr.rxG != paramInt));
    locala.gej = true;
  }
  
  public final void yI(int paramInt)
  {
    x.d("MicroMsg.Voip.VoipService", "devin: camera errcode: %d", new Object[] { Integer.valueOf(paramInt) });
    this.oNa.oHa.oJX.oOx = Math.abs(paramInt);
  }
  
  public final void yJ(int paramInt)
  {
    s locals = this.oNa;
    if ((locals.oNt != null) && (paramInt > 0)) {
      locals.oNt.o(paramInt, 0, false);
    }
  }
  
  public final void yK(int paramInt)
  {
    j localj = this.oNa.oHa;
    com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "zhengxue: audio device occupied stat sync stat " + paramInt + " app 1");
    try
    {
      Object localObject = new byte[4];
      localObject[0] = ((byte)paramInt);
      localj.oJX.setJNIAppCmd(2, (byte[])localObject, 4);
      localObject = new bzb();
      ((bzb)localObject).svq = paramInt;
      ((bzb)localObject).svr = 1;
      bxi localbxi = new bxi();
      localbxi.stM = 4;
      localbxi.stN = new com.tencent.mm.bk.b(((bzb)localObject).toByteArray(), 0, 1);
      localj.oJX.SendRUDP(localbxi.toByteArray(), localbxi.toByteArray().length);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.plugin.voip.b.a.eU("MicroMsg.Voip.VoipContext", "onAudioDevOccupiedStat Error");
    }
  }
  
  public final void yw(int paramInt)
  {
    this.oNa.oHa.yw(paramInt);
  }
  
  public final class a
  {
    boolean gej;
    caa oNr;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */