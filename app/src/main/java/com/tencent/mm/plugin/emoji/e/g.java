package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.mm.R.g;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.f;
import com.tencent.mm.g.a.bc;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI;
import com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.protocal.c.bnv;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.emotion.t;
import com.tencent.mm.storage.emotion.u;
import com.tencent.mm.storage.emotion.v;
import com.tencent.mm.y.g.a;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class g
  implements com.tencent.mm.pluginsdk.a.d
{
  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5)
  {
    if (paramString1.equals("-1"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      return;
    }
    EmojiInfo localEmojiInfo = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(paramString1);
    if (localEmojiInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      return;
    }
    Intent localIntent = new Intent(paramContext, CustomSmileyPreviewUI.class);
    localIntent.putExtra("custom_smiley_preview_md5", paramString1);
    if (paramString2 != null) {
      localIntent.putExtra("custom_smiley_preview_appid", paramString2);
    }
    for (;;)
    {
      localIntent.putExtra("custom_smiley_preview_appname", paramString3);
      localIntent.putExtra("msg_id", paramLong);
      localIntent.putExtra("msg_content", paramString5);
      paramString1 = paramString4;
      if (com.tencent.mm.model.s.fq(paramString4)) {
        paramString1 = com.tencent.mm.model.bd.iB(paramString5);
      }
      localIntent.putExtra("msg_sender", paramString1);
      paramContext.startActivity(localIntent);
      return;
      localIntent.putExtra("custom_smiley_preview_appid", localEmojiInfo.field_app_id);
    }
  }
  
  private static void c(g.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aED();
    if (parama == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "msg content is null");
      return;
    }
    String str = parama.dwq;
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "md5 is null.");
      return;
    }
    EmojiInfo localEmojiInfo = new EmojiInfo();
    localEmojiInfo.field_md5 = str;
    localEmojiInfo.field_app_id = parama.appId;
    localEmojiInfo.field_catalog = EmojiInfo.tcB;
    localEmojiInfo.field_size = parama.dwo;
    localEmojiInfo.field_temp = 1;
    localEmojiInfo.field_state = EmojiInfo.tcR;
    com.tencent.mm.plugin.emoji.model.i.aEA().igx.o(localEmojiInfo);
    parama = new LinkedList();
    parama.add(str);
    parama = new com.tencent.mm.plugin.emoji.f.e(parama);
    au.DF().a(parama, 0);
    com.tencent.mm.plugin.emoji.model.c.bi(str, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "start change cdn url. md5:%s", new Object[] { str });
  }
  
  public final String Gq()
  {
    return com.tencent.mm.kernel.g.Ei().dqp;
  }
  
  public final String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    return EmojiLogic.b(paramContext, paramWXMediaMessage, paramString);
  }
  
  public final void a(Context paramContext, com.tencent.mm.storage.bd parambd)
  {
    if ((paramContext == null) || (parambd == null))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
      return;
    }
    an localan = an.YJ(parambd.field_content);
    Object localObject2 = g.a.gp(parambd.field_content);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new g.a();
      ((g.a)localObject1).dwq = localan.bKg;
    }
    localObject2 = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(((g.a)localObject1).dwq);
    if (parambd.field_isSend == 1)
    {
      if ((localObject2 != null) && (((EmojiInfo)localObject2).cnv()))
      {
        a(paramContext, ((g.a)localObject1).dwq, ((g.a)localObject1).appId, ((g.a)localObject1).appName, parambd.field_msgSvrId, parambd.field_talker, parambd.field_content);
        return;
      }
      l = parambd.field_msgId;
      c((g.a)localObject1);
      return;
    }
    if ((localObject2 != null) && (((EmojiInfo)localObject2).cnv()))
    {
      a(paramContext, ((EmojiInfo)localObject2).Xh(), ((g.a)localObject1).appId, ((g.a)localObject1).appName, parambd.field_msgSvrId, parambd.field_talker, parambd.field_content);
      return;
    }
    long l = parambd.field_msgId;
    c((g.a)localObject1);
  }
  
  public final void a(bnv parambnv)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igA.b(parambnv);
  }
  
  public final void a(String paramString, EmojiInfo paramEmojiInfo, com.tencent.mm.storage.bd parambd)
  {
    if ((paramEmojiInfo == null) && (parambd == null)) {
      return;
    }
    EmojiInfo localEmojiInfo = paramEmojiInfo;
    if (paramEmojiInfo == null) {
      localEmojiInfo = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(parambd.field_imgPath);
    }
    com.tencent.mm.plugin.emoji.model.i.aEu().a(paramString, localEmojiInfo, parambd);
  }
  
  public final boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString)
  {
    if (paramContext == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. context is null");
      return false;
    }
    if (paramEmojiInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. emoji is null");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiAddCustomDialogUI.class);
    localIntent.putExtra("extra_id", paramEmojiInfo.Xh());
    localIntent.putExtra("extra_scence", paramInt);
    localIntent.addFlags(65536);
    localIntent.putExtra("extra_username", paramString);
    paramContext.startActivity(localIntent);
    return true;
  }
  
  public final boolean a(EmojiGroupInfo paramEmojiGroupInfo)
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igy.c(paramEmojiGroupInfo, new String[] { "productID" });
  }
  
  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, d.a parama)
  {
    boolean bool = false;
    com.tencent.mm.plugin.emoji.model.d locald = com.tencent.mm.plugin.emoji.model.i.aEu();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml " + paramString2);
    paramString1 = ap.a(bl.z(paramString2, "msg"), paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiService", "prepareEmoji failed. emoji msg info is null.");
      return true;
    }
    paramString1.bYu = paramLong;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiService", "summerbadcr prepareEmoji msgSvrId[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bi.cjd() });
    locald.zD(paramString1.bKk);
    if (!EmojiLogic.zC(n.aEk())) {
      bool = true;
    }
    locald.a(paramString1, parama, bool);
    return true;
  }
  
  public final byte[] a(EmojiInfo paramEmojiInfo)
  {
    return e.aDM().a(paramEmojiInfo);
  }
  
  public final boolean aDP()
  {
    return n.aEi();
  }
  
  public final ArrayList<q> aDQ()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igF.aDQ();
  }
  
  public final ArrayList<String> aDR()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igF.aDR();
  }
  
  public final ArrayList<com.tencent.mm.storage.emotion.s> aDS()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igG.aDS();
  }
  
  public final f aDT()
  {
    return i.aEd().aDT();
  }
  
  public final bnv aDU()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igA.aDU();
  }
  
  public final int aDV()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igx.ln(true);
  }
  
  public final ArrayList<EmojiGroupInfo> aDW()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().aDW();
  }
  
  public final int aDX()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().aDX();
  }
  
  public final ArrayList<EmojiInfo> aDY()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().aDY();
  }
  
  public final com.tencent.mm.ak.a.a aDZ()
  {
    return com.tencent.mm.plugin.emoji.model.i.aDZ();
  }
  
  public final boolean aEa()
  {
    return n.aEn();
  }
  
  public final List<u> aEb()
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igI.aEb();
  }
  
  public final void aEc()
  {
    v localv = com.tencent.mm.plugin.emoji.model.i.aEA().igI;
    Object localObject = localv.aEb();
    JSONArray localJSONArray = new JSONArray();
    localObject = ((List)localObject).iterator();
    do
    {
      u localu;
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localu = (u)((Iterator)localObject).next();
      } while (localu.bpY() == null);
      localJSONArray.put(localu.bpY());
    } while (localJSONArray.length() < 9);
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.tae, localJSONArray.toString());
    localv.tdh = null;
  }
  
  public final void bg(String paramString, int paramInt)
  {
    v localv = com.tencent.mm.plugin.emoji.model.i.aEA().igI;
    if (!Util.oW(paramString))
    {
      if (localv.tdh == null) {
        localv.cnP();
      }
      u localu2 = (u)localv.tdh.get(paramString);
      u localu1 = localu2;
      if (localu2 == null)
      {
        localu1 = new u();
        localu1.aAL = paramString;
        localv.tdh.put(paramString, localu1);
      }
      localu1.position = paramInt;
      localu1.tdg += 1;
      localu1.dDj = System.currentTimeMillis();
      if (localv.tdh == null) {
        localv.cnP();
      }
      localv.b("event_update_recent", 0, Integer.valueOf(localv.tdh.size()));
    }
  }
  
  public final EmojiInfo c(EmojiInfo paramEmojiInfo)
  {
    Object localObject = paramEmojiInfo;
    if (paramEmojiInfo.field_catalog == EmojiGroupInfo.tcz)
    {
      localObject = paramEmojiInfo;
      if (paramEmojiInfo.field_type == EmojiInfo.tcI)
      {
        localObject = paramEmojiInfo;
        if (paramEmojiInfo.getContent().length() > 0)
        {
          localObject = paramEmojiInfo;
          if (EmojiInfo.Dr(bi.getInt(paramEmojiInfo.getContent(), 0)))
          {
            Cursor localCursor = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Du(bi.getInt(paramEmojiInfo.getContent(), 0));
            EmojiInfo localEmojiInfo = paramEmojiInfo;
            if (localCursor != null)
            {
              localEmojiInfo = paramEmojiInfo;
              if (localCursor.getCount() > 1)
              {
                int i = bi.eF(localCursor.getCount() - 1, 0);
                localEmojiInfo = new EmojiInfo();
                localCursor.moveToPosition(i);
                localEmojiInfo.d(localCursor);
              }
            }
            localObject = localEmojiInfo;
            if (localCursor != null)
            {
              localCursor.close();
              localObject = localEmojiInfo;
            }
          }
        }
      }
    }
    return (EmojiInfo)localObject;
  }
  
  public final ap cu(String paramString1, String paramString2)
  {
    Map localMap = bl.z(paramString1, "msg");
    if (localMap == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "get from xml, but attrs is null");
      return null;
    }
    paramString2 = ap.a(localMap, paramString2, paramString1, "");
    if (paramString2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "parserEmojiXml error " + paramString1);
      return null;
    }
    return paramString2;
  }
  
  public final String cv(String paramString1, String paramString2)
  {
    au.HU();
    return EmojiLogic.L(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
  }
  
  public final void d(EmojiInfo paramEmojiInfo)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igx.p(paramEmojiInfo);
  }
  
  public final int e(EmojiInfo paramEmojiInfo)
  {
    if (paramEmojiInfo != null)
    {
      if ((paramEmojiInfo.field_catalog == EmojiInfo.tcF) || (String.valueOf(EmojiInfo.tcF).equals(paramEmojiInfo.field_groupId))) {
        return R.g.jsb;
      }
      if ((paramEmojiInfo.field_catalog == EmojiInfo.tcG) || (String.valueOf(EmojiInfo.tcG).equals(paramEmojiInfo.field_groupId))) {
        return R.g.dice;
      }
    }
    return 0;
  }
  
  public final int[] f(EmojiInfo paramEmojiInfo)
  {
    if (paramEmojiInfo != null)
    {
      if (paramEmojiInfo.field_catalog == EmojiInfo.tcF) {
        return new int[] { R.g.jsb_j, R.g.jsb_s, R.g.jsb_b };
      }
      if (paramEmojiInfo.field_catalog == EmojiInfo.tcG) {
        return new int[] { R.g.dice_action_0, R.g.dice_action_1, R.g.dice_action_2, R.g.dice_action_3 };
      }
    }
    return null;
  }
  
  public final void g(j.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igx.d(parama);
  }
  
  public final void h(j.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igx.c(parama);
  }
  
  public final void i(j.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igy.d(parama);
  }
  
  public final void j(j.a parama)
  {
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES()) {
      com.tencent.mm.plugin.emoji.model.i.aEA().igy.c(parama);
    }
  }
  
  public final void k(j.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igI.c(parama);
  }
  
  public final void l(j.a parama)
  {
    com.tencent.mm.plugin.emoji.model.i.aEA().igI.d(parama);
  }
  
  public final boolean o(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
      return false;
    }
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: userName or imgPath is null");
      return false;
    }
    EmojiInfo localEmojiInfo = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(paramString2);
    if (localEmojiInfo == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: emoji not found, imgPath %s", new Object[] { paramString2 });
      return false;
    }
    int i;
    if ((localEmojiInfo.field_type == EmojiInfo.tcL) || (localEmojiInfo.field_type == EmojiInfo.tcM))
    {
      paramString2 = new WXMediaMessage();
      Object localObject = new StringBuilder();
      au.HU();
      localObject = com.tencent.mm.model.c.Gg() + localEmojiInfo.Xh();
      if (com.tencent.mm.a.e.cn((String)localObject + "_thumb"))
      {
        i = com.tencent.mm.a.e.cm((String)localObject + "_thumb");
        paramString2.thumbData = com.tencent.mm.a.e.e((String)localObject + "_thumb", 0, i);
      }
      for (;;)
      {
        paramString2.mediaObject = new WXEmojiObject((String)localObject);
        com.tencent.mm.pluginsdk.model.app.l.a(paramString2, localEmojiInfo.field_app_id, null, paramString1, 0, localEmojiInfo.Xh());
        return true;
        paramString2.setThumbImage(localEmojiInfo.gi(paramContext));
      }
    }
    if (localEmojiInfo.field_type == EmojiInfo.tcI) {
      if (EmojiInfo.Dr(localEmojiInfo.field_catalog)) {
        paramContext = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Du(localEmojiInfo.field_catalog);
      }
    }
    for (;;)
    {
      label304:
      if (paramContext != null)
      {
        i = bi.eF(paramContext.getCount() - 1, 0);
        paramString2 = new EmojiInfo();
        paramContext.moveToPosition(i);
        paramString2.d(paramContext);
        paramContext.close();
      }
      for (paramContext = paramString2;; paramContext = localEmojiInfo)
      {
        com.tencent.mm.plugin.emoji.model.i.aEu().a(paramString1, paramContext, null);
        break;
        if ((localEmojiInfo.field_catalog != EmojiInfo.tcD) || (localEmojiInfo.getContent().length() <= 0) || (!EmojiInfo.Dr(bi.getInt(localEmojiInfo.getContent(), 0)))) {
          break label429;
        }
        paramContext = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Du(bi.getInt(localEmojiInfo.getContent(), 0));
        break label304;
      }
      label429:
      paramContext = null;
    }
  }
  
  public final void onDestroy() {}
  
  public final boolean p(ArrayList<q> paramArrayList)
  {
    r localr = com.tencent.mm.plugin.emoji.model.i.aEA().igF;
    if (paramArrayList.size() <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
      return false;
    }
    com.tencent.mm.bt.h localh;
    long l;
    if ((localr.diF instanceof com.tencent.mm.bt.h))
    {
      localh = (com.tencent.mm.bt.h)localr.diF;
      l = localh.dO(Thread.currentThread().getId());
    }
    for (;;)
    {
      localr.diF.delete("SmileyInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localr.b((q)paramArrayList.next());
      }
      int i = -1;
      if (localh != null) {
        i = localh.gp(l);
      }
      if (i < 0) {
        break;
      }
      return true;
      l = -1L;
      localh = null;
    }
  }
  
  public final boolean q(ArrayList<com.tencent.mm.storage.emotion.s> paramArrayList)
  {
    t localt = com.tencent.mm.plugin.emoji.model.i.aEA().igG;
    if (paramArrayList.size() <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "insertSmileyConfigInfoList failed. list is null.");
      return false;
    }
    com.tencent.mm.bt.h localh;
    long l;
    if ((localt.diF instanceof com.tencent.mm.bt.h))
    {
      localh = (com.tencent.mm.bt.h)localt.diF;
      l = localh.dO(Thread.currentThread().getId());
    }
    for (;;)
    {
      localt.diF.delete("SmileyPanelConfigInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localt.b((com.tencent.mm.storage.emotion.s)paramArrayList.next());
      }
      int i = -1;
      if (localh != null) {
        i = localh.gp(l);
      }
      if (i < 0) {
        break;
      }
      return true;
      l = -1L;
      localh = null;
    }
  }
  
  public final String zf(String paramString)
  {
    return com.tencent.mm.plugin.emoji.model.i.aEv().zf(paramString);
  }
  
  public final EmojiInfo zi(String paramString)
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(paramString);
  }
  
  public final String zj(String paramString)
  {
    return EmojiLogic.zj(paramString);
  }
  
  public final List<EmojiInfo> zk(String paramString)
  {
    au.HU();
    if (com.tencent.mm.model.c.isSDCardAvailable()) {
      return (ArrayList)com.tencent.mm.plugin.emoji.model.i.aEA().igx.zk(paramString);
    }
    return new ArrayList();
  }
  
  public final boolean zl(String paramString)
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igy.Zt(paramString);
  }
  
  public final ArrayList<String> zm(String paramString)
  {
    a locala = com.tencent.mm.plugin.emoji.model.i.aEv();
    if (!locala.mInit) {
      locala.aDI();
    }
    long l = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = com.tencent.mm.ui.tools.g.abd(paramString);
    if ((i < locala.ieL) || (i > locala.ieM))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiDescNewMgr", "input text over checkout limit.");
      return null;
    }
    if ((!bi.oW(paramString)) && (locala.ieQ != null))
    {
      paramString = paramString.toLowerCase();
      Object localObject = new ArrayList();
      if (locala.ieP.containsKey(paramString)) {
        ((ArrayList)localObject).addAll((Collection)locala.ieO.get(locala.ieP.get(paramString)));
      }
      for (;;)
      {
        paramString = ((ArrayList)localObject).iterator();
        while (paramString.hasNext())
        {
          localObject = (String)paramString.next();
          localObject = (ArrayList)locala.ieQ.get(localObject);
          if ((localObject != null) && (!((ArrayList)localObject).isEmpty())) {
            localArrayList1.addAll((Collection)localObject);
          }
        }
        ((ArrayList)localObject).add(paramString);
      }
    }
    if (!localArrayList1.isEmpty())
    {
      Collections.sort(localArrayList1, locala.ieR);
      i = 0;
      while (i < localArrayList1.size())
      {
        localArrayList2.add(((a.a)localArrayList1.get(i)).bKg);
        i += 1;
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.emoji.EmojiDescNewMgr", "cpan[check desc]User time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localArrayList2;
  }
  
  public final String zn(String paramString)
  {
    return EmojiLogic.zn(paramString);
  }
  
  public final String zo(String paramString)
  {
    return EmojiLogic.zo(paramString);
  }
  
  public final int zp(String paramString)
  {
    return EmojiLogic.zp(paramString);
  }
  
  public final String zq(String paramString)
  {
    return EmojiLogic.zq(paramString);
  }
  
  public final void zr(String paramString)
  {
    if (bi.oW(paramString)) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "emoji command is null.");
    }
    if ("sync".equalsIgnoreCase(paramString))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOT, Boolean.valueOf(true));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOY, Boolean.valueOf(true));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sPb, Long.valueOf(0L));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOS, Long.valueOf(0L));
      au.DF().a(new com.tencent.mm.plugin.emoji.f.e(), 0);
      paramString = new com.tencent.mm.plugin.emoji.f.n(8, null, 15, true);
      au.DF().a(paramString, 0);
    }
    label528:
    do
    {
      return;
      if ("rcheart".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.plugin.emoji.model.i.aEA().igy.cnu();
        return;
      }
      if ("recover".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "recover   begin");
        com.tencent.mm.plugin.emoji.model.i.aEA().igx.gg(ad.getContext());
        com.tencent.mm.plugin.emoji.model.i.aEA().igy.gg(ad.getContext());
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "recover   end");
        return;
      }
      if ("clean".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "begin clean");
        paramString = d.aDL();
        au.HU();
        paramString.zh(com.tencent.mm.model.c.Gg());
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sOY, Boolean.valueOf(true));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "end clean");
        return;
      }
      if ("dump".equalsIgnoreCase(paramString))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "begin dump emoji db info:");
        paramString = (ArrayList)com.tencent.mm.plugin.emoji.model.i.aEA().igy.cng();
        if (paramString.size() > 0)
        {
          int j = paramString.size();
          int i = 0;
          while (i < j)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "i:%d group info:%s", new Object[] { Integer.valueOf(i), ((EmojiGroupInfo)paramString.get(i)).toString() });
            i += 1;
          }
        }
        Object localObject = null;
        paramString = null;
        try
        {
          localCursor = com.tencent.mm.plugin.emoji.model.i.aEA().igx.axc();
          if (localCursor != null)
          {
            paramString = localCursor;
            localObject = localCursor;
            if (localCursor.moveToFirst())
            {
              boolean bool;
              do
              {
                paramString = localCursor;
                localObject = localCursor;
                EmojiInfo localEmojiInfo = new EmojiInfo();
                paramString = localCursor;
                localObject = localCursor;
                localEmojiInfo.d(localCursor);
                paramString = localCursor;
                localObject = localCursor;
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "emoji info:%s", new Object[] { localEmojiInfo.toString() });
                paramString = localCursor;
                localObject = localCursor;
                bool = localCursor.moveToNext();
              } while (bool);
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Cursor localCursor;
            if (paramString != null) {
              paramString.close();
            }
          }
        }
        finally
        {
          if (localException == null) {
            break label528;
          }
          localException.close();
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.emoji.EmojiCommandMgr", "end dump emoji db info:");
        return;
      }
      if ("config".equalsIgnoreCase(paramString))
      {
        b.c.ccr().e(37, 1, -1, false);
        b.c.ccr().e(37, 2, -1, false);
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPi, Integer.valueOf(0));
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPj, Integer.valueOf(0));
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPl, Integer.valueOf(0));
        paramString = new m(37);
        au.DF().a(paramString, 0);
        paramString = new bc();
        paramString.bIB.filePath = (com.tencent.mm.compatible.util.e.bnE + "CheckResUpdate/37.1.data.decompressed");
        paramString.bIB.bIC = 37;
        paramString.bIB.bID = 1;
        bc localbc = new bc();
        localbc.bIB.filePath = (com.tencent.mm.compatible.util.e.bnE + "CheckResUpdate/37.2.data.decompressed");
        localbc.bIB.bIC = 37;
        localbc.bIB.bID = 2;
        i.aEd();
        i.a(paramString, true);
        i.aEd();
        i.b(localbc, true);
        return;
      }
    } while (!"tuzki".equalsIgnoreCase(paramString));
    com.tencent.mm.plugin.emoji.f.a.aEF();
    com.tencent.mm.plugin.emoji.f.a.aEG();
  }
  
  public final int zs(String paramString)
  {
    return com.tencent.mm.plugin.emoji.model.i.aEA().igx.zs(paramString);
  }
  
  public final ArrayList<EmojiInfo> zt(String paramString)
  {
    l locall = com.tencent.mm.plugin.emoji.model.i.aEA();
    if (l.igO == null) {
      l.igO = new HashMap();
    }
    if (l.igL)
    {
      l.igO.clear();
      l.igL = false;
    }
    if (!l.igO.containsKey(paramString))
    {
      au.HU();
      if (com.tencent.mm.model.c.isSDCardAvailable()) {
        l.igO.put(paramString, (ArrayList)locall.igx.zk(paramString));
      }
    }
    return (ArrayList)l.igO.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */