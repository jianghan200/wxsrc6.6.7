package com.tencent.mm.modelcontrol;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class d
  implements ar
{
  private static final int dQv = com.tencent.mm.plugin.a.c.aE("dscp");
  private e[] dQA;
  private e[] dQB;
  private e[] dQC;
  private e[] dQD;
  private a dQw = new a();
  private byte[] dQx = null;
  private com.tencent.mm.plugin.a.b dQy;
  private e[] dQz;
  
  public static d NP()
  {
    return (d)p.v(d.class);
  }
  
  private static VideoTransPara NT()
  {
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.width = 540;
    localVideoTransPara.height = 960;
    localVideoTransPara.fps = 30;
    localVideoTransPara.videoBitrate = 1600000;
    localVideoTransPara.dQG = 10;
    localVideoTransPara.dQF = 64000;
    localVideoTransPara.dQH = 2;
    localVideoTransPara.dQI = 1;
    return localVideoTransPara;
  }
  
  public static boolean NU()
  {
    int j = ((Integer)g.Ei().DT().get(aa.a.sUi, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100136");
    if (localc.isValid()) {}
    for (int i = bi.getInt((String)localc.ckq().get("streamingDownload"), 0);; i = 0)
    {
      boolean bool2 = NW();
      boolean bool1;
      if ((j == 0) || (i == -1) || (!bool2)) {
        bool1 = false;
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check can c2c online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(j), Integer.valueOf(i) });
        return bool1;
        if (j > 0) {
          bool1 = true;
        } else if (i > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
  }
  
  public static boolean NV()
  {
    int j = ((Integer)g.Ei().DT().get(aa.a.sUi, Integer.valueOf(-1))).intValue();
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100153");
    if (localc.isValid()) {}
    for (int i = bi.getInt((String)localc.ckq().get("snsStreamDownload"), 0);; i = 0)
    {
      boolean bool2 = NW();
      boolean bool1;
      if ((j == 0) || (i == -1) || (!bool2)) {
        bool1 = false;
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check can sns online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Integer.valueOf(j), Integer.valueOf(i) });
        return bool1;
        if (j > 0) {
          bool1 = true;
        } else if (i > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
    }
  }
  
  public static boolean NW()
  {
    long l = bi.VG();
    int k = ((Integer)g.Ei().DT().get(aa.a.sUi, Integer.valueOf(-1))).intValue();
    Object localObject1 = com.tencent.mm.model.c.c.Jx().fJ("100190");
    Object localObject2;
    int i;
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject2 = ((com.tencent.mm.storage.c)localObject1).ckq();
      i = bi.getInt((String)((Map)localObject2).get("player"), 1);
      localObject1 = (String)((Map)localObject2).get("apilevel");
      localObject2 = (String)((Map)localObject2).get("devices");
    }
    for (;;)
    {
      int m = Build.VERSION.SDK_INT;
      String str = Build.BRAND + Build.MODEL;
      String[] arrayOfString;
      int n;
      int j;
      if (!bi.oW((String)localObject1))
      {
        arrayOfString = ((String)localObject1).split(";");
        n = arrayOfString.length;
        j = 0;
        if (j < n) {
          if (bi.getInt(arrayOfString[j], 0) != m) {}
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        boolean bool2 = bool1;
        if (!bi.oW((String)localObject2))
        {
          arrayOfString = ((String)localObject2).split(";");
          n = arrayOfString.length;
          j = 0;
        }
        for (;;)
        {
          bool2 = bool1;
          if (j < n)
          {
            if (arrayOfString[j].equalsIgnoreCase(str)) {
              bool2 = false;
            }
          }
          else
          {
            if (com.tencent.mm.compatible.util.d.fS(18)) {
              bool2 = false;
            }
            if (Build.BRAND.equalsIgnoreCase("meizu")) {
              g.Ei().DT().a(aa.a.sVF, Boolean.valueOf(true));
            }
            if (k == 0) {
              bool2 = false;
            }
            if (i <= 0) {
              bool2 = false;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check can use mmvideoplayer[%b] api[%d, %s] device[%s, %s] abTestFlag[%d] costTime[%d]", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(m), localObject1, str, localObject2, Integer.valueOf(i), Long.valueOf(bi.bI(l)) });
            return bool2;
            j += 1;
            break;
          }
          j += 1;
        }
      }
      localObject2 = null;
      localObject1 = null;
      i = 1;
    }
  }
  
  public static boolean NX()
  {
    String str = null;
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100253");
    if (((com.tencent.mm.storage.c)localObject).isValid()) {
      str = (String)((com.tencent.mm.storage.c)localObject).ckq().get("noCompleteRange");
    }
    localObject = str;
    if (bi.oW(str)) {
      localObject = "20:00-23:30";
    }
    g.Eg();
    int i = com.tencent.mm.a.h.aM(com.tencent.mm.kernel.a.Df(), 30);
    boolean bool = b.M((String)localObject, i);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check complete hevc needControl [%b] no complete range[%s] endHash[%d]", new Object[] { Boolean.valueOf(bool), localObject, Integer.valueOf(i) });
    return !bool;
  }
  
  public static int a(int paramInt, r paramr)
  {
    switch (paramInt)
    {
    default: 
    case 0: 
      for (paramInt = 1;; paramInt = 1)
      {
        label30:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check c2c video format[%d]", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt != 2) {
          break;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 130L, 1L, false);
        return paramInt;
      }
    }
    int i = ((Integer)g.Ei().DT().get(aa.a.sXp, Integer.valueOf(-1))).intValue();
    paramInt = i;
    if (i == -1) {
      if (!com.tencent.mm.plugin.u.e.bdr()) {
        break label184;
      }
    }
    boolean bool2;
    label155:
    label184:
    for (paramInt = 1;; paramInt = 0)
    {
      g.Ei().DT().a(aa.a.sXp, Integer.valueOf(-1));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreVideoControl", "check device support hevc[%d]", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt > 0) {
        break label189;
      }
      bool2 = false;
      if (!bool2) {
        break label441;
      }
      o.Ta();
      paramr = s.nK(paramr.getFileName());
      if (com.tencent.mm.a.e.cn(paramr)) {
        break label457;
      }
      paramInt = 2;
      break;
    }
    label189:
    Object localObject1 = com.tencent.mm.model.c.c.Jx().fJ("100253");
    Object localObject2;
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject2 = ((com.tencent.mm.storage.c)localObject1).ckq();
      paramInt = bi.getInt((String)((Map)localObject2).get("openHevc"), 0);
      localObject1 = (String)((Map)localObject2).get("brands");
      localObject2 = (String)((Map)localObject2).get("devices");
    }
    for (;;)
    {
      String str = Build.BRAND;
      Object localObject3;
      int j;
      if (!bi.oW((String)localObject1))
      {
        localObject3 = ((String)localObject1).split(";");
        j = localObject3.length;
        i = 0;
        label290:
        if (i < j) {
          if (!localObject3[i].equalsIgnoreCase(str)) {}
        }
      }
      for (boolean bool1 = false;; bool1 = true)
      {
        localObject3 = Build.BRAND + Build.MODEL;
        bool2 = bool1;
        String[] arrayOfString;
        if (!bi.oW((String)localObject2))
        {
          arrayOfString = ((String)localObject2).split(";");
          j = arrayOfString.length;
          i = 0;
        }
        for (;;)
        {
          bool2 = bool1;
          if (i < j)
          {
            if (arrayOfString[i].equalsIgnoreCase((String)localObject3)) {
              bool2 = false;
            }
          }
          else
          {
            if (paramInt <= 0) {
              bool2 = false;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check support hevc [%b] abtestFlag[%d] brands[%s, %s] device[%s, %s]", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(paramInt), str, localObject1, localObject3, localObject2 });
            break label155;
            label441:
            break;
            i += 1;
            break label290;
          }
          i += 1;
        }
        label457:
        if (!q.nF(paramr)) {
          break;
        }
        paramInt = 2;
        break label30;
        com.tencent.mm.plugin.report.service.h.mEJ.a(354L, 131L, 1L, false);
        return paramInt;
      }
      localObject2 = null;
      localObject1 = null;
      paramInt = 0;
    }
  }
  
  public static int a(VideoTransPara paramVideoTransPara)
  {
    if (paramVideoTransPara == null) {
      return 0;
    }
    switch (paramVideoTransPara.duration)
    {
    default: 
      return paramVideoTransPara.duration;
    }
    return 1;
  }
  
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5, PInt paramPInt6)
  {
    if ((bi.oW(paramString2)) || (bi.oW(paramString3)) || (bi.oW(paramString4))) {
      return false;
    }
    for (;;)
    {
      try
      {
        if (bi.oW(paramString1)) {
          continue;
        }
        String[] arrayOfString = paramString1.split("~");
        paramPInt1.value = bi.getInt(arrayOfString[0], -1);
        paramPInt2.value = bi.getInt(arrayOfString[1], -1);
        if ((paramPInt1.value < 0) || (paramPInt2.value < 0)) {
          break;
        }
        arrayOfString = paramString2.split("x");
        paramPInt3.value = bi.getInt(arrayOfString[0], -1);
        paramPInt4.value = bi.getInt(arrayOfString[1], -1);
        if ((paramPInt3.value < 0) || (paramPInt4.value < 0)) {
          break;
        }
        paramPInt5.value = bi.getInt(paramString3, -1);
        paramPInt6.value = bi.getInt(paramString4, -1);
        if ((paramPInt5.value < 0) || (paramPInt6.value < 0)) {
          break;
        }
        paramPInt6.value *= 1000;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreVideoControl", "parse video para error." + localException.toString());
        continue;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "config[%s, %s, %s, %s], args[%d, %d, %d, %d, %d, %d]", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramPInt3.value), Integer.valueOf(paramPInt4.value), Integer.valueOf(paramPInt5.value), Integer.valueOf(paramPInt6.value) });
      return true;
      paramPInt2.value = 0;
      paramPInt1.value = 0;
    }
  }
  
  private static e d(JSONObject paramJSONObject)
  {
    e locale = new e();
    for (;;)
    {
      int i;
      try
      {
        Object localObject1;
        int j;
        if (paramJSONObject.isNull("time"))
        {
          localObject1 = "";
          Object localObject3 = paramJSONObject.getString("abr");
          Object localObject4 = paramJSONObject.getString("intval");
          Object localObject5 = paramJSONObject.getString("prof");
          Object localObject6 = paramJSONObject.getString("preset");
          if (paramJSONObject.isNull("stepbr"))
          {
            localObject2 = "0";
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "busy time %s audio bitrate %s iframe %s profile %s preset %s stepbr %s", new Object[] { localObject1, localObject3, localObject4, localObject5, localObject6, localObject2 });
            locale.a((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6, (String)localObject2);
            localObject2 = paramJSONObject.getJSONArray("conf");
            localObject1 = new ArrayList();
            localObject3 = new PInt();
            localObject4 = new PInt();
            localObject5 = new PInt();
            localObject6 = new PInt();
            PInt localPInt1 = new PInt();
            PInt localPInt2 = new PInt();
            j = ((JSONArray)localObject2).length();
            i = 0;
            if (i >= j) {
              continue;
            }
            JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(i);
            if (localJSONObject.isNull("dura")) {
              break label519;
            }
            paramJSONObject = localJSONObject.getString("dura");
            if (!a(paramJSONObject, localJSONObject.getString("wh"), localJSONObject.getString("fps"), localJSONObject.getString("vbr"), (PInt)localObject3, (PInt)localObject4, (PInt)localObject5, (PInt)localObject6, localPInt1, localPInt2)) {
              break label512;
            }
            ((List)localObject1).add(new f(((PInt)localObject3).value, ((PInt)localObject4).value, ((PInt)localObject5).value, ((PInt)localObject6).value, localPInt1.value, localPInt2.value, localPInt2.value));
            break label512;
          }
        }
        else
        {
          localObject1 = paramJSONObject.getString("time");
          continue;
        }
        Object localObject2 = paramJSONObject.getString("stepbr");
        continue;
        Collections.sort((List)localObject1);
        if ((((List)localObject1).size() >= 2) && (!locale.dQJ))
        {
          j = ((f)((List)localObject1).get(0)).dQR;
          i = 1;
          if (i < ((List)localObject1).size())
          {
            paramJSONObject = (f)((List)localObject1).get(i);
            paramJSONObject.dQQ = j;
            j = paramJSONObject.dQR;
            i += 1;
            continue;
          }
        }
        locale.dQK = new f[((List)localObject1).size()];
        ((List)localObject1).toArray(locale.dQK);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreVideoControl", "parseJsonObject %s", new Object[] { locale });
        return locale;
      }
      catch (Exception paramJSONObject)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreVideoControl", "parseJsonObject error : " + paramJSONObject.toString());
        return null;
      }
      label512:
      i += 1;
      continue;
      label519:
      paramJSONObject = "";
    }
  }
  
  private static VideoTransPara hC(int paramInt)
  {
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.dQG = 1;
    localVideoTransPara.dQF = 48000;
    localVideoTransPara.dQH = 2;
    localVideoTransPara.dQI = 1;
    if (paramInt <= 120)
    {
      localVideoTransPara.fps = 30;
      localVideoTransPara.width = 540;
      localVideoTransPara.height = 960;
      localVideoTransPara.videoBitrate = 1200000;
      return localVideoTransPara;
    }
    localVideoTransPara.fps = 24;
    localVideoTransPara.width = 360;
    localVideoTransPara.height = 640;
    localVideoTransPara.videoBitrate = 544000;
    return localVideoTransPara;
  }
  
  private static e[] lA(String paramString)
  {
    int i = 0;
    Object localObject2 = ((com.tencent.mm.plugin.zero.b.a)g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue(paramString);
    if (bi.oW((String)localObject2))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "key %s config is null", new Object[] { paramString });
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      Object localObject1 = localObject2;
      if (!((String)localObject2).startsWith("[")) {
        localObject1 = "[" + (String)localObject2;
      }
      localObject2 = localObject1;
      if (!((String)localObject1).endsWith("]")) {
        localObject2 = (String)localObject1 + "]";
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "%s=%s ", new Object[] { paramString, localObject2 });
      try
      {
        localObject2 = new JSONArray((String)localObject2);
        int j = ((JSONArray)localObject2).length();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreVideoControl", "parse config root length %d", new Object[] { Integer.valueOf(j) });
        localObject1 = new e[j];
        for (;;)
        {
          paramString = (String)localObject1;
          if (i >= j) {
            break;
          }
          localObject1[i] = d(((JSONArray)localObject2).getJSONObject(i));
          i += 1;
        }
        return null;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreVideoControl", "parse Configs error : " + paramString.toString());
      }
    }
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final VideoTransPara NQ()
  {
    long l = bi.VG();
    if (this.dQz == null) {
      this.dQz = lA("C2CRecordVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.dQz != null)
    {
      i = 0;
      if (i < this.dQz.length)
      {
        locale = this.dQz[i];
        if ((locale != null) && (locale.NY()))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get c2c Record config.");
          localVideoTransPara = locale.NZ();
        }
      }
    }
    for (boolean bool = locale.dQJ;; bool = true)
    {
      if (localVideoTransPara == null)
      {
        localVideoTransPara = new VideoTransPara();
        localVideoTransPara.isDefault = true;
        localVideoTransPara.width = 540;
        localVideoTransPara.height = 960;
        localVideoTransPara.fps = 30;
        localVideoTransPara.videoBitrate = 1200000;
        localVideoTransPara.dQG = 10;
        localVideoTransPara.dQF = 64000;
        localVideoTransPara.dQH = 2;
        localVideoTransPara.dQI = 1;
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.dQG = 10;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.l(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.iHM);
        if (!bool) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 11L, 1L, false);
        }
        for (;;)
        {
          i = bi.f((Integer)com.tencent.mm.plugin.report.service.h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 13, 18));
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, i, 1L, false);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "get c2c record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bi.bI(l)), localVideoTransPara, Integer.valueOf(i) });
          return localVideoTransPara;
          i += 1;
          break;
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 12L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara NR()
  {
    long l = bi.VG();
    if (this.dQA == null) {
      this.dQA = lA("SnsRecordVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.dQA != null)
    {
      i = 0;
      if (i < this.dQA.length)
      {
        locale = this.dQA[i];
        if ((locale != null) && (locale.NY()))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
          localVideoTransPara = locale.NZ();
        }
      }
    }
    for (boolean bool = locale.dQJ;; bool = true)
    {
      if (localVideoTransPara == null) {
        localVideoTransPara = NT();
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.dQG = 10;
        localVideoTransPara.dQS = 200;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.l(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.iHK);
        if (!bool) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 31L, 1L, false);
        }
        for (;;)
        {
          i = bi.f((Integer)com.tencent.mm.plugin.report.service.h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 33, 38));
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, i, 1L, false);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "get sns record para cost %d. %s rpt %d", new Object[] { Long.valueOf(bi.bI(l)), localVideoTransPara, Integer.valueOf(i) });
          return localVideoTransPara;
          i += 1;
          break;
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 32L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara NS()
  {
    long l = bi.VG();
    if (this.dQB == null) {
      this.dQB = lA("SnsAlbumVideoConfig");
    }
    int i;
    e locale;
    VideoTransPara localVideoTransPara;
    if (this.dQB != null)
    {
      i = 0;
      if (i < this.dQB.length)
      {
        locale = this.dQB[i];
        if ((locale != null) && (locale.NY()))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns album config.");
          localVideoTransPara = locale.NZ();
        }
      }
    }
    for (boolean bool = locale.dQJ;; bool = true)
    {
      if (localVideoTransPara == null) {
        localVideoTransPara = NT();
      }
      for (;;)
      {
        localVideoTransPara.audioSampleRate = 44100;
        localVideoTransPara.dQG = 10;
        localVideoTransPara.dQS = 200;
        localVideoTransPara.duration = ((com.tencent.mm.plugin.expt.a.a)g.l(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.iHL);
        if (!bool) {
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 21L, 1L, false);
        }
        for (;;)
        {
          i = bi.f((Integer)com.tencent.mm.plugin.report.service.h.a(localVideoTransPara.videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 23, 28));
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, i, 1L, false);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "get sns album para cost %d. %s rpt %d ", new Object[] { Long.valueOf(bi.bI(l)), localVideoTransPara, Integer.valueOf(i) });
          return localVideoTransPara;
          i += 1;
          break;
          com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 22L, 1L, false);
        }
      }
      localVideoTransPara = null;
    }
  }
  
  public final VideoTransPara b(VideoTransPara paramVideoTransPara)
  {
    if (paramVideoTransPara.duration >= 300)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreVideoControl", "this video duration is large than %s s", new Object[] { Integer.valueOf(300) });
      return null;
    }
    long l = bi.VG();
    VideoTransPara localVideoTransPara = hC(paramVideoTransPara.duration);
    int i = 1;
    Object localObject1 = com.tencent.mm.model.c.c.Jx().fJ("100157");
    if (((com.tencent.mm.storage.c)localObject1).isValid()) {
      i = bi.getInt((String)((com.tencent.mm.storage.c)localObject1).ckq().get("VideoEncodeStep"), 1);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "check c2c album encode step %d", new Object[] { Integer.valueOf(i) });
    label141:
    label148:
    boolean bool;
    if (i > 0)
    {
      i = 1;
      if (i == 0) {
        break label353;
      }
      if (this.dQD == null) {
        this.dQD = lA("C2CAlbumVideoStepConfig");
      }
      localObject1 = this.dQD;
      if (localObject1 == null) {
        break label394;
      }
      i = 0;
      if (i >= localObject1.length) {
        break label386;
      }
      Object localObject2 = localObject1[i];
      if ((localObject2 == null) || (!((e)localObject2).NY())) {
        break label379;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
      i = a.a(((e)localObject2).dQK, paramVideoTransPara, localVideoTransPara);
      bool = ((e)localObject2).dQJ;
      label201:
      if (i > 0) {
        break label416;
      }
      localObject1 = hC(paramVideoTransPara.duration);
      label214:
      if (bool) {
        break label429;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 1L, 1L, false);
    }
    for (;;)
    {
      int j = bi.f((Integer)com.tencent.mm.plugin.report.service.h.a(((VideoTransPara)localObject1).videoBitrate / 1000, new int[] { 350, 544, 800, 1200, 1600 }, 3, 8));
      com.tencent.mm.plugin.report.service.h.mEJ.a(422L, j, 1L, false);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", new Object[] { Long.valueOf(bi.bI(l)), Integer.valueOf(j), Integer.valueOf(i), localObject1, paramVideoTransPara });
      return (VideoTransPara)localObject1;
      i = 0;
      break;
      label353:
      if (this.dQC == null) {
        this.dQC = lA("C2CAlbumVideoConfig");
      }
      localObject1 = this.dQC;
      break label141;
      label379:
      i += 1;
      break label148;
      label386:
      bool = true;
      i = 0;
      break label201;
      label394:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
      i = a.a(null, paramVideoTransPara, localVideoTransPara);
      bool = true;
      break label201;
      label416:
      localVideoTransPara.isDefault = false;
      localObject1 = localVideoTransPara;
      break label214;
      label429:
      com.tencent.mm.plugin.report.service.h.mEJ.a(422L, 2L, 1L, false);
    }
  }
  
  public final void bn(boolean paramBoolean) {}
  
  public final void bo(boolean paramBoolean) {}
  
  public final byte[] getWeixinMeta()
  {
    if (bi.bC(this.dQx)) {}
    try
    {
      String str = "{\"WXVer\":" + com.tencent.mm.protocal.d.qVN + "}";
      this.dQx = str.getBytes("UTF-8");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreVideoControl", "get weixin video meta %s", new Object[] { str });
      return this.dQx;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreVideoControl", "get weixin meta error %s ", new Object[] { localException.toString() });
      }
    }
  }
  
  public final void gi(int paramInt) {}
  
  /* Error */
  public final boolean lB(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 693	com/tencent/mm/modelcontrol/d:dQy	Lcom/tencent/mm/plugin/a/b;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: new 695	com/tencent/mm/plugin/a/b
    //   11: dup
    //   12: invokespecial 696	com/tencent/mm/plugin/a/b:<init>	()V
    //   15: putfield 693	com/tencent/mm/modelcontrol/d:dQy	Lcom/tencent/mm/plugin/a/b;
    //   18: aload_0
    //   19: getfield 693	com/tencent/mm/modelcontrol/d:dQy	Lcom/tencent/mm/plugin/a/b;
    //   22: astore 6
    //   24: aload 6
    //   26: ldc2_w 697
    //   29: putfield 702	com/tencent/mm/plugin/a/b:eyx	J
    //   32: aload 6
    //   34: ldc2_w 697
    //   37: putfield 705	com/tencent/mm/plugin/a/b:eyz	J
    //   40: aload 6
    //   42: aconst_null
    //   43: putfield 709	com/tencent/mm/plugin/a/b:eyA	Lcom/tencent/mm/plugin/a/a;
    //   46: invokestatic 189	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   49: lstore_2
    //   50: aload_0
    //   51: getfield 693	com/tencent/mm/modelcontrol/d:dQy	Lcom/tencent/mm/plugin/a/b;
    //   54: aload_1
    //   55: invokevirtual 713	com/tencent/mm/plugin/a/b:oY	(Ljava/lang/String;)J
    //   58: lstore 4
    //   60: lload 4
    //   62: lconst_0
    //   63: lcmp
    //   64: ifgt +5 -> 69
    //   67: iconst_0
    //   68: ireturn
    //   69: aconst_null
    //   70: astore 11
    //   72: aconst_null
    //   73: astore 12
    //   75: new 715	java/io/RandomAccessFile
    //   78: dup
    //   79: new 717	java/io/File
    //   82: dup
    //   83: aload_1
    //   84: invokespecial 718	java/io/File:<init>	(Ljava/lang/String;)V
    //   87: ldc_w 720
    //   90: invokespecial 723	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   93: astore 8
    //   95: aload 8
    //   97: astore 6
    //   99: aload 8
    //   101: lload 4
    //   103: invokevirtual 727	java/io/RandomAccessFile:seek	(J)V
    //   106: aload 8
    //   108: astore 6
    //   110: bipush 8
    //   112: newarray <illegal type>
    //   114: astore 13
    //   116: aload 8
    //   118: astore 6
    //   120: aload 8
    //   122: aload 13
    //   124: getstatic 732	com/tencent/mm/plugin/a/a:akO	I
    //   127: invokestatic 735	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   130: astore 7
    //   132: aconst_null
    //   133: astore 6
    //   135: aload 6
    //   137: astore 9
    //   139: aload 7
    //   141: ifnull +65 -> 206
    //   144: aload 8
    //   146: astore 6
    //   148: aload 8
    //   150: aload 13
    //   152: getstatic 32	com/tencent/mm/modelcontrol/d:dQv	I
    //   155: invokestatic 735	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   158: astore 10
    //   160: aload 10
    //   162: astore 9
    //   164: aload 10
    //   166: ifnonnull +40 -> 206
    //   169: aload 8
    //   171: astore 6
    //   173: aload 8
    //   175: aload 7
    //   177: invokevirtual 738	com/tencent/mm/plugin/a/a:VL	()J
    //   180: invokevirtual 727	java/io/RandomAccessFile:seek	(J)V
    //   183: aload 8
    //   185: astore 6
    //   187: aload 8
    //   189: aload 13
    //   191: getstatic 732	com/tencent/mm/plugin/a/a:akO	I
    //   194: invokestatic 735	com/tencent/mm/plugin/a/c:a	(Ljava/io/RandomAccessFile;[BI)Lcom/tencent/mm/plugin/a/a;
    //   197: astore 7
    //   199: aload 10
    //   201: astore 6
    //   203: goto -68 -> 135
    //   206: aload 12
    //   208: astore 7
    //   210: aload 9
    //   212: ifnull +74 -> 286
    //   215: aload 8
    //   217: astore 6
    //   219: aload 9
    //   221: invokevirtual 741	com/tencent/mm/plugin/a/a:getSize	()J
    //   224: l2i
    //   225: bipush 8
    //   227: isub
    //   228: newarray <illegal type>
    //   230: astore 10
    //   232: aload 8
    //   234: astore 6
    //   236: aload 8
    //   238: aload 9
    //   240: getfield 744	com/tencent/mm/plugin/a/a:eyw	J
    //   243: ldc2_w 745
    //   246: ladd
    //   247: invokevirtual 727	java/io/RandomAccessFile:seek	(J)V
    //   250: aload 12
    //   252: astore 7
    //   254: aload 8
    //   256: astore 6
    //   258: aload 8
    //   260: aload 10
    //   262: invokevirtual 750	java/io/RandomAccessFile:read	([B)I
    //   265: ifle +21 -> 286
    //   268: aload 8
    //   270: astore 6
    //   272: new 154	java/lang/String
    //   275: dup
    //   276: aload 10
    //   278: ldc_w 676
    //   281: invokespecial 753	java/lang/String:<init>	([BLjava/lang/String;)V
    //   284: astore 7
    //   286: aload 8
    //   288: invokevirtual 756	java/io/RandomAccessFile:close	()V
    //   291: aload 7
    //   293: astore 6
    //   295: ldc -91
    //   297: ldc_w 758
    //   300: iconst_4
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: aload 6
    //   308: aastore
    //   309: dup
    //   310: iconst_1
    //   311: lload 4
    //   313: invokestatic 261	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   316: aastore
    //   317: dup
    //   318: iconst_2
    //   319: lload_2
    //   320: invokestatic 256	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   323: invokestatic 261	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   326: aastore
    //   327: dup
    //   328: iconst_3
    //   329: aload_1
    //   330: aastore
    //   331: invokestatic 178	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: aload 6
    //   336: invokestatic 226	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   339: ifne +91 -> 430
    //   342: aload 6
    //   344: ldc_w 760
    //   347: invokevirtual 764	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   350: ireturn
    //   351: astore 9
    //   353: aconst_null
    //   354: astore 7
    //   356: aload 7
    //   358: astore 6
    //   360: ldc -91
    //   362: ldc_w 766
    //   365: iconst_2
    //   366: anewarray 4	java/lang/Object
    //   369: dup
    //   370: iconst_0
    //   371: aload_1
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: aload 9
    //   377: invokevirtual 379	java/lang/Exception:toString	()Ljava/lang/String;
    //   380: aastore
    //   381: invokestatic 686	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   384: aload 11
    //   386: astore 6
    //   388: aload 7
    //   390: ifnull -95 -> 295
    //   393: aload 7
    //   395: invokevirtual 756	java/io/RandomAccessFile:close	()V
    //   398: aload 11
    //   400: astore 6
    //   402: goto -107 -> 295
    //   405: astore 6
    //   407: aload 11
    //   409: astore 6
    //   411: goto -116 -> 295
    //   414: astore_1
    //   415: aconst_null
    //   416: astore 6
    //   418: aload 6
    //   420: ifnull +8 -> 428
    //   423: aload 6
    //   425: invokevirtual 756	java/io/RandomAccessFile:close	()V
    //   428: aload_1
    //   429: athrow
    //   430: iconst_0
    //   431: ireturn
    //   432: astore 6
    //   434: aload 7
    //   436: astore 6
    //   438: goto -143 -> 295
    //   441: astore 6
    //   443: goto -15 -> 428
    //   446: astore_1
    //   447: goto -29 -> 418
    //   450: astore 9
    //   452: aload 8
    //   454: astore 7
    //   456: goto -100 -> 356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	459	0	this	d
    //   0	459	1	paramString	String
    //   49	271	2	l1	long
    //   58	254	4	l2	long
    //   22	379	6	localObject1	Object
    //   405	1	6	localIOException1	java.io.IOException
    //   409	15	6	localObject2	Object
    //   432	1	6	localIOException2	java.io.IOException
    //   436	1	6	localObject3	Object
    //   441	1	6	localIOException3	java.io.IOException
    //   130	325	7	localObject4	Object
    //   93	360	8	localRandomAccessFile	java.io.RandomAccessFile
    //   137	102	9	localObject5	Object
    //   351	25	9	localException1	Exception
    //   450	1	9	localException2	Exception
    //   158	119	10	localObject6	Object
    //   70	338	11	localObject7	Object
    //   73	178	12	localObject8	Object
    //   114	76	13	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   75	95	351	java/lang/Exception
    //   393	398	405	java/io/IOException
    //   75	95	414	finally
    //   286	291	432	java/io/IOException
    //   423	428	441	java/io/IOException
    //   99	106	446	finally
    //   110	116	446	finally
    //   120	132	446	finally
    //   148	160	446	finally
    //   173	183	446	finally
    //   187	199	446	finally
    //   219	232	446	finally
    //   236	250	446	finally
    //   258	268	446	finally
    //   272	286	446	finally
    //   360	384	446	finally
    //   99	106	450	java/lang/Exception
    //   110	116	450	java/lang/Exception
    //   120	132	450	java/lang/Exception
    //   148	160	450	java/lang/Exception
    //   173	183	450	java/lang/Exception
    //   187	199	450	java/lang/Exception
    //   219	232	450	java/lang/Exception
    //   236	250	450	java/lang/Exception
    //   258	268	450	java/lang/Exception
    //   272	286	450	java/lang/Exception
  }
  
  public final void onAccountRelease()
  {
    this.dQz = null;
    this.dQD = null;
    this.dQC = null;
    this.dQA = null;
    this.dQB = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelcontrol/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */