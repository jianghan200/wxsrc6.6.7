package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.chatting.viewitems.c.f;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;

public final class r
{
  private static boolean KK(String paramString)
  {
    boolean bool2 = false;
    avq localavq = com.tencent.mm.an.b.Qa();
    boolean bool1 = bool2;
    if (localavq != null)
    {
      bool1 = bool2;
      if (localavq.rsp != null)
      {
        bool1 = bool2;
        if (localavq.rYj == 0)
        {
          bool1 = bool2;
          if (!com.tencent.mm.an.b.PY()) {}
        }
      }
    }
    try
    {
      boolean bool3 = bi.fS(localavq.rsp, paramString);
      bool1 = bool2;
      if (bool3) {
        bool1 = true;
      }
      return bool1;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    paramString1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(paramString1);
    if (paramString1 == null) {
      x.w("MicroMsg.ChattingItemHelper", "transmitAppBrandMsg reader is null");
    }
    do
    {
      do
      {
        return;
      } while ((paramInt < 0) || (paramInt >= paramString1.dzs.size()));
      paramString1 = (m)paramString1.dzs.get(paramInt);
      localObject = g.a.a(l.a(paramString2, paramString1), null, null);
    } while (bi.oW((String)localObject));
    HashMap localHashMap = new HashMap();
    localHashMap.put("desc", paramString1.dzA);
    localHashMap.put("type", Integer.valueOf(2));
    localHashMap.put("title", paramString1.title);
    localHashMap.put("app_id", paramString1.dzH);
    localHashMap.put("pkg_type", Integer.valueOf(paramString1.dzG));
    localHashMap.put("pkg_version", Integer.valueOf(paramString1.dzF));
    localHashMap.put("img_url", paramString1.dzI);
    localHashMap.put("is_dynamic", Boolean.valueOf(false));
    localHashMap.put("cache_key", "");
    localHashMap.put("path", paramString1.dzE);
    paramString1 = new Intent(paramContext, MsgRetransmitUI.class);
    paramString1.putExtra("appbrand_params", localHashMap);
    paramString1.putExtra("Retr_Msg_content", (String)localObject);
    paramString1.putExtra("Retr_Msg_Type", 2);
    paramString1.putExtra("Retr_Biz_Msg_Selected_Msg_Index", paramInt);
    paramString1.putExtra("Retr_Msg_Id", paramLong1);
    paramString1.putExtra("Retr_MsgFromScene", 3);
    Object localObject = u.ic(String.valueOf(paramLong2));
    paramString1.putExtra("reportSessionId", (String)localObject);
    localObject = u.Hx().v((String)localObject, true);
    ((u.b)localObject).p("prePublishId", "msg_" + paramLong2);
    ((u.b)localObject).p("preUsername", paramString2);
    ((u.b)localObject).p("preChatName", paramString2);
    ((u.b)localObject).p("preMsgIndex", Integer.valueOf(paramInt));
    ((u.b)localObject).p("sendAppMsgScene", Integer.valueOf(1));
    paramContext.startActivity(paramString1);
  }
  
  public static void a(long paramLong, int paramInt, Context paramContext, Fragment paramFragment, Activity paramActivity, bd parambd)
  {
    Object localObject = parambd.field_talker;
    String str = u.ic(parambd.field_msgSvrId);
    u.b localb = u.Hx().v(str, true);
    localb.p("prePublishId", "msg_" + parambd.field_msgSvrId);
    localb.p("preUsername", localObject);
    localb.p("preChatName", localObject);
    localb.p("preMsgIndex", Integer.valueOf(paramInt));
    localb.p("sendAppMsgScene", Integer.valueOf(1));
    localObject = new ch();
    ((ch)localObject).bJF.bJJ = paramInt;
    ((ch)localObject).bJF.bJK = str;
    ((ch)localObject).bJF.nd = paramFragment;
    ((ch)localObject).bJF.activity = paramActivity;
    ((ch)localObject).bJF.bJM = 40;
    com.tencent.mm.pluginsdk.model.e.a((ch)localObject, parambd);
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    if (((ch)localObject).bJG.ret == 0)
    {
      paramFragment = g.a.gp(com.tencent.mm.y.i.a(paramContext, paramInt, parambd.field_content, parambd.field_talker));
      if (!parambd.aQm()) {
        break label399;
      }
      paramContext = com.tencent.mm.modelstat.b.ehL;
      if (paramFragment == null) {
        break label394;
      }
      paramInt = paramFragment.type;
      paramContext.b(parambd, paramInt);
    }
    for (;;)
    {
      if ((paramFragment != null) && (paramFragment.type == 5) && (paramFragment.url != null))
      {
        x.d("MicroMsg.ChattingItemHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramFragment.url, Long.valueOf(paramLong), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
        paramContext = "";
      }
      try
      {
        paramFragment = URLEncoder.encode(paramFragment.url, "UTF-8");
        paramContext = paramFragment;
      }
      catch (UnsupportedEncodingException paramFragment)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.ChattingItemHelper", paramFragment, "", new Object[0]);
        }
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { paramContext, Long.valueOf(paramLong), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1) });
      return;
      label394:
      paramInt = 0;
      break;
      label399:
      com.tencent.mm.modelstat.b.ehL.x(parambd);
    }
  }
  
  public static void a(View paramView, Context paramContext, String paramString)
  {
    com.tencent.mm.ui.chatting.viewitems.au localau = (com.tencent.mm.ui.chatting.viewitems.au)paramView.getTag();
    String str = localau.bKk;
    paramView = str;
    if (TextUtils.isEmpty(str)) {
      paramView = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zn(localau.cGB);
    }
    if (TextUtils.isEmpty(paramView))
    {
      paramView = new Intent();
      paramView.putExtra("geta8key_username", paramString);
      paramView.putExtra("rawUrl", localau.cGB);
      com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramView);
      return;
    }
    paramString = new Intent();
    paramString.putExtra("extra_id", paramView);
    paramString.putExtra("extra_name", localau.title);
    if (localau.ufz)
    {
      paramString.putExtra("download_entrance_scene", 20);
      paramString.putExtra("preceding_scence", 3);
      paramString.putExtra("reward_tip", true);
      com.tencent.mm.plugin.report.service.h.mEJ.h(12953, new Object[] { Integer.valueOf(1), paramView });
    }
    for (;;)
    {
      com.tencent.mm.bg.d.b(paramContext, "emoji", ".ui.EmojiStoreDetailUI", paramString);
      return;
      if (localau.ufA)
      {
        paramString.putExtra("download_entrance_scene", 25);
        paramString.putExtra("preceding_scence", 9);
        paramString.putExtra("reward_tip", true);
      }
      else
      {
        paramString.putExtra("download_entrance_scene", 22);
        paramString.putExtra("preceding_scence", 122);
        com.tencent.mm.plugin.report.service.h.mEJ.h(10993, new Object[] { Integer.valueOf(2), paramView });
      }
    }
  }
  
  public static void a(bd parambd, Context paramContext, com.tencent.mm.ui.chatting.c.a parama)
  {
    int j = 1;
    com.tencent.mm.model.au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable()) {
      com.tencent.mm.ui.base.s.gH(paramContext);
    }
    for (;;)
    {
      return;
      Object localObject1 = null;
      if (parambd.field_msgId > 0L) {
        localObject1 = o.Pf().br(parambd.field_msgId);
      }
      if (((localObject1 == null) || (((com.tencent.mm.ak.e)localObject1).dTK <= 0L)) && (parambd.field_msgSvrId > 0L)) {
        localObject1 = o.Pf().bq(parambd.field_msgSvrId);
      }
      while (localObject1 != null)
      {
        int i;
        if (parambd.field_isSend == 1) {
          if (((com.tencent.mm.ak.e)localObject1).ON()) {
            i = 1;
          }
        }
        Object localObject2;
        while (parambd.cmu())
        {
          x.i("MicroMsg.ChattingItemHelper", "image is clean!!!");
          com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.imgdownload_cleaned), paramContext.getString(R.l.app_tip), new r.2());
          return;
          i = 0;
          continue;
          if (!((com.tencent.mm.ak.e)localObject1).ON())
          {
            i = 0;
          }
          else
          {
            localObject2 = com.tencent.mm.ak.f.a((com.tencent.mm.ak.e)localObject1);
            if (!com.tencent.mm.a.e.cn(o.Pf().o(((com.tencent.mm.ak.e)localObject2).dTL, "", ""))) {
              i = 0;
            } else {
              i = 1;
            }
          }
        }
        if (com.tencent.mm.ui.chatting.b.i.e(parambd, o.Pf().o(com.tencent.mm.ak.f.c((com.tencent.mm.ak.e)localObject1), "", "")))
        {
          x.i("MicroMsg.ChattingItemHelper", "img is expired or clean!!!");
          localObject1 = new Intent(paramContext, ImageGalleryUI.class);
          ((Intent)localObject1).putExtra("img_gallery_msg_id", parambd.field_msgId);
          ((Intent)localObject1).putExtra("img_gallery_msg_svr_id", parambd.field_msgSvrId);
          ((Intent)localObject1).putExtra("img_gallery_talker", parambd.field_talker);
          ((Intent)localObject1).putExtra("img_gallery_chatroom_name", parambd.field_talker);
          ((Intent)localObject1).putExtra("img_gallery_is_restransmit_after_download", true);
          ((Intent)localObject1).putExtra("Retr_show_success_tips", true);
          if (parama != null) {
            com.tencent.mm.ui.chatting.b.i.a(parama, parambd, (Intent)localObject1);
          }
          for (;;)
          {
            paramContext.startActivity((Intent)localObject1);
            return;
            if (parambd != null)
            {
              parama = parambd.field_talker;
              localObject2 = parambd.field_talker;
              Bundle localBundle = new Bundle();
              i = j;
              if (com.tencent.mm.model.s.hf(parama)) {
                i = 7;
              }
              localBundle.putInt("stat_scene", i);
              localBundle.putString("stat_msg_id", "msg_" + Long.toString(parambd.field_msgSvrId));
              localBundle.putString("stat_chat_talker_username", parama);
              localBundle.putString("stat_send_msg_user", (String)localObject2);
              ((Intent)localObject1).putExtra("_stat_obj", localBundle);
            }
          }
        }
        if ((((com.tencent.mm.ak.e)localObject1).offset >= ((com.tencent.mm.ak.e)localObject1).dHI) && (((com.tencent.mm.ak.e)localObject1).dHI != 0))
        {
          parama = new Intent(paramContext, MsgRetransmitUI.class);
          parama.putExtra("Retr_File_Name", o.Pf().o(com.tencent.mm.ak.f.c((com.tencent.mm.ak.e)localObject1), "", ""));
          parama.putExtra("Retr_Msg_Id", parambd.field_msgId);
          parama.putExtra("Retr_Msg_Type", 0);
          parama.putExtra("Retr_show_success_tips", true);
          parama.putExtra("Retr_Compress_Type", i);
          paramContext.startActivity(parama);
          return;
        }
        parama = new Intent(paramContext, MsgRetransmitUI.class);
        parama.putExtra("Retr_File_Name", o.Pf().E(parambd.field_imgPath, true));
        parama.putExtra("Retr_Msg_Id", parambd.field_msgId);
        parama.putExtra("Retr_Msg_Type", 0);
        parama.putExtra("Retr_show_success_tips", true);
        parama.putExtra("Retr_Compress_Type", i);
        paramContext.startActivity(parama);
        return;
      }
    }
  }
  
  public static void a(m paramm, View paramView, String paramString)
  {
    if ((paramView == null) || (paramm == null)) {
      return;
    }
    paramView.setOnClickListener(new r.1(paramm, paramString));
  }
  
  public static void dr(View paramView)
  {
    long l1;
    boolean bool;
    if ((paramView.getTag() instanceof c.f))
    {
      paramView = (c.f)paramView.getTag();
      l1 = paramView.bJC;
      if (paramView.uaH != -1) {
        break label225;
      }
      com.tencent.mm.model.au.HU();
      localObject1 = com.tencent.mm.model.c.FT().dW(paramView.bJC);
      if (!KK(String.valueOf(l1))) {
        break label107;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.k(10231, "1");
      com.tencent.mm.an.b.PW();
      if (((cm)localObject1).field_msgId == l1)
      {
        paramView = com.tencent.mm.modelstat.b.ehL;
        bool = false;
        i = com.tencent.mm.y.h.g((bd)localObject1);
        paramView.a((bd)localObject1, bool, i);
      }
    }
    label107:
    Object localObject2;
    Object localObject3;
    Object localObject4;
    label225:
    do
    {
      do
      {
        return;
        localObject2 = g.a.gp(paramView.bVv);
        if (localObject2 != null)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.k(10090, "0,1");
          localObject3 = (com.tencent.mm.an.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.an.a.b.class);
          long l2 = paramView.bJC;
          localObject4 = paramView.bSw;
          com.tencent.mm.model.au.HU();
          com.tencent.mm.an.b.b(((com.tencent.mm.an.a.b)localObject3).a((g.a)localObject2, String.valueOf(l2), (String)localObject4, com.tencent.mm.model.c.Gq(), paramView.bSw));
        }
      } while (((cm)localObject1).field_msgId != l1);
      paramView = com.tencent.mm.modelstat.b.ehL;
      if (localObject2 != null)
      {
        i = ((g.a)localObject2).type;
        bool = true;
        break;
      }
      i = 0;
      bool = true;
      break;
      localObject2 = paramView.bJC + "_" + paramView.uaH;
      com.tencent.mm.model.au.HU();
      localObject1 = com.tencent.mm.model.c.FT().dW(paramView.bJC);
      localObject3 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(paramView.bVv);
      if (!KK((String)localObject2)) {
        break label433;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.k(10231, "1");
      com.tencent.mm.an.b.PW();
      if (((cm)localObject1).field_msgId == l1) {
        com.tencent.mm.modelstat.b.ehL.a((bd)localObject1, false, com.tencent.mm.y.h.g((bd)localObject1));
      }
    } while ((localObject3 == null) || (((com.tencent.mm.y.l)localObject3).dzs == null) || (((com.tencent.mm.y.l)localObject3).dzs.size() <= paramView.uaH));
    paramView = (m)((com.tencent.mm.y.l)localObject3).dzs.get(paramView.uaH);
    Object localObject1 = com.tencent.mm.plugin.report.service.h.mEJ;
    if (paramView.type == 6) {}
    for (int i = 1;; i = 0)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject1).h(14972, new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
      return;
    }
    label433:
    if ((localObject3 != null) && (((com.tencent.mm.y.l)localObject3).dzs != null) && (((com.tencent.mm.y.l)localObject3).dzs.size() > paramView.uaH))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.k(10090, "0,1");
      localObject3 = (m)((com.tencent.mm.y.l)localObject3).dzs.get(paramView.uaH);
      localObject4 = (com.tencent.mm.an.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.an.a.b.class);
      String str1 = paramView.bSw;
      String str2 = ((m)localObject3).title;
      String str3 = ((m)localObject3).dzM;
      String str4 = ((m)localObject3).url;
      String str5 = ((m)localObject3).url;
      String str6 = ((m)localObject3).dzL;
      com.tencent.mm.model.au.HU();
      com.tencent.mm.an.b.b(((com.tencent.mm.an.a.b)localObject4).a(0, str1, str2, str3, str4, str5, str6, (String)localObject2, com.tencent.mm.model.c.Gq(), paramView.bSw, "", ""));
      paramView = com.tencent.mm.plugin.report.service.h.mEJ;
      if (((m)localObject3).type != 6) {
        break label648;
      }
    }
    label648:
    for (i = 1;; i = 0)
    {
      paramView.h(14972, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      if (((cm)localObject1).field_msgId != l1) {
        break;
      }
      com.tencent.mm.modelstat.b.ehL.a((bd)localObject1, true, com.tencent.mm.y.h.g((bd)localObject1));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */