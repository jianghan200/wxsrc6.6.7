package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import com.tencent.mm.compatible.j.a.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public final class j
  extends Thread
{
  private static int dYK;
  private static HashMap<String, b> qqj = new HashMap();
  private static Object qqk = new byte[0];
  private static at qql;
  private Context context;
  private Intent intent;
  private boolean isStop;
  private List<String> qpZ;
  private List<Integer> qqa;
  private List<String> qqb;
  private List<String> qqc;
  private List<Integer> qqd;
  private int qyT;
  private a qyU;
  private String talker;
  
  public j(Context paramContext, List<String> paramList, Intent paramIntent, String paramString, int paramInt, a parama)
  {
    this.context = paramContext;
    this.qpZ = paramList;
    this.intent = paramIntent;
    this.qqa = new ArrayList();
    this.qqb = new ArrayList();
    this.qqc = new ArrayList();
    this.qqd = new ArrayList();
    this.qyU = parama;
    this.talker = paramString;
    this.qyT = paramInt;
  }
  
  public static boolean SN(String paramString)
  {
    synchronized (qqk)
    {
      boolean bool = qqj.containsKey(paramString);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "check %s is remuxing, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static void SO(String paramString)
  {
    for (boolean bool = true;; bool = false) {
      synchronized (qqk)
      {
        if (qqj.remove(paramString) != null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "remove remuxing job, filename %s, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
          return;
        }
      }
    }
  }
  
  private void a(int paramInt1, String paramString1, String paramString2, int paramInt2, VideoTransPara paramVideoTransPara, Intent arg6)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "finish to import %s to %s | ret %d | duration %d", new Object[] { paramString2, paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    e(paramInt1, paramString1, paramString2, paramInt2);
    if (paramInt1 == -50002)
    {
      if (this.qyT == 1) {}
      for (paramInt1 = 230;; paramInt1 = 245)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "report video too big reportId : " + paramInt1 + " importType : " + this.qyT);
        h.mEJ.a(106L, paramInt1, 1L, false);
        a(this.talker, paramString1, paramString2, ???, paramInt2, 141);
        return;
      }
    }
    if (paramInt1 == -50008)
    {
      h.mEJ.a(106L, 210L, 1L, false);
      a(this.talker, paramString1, paramString2, ???, paramInt2, 140);
      return;
    }
    if (paramInt1 == -50006)
    {
      if (t.a(paramString1, this.talker, paramString2, 43) < 0L)
      {
        a(this.talker, paramString1, paramString2, ???, paramInt2, 142);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "prepare");
        return;
      }
      if (qql == null) {
        qql = new at(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
      }
      b localb = new b((byte)0);
      synchronized (qqk)
      {
        qqj.put(paramString1, localb);
        localb.fileName = paramString1;
        localb.elu = paramString2;
        o.Ta();
        localb.qqo = s.nK(paramString1);
        localb.qyT = this.qyT;
        localb.toUser = this.talker;
        localb.qqq = paramVideoTransPara;
        qql.c(localb);
        return;
      }
    }
    if (paramInt1 < 0)
    {
      if (this.qyT == 1) {}
      for (paramInt1 = 229;; paramInt1 = 244)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "report video file error reportId : " + paramInt1 + " importType : " + this.qyT);
        h.mEJ.a(106L, paramInt1, 1L, false);
        a(this.talker, paramString1, paramString2, ???, paramInt2, 142);
        return;
      }
    }
    t.b(paramString1, paramInt2, this.talker, paramString2);
    t.nR(paramString1);
    if (this.qyT == 1) {}
    for (paramInt1 = 8;; paramInt1 = 1)
    {
      o.Ta();
      paramString1 = s.nK(paramString1);
      n.SY().a(paramString2, paramString1, this.talker, "", "", paramInt1, 2);
      return;
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3, Intent paramIntent, int paramInt1, int paramInt2)
  {
    Object localObject = new com.tencent.mm.storage.bd();
    ((com.tencent.mm.storage.bd)localObject).setStatus(5);
    ((com.tencent.mm.storage.bd)localObject).ep(paramString1);
    ((com.tencent.mm.storage.bd)localObject).ay(com.tencent.mm.model.bd.iD(paramString1));
    ((com.tencent.mm.storage.bd)localObject).eX(1);
    ((com.tencent.mm.storage.bd)localObject).eq(paramString2);
    ((com.tencent.mm.storage.bd)localObject).setType(43);
    long l = ((i)g.l(i.class)).bcY().T((com.tencent.mm.storage.bd)localObject);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cm)localObject).field_msgId), Long.valueOf(((cm)localObject).field_msgSvrId), ((cm)localObject).field_talker, Integer.valueOf(((com.tencent.mm.storage.bd)localObject).getType()), Integer.valueOf(((cm)localObject).field_isSend), ((cm)localObject).field_imgPath, Integer.valueOf(((cm)localObject).field_status), Long.valueOf(((cm)localObject).field_createTime) });
    if (-1L == l) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] :%s", new Object[] { paramString1 });
    }
    while (t.nW(paramString2) != null) {
      return;
    }
    o.Ta();
    localObject = s.nL(paramString2);
    i = paramInt1;
    for (;;)
    {
      try
      {
        paramIntent = com.tencent.mm.compatible.j.a.j(this.context, paramIntent);
        if (paramIntent == null) {
          continue;
        }
        i = paramInt1;
        if (paramIntent.bitmap == null) {
          continue;
        }
        i = paramInt1;
        paramInt1 = bi.ge(paramIntent.duration);
        i = paramInt1;
        com.tencent.mm.sdk.platformtools.c.a(paramIntent.bitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
      }
      catch (Exception paramIntent)
      {
        int j;
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ImportMultiVideo", paramIntent, "", new Object[0]);
        paramInt1 = i;
        continue;
        i = 0;
        continue;
      }
      j = s.nM((String)localObject);
      o.Ta();
      i = s.nM(s.nK(paramString2));
      paramIntent = new r();
      paramIntent.fileName = paramString2;
      if (i <= 0) {
        continue;
      }
      paramIntent.dHI = i;
      paramIntent.enJ = j;
      paramIntent.enM = paramInt1;
      paramIntent.bWJ = paramString1;
      paramIntent.enF = ((String)g.Ei().DT().get(2, ""));
      paramIntent.createTime = bi.VE();
      paramIntent.enK = bi.VE();
      paramIntent.enS = null;
      paramIntent.elu = paramString3;
      if (!bi.oW(paramString3)) {
        paramIntent.enQ = 1;
      }
      paramIntent.enT = -1;
      paramIntent.status = paramInt2;
      paramIntent.enN = ((int)l);
      if (o.Ta().a(paramIntent)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] localMsgId:%s", new Object[] { Long.valueOf(l) });
      return;
      i = paramInt1;
      com.tencent.mm.sdk.platformtools.c.a(com.tencent.mm.sdk.platformtools.c.ah(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
    }
  }
  
  private static void cL(String paramString, int paramInt)
  {
    int j;
    int i;
    if (paramInt == 1)
    {
      j = 220;
      i = 228;
    }
    for (paramInt = 219;; paramInt = 233)
    {
      long l = com.tencent.mm.a.e.cm(paramString);
      i = bi.f((Integer)h.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, j, i));
      h.mEJ.a(106L, i, 1L, false);
      h.mEJ.a(106L, paramInt, 1L, false);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "report no compress video report id : " + i + " file len : " + l / 1024L + "K");
      return;
      j = 234;
      i = 242;
    }
  }
  
  public static void cbv()
  {
    int i;
    synchronized (qqk)
    {
      i = qqj.size();
      qqj.clear();
      if (qql == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", new Object[] { Integer.valueOf(i) });
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", new Object[] { Integer.valueOf(i), Integer.valueOf(qql.sIl.size()) });
    qql.sIl.clear();
    qql = null;
  }
  
  public static void d(String paramString, int[] paramArrayOfInt)
  {
    m = 0;
    try
    {
      localMediaMetadataRetriever = new MediaMetadataRetriever();
    }
    finally
    {
      label53:
      paramArrayOfInt = null;
      if (paramArrayOfInt != null) {
        paramArrayOfInt.release();
      }
    }
    try
    {
      localMediaMetadataRetriever.setDataSource(paramString);
      j = bi.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
      i = bi.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
      paramArrayOfInt[0] = j;
      paramArrayOfInt[1] = i;
    }
    finally
    {
      paramArrayOfInt = localMediaMetadataRetriever;
      break label94;
      n = i;
      i1 = j;
      if (m >= 3) {
        break label53;
      }
      k = j;
      if (j % 2 == 0) {
        break label137;
      }
      k = j - 1;
      j = i;
      if (i % 2 == 0) {
        break label149;
      }
      j = i - 1;
      if (k < j) {
        break label184;
      }
      n = j;
      i1 = k;
      if (k <= 640) {
        break label53;
      }
      n = j;
      i1 = k;
      if (j <= 480) {
        break label53;
      }
      if (k > j) {
        break label69;
      }
      n = j;
      i1 = k;
      if (k <= 480) {
        break label53;
      }
      if (j > 640) {
        break label69;
      }
      n = j;
      i1 = k;
      break label53;
    }
    paramArrayOfInt[0] = i1;
    paramArrayOfInt[1] = n;
    localMediaMetadataRetriever.release();
    return;
    label69:
    k /= 2;
    i = j / 2;
    m += 1;
    j = k;
    break label111;
  }
  
  private static void d(boolean paramBoolean, String paramString1, String paramString2)
  {
    int i = 1;
    if (paramBoolean) {}
    while ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
      return;
      i = 0;
    }
    try
    {
      long l1 = com.tencent.mm.a.e.cm(paramString1);
      long l2 = com.tencent.mm.a.e.cm(paramString2);
      int j = (int)(100L * l2 / l1);
      paramString1 = new StringBuilder();
      paramString1.append(i).append(";").append(l1).append(";");
      paramString1.append(l2).append(";").append(j);
      paramString1 = paramString1.toString();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AtomStatUtil", "report video remuxing : " + paramString1);
      h.mEJ.h(11098, new Object[] { Integer.valueOf(8001), paramString1 });
      return;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AtomStatUtil", paramString1, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + paramString1.toString());
    }
  }
  
  private void e(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    try
    {
      this.qqa.add(Integer.valueOf(paramInt1));
      this.qqb.add(paramString1);
      this.qqc.add(paramString2);
      this.qqd.add(Integer.valueOf(paramInt2));
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  private void kA(boolean paramBoolean)
  {
    int i;
    if (this.qyT == 1) {
      if (paramBoolean) {
        i = 217;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "report video thumb reportId : " + i + " had Thumb : " + paramBoolean + " importType : " + this.qyT);
      h.mEJ.a(106L, i, 1L, false);
      return;
      i = 218;
      continue;
      if (paramBoolean) {
        i = 231;
      } else {
        i = 232;
      }
    }
  }
  
  private void y(Context paramContext, Intent paramIntent)
  {
    String str1 = s.nJ((String)g.Ei().DT().get(2, ""));
    o.Ta();
    String str2 = s.nL(str1);
    o.Ta();
    String str3 = s.nK(str1);
    boolean bool2 = ao.is2G(ad.getContext());
    String str4 = com.tencent.mm.compatible.j.a.i(paramContext, paramIntent);
    if (bi.oW(str4))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
      a(-50005, str1, str4, 0, null, paramIntent);
      return;
    }
    boolean bool1 = com.tencent.mm.plugin.a.c.oZ(str4);
    int j = com.tencent.mm.a.e.cm(str4);
    PInt localPInt1;
    Object localObject;
    label168:
    int i;
    if (bool1)
    {
      localPInt1 = new PInt();
      if (com.tencent.mm.modelcontrol.d.NP().lB(str4))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "check remuxing, this video had wx meta do not remuxing. %s ", new Object[] { str4 });
        localPInt1.value = 1;
        h.mEJ.a(422L, 51L, 1L, false);
        localObject = null;
        i = localPInt1.value;
      }
    }
    int k;
    int m;
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "check remuxing, ret %d isMp4 %b length %d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Integer.valueOf(j) });
      switch (i)
      {
      default: 
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "unknown check type");
        a(-50001, str1, str4, 0, null, paramIntent);
        return;
        VideoTransPara localVideoTransPara = new VideoTransPara();
        localObject = new PInt();
        PInt localPInt2 = new PInt();
        PInt localPInt3 = new PInt();
        PInt localPInt4 = new PInt();
        PInt localPInt5 = new PInt();
        com.tencent.mm.plugin.sight.base.d.a(str4, (PInt)localObject, localPInt2, localPInt3, localPInt4, localPInt5);
        localVideoTransPara.duration = (((PInt)localObject).value / 1000);
        localVideoTransPara.width = localPInt2.value;
        localVideoTransPara.height = localPInt3.value;
        localVideoTransPara.fps = localPInt4.value;
        localVideoTransPara.videoBitrate = localPInt5.value;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "check remuxing old para %s", new Object[] { localVideoTransPara });
        localObject = com.tencent.mm.modelcontrol.d.NP().b(localVideoTransPara);
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "get C2C album video para is null. old para %s", new Object[] { localVideoTransPara });
          localPInt1.value = -5;
          localObject = null;
          break label168;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ImportMultiVideo", "check remuxing new para %s", new Object[] { localObject });
        if ((localVideoTransPara.videoBitrate <= 640000) || (((VideoTransPara)localObject).videoBitrate > localVideoTransPara.videoBitrate))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "new bitrate is bigger than old bitrate %s %s", new Object[] { localObject, localVideoTransPara });
          localPInt1.value = 1;
          localObject = null;
          break label168;
        }
        if ((localVideoTransPara.fps >= 45) && (localVideoTransPara.duration * 1000 >= 180000))
        {
          localPInt1.value = -6;
          localObject = null;
          break label168;
        }
        bool2 = ao.is2G(ad.getContext());
        k = ((VideoTransPara)localObject).width;
        m = ((VideoTransPara)localObject).height;
        if (bool2)
        {
          i = 10485760;
          label630:
          if (!bool2) {
            break label670;
          }
        }
        label670:
        for (double d = 60000.0D;; d = 300000.0D)
        {
          localPInt1.value = SightVideoJNI.shouldRemuxing(str4, k, m, i, d, 1000000);
          break;
          i = 26214400;
          break label630;
        }
        if (bool2) {}
        for (i = 10485760;; i = 26214400)
        {
          if (j <= i) {
            break label712;
          }
          i = -5;
          localObject = null;
          break;
        }
        label712:
        i = 1;
        localObject = null;
      }
    }
    if (j > 26214400)
    {
      a(-50002, str1, str4, 0, null, paramIntent);
      j = 0;
      i = -50002;
    }
    try
    {
      for (;;)
      {
        paramContext = com.tencent.mm.compatible.j.a.j(paramContext, paramIntent);
        if (paramContext != null) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
        a(-50005, str1, str4, 0, null, paramIntent);
        return;
        j = 0;
        i = 0;
        continue;
        j = 1;
        i = 0;
      }
      a(-50007, str1, str4, 0, null, paramIntent);
      return;
      a(-50002, str1, str4, 0, null, paramIntent);
      return;
      a(-50008, str1, str4, 0, null, paramIntent);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
    if (j == 0)
    {
      com.tencent.mm.sdk.platformtools.j.q(str4, str3, false);
      cL(str3, this.qyT);
      d(false, str4, str3);
    }
    for (;;)
    {
      int n = bi.ge(paramContext.duration);
      m = 1;
      k = 1;
      if (paramContext.bitmap != null) {
        k = m;
      }
      try
      {
        com.tencent.mm.sdk.platformtools.c.a(paramContext.bitmap, 60, Bitmap.CompressFormat.JPEG, str2, true);
        k = 0;
        m = 0;
        kA(true);
        k = m;
        if (k == 0) {}
      }
      catch (Exception paramContext)
      {
        try
        {
          kA(false);
          com.tencent.mm.sdk.platformtools.c.a(com.tencent.mm.sdk.platformtools.c.ah(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, str2, true);
          k = i;
          if (j == 0)
          {
            k = i;
            if (!com.tencent.mm.a.e.cn(str3)) {
              k = -50003;
            }
          }
          if (!com.tencent.mm.a.e.cn(str2)) {
            k = -50004;
          }
          a(k, str1, str4, n, (VideoTransPara)localObject, paramIntent);
          return;
          i = -50006;
          continue;
          paramContext = paramContext;
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
          }
        }
      }
    }
  }
  
  public final void cbu()
  {
    this.isStop = true;
    interrupt();
  }
  
  public final void run()
  {
    int i;
    if ((this.qpZ != null) && (this.qpZ.size() > 0)) {
      i = 0;
    }
    while ((i < this.qpZ.size()) && (!this.isStop))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "start to import %s", new Object[] { this.qpZ.get(i) });
      Intent localIntent = new Intent();
      localIntent.setData(Uri.parse("file://" + (String)this.qpZ.get(i)));
      y(this.context, localIntent);
      i += 1;
      continue;
      y(this.context, this.intent);
    }
    if ((this.qyU != null) && (!this.isStop)) {
      ah.A(new Runnable()
      {
        public final void run()
        {
          j.a locala = j.e(j.this);
          j.a(j.this);
          j.b(j.this);
          j.c(j.this);
          j.d(j.this);
          locala.cbw();
        }
      });
    }
  }
  
  public static abstract interface a
  {
    public abstract void cbw();
  }
  
  private static final class b
    implements at.a
  {
    String elu;
    String fileName;
    private int ljU;
    private int ljV;
    String qqo;
    int qqp;
    VideoTransPara qqq;
    private boolean qqr;
    private int qqs = 0;
    int qyT;
    String toUser;
    
    public final boolean Kr()
    {
      int i;
      for (;;)
      {
        synchronized ()
        {
          if (!j.bZR().containsKey(this.fileName))
          {
            i = 1;
            j = i;
            if (i == 0)
            {
              if (t.nW(this.fileName) == null) {
                j = 1;
              }
            }
            else
            {
              if (j == 0) {
                break;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", new Object[] { this.fileName });
              return true;
            }
          }
          else
          {
            i = 0;
          }
        }
        j = 0;
      }
      boolean bool = HardCoderJNI.hcEncodeVideoEnable;
      int j = HardCoderJNI.hcEncodeVideoDelay;
      int k = HardCoderJNI.hcEncodeVideoCPU;
      int m = HardCoderJNI.hcEncodeVideoIO;
      if (HardCoderJNI.hcEncodeVideoThr)
      {
        i = Process.myTid();
        j.yM(HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcEncodeVideoTimeout, 603, HardCoderJNI.hcEncodeVideoAction, "MicroMsg.ImportMultiVideo"));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "hardcoder summerPerformance startPerformance: %s", new Object[] { Integer.valueOf(j.TE()) });
        if ((this.qqq == null) || (this.qqq.isDefault)) {
          break label286;
        }
        this.ljU = this.qqq.width;
      }
      Object localObject3;
      for (this.ljV = this.qqq.height;; this.ljV = ???[1])
      {
        ??? = new PString();
        localObject3 = new PInt();
        if ((!((com.tencent.mm.plugin.t.a.a)g.l(com.tencent.mm.plugin.t.a.a.class)).FY().a(this.elu, (PString)???, (PInt)localObject3)) || (!com.tencent.mm.sdk.platformtools.j.fN(((PString)???).value, this.qqo))) {
          break label319;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "copy remuxing file success, do not remuxing again.");
        this.qqp = ((PInt)localObject3).value;
        this.qqr = true;
        return true;
        i = 0;
        break;
        label286:
        ??? = new int[2];
        j.d(this.elu, (int[])???);
        this.ljU = ???[0];
      }
      label319:
      long l = bi.VG();
      if (this.qqq != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "remuxing new para %s", new Object[] { this.qqq });
        if (b.nbU) {
          this.qqq.videoBitrate = ((int)(this.qqq.videoBitrate * 0.915D));
        }
        this.qqp = SightVideoJNI.remuxing(this.elu, this.qqo, this.ljU, this.ljV, this.qqq.videoBitrate, this.qqq.dQI, 8, this.qqq.dQH, 25.0F, this.qqq.fps, null, 0, b.nbU);
        this.qqs = ((int)bi.bI(l));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { this.elu, this.qqo, Integer.valueOf(this.qqp), Integer.valueOf(this.ljU), Integer.valueOf(this.ljV) });
        if (this.qqp < 0) {
          break label717;
        }
        bool = true;
        label511:
        this.qqr = bool;
        ??? = new PInt();
        localObject3 = new PInt();
        if (t.a(this.qqo, (PInt)???, (PInt)localObject3)) {
          this.qqp = ((PInt)???).value;
        }
        if (this.qqr) {
          break label723;
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ImportMultiVideo", "remuxing video error, copy source video to send.");
        com.tencent.mm.a.e.deleteFile(this.qqo);
        com.tencent.mm.sdk.platformtools.j.q(this.elu, this.qqo, false);
      }
      label717:
      label723:
      PInt localPInt;
      for (;;)
      {
        if (j.TE() != 0)
        {
          HardCoderJNI.stopPerformace(HardCoderJNI.hcEncodeVideoEnable, j.TE());
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "hardcoder summerPerformance stopPerformace %s", new Object[] { Integer.valueOf(j.TE()) });
          j.yM(0);
        }
        return true;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ImportMultiVideo", "remuxing but new para is null. %s", new Object[] { this.fileName });
        if (b.nbU) {
          b.nbW = (int)(b.nbW * 0.915D);
        }
        this.qqp = SightVideoJNI.remuxing(this.elu, this.qqo, this.ljU, this.ljV, b.nbW, b.nbV, 8, 2, 25.0F, b.nbX, null, 0, b.nbU);
        break;
        bool = false;
        break label511;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "remuxing video sucess,insert to media duplication storage");
        try
        {
          ??? = new File(this.qqo).getName();
          localObject3 = this.qqo + ".tmp";
          localPInt = new PInt(0);
          if (!com.tencent.mm.plugin.a.d.b(this.qqo, (String)localObject3, localPInt)) {
            break label962;
          }
          bool = com.tencent.mm.a.e.deleteFile(this.qqo);
          localObject3 = new File((String)localObject3);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "fast start success. delOld[%b] rename[%b] path[%s] target[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.a.e.i(((File)localObject3).getParent() + File.separator, ((File)localObject3).getName(), (String)???)), ((File)localObject3).getAbsolutePath(), this.qqo });
          h.mEJ.a(354L, 30L, 1L, false);
          ((com.tencent.mm.plugin.t.a.a)g.l(com.tencent.mm.plugin.t.a.a.class)).FY().K(this.elu, this.qqo, this.qqp);
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ImportMultiVideo", "fast start exception e[%s]", new Object[] { localException.toString() });
        }
      }
      label962:
      if (localPInt.value != 1) {
        h.mEJ.a(354L, 31L, 1L, false);
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ImportMultiVideo", "fast start fail. msg[%d] importpath[%s] targetPath[%s]", new Object[] { Integer.valueOf(localPInt.value), this.elu, this.qqo });
        break;
        h.mEJ.a(354L, 32L, 1L, false);
        h.mEJ.h(13836, new Object[] { Integer.valueOf(600), Long.valueOf(bi.VE()), this.qqo });
      }
    }
    
    public final boolean Ks()
    {
      for (;;)
      {
        synchronized ()
        {
          j.bZR().remove(this.fileName);
          if (this.qqr)
          {
            j.cM(this.qqo, this.qyT);
            j.e(this.qqr, this.elu, this.qqo);
            if (!b.nbU) {
              break label170;
            }
            i = 1;
            j.a(i, this.qqs, this.elu, this.qqo, this.qqp);
            if (this.qyT != 1) {
              break label175;
            }
            i = 8;
            if (!this.qqr) {
              break label180;
            }
            j = 1;
            n.SY().a(this.elu, this.qqo, this.toUser, "", "", i, j);
            t.l(this.fileName, this.qqp, 43);
            t.nR(this.fileName);
            return false;
          }
        }
        j.cN(this.qqo, this.qyT);
        continue;
        label170:
        int i = 0;
        continue;
        label175:
        i = 1;
        continue;
        label180:
        int j = 3;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */