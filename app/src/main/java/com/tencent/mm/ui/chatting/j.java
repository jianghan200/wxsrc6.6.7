package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.aa.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.mw.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.m;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class j
{
  public static void a(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd)
  {
    if (!a(paramContext, paramString, parambd, "emoji")) {
      return;
    }
    String str = an.YJ(parambd.field_content).bKg;
    if ((str == null) || (str.endsWith("-1"))) {}
    for (parambd = parambd.field_imgPath;; parambd = str)
    {
      if (parambd == null)
      {
        x.w("MicroMsg.ChattingEditModeLogic", "showAcceptEmojiConnector: filePath is null");
        return;
      }
      ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().o(paramContext, paramString, parambd);
      return;
    }
  }
  
  public static void a(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, parambd, "text")) {
      return;
    }
    String str = p(parambd.field_content, parambd.field_isSend, paramBoolean);
    paramContext = str;
    if (parambd.cmy())
    {
      paramContext = p(parambd.field_transContent, parambd.field_isSend, paramBoolean);
      paramContext = str + "\n\n" + paramContext;
    }
    if ((paramContext == null) || (paramContext.equals("")))
    {
      x.e("MicroMsg.ChattingEditModeLogic", "Transfer text erro: content null");
      return;
    }
    com.tencent.mm.plugin.messenger.a.g.bcT().D(paramString, paramContext, com.tencent.mm.model.s.hQ(paramString));
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    try
    {
      com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
      localbd.setContent(paramString2);
      localbd.eX(paramInt);
      paramInt = paramString2.indexOf("<msg>");
      String str = paramString2;
      if (paramInt > 0)
      {
        str = paramString2;
        if (paramInt < paramString2.length()) {
          str = paramString2.substring(paramInt).trim();
        }
      }
      paramString2 = bl.z(str, "msg");
      if ((paramString2 != null) && (paramString2.size() > 0)) {
        localbd.er(ay.au(paramString2));
      }
      b(paramContext, paramString1, localbd, paramBoolean);
      return;
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
      x.e("MicroMsg.ChattingEditModeLogic", "retransmit sigle app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
    }
  }
  
  static boolean a(Context paramContext, String paramString1, com.tencent.mm.storage.bd parambd, String paramString2)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "send %s fail, context is null", new Object[] { paramString2 });
      return false;
    }
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.ChattingEditModeLogic", "send %s fail, username is null", new Object[] { paramString2 });
      return false;
    }
    if (parambd == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "send %s fail, msg is null", new Object[] { paramString2 });
      return false;
    }
    return true;
  }
  
  public static boolean a(List<com.tencent.mm.storage.bd> paramList, ah paramah)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to friend msg error, select item empty");
      bool2 = false;
    }
    do
    {
      return bool2;
      if ((paramList.size() != 1) || (paramah == null) || (!paramah.cuh())) {
        break;
      }
      paramList = (com.tencent.mm.storage.bd)paramList.get(0);
    } while ((!aA(paramList)) && (!paramList.ckz()) && (!ap(paramList)) && (!ar(paramList)) && (!as(paramList)) && (paramList.getType() != -1879048186) && (paramList.getType() != 318767153) && (!az(paramList)) && (!at(paramList)) && (!aB(paramList)) && (!ay(paramList)) && (!au(paramList)));
    return false;
    paramList = paramList.iterator();
    com.tencent.mm.storage.bd localbd;
    for (;;)
    {
      bool2 = bool1;
      if (!paramList.hasNext()) {
        break;
      }
      localbd = (com.tencent.mm.storage.bd)paramList.next();
      if ((paramah == null) || (!paramah.cuh())) {
        break label347;
      }
      if ((!localbd.ckz()) && (!ap(localbd)) && (!ar(localbd)) && (!as(localbd)) && (localbd.getType() != -1879048186) && (!az(localbd)) && (!at(localbd)) && ((!av(localbd)) || ((paramah != null) && (paramah.cuh()))) && ((!aw(localbd)) || ((paramah != null) && (paramah.cuh()))) && (localbd.getType() != 318767153) && (!aA(localbd)) && (!aB(localbd)) && (!ay(localbd)) && (!au(localbd))) {
        break label374;
      }
      paramList.remove();
      bool1 = false;
    }
    label347:
    if ((av(localbd)) || (aw(localbd)))
    {
      paramList.remove();
      bool1 = false;
    }
    label374:
    for (;;)
    {
      break;
    }
  }
  
  static boolean aA(com.tencent.mm.storage.bd parambd)
  {
    if (!parambd.cmi()) {}
    do
    {
      return false;
      au.HU();
      parambd = com.tencent.mm.model.c.FT().GR(parambd.field_content);
      if ((parambd == null) || (bi.oW(parambd.otZ))) {
        return true;
      }
    } while (com.tencent.mm.model.s.hf(parambd.otZ));
    return true;
  }
  
  private static boolean aB(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd != null) && (parambd.aQm()))
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (parambd.type == 6) && ((parambd.dws != 0) || (parambd.dwo > 26214400))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean aC(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd != null) && (parambd.aQm()))
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (parambd.type == 6)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean ap(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "check is store emoji error, msg is null");
      return true;
    }
    if (parambd.cmm())
    {
      an localan = new an(parambd.field_content);
      parambd = g.a.J(parambd.field_content, parambd.field_reserved);
      if (parambd != null) {
        break label180;
      }
      parambd = new g.a();
      parambd.dwq = localan.bKg;
    }
    label180:
    for (;;)
    {
      for (parambd = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.dwq); (parambd != null) && ((parambd.field_catalog == EmojiInfo.tcH) || ((!bi.oW(parambd.field_groupId)) && (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zl(parambd.field_groupId)))); parambd = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.field_imgPath)) {
        return false;
      }
      return (parambd != null) && (parambd.cnA());
    }
  }
  
  public static boolean aq(com.tencent.mm.storage.bd parambd)
  {
    if (parambd.cmm())
    {
      an localan = new an(parambd.field_content);
      parambd = g.a.J(parambd.field_content, parambd.field_reserved);
      if (parambd != null) {
        break label80;
      }
      parambd = new g.a();
      parambd.dwq = localan.bKg;
    }
    label80:
    for (;;)
    {
      return ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.dwq) != null;
    }
  }
  
  public static boolean ar(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "check is game msg error, msg is null");
      return true;
    }
    if (parambd.field_isSend == 0) {}
    for (parambd = com.tencent.mm.model.bd.iC(parambd.field_content);; parambd = parambd.field_content)
    {
      parambd = g.a.gp(parambd);
      if (parambd != null) {
        break;
      }
      x.w("MicroMsg.ChattingEditModeLogic", "parse app message content fail");
      return false;
    }
    parambd = com.tencent.mm.pluginsdk.model.app.g.bl(parambd.appId, false);
    return (parambd != null) && (parambd.aaq());
  }
  
  public static boolean as(com.tencent.mm.storage.bd parambd)
  {
    return parambd.getType() == 419430449;
  }
  
  public static boolean at(com.tencent.mm.storage.bd parambd)
  {
    return (parambd.getType() == 436207665) || (parambd.getType() == 469762097);
  }
  
  public static boolean au(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, check msg error, msg is null");
      return true;
    }
    if (parambd.field_isSend == 0) {}
    for (parambd = com.tencent.mm.model.bd.iC(parambd.field_content);; parambd = parambd.field_content)
    {
      parambd = g.a.gp(parambd);
      if (parambd != null) {
        break;
      }
      x.w("MicroMsg.ChattingEditModeLogic", "isAppbrandForbidForwardMsg, parse app message content fail");
      return false;
    }
    return (parambd.type == 33) && (parambd.dyU == 3);
  }
  
  private static boolean av(com.tencent.mm.storage.bd parambd)
  {
    if (parambd != null)
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (parambd.type == 19))
      {
        Object localObject = new mw();
        ((mw)localObject).bXL.type = 0;
        ((mw)localObject).bXL.bXN = parambd.dwW;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
        localObject = ((mw)localObject).bXM.bXV;
        if (localObject != null)
        {
          localObject = ((com.tencent.mm.protocal.b.a.c)localObject).dzs.iterator();
          while (((Iterator)localObject).hasNext())
          {
            vx localvx = (vx)((Iterator)localObject).next();
            if (!bi.oW(localvx.rAG))
            {
              x.e("MicroMsg.ChattingEditModeLogic", "record type subDataItem contain tpurl, type:%d", new Object[] { Integer.valueOf(localvx.bjS) });
              return true;
            }
          }
        }
        return (parambd.dwW != null) && (parambd.dwW.contains("<recordxml>"));
      }
    }
    return false;
  }
  
  private static boolean aw(com.tencent.mm.storage.bd parambd)
  {
    if (parambd != null)
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (parambd.type == 24)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean ax(com.tencent.mm.storage.bd parambd)
  {
    if (parambd != null)
    {
      parambd = g.a.gp(parambd.field_content);
      if (parambd != null) {
        break label18;
      }
    }
    label18:
    while ((parambd.type != 6) && (parambd.type != 5) && (parambd.type != 19)) {
      return false;
    }
    return true;
  }
  
  public static boolean ay(com.tencent.mm.storage.bd parambd)
  {
    if ((parambd == null) || (!parambd.cky())) {
      return false;
    }
    return com.tencent.mm.y.i.gu(parambd.field_content);
  }
  
  static boolean az(com.tencent.mm.storage.bd parambd)
  {
    if (parambd != null)
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (parambd.type == 16)) {}
      while ((parambd != null) && (parambd.type == 34)) {
        return true;
      }
    }
    return false;
  }
  
  public static void b(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd)
  {
    if (!a(paramContext, paramString, parambd, "image")) {}
    label175:
    for (;;)
    {
      return;
      Object localObject = null;
      if (parambd.field_msgId > 0L) {
        localObject = com.tencent.mm.ak.o.Pf().br(parambd.field_msgId);
      }
      if (((localObject == null) || (((com.tencent.mm.ak.e)localObject).dTK <= 0L)) && (parambd.field_msgSvrId > 0L)) {}
      for (parambd = com.tencent.mm.ak.o.Pf().bq(parambd.field_msgSvrId);; parambd = (com.tencent.mm.storage.bd)localObject)
      {
        if (parambd == null) {
          break label175;
        }
        int j = 0;
        int i = j;
        if (parambd.ON())
        {
          i = j;
          if (!com.tencent.mm.ak.f.a(parambd).dTL.startsWith("SERVERID://")) {
            i = 1;
          }
        }
        localObject = com.tencent.mm.ak.o.Pf().o(com.tencent.mm.ak.f.c(parambd), "", "");
        String str = com.tencent.mm.ak.o.Pf().o(parambd.dTN, "th_", "");
        if (bi.oW((String)localObject)) {
          break;
        }
        com.tencent.mm.plugin.messenger.a.g.bcT().a(paramContext, paramString, (String)localObject, i, parambd.dTV, str);
        return;
      }
    }
  }
  
  public static void b(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, parambd, "appmsg")) {}
    do
    {
      return;
      if (paramContext == null)
      {
        x.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: context is null");
        return;
      }
      if (parambd == null)
      {
        x.w("MicroMsg.ChattingEditModeLogic", "getReaderAppMsgContent: msg is null");
        return;
      }
      au.HU();
    } while (!com.tencent.mm.model.c.isSDCardAvailable());
    paramContext = com.tencent.mm.ak.o.Pf().d(parambd.field_imgPath, false, false);
    if ((!ai.oW(paramContext)) && (!paramContext.endsWith("hd")) && (FileOp.cn(paramContext + "hd"))) {
      paramContext = paramContext + "hd";
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(parambd.field_content);
        localObject2 = ((com.tencent.mm.y.l)localObject1).dzs;
        if ((localObject2 == null) || (((List)localObject2).size() <= 0))
        {
          if ((parambd == null) || ((!parambd.aQm()) && (!parambd.cky()))) {
            break label609;
          }
          localObject1 = u.ic(parambd.field_msgSvrId);
          localObject2 = u.Hx().v((String)localObject1, true);
          ((u.b)localObject2).p("prePublishId", "msg_" + parambd.field_msgSvrId);
          ((u.b)localObject2).p("preUsername", com.tencent.mm.ui.chatting.viewitems.b.a(parambd, paramBoolean, false));
          ((u.b)localObject2).p("preChatName", parambd.field_talker);
          ((u.b)localObject2).p("preMsgIndex", Integer.valueOf(0));
          ((u.b)localObject2).p("sendAppMsgScene", Integer.valueOf(1));
          ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", (u.b)localObject2, parambd);
          com.tencent.mm.plugin.messenger.a.g.bcT().a(paramString, bi.readFromFile(paramContext), bi.WT(parambd.field_content), (String)localObject1);
          return;
        }
      }
      catch (Exception paramContext)
      {
        x.printErrStackTrace("MicroMsg.ChattingEditModeLogic", paramContext, "", new Object[0]);
        x.e("MicroMsg.ChattingEditModeLogic", "send app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
        return;
      }
      parambd = ((List)localObject2).iterator();
      while (parambd.hasNext())
      {
        Object localObject3 = (m)parambd.next();
        localObject2 = new g.a();
        if (com.tencent.mm.y.i.gr(((m)localObject3).dzD))
        {
          l.b(paramString, l.a(paramString, (m)localObject3), ((m)localObject3).dzI);
        }
        else
        {
          ((g.a)localObject2).title = ((m)localObject3).title;
          ((g.a)localObject2).description = ((m)localObject3).dzA;
          ((g.a)localObject2).action = "view";
          ((g.a)localObject2).type = 5;
          ((g.a)localObject2).url = ((m)localObject3).url;
          ((g.a)localObject2).bZG = ((com.tencent.mm.y.l)localObject1).bZG;
          ((g.a)localObject2).bZH = ((com.tencent.mm.y.l)localObject1).bZH;
          ((g.a)localObject2).cGB = ((com.tencent.mm.y.l)localObject1).cGB;
          ((g.a)localObject2).thumburl = ((m)localObject3).dzy;
          if ((bi.oW(((g.a)localObject2).thumburl)) && (!bi.oW(((g.a)localObject2).bZG)))
          {
            localObject3 = com.tencent.mm.aa.q.KH().kc(((g.a)localObject2).bZG);
            if (localObject3 != null) {
              ((g.a)localObject2).thumburl = ((com.tencent.mm.aa.j)localObject3).Kx();
            }
          }
          localObject2 = g.a.a((g.a)localObject2, null, null);
          com.tencent.mm.plugin.messenger.a.g.bcT().a(paramString, bi.readFromFile(paramContext), bi.WT((String)localObject2), null);
        }
      }
      break;
      label609:
      Object localObject1 = null;
    }
  }
  
  public static void b(EmojiInfo paramEmojiInfo, String paramString)
  {
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    Object localObject = new StringBuilder();
    au.HU();
    localObject = com.tencent.mm.model.c.Gg() + paramEmojiInfo.Xh();
    if (com.tencent.mm.a.e.cm((String)localObject + "_thumb") > 0)
    {
      int i = com.tencent.mm.a.e.cm((String)localObject + "_thumb");
      localWXMediaMessage.thumbData = com.tencent.mm.a.e.e((String)localObject + "_thumb", 0, i);
    }
    for (;;)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject((String)localObject);
      com.tencent.mm.pluginsdk.model.app.l.a(localWXMediaMessage, paramEmojiInfo.field_app_id, null, paramString, 1, paramEmojiInfo.Xh());
      return;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream((String)localObject);
        localWXMediaMessage.setThumbImage(BackwardSupportUtil.b.a(localFileInputStream, 1.0F));
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.ChattingEditModeLogic", localException, "", new Object[0]);
        x.e("MicroMsg.ChattingEditModeLogic", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }
  
  public static void c(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd)
  {
    if ((!a(paramContext, paramString, parambd, "video")) || (parambd == null)) {}
    while ((parambd != null) && (parambd.cmk()) && (t.nY(parambd.field_imgPath))) {
      return;
    }
    paramContext = t.nW(parambd.field_imgPath);
    String str1 = parambd.field_imgPath;
    int i = paramContext.enQ;
    int j = paramContext.enM;
    paramContext = paramContext.Tm();
    int k = parambd.getType();
    x.d("MicroMsg.ChattingEditModeLogic", "copy video fileName %s userName %s export %d videoLength %d", new Object[] { str1, paramString, Integer.valueOf(i), Integer.valueOf(j) });
    parambd = com.tencent.mm.modelvideo.s.nJ(com.tencent.mm.model.q.GF());
    com.tencent.mm.modelvideo.o.Ta();
    String str2 = com.tencent.mm.modelvideo.s.nK(str1);
    String str3 = com.tencent.mm.modelvideo.s.nK(parambd);
    str1 = com.tencent.mm.modelvideo.s.nL(str1);
    String str4 = com.tencent.mm.modelvideo.s.nL(parambd);
    x.d("MicroMsg.ChattingEditModeLogic", "copy video: srcFullPath[%s] destFullPath[%s] srcThumbPath[%s] destThumbPath[%s]", new Object[] { str2, str3, str1, str4 });
    com.tencent.mm.sdk.platformtools.j.q(str2, str3, false);
    com.tencent.mm.sdk.platformtools.j.q(str1, str4, false);
    t.a(parambd, j, paramString, null, i, paramContext, k);
    t.nR(parambd);
  }
  
  public static void c(Context paramContext, String paramString, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, parambd, "location")) {
      return;
    }
    paramContext = p(parambd.field_content, parambd.field_isSend, paramBoolean);
    com.tencent.mm.plugin.messenger.a.g.bcT().D(paramString, paramContext, 48);
  }
  
  public static List<String> ctc()
  {
    Object localObject1 = z.MY().hw(25);
    Object localObject2 = z.MY();
    Object localObject3 = new ArrayList();
    Object localObject4 = new StringBuilder();
    com.tencent.mm.ac.e.a((StringBuilder)localObject4);
    com.tencent.mm.ac.e.c((StringBuilder)localObject4);
    com.tencent.mm.ac.e.d((StringBuilder)localObject4);
    com.tencent.mm.ac.e.a((StringBuilder)localObject4, true);
    ((StringBuilder)localObject4).append(" order by ");
    ((StringBuilder)localObject4).append(com.tencent.mm.ac.e.MD());
    localObject4 = ((StringBuilder)localObject4).toString();
    x.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatLst sql %s", new Object[] { localObject4 });
    localObject2 = ((com.tencent.mm.ac.e)localObject2).rawQuery((String)localObject4, new String[0]);
    if (localObject2 != null)
    {
      if (((Cursor)localObject2).moveToFirst()) {
        do
        {
          ((ArrayList)localObject3).add(((Cursor)localObject2).getString(0));
        } while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
    }
    localObject2 = new HashMap();
    localObject3 = ((List)localObject3).iterator();
    String str;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      str = com.tencent.mm.ac.f.kH((String)localObject4).Mg();
      if (!bi.oW(str)) {
        ((HashMap)localObject2).put(str, localObject4);
      }
    }
    localObject3 = new LinkedList();
    localObject4 = new LinkedList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      str = (String)((Iterator)localObject1).next();
      if (com.tencent.mm.ac.f.kK(str))
      {
        if (com.tencent.mm.ac.f.kO(str))
        {
          str = com.tencent.mm.ac.f.kH(str).field_enterpriseFather;
          if ((!((List)localObject4).contains(str)) && (com.tencent.mm.ac.f.kM(str)))
          {
            ((List)localObject4).add(str);
            str = (String)((HashMap)localObject2).get(str);
            if (!bi.oW(str)) {
              ((List)localObject4).add(str);
            }
          }
        }
      }
      else {
        ((List)localObject3).add(str);
      }
    }
    localObject1 = ((HashMap)localObject2).values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if ((!bi.oW((String)localObject2)) && (!((List)localObject4).contains(localObject2))) {
        ((List)localObject4).add(localObject2);
      }
    }
    ((List)localObject3).addAll((Collection)localObject4);
    x.d("MicroMsg.ChattingEditModeLogic", "get selected accept list, size %d", new Object[] { Integer.valueOf(((List)localObject3).size()) });
    return (List<String>)localObject3;
  }
  
  public static List<String> ctd()
  {
    Object localObject = z.MY().hw(25);
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!com.tencent.mm.ac.f.kK(str)) {
        localLinkedList.add(str);
      }
    }
    x.d("MicroMsg.ChattingEditModeLogic", "get selected accept list without enterprise, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
  
  public static int dA(List<com.tencent.mm.storage.bd> paramList)
  {
    if (paramList == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "get invalid send to friend msg num error, select item empty");
      return 0;
    }
    paramList = paramList.iterator();
    int i = 0;
    if (paramList.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)paramList.next();
      if ((!localbd.ckz()) && (!ap(localbd)) && (!localbd.aQo()) && (!ar(localbd)) && (!as(localbd)) && (!at(localbd))) {
        break label93;
      }
      i += 1;
    }
    label93:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public static boolean dB(List<com.tencent.mm.storage.bd> paramList)
  {
    if (paramList == null)
    {
      x.w("MicroMsg.ChattingEditModeLogic", "check contain undownload file, select item empty");
      return false;
    }
    Iterator localIterator = paramList.iterator();
    label322:
    label323:
    for (;;)
    {
      com.tencent.mm.storage.bd localbd;
      if (localIterator.hasNext())
      {
        localbd = (com.tencent.mm.storage.bd)localIterator.next();
        if ((localbd.ckA()) || (localbd.cmo()))
        {
          paramList = null;
          if (localbd.field_msgId > 0L) {
            paramList = com.tencent.mm.ak.o.Pf().br(localbd.field_msgId);
          }
          if (((paramList != null) && (paramList.dTK > 0L)) || (localbd.field_msgSvrId <= 0L)) {
            break label322;
          }
          paramList = com.tencent.mm.ak.o.Pf().bq(localbd.field_msgSvrId);
        }
      }
      for (;;)
      {
        if ((paramList == null) || ((paramList.offset >= paramList.dHI) && (paramList.dHI != 0))) {
          break label323;
        }
        return true;
        if (localbd.cmj())
        {
          paramList = com.tencent.mm.modelvideo.o.Ta().nI(localbd.field_imgPath);
          if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199)) {
            break;
          }
          return true;
        }
        if (localbd.cmm())
        {
          if (aq(localbd)) {
            break;
          }
          return true;
        }
        if (localbd.aQm())
        {
          paramList = g.a.J(localbd.field_content, localbd.field_content);
          if (paramList == null) {
            return true;
          }
          switch (paramList.type)
          {
          default: 
            break;
          case 6: 
            paramList = ao.asF().SR(paramList.bGP);
            if (paramList == null) {
              return true;
            }
            if (new File(paramList.field_fileFullPath).exists()) {
              break;
            }
            return true;
          }
        }
        if (!localbd.cmk()) {
          break;
        }
        paramList = t.nW(localbd.field_imgPath);
        if ((paramList == null) || (paramList.status == 199) || (paramList.status == 199)) {
          break;
        }
        return true;
        return false;
      }
    }
  }
  
  public static boolean dC(List<com.tencent.mm.storage.bd> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return false;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)paramList.next();
      if ((localbd.cmj()) && (com.tencent.mm.pluginsdk.model.j.SN(localbd.field_imgPath))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean dD(List<com.tencent.mm.storage.bd> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return false;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((com.tencent.mm.storage.bd)paramList.next()).cmk()) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean dz(List<com.tencent.mm.storage.bd> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.w("MicroMsg.ChattingEditModeLogic", "check contain invalid send to brand msg error, selected item empty");
      return true;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)paramList.next();
      if ((localbd.ckz()) || (ap(localbd)) || (localbd.cmi()) || (ar(localbd)) || (as(localbd)) || (localbd.getType() == -1879048186) || (az(localbd)) || (at(localbd)) || (ay(localbd)) || (au(localbd)) || (aC(localbd))) {
        return true;
      }
    }
    return false;
  }
  
  public static String p(String paramString, int paramInt, boolean paramBoolean)
  {
    String str = paramString;
    if (paramBoolean)
    {
      str = paramString;
      if (paramString != null)
      {
        str = paramString;
        if (paramInt == 0) {
          str = com.tencent.mm.model.bd.iC(paramString);
        }
      }
    }
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */