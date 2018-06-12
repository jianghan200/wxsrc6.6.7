package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.AbsListView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.b.b.v;
import com.tencent.mm.y.g.a;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.s.class)
@Deprecated
public class y
  extends a
  implements com.tencent.mm.ui.chatting.b.b.s
{
  private List<com.tencent.mm.storage.bd> tQQ;
  private int tQR;
  private final com.tencent.mm.sdk.platformtools.al tQS = new com.tencent.mm.sdk.platformtools.al(new y.1(this), true);
  private boolean tQT = false;
  private Runnable tQU = null;
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.tencent.mm.storage.bd parambd, HashSet<String> paramHashSet)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "oreh downloadTpUrl msgId:%d, mediaId:%s, path:%s", new Object[] { Long.valueOf(parambd.field_msgId), paramString5, paramString4 });
    paramHashSet.add(paramString5);
    com.tencent.mm.modelcdntran.i locali = new com.tencent.mm.modelcdntran.i();
    locali.field_fileType = 19;
    locali.field_authKey = paramString3;
    locali.field_aesKey = paramString2;
    locali.dPW = paramString1;
    locali.field_fullpath = paramString4;
    locali.field_mediaId = paramString5;
    locali.dPV = new y.4(this, parambd, paramString4, paramHashSet);
    if (!com.tencent.mm.modelcdntran.g.ND().b(locali, -1)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MessBoxComponent", "recv openim record, add task failed");
    }
  }
  
  private void aY(final com.tencent.mm.storage.bd parambd)
  {
    int j = 1;
    Object localObject1;
    final Object localObject2;
    Object localObject3;
    if (parambd.aQm())
    {
      localObject1 = g.a.gp(parambd.field_content);
      if ((((g.a)localObject1).type == 6) && (!bi.oW(((g.a)localObject1).dwu)))
      {
        localObject2 = com.tencent.mm.pluginsdk.model.app.l.d(parambd, ((g.a)localObject1).bGP);
        if ((localObject2 == null) || ((com.tencent.mm.a.e.cn(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath)) && (com.tencent.mm.a.e.cm(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath) == ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen))) {
          break label471;
        }
        localObject3 = new com.tencent.mm.modelcdntran.i();
        ((com.tencent.mm.modelcdntran.i)localObject3).dPV = new i.a()
        {
          public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
          {
            if ((paramAnonymousInt == 0) && (paramAnonymouskeep_ProgressInfo != null))
            {
              localObject2.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
              ao.asF().c(localObject2, new String[0]);
            }
            if ((paramAnonymousInt == 0) && (paramAnonymouskeep_SceneResult != null) && (paramAnonymouskeep_SceneResult.field_retCode == 0))
            {
              localObject2.field_status = 199L;
              localObject2.field_offset = localObject2.field_totalLen;
              ao.asF().c(localObject2, new String[0]);
              parambd.setStatus(3);
              au.HU();
              com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
              new ag(Looper.getMainLooper()).post(new y.7.1(this));
            }
            return 0;
          }
          
          public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream) {}
          
          public final byte[] i(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
          {
            return new byte[0];
          }
        };
        ((com.tencent.mm.modelcdntran.i)localObject3).field_mediaId = com.tencent.mm.modelcdntran.d.a("checkExist", bi.VF(), parambd.field_talker, parambd.field_msgId);
        ((com.tencent.mm.modelcdntran.i)localObject3).field_aesKey = ((g.a)localObject1).dwK;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_fileType = 19;
        ((com.tencent.mm.modelcdntran.i)localObject3).field_authKey = ((g.a)localObject1).dwA;
        ((com.tencent.mm.modelcdntran.i)localObject3).dPW = ((g.a)localObject1).dwu;
        if ((localObject2 != null) && (!bi.oW(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath)))
        {
          ((com.tencent.mm.modelcdntran.i)localObject3).field_fullpath = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
          if (!com.tencent.mm.modelcdntran.g.ND().b((com.tencent.mm.modelcdntran.i)localObject3, -1)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MessBoxComponent", "openim attach download failed before rescend");
          }
        }
      }
    }
    label471:
    label508:
    label583:
    label718:
    label771:
    label774:
    label776:
    label797:
    label800:
    for (;;)
    {
      return;
      au.HU();
      ((com.tencent.mm.modelcdntran.i)localObject3).field_fullpath = com.tencent.mm.pluginsdk.model.app.l.al(com.tencent.mm.model.c.Gk(), ((g.a)localObject1).title, ((g.a)localObject1).dwp);
      break;
      if (((g.a)localObject1).type == 19)
      {
        localObject2 = com.tencent.mm.plugin.record.b.h.Ks(((g.a)localObject1).dwW);
        localObject1 = new HashSet();
        localObject2 = ((com.tencent.mm.protocal.b.a.c)localObject2).dzs.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (vx)((Iterator)localObject2).next();
          String str1 = com.tencent.mm.plugin.record.b.h.c((vx)localObject3, parambd.field_msgId);
          String str2;
          if ((!bi.oW(((vx)localObject3).rAG)) && (!com.tencent.mm.a.e.cn(str1)))
          {
            str2 = com.tencent.mm.plugin.record.b.h.e(((vx)localObject3).jdM, parambd.field_msgId, true);
            a(((vx)localObject3).rAG, ((vx)localObject3).rAD, ((vx)localObject3).dwA, str1, str2, parambd, (HashSet)localObject1);
          }
          str1 = com.tencent.mm.plugin.record.b.h.f((vx)localObject3, parambd.field_msgId);
          if ((!bi.oW(((vx)localObject3).dwv)) && (!com.tencent.mm.a.e.cn(str1)))
          {
            str2 = com.tencent.mm.plugin.record.b.h.e(com.tencent.mm.plugin.record.b.h.Ba(((vx)localObject3).jdM), parambd.field_msgId, true);
            a(((vx)localObject3).dwv, ((vx)localObject3).dwB, ((vx)localObject3).dwA, str1, str2, parambd, (HashSet)localObject1);
          }
        }
        if (!((HashSet)localObject1).isEmpty()) {}
      }
      else
      {
        int i;
        if (parambd.ckA())
        {
          localObject1 = com.tencent.mm.ak.o.Pf().bq(parambd.field_msgSvrId);
          if (parambd.field_isSend != 1) {
            break label718;
          }
          if (((com.tencent.mm.ak.e)localObject1).ON())
          {
            i = 1;
            if ((((com.tencent.mm.ak.e)localObject1).offset >= ((com.tencent.mm.ak.e)localObject1).dHI) && (((com.tencent.mm.ak.e)localObject1).dHI != 0)) {
              break label771;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "oreh downloadImgAndFav start  msgID:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
            com.tencent.mm.ak.o.Pg().a(((com.tencent.mm.ak.e)localObject1).dTK, parambd.field_msgId, i, parambd, R.g.chat_img_template, new y.6(this, parambd));
            i = 1;
            if (i != 0) {
              break label774;
            }
          }
        }
        else if ((parambd.cmj()) || (parambd.cmk()))
        {
          localObject1 = com.tencent.mm.modelvideo.t.nW(parambd.field_imgPath);
          if ((localObject1 == null) || (((r)localObject1).status == 199)) {
            break label797;
          }
          localObject2 = new s.a()
          {
            public final void a(s.a.a paramAnonymousa)
            {
              if (parambd.field_imgPath.equals(paramAnonymousa.fileName))
              {
                r localr = com.tencent.mm.modelvideo.t.nW(paramAnonymousa.fileName);
                if ((localr == null) || (!localr.Tp())) {
                  break label97;
                }
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", new Object[] { Long.valueOf(parambd.field_msgId), paramAnonymousa.fileName });
              }
              for (;;)
              {
                com.tencent.mm.modelvideo.o.Ta().a(this);
                new ag(Looper.getMainLooper()).post(new y.5.1(this));
                return;
                label97:
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", new Object[] { Long.valueOf(parambd.field_msgId), paramAnonymousa.fileName });
              }
            }
          };
          com.tencent.mm.modelvideo.o.Ta().a((s.a)localObject2, Looper.getMainLooper());
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "oreh downloadVideoAndFav start  msgID:%d, fileName:%s", new Object[] { Long.valueOf(parambd.field_msgId), parambd.field_imgPath });
          if (!((r)localObject1).To()) {
            break label776;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "start complete online video");
          com.tencent.mm.modelvideo.t.oa(parambd.field_imgPath);
          i = j;
        }
        for (;;)
        {
          if (i != 0) {
            break label800;
          }
          aZ(parambd);
          return;
          i = 0;
          break label508;
          if (!((com.tencent.mm.ak.e)localObject1).ON())
          {
            i = 0;
            break label508;
          }
          localObject2 = com.tencent.mm.ak.f.a((com.tencent.mm.ak.e)localObject1);
          if (!com.tencent.mm.a.e.cn(com.tencent.mm.ak.o.Pf().o(((com.tencent.mm.ak.e)localObject2).dTL, "", "")))
          {
            i = 0;
            break label508;
          }
          i = 1;
          break label508;
          i = 0;
          break label583;
          break;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "start complete offline video");
          com.tencent.mm.modelvideo.t.nS(parambd.field_imgPath);
          i = j;
          continue;
          i = 0;
        }
      }
    }
  }
  
  private void aZ(com.tencent.mm.storage.bd parambd)
  {
    Object localObject1 = new ch();
    com.tencent.mm.pluginsdk.model.e.a((ch)localObject1, parambd);
    ((ch)localObject1).bJF.nd = this.bAG.tTq;
    ((ch)localObject1).bJF.bJM = 43;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((ch)localObject1).bJG.ret == 0)
    {
      if (!parambd.aQm()) {
        break label453;
      }
      com.tencent.mm.modelstat.b.ehL.b(parambd, com.tencent.mm.y.h.g(parambd));
    }
    for (;;)
    {
      if ((parambd.aQm()) || (parambd.cky()))
      {
        localObject2 = u.ic(parambd.field_msgSvrId);
        boolean bool = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur();
        u.b localb = u.Hx().v((String)localObject2, true);
        localb.p("prePublishId", "msg_" + parambd.field_msgSvrId);
        localb.p("preUsername", com.tencent.mm.ui.chatting.viewitems.b.a(parambd, com.tencent.mm.model.s.fq(this.bAG.getTalkerUserName()), bool));
        localb.p("preChatName", this.bAG.getTalkerUserName());
        localb.p("preMsgIndex", Integer.valueOf(0));
        localb.p("sendAppMsgScene", Integer.valueOf(1));
        ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.sns.b.i.class)).a("adExtStr", localb, parambd);
        ((ch)localObject1).bJF.bJK = ((String)localObject2);
      }
      Object localObject2 = g.a.gp(bi.WT(parambd.field_content));
      long l;
      if ((localObject2 != null) && (((g.a)localObject2).type == 5) && (((g.a)localObject2).url != null))
      {
        l = bi.VE();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.MessBoxComponent", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((g.a)localObject2).url, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1) });
        localObject1 = "";
      }
      try
      {
        localObject2 = URLEncoder.encode(((g.a)localObject2).url, "UTF-8");
        localObject1 = localObject2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          label453:
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ChattingUI.MessBoxComponent", localUnsupportedEncodingException, "", new Object[0]);
        }
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { localObject1, Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(1) });
      this.bAG.YC();
      com.tencent.mm.ui.chatting.a.a(a.c.tFU, a.d.tFZ, parambd, 0);
      return;
      com.tencent.mm.modelstat.b.ehL.x(parambd);
    }
  }
  
  public final int AQ()
  {
    return this.tQR;
  }
  
  public final void a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.viewitems.b paramb)
  {
    boolean bool = false;
    com.tencent.mm.storage.bd localbd = ((com.tencent.mm.ui.chatting.b.b.g)this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).ES(paramMenuItem.getGroupId());
    if (localbd == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MessBoxComponent", "context item select failed, null msg");
      return;
    }
    ((com.tencent.mm.ui.chatting.b.b.t)this.bAG.O(com.tencent.mm.ui.chatting.b.b.t.class)).k(paramMenuItem);
    switch (paramMenuItem.getItemId())
    {
    default: 
      return;
    case 100: 
      if (localbd.cmj()) {
        j.SO(localbd.field_imgPath);
      }
      com.tencent.mm.model.bd.aU(localbd.field_msgId);
      if (localbd.aQm()) {
        com.tencent.mm.modelstat.b.ehL.c(localbd, com.tencent.mm.y.h.g(localbd));
      }
    case 122: 
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "delete msg, id:%d", new Object[] { Long.valueOf(localbd.field_msgId) });
        if (!this.bAG.getTalkerUserName().equals("medianote"))
        {
          au.HU();
          com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(localbd.field_talker, localbd.field_msgSvrId));
        }
        if ((localbd.field_status != 1) || (localbd.field_isSend != 1)) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.MessBoxComponent", "delete a sending msg, publish SendMsgFailEvent");
        paramMenuItem = new ox();
        paramMenuItem.bZS.bGS = localbd;
        com.tencent.mm.sdk.b.a.sFg.m(paramMenuItem);
        return;
        ((com.tencent.mm.ui.chatting.b.b.h)this.bAG.O(com.tencent.mm.ui.chatting.b.b.h.class)).aT(localbd);
        return;
        com.tencent.mm.modelstat.b.ehL.y(localbd);
      }
    case 129: 
      paramMenuItem = g.a.gp(com.tencent.mm.model.bd.b(this.bAG.cwr(), localbd.field_content, localbd.field_isSend));
      if ((paramMenuItem != null) && ((paramMenuItem.type == 6) || (paramMenuItem.type == 2)))
      {
        paramMenuItem = ao.asF().SR(paramMenuItem.bGP);
        if ((paramMenuItem != null) && (FileOp.cn(paramMenuItem.field_fileFullPath))) {
          break label826;
        }
        bool = false;
      }
      break;
    }
    for (;;)
    {
      if (!((com.tencent.mm.ui.chatting.b.b.af)this.bAG.O(com.tencent.mm.ui.chatting.b.b.af.class)).g(localbd, bool))
      {
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.contain_undownload_msg_send), "", new y.3(this), null);
        return;
        if (localbd.ckA())
        {
          com.tencent.mm.ak.o.Pf();
          if (bi.oW(com.tencent.mm.ak.g.s(localbd))) {}
        }
        else
        {
          bool = true;
        }
      }
      else
      {
        paramMenuItem = new Intent(this.bAG.tTq.getContext(), ChattingSendDataToDeviceUI.class);
        paramMenuItem.putExtra("exdevice_open_scene_type", 1);
        paramMenuItem.putExtra("Retr_Msg_Id", localbd.field_msgId);
        this.bAG.tTq.startActivity(paramMenuItem);
        return;
        if (localbd.isText()) {
          com.tencent.mm.ui.chatting.am.l(com.tencent.mm.model.bd.b(this.bAG.cwr(), localbd.field_content, localbd.field_isSend), this.bAG.tTq.getContext());
        }
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "type is %d", new Object[] { Integer.valueOf(localbd.getType()) });
          return;
          if (localbd.ckz()) {
            com.tencent.mm.ui.chatting.am.b(localbd, this.bAG.tTq.getContext());
          } else if (localbd.ckA()) {
            com.tencent.mm.ui.chatting.am.a(localbd, this.bAG.tTq.getContext(), paramb.b(this.bAG, localbd), this.bAG.cwr());
          } else if (localbd.cmj()) {
            com.tencent.mm.ui.chatting.am.c(localbd, this.bAG.tTq.getContext());
          } else if (localbd.aQo()) {
            com.tencent.mm.ui.chatting.am.m(localbd.field_content, this.bAG.tTq.getContext());
          } else if (localbd.cmi()) {
            com.tencent.mm.ui.chatting.am.n(localbd.field_content, this.bAG.tTq.getContext());
          }
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.MessBoxComponent", "[oneliang][longclick_menu_revoke] type:%d,item.getGroupId:%d", new Object[] { Integer.valueOf(localbd.getType()), Integer.valueOf(paramMenuItem.getGroupId()) });
        ((v)this.bAG.O(v.class)).ba(localbd);
        return;
        aY(localbd);
        return;
        label826:
        bool = true;
      }
    }
  }
  
  public final boolean aap(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] username:%s isTContact:%s thread name:%s", new Object[] { paramString, Boolean.valueOf(ab.XO(paramString)), Thread.currentThread().getName() });
    if ((!ab.XO(paramString)) && (this.bAG != null))
    {
      paramString = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
      if (paramString == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] ");
        return false;
      }
      return paramString.cuB();
    }
    au.HU();
    Cursor localCursor = com.tencent.mm.model.c.FT().GO(paramString);
    localCursor.moveToFirst();
    for (boolean bool = false; !localCursor.isAfterLast(); bool = true)
    {
      com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
      localbd.d(localCursor);
      if (localbd.getType() != 34)
      {
        localbd.setStatus(4);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.MessBoxComponent", "writeOpLog: msgSvrId = " + localbd.field_msgSvrId + " status = " + localbd.field_status);
      }
      localCursor.moveToNext();
    }
    localCursor.close();
    if (bool)
    {
      au.HU();
      com.tencent.mm.model.c.FW().Ys(paramString);
      au.HU();
      com.tencent.mm.model.c.FT().GM(paramString);
    }
    return bool;
  }
  
  public final void cpF()
  {
    this.tQT = this.bAG.tTq.getBooleanExtra("key_is_temp_session", false).booleanValue();
    Object localObject;
    if (this.tQT)
    {
      localObject = new com.tencent.mm.modelsimple.g(this.bAG.getTalkerUserName(), this.bAG.tTq.getIntExtra("key_temp_session_scene", 5), this.bAG.tTq.getStringExtra("key_temp_session_from"));
      au.DF().a((com.tencent.mm.ab.l)localObject, 0);
    }
    if ((this.bAG.oLT.ckW()) && (!com.tencent.mm.l.a.gd(this.bAG.oLT.field_type)))
    {
      au.HU();
      localObject = com.tencent.mm.model.c.FW().Yq(this.bAG.getTalkerUserName());
      if (localObject == null) {
        if (this.tQT)
        {
          localObject = new com.tencent.mm.storage.ai(this.bAG.getTalkerUserName());
          ((com.tencent.mm.storage.ai)localObject).gf(4194304);
          ((com.tencent.mm.storage.ai)localObject).clx();
          au.HU();
          com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject);
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.MessBoxComponent", "is temp session : %s.", new Object[] { Boolean.valueOf(this.tQT) });
      return;
      if (((com.tencent.mm.storage.ai)localObject).gh(4194304))
      {
        this.tQT = true;
      }
      else
      {
        boolean bool;
        if (((com.tencent.mm.g.c.am)localObject).field_conversationTime < com.tencent.mm.ac.z.Nm())
        {
          au.HU();
          bool = com.tencent.mm.model.c.FW().a(this.bAG.getTalkerUserName(), 4194304, true, ((com.tencent.mm.g.c.am)localObject).field_attrflag);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a old version temp session, Set attr flag(talker : %s), %s", new Object[] { this.bAG.getTalkerUserName(), Boolean.valueOf(bool) });
          this.tQT = true;
        }
        else if (this.tQT)
        {
          au.HU();
          bool = com.tencent.mm.model.c.FW().a(this.bAG.getTalkerUserName(), 4194304, true, ((com.tencent.mm.g.c.am)localObject).field_attrflag);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a temp session, Set attr flag(talker : %s), %s", new Object[] { this.bAG.getTalkerUserName(), Boolean.valueOf(bool) });
          continue;
          this.tQT = false;
        }
      }
    }
  }
  
  public final void cpG()
  {
    Object localObject = com.tencent.mm.booter.notification.queue.b.yb();
    String str = this.bAG.getTalkerUserName();
    if (!com.tencent.mm.platformtools.ai.oW(str)) {
      ((com.tencent.mm.booter.notification.queue.b)localObject).cZb.eL(str);
    }
    if (this.bAG.cwr())
    {
      com.tencent.mm.aw.d.chatType = 1;
      if (this.tQQ != null) {
        this.tQQ.clear();
      }
      au.HU();
      localObject = com.tencent.mm.model.c.FW().Yq(this.bAG.getTalkerUserName());
      if (!((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur()) {
        break label160;
      }
      this.tQQ = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cuw();
    }
    label160:
    while ((localObject == null) || (((com.tencent.mm.g.c.am)localObject).field_unReadCount <= 0))
    {
      if (this.tQQ == null) {
        this.tQQ = new LinkedList();
      }
      this.tQR = this.tQQ.size();
      return;
      com.tencent.mm.aw.d.chatType = 0;
      break;
    }
    if (((com.tencent.mm.g.c.am)localObject).field_unReadCount > 100) {}
    for (int i = 100;; i = ((com.tencent.mm.g.c.am)localObject).field_unReadCount)
    {
      au.HU();
      this.tQQ = com.tencent.mm.model.c.FT().bz(this.bAG.getTalkerUserName(), i);
      break;
    }
  }
  
  public final void cpH()
  {
    Object localObject = new rz();
    ((rz)localObject).ccO.type = 4;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (this.bAG != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "[addActiveToolsProcessIdleHandler]");
      localObject = com.tencent.mm.ui.chatting.c.a.cwt();
      y.2 local2 = new y.2(this);
      this.tQU = local2;
      ((ag)localObject).postDelayed(local2, 3000L);
    }
    localObject = new ld();
    ((ld)localObject).bVw.talker = this.bAG.getTalkerUserName();
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    au.HU();
    if (com.tencent.mm.model.c.FM()) {
      com.tencent.mm.modelsimple.z.S(this.bAG.getTalkerUserName(), 2);
    }
  }
  
  public final void cpI()
  {
    com.tencent.mm.pluginsdk.wallet.i.Cx(6);
    this.tQS.J(300000L, 300000L);
    rz localrz = new rz();
    localrz.ccO.type = 0;
    if (this.bAG != null)
    {
      localrz.ccO.ccR = this.bAG.getHeaderViewsCount();
      localrz.ccO.ccP = this.bAG.getFirstVisiblePosition();
      localrz.ccO.ccQ = this.bAG.getLastVisiblePosition();
    }
    com.tencent.mm.sdk.b.a.sFg.m(localrz);
    com.tencent.mm.sdk.platformtools.af.Wp("keep_chatting_silent" + this.bAG.getTalkerUserName());
    au.getNotification().eJ(this.bAG.getTalkerUserName());
    MMAppMgr.vo();
  }
  
  public final void cpJ()
  {
    this.tQS.SO();
    rz localrz = new rz();
    localrz.ccO.type = 1;
    com.tencent.mm.sdk.b.a.sFg.m(localrz);
    aap(this.bAG.getTalkerUserName());
    au.getNotification().eJ("");
    com.tencent.mm.sdk.platformtools.af.Wq("keep_app_silent");
    com.tencent.mm.sdk.platformtools.af.Wq("keep_chatting_silent" + this.bAG.getTalkerUserName());
  }
  
  public final void cpK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "[onChattingExitAnimStart]");
    rz localrz = new rz();
    localrz.ccO.type = 3;
    com.tencent.mm.sdk.b.a.sFg.m(localrz);
    com.tencent.mm.ui.chatting.c.a.cwt().removeCallbacks(this.tQU);
  }
  
  public final void cun()
  {
    super.cun();
    au.HU();
    if (com.tencent.mm.model.c.FM()) {
      com.tencent.mm.modelsimple.z.S(this.bAG.getTalkerUserName(), 5);
    }
  }
  
  public final List<com.tencent.mm.storage.bd> cvI()
  {
    return this.tQQ;
  }
  
  public final boolean cvJ()
  {
    return this.tQT;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult requestCode:%d, data is null:%b  rawUserName:%s ", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool), this.bAG.getTalkerUserName() });
      switch (paramInt1)
      {
      case 212: 
      default: 
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          bool = false;
          break;
        } while ((paramIntent == null) || (!paramIntent.getBooleanExtra("_delete_ok_", false)));
        this.bAG.tTq.csV();
        return;
      } while (paramInt2 != -1);
      Uri localUri = paramIntent.getData();
      paramIntent = (Intent)localObject;
      if (this.bAG != null) {
        paramIntent = this.bAG.tTq.getContext().managedQuery(localUri, null, null, null, null);
      }
    } while (!paramIntent.moveToFirst());
    paramIntent = paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id"));
    paramIntent = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + paramIntent));
    this.bAG.tTq.startActivity(paramIntent);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 0)
    {
      paramAbsListView = new rz();
      paramAbsListView.ccO.type = 5;
      paramAbsListView.ccO.ccP = this.bAG.getFirstVisiblePosition();
      paramAbsListView.ccO.ccQ = this.bAG.getLastVisiblePosition();
      paramAbsListView.ccO.ccR = this.bAG.getHeaderViewsCount();
      com.tencent.mm.sdk.b.a.sFg.m(paramAbsListView);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */