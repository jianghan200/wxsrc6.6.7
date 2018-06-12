package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.mw.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.wz;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.i;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static final SimpleDateFormat mvL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  
  private static wr SL(String paramString)
  {
    wr localwr = new wr();
    localwr.Vw(paramString);
    localwr.CO(1);
    localwr.fU(bi.VF());
    localwr.Vy("");
    return localwr;
  }
  
  private static vx a(com.tencent.mm.storage.bd parambd, g.a parama, int paramInt)
  {
    vx localvx = new vx();
    localvx.UT(ad(parambd));
    localvx.UI(parama.dwN);
    localvx.UJ(parama.dwO);
    localvx.UH(parama.url);
    localvx.kX(true);
    parambd = new File(bi.aG(com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true), ""));
    if (parambd.exists()) {
      localvx.UQ(parambd.getAbsolutePath());
    }
    for (;;)
    {
      localvx.UB(parama.title);
      localvx.UC(parama.description);
      localvx.CF(paramInt);
      localvx.Va(parama.canvasPageXml);
      return localvx;
      localvx.kY(true);
    }
  }
  
  private static vx a(com.tencent.mm.storage.bd parambd, String paramString, vy paramvy)
  {
    vx localvx = new vx();
    localvx.UT(ad(parambd));
    localvx.CF(1);
    localvx.UC(paramString);
    localvx.kY(true);
    localvx.kX(true);
    localvx.a(paramvy);
    localvx.UW(a(paramvy.rAJ));
    localvx.UX(b(paramvy.rAJ));
    return localvx;
  }
  
  private static String a(vz paramvz)
  {
    String str2 = paramvz.rBh;
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = paramvz.bSS;
    }
    if (com.tencent.mm.ac.a.e.lb(str1)) {
      return com.tencent.mm.ac.a.e.ld(str1);
    }
    return com.tencent.mm.model.r.gS(str1);
  }
  
  private static boolean a(Context paramContext, ch paramch, com.tencent.mm.storage.bd parambd, int paramInt)
  {
    vy localvy = new vy();
    localvy.c(ac(parambd));
    String str = null;
    if (paramInt == 1) {
      str = paramContext.getString(R.l.app_emoji);
    }
    for (;;)
    {
      paramContext = a(parambd, str, localvy);
      paramch.bJF.bJH.rBI.add(paramContext);
      return true;
      if (paramInt == 2) {
        str = paramContext.getString(R.l.app_pay);
      } else if (paramInt == 3) {
        str = paramContext.getString(R.l.app_special);
      }
    }
  }
  
  private static boolean a(Context paramContext, ch paramch, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if ((paramch == null) || (parambd == null))
    {
      x.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msg is null");
      bool2 = bool1;
      if (paramch != null)
      {
        paramch.bJF.bJL = R.l.favorite_fail_argument_error;
        bool2 = bool1;
      }
      return bool2;
    }
    com.tencent.mm.storage.bd localbd = com.tencent.mm.storage.bd.al(parambd);
    if (localbd.isText())
    {
      paramContext = new vy();
      paramContext.c(ac(localbd));
      parambd = new vx();
      parambd.UT(ad(localbd));
      parambd.CF(1);
      if (!localbd.cmy())
      {
        parambd.UC(localbd.field_content);
        label120:
        parambd.kY(true);
        parambd.kX(true);
        parambd.a(paramContext);
        parambd.UW(a(paramContext.rAJ));
        parambd.UX(b(paramContext.rAJ));
        paramch.bJF.bJH.rBI.add(parambd);
        paramContext = paramch.bJF.bJI;
        paramContext.rBY += 1;
        bool1 = true;
      }
    }
    for (;;)
    {
      bool2 = bool1;
      if (paramBoolean) {
        break;
      }
      com.tencent.mm.plugin.fav.ui.c.a(localbd, paramch, bool1);
      return bool1;
      parambd.UC(localbd.field_content + "\n\n" + localbd.field_transContent);
      break label120;
      Object localObject;
      if (localbd.ckz())
      {
        parambd = new vy();
        parambd.c(ac(localbd));
        localObject = new vx();
        ((vx)localObject).UT(ad(localbd));
        ((vx)localObject).CF(3);
        if (paramBoolean)
        {
          ((vx)localObject).kY(true);
          ((vx)localObject).kX(true);
        }
        for (;;)
        {
          ((vx)localObject).a(parambd);
          ((vx)localObject).UW(a(parambd.rAJ));
          ((vx)localObject).UX(b(parambd.rAJ));
          paramch.bJF.bJH.rBI.add(localObject);
          paramContext = paramch.bJF.bJI;
          paramContext.rCa += 1;
          bool1 = true;
          break;
          if (com.tencent.mm.model.s.hB(localbd.field_talker))
          {
            paramContext = localbd.field_imgPath;
            au.HU();
            paramContext = h.b(com.tencent.mm.model.c.Ge(), "recbiz_", paramContext, ".rec", 2);
            if (bi.oW(paramContext))
            {
              paramContext = null;
              label447:
              ((vx)localObject).UP(paramContext);
            }
          }
          for (;;)
          {
            ((vx)localObject).kY(true);
            paramContext = com.tencent.mm.modelvoice.q.ok(localbd.field_imgPath);
            if (paramContext != null) {
              break label512;
            }
            bool1 = false;
            break;
            new File(paramContext).exists();
            break label447;
            ((vx)localObject).UP(com.tencent.mm.modelvoice.q.getFullPath(localbd.field_imgPath));
          }
          label512:
          ((vx)localObject).UL(e.BC(paramContext.getFormat()));
          ((vx)localObject).CE((int)new n(localbd.field_content).time);
        }
      }
      if (localbd.aQo())
      {
        bool1 = b(paramch, localbd);
      }
      else if (localbd.ckA())
      {
        parambd = null;
        if (localbd.field_msgId > 0L) {
          parambd = com.tencent.mm.ak.o.Pf().br((int)localbd.field_msgId);
        }
        if (parambd != null)
        {
          paramContext = parambd;
          if (parambd.dTK > 0L) {}
        }
        else
        {
          paramContext = parambd;
          if (localbd.field_msgSvrId > 0L) {
            paramContext = com.tencent.mm.ak.o.Pf().bq(localbd.field_msgSvrId);
          }
        }
        if (paramContext == null)
        {
          x.w("MicroMsg.GetFavRecordDataSource", "getImgDataPath: try get imgInfo fail");
          paramch.bJF.bJL = R.l.favorite_fail_image_not_exists;
          bool1 = bool2;
        }
        else
        {
          parambd = new vy();
          parambd.c(ac(localbd));
          localObject = new vx();
          ((vx)localObject).UT(ad(localbd));
          ((vx)localObject).CF(2);
          ((vx)localObject).UP(com.tencent.mm.ak.o.Pf().o(com.tencent.mm.ak.f.c(paramContext), "", ""));
          if (paramContext.ON())
          {
            com.tencent.mm.ak.e locale = com.tencent.mm.ak.o.Pf().hQ(paramContext.dTU);
            if (locale.dHI > locale.offset) {
              ((vx)localObject).UP(com.tencent.mm.ak.o.Pf().o("SERVERID://" + localbd.field_msgSvrId, "", ""));
            }
          }
          ((vx)localObject).UQ(com.tencent.mm.ak.o.Pf().E(localbd.field_imgPath, true));
          ((vx)localObject).a(parambd);
          ((vx)localObject).UW(a(parambd.rAJ));
          ((vx)localObject).UX(b(parambd.rAJ));
          ((vx)localObject).fQ(localbd.field_msgId);
          int i;
          if (paramBoolean)
          {
            parambd = paramContext;
            if (paramContext.ON())
            {
              parambd = paramContext;
              if (paramContext.dHI == 0) {
                parambd = com.tencent.mm.ak.o.Pf().hQ(paramContext.dTU);
              }
            }
            if (localbd.field_isSend != 1) {
              break label1047;
            }
            if (!parambd.ON()) {
              break label1041;
            }
            i = 1;
            label921:
            paramContext = bl.z(parambd.dTV, "msg");
            if (paramContext == null) {
              break label1097;
            }
            if (i == 1)
            {
              ((vx)localObject).UF((String)paramContext.get(".msg.img.$cdnbigimgurl"));
              ((vx)localObject).fO(bi.getInt((String)paramContext.get(".msg.img.$length"), 0));
              ((vx)localObject).UG((String)paramContext.get(".msg.img.$aeskey"));
            }
          }
          for (;;)
          {
            paramch.bJF.bJH.rBI.add(localObject);
            paramContext = paramch.bJF.bJI;
            paramContext.rBZ += 1;
            bool1 = true;
            break;
            label1041:
            i = 0;
            break label921;
            label1047:
            if (!parambd.ON())
            {
              i = 0;
              break label921;
            }
            paramContext = com.tencent.mm.ak.f.a(parambd);
            if (!com.tencent.mm.a.e.cn(com.tencent.mm.ak.o.Pf().o(paramContext.dTL, "", "")))
            {
              i = 0;
              break label921;
            }
            i = 1;
            break label921;
            label1097:
            x.i("MicroMsg.GetFavRecordDataSource", "parse cdnInfo failed. [%s]", new Object[] { parambd.dTV });
          }
        }
      }
      else if (localbd.cmj())
      {
        bool1 = a(paramch, localbd, paramBoolean);
      }
      else if (localbd.cmk())
      {
        bool1 = a(paramch, localbd, paramBoolean);
      }
      else
      {
        if ((paramBoolean) && (localbd.getType() == 318767153)) {
          return a(paramContext, paramch, localbd, 3);
        }
        if (localbd.cky())
        {
          bool1 = c(paramch, localbd);
        }
        else if ((paramBoolean) && ((localbd.cml()) || (localbd.cmm())))
        {
          bool1 = a(paramContext, paramch, localbd, 1);
        }
        else if ((paramBoolean) && (localbd.getType() == 419430449))
        {
          bool1 = a(paramContext, paramch, localbd, 2);
        }
        else
        {
          if (localbd.cmi())
          {
            au.HU();
            localObject = com.tencent.mm.model.c.FT().GR(localbd.field_content);
            parambd = new vy();
            parambd.c(ac(localbd));
            if ((localObject != null) && (com.tencent.mm.model.s.gU(((bd.a)localObject).pOR)))
            {
              paramContext = new vx();
              paramContext.UT(ad(localbd));
              paramContext.CF(16);
              paramContext.UC(localbd.field_content);
              paramContext.kY(true);
              paramContext.kX(true);
              paramContext.a(parambd);
              paramContext.UW(a(parambd.rAJ));
              paramContext.UX(b(parambd.rAJ));
            }
            for (;;)
            {
              paramch.bJF.bJH.rBI.add(paramContext);
              paramContext = paramch.bJF.bJI;
              paramContext.rCm += 1;
              bool1 = true;
              break;
              if ((localObject != null) && (ab.XR(((bd.a)localObject).otZ)))
              {
                localObject = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class)).g(((bd.a)localObject).tbI, "openim_card_type_name", b.a.eui);
                if (TextUtils.isEmpty((CharSequence)localObject)) {}
                for (paramContext = paramContext.getResources().getString(R.l.app_friend_card_personal);; paramContext = String.format("[%s]", new Object[] { localObject }))
                {
                  paramContext = a(localbd, paramContext, parambd);
                  break;
                }
              }
              paramContext = a(localbd, paramContext.getString(R.l.app_friend_card_personal), parambd);
            }
          }
          if (localbd.aQm())
          {
            if (localbd.cmm())
            {
              paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
              bool1 = bool2;
            }
            else
            {
              bool1 = b(paramContext, paramch, localbd, paramBoolean);
            }
          }
          else
          {
            paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
            bool1 = bool2;
            if (paramBoolean) {
              bool1 = a(paramContext, paramch, localbd, 3);
            }
          }
        }
      }
    }
  }
  
  public static boolean a(Context paramContext, ch paramch, String paramString, List<com.tencent.mm.storage.bd> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramList == null) || (paramList.isEmpty()) || (paramContext == null))
    {
      x.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msgs is null");
      paramch.bJF.bJL = R.l.favorite_fail_argument_error;
      paramBoolean1 = false;
    }
    label594:
    label713:
    do
    {
      int i;
      do
      {
        return paramBoolean1;
        Object localObject1 = paramList.iterator();
        Object localObject2;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.storage.bd)((Iterator)localObject1).next();
          if (bf.l((com.tencent.mm.storage.bd)localObject2)) {
            switch (((com.tencent.mm.storage.bd)localObject2).getType() & 0xFFFF)
            {
            default: 
              break;
            case 1: 
              ((com.tencent.mm.storage.bd)localObject2).setContent(paramContext.getString(R.l.app_text));
              break;
            case 3: 
              ((com.tencent.mm.storage.bd)localObject2).setContent(paramContext.getString(R.l.app_pic));
              ((com.tencent.mm.storage.bd)localObject2).setType(1);
              break;
            case 43: 
              ((com.tencent.mm.storage.bd)localObject2).setContent(paramContext.getString(R.l.app_video));
              ((com.tencent.mm.storage.bd)localObject2).setType(1);
              break;
            case 49: 
              ((com.tencent.mm.storage.bd)localObject2).setContent(paramContext.getString(R.l.app_unknown_msg));
              ((com.tencent.mm.storage.bd)localObject2).setType(1);
            }
          }
        }
        boolean bool = com.tencent.mm.ac.f.eZ(paramString);
        if ((paramList.size() == 1) && (!paramBoolean2))
        {
          paramList = (com.tencent.mm.storage.bd)paramList.get(0);
          if (paramList.cky())
          {
            localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(paramList.field_content);
            if ((((l)localObject1).dzs != null) && (((l)localObject1).dzs.size() == 1)) {
              return e.a(paramch, paramList);
            }
            paramch.bJF.bJH = new wl();
            paramch.bJF.bJI = new wz();
            paramch.bJF.bJH.a(SL(paramString));
            paramch.bJF.type = 14;
            return a(paramContext, paramch, paramList, paramBoolean1);
          }
          return e.a(paramch, paramList);
        }
        paramch.bJF.bJH = new wl();
        paramch.bJF.bJI = new wz();
        if (paramContext != null)
        {
          if (!bool) {
            break label594;
          }
          localObject1 = com.tencent.mm.ac.a.e.bl(((com.tencent.mm.storage.bd)paramList.get(0)).field_bizChatId);
          if (com.tencent.mm.ac.a.e.lc((String)localObject1))
          {
            paramch.bJF.bJH.Vu(paramContext.getString(R.l.record_chatroom_title));
            x.d("MicroMsg.GetFavRecordDataSource", "title %s", new Object[] { paramch.bJF.bJH.title });
          }
        }
        else
        {
          paramch.bJF.bJH.a(SL(paramString));
          paramch.bJF.type = 14;
          paramString = paramList.iterator();
          i = 0;
          paramBoolean2 = true;
        }
        for (;;)
        {
          if (!paramString.hasNext()) {
            break label713;
          }
          if (a(paramContext, paramch, (com.tencent.mm.storage.bd)paramString.next(), paramBoolean1))
          {
            i = 1;
            continue;
            localObject2 = com.tencent.mm.ac.a.e.lf(paramString);
            if (localObject2 == null) {
              break;
            }
            paramch.bJF.bJH.Vu(paramContext.getString(R.l.favorite_record_chat_title, new Object[] { ((j)localObject2).field_userName, com.tencent.mm.ac.a.e.ld((String)localObject1) }));
            break;
            if (com.tencent.mm.model.s.fq(paramString))
            {
              paramch.bJF.bJH.Vu(paramContext.getString(R.l.record_chatroom_title));
              break;
            }
            localObject1 = com.tencent.mm.model.q.GH();
            if (((String)localObject1).equals(com.tencent.mm.model.r.gS(paramString)))
            {
              paramch.bJF.bJH.Vu(paramContext.getString(R.l.favorite_record_chatroom_title, new Object[] { localObject1 }));
              break;
            }
            paramch.bJF.bJH.Vu(paramContext.getString(R.l.favorite_record_chat_title, new Object[] { com.tencent.mm.model.q.GH(), com.tencent.mm.model.r.gS(paramString) }));
            break;
          }
          paramBoolean2 = false;
        }
        paramBoolean1 = paramBoolean2;
      } while (i == 0);
      paramBoolean1 = paramBoolean2;
    } while (paramch.bJF.bJL <= 0);
    paramch.bJF.bJL = 0;
    return paramBoolean2;
  }
  
  private static boolean a(ch paramch, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    Object localObject = new vy();
    ((vy)localObject).c(ac(parambd));
    vx localvx = new vx();
    localvx.UT(ad(parambd));
    com.tencent.mm.modelvideo.o.Ta();
    localvx.UP(com.tencent.mm.modelvideo.s.nK(parambd.field_imgPath));
    com.tencent.mm.modelvideo.o.Ta();
    localvx.UQ(com.tencent.mm.modelvideo.s.nL(parambd.field_imgPath));
    localvx.UL(com.tencent.mm.a.e.cp(localvx.rzM));
    if (parambd.cmk()) {
      localvx.CF(15);
    }
    com.tencent.mm.modelvideo.r localr;
    for (;;)
    {
      localr = t.nW(parambd.field_imgPath);
      x.i("MicroMsg.GetFavRecordDataSource", "video length is %d", new Object[] { Integer.valueOf(localr.dHI) });
      if (localr.dHI <= com.tencent.mm.k.b.AB()) {
        break;
      }
      paramch.bJF.bJL = R.l.favorite_too_large;
      return false;
      localvx.CF(4);
    }
    if ((parambd.cmk()) && (t.nY(localr.getFileName())))
    {
      paramch.bJF.bJL = R.l.favorite_fail;
      return false;
    }
    localvx.CE(localr.enM);
    localvx.a((vy)localObject);
    localvx.UW(a(((vy)localObject).rAJ));
    localvx.UX(b(((vy)localObject).rAJ));
    localvx.fQ(parambd.field_msgId);
    localvx.fO(localr.dHI);
    if (paramBoolean)
    {
      localObject = bl.z(localr.Tm(), "msg");
      if (localObject == null) {
        break label458;
      }
      localvx.UF((String)((Map)localObject).get(".msg.videomsg.$cdnvideourl"));
      localvx.UG((String)((Map)localObject).get(".msg.videomsg.$aeskey"));
    }
    for (;;)
    {
      paramch.bJF.bJH.rBI.add(localvx);
      paramch = paramch.bJF.bJI;
      paramch.rCb += 1;
      paramch = t.nW(parambd.field_imgPath);
      localvx.UZ(paramch.bZN);
      paramch = paramch.enV;
      if ((paramch != null) && (!bi.oW(paramch.dyP)))
      {
        parambd = new wa();
        parambd.dyJ = paramch.dyJ;
        parambd.rBq = paramch.rBq;
        parambd.dyM = paramch.dyM;
        parambd.dyN = paramch.dyN;
        parambd.dyL = paramch.dyL;
        parambd.dyO = paramch.dyO;
        parambd.dyP = paramch.dyP;
        parambd.dyQ = paramch.dyQ;
        localvx.a(parambd);
      }
      return true;
      label458:
      x.i("MicroMsg.GetFavRecordDataSource", "cdntra parse video recv xml failed");
    }
  }
  
  private static vz ac(com.tencent.mm.storage.bd parambd)
  {
    vz localvz = new vz();
    if (parambd == null) {
      return localvz;
    }
    if ((parambd.field_isSend == 1) || (parambd.field_content.startsWith("<msg>")))
    {
      localvz.Vf(com.tencent.mm.model.q.GF());
      localvz.Vg(parambd.field_talker);
      if (com.tencent.mm.model.s.fq(parambd.field_talker)) {
        localvz.Vi(localvz.bSS);
      }
    }
    do
    {
      if (com.tencent.mm.ac.f.eZ(parambd.field_talker))
      {
        String str2 = parambd.field_bizChatUserId;
        str1 = str2;
        if (str2 == null) {
          str1 = com.tencent.mm.model.bd.iF(parambd.cqb).userId;
        }
        localvz.Vi(str1);
      }
      localvz.CJ(1);
      localvz.fR(parambd.field_createTime);
      localvz.Vj(parambd.field_msgSvrId);
      if (parambd.field_msgSvrId > 0L) {
        localvz.Vh(parambd.field_msgSvrId);
      }
      return localvz;
      localvz.Vf(parambd.field_talker);
      localvz.Vg(com.tencent.mm.model.q.GF());
    } while (!com.tencent.mm.model.s.fq(parambd.field_talker));
    if (parambd.field_content != null) {}
    for (String str1 = parambd.field_content.substring(0, Math.max(0, parambd.field_content.indexOf(':')));; str1 = "")
    {
      localvz.Vi(str1);
      if ((bi.oW(localvz.rBh)) || (parambd.ckz())) {
        break;
      }
      parambd.setContent(parambd.field_content.substring(localvz.rBh.length() + 1));
      if ((parambd.field_content.length() > 0) && ('\n' == parambd.field_content.charAt(0))) {
        parambd.setContent(parambd.field_content.substring(1));
      }
      if (!parambd.cmt()) {
        break;
      }
      parambd.es(parambd.field_transContent.substring(localvz.rBh.length() + 1));
      if ((parambd.field_transContent.length() <= 0) || ('\n' != parambd.field_transContent.charAt(0))) {
        break;
      }
      parambd.es(parambd.field_transContent.substring(1));
      break;
    }
  }
  
  private static String ad(com.tencent.mm.storage.bd parambd)
  {
    if (parambd.field_isSend == 1)
    {
      if ((com.tencent.mm.model.s.fq(parambd.field_talker)) || (parambd.field_talker.equals("filehelper"))) {
        return String.format("%d", new Object[] { Long.valueOf(parambd.field_msgSvrId) });
      }
      return String.format("%s#%d", new Object[] { parambd.field_talker, Long.valueOf(parambd.field_msgSvrId) });
    }
    return String.valueOf(parambd.field_msgSvrId);
  }
  
  private static String b(vz paramvz)
  {
    return mvL.format(new Date(paramvz.createTime));
  }
  
  private static boolean b(Context paramContext, ch paramch, com.tencent.mm.storage.bd parambd, boolean paramBoolean)
  {
    vy localvy = new vy();
    localvy.c(ac(parambd));
    Object localObject1 = parambd.field_content;
    if (localObject1 == null)
    {
      paramch.bJF.bJL = R.l.favorite_fail_parse_error;
      return false;
    }
    localObject1 = g.a.gp((String)localObject1);
    if (localObject1 == null)
    {
      paramch.bJF.bJL = R.l.favorite_fail_parse_error;
      return false;
    }
    localvy.rAJ.Vk(((g.a)localObject1).appId);
    localvy.rAJ.Vm(((g.a)localObject1).bZG);
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.bl(((g.a)localObject1).appId, true);
    if ((localObject2 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject2).aaq()) && (paramBoolean))
    {
      paramContext = a(parambd, paramContext.getString(R.l.app_game), localvy);
      paramch.bJF.bJH.rBI.add(paramContext);
      return true;
    }
    switch (((g.a)localObject1).type)
    {
    case 8: 
    case 9: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
    case 17: 
    case 18: 
    case 21: 
    case 22: 
    case 23: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 34: 
    case 35: 
    default: 
      if (paramBoolean)
      {
        paramContext = a(parambd, paramContext.getString(R.l.app_special), localvy);
        paramch.bJF.bJH.rBI.add(paramContext);
        return true;
      }
      break;
    case 1: 
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      paramContext.CF(1);
      paramContext.UC(((g.a)localObject1).title);
      paramContext.kY(true);
      paramContext.kX(true);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rBY += 1;
      return true;
    case 2: 
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
        return false;
      }
      localObject2 = ao.asF().SR(((g.a)localObject1).bGP);
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      if (localObject2 != null) {
        paramContext.UP(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
      }
      localObject2 = com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true);
      if (com.tencent.mm.a.e.cn((String)localObject2)) {
        paramContext.UQ((String)localObject2);
      }
      paramContext.CF(2);
      paramContext.UB(((g.a)localObject1).title);
      paramContext.UC(((g.a)localObject1).description);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramContext.fQ(parambd.field_msgId);
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rBZ += 1;
      return true;
    case 3: 
      paramContext = a(parambd, (g.a)localObject1, 7);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCe += 1;
      return true;
    case 4: 
      paramContext = a(parambd, (g.a)localObject1, 4);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramContext.fQ(parambd.field_msgId);
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCb += 1;
      return true;
    case 5: 
      if ((((g.a)localObject1).url != null) && (!((g.a)localObject1).url.equals("")))
      {
        localvy.rAJ.Vl(((g.a)localObject1).url);
        paramContext = a(parambd, (g.a)localObject1, 5);
        paramContext.a(localvy);
        paramContext.UW(a(localvy.rAJ));
        paramContext.UX(b(localvy.rAJ));
        parambd = new xa();
        if (!bi.oW(((g.a)localObject1).title)) {
          parambd.VJ(((g.a)localObject1).title);
        }
        if (!bi.oW(((g.a)localObject1).description)) {
          parambd.VK(((g.a)localObject1).description);
        }
        if (!bi.oW(((g.a)localObject1).thumburl)) {
          parambd.VM(((g.a)localObject1).thumburl);
        }
        if (!bi.oW(((g.a)localObject1).canvasPageXml)) {
          parambd.VN(((g.a)localObject1).canvasPageXml);
        }
        if (parambd.boi() > 0)
        {
          parambd.CP(1);
          localvy.a(parambd);
        }
        paramch.bJF.bJH.rBI.add(paramContext);
        paramContext = paramch.bJF.bJI;
        paramContext.rCc += 1;
        return true;
      }
      paramch.bJF.bJL = R.l.favorite_fail_empty_url;
      if (paramBoolean)
      {
        paramContext = a(parambd, paramContext.getString(R.l.app_special), localvy);
        paramch.bJF.bJH.rBI.add(paramContext);
        return true;
      }
      return false;
    case 6: 
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
        return false;
      }
      localObject2 = ao.asF().SR(((g.a)localObject1).bGP);
      paramContext = new vx();
      if (localObject2 != null) {
        paramContext.UP(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
      }
      paramContext.UT(ad(parambd));
      paramContext.CF(8);
      paramContext.UL(((g.a)localObject1).dwp);
      localObject2 = com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true);
      if (bi.oW((String)localObject2)) {
        paramContext.kY(true);
      }
      if (com.tencent.mm.a.e.cn((String)localObject2)) {
        paramContext.UQ((String)localObject2);
      }
      paramContext.UB(((g.a)localObject1).title);
      paramContext.UC(((g.a)localObject1).description);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramContext.fQ(parambd.field_msgId);
      if (paramBoolean)
      {
        paramContext.UF(((g.a)localObject1).dwD);
        paramContext.UG(((g.a)localObject1).dwK);
        paramContext.Ve(((g.a)localObject1).dwu);
        paramContext.Vc(((g.a)localObject1).dwK);
        paramContext.Vd(((g.a)localObject1).dwA);
      }
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCf += 1;
      return true;
    case 7: 
      if ((((g.a)localObject1).bGP == null) || (((g.a)localObject1).bGP.length() == 0)) {
        paramch.bJF.bJL = R.l.favorite_fail_attachment_not_exists;
      }
      do
      {
        paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
        return false;
        au.HU();
      } while (com.tencent.mm.model.c.isSDCardAvailable());
      paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
      return false;
    case 10: 
      paramContext = new wk();
      paramContext.Vp(((g.a)localObject1).title);
      paramContext.Vq(((g.a)localObject1).description);
      paramContext.CL(((g.a)localObject1).dwR);
      paramContext.Vs(((g.a)localObject1).dwS);
      paramContext.Vr(((g.a)localObject1).thumburl);
      localvy.a(paramContext);
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      paramContext.CF(10);
      paramContext.kY(true);
      paramContext.kX(true);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCh += 1;
      return true;
    case 20: 
      paramContext = new wu();
      paramContext.VF(((g.a)localObject1).title);
      paramContext.VG(((g.a)localObject1).description);
      paramContext.VI(((g.a)localObject1).dwV);
      paramContext.VH(((g.a)localObject1).thumburl);
      localvy.a(paramContext);
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      paramContext.CF(14);
      paramContext.kY(true);
      paramContext.kX(true);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCl += 1;
      return true;
    case 13: 
      paramContext = new wk();
      paramContext.Vp(((g.a)localObject1).title);
      paramContext.Vq(((g.a)localObject1).description);
      paramContext.CL(((g.a)localObject1).dwX);
      paramContext.Vs(((g.a)localObject1).dwY);
      paramContext.Vr(((g.a)localObject1).thumburl);
      localvy.a(paramContext);
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      paramContext.CF(11);
      paramContext.kY(true);
      paramContext.kX(true);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramch.bJF.bJH.rBI.add(paramContext);
      paramContext = paramch.bJF.bJI;
      paramContext.rCi += 1;
      return true;
    case 33: 
    case 36: 
      if ((((g.a)localObject1).dyU == 3) && (paramBoolean))
      {
        paramContext = a(parambd, paramContext.getString(R.l.app_not_show), localvy);
        paramch.bJF.bJH.rBI.add(paramContext);
        return true;
      }
      paramContext = new vx();
      paramContext.UT(ad(parambd));
      paramContext.UB(((g.a)localObject1).title);
      paramContext.UC(((g.a)localObject1).description);
      paramContext.CF(19);
      localObject2 = com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true);
      if (bi.oW((String)localObject2)) {
        paramContext.kY(true);
      }
      if (com.tencent.mm.a.e.cn((String)localObject2)) {
        paramContext.UQ((String)localObject2);
      }
      localObject2 = new vv();
      if (!bi.oW(((g.a)localObject1).dyS)) {
        ((vv)localObject2).username = ((g.a)localObject1).dyS;
      }
      if (!bi.oW(((g.a)localObject1).dyT)) {
        ((vv)localObject2).appId = ((g.a)localObject1).dyT;
      }
      if (!bi.oW(((g.a)localObject1).dzb)) {
        ((vv)localObject2).iconUrl = ((g.a)localObject1).dzb;
      }
      ((vv)localObject2).type = ((g.a)localObject1).dyU;
      ((vv)localObject2).bPh = ((g.a)localObject1).dyW;
      ((vv)localObject2).bGH = ((g.a)localObject1).dyR;
      ((vv)localObject2).rzd = ((g.a)localObject1).bZH;
      localvy.a((vv)localObject2);
      paramContext.a(localvy);
      paramContext.UW(a(localvy.rAJ));
      paramContext.UX(b(localvy.rAJ));
      paramContext.fQ(parambd.field_msgId);
      paramch.bJF.bJH.rBI.add(paramContext);
      return true;
    case 19: 
      int i;
      if ((((g.a)localObject1).dwW != null) && (((g.a)localObject1).dwW.contains("<recordxml>"))) {
        i = 1;
      }
      while (i == 0)
      {
        localObject2 = new vx();
        ((vx)localObject2).UT(ad(parambd));
        ((vx)localObject2).CF(17);
        ((vx)localObject2).kY(true);
        ((vx)localObject2).UB(((g.a)localObject1).title);
        ((vx)localObject2).Vb(((g.a)localObject1).dwW);
        paramContext = ((g.a)localObject1).description;
        Object localObject3 = new mw();
        ((mw)localObject3).bXL.type = 0;
        ((mw)localObject3).bXL.bXN = ((g.a)localObject1).dwW;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
        localObject1 = ((mw)localObject3).bXM.bXV;
        if (localObject1 != null)
        {
          localObject3 = ((com.tencent.mm.protocal.b.a.c)localObject1).dzs.iterator();
          for (;;)
          {
            if (((Iterator)localObject3).hasNext()) {
              if (!bi.oW(((vx)((Iterator)localObject3).next()).rAG))
              {
                paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
                return false;
                i = 0;
                break;
              }
            }
          }
        }
        if (localObject1 == null) {
          break label2608;
        }
        paramContext = ((com.tencent.mm.protocal.b.a.c)localObject1).desc;
      }
    }
    label2608:
    for (;;)
    {
      ((vx)localObject2).UC(paramContext);
      ((vx)localObject2).a(localvy);
      ((vx)localObject2).UW(a(localvy.rAJ));
      ((vx)localObject2).UX(b(localvy.rAJ));
      ((vx)localObject2).fQ(parambd.field_msgId);
      paramch.bJF.bJH.rBI.add(localObject2);
      return true;
      if (paramBoolean)
      {
        paramContext = a(parambd, paramContext.getString(R.l.favorite_wenote_msg), localvy);
        paramch.bJF.bJH.rBI.add(paramContext);
        return true;
      }
      if (!paramBoolean) {
        break;
      }
      paramContext = a(parambd, paramContext.getString(R.l.app_product_card_ticket), localvy);
      paramch.bJF.bJH.rBI.add(paramContext);
      return true;
      paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
      return false;
    }
  }
  
  private static boolean b(ch paramch, com.tencent.mm.storage.bd parambd)
  {
    vy localvy = new vy();
    localvy.c(ac(parambd));
    Object localObject = bl.z(parambd.field_content, "msg");
    if (localObject != null) {
      try
      {
        we localwe = new we();
        localwe.Vn((String)((Map)localObject).get(".msg.location.$label"));
        localwe.z(Double.parseDouble((String)((Map)localObject).get(".msg.location.$x")));
        localwe.y(Double.parseDouble((String)((Map)localObject).get(".msg.location.$y")));
        localwe.CK(Integer.valueOf((String)((Map)localObject).get(".msg.location.$scale")).intValue());
        localwe.Vo((String)((Map)localObject).get(".msg.location.$poiname"));
        localvy.a(localwe);
        localObject = new vx();
        ((vx)localObject).UT(ad(parambd));
        ((vx)localObject).CF(6);
        ((vx)localObject).kY(true);
        ((vx)localObject).kX(true);
        ((vx)localObject).a(localvy);
        ((vx)localObject).UW(a(localvy.rAJ));
        ((vx)localObject).UX(b(localvy.rAJ));
        paramch.bJF.bJH.rBI.add(localObject);
        parambd = paramch.bJF.bJI;
        parambd.rCd += 1;
        return true;
      }
      catch (Exception parambd)
      {
        x.e("MicroMsg.GetFavRecordDataSource", "parse failed, %s", new Object[] { parambd.getStackTrace().toString() });
      }
    }
    paramch.bJF.bJL = R.l.favorite_fail_parse_error;
    return false;
  }
  
  private static boolean c(ch paramch, com.tencent.mm.storage.bd parambd)
  {
    for (;;)
    {
      try
      {
        l locall = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(parambd.field_content);
        localObject = locall.dzs;
        int i;
        if (localObject != null)
        {
          Iterator localIterator = ((List)localObject).iterator();
          i = 0;
          if (!localIterator.hasNext()) {
            break label456;
          }
          m localm = (m)localIterator.next();
          if (i.gr(localm.dzD)) {
            continue;
          }
          vy localvy = new vy();
          localvy.c(ac(parambd));
          localvy.rAJ.Vm(locall.bZG);
          localvy.rAJ.Vl(localm.url);
          vx localvx = new vx();
          localvx.UB(localm.title);
          localvx.UC(localm.dzA);
          localvx.UT(ad(parambd));
          if (!bi.oW(localm.dzy))
          {
            String str = localm.dzy;
            int j = parambd.getType();
            if (i != 0) {
              break label474;
            }
            localObject = "@T";
            localvx.UQ(q.v(str, j, (String)localObject));
            localvx.kX(true);
            localObject = new xa();
            if (!bi.oW(localm.title)) {
              ((xa)localObject).VJ(localm.title);
            }
            if (!bi.oW(localm.dzA)) {
              ((xa)localObject).VK(localm.dzA);
            }
            if (!bi.oW(localm.dzy)) {
              ((xa)localObject).VM(localm.dzy);
            }
            if (((xa)localObject).boi() > 0)
            {
              ((xa)localObject).CP(1);
              localvy.a((xa)localObject);
            }
            localvx.CF(5);
            localvx.a(localvy);
            localvx.UW(a(localvy.rAJ));
            localvx.UX(b(localvy.rAJ));
            paramch.bJF.bJH.rBI.add(localvx);
            localObject = paramch.bJF.bJI;
            ((wz)localObject).rCc += 1;
            i += 1;
            continue;
          }
          localvx.kY(true);
          continue;
        }
        if (i != 0) {
          break label472;
        }
      }
      catch (Exception parambd)
      {
        x.printErrStackTrace("MicroMsg.GetFavRecordDataSource", parambd, "", new Object[0]);
        x.e("MicroMsg.GetFavRecordDataSource", "retransmit app msg error : %s", new Object[] { parambd.getLocalizedMessage() });
        paramch.bJF.bJL = R.l.favorite_fail_parse_error;
        return false;
      }
      label456:
      paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
      return false;
      label472:
      return true;
      label474:
      Object localObject = "@S";
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */