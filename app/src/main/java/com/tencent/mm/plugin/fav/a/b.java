package com.tencent.mm.plugin.fav.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.a;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ac.a;
import com.tencent.mm.model.ac.b;
import com.tencent.mm.model.m;
import com.tencent.mm.model.s;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.aum;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.wc;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wf;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
{
  private static HashMap<Long, ArrayList<String>> iVq = new HashMap();
  private static long iVr = 0L;
  
  private static com.tencent.mm.vfs.b AZ(String paramString)
  {
    int i = paramString.hashCode();
    paramString = new com.tencent.mm.vfs.b(String.format("%s/%s/%d/", new Object[] { com.tencent.mm.kernel.g.Ei().dqp, "favorite", Integer.valueOf(i & 0xFF) }));
    if ((!paramString.exists()) || (!paramString.isDirectory())) {
      paramString.mkdirs();
    }
    return paramString;
  }
  
  public static String Ba(String paramString)
  {
    return paramString + "_t";
  }
  
  public static boolean Bb(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    return paramString.endsWith("_t");
  }
  
  public static String Bc(String paramString)
  {
    ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
    if (localab != null)
    {
      if (!bi.oW(localab.field_conRemark)) {
        paramString = localab.field_conRemark;
      }
    }
    else {
      return paramString;
    }
    if (!bi.oW(localab.field_nickname)) {
      return localab.field_nickname;
    }
    return localab.field_username;
  }
  
  public static String Bd(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return null;
      paramString = new com.tencent.mm.vfs.b(aKO() + com.tencent.mm.a.g.u(paramString.getBytes()));
    } while (!paramString.exists());
    return paramString.cBX().toString();
  }
  
  public static int Be(String paramString)
  {
    if ((!bi.oW(paramString)) && (paramString.equals("speex"))) {
      return 1;
    }
    if ((!bi.oW(paramString)) && (paramString.equals("silk"))) {
      return 2;
    }
    return 0;
  }
  
  public static g Bf(String paramString)
  {
    g localg = new g();
    localg.field_localId = -1L;
    localg.field_id = -1;
    localg.field_xml = paramString;
    localg.field_type = 18;
    localg.Bh(paramString);
    return localg;
  }
  
  private static g Bg(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml but xml is null");
      return null;
    }
    paramString = paramString.replace("cdndataurl", "cdn_dataurl").replace("cdndatakey", "cdn_datakey").replace("cdnthumburl", "cdn_thumburl").replace("cdnthumbkey", "cdn_thumbkey").replace("datasize", "fullsize").replace("thumbsize", "thumbfullsize").replace("sourcename", "datasrcname").replace("sourcetime", "datasrctime").replace("streamlowbandurl", "stream_lowbandurl").replace("streamdataurl", "stream_dataurl").replace("streamweburl", "stream_weburl");
    if (!paramString.startsWith("<noteinfo>")) {
      paramString = "<noteinfo>" + paramString + "</noteinfo>";
    }
    for (;;)
    {
      Map localMap = bl.z(paramString, "noteinfo");
      if (localMap == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml, FavItemInfo maps null");
        return null;
      }
      g localg = new g();
      try
      {
        localg.field_favProto = new wl();
        localg.field_type = 18;
        Object localObject = (String)localMap.get(".noteinfo.edittime");
        localg.field_favProto.fT(bi.getLong((String)localObject, 0L));
        localObject = new wf();
        ((wf)localObject).rBA = ((String)localMap.get(".noteinfo.noteeditor"));
        ((wf)localObject).rBz = ((String)localMap.get(".noteinfo.noteauthor"));
        localg.field_favProto.a((wf)localObject);
        localg.field_localId = bi.getLong((String)localMap.get(".noteinfo.favlocalid"), System.currentTimeMillis());
        com.tencent.mm.plugin.fav.a.a.b.a(paramString, localg.field_favProto);
        return localg;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Fav.FavApiLogic", paramString, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
        return null;
      }
    }
  }
  
  public static long a(g paramg)
  {
    Object localObject = a.iVo;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      if (localObject[i] == paramg.field_type)
      {
        if (paramg.field_favProto != null)
        {
          localObject = paramg.field_favProto.rBI.iterator();
          for (long l1 = 0L;; l1 = ((vx)((Iterator)localObject).next()).rzJ + l1)
          {
            l2 = l1;
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
          }
        }
        long l2 = 0L;
        paramg.field_datatotalsize = l2;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Fav.FavApiLogic", "calFavItemInfoTotalLength id:%d,length:%d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(l2) });
        return l2;
      }
      i += 1;
    }
    return 0L;
  }
  
  public static g a(wl paramwl)
  {
    g localg = new g();
    localg.field_favProto = new wl();
    localg.field_type = 18;
    localg.field_favProto = paramwl;
    return localg;
  }
  
  public static vx a(g paramg, String paramString)
  {
    if ((bi.oW(paramString)) || (paramg == null) || (paramg.field_favProto.rBI.size() == 0)) {
      return null;
    }
    paramg = paramg.field_favProto.rBI.iterator();
    while (paramg.hasNext())
    {
      vx localvx = (vx)paramg.next();
      if (localvx.jdM.equals(paramString)) {
        return localvx;
      }
    }
    return null;
  }
  
  public static wc a(int paramInt, wl paramwl, wy paramwy)
  {
    if (paramwl == null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "proto item is null");
    }
    wc localwc;
    do
    {
      return null;
      localwc = new wc();
      wr localwr = paramwl.rBG;
      if (localwr != null)
      {
        localwc.bSS = localwr.bSS;
        localwc.rBs = localwr.rBh;
        localwc.appId = localwr.appId;
        localwc.bGy = localwr.bGy;
      }
      if (paramwy != null)
      {
        if (paramwy.rBW != null) {
          localwc.rBt.addAll(paramwy.rBW);
        }
        if (paramwy.rBX != null) {
          localwc.rBt.addAll(paramwy.rBX);
        }
      }
      localwc.bXO = paramwl;
      localwc.type = paramInt;
      switch (paramInt)
      {
      case 3: 
      case 9: 
      case 13: 
      case 16: 
      case 17: 
      default: 
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "unknown type %d", new Object[] { Integer.valueOf(paramInt) });
        return localwc;
      case 1: 
        localwc.title = "";
        localwc.desc = paramwl.desc;
        return localwc;
      case 4: 
        if ((paramwl.rBI != null) && (!paramwl.rBI.isEmpty())) {
          localwc.title = ((vx)paramwl.rBI.get(0)).title;
        }
        return localwc;
      case 5: 
        if (paramwl.rAN != null)
        {
          localwc.title = paramwl.rAN.title;
          localwc.desc = paramwl.rAN.rCn;
        }
        if ((bi.oW(localwc.title)) && (paramwl.rBI != null) && (!paramwl.rBI.isEmpty())) {
          localwc.title = ((vx)paramwl.rBI.get(0)).title;
        }
        if ((bi.oW(localwc.desc)) && (localwr != null)) {
          localwc.desc = localwr.egr;
        }
        return localwc;
      case 6: 
        localwc.title = paramwl.fky;
        if (bi.oW(localwc.title)) {
          if (paramwl.rAL != null)
          {
            localwc.title = paramwl.rAL.bWB;
            localwc.desc = paramwl.rAL.label;
          }
        }
        for (;;)
        {
          return localwc;
          if (paramwl.rAL != null) {
            localwc.desc = paramwl.rAL.bWB;
          }
        }
      case 2: 
        if ((paramwl.rBI != null) && (paramwl.rBI.size() > 0)) {
          localwc.title = ((vx)paramwl.rBI.get(0)).title;
        }
        return localwc;
      case 7: 
        if ((paramwl.rBI != null) && (!paramwl.rBI.isEmpty()))
        {
          localwc.title = ((vx)paramwl.rBI.get(0)).title;
          localwc.desc = ((vx)paramwl.rBI.get(0)).desc;
        }
        return localwc;
      case 8: 
        localwc.title = paramwl.title;
        if ((bi.oW(localwc.title)) && (paramwl.rBI != null) && (!paramwl.rBI.isEmpty())) {
          localwc.title = ((vx)paramwl.rBI.get(0)).title;
        }
        return localwc;
      case 10: 
      case 11: 
        if (paramwl.rAP != null)
        {
          localwc.title = paramwl.rAP.title;
          localwc.desc = paramwl.rAP.desc;
        }
        return localwc;
      case 12: 
      case 15: 
        if (paramwl.rAR != null)
        {
          localwc.title = paramwl.rAR.title;
          localwc.desc = paramwl.rAR.desc;
        }
        return localwc;
      }
      paramwl = paramwl.rBI;
    } while (paramwl == null);
    paramwl = paramwl.iterator();
    while (paramwl.hasNext())
    {
      paramwy = (vx)paramwl.next();
      if (1 == paramwy.bjS) {
        localwc.title = paramwy.desc;
      }
    }
    return localwc;
  }
  
  public static String a(vx paramvx)
  {
    vy localvy = paramvx.rAi;
    String str = "";
    switch (paramvx.bjS)
    {
    case 2: 
    case 3: 
    case 7: 
    case 9: 
    default: 
      paramvx = cI(cI("", localvy.title), localvy.desc);
    case 1: 
    case 4: 
    case 5: 
    case 6: 
    case 10: 
    case 11: 
      do
      {
        do
        {
          do
          {
            do
            {
              return paramvx;
              return cI("", paramvx.desc);
              paramvx = str;
            } while (localvy.rAR == null);
            return cI("", localvy.rAR.title);
            paramvx = str;
          } while (localvy.rAN == null);
          return cI("", localvy.rAN.title);
          str = cI("", localvy.fky);
          paramvx = str;
        } while (localvy.rAL == null);
        return cI(cI(str, localvy.rAL.bWB), localvy.rAL.label);
        paramvx = str;
      } while (localvy.rAP == null);
      return cI(cI("", localvy.rAP.title), localvy.rAP.desc);
    }
    return cI("", localvy.title);
  }
  
  public static ArrayList<g> a(List<String> paramList1, List<String> paramList2, List<Integer> paramList, List<g> paramList3, Set<Integer> paramSet, w paramw)
  {
    paramList1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().a(paramList1, paramList2, paramList);
    paramList2 = new ArrayList();
    if (paramList1.size() == 0) {
      return paramList2;
    }
    int i;
    for (int j = 0;; j = i)
    {
      if (j + 20 < paramList1.size()) {}
      for (i = j + 20;; i = paramList1.size())
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "start:%d  end:%d listSize:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramList1.size()) });
        paramList = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramList1.subList(j, i), paramList3, paramSet, paramw);
        if ((paramList != null) && (paramList.size() > 0)) {
          paramList2.addAll(paramList);
        }
        if (i < paramList1.size()) {
          break;
        }
        return paramList2;
      }
    }
  }
  
  public static List<g> a(long paramLong, int paramInt, Set<Integer> paramSet, w paramw)
  {
    if (paramLong == 0L) {
      return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramInt, paramSet, paramw);
    }
    return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().b(paramLong, paramInt, paramSet, paramw);
  }
  
  public static void a(long paramLong, we paramwe, String paramString1, String paramString2, ArrayList<String> paramArrayList, Context paramContext)
  {
    if ((paramwe == null) || (paramContext == null)) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("KFavLocSigleView", true);
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kFavInfoLocalId", paramLong);
    localIntent.putExtra("kwebmap_slat", paramwe.lat);
    localIntent.putExtra("kwebmap_lng", paramwe.lng);
    localIntent.putExtra("kPoiName", paramwe.bWB);
    localIntent.putExtra("Kwebmap_locaion", paramwe.label);
    if (paramwe.bSz >= 0) {
      localIntent.putExtra("kwebmap_scale", paramwe.bSz);
    }
    localIntent.putExtra("kisUsername", paramString1);
    localIntent.putExtra("kwebmap_from_to", true);
    localIntent.putExtra("kRemark", paramString2);
    localIntent.putExtra("kTags", paramArrayList);
    localIntent.putExtra("kFavCanDel", true);
    localIntent.putExtra("kFavCanRemark", true);
    com.tencent.mm.bg.d.b(paramContext, "location", ".ui.RedirectUI", localIntent);
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent)
  {
    a(paramContext, paramString, paramIntent, null);
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent, int paramInt)
  {
    a(paramContext, paramString, paramIntent, paramInt, null);
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {}
    try
    {
      localIntent = new Intent();
      String str = ad.chX() + ".plugin.fav";
      paramIntent = paramString;
      if (paramString.startsWith(".")) {
        paramIntent = str + paramString;
      }
      localIntent.setClassName(ad.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).startActivityForResult(localIntent, paramInt, paramBundle);
      }
      return;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent, Bundle paramBundle)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {}
    try
    {
      localIntent = new Intent();
      String str = ad.chX() + ".plugin.fav";
      paramIntent = paramString;
      if (paramString.startsWith(".")) {
        paramIntent = str + paramString;
      }
      localIntent.setClassName(ad.getPackageName(), paramIntent);
      Class.forName(paramIntent, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(localIntent, paramBundle);
        return;
      }
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent, paramBundle);
      return;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  private static void a(fz paramfz)
  {
    if (bi.oW(paramfz.bOL.desc)) {
      paramfz.bOM.ret = -1;
    }
    String str;
    do
    {
      do
      {
        return;
        localObject = Bg(paramfz.bOL.desc);
        if ((localObject == null) || (((g)localObject).field_localId <= 0L))
        {
          paramfz.bOM.ret = -1;
          return;
        }
        boolean bool = e((g)localObject);
        str = paramfz.bOL.bOR;
        if (!bool) {
          break;
        }
        paramfz.bOM.ret = 1;
        paramfz = (ArrayList)iVq.get(Long.valueOf(((g)localObject).field_localId));
      } while (paramfz == null);
      if (paramfz.contains(str)) {
        paramfz.remove(str);
      }
    } while (paramfz.size() != 0);
    iVq.remove(Long.valueOf(((g)localObject).field_localId));
    return;
    if (bi.oW(str))
    {
      paramfz.bOM.ret = -1;
      return;
    }
    long l = ((g)localObject).field_localId;
    if (iVq.get(Long.valueOf(l)) == null) {}
    for (Object localObject = new ArrayList();; localObject = (ArrayList)iVq.get(Long.valueOf(l)))
    {
      ((ArrayList)localObject).add(str);
      iVq.put(Long.valueOf(l), localObject);
      localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(l);
      if ((localObject != null) && (((g)localObject).field_localId > 0L)) {
        break;
      }
      paramfz.bOM.ret = -1;
      return;
    }
    if ((e((g)localObject)) || (((g)localObject).field_itemStatus == 10))
    {
      paramfz.bOM.ret = -1;
      com.tencent.mm.kernel.g.Em().h(new b.1((g)localObject), 500L);
      return;
    }
    paramfz.bOM.ret = -1;
  }
  
  public static void a(c paramc)
  {
    int i = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().p(paramc.field_favLocalId, 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, upload data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramc.field_favLocalId) });
    g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramc.field_favLocalId);
    if (localg == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
      return;
    }
    if (localg.aLj())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus waiting server upload skip.");
      return;
    }
    if ((paramc.field_status == 3) && (i != paramc.field_status) && (localg.field_type == 18) && (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramc.field_dataId).field_status == 3))
    {
      a(paramc, localg);
      return;
    }
    switch (i)
    {
    case 0: 
    default: 
      return;
    case 1: 
      if (localg.aLi()) {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(15, paramc.field_favLocalId);
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, continue upload data, favlocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        return;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(4, paramc.field_favLocalId);
      }
    case 4: 
      if (localg.aLi()) {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(16, paramc.field_favLocalId);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(localg.field_type), Integer.valueOf(-5), Long.valueOf(b(localg)), Long.valueOf(h.dr(localg.field_localId)) });
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        return;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(6, paramc.field_favLocalId);
      }
    case 3: 
      if (localg.field_type == 18)
      {
        a(paramc, localg);
        return;
      }
      if (localg.aLi())
      {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(17, paramc.field_favLocalId);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start mod faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getModService().run();
        return;
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(9, paramc.field_favLocalId);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start send faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
      return;
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(6, paramc.field_favLocalId);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
  }
  
  private static void a(c paramc, g paramg)
  {
    Iterator localIterator = paramg.field_favProto.rBI.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      vx localvx = (vx)localIterator.next();
      if ((localvx.bjS != 1) && (localvx.bjS != 6))
      {
        if (!bi.oW(localvx.rzo)) {
          break label171;
        }
        i += 1;
      }
    }
    label171:
    for (;;)
    {
      break;
      if (i == 0)
      {
        if (paramg.field_id > 0)
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(17, paramc.field_favLocalId);
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getModService().run();
        }
      }
      else {
        return;
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(9, paramc.field_favLocalId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
      return;
    }
  }
  
  public static void a(g paramg, int paramInt)
  {
    if (paramg == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "modeTag, item info is null");
      return;
    }
    Object localObject1 = new LinkedList();
    Object localObject2 = new auj();
    ((auj)localObject2).rXA = 4;
    ((auj)localObject2).rXB = 0;
    ((LinkedList)localObject1).add(localObject2);
    localObject2 = new LinkedList();
    aum localaum = new aum();
    localaum.jSt = "favitem.taglist";
    localaum.hcE = 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramg.field_tagProto.rBX.size();
    int i = 0;
    while (i < j)
    {
      localStringBuffer.append("<tag>").append(bi.WS((String)paramg.field_tagProto.rBX.get(i))).append("</tag>");
      i += 1;
    }
    localaum.mEl = localStringBuffer.toString();
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "do net scene mod tag, id=%d, tag=%s", new Object[] { Integer.valueOf(paramg.field_id), localaum.mEl });
    ((LinkedList)localObject2).add(localaum);
    if (paramg.field_id > 0)
    {
      localObject1 = new al(paramg.field_id, (LinkedList)localObject1, (LinkedList)localObject2);
      com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
      h.g(paramg.field_id, j, paramInt);
      return;
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getEditService().a(paramg.field_localId, (LinkedList)localObject1, (LinkedList)localObject2, paramInt);
  }
  
  public static void a(g paramg, vx paramvx)
  {
    if (bi.oW(paramvx.jdM)) {}
    String str;
    Object localObject;
    do
    {
      return;
      str = Ba(paramvx.jdM);
      c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(str);
      localObject = localc;
      if (localc != null)
      {
        localObject = localc;
        if (localc.field_status == 3)
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
          localObject = null;
        }
      }
      if ((localObject != null) && (((c)localObject).field_type == 1))
      {
        ((c)localObject).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(str);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
        return;
      }
      localObject = new com.tencent.mm.vfs.b(c(paramvx));
    } while ((bi.oW(paramvx.rzk)) || (bi.oW(paramvx.dwE)) || (((com.tencent.mm.vfs.b)localObject).exists()));
    a(paramvx, paramg, 1);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(str);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
  }
  
  public static void a(g paramg, vx paramvx, boolean paramBoolean)
  {
    if ((paramg == null) || (bi.oW(paramvx.jdM))) {}
    Object localObject1;
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), paramvx.jdM });
      Object localObject2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM);
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((c)localObject2).field_status == 3)
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b((c)localObject2, new String[] { "dataId" });
          localObject1 = null;
        }
      }
      localObject2 = localObject1;
      if (localObject1 != null) {
        if ((!bi.oW(((c)localObject1).field_cdnUrl)) && (!bi.oW(((c)localObject1).field_cdnKey)) && (!bi.oW(((c)localObject1).field_dataId)) && (((c)localObject1).field_cdnUrl.equals(paramvx.rzo)) && (((c)localObject1).field_cdnKey.equals(paramvx.rzq)))
        {
          localObject2 = localObject1;
          if (((c)localObject1).field_dataId.equals(paramvx.jdM)) {}
        }
        else
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b((c)localObject1, new String[] { "dataId" });
          localObject2 = null;
        }
      }
      if ((localObject2 != null) && (((c)localObject2).field_type == 1))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
        ((c)localObject2).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a((c)localObject2, new String[] { "dataId" });
        if (paramBoolean)
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(paramvx.jdM);
          if ((!bi.oW(paramvx.rAq)) && (paramvx.rAq.equals("WeNoteHtmlFile")))
          {
            paramg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM);
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().c(paramg);
          }
        }
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
        return;
      }
      localObject1 = new com.tencent.mm.vfs.b(b(paramvx));
    } while ((bi.oW(paramvx.rzq)) || (bi.oW(paramvx.rzo)) || (((com.tencent.mm.vfs.b)localObject1).exists()));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
    long l = System.currentTimeMillis();
    a(paramvx, paramg, 1, true);
    if (paramBoolean)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(paramvx.jdM);
      if ((!bi.oW(paramvx.rAq)) && (paramvx.rAq.equals("WeNoteHtmlFile")))
      {
        paramg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().c(paramg);
      }
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public static void a(g paramg, boolean paramBoolean)
  {
    h(paramg);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().dA(paramg.field_localId);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().z(paramg);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dw(paramg.field_localId);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().v(paramg);
    if (paramBoolean)
    {
      Set localSet = aKN();
      localSet.add(paramg.field_id);
      e(localSet);
      aKP();
    }
  }
  
  public static void a(vx paramvx, int paramInt)
  {
    if (bi.oW(paramvx.jdM)) {}
    String str;
    do
    {
      do
      {
        return;
      } while ((bi.oW(paramvx.rzk)) || (bi.oW(paramvx.dwE)));
      str = Ba(paramvx.jdM);
      c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(str);
      localObject = localc;
      if (localc != null) {
        if (localc.field_status != 3)
        {
          localObject = localc;
          if (localc.field_status != 4) {}
        }
        else
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
          localObject = null;
        }
      }
      if ((localObject != null) && (((c)localObject).field_type == 1))
      {
        ((c)localObject).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(str);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
        return;
      }
      localObject = new com.tencent.mm.vfs.b(c(paramvx));
    } while ((bi.oW(paramvx.rzk)) || (bi.oW(paramvx.dwE)) || (((com.tencent.mm.vfs.b)localObject).exists()));
    Object localObject = new g();
    ((g)localObject).field_localId = -1L;
    ((g)localObject).field_id = -1;
    ((g)localObject).field_type = paramInt;
    a(paramvx, (g)localObject, 1);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(str);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
  }
  
  public static void a(vx paramvx, g paramg, int paramInt)
  {
    if ((paramInt == 1) && ((paramvx.rzU <= 0L) || (bi.oW(paramvx.rzk)) || (bi.oW(paramvx.dwE))))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
      return;
    }
    if ((paramInt == 0) && (bi.oW(c(paramvx))))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type send, path must not be null!");
      return;
    }
    String str = Ba(paramvx.jdM);
    if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(str) != null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", new Object[] { str });
      return;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "insert cdn thumb info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
    c localc = new c();
    localc.field_cdnKey = paramvx.rzk;
    localc.field_cdnUrl = paramvx.dwE;
    localc.field_dataId = str;
    localc.field_favLocalId = paramg.field_localId;
    localc.field_totalLen = ((int)paramvx.rzU);
    localc.field_type = paramInt;
    localc.field_status = 1;
    localc.field_path = c(paramvx);
    localc.field_modifyTime = bi.VF();
    localc.field_attrFlag |= 1L;
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().e(localc);
    if (paramInt == 1)
    {
      b(localc);
      return;
    }
    a(localc);
  }
  
  public static void a(vx paramvx, g paramg, int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && ((bi.oW(paramvx.rzq)) || (bi.oW(paramvx.rzo))))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo, type recv, cdndataurl must not be null!");
      return;
    }
    if ((paramInt == 0) && (bi.oW(b(paramvx))))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo, type send, path must not be null!");
      return;
    }
    if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM) != null)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", new Object[] { paramvx.jdM });
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insert cdn data info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_id) });
    c localc = new c();
    localc.field_dataId = paramvx.jdM;
    localc.field_totalLen = ((int)paramvx.rzJ);
    localc.field_type = paramInt;
    localc.field_favLocalId = paramg.field_localId;
    localc.field_cdnKey = paramvx.rzq;
    localc.field_cdnUrl = paramvx.rzo;
    localc.field_path = b(paramvx);
    int i;
    label245:
    boolean bool;
    if (paramvx.bjS == 3)
    {
      paramvx = paramvx.rzD;
      if ((!bi.oW(paramvx)) && (paramvx.equals("speex")))
      {
        i = -3;
        localc.field_dataType = i;
        localc.field_modifyTime = bi.VF();
        bool = ao.isWifi(ad.getContext());
        if (paramInt == 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "can auto upload, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
          if (!paramBoolean) {
            break label495;
          }
          i = 1;
          label321:
          if (i == 0) {
            break label622;
          }
          localc.field_status = 1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo upload status traning");
        }
        label340:
        if (paramInt == 1)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "can auto download, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
          if (!paramBoolean) {
            break label639;
          }
          i = 1;
          label401:
          if (i == 0) {
            break label752;
          }
          localc.field_status = 1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo download status traning");
        }
      }
    }
    for (;;)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().e(localc);
      if (paramInt != 1) {
        break label769;
      }
      b(localc);
      return;
      if ((!bi.oW(paramvx)) && (paramvx.equals("silk")))
      {
        i = -4;
        break;
      }
      i = -2;
      break;
      localc.field_dataType = paramvx.bjS;
      break label245;
      label495:
      if (bool)
      {
        i = 1;
        break label321;
      }
      if ((localc.field_dataType != 8) && (localc.field_dataType != 4) && (localc.field_dataType != 15))
      {
        i = 1;
        break label321;
      }
      long l2 = ad.getContext().getSharedPreferences(ad.chY(), 0).getLong("fav_mx_auto_upload_size", 0L);
      long l1 = l2;
      if (l2 == 0L) {
        l1 = 26214400L;
      }
      if (localc.field_totalLen <= l1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "match max auto upload, max size %d", new Object[] { Long.valueOf(l1) });
        i = 1;
        break label321;
      }
      i = 0;
      break label321;
      label622:
      localc.field_status = 4;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo upload status pause");
      break label340;
      label639:
      if (bool)
      {
        i = 1;
        break label401;
      }
      if ((localc.field_dataType != 8) && (localc.field_dataType != 4) && (localc.field_dataType != 15))
      {
        i = 1;
        break label401;
      }
      l1 = ad.getContext().getSharedPreferences(ad.chY(), 0).getLong("fav_mx_auto_download_size", 26214400L);
      if (localc.field_totalLen <= l1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "match max auto download, max size %d", new Object[] { Long.valueOf(l1) });
        i = 1;
        break label401;
      }
      i = 0;
      break label401;
      label752:
      localc.field_status = 4;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insertCdnDataInfo download status pause");
    }
    label769:
    a(localc);
  }
  
  public static boolean a(long paramLong, Runnable paramRunnable)
  {
    return a(((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong), true, paramRunnable);
  }
  
  public static boolean a(g paramg, boolean paramBoolean, Runnable paramRunnable)
  {
    if (paramg == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
      com.tencent.mm.sdk.platformtools.ah.A(paramRunnable);
      return false;
    }
    if (Looper.myLooper() == com.tencent.mm.kernel.g.Em().lnJ.getLooper())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do directly", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Boolean.valueOf(paramBoolean) });
      a(paramg, paramBoolean);
      com.tencent.mm.sdk.platformtools.ah.A(paramRunnable);
    }
    for (;;)
    {
      return true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, post to worker", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Boolean.valueOf(paramBoolean) });
      com.tencent.mm.kernel.g.Em().H(new b.2(paramg, paramBoolean, paramRunnable));
    }
  }
  
  public static String[] a(g paramg, com.tencent.mm.sdk.platformtools.ag paramag)
  {
    Object localObject2 = null;
    if (paramg == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      return null;
    }
    vx localvx = c(paramg);
    String[] arrayOfString = new String[2];
    b.3 local3 = new b.3(paramg, localvx);
    Object localObject1;
    switch (paramg.field_type)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    default: 
      if (localvx != null)
      {
        arrayOfString[0] = c(localvx);
        arrayOfString[1] = localvx.bJv;
        paramag.post(local3);
      }
    case 5: 
    case 10: 
    case 15: 
    case 11: 
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath thumbPath %s, thumbUrl %s, type %d", new Object[] { arrayOfString[0], arrayOfString[1], Integer.valueOf(paramg.field_type) });
        return arrayOfString;
        localObject1 = paramg.field_favProto.rAN;
        if (localvx == null)
        {
          if (localObject1 != null) {
            arrayOfString[1] = ((xa)localObject1).thumbUrl;
          }
        }
        else
        {
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((xa)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bi.oW((String)localObject1)) {
              localObject2 = localvx.bJv;
            }
            arrayOfString[0] = c(localvx);
            arrayOfString[1] = localObject2;
            paramag.post(local3);
            break;
          }
          paramag = paramg.field_favProto.rAP;
          if (paramag != null)
          {
            arrayOfString[1] = paramag.thumbUrl;
            continue;
            paramag = paramg.field_favProto.rAR;
            if (paramag != null)
            {
              arrayOfString[1] = paramag.thumbUrl;
              continue;
              paramag = paramg.field_favProto.rAP;
              if (paramag != null) {
                arrayOfString[1] = paramag.thumbUrl;
              }
            }
          }
        }
      }
    }
    if (paramg.field_favProto.rBI != null)
    {
      Iterator localIterator = paramg.field_favProto.rBI.iterator();
      label357:
      localObject1 = localObject2;
      if (localIterator.hasNext())
      {
        localObject1 = (vx)localIterator.next();
        if (((vx)localObject1).bjS != 2) {
          break label417;
        }
        localObject1 = b((vx)localObject1);
        paramag.post(local3);
      }
    }
    for (;;)
    {
      arrayOfString[0] = localObject1;
      arrayOfString[1] = localvx.bJv;
      break;
      label417:
      if (((vx)localObject1).bjS != 15) {
        break label357;
      }
      localObject1 = c((vx)localObject1);
      paramag.post(local3);
    }
  }
  
  private static Set<String> aKN()
  {
    Object localObject = (String)com.tencent.mm.kernel.g.Ei().DT().get(225282, "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "get need del IDs: %s", new Object[] { localObject });
    HashSet localHashSet = new HashSet();
    if (bi.oW((String)localObject)) {
      return localHashSet;
    }
    localObject = ((String)localObject).split(",");
    if ((localObject == null) || (localObject.length == 0)) {
      return localHashSet;
    }
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localHashSet.add(localObject[i]);
      i += 1;
    }
    return localHashSet;
  }
  
  public static String aKO()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().dqp + "favorite/web/";
  }
  
  public static void aKP()
  {
    Object localObject2 = aKN();
    if (((Set)localObject2).size() == 0) {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "doBatchDel no item to delete");
    }
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "doBatchDel idList:%s", new Object[] { localObject2.toString() });
      localObject1 = new LinkedList();
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        try
        {
          ((LinkedList)localObject1).add(Integer.valueOf(bi.getInt(str, 0)));
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Fav.FavApiLogic", localException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "doBatchDel parseInt error:%s", new Object[] { localException.getMessage() });
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "doBatchDel after parse, total size %d", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()) });
    } while (((LinkedList)localObject1).size() <= 0);
    Object localObject1 = new ag((LinkedList)localObject1);
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
  }
  
  public static void aKQ()
  {
    if (0L >= iVr)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
      return;
    }
    g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(iVr);
    iVr = 0L;
    if (localg == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav ,go on");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 5);
    localIntent.putExtra("key_fav_item_id", localg.field_localId);
    a(ad.getContext(), ".ui.FavTagEditUI", localIntent, null);
  }
  
  public static long aKR()
  {
    long l2 = aKS() - aKT();
    long l1 = l2;
    if (l2 < 0L) {
      l1 = 1024L;
    }
    return l1;
  }
  
  public static long aKS()
  {
    return ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sRr, Long.valueOf(0L))).longValue();
  }
  
  public static long aKT()
  {
    return ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sRq, Long.valueOf(0L))).longValue();
  }
  
  public static boolean aKU()
  {
    if (aKS() == 0L) {}
    while (aKR() >= 52428800L) {
      return false;
    }
    return true;
  }
  
  public static String aKV()
  {
    return com.tencent.mm.kernel.g.Ei().dqp + "favorite/music/";
  }
  
  public static String aKW()
  {
    return com.tencent.mm.kernel.g.Ei().dqp + "favorite/";
  }
  
  public static String aKX()
  {
    return com.tencent.mm.kernel.g.Ei().dqp + "favorite/voice/";
  }
  
  public static boolean aKY()
  {
    return ah.aLN() > 0;
  }
  
  public static boolean aKZ()
  {
    if (aKS() == 0L) {}
    while (aKR() >= 10485760L) {
      return false;
    }
    return true;
  }
  
  public static String aj(float paramFloat)
  {
    if (paramFloat < 1024.0F) {
      return String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
    }
    if (paramFloat < 1048576.0F) {
      return String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
    }
    if (paramFloat < 1.07374182E9F) {
      return String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
    }
    return String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
  }
  
  public static long b(g paramg)
  {
    if (paramg == null) {
      return 0L;
    }
    paramg = paramg.field_favProto.rBI.iterator();
    vx localvx;
    long l;
    for (int i = 0; paramg.hasNext(); i = (int)(localvx.rzJ + l))
    {
      localvx = (vx)paramg.next();
      l = i;
    }
    return i;
  }
  
  public static String b(vx paramvx)
  {
    if (paramvx == null) {
      return "";
    }
    Object localObject2 = paramvx.jdM;
    if ((bi.oW((String)localObject2)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {
      return "";
    }
    com.tencent.mm.vfs.b localb2 = AZ((String)localObject2);
    int j = 0;
    int i = j;
    com.tencent.mm.vfs.b localb1 = localb2;
    Object localObject1 = localObject2;
    if (paramvx.bjS == 8)
    {
      i = j;
      localb1 = localb2;
      localObject1 = localObject2;
      if (!bi.oW(paramvx.title))
      {
        localObject1 = paramvx.title;
        localb1 = AZ(paramvx.jdM);
        i = 1;
      }
    }
    localObject2 = localObject1;
    if (paramvx.rzD != null)
    {
      localObject2 = localObject1;
      if (paramvx.rzD.trim().length() > 0)
      {
        localObject2 = localObject1;
        if (i == 0) {
          localObject2 = (String)localObject1 + "." + paramvx.rzD;
        }
      }
    }
    return new com.tencent.mm.vfs.b(localb1, (String)localObject2).cBX().toString();
  }
  
  public static void b(fz paramfz)
  {
    Object localObject2;
    Object localObject3;
    if (paramfz.bOL.bOS == 1)
    {
      paramfz.bOM.path = dj(paramfz.bOL.bJA);
      localObject2 = paramfz.bOM;
      long l = paramfz.bOL.bJA;
      localObject3 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(l);
      if ((localObject3 == null) || (((g)localObject3).field_favProto == null))
      {
        paramfz = "";
        label80:
        ((fz.b)localObject2).bOX = paramfz;
      }
    }
    label485:
    do
    {
      do
      {
        return;
        if ((((g)localObject3).field_type != 18) || (((g)localObject3).field_favProto.rBI.size() > 1))
        {
          paramfz = ((g)localObject3).field_favProto.rBI.iterator();
          for (;;)
          {
            if (paramfz.hasNext())
            {
              vx localvx = (vx)paramfz.next();
              switch (localvx.bjS)
              {
              default: 
                break;
              case 2: 
                localObject1 = c(localvx);
                paramfz = (fz)localObject1;
                if (com.tencent.mm.vfs.d.cn((String)localObject1)) {
                  break label80;
                }
                paramfz = b(localvx);
                if (com.tencent.mm.vfs.d.cn(paramfz))
                {
                  com.tencent.mm.sdk.platformtools.c.c(paramfz, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject1);
                  paramfz = c(localvx);
                  break label80;
                }
                if (localvx.rzj)
                {
                  a((g)localObject3, localvx);
                  paramfz = (fz)localObject1;
                  break label80;
                }
                if (localvx.rzp)
                {
                  a((g)localObject3, localvx, true);
                  break label80;
                }
                paramfz = "";
                break label80;
              }
            }
          }
        }
        paramfz = "";
        break;
        if (paramfz.bOL.bOS == 2)
        {
          localObject1 = new g();
          ((g)localObject1).field_type = 2;
          localObject2 = new vx();
          ((vx)localObject2).UO(bm(localObject2.toString(), 2));
          localObject3 = b((vx)localObject2);
          ((vx)localObject2).UP((String)localObject3);
          ((vx)localObject2).CF(2);
          ((g)localObject1).field_favProto.rBI.add(localObject2);
          paramfz.bOM.path = g.s((g)localObject1);
          paramfz.bOM.bOX = ((String)localObject3);
          return;
        }
        if (paramfz.bOL.bOS != 3) {
          break label485;
        }
        localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
      } while (localObject1 == null);
      paramfz.bOM.path = (com.tencent.mm.model.q.GF() + ";" + ((g)localObject1).field_fromUser + ";" + ((g)localObject1).field_updateTime);
      return;
      if (paramfz.bOL.bOS != 4) {
        break label526;
      }
      localObject1 = Bg(paramfz.bOL.desc);
    } while (localObject1 == null);
    paramfz.bOL.bJH = ((g)localObject1).field_favProto;
    return;
    label526:
    if (paramfz.bOL.bOS == 5)
    {
      a(paramfz);
      return;
    }
    if (paramfz.bOL.bOS == 6)
    {
      localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfz.bOL.bJA);
      if (localObject1 == null)
      {
        paramfz.bOM.ret = 0;
        return;
      }
      paramfz = paramfz.bOM;
      if (((g)localObject1).field_id > 0) {}
      for (int i = 1;; i = 0)
      {
        paramfz.ret = i;
        return;
      }
    }
    Object localObject1 = new g();
    ((g)localObject1).field_type = 18;
    ((g)localObject1).field_favProto = paramfz.bOL.bJH;
    paramfz.bOM.path = g.s((g)localObject1);
  }
  
  public static void b(c paramc)
  {
    int i = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().p(paramc.field_favLocalId, 1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, download data status:%d, favlocalId:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramc.field_favLocalId) });
    g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramc.field_favLocalId);
    if (localg == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
      return;
    }
    if ((localg.aLj()) || (localg.aLf()) || (localg.aLg()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, status upload, skip. isWaitServerUpload:%b  isUploadding:%b  isUploadFailed:%b", new Object[] { Boolean.valueOf(localg.aLj()), Boolean.valueOf(localg.aLf()), Boolean.valueOf(localg.aLg()) });
      return;
    }
    switch (i)
    {
    default: 
      return;
    case 0: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus init, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(10, paramc.field_favLocalId);
      return;
    case 1: 
      h.ds(localg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(7, paramc.field_favLocalId);
      return;
    case 4: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_itemStatus) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localg.field_type), Integer.valueOf(-5), Long.valueOf(b(localg)), Long.valueOf(h.dr(localg.field_localId)) });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(8, paramc.field_favLocalId);
      return;
    case 3: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus finish, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(10659, new Object[] { Integer.valueOf(1), Integer.valueOf(localg.field_type), Integer.valueOf(0), Long.valueOf(b(localg)), Long.valueOf(h.dr(localg.field_localId)) });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(10, paramc.field_favLocalId);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d", new Object[] { Long.valueOf(paramc.field_favLocalId), Integer.valueOf(localg.field_id) });
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(8, paramc.field_favLocalId);
  }
  
  private static void b(g paramg, boolean paramBoolean)
  {
    wf localwf = new wf();
    if (!paramBoolean) {
      localwf.rBz = com.tencent.mm.model.q.GF();
    }
    localwf.rBA = com.tencent.mm.model.q.GF();
    paramg.field_favProto.fT(bi.VE());
    paramg.field_favProto.a(localwf);
  }
  
  public static void b(vx paramvx, int paramInt)
  {
    if (bi.oW(paramvx.jdM)) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, dataId %s", new Object[] { paramvx.jdM });
      c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM);
      localObject = localc;
      if (localc != null) {
        if (localc.field_status != 3)
        {
          localObject = localc;
          if (localc.field_status != 4) {}
        }
        else
        {
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(localc, new String[] { "dataId" });
          localObject = null;
        }
      }
      if ((localObject != null) && (((c)localObject).field_type == 1))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
        ((c)localObject).field_status = 1;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a((c)localObject, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(paramvx.jdM);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
        return;
      }
      localObject = new com.tencent.mm.vfs.b(b(paramvx));
    } while ((bi.oW(paramvx.rzq)) || (bi.oW(paramvx.rzo)) || (((com.tencent.mm.vfs.b)localObject).exists()));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
    long l = System.currentTimeMillis();
    Object localObject = new g();
    ((g)localObject).field_localId = -1L;
    ((g)localObject).field_id = -1;
    ((g)localObject).field_type = paramInt;
    a(paramvx, (g)localObject, 1, true);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(paramvx.jdM);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public static float bD(long paramLong)
  {
    float f2 = 60.0F;
    float f1 = 1.0F;
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F) {}
    for (;;)
    {
      if (f1 > 60.0F) {
        f1 = f2;
      }
      for (;;)
      {
        return Math.round(f1);
      }
      f1 = f3;
    }
  }
  
  public static void ba(List<Integer> paramList)
  {
    if (paramList.size() == 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "setDeleted list null");
      return;
    }
    Set localSet = aKN();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "setDeleted before del:%s", new Object[] { localSet.toString() });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "setDeleted id:%d, ret:%b", new Object[] { localInteger, Boolean.valueOf(localSet.remove(localInteger.toString())) });
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "setDeleted after del:%s", new Object[] { localSet.toString() });
    e(localSet);
  }
  
  public static boolean bb(List<g> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
      return false;
    }
    Set localSet = aKN();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      g localg = (g)paramList.next();
      h(localg);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().dA(localg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().z(localg);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dw(localg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().v(localg);
      localSet.add(localg.field_id);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Fav.FavApiLogic", "delete id %d", new Object[] { Integer.valueOf(localg.field_id) });
    }
    e(localSet);
    aKP();
    return true;
  }
  
  public static String bm(String paramString, int paramInt)
  {
    return com.tencent.mm.a.g.u((paramString + paramInt + System.currentTimeMillis()).getBytes());
  }
  
  public static vx c(g paramg)
  {
    if (paramg == null) {
      return new vx();
    }
    if (paramg.field_favProto.rBI.size() == 0) {
      return new vx();
    }
    return (vx)paramg.field_favProto.rBI.get(0);
  }
  
  public static String c(vx paramvx)
  {
    if ((paramvx == null) || (bi.oW(paramvx.jdM))) {
      return "";
    }
    paramvx = Ba(paramvx.jdM);
    return new com.tencent.mm.vfs.b(AZ(paramvx), paramvx).cBX().toString();
  }
  
  public static void c(String paramString, Context paramContext)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "share image to friend fail, imgPath is null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    com.tencent.mm.bg.d.e(paramContext, ".ui.transmit.MsgRetransmitUI", localIntent);
  }
  
  private static String cI(String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {
      return paramString2;
    }
    if (bi.oW(paramString2)) {
      return paramString1;
    }
    return paramString1 + "​" + paramString2;
  }
  
  /* Error */
  public static void d(g paramg)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull +14 -> 18
    //   7: aload_0
    //   8: getfield 174	com/tencent/mm/plugin/fav/a/g:field_type	I
    //   11: istore_1
    //   12: iload_1
    //   13: bipush 18
    //   15: if_icmpeq +7 -> 22
    //   18: ldc 2
    //   20: monitorexit
    //   21: return
    //   22: getstatic 18	com/tencent/mm/plugin/fav/a/b:iVq	Ljava/util/HashMap;
    //   25: aload_0
    //   26: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   29: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   32: invokevirtual 1494	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   35: ifeq -17 -> 18
    //   38: getstatic 18	com/tencent/mm/plugin/fav/a/b:iVq	Ljava/util/HashMap;
    //   41: aload_0
    //   42: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   45: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   48: invokevirtual 716	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: ifnull -33 -> 18
    //   54: getstatic 18	com/tencent/mm/plugin/fav/a/b:iVq	Ljava/util/HashMap;
    //   57: aload_0
    //   58: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   61: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   64: invokevirtual 716	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   67: checkcast 533	java/util/ArrayList
    //   70: invokevirtual 554	java/util/ArrayList:size	()I
    //   73: ifeq -55 -> 18
    //   76: aload_0
    //   77: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   80: invokestatic 1347	com/tencent/mm/plugin/fav/a/b:dj	(J)Ljava/lang/String;
    //   83: astore_2
    //   84: ldc -72
    //   86: ldc_w 1496
    //   89: iconst_2
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_0
    //   96: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   99: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   102: aastore
    //   103: dup
    //   104: iconst_1
    //   105: aload_2
    //   106: aastore
    //   107: invokestatic 776	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: new 1498	com/tencent/mm/g/a/nu
    //   113: dup
    //   114: invokespecial 1499	com/tencent/mm/g/a/nu:<init>	()V
    //   117: astore_3
    //   118: aload_3
    //   119: getfield 1503	com/tencent/mm/g/a/nu:bYN	Lcom/tencent/mm/g/a/nu$a;
    //   122: getstatic 18	com/tencent/mm/plugin/fav/a/b:iVq	Ljava/util/HashMap;
    //   125: aload_0
    //   126: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   129: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   132: invokevirtual 716	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   135: checkcast 533	java/util/ArrayList
    //   138: putfield 1509	com/tencent/mm/g/a/nu$a:bYO	Ljava/util/ArrayList;
    //   141: aload_3
    //   142: getfield 1503	com/tencent/mm/g/a/nu:bYN	Lcom/tencent/mm/g/a/nu$a;
    //   145: aload_2
    //   146: putfield 1512	com/tencent/mm/g/a/nu$a:bYP	Ljava/lang/String;
    //   149: getstatic 1518	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   152: aload_3
    //   153: invokevirtual 1522	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   156: pop
    //   157: getstatic 18	com/tencent/mm/plugin/fav/a/b:iVq	Ljava/util/HashMap;
    //   160: aload_0
    //   161: getfield 164	com/tencent/mm/plugin/fav/a/g:field_localId	J
    //   164: invokestatic 362	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   167: invokevirtual 724	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   170: pop
    //   171: goto -153 -> 18
    //   174: astore_0
    //   175: ldc 2
    //   177: monitorexit
    //   178: aload_0
    //   179: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	paramg	g
    //   11	5	1	i	int
    //   83	63	2	str	String
    //   117	36	3	localnu	com.tencent.mm.g.a.nu
    // Exception table:
    //   from	to	target	type
    //   7	12	174	finally
    //   22	171	174	finally
  }
  
  public static void d(vx paramvx)
  {
    c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(paramvx.jdM);
    if ((localc != null) && (localc.field_status != 3))
    {
      localc.field_status = 2;
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().pauseDownload(paramvx.jdM);
    }
    localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(Ba(paramvx.jdM));
    if ((localc != null) && (localc.field_status != 3))
    {
      localc.field_status = 2;
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().pauseDownload(Ba(paramvx.jdM));
    }
  }
  
  public static void d(String paramString, Context paramContext)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "share image to timeline fail, filePath is null");
      return;
    }
    Intent localIntent = new Intent();
    String str1 = "fav_" + com.tencent.mm.model.q.GF() + "_0";
    String str2 = com.tencent.mm.model.u.ic(str1);
    com.tencent.mm.model.u.Hx().v(str2, true).p("prePublishId", str1);
    localIntent.putExtra("reportSessionId", str2);
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", paramString);
    com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.SnsUploadUI", localIntent);
  }
  
  public static void dh(long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "setUsedCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRq, Long.valueOf(paramLong));
  }
  
  public static void di(long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "setTotalCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRr, Long.valueOf(paramLong));
  }
  
  private static String dj(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
    if ((localg == null) || (localg.field_favProto == null) || (localg.field_favProto.rBI.size() <= 1)) {
      return "";
    }
    wf localwf = localg.field_favProto.qYa;
    String str2 = "";
    String str1 = "";
    if (localwf != null)
    {
      str2 = localwf.rBA;
      str1 = localwf.rBz;
    }
    localStringBuilder.append("<noteinfo>");
    localStringBuilder.append("<noteauthor>").append(str1).append("</noteauthor>");
    localStringBuilder.append("<noteeditor>").append(str2).append("</noteeditor>");
    localStringBuilder.append("<edittime>").append(localg.field_favProto.qYb).append("</edittime>");
    localStringBuilder.append("<favlocalid>").append(localg.field_localId).append("</favlocalid>");
    localStringBuilder.append(com.tencent.mm.plugin.fav.a.a.a.bc(localg.field_favProto.rBI).replace("cdn_dataurl", "cdndataurl").replace("cdn_datakey", "cdndatakey").replace("cdn_thumburl", "cdnthumburl").replace("cdn_thumbkey", "cdnthumbkey").replace("thumbfullsize", "thumbsize").replace("fullsize", "datasize").replace("datasrcname", "sourcename").replace("datasrctime", "sourcetime").replace("stream_lowbandurl", "streamlowbandurl").replace("stream_dataurl", "streamdataurl").replace("stream_weburl", "streamweburl"));
    localStringBuilder.append("</noteinfo>");
    return localStringBuilder.toString();
  }
  
  public static void dk(long paramLong)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putLong("fav_mx_auto_download_size", paramLong).commit();
  }
  
  public static void dl(long paramLong)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putLong("fav_mx_auto_upload_size", paramLong).commit();
  }
  
  public static void dm(long paramLong)
  {
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putLong("fav_mx_file_size", paramLong).commit();
  }
  
  public static void dn(long paramLong)
  {
    iVr = paramLong;
  }
  
  public static float jdMethod_do(long paramLong)
  {
    float f1 = 1.0F;
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      return Math.round(f1);
      f1 = f2;
    }
  }
  
  public static String dp(long paramLong)
  {
    if (paramLong == 0L) {
      return "0KB";
    }
    if (paramLong * 1.0D / 1048576.0D >= 1.0D) {
      return String.format("%dMB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1048576.0D)) });
    }
    if (paramLong * 1.0D / 1024.0D >= 1.0D) {
      return String.format("%dKB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1024.0D)) });
    }
    return "1KB";
  }
  
  public static void e(String paramString, Context paramContext)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "shareTextToFriend content null");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_Msg_content", paramString);
    localIntent.putExtra("Retr_Msg_Type", 4);
    localIntent.putExtra("mutil_select_is_ret", true);
    com.tencent.mm.bg.d.e(paramContext, ".ui.transmit.MsgRetransmitUI", localIntent);
  }
  
  private static void e(Set<String> paramSet)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      localStringBuffer.append((String)paramSet.next()).append(",");
    }
    paramSet = "";
    if (localStringBuffer.length() > 0) {
      paramSet = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "set need del IDs: %s", new Object[] { paramSet });
    com.tencent.mm.kernel.g.Ei().DT().set(225282, paramSet);
  }
  
  private static boolean e(g paramg)
  {
    if (paramg == null) {
      return false;
    }
    paramg = paramg.field_favProto.rBI.iterator();
    vx localvx;
    do
    {
      if (!paramg.hasNext()) {
        break;
      }
      localvx = (vx)paramg.next();
    } while (((localvx.bjS != 8) && (localvx.bjS != 4) && (localvx.bjS != 2) && (localvx.bjS != 3)) || ((!bi.oW(localvx.rzo)) && (!bi.oW(localvx.rzq))));
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean e(vx paramvx)
  {
    avq localavq = com.tencent.mm.an.b.Qa();
    return (localavq != null) && (localavq.rYj == 6) && (bi.aG(paramvx.jdM, "").equals(localavq.rsp)) && (com.tencent.mm.an.b.PY());
  }
  
  public static boolean f(g paramg)
  {
    if (paramg.field_favProto == null) {
      return false;
    }
    paramg = paramg.field_favProto.rBI.iterator();
    while (paramg.hasNext())
    {
      vx localvx = (vx)paramg.next();
      if (localvx.rAw == 2) {
        return true;
      }
      if (localvx.rAw == 1) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean f(vx paramvx)
  {
    return new com.tencent.mm.vfs.b(b(paramvx)).exists();
  }
  
  public static void g(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    g localg = Bg(paramString1);
    if (localg == null) {
      return;
    }
    kp localkp = new kp();
    localkp.bUP.type = 2;
    localkp.bUP.field_localId = -1L;
    localkp.bUP.context = paramContext;
    localkp.bUP.bUW = 4;
    localkp.bUP.bUY = true;
    paramContext = new Bundle();
    paramContext.putString("noteauthor", localg.field_favProto.qYa.rBz);
    paramContext.putString("noteeditor", localg.field_favProto.qYa.rBA);
    paramContext.putLong("edittime", localg.field_favProto.qYb);
    paramContext.putString("notexml", g.s(localg));
    paramContext.putString("snslocalid", paramString2);
    paramContext.putString("snsthumbpath", paramString3);
    paramContext.putString("snsnotelinkxml", paramString1);
    localkp.bUP.bUU = paramContext;
    localkp.bUP.field_favProto = localg.field_favProto;
    com.tencent.mm.sdk.b.a.sFg.m(localkp);
  }
  
  public static boolean g(g paramg)
  {
    if (paramg == null) {}
    while ((paramg.field_itemStatus != 8) && (paramg.field_itemStatus != 10) && (paramg.field_itemStatus != 7)) {
      return false;
    }
    return true;
  }
  
  public static boolean g(vx paramvx)
  {
    return com.tencent.mm.sdk.platformtools.o.Wf(b(paramvx));
  }
  
  public static String gU(String paramString)
  {
    Object localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(paramString);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "wtf get contact null, username %s", new Object[] { paramString });
      localObject = "";
    }
    String str;
    do
    {
      return (String)localObject;
      str = ((ab)localObject).BL();
      localObject = str;
    } while (!s.fq(str));
    paramString = m.gI(paramString);
    localObject = com.tencent.mm.model.q.GF();
    if ((paramString == null) || (paramString.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "get members from username error, content empty");
      return str;
    }
    paramString.remove(localObject);
    paramString.add(0, localObject);
    return m.c(paramString, 3);
  }
  
  public static String getAppName(Context paramContext, String paramString)
  {
    ac.b localb = ac.a.dBp;
    if (localb != null) {
      return localb.q(paramContext, paramString);
    }
    return "";
  }
  
  private static void h(g paramg)
  {
    Set localSet = an.iXj;
    paramg = paramg.field_favProto.rBI;
    int i = 0;
    while (i < paramg.size())
    {
      String str = c((vx)paramg.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.vfs.d.deleteFile(str);
      }
      str = b((vx)paramg.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.vfs.d.deleteFile(str);
      }
      i += 1;
    }
  }
  
  public static boolean i(g paramg)
  {
    return a(paramg, true, null);
  }
  
  public static void j(g paramg)
  {
    j localj = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().dB(paramg.field_localId);
    if (localj == null)
    {
      localj = new j();
      localj.field_localId = paramg.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (paramg.field_favProto.title != null) {
        localStringBuffer.append(paramg.field_favProto.title);
      }
      if (paramg.field_favProto.desc != null) {
        localStringBuffer.append(paramg.field_favProto.desc);
      }
      Object localObject2;
      if (paramg.field_favProto.rBG != null)
      {
        localObject1 = paramg.field_favProto.rBG;
        if (!bi.oW(((wr)localObject1).bSS))
        {
          localStringBuffer.append(((wr)localObject1).bSS);
          localObject2 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(((wr)localObject1).bSS);
          if (localObject2 != null) {
            localStringBuffer.append(((ai)localObject2).field_nickname).append(((ai)localObject2).field_conRemark);
          }
          localObject2 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(((wr)localObject1).toUser);
          if (localObject2 != null) {
            localStringBuffer.append(((ai)localObject2).field_nickname).append(((ai)localObject2).field_conRemark);
          }
          localStringBuffer.append(((wr)localObject1).rBh);
        }
      }
      Object localObject1 = paramg.field_favProto.rBI;
      localj.field_subtype = 0;
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (vx)((Iterator)localObject1).next();
        if (((vx)localObject2).desc != null) {
          localStringBuffer.append(((vx)localObject2).desc);
        }
        if (((vx)localObject2).title != null) {
          localStringBuffer.append(((vx)localObject2).title);
        }
        int j = ((vx)localObject2).bjS;
        int k = localj.field_subtype;
        localj.field_subtype = (j.pJ(j) | k);
      }
      if (paramg.field_favProto.rAN != null)
      {
        if (paramg.field_favProto.rAN.desc != null) {
          localStringBuffer.append(paramg.field_favProto.rAN.desc);
        }
        if (paramg.field_favProto.rAN.title != null) {
          localStringBuffer.append(paramg.field_favProto.rAN.title);
        }
      }
      if (paramg.field_favProto.rAP != null)
      {
        if (paramg.field_favProto.rAP.desc != null) {
          localStringBuffer.append(paramg.field_favProto.rAP.desc);
        }
        if (paramg.field_favProto.rAP.title != null) {
          localStringBuffer.append(paramg.field_favProto.rAP.title);
        }
      }
      localj.field_tagContent = "";
      localObject1 = paramg.field_tagProto.rBW.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
      }
      localObject1 = paramg.field_tagProto.rBX.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localj.field_tagContent = (localj.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().Bm((String)localObject2);
      }
      localj.field_content = localStringBuffer.toString();
      localj.field_time = paramg.field_updateTime;
      localj.field_type = paramg.field_type;
      if (i != 0)
      {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().a(localj);
        return;
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().a(localj, new String[] { "localId" });
      return;
    }
  }
  
  public static boolean k(g paramg)
  {
    return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramg.field_localId) != null;
  }
  
  public static void l(g paramg)
  {
    if (!paramg.aLg())
    {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.Fav.FavApiLogic", "restartItemUpload status not upload failed!");
      return;
    }
    Iterator localIterator;
    c localc;
    switch (paramg.field_itemStatus)
    {
    default: 
      return;
    case 3: 
      paramg.field_itemStatus = 1;
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getCheckCdnService().run();
      return;
    case 6: 
      if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dt(paramg.field_localId).size() == 0)
      {
        paramg.field_itemStatus = 9;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
        paramg = new af(paramg);
        com.tencent.mm.kernel.g.DF().a(paramg, 0);
        return;
      }
      paramg.field_itemStatus = 4;
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().x(paramg);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      localIterator = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dt(paramg.field_localId).iterator();
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), localc.field_dataId, Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(localc.field_dataId);
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
      return;
    case 14: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(12, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
      return;
    case 16: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(15, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().x(paramg);
      localIterator = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().dt(paramg.field_localId).iterator();
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), localc.field_dataId, Integer.valueOf(localc.field_dataType), Integer.valueOf(localc.field_totalLen) });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bp(localc.field_dataId);
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
      return;
    case 18: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(17, paramg.field_localId);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getModService().run();
      return;
    }
    paramg.field_itemStatus = 9;
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
  }
  
  public static void m(g paramg)
  {
    if (paramg == null) {}
    for (;;)
    {
      return;
      if ((paramg.field_itemStatus != 8) && (paramg.field_itemStatus != 10)) {
        break;
      }
      paramg.field_itemStatus = 7;
      Object localObject = paramg.field_favProto.rBI;
      if (((List)localObject).size() != 0)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          vx localvx = (vx)((Iterator)localObject).next();
          a(paramg, localvx, true);
          a(paramg, localvx);
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "status not download failed or done!");
  }
  
  public static void n(g paramg)
  {
    if (!paramg.aLf())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, not uploading");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, itemStatu:%d", new Object[] { Integer.valueOf(paramg.field_itemStatus) });
    Iterator localIterator = paramg.field_favProto.rBI.iterator();
    while (localIterator.hasNext())
    {
      vx localvx = (vx)localIterator.next();
      c localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(localvx.jdM);
      if ((localc != null) && (localc.field_status != 3))
      {
        localc.field_status = 2;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bq(localvx.jdM);
      }
      localc = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().Br(Ba(localvx.jdM));
      if ((localc != null) && (localc.field_status != 3))
      {
        localc.field_status = 2;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(localc, new String[] { "dataId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().Bq(Ba(localvx.jdM));
      }
    }
    paramg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramg.field_localId);
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, after pause data itemStatu:%d", new Object[] { Integer.valueOf(paramg.field_itemStatus) });
    switch (paramg.field_itemStatus)
    {
    default: 
      return;
    case 1: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(3, paramg.field_localId);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(3) });
      return;
    case 4: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(6, paramg.field_localId);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(6) });
      return;
    case 9: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(11, paramg.field_localId);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(11) });
      return;
    case 12: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(14, paramg.field_localId);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(14) });
      return;
    case 15: 
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(16, paramg.field_localId);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(16) });
      return;
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(18, paramg.field_localId);
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(18) });
  }
  
  public static long o(long paramLong, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "tryStartBatchGet...");
    long l1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().u(paramLong, paramInt);
    long l2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().s(paramLong, paramInt);
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
    if (l1 == 0L) {
      return l2;
    }
    Object localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(l1, paramInt);
    if (((LinkedList)localObject).size() > 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, need batch get idList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) });
      localObject = new ah((LinkedList)localObject);
      if (!com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject, 0))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Fav.FavApiLogic", "do scene BatchGetFav fail");
        ah.aLM();
      }
    }
    if (l2 == 0L) {
      return l1;
    }
    if (l1 < l2) {
      return l1;
    }
    return l2;
  }
  
  public static boolean o(g paramg)
  {
    if (paramg == null) {}
    vx localvx;
    do
    {
      return false;
      localvx = c(paramg);
    } while (localvx == null);
    long l = bi.VG();
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.Lo(b(localvx));
    int j;
    int i;
    boolean bool;
    if (locala != null)
    {
      j = locala.bvB();
      i = localvx.duration;
      if ((i <= 0) || (Math.abs(i - j) >= 2))
      {
        localvx.CE(j);
        bool = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Fav.FavApiLogic", "repair video duration[%d TO %d] %b cost time %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Long.valueOf(bi.bI(l)) });
      return bool;
      bool = false;
      continue;
      bool = false;
      i = 0;
      j = 0;
    }
  }
  
  public static void p(g paramg)
  {
    j localj = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().dB(paramg.field_localId);
    if (localj == null)
    {
      localj = new j();
      localj.field_localId = paramg.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      localj.field_tagContent = "";
      Iterator localIterator = paramg.field_tagProto.rBW.iterator();
      String str;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localj.field_tagContent = (localj.field_tagContent + " " + str);
      }
      localIterator = paramg.field_tagProto.rBX.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localj.field_tagContent = (localj.field_tagContent + " " + str);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().Bm(str);
      }
      localj.field_content = "";
      localj.field_time = paramg.field_updateTime;
      localj.field_type = paramg.field_type;
      if (i != 0)
      {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().a(localj);
        return;
      }
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavSearchStorage().a(localj, new String[] { "localId" });
      return;
    }
  }
  
  public static boolean pG(int paramInt)
  {
    boolean bool2 = false;
    int[] arrayOfInt = a.iVo;
    int j = arrayOfInt.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (arrayOfInt[i] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static void q(g paramg)
  {
    if (paramg == null) {}
    wf localwf;
    do
    {
      return;
      localwf = paramg.field_favProto.qYa;
    } while (((localwf != null) && (!bi.oW(localwf.rBA))) || (paramg.field_type != 18));
    if (paramg.field_favProto.rBG.bJt == 6) {
      b(paramg, false);
    }
    for (;;)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      return;
      b(paramg, true);
    }
  }
  
  public static final String r(g paramg)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    long l;
    label132:
    Object localObject;
    switch (paramg.field_type)
    {
    case -2: 
    case -1: 
    case 0: 
    case 6: 
    case 7: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 15: 
    case 17: 
    default: 
      return localStringBuffer.toString();
    case 2: 
    case 8: 
      paramg = paramg.field_favProto.rBI.iterator();
      l = 0L;
      if (paramg.hasNext())
      {
        localObject = (vx)paramg.next();
        if (localObject == null) {
          break label435;
        }
        l = ((vx)localObject).rzJ + l;
      }
      break;
    }
    label432:
    label435:
    for (;;)
    {
      break label132;
      localStringBuffer.append(l);
      break;
      if (bi.oW(paramg.field_favProto.desc)) {
        break;
      }
      localStringBuffer.append(paramg.field_favProto.desc.getBytes().length);
      break;
      localStringBuffer.append(c(paramg).duration);
      break;
      localObject = "";
      try
      {
        paramg = paramg.field_favProto.rAN.rCn;
        localStringBuffer.append(paramg);
        break;
        if (paramg == null) {
          break;
        }
        paramg = paramg.field_favProto.rBI.iterator();
        int m = 0;
        int k = 0;
        int i = 0;
        int j = 0;
        while (paramg.hasNext())
        {
          localObject = (vx)paramg.next();
          switch (((vx)localObject).bjS)
          {
          case 3: 
          default: 
            i += 1;
            break;
          case 1: 
            if (bi.oW(((vx)localObject).desc)) {
              break label432;
            }
            k = ((vx)localObject).desc.getBytes().length + k;
            break;
          case 2: 
            m += 1;
            break;
          case 4: 
            j += 1;
          }
        }
        return String.format("%d:%d:%d:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i) });
      }
      catch (Exception paramg)
      {
        for (;;)
        {
          paramg = (g)localObject;
        }
      }
    }
  }
  
  public static void startSync()
  {
    aj localaj = new aj();
    com.tencent.mm.kernel.g.DF().a(localaj, 0);
  }
  
  public static void w(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 1);
      com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.SnsUploadUI", paramIntent);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */