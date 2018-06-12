package com.tencent.mm.plugin.webwx.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.a.i;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.a;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI;
import com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  implements com.tencent.mm.ab.d, com.tencent.mm.ak.d.a
{
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, com.tencent.mm.ab.l paraml) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "onImgTaskEnd imgLocalId:%d, msgLocalId:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
  }
  
  public final d.b b(com.tencent.mm.ab.d.a parama)
  {
    parama = parama.dIN;
    Object localObject1;
    Object localObject2;
    int i;
    if ((parama != null) && (parama.jQd == 51))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StatusNotifyMsgExtension", "msgType %d %d", new Object[] { Integer.valueOf(parama.jQd), Integer.valueOf(51) });
      localObject1 = ab.a(parama.rck);
      if (!bi.oW((String)localObject1))
      {
        localObject2 = ab.a(parama.rcl).trim();
        parama = bl.z((String)localObject2, "msg");
        if (parama != null)
        {
          i = bi.getInt((String)parama.get(".msg.op.$id"), 0);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StatusNotifyMsgExtension", "handleStatusNotifyMsg, %d", new Object[] { Integer.valueOf(i) });
          if ((i != 1) && (i != 2) && (i != 5)) {
            break label349;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark conversation readed. userName = " + (String)localObject1);
          au.HU();
          c.FT().GB((String)localObject1);
          com.tencent.mm.plugin.webwx.a.ezn.cancelNotification((String)localObject1);
          if (!s.hj((String)localObject1)) {
            break label216;
          }
          au.HU();
          c.DT().set(143618, Integer.valueOf(0));
          com.tencent.mm.az.d.SF().clO();
        }
      }
    }
    for (;;)
    {
      return null;
      label216:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq");
      au.HU();
      c.FW().Ys((String)localObject1);
      if (s.fq((String)localObject1))
      {
        au.HU();
        parama = c.FW().Yq((String)localObject1);
        if ((parama != null) && (parama.field_unReadCount > 0) && (parama.field_UnDeliverCount > 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq chatroom[%s], UnDeliver[%d], Unread[%d]", new Object[] { localObject1, Integer.valueOf(parama.field_UnDeliverCount), Integer.valueOf(parama.field_unReadCount) });
          com.tencent.mm.plugin.webwx.a.ezo.cV((String)localObject1);
          parama.eV(0);
          au.HU();
          c.FW().a(parama, (String)localObject1);
          continue;
          label349:
          if (i == 3)
          {
            au.HU();
            localObject1 = c.FW().clE();
            localObject2 = new StringBuilder();
            i = 0;
            if (i < ((List)localObject1).size())
            {
              if (i > 0) {}
              for (parama = ",";; parama = "")
              {
                ((StringBuilder)localObject2).append(parama);
                ((StringBuilder)localObject2).append((String)((List)localObject1).get(i));
                i += 1;
                break;
              }
            }
            parama = new com.tencent.mm.modelsimple.z(((StringBuilder)localObject2).toString(), 4);
            au.DF().a(parama, 0);
          }
          else if (i == 6)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
          }
          else if (i == 7)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            au.HU();
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StatusNotifyMsgExtension", "onlineversion: %d,%d", new Object[] { Integer.valueOf(c.FN()), Integer.valueOf(com.tencent.mm.modelsimple.l.QZ()) });
            localObject1 = bi.oV((String)parama.get(".msg.op.name")).trim();
            parama = bi.oV((String)parama.get(".msg.op.arg")).trim();
            if ("WeixinStatus".equals(localObject1))
            {
              au.HU();
              if ((c.FN() == com.tencent.mm.modelsimple.l.QZ()) && (com.tencent.mm.modelsimple.l.efE != null) && (com.tencent.mm.modelsimple.l.efE.trim().length() > 0))
              {
                parama = new Intent(ad.getContext(), WebWXLogoutUI.class);
                parama.setFlags(603979776);
                parama.addFlags(268435456);
                parama.putExtra("intent.key.online_version", com.tencent.mm.modelsimple.l.QZ());
                ad.getContext().startActivity(parama);
              }
            }
            else if ("MomentsUnreadMsgStatus".equals(localObject1))
            {
              localObject2 = new rb();
              ((rb)localObject2).cbQ.bNI = 7;
              ((rb)localObject2).cbQ.cbR = ((String)localObject1);
              ((rb)localObject2).cbQ.cbS = bi.getInt(parama, 0);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "sns enter function, %d, %s, %d", new Object[] { Integer.valueOf(((rb)localObject2).cbQ.bNI), ((rb)localObject2).cbQ.cbR, Long.valueOf(((rb)localObject2).cbQ.cbS) });
              com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.ac.z.Nl();
              i.e(i, (String)localObject1, parama);
            }
          }
          else if (i == 8)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bi.oV((String)parama.get(".msg.op.name")).trim();
            parama = bi.oV((String)parama.get(".msg.op.arg")).trim();
            if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.ac.z.Nl();
              i.e(i, (String)localObject1, parama);
            }
            else
            {
              parama = new rb();
              parama.cbQ.bNI = 8;
              com.tencent.mm.sdk.b.a.sFg.m(parama);
            }
          }
          else if (i == 9)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", new Object[] { Integer.valueOf(i), localObject2 });
            localObject1 = bi.oV((String)parama.get(".msg.op.name")).trim();
            parama = bi.oV((String)parama.get(".msg.op.arg")).trim();
            if ("MomentsTimelineStatus".equals(localObject1))
            {
              parama = parama.split(",");
              if (parama.length == 2)
              {
                localObject2 = new rb();
                ((rb)localObject2).cbQ.bNI = 9;
                ((rb)localObject2).cbQ.cbR = ((String)localObject1);
                ((rb)localObject2).cbQ.cbS = bi.getInt(parama[1], 0);
                ((rb)localObject2).cbQ.cbT = parama[0];
                com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
              }
            }
            else if ("EnterpriseChatStatus".equals(localObject1))
            {
              com.tencent.mm.ac.z.Nl();
              i.e(i, (String)localObject1, parama);
            }
          }
          else if (i == 11)
          {
            localObject1 = bi.oV((String)parama.get(".msg.op.name")).trim();
            parama = bi.oV((String)parama.get(".msg.op.arg")).trim();
            if (!"DownloadFile".equals(localObject1)) {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "[MultiTerminalSyncMgr]not DownloadFile, ignore");
            }
            localObject1 = bl.z(parama, "downloadList");
            if (localObject1 != null)
            {
              i = 0;
              for (;;)
              {
                label1219:
                localObject2 = new StringBuilder(".downloadList.downloadItem");
                if (i == 0) {}
                for (parama = "";; parama = Integer.valueOf(i))
                {
                  localObject2 = parama;
                  i += 1;
                  parama = (String)localObject2 + ".username";
                  localObject2 = (String)localObject2 + ".msgsvrid";
                  parama = (String)((Map)localObject1).get(parama);
                  if (bi.oW(parama)) {
                    break;
                  }
                  long l = bi.getLong((String)((Map)localObject1).get(localObject2), -1L);
                  if (l == -1L) {
                    break;
                  }
                  au.HU();
                  parama = c.FT().I(parama, l);
                  if (parama.field_msgSvrId != 0L) {
                    break label1398;
                  }
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.StatusNotifyMsgExtension", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", new Object[] { Long.valueOf(l) });
                  break label1219;
                }
                label1398:
                g.bYF().bYH().fF(parama.field_msgId);
              }
            }
          }
          else if (i == 12)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StatusNotifyMsgExtension", "williamjin extdevice unlock " + (String)localObject2, new Object[] { Integer.valueOf(i) });
            try
            {
              if (parama.get(".msg.op.arg") == null) {
                break label1575;
              }
              parama = new JSONObject((String)parama.get(".msg.op.arg")).get("deviceName").toString();
              if (!com.tencent.mm.modelsimple.l.QY()) {
                continue;
              }
              localObject1 = new Intent(ad.getContext(), WebWXPopupUnlockUI.class);
              ((Intent)localObject1).setFlags(872415232);
              ((Intent)localObject1).putExtra("deviceName", parama);
              ad.getContext().startActivity((Intent)localObject1);
            }
            catch (JSONException parama)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.StatusNotifyMsgExtension", "[williamjin] " + parama.getMessage());
            }
            continue;
            label1575:
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StatusNotifyMsgExtension", "[williamjin] can not find the tag  .msg.op.arg");
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.StatusNotifyMsgExtension", "unknow opCode, %d", new Object[] { Integer.valueOf(i) });
          }
        }
      }
    }
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */