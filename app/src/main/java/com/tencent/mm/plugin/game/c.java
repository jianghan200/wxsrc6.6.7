package com.tencent.mm.plugin.game;

import android.database.Cursor;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.g.a.gp;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.ub;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.game.model.a.f;
import com.tencent.mm.plugin.game.model.a.g.a;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.a;
import com.tencent.mm.plugin.game.model.s.c;
import com.tencent.mm.plugin.game.model.s.i;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.plugin.game.model.v;
import com.tencent.mm.plugin.game.model.v.1;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  com.tencent.mm.sdk.b.c hKG = new c.3(this);
  bv.a iwx = new bv.a()
  {
    public final void a(d.a paramAnonymousa)
    {
      Object localObject2 = ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.b.class)).aSi();
      paramAnonymousa = paramAnonymousa.dIN;
      Object localObject1 = ab.a(paramAnonymousa.rcl);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameMessageService", "Received a message: %d", new Object[] { Long.valueOf(paramAnonymousa.rcq) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameMessageService", "Message content: %s" + (String)localObject1);
      new Thread(new v.1((v)localObject2, (String)localObject1)).start();
      label110:
      int i;
      if (bi.oW((String)localObject1))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageParser", "msg content is null");
        paramAnonymousa = null;
        if (paramAnonymousa != null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameMessageService", "type = %d, appId = %s, msgId = %s", new Object[] { Integer.valueOf(paramAnonymousa.field_msgType), paramAnonymousa.field_appId, Long.valueOf(paramAnonymousa.field_msgId) });
          if (paramAnonymousa != null) {
            break label1460;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageService", "msg is null");
          i = -1;
        }
      }
      long l1;
      label552:
      boolean bool;
      for (;;)
      {
        if (i == 0) {
          v.b(paramAnonymousa);
        }
        switch (paramAnonymousa.field_msgType)
        {
        default: 
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameMessageService", "Insert raw message: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().b(paramAnonymousa)) });
          h.mEJ.a(858L, 1L, 1L, false);
          int j = paramAnonymousa.field_msgType;
          if (paramAnonymousa.field_msgType == 100) {
            j = paramAnonymousa.jNa;
          }
          an.a(ad.getContext(), 0, 0, 0, 18, i, paramAnonymousa.field_appId, 0, j, paramAnonymousa.field_gameMsgId, paramAnonymousa.jNb, an.da("resource", String.valueOf(paramAnonymousa.jMt.jNi)));
          h.mEJ.a(858L, 0L, 1L, false);
          return;
          localObject2 = bl.z((String)localObject1, "sysmsg");
          if ((localObject2 == null) || (((Map)localObject2).size() == 0))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageParser", "Parse failed");
            paramAnonymousa = null;
            break label110;
          }
          if (!"gamecenter".equalsIgnoreCase((String)((Map)localObject2).get(".sysmsg.$type")))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageParser", "Type not matched");
            paramAnonymousa = null;
            break label110;
          }
          paramAnonymousa = new s();
          paramAnonymousa.field_showInMsgList = true;
          paramAnonymousa.field_msgId = System.currentTimeMillis();
          paramAnonymousa.field_rawXML = ((String)localObject1);
          paramAnonymousa.field_msgType = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
          if ((paramAnonymousa.field_msgType == 100) || (paramAnonymousa.field_msgType == 30))
          {
            z.aUg();
            paramAnonymousa.field_gameMsgId = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
            paramAnonymousa.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appid"));
            paramAnonymousa.field_createTime = bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L);
            l1 = bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.expire_time"), 0L);
            if (l1 == 0L)
            {
              paramAnonymousa.field_expireTime = Long.MAX_VALUE;
              paramAnonymousa.jMh = bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.random_time"), 0L);
              if (bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0) {
                break label952;
              }
              bool = true;
              label596:
              paramAnonymousa.field_isHidden = bool;
              paramAnonymousa.field_mergerId = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
              paramAnonymousa.field_weight = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.weight"), "");
              paramAnonymousa.field_receiveTime = (System.currentTimeMillis() / 1000L);
              z.d((Map)localObject2, paramAnonymousa);
              paramAnonymousa.jMG = bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.filter_flag"), 0L);
              paramAnonymousa.jMH = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_center.not_in_msg_center"), 0);
              if (bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0) <= 0) {
                break label958;
              }
              bool = true;
              label730:
              paramAnonymousa.jMs = bool;
              paramAnonymousa.jMt.jNg = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
              if ((bi.oW((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"))) && (bi.oW((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc")))) {
                break label964;
              }
            }
            label952:
            label958:
            label964:
            for (paramAnonymousa.jMu = true;; paramAnonymousa.jMu = false)
            {
              z.e((Map)localObject2, paramAnonymousa);
              paramAnonymousa.jMY.jNt = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
              paramAnonymousa.jMY.hzJ = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg"), 0);
              if (!bi.oW(paramAnonymousa.jMY.jNt)) {
                paramAnonymousa.field_isHidden = true;
              }
              paramAnonymousa.jMY.jNu = bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
              if (paramAnonymousa.jMH == 1) {
                paramAnonymousa.field_showInMsgList = false;
              }
              break;
              paramAnonymousa.field_expireTime = (l1 + bi.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L));
              break label552;
              bool = false;
              break label596;
              bool = false;
              break label730;
            }
          }
          paramAnonymousa.field_gameMsgId = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
          paramAnonymousa.field_msgType = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
          if (paramAnonymousa.field_msgType == 0) {
            paramAnonymousa.field_msgType = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$msgtype"), 0);
          }
          paramAnonymousa.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appinfo.appid"));
          if (!bi.oW(u.B((Map)localObject2)))
          {
            bool = true;
            label1075:
            paramAnonymousa.field_showInMsgList = bool;
            paramAnonymousa.field_createTime = bi.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L);
            l1 = bi.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.expiredtime"), 0L);
            if (l1 != 0L) {
              break label1399;
            }
            paramAnonymousa.field_expireTime = Long.MAX_VALUE;
            label1141:
            if (bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0) {
              break label1432;
            }
            bool = true;
            label1164:
            paramAnonymousa.field_isHidden = bool;
            paramAnonymousa.field_mergerId = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
            if (paramAnonymousa.field_msgType != 10) {
              break label1438;
            }
            paramAnonymousa.field_weight = "6";
            label1209:
            paramAnonymousa.field_receiveTime = (System.currentTimeMillis() / 1000L);
            paramAnonymousa.jMG = bi.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.filter_flag"), 0L);
            paramAnonymousa.jMF = u.C((Map)localObject2);
            paramAnonymousa.jMH = bi.getInt((String)((Map)localObject2).get(".sysmsg.game_control_info.not_in_msg_center"), 0);
            if (bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.message_bubble_info.show_message_bubble"), 0) <= 0) {
              break label1448;
            }
            bool = true;
            label1294:
            paramAnonymousa.jMu = bool;
            paramAnonymousa.jNb = bi.aG((String)((Map)localObject2).get(".sysmsg.gamecenter.noticeid"), "");
            paramAnonymousa.jMt.jNi = bi.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.badge_display_type"), 0);
            if (paramAnonymousa.jMt.jNi <= 0) {
              break label1454;
            }
          }
          label1399:
          label1432:
          label1438:
          label1448:
          label1454:
          for (bool = true;; bool = false)
          {
            paramAnonymousa.jMs = bool;
            if ((paramAnonymousa.jMF & 0x4) == 0L) {
              paramAnonymousa.jMs = false;
            }
            u.b((Map)localObject2, paramAnonymousa);
            break;
            bool = false;
            break label1075;
            paramAnonymousa.field_expireTime = (l1 + bi.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L));
            break label1141;
            bool = false;
            break label1164;
            paramAnonymousa.field_weight = "2";
            break label1209;
            bool = false;
            break label1294;
          }
          label1460:
          localObject1 = paramAnonymousa.field_gameMsgId;
          if (!bi.oW((String)localObject1))
          {
            localObject2 = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
            i = 0;
            localObject1 = ((w)localObject2).rawQuery("select count(*) from GameRawMessage where gameMsgId = \"" + (String)localObject1 + "\"", new String[0]);
            if (localObject1 != null)
            {
              if (((Cursor)localObject1).moveToFirst()) {
                i = ((Cursor)localObject1).getInt(0);
              }
              ((Cursor)localObject1).close();
              if (i <= 0) {}
            }
          }
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label1610;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageService", "duplicated msg:%s", new Object[] { paramAnonymousa.field_gameMsgId });
            h.mEJ.a(858L, 4L, 1L, false);
            i = 2;
            break;
          }
          label1610:
          l1 = System.currentTimeMillis() / 1000L;
          if (paramAnonymousa.field_expireTime <= l1) {}
          for (i = 0;; i = 1)
          {
            if (i != 0) {
              break label1733;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageService", "msg is expired Time, %s", new Object[] { paramAnonymousa.field_gameMsgId });
            h.mEJ.a(858L, 5L, 1L, false);
            localObject1 = paramAnonymousa.jMY.jNt;
            if (!bi.oW((String)localObject1))
            {
              localObject2 = new ub();
              ((ub)localObject2).cfW.bIH = 6;
              ((ub)localObject2).cfW.cfX = ((String)localObject1);
              a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            i = 1;
            break;
          }
          label1733:
          l1 = paramAnonymousa.jMG;
          localObject1 = paramAnonymousa.field_appId;
          if (l1 == 1L)
          {
            if ((!bi.oW((String)localObject1)) && (com.tencent.mm.pluginsdk.model.app.g.r(ad.getContext(), (String)localObject1))) {
              break label1867;
            }
            h.mEJ.a(858L, 6L, 1L, false);
            i = 3;
          }
          for (;;)
          {
            if (i == 0) {
              break label1872;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageService", "checkFilter failed,%s, status: %d", new Object[] { paramAnonymousa.field_gameMsgId, Integer.valueOf(i) });
            break;
            if ((l1 == 2L) && ((bi.oW((String)localObject1)) || (com.tencent.mm.pluginsdk.model.app.g.r(ad.getContext(), (String)localObject1))))
            {
              h.mEJ.a(858L, 7L, 1L, false);
              i = 4;
            }
            else
            {
              label1867:
              i = 0;
            }
          }
          label1872:
          if (paramAnonymousa.field_msgType != 30) {
            break label1900;
          }
          h.mEJ.a(858L, 8L, 1L, false);
          i = 0;
        }
      }
      label1900:
      localObject2 = v.aTX();
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = v.aTZ();
      }
      if (localObject1 == null) {
        localObject1 = v.aUb();
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          ((s)localObject1).aTW();
          localObject2 = new JSONObject();
        }
        try
        {
          ((JSONObject)localObject2).put("oldNoticeId", ((s)localObject1).jNb);
          ((JSONObject)localObject2).put("oldMsgId", ((s)localObject1).field_gameMsgId);
          if (paramAnonymousa.field_weight.compareTo(((s)localObject1).field_weight) >= 0) {
            ((JSONObject)localObject2).put("coverType", 1);
          }
          for (;;)
          {
            i = paramAnonymousa.field_msgType;
            if (paramAnonymousa.field_msgType == 100) {
              i = paramAnonymousa.jNa;
            }
            an.a(ad.getContext(), 0, 0, 0, 31, 0, paramAnonymousa.field_appId, 0, i, paramAnonymousa.field_gameMsgId, paramAnonymousa.jNb, an.Dx(((JSONObject)localObject2).toString()));
            if (paramAnonymousa.field_weight.compareTo(((s)localObject1).field_weight) < 0) {
              break label2336;
            }
            h.mEJ.a(858L, 10L, 1L, false);
            localObject1 = ((s)localObject1).jMY.jNt;
            if (!bi.oW((String)localObject1))
            {
              localObject2 = new ub();
              ((ub)localObject2).cfW.bIH = 6;
              ((ub)localObject2).cfW.cfX = ((String)localObject1);
              a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            i = 1;
            if (i == 0) {
              break label2355;
            }
            i = 1;
            if (i != 0)
            {
              if (!paramAnonymousa.jMs) {
                break label2360;
              }
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRz, Long.valueOf(paramAnonymousa.field_msgId));
              if (bi.oW(paramAnonymousa.jMI.url)) {
                break label2379;
              }
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRD, Long.valueOf(paramAnonymousa.field_msgId));
              if (!paramAnonymousa.jMu) {
                break label2385;
              }
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRA, Long.valueOf(paramAnonymousa.field_msgId));
            }
            if (paramAnonymousa.field_msgType == 4) {
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRC, Long.valueOf(paramAnonymousa.field_msgId));
            }
            if ((paramAnonymousa == null) || (bi.oW(paramAnonymousa.jMt.jNg))) {
              break;
            }
            com.tencent.mm.plugin.game.e.c.DR(paramAnonymousa.jMt.jNg);
            break;
            ((JSONObject)localObject2).put("coverType", 2);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameMessageService", "reportMsgCover: " + localException.getMessage());
            continue;
            label2336:
            h.mEJ.a(858L, 11L, 1L, false);
            i = 0;
            continue;
            label2355:
            i = 0;
            continue;
            label2360:
            com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sRz, Long.valueOf(0L));
            continue;
            label2379:
            v.aUa();
            continue;
            label2385:
            v.aUc();
          }
        }
        localObject1 = g.a.aUH();
        if ((paramAnonymousa == null) || (bi.oW(paramAnonymousa.field_appId)))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameSilentDownloader", "msg is null");
          h.mEJ.a(860L, 16L, 1L, false);
          break;
        }
        localObject2 = paramAnonymousa.field_appId;
        l1 = paramAnonymousa.field_expireTime;
        long l2 = paramAnonymousa.jMh;
        com.tencent.mm.plugin.game.model.a.c localc = new com.tencent.mm.plugin.game.model.a.c();
        localc.field_appId = ((String)localObject2);
        if (!((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().b(localc, new String[0]))
        {
          localc.field_expireTime = l1;
          localc.field_randomTime = l2;
          localc.field_isFirst = true;
          localc.field_isRunning = false;
          localc.field_noWifi = true;
          localc.field_noSdcard = true;
          localc.field_noEnoughSpace = true;
          localc.field_lowBattery = true;
          localc.field_continueDelay = true;
          bool = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSl().b(localc);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameSilentDownloader", "insert GameSilentDownloadTask, appid:%s, expireTime:%d, randomTime:%d, ret:%b", new Object[] { localc.field_appId, Long.valueOf(localc.field_expireTime), Long.valueOf(localc.field_randomTime), Boolean.valueOf(bool) });
          ((com.tencent.mm.plugin.game.model.a.g)localObject1).fv(false);
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameSilentDownloader", "GameSilentDownloadTask exist! appid = %s", new Object[] { localObject2 });
        h.mEJ.a(860L, 17L, 1L, false);
        break;
      }
    }
  };
  com.tencent.mm.sdk.b.c jFA = new c.15(this);
  com.tencent.mm.sdk.b.c jFB = new c.16(this);
  com.tencent.mm.sdk.b.c jFC = new c.17(this);
  com.tencent.mm.sdk.b.c jFD = new c.18(this);
  d jFE = new d()
  {
    public final com.tencent.mm.sdk.b.b CY(String paramAnonymousString)
    {
      gp localgp = new gp();
      localgp.bPM.bHA = paramAnonymousString;
      return localgp;
    }
    
    public final j aSe()
    {
      return ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
    }
  };
  com.tencent.mm.sdk.b.c jFF = new c.4(this);
  com.tencent.mm.sdk.b.c jFG = new c.5(this);
  com.tencent.mm.sdk.b.c jFH = new c.6(this);
  com.tencent.mm.sdk.b.c jFI = new c.7(this);
  com.tencent.mm.sdk.b.c jFJ = new c.8(this);
  com.tencent.mm.sdk.b.c jFK = new com.tencent.mm.sdk.b.c() {};
  com.tencent.mm.sdk.b.c jFL = new c.10(this);
  com.tencent.mm.plugin.game.wepkg.utils.c jFv;
  com.tencent.mm.sdk.b.c jFw = new c.11(this);
  com.tencent.mm.sdk.b.c jFx = new c.12(this);
  com.tencent.mm.sdk.b.c jFy = new c.13(this);
  com.tencent.mm.sdk.b.c jFz = new c.14(this);
  
  public c()
  {
    if (this.jFv == null) {
      this.jFv = new com.tencent.mm.plugin.game.wepkg.utils.c();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */