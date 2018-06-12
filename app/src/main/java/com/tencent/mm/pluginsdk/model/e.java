package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.mw.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvoice.n;
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
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e
{
  public static String BC(int paramInt)
  {
    if (paramInt == 1) {
      return "speex";
    }
    if (paramInt == 4) {
      return "silk";
    }
    return "amr";
  }
  
  private static vx a(bd parambd, g.a parama, int paramInt)
  {
    vx localvx = new vx();
    a(localvx, parambd);
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
      localvx.Va(parama.canvasPageXml);
      localvx.CF(paramInt);
      localvx.UZ(parama.bZN);
      return localvx;
      localvx.kY(true);
    }
  }
  
  private static void a(vx paramvx1, vx paramvx2)
  {
    paramvx1.UI(paramvx2.rzx);
    paramvx1.UJ(paramvx2.rzz);
    paramvx1.UH(paramvx2.rzv);
    paramvx1.UB(paramvx2.title);
    paramvx1.UC(paramvx2.desc);
  }
  
  private static void a(vx paramvx, bd parambd)
  {
    if (parambd.field_isSend == 1)
    {
      if ((com.tencent.mm.model.s.fq(parambd.field_talker)) || (parambd.field_talker.equals("filehelper")))
      {
        paramvx.UT(String.valueOf(parambd.field_msgSvrId));
        return;
      }
      paramvx.UT(parambd.field_talker + "#" + String.valueOf(parambd.field_msgSvrId));
      return;
    }
    paramvx.UT(String.valueOf(parambd.field_msgSvrId));
  }
  
  public static boolean a(ch paramch, int paramInt, String paramString)
  {
    if ((paramch == null) || (bi.oW(paramString)))
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      if (paramch != null) {
        paramch.bJF.bJL = R.l.favorite_fail_argument_error;
      }
      return false;
    }
    x.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    localvx.CF(2);
    localvx.UP(paramString);
    localvx.UO(com.tencent.mm.a.g.u((localvx.toString() + 2 + System.currentTimeMillis()).getBytes()));
    Object localObject = new fz();
    ((fz)localObject).bOL.type = 27;
    ((fz)localObject).bOL.bON = localvx;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((fz)localObject).bOM.bOX;
    com.tencent.mm.sdk.platformtools.c.c(paramString, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject);
    localvx.UQ((String)localObject);
    localwr.Vw(com.tencent.mm.model.q.GF());
    localwr.Vx(com.tencent.mm.model.q.GF());
    localwr.CO(paramInt);
    localwr.fU(bi.VF());
    localwl.a(localwr);
    localwl.rBI.add(localvx);
    paramch.bJF.title = localvx.title;
    paramch.bJF.bJH = localwl;
    paramch.bJF.type = 2;
    return true;
  }
  
  public static boolean a(ch paramch, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    if (bi.oW(paramString1))
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramch.bJF.bJL = R.l.favorite_fail_argument_error;
      return false;
    }
    x.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", new Object[] { paramString2, paramString3, paramString1, Integer.valueOf(paramInt) });
    if (new File(paramString1).length() > com.tencent.mm.k.b.AB())
    {
      paramch.bJF.bJL = R.l.favorite_too_large;
      return false;
    }
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    localvx.UP(paramString1);
    localvx.CF(8);
    localvx.UL(com.tencent.mm.a.e.cp(paramString1));
    localvx.kY(true);
    localvx.UB(paramString2);
    localvx.UC(paramString3);
    localwr.Vw(com.tencent.mm.model.q.GF());
    localwr.Vx(com.tencent.mm.model.q.GF());
    localwr.CO(paramInt);
    localwr.fU(bi.VF());
    localwl.a(localwr);
    localwl.rBI.add(localvx);
    paramch.bJF.title = localvx.title;
    paramch.bJF.desc = localvx.title;
    paramch.bJF.bJH = localwl;
    paramch.bJF.type = 8;
    return true;
  }
  
  public static boolean a(ch paramch, long paramLong)
  {
    return a(paramch, ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramLong));
  }
  
  public static boolean a(ch paramch, Intent paramIntent)
  {
    if (paramch == null)
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
      return false;
    }
    double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
    double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
    int i = paramIntent.getIntExtra("kwebmap_scale", 0);
    Object localObject1 = bi.aG(paramIntent.getStringExtra("Kwebmap_locaion"), "");
    Object localObject2 = paramIntent.getStringExtra("kPoiName");
    paramIntent.getCharSequenceExtra("kRemark");
    paramIntent.getStringArrayListExtra("kTags");
    paramIntent = new we();
    paramIntent.Vn((String)localObject1);
    paramIntent.z(d1);
    paramIntent.y(d2);
    paramIntent.CK(i);
    paramIntent.Vo((String)localObject2);
    localObject1 = new wl();
    localObject2 = new wr();
    String str = com.tencent.mm.model.q.GF();
    ((wr)localObject2).Vw(str);
    ((wr)localObject2).Vx(str);
    ((wr)localObject2).CO(6);
    ((wr)localObject2).fU(bi.VF());
    ((wl)localObject1).b(paramIntent);
    ((wl)localObject1).a((wr)localObject2);
    paramch.bJF.bJH = ((wl)localObject1);
    paramch.bJF.type = 6;
    return true;
  }
  
  public static boolean a(ch paramch, bd parambd)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = true;
    if ((paramch == null) || (parambd == null))
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event or msg is null");
      bool2 = bool1;
      if (paramch != null)
      {
        paramch.bJF.bJL = R.l.favorite_fail_argument_error;
        bool2 = bool1;
      }
      return bool2;
    }
    bd localbd = bd.al(parambd);
    if (localbd.isText())
    {
      parambd = new wl();
      parambd.a(ab(localbd));
      paramch.bJF.bJH = parambd;
      paramch.bJF.desc = localbd.field_content;
      paramch.bJF.type = 1;
      if (com.tencent.mm.ui.tools.g.abd(paramch.bJF.desc) > com.tencent.mm.k.b.Ax())
      {
        paramch.bJF.bJL = R.l.favorite_text_length_over_limit;
        bool1 = bool3;
      }
    }
    Object localObject2;
    label260:
    Object localObject3;
    for (;;)
    {
      paramch.bJF.bJv = localbd.field_content;
      if (!bool1)
      {
        bool2 = bool1;
        if (paramch.bJF.bJL != 0) {
          break;
        }
      }
      com.tencent.mm.plugin.fav.ui.c.a(localbd, paramch, bool1);
      return bool1;
      bool1 = true;
      continue;
      if (localbd.ckz())
      {
        localObject1 = new wl();
        ((wl)localObject1).a(ab(localbd));
        localObject2 = new vx();
        a((vx)localObject2, localbd);
        if (com.tencent.mm.model.s.hB(localbd.field_talker))
        {
          parambd = localbd.field_imgPath;
          parambd = h.b(com.tencent.mm.plugin.record.b.Ge(), "recbiz_", parambd, ".rec", 2);
          if (bi.oW(parambd))
          {
            parambd = null;
            ((vx)localObject2).UP(parambd);
          }
        }
        for (;;)
        {
          ((vx)localObject2).CF(3);
          ((vx)localObject2).kY(true);
          parambd = com.tencent.mm.modelvoice.q.ok(localbd.field_imgPath);
          bool1 = bool3;
          if (parambd == null) {
            break;
          }
          ((vx)localObject2).UL(BC(parambd.getFormat()));
          ((vx)localObject2).CE((int)new n(localbd.field_content).time);
          parambd = new LinkedList();
          parambd.add(localObject2);
          ((wl)localObject1).ar(parambd);
          paramch.bJF.bJH = ((wl)localObject1);
          paramch.bJF.type = 3;
          bool1 = true;
          break;
          new File(parambd).exists();
          break label260;
          ((vx)localObject2).UP(com.tencent.mm.modelvoice.q.getFullPath(localbd.field_imgPath));
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
          parambd = com.tencent.mm.ak.o.Pf().br(localbd.field_msgId);
        }
        if (parambd != null)
        {
          localObject1 = parambd;
          if (parambd.dTK > 0L) {}
        }
        else
        {
          localObject1 = parambd;
          if (localbd.field_msgSvrId > 0L) {
            localObject1 = com.tencent.mm.ak.o.Pf().bq(localbd.field_msgSvrId);
          }
        }
        if (localObject1 == null)
        {
          x.w("MicroMsg.GetFavDataSource", "getImgDataPath: try get imgInfo fail");
          paramch.bJF.bJL = R.l.favorite_fail_image_not_exists;
          bool1 = bool3;
        }
        else
        {
          parambd = new wl();
          parambd.a(ab(localbd));
          localObject2 = new vx();
          a((vx)localObject2, localbd);
          ((vx)localObject2).CF(2);
          ((vx)localObject2).UP(com.tencent.mm.ak.o.Pf().o(com.tencent.mm.ak.f.c((com.tencent.mm.ak.e)localObject1), "", ""));
          if (((com.tencent.mm.ak.e)localObject1).ON())
          {
            localObject1 = com.tencent.mm.ak.o.Pf().hQ(((com.tencent.mm.ak.e)localObject1).dTU);
            if (((com.tencent.mm.ak.e)localObject1).dHI > ((com.tencent.mm.ak.e)localObject1).offset) {
              ((vx)localObject2).UP(com.tencent.mm.ak.o.Pf().o("SERVERID://" + localbd.field_msgSvrId, "", ""));
            }
          }
          ((vx)localObject2).UQ(com.tencent.mm.ak.o.Pf().E(localbd.field_imgPath, true));
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(localObject2);
          parambd.ar((LinkedList)localObject1);
          paramch.bJF.bJH = parambd;
          paramch.bJF.type = 2;
          bool1 = true;
        }
      }
      else if ((localbd.cmj()) || (localbd.cmk()))
      {
        localObject1 = new wl();
        ((wl)localObject1).a(ab(localbd));
        parambd = new vx();
        a(parambd, localbd);
        com.tencent.mm.modelvideo.o.Ta();
        parambd.UQ(com.tencent.mm.modelvideo.s.nL(localbd.field_imgPath));
        parambd.UL(com.tencent.mm.a.e.cp(parambd.rzM));
        localObject2 = t.nW(localbd.field_imgPath);
        x.i("MicroMsg.GetFavDataSource", "video length is %d", new Object[] { Integer.valueOf(((r)localObject2).dHI) });
        if (((r)localObject2).dHI > com.tencent.mm.k.b.AB())
        {
          paramch.bJF.bJL = R.l.favorite_too_large;
          bool1 = bool3;
        }
        else if ((localbd.cmk()) && (t.nY(((r)localObject2).getFileName())))
        {
          paramch.bJF.bJL = R.l.favorite_fail;
          bool1 = bool3;
        }
        else
        {
          if (((r)localObject2).Tp())
          {
            com.tencent.mm.modelvideo.o.Ta();
            localObject3 = com.tencent.mm.modelvideo.s.nK(localbd.field_imgPath);
            x.i("MicroMsg.GetFavDataSource", "this video had finish download, set orgn path [%s]", new Object[] { localObject3 });
            parambd.UP((String)localObject3);
            label947:
            parambd.CE(((r)localObject2).enM);
            localObject2 = new LinkedList();
            ((LinkedList)localObject2).add(parambd);
            ((wl)localObject1).ar((LinkedList)localObject2);
            paramch.bJF.bJH = ((wl)localObject1);
            if (!localbd.cmk()) {
              break label1176;
            }
            paramch.bJF.type = 16;
            parambd.CF(15);
          }
          for (;;)
          {
            localObject1 = t.nW(localbd.field_imgPath);
            parambd.UZ(((r)localObject1).bZN);
            localObject1 = ((r)localObject1).enV;
            if ((localObject1 != null) && (!bi.oW(((bri)localObject1).dyP)))
            {
              localObject2 = new wa();
              ((wa)localObject2).dyJ = ((bri)localObject1).dyJ;
              ((wa)localObject2).rBq = ((bri)localObject1).rBq;
              ((wa)localObject2).dyM = ((bri)localObject1).dyM;
              ((wa)localObject2).dyN = ((bri)localObject1).dyN;
              ((wa)localObject2).dyL = ((bri)localObject1).dyL;
              ((wa)localObject2).dyO = ((bri)localObject1).dyO;
              ((wa)localObject2).dyP = ((bri)localObject1).dyP;
              ((wa)localObject2).dyQ = ((bri)localObject1).dyQ;
              parambd.a((wa)localObject2);
            }
            bool1 = true;
            break;
            x.i("MicroMsg.GetFavDataSource", "this video had not finish download, set orgn path null");
            parambd.UP("");
            break label947;
            label1176:
            paramch.bJF.type = 4;
            parambd.CF(4);
          }
        }
      }
      else
      {
        if (!localbd.cky()) {
          break label1211;
        }
        bool1 = c(paramch, localbd);
      }
    }
    label1211:
    if (localbd.cmi()) {}
    while ((!localbd.aQm()) || (localbd.cmm()))
    {
      paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
      bool1 = bool3;
      break;
    }
    parambd = new wl();
    parambd.a(ab(localbd));
    Object localObject1 = localbd.field_content;
    if (localObject1 == null)
    {
      paramch.bJF.bJL = R.l.favorite_fail_parse_error;
      bool1 = false;
    }
    for (;;)
    {
      break;
      localObject1 = g.a.gp((String)localObject1);
      if (localObject1 == null)
      {
        paramch.bJF.bJL = R.l.favorite_fail_parse_error;
        bool1 = false;
      }
      else
      {
        paramch.bJF.bJH = parambd;
        localObject2 = parambd.rBG;
        ((wr)localObject2).VC(((g.a)localObject1).appId);
        ((wr)localObject2).VE(((g.a)localObject1).bZG);
        switch (((g.a)localObject1).type)
        {
        default: 
          paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
          bool1 = false;
          break;
        case 1: 
          paramch.bJF.bJH = parambd;
          paramch.bJF.desc = ((g.a)localObject1).title;
          paramch.bJF.type = 1;
          bool1 = bool2;
          break;
        case 2: 
          if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
          {
            paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
            bool1 = false;
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.ac.a.asF().SR(((g.a)localObject1).bGP);
            localObject2 = new vx();
            a((vx)localObject2, localbd);
            if (localObject3 != null) {
              ((vx)localObject2).UP(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            }
            localObject3 = com.tencent.mm.ak.o.Pf().E(localbd.field_imgPath, true);
            if (com.tencent.mm.a.e.cn((String)localObject3)) {
              ((vx)localObject2).UQ((String)localObject3);
            }
            ((vx)localObject2).CF(2);
            ((vx)localObject2).UB(((g.a)localObject1).title);
            ((vx)localObject2).UC(((g.a)localObject1).description);
            parambd.rBI.add(localObject2);
            paramch.bJF.type = 2;
            bool1 = bool2;
          }
          break;
        case 3: 
          localObject1 = a(localbd, (g.a)localObject1, 7);
          parambd.rBI.add(localObject1);
          paramch.bJF.type = 7;
          bool1 = bool2;
          break;
        case 4: 
          localObject1 = a(localbd, (g.a)localObject1, 4);
          parambd.Vu(((vx)localObject1).title);
          parambd.Vv(((vx)localObject1).desc);
          parambd.rBI.add(localObject1);
          paramch.bJF.type = 4;
          bool1 = bool2;
          break;
        case 5: 
          if ((((g.a)localObject1).url != null) && (!((g.a)localObject1).url.equals("")))
          {
            parambd.rBG.VD(((g.a)localObject1).url);
            localObject1 = a(localbd, (g.a)localObject1, 5);
            parambd.rBI.add(localObject1);
            parambd.Vu(((vx)localObject1).title);
            parambd.Vv(((vx)localObject1).desc);
            paramch.bJF.type = 5;
            bool1 = bool2;
          }
          else
          {
            paramch.bJF.bJL = R.l.favorite_fail_empty_url;
            bool1 = false;
          }
          break;
        case 6: 
          if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
          {
            paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
            bool1 = false;
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.ac.a.asF().SR(((g.a)localObject1).bGP);
            localObject2 = new vx();
            if (localObject3 != null) {
              ((vx)localObject2).UP(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            }
            a((vx)localObject2, localbd);
            ((vx)localObject2).CF(8);
            ((vx)localObject2).UL(((g.a)localObject1).dwp);
            localObject3 = com.tencent.mm.ak.o.Pf().E(localbd.field_imgPath, true);
            if (bi.oW((String)localObject3)) {
              ((vx)localObject2).kY(true);
            }
            if (com.tencent.mm.a.e.cn((String)localObject3)) {
              ((vx)localObject2).UQ((String)localObject3);
            }
            ((vx)localObject2).UB(((g.a)localObject1).title);
            ((vx)localObject2).UC(((g.a)localObject1).description);
            parambd.rBI.add(localObject2);
            paramch.bJF.desc = ((g.a)localObject1).title;
            paramch.bJF.type = 8;
            bool1 = bool2;
          }
          break;
        case 7: 
          if ((((g.a)localObject1).bGP == null) || (((g.a)localObject1).bGP.length() == 0)) {
            paramch.bJF.bJL = R.l.favorite_fail_attachment_not_exists;
          }
          while (com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
          {
            paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
            bool1 = false;
            break;
          }
          paramch.bJF.bJL = R.l.favorite_fail_sdcard_not_available;
          bool1 = false;
          break;
        case 10: 
          localObject2 = new wk();
          ((wk)localObject2).Vp(((g.a)localObject1).title);
          ((wk)localObject2).Vq(((g.a)localObject1).description);
          ((wk)localObject2).CL(((g.a)localObject1).dwR);
          ((wk)localObject2).Vs(((g.a)localObject1).dwS);
          ((wk)localObject2).Vr(((g.a)localObject1).thumburl);
          paramch.bJF.title = ((g.a)localObject1).title;
          paramch.bJF.desc = ((g.a)localObject1).description;
          paramch.bJF.type = 10;
          parambd.b((wk)localObject2);
          bool1 = bool2;
          break;
        case 20: 
          localObject2 = new wu();
          ((wu)localObject2).VF(((g.a)localObject1).title);
          ((wu)localObject2).VG(((g.a)localObject1).description);
          ((wu)localObject2).VI(((g.a)localObject1).dwV);
          ((wu)localObject2).VH(((g.a)localObject1).thumburl);
          paramch.bJF.title = ((g.a)localObject1).title;
          paramch.bJF.desc = ((g.a)localObject1).description;
          paramch.bJF.type = 15;
          parambd.b((wu)localObject2);
          bool1 = bool2;
          break;
        case 13: 
          localObject2 = new wk();
          ((wk)localObject2).Vp(((g.a)localObject1).title);
          ((wk)localObject2).Vq(((g.a)localObject1).description);
          ((wk)localObject2).CL(((g.a)localObject1).dwX);
          ((wk)localObject2).Vs(((g.a)localObject1).dwY);
          ((wk)localObject2).Vr(((g.a)localObject1).thumburl);
          paramch.bJF.title = ((g.a)localObject1).title;
          paramch.bJF.desc = ((g.a)localObject1).description;
          paramch.bJF.type = 11;
          parambd.b((wk)localObject2);
          bool1 = bool2;
          break;
        case 19: 
        case 24: 
          paramch.bJF.bJI = new wz();
          bool1 = a(paramch, (g.a)localObject1, parambd, localbd);
          break;
        case 33: 
        case 36: 
          localObject2 = new vv();
          ((vv)localObject2).username = ((g.a)localObject1).dyS;
          ((vv)localObject2).appId = ((g.a)localObject1).dyT;
          ((vv)localObject2).bPh = ((g.a)localObject1).dyW;
          ((vv)localObject2).iconUrl = ((g.a)localObject1).dzb;
          ((vv)localObject2).bGH = ((g.a)localObject1).dyR;
          ((vv)localObject2).rzd = ((g.a)localObject1).bZH;
          localObject3 = new vx();
          a((vx)localObject3, localbd);
          ((vx)localObject3).CF(19);
          String str = com.tencent.mm.ak.o.Pf().E(localbd.field_imgPath, true);
          if (bi.oW(str)) {
            ((vx)localObject3).kY(true);
          }
          if (com.tencent.mm.a.e.cn(str)) {
            ((vx)localObject3).UQ(str);
          }
          ((vx)localObject3).UB(((g.a)localObject1).title);
          ((vx)localObject3).UC(((g.a)localObject1).description);
          parambd.rBI.add(localObject3);
          paramch.bJF.title = ((g.a)localObject1).title;
          paramch.bJF.desc = ((g.a)localObject1).description;
          paramch.bJF.type = 19;
          parambd.rBa = ((vv)localObject2);
          parambd.rBb = true;
          bool1 = bool2;
        }
      }
    }
  }
  
  private static boolean a(ch paramch, g.a parama, wl paramwl, bd parambd)
  {
    Object localObject1 = new mw();
    ((mw)localObject1).bXL.type = 0;
    ((mw)localObject1).bXL.bXN = parama.dwW;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    com.tencent.mm.protocal.b.a.c localc = ((mw)localObject1).bXM.bXV;
    if (localc == null)
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, parse record msg null");
      paramch.bJF.bJL = R.l.favorite_fail_parse_error;
      return false;
    }
    paramwl.Vu(localc.title);
    Iterator localIterator = localc.dzs.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      localObject1 = (vx)localIterator.next();
      switch (((vx)localObject1).bjS)
      {
      case 9: 
      case 13: 
      case 18: 
      default: 
        parama = null;
        label218:
        if (parama != null) {
          if (parambd.field_isSend == 1) {
            if ((com.tencent.mm.model.s.fq(parambd.field_talker)) || (parambd.field_talker.equals("filehelper")))
            {
              localObject1 = String.format("%d$%d", new Object[] { Long.valueOf(parambd.field_msgSvrId), Integer.valueOf(i) });
              label282:
              parama.UT((String)localObject1);
              paramwl.rBI.add(parama);
              i += 1;
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      break;
      long l = parambd.field_msgId;
      parama = p((vx)localObject1);
      parama.CF(3);
      if (!bi.oW(((vx)localObject1).rAq))
      {
        localObject2 = new mw();
        ((mw)localObject2).bXL.type = 1;
        ((mw)localObject2).bXL.bOz = ((vx)localObject1);
        ((mw)localObject2).bXL.bJC = l;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
          x.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
        }
        parama.UP(((mw)localObject2).bXM.bXW);
        parama.CE(((vx)localObject1).duration);
        parama.kY(true);
        parama.kX(false);
        parama.UL(((vx)localObject1).rzD);
      }
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCa += 1;
      break label218;
      parama = p((vx)localObject1);
      parama.CF(1);
      parama.UC(((vx)localObject1).desc);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rBY += 1;
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      parama.CF(2);
      Object localObject2 = new mw();
      ((mw)localObject2).bXL.type = 1;
      ((mw)localObject2).bXL.bOz = ((vx)localObject1);
      ((mw)localObject2).bXL.bJC = l;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
        x.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
      }
      parama.UP(((mw)localObject2).bXM.bXW);
      parama.UQ(((mw)localObject2).bXM.bOX);
      parama.kY(false);
      parama.kX(false);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rBZ += 1;
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      a(parama, (vx)localObject1);
      parama.CF(5);
      localObject2 = new mw();
      ((mw)localObject2).bXL.type = 1;
      ((mw)localObject2).bXL.bOz = ((vx)localObject1);
      ((mw)localObject2).bXL.bJC = l;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
        x.e("MicroMsg.GetFavDataSource", "cloneUrlItem:not record plugin ? get paths error");
      }
      parama.UQ(((mw)localObject2).bXM.bOX);
      parama.kY(false);
      if ((((vx)localObject1).rAi != null) && (((vx)localObject1).rAi.rAN != null))
      {
        localObject2 = new xa();
        ((xa)localObject2).VJ(((vx)localObject1).rAi.rAN.title);
        ((xa)localObject2).VK(((vx)localObject1).rAi.rAN.desc);
        ((xa)localObject2).VM(((vx)localObject1).rAi.rAN.thumbUrl);
        ((xa)localObject2).CP(((vx)localObject1).rAi.rAN.rCp);
        ((xa)localObject2).VL(((vx)localObject1).rAi.rAN.rCn);
        parama.rAi.a((xa)localObject2);
      }
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCc += 1;
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      a(parama, (vx)localObject1);
      if (((vx)localObject1).bjS == 15) {
        parama.CF(15);
      }
      for (;;)
      {
        localObject2 = new mw();
        ((mw)localObject2).bXL.type = 1;
        ((mw)localObject2).bXL.bOz = ((vx)localObject1);
        ((mw)localObject2).bXL.bJC = l;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
          x.e("MicroMsg.GetFavDataSource", "cloneVideoItem:not record plugin ? get paths error");
        }
        parama.kX(false);
        parama.UP(((mw)localObject2).bXM.bXW);
        parama.kY(false);
        parama.UQ(((mw)localObject2).bXM.bOX);
        parama.CE(((vx)localObject1).duration);
        localObject1 = paramch.bJF.bJI;
        ((wz)localObject1).rCb += 1;
        break;
        parama.CF(4);
      }
      parama = p((vx)localObject1);
      parama.CF(6);
      if ((((vx)localObject1).rAi != null) && (((vx)localObject1).rAi.rAL != null))
      {
        localObject2 = new we();
        ((we)localObject2).Vn(((vx)localObject1).rAi.rAL.label);
        ((we)localObject2).z(((vx)localObject1).rAi.rAL.lat);
        ((we)localObject2).y(((vx)localObject1).rAi.rAL.lng);
        ((we)localObject2).CK(((vx)localObject1).rAi.rAL.bSz);
        ((we)localObject2).Vo(((vx)localObject1).rAi.rAL.bWB);
        parama.rAi.a((we)localObject2);
      }
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCd += 1;
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      a(parama, (vx)localObject1);
      parama.CF(7);
      localObject2 = new mw();
      ((mw)localObject2).bXL.type = 1;
      ((mw)localObject2).bXL.bOz = ((vx)localObject1);
      ((mw)localObject2).bXL.bJC = l;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
        x.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
      }
      parama.UQ(((mw)localObject2).bXM.bOX);
      parama.kY(false);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCe += 1;
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      a(parama, (vx)localObject1);
      parama.CF(8);
      localObject2 = new mw();
      ((mw)localObject2).bXL.type = 1;
      ((mw)localObject2).bXL.bOz = ((vx)localObject1);
      ((mw)localObject2).bXL.bJC = l;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bi.oW(((mw)localObject2).bXM.bXW)) && (bi.oW(((mw)localObject2).bXM.bOX))) {
        x.e("MicroMsg.GetFavDataSource", "cloneFileItem:not record plugin ? get paths error");
      }
      parama.UP(((mw)localObject2).bXM.bXW);
      parama.UQ(((mw)localObject2).bXM.bOX);
      parama.kX(false);
      parama.UL(((vx)localObject1).rzD);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCf += 1;
      break label218;
      parama = c((vx)localObject1, ((vx)localObject1).bjS);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCh += 1;
      break label218;
      parama = c((vx)localObject1, ((vx)localObject1).bjS);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCi += 1;
      break label218;
      parama = p((vx)localObject1);
      parama.CF(14);
      if ((((vx)localObject1).rAi != null) && (((vx)localObject1).rAi.rAR != null))
      {
        localObject2 = new wu();
        ((wu)localObject2).VF(((vx)localObject1).rAi.rAR.title);
        ((wu)localObject2).VG(((vx)localObject1).rAi.rAR.desc);
        ((wu)localObject2).VI(((vx)localObject1).rAi.rAR.info);
        ((wu)localObject2).VH(((vx)localObject1).rAi.rAR.thumbUrl);
        parama.rAi.a((wu)localObject2);
      }
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCl += 1;
      break label218;
      parama = p((vx)localObject1);
      parama.CF(16);
      parama.UC(((vx)localObject1).desc);
      localObject1 = paramch.bJF.bJI;
      ((wz)localObject1).rCm += 1;
      break label218;
      parama = p((vx)localObject1);
      parama.UB(((vx)localObject1).title);
      parama.UC(((vx)localObject1).desc);
      parama.CF(17);
      parama.Vb(((vx)localObject1).rAy);
      break label218;
      l = parambd.field_msgId;
      parama = p((vx)localObject1);
      parama.UB(((vx)localObject1).title);
      parama.UC(((vx)localObject1).desc);
      parama.CF(19);
      localObject2 = new mw();
      ((mw)localObject2).bXL.type = 1;
      ((mw)localObject2).bXL.bOz = ((vx)localObject1);
      ((mw)localObject2).bXL.bJC = l;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      if (bi.oW(((mw)localObject2).bXM.bOX)) {
        x.e("MicroMsg.GetFavDataSource", "cloneAppBrandItem:not record plugin ? get paths error");
      }
      for (;;)
      {
        if ((((vx)localObject1).rAi != null) && (((vx)localObject1).rAi.rBa != null))
        {
          localObject2 = new vv();
          ((vv)localObject2).username = ((vx)localObject1).rAi.rBa.username;
          ((vv)localObject2).appId = ((vx)localObject1).rAi.rBa.appId;
          ((vv)localObject2).bPh = ((vx)localObject1).rAi.rBa.bPh;
          ((vv)localObject2).iconUrl = ((vx)localObject1).rAi.rBa.iconUrl;
          ((vv)localObject2).type = ((vx)localObject1).rAi.rBa.type;
          ((vv)localObject2).bGH = ((vx)localObject1).rAi.rBa.bGH;
          ((vv)localObject2).rzd = ((vx)localObject1).rAi.rBa.rzd;
          parama.rAi.a((vv)localObject2);
        }
        break;
        parama.kY(false);
        parama.UQ(((mw)localObject2).bXM.bOX);
      }
      localObject1 = String.format("%s#%d$%d", new Object[] { parambd.field_talker, Long.valueOf(parambd.field_msgSvrId), Integer.valueOf(i) });
      break label282;
      localObject1 = String.format("%d$%d", new Object[] { Long.valueOf(parambd.field_msgSvrId), Integer.valueOf(i) });
      break label282;
      if ((!bi.oW(((vx)localc.dzs.get(0)).rzD)) && (((vx)localc.dzs.get(0)).rzD.equals(".htm"))) {}
      for (paramch.bJF.type = 18;; paramch.bJF.type = 14) {
        return true;
      }
    }
  }
  
  private static wr ab(bd parambd)
  {
    wr localwr = new wr();
    if (parambd.field_isSend == 1)
    {
      localwr.Vw(com.tencent.mm.model.q.GF());
      localwr.Vx(parambd.field_talker);
      if (com.tencent.mm.model.s.fq(parambd.field_talker)) {
        localwr.Vz(localwr.bSS);
      }
    }
    do
    {
      localwr.CO(1);
      localwr.fU(parambd.field_createTime);
      localwr.VA(parambd.field_msgSvrId);
      if (parambd.field_msgSvrId > 0L) {
        localwr.Vy(parambd.field_msgSvrId);
      }
      return localwr;
      localwr.Vw(parambd.field_talker);
      localwr.Vx(com.tencent.mm.model.q.GF());
    } while (!com.tencent.mm.model.s.fq(parambd.field_talker));
    if (parambd.field_content != null) {}
    for (String str = parambd.field_content.substring(0, Math.max(0, parambd.field_content.indexOf(':')));; str = "")
    {
      localwr.Vz(str);
      if ((bi.oW(localwr.rBh)) || (parambd.ckz())) {
        break;
      }
      parambd.setContent(parambd.field_content.substring(localwr.rBh.length() + 1));
      if ((parambd.field_content.length() > 0) && ('\n' == parambd.field_content.charAt(0))) {
        parambd.setContent(parambd.field_content.substring(1));
      }
      if (!parambd.cmt()) {
        break;
      }
      parambd.es(parambd.field_transContent.substring(localwr.rBh.length() + 1));
      if ((parambd.field_transContent.length() <= 0) || ('\n' != parambd.field_transContent.charAt(0))) {
        break;
      }
      parambd.es(parambd.field_transContent.substring(1));
      break;
    }
  }
  
  private static boolean b(ch paramch, bd parambd)
  {
    wl localwl = new wl();
    localwl.a(ab(parambd));
    parambd = bl.z(parambd.field_content, "msg");
    if (parambd != null) {
      try
      {
        we localwe = new we();
        localwe.Vn((String)parambd.get(".msg.location.$label"));
        localwe.z(Double.parseDouble((String)parambd.get(".msg.location.$x")));
        localwe.y(Double.parseDouble((String)parambd.get(".msg.location.$y")));
        localwe.CK(Integer.valueOf((String)parambd.get(".msg.location.$scale")).intValue());
        localwe.Vo((String)parambd.get(".msg.location.$poiname"));
        localwl.b(localwe);
        paramch.bJF.type = 6;
        paramch.bJF.bJH = localwl;
        return true;
      }
      catch (Exception parambd)
      {
        x.e("MicroMsg.GetFavDataSource", "parse failed, %s", new Object[] { parambd.getStackTrace().toString() });
      }
    }
    paramch.bJF.bJL = R.l.favorite_fail_parse_error;
    return false;
  }
  
  public static boolean b(ch paramch, String paramString, int paramInt)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramch.bJF.bJL = R.l.favorite_fail_argument_error;
      return false;
    }
    x.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple text), %s, sourceType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    wl localwl = new wl();
    wr localwr = new wr();
    localwr.Vw(com.tencent.mm.model.q.GF());
    localwr.Vx(com.tencent.mm.model.q.GF());
    localwr.CO(paramInt);
    localwr.fU(bi.VF());
    localwl.a(localwr);
    paramch.bJF.desc = paramString;
    paramch.bJF.bJH = localwl;
    paramch.bJF.type = 1;
    return true;
  }
  
  private static vx c(vx paramvx, int paramInt)
  {
    vx localvx = p(paramvx);
    localvx.CF(paramInt);
    if ((paramvx.rAi != null) && (paramvx.rAi.rAP != null))
    {
      wk localwk = new wk();
      localwk.Vp(paramvx.rAi.rAP.title);
      localwk.Vq(paramvx.rAi.rAP.desc);
      localwk.CL(paramvx.rAi.rAP.type);
      localwk.Vs(paramvx.rAi.rAP.info);
      localwk.Vr(paramvx.rAi.rAP.thumbUrl);
      localvx.rAi.a(localwk);
    }
    return localvx;
  }
  
  private static boolean c(ch paramch, bd parambd)
  {
    wl localwl = new wl();
    Object localObject1 = ab(parambd);
    localwl.a((wr)localObject1);
    for (;;)
    {
      try
      {
        Object localObject2 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(parambd.field_content);
        Object localObject3 = ((l)localObject2).dzs;
        ((wr)localObject1).VE(((l)localObject2).bZG);
        if ((localObject3 != null) && (((List)localObject3).size() > paramch.bJF.bJJ))
        {
          x.i("MicroMsg.GetFavDataSource", "favorite biz msg, index is %d", new Object[] { Integer.valueOf(paramch.bJF.bJJ) });
          localObject2 = (m)((List)localObject3).get(paramch.bJF.bJJ);
          if (com.tencent.mm.y.i.gr(((m)localObject2).dzD))
          {
            paramch.bJF.bJL = R.l.favorite_fail_nonsupport;
            return false;
          }
          ((wr)localObject1).VD(((m)localObject2).url);
          if (paramch.bJF.bJJ > 0) {
            ((wr)localObject1).Vy("");
          }
          localObject3 = new vx();
          ((vx)localObject3).UB(((m)localObject2).title);
          ((vx)localObject3).UC(((m)localObject2).dzA);
          a((vx)localObject3, parambd);
          localObject1 = ((m)localObject2).dzy;
          if (!bi.oW((String)localObject1)) {
            break label459;
          }
          j localj = com.tencent.mm.aa.q.KH().kc(parambd.field_talker);
          if (localj == null) {
            break label459;
          }
          localObject1 = localj.Kx();
          if (!bi.oW((String)localObject1))
          {
            int i = parambd.getType();
            if (paramch.bJF.bJJ <= 0) {
              break label462;
            }
            parambd = "@S";
            ((vx)localObject3).UQ(q.v((String)localObject1, i, parambd));
            ((vx)localObject3).kY(false);
            if ((bi.oW(((vx)localObject3).rzO)) || (!FileOp.cn(((vx)localObject3).rzO)))
            {
              ((vx)localObject3).UK((String)localObject1);
              ((vx)localObject3).kY(true);
              parambd = new xa();
              parambd.VM((String)localObject1);
              localwl.b(parambd);
            }
            ((vx)localObject3).kX(true);
            ((vx)localObject3).CF(5);
            localwl.rBI.add(localObject3);
            paramch.bJF.bJH = localwl;
            paramch.bJF.desc = ((m)localObject2).title;
            paramch.bJF.type = 5;
            return true;
          }
          ((vx)localObject3).kY(true);
          continue;
        }
        continue;
      }
      catch (Exception parambd)
      {
        x.printErrStackTrace("MicroMsg.GetFavDataSource", parambd, "", new Object[0]);
        x.e("MicroMsg.GetFavDataSource", "retransmit app msg error : %s", new Object[] { parambd.getLocalizedMessage() });
        paramch.bJF.bJL = R.l.favorite_fail_parse_error;
        return false;
      }
      label459:
      label462:
      parambd = "@T";
    }
  }
  
  private static vx p(vx paramvx)
  {
    vx localvx = new vx();
    vy localvy = new vy();
    vz localvz1 = new vz();
    vz localvz2 = paramvx.rAi.rAJ;
    if (localvz2.rBd) {
      localvz1.Vf(localvz2.bSS);
    }
    if (localvz2.rBe) {
      localvz1.Vg(localvz2.toUser);
    }
    if (localvz2.rBi) {
      localvz1.Vi(localvz2.rBh);
    }
    localvz1.CJ(1);
    localvz1.fR(bi.VF());
    localvy.c(localvz1);
    localvx.a(localvy);
    localvx.UW(paramvx.rAk);
    localvx.UX(paramvx.rAm);
    localvx.kY(true);
    localvx.kX(true);
    localvx.UY(paramvx.rAq);
    localvx.CH(paramvx.rAw);
    localvx.UM(paramvx.rzF);
    localvx.UN(paramvx.rzH);
    localvx.fO(paramvx.rzJ);
    localvx.UR(paramvx.rzQ);
    localvx.US(paramvx.rzS);
    localvx.fP(paramvx.rzU);
    return localvx;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */