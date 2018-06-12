package com.tencent.mm.plugin.sns.i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.a;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.atg;
import com.tencent.mm.protocal.c.brh;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public static void a(vx paramvx, n paramn)
  {
    if (paramn != null) {
      a(paramvx, paramn.bAJ());
    }
  }
  
  private static void a(vx paramvx, bsu parambsu)
  {
    if ((paramvx != null) && (parambsu != null) && (!bi.oW(parambsu.nNV))) {
      paramvx.UZ(parambsu.nNV);
    }
  }
  
  public static boolean a(ch paramch, n paramn)
  {
    if (paramn == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill sight favorite event fail, event is null or tlObj is null");
      paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      return false;
    }
    wl localwl = new wl();
    Object localObject2 = new wr();
    bsu localbsu = paramn.bAJ();
    ate localate = (ate)localbsu.sqc.ruA.get(0);
    if ((paramn.xb(32)) && (localbsu.sqc.ruz == 15))
    {
      localbsu.sqh.dyP = paramn.bAH().ntU;
      localbsu.sqh.dyQ = localbsu.ksA;
    }
    Object localObject1 = String.format("%s#%s", new Object[] { i.eF(paramn.field_snsId), localate.ksA });
    ((wr)localObject2).Vw(paramn.field_userName);
    ((wr)localObject2).Vx(q.GF());
    ((wr)localObject2).CO(2);
    ((wr)localObject2).fU(bi.VF());
    ((wr)localObject2).VB(paramn.bAK());
    ((wr)localObject2).Vy((String)localObject1);
    localwl.a((wr)localObject2);
    localObject2 = new vx();
    ((vx)localObject2).UT((String)localObject1);
    localObject1 = an.s(af.getAccSnsPath(), localate.ksA);
    Object localObject4 = i.j(localate);
    Object localObject3 = i.e(localate);
    if (bi.oW(aq.a(paramn.bBe(), localate)))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "this sight had no download finish, can not favorite.");
      paramch.bJF.bJL = i.j.favorite_fail_sns_sight;
      return false;
    }
    if (!FileOp.cn((String)localObject1 + (String)localObject4))
    {
      x.i("MicroMsg.Sns.GetFavDataSource", "fav error sight: " + FileOp.cn(new StringBuilder().append((String)localObject1).append((String)localObject4).toString()) + " thumb:" + FileOp.cn(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
      paramch.bJF.bJL = i.j.favorite_fail_sns_sight;
      return false;
    }
    int j;
    int i;
    Bitmap localBitmap;
    if (!FileOp.cn((String)localObject1 + (String)localObject3))
    {
      int k = 320;
      int m = 240;
      j = m;
      i = k;
      if (localate.rVH != null)
      {
        j = m;
        i = k;
        if (localate.rVH.rWv > 0.0F)
        {
          j = m;
          i = k;
          if (localate.rVH.rWu > 0.0F)
          {
            i = (int)localate.rVH.rWu;
            j = (int)localate.rVH.rWv;
          }
        }
      }
      localBitmap = d.ad((String)localObject1 + (String)localObject4, i, j);
      if (localBitmap == null)
      {
        x.i("MicroMsg.Sns.GetFavDataSource", "fav error on get thumb:" + FileOp.cn(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramch.bJF.bJL = i.j.favorite_fail_sns_sight;
        return false;
      }
    }
    for (;;)
    {
      try
      {
        c.a(localBitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject1 + (String)localObject3, true);
        ((vx)localObject2).UP((String)localObject1 + (String)localObject4);
        ((vx)localObject2).UQ((String)localObject1 + (String)localObject3);
        if (bi.oW(localate.rVP))
        {
          localObject1 = localbsu.spZ;
          ((vx)localObject2).UB((String)localObject1);
          ((vx)localObject2).Va(localbsu.ogR);
          if (!bi.oW(localbsu.ogR))
          {
            localObject1 = bl.z(localbsu.ogR, "adxml");
            if (((Map)localObject1).size() > 0)
            {
              ((vx)localObject2).UB(bi.aG((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareTitle"), ""));
              ((vx)localObject2).UC(bi.aG((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareDesc"), ""));
            }
          }
          j = 4;
          if (!paramn.xb(32)) {
            break label1223;
          }
          localObject3 = paramn.bAF();
          localObject4 = new wa();
          if (!bi.oW(localate.rVP)) {
            break label1193;
          }
          localObject1 = localbsu.spZ;
          ((wa)localObject4).dyL = ((String)localObject1);
          ((wa)localObject4).rBq = localate.oig;
          ((wa)localObject4).dyJ = localate.rVL;
          ((wa)localObject4).dyP = localbsu.sqh.dyP;
          ((wa)localObject4).dyQ = localbsu.sqh.dyQ;
          if (bi.oW(((wa)localObject4).dyQ)) {
            ((wa)localObject4).dyQ = localbsu.ksA;
          }
          if (!bi.oW(localate.rVO)) {
            break label1203;
          }
          localObject1 = localate.rVE;
          ((wa)localObject4).dyO = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).nyL == 0))
          {
            ((wa)localObject4).dyN = ((com.tencent.mm.plugin.sns.storage.b)localObject3).nyN;
            ((wa)localObject4).dyM = ((com.tencent.mm.plugin.sns.storage.b)localObject3).nyM;
          }
          ((vx)localObject2).a((wa)localObject4);
          i = 16;
          j = 15;
          ((vx)localObject2).CF(j);
          localObject1 = d.Lo(((vx)localObject2).rzM);
          if (localObject1 == null) {
            break label1213;
          }
          ((vx)localObject2).CE(((com.tencent.mm.plugin.sight.base.a)localObject1).bvB());
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(localObject2);
          localwl.ar((LinkedList)localObject1);
          paramch.bJF.bJH = localwl;
          paramch.bJF.type = i;
          a((vx)localObject2, paramn);
          x.i("MicroMsg.Sns.GetFavDataSource", "fill event Info sight dataType %d eventType %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          return true;
        }
      }
      catch (Exception paramn)
      {
        x.printErrStackTrace("MicroMsg.Sns.GetFavDataSource", paramn, "save bmp error %s", new Object[] { paramn.getMessage() });
        x.i("MicroMsg.Sns.GetFavDataSource", "fav error on save thumb:" + FileOp.cn(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramch.bJF.bJL = i.j.favorite_fail_sns_sight;
        return false;
      }
      localObject1 = localate.rVP;
      continue;
      label1193:
      localObject1 = localate.rVP;
      continue;
      label1203:
      localObject1 = localate.rVO;
      continue;
      label1213:
      ((vx)localObject2).CE(1);
      continue;
      label1223:
      i = 4;
    }
  }
  
  public static boolean a(ch paramch, n paramn, String paramString)
  {
    if ((paramch == null) || (bi.oW(paramString)))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
      if (paramch != null) {
        paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      }
      return false;
    }
    if (paramn == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    ate localate = aj.a(paramn, paramString);
    if (localate == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    String str = String.format("%s#%s", new Object[] { i.eF(paramn.field_snsId), paramString });
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    x.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", new Object[] { paramn.field_userName });
    localwr.Vw(paramn.field_userName);
    localwr.Vx(q.GF());
    localwr.CO(2);
    localwr.fU(paramn.field_createTime * 1000L);
    localwr.VB(paramn.bAK());
    localwr.Vy(str);
    localvx.UT(str);
    localvx.UP(an.s(af.getAccSnsPath(), paramString) + i.l(localate));
    if (paramn.bAJ() != null)
    {
      localvx.Va(paramn.bAJ().ogR);
      if (!bi.oW(paramn.bAJ().ogR))
      {
        paramString = bl.z(paramn.bAJ().ogR, "adxml");
        if (paramString.size() > 0)
        {
          localvx.UB(bi.aG((String)paramString.get(".adxml.adCanvasInfo.shareTitle"), ""));
          localvx.UC(bi.aG((String)paramString.get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
    }
    a(localvx, paramn);
    paramString = an.s(af.getAccSnsPath(), localate.ksA) + i.e(localate);
    if ((!FileOp.cn(localvx.rzM)) && (paramn.field_userName.endsWith(af.bxU())))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    if (FileOp.cn(paramString)) {
      localvx.UQ(paramString);
    }
    for (;;)
    {
      localvx.CF(2);
      localwl.rBI.add(localvx);
      localwl.a(localwr);
      paramch.bJF.bJH = localwl;
      paramch.bJF.type = 2;
      return true;
      localvx.kY(true);
      localvx.UK(localate.rVE);
      paramn = new xa();
      paramn.VM(localate.rVE);
      localwl.b(paramn);
    }
  }
  
  public static boolean a(ch paramch, String paramString, int paramInt)
  {
    if ((v.NH(paramString)) || (paramInt < 0))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
      paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      return false;
    }
    if (af.bxX())
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramch.bJF.bJL = i.j.favorite_fail_system_error;
      return false;
    }
    paramString = af.byo().Nl(paramString);
    if (paramString == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    ate localate = aj.a(paramString, paramInt);
    if (localate == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    return a(paramch, paramString, localate.ksA);
  }
  
  public static boolean a(ch paramch, String paramString, CharSequence paramCharSequence)
  {
    if ((v.NH(paramString)) || (paramCharSequence == null))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
      paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      return false;
    }
    if (af.bxX())
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramch.bJF.bJL = i.j.favorite_fail_system_error;
      return false;
    }
    paramString = af.byo().Nl(paramString);
    if (paramString == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    if (0L == paramString.field_snsId)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
      paramch.bJF.bJL = i.j.favorite_fail;
      return false;
    }
    String str = String.format("%s#0", new Object[] { i.eF(paramString.field_snsId) });
    wl localwl = new wl();
    wr localwr = new wr();
    x.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s", new Object[] { paramString.field_userName });
    localwr.Vw(paramString.field_userName);
    localwr.Vx(q.GF());
    localwr.CO(2);
    localwr.fU(paramString.field_createTime * 1000L);
    localwr.VB(paramString.bAK());
    localwr.Vy(str);
    localwl.a(localwr);
    paramch.bJF.bJH = localwl;
    paramch.bJF.desc = paramCharSequence.toString();
    paramch.bJF.type = 1;
    return true;
  }
  
  public static boolean a(ch paramch, String paramString1, String paramString2)
  {
    if ((paramch == null) || (!v.NG(paramString2)) || (paramString1 == null))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramch != null) {
        paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      }
      return false;
    }
    if (af.bxX())
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramch.bJF.bJL = i.j.favorite_fail_system_error;
      return false;
    }
    Object localObject1 = h.Nl(paramString2);
    if (localObject1 == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    if ((((n)localObject1).bAJ().sqc != null) && (((n)localObject1).bAJ().sqc.ruz == 26)) {
      return b(paramch, paramString2);
    }
    paramString2 = "0";
    Object localObject2 = aj.a((n)localObject1, 0);
    if (localObject2 != null) {
      paramString2 = ((ate)localObject2).ksA;
    }
    Object localObject3 = String.format("%s#%s", new Object[] { i.eF(((n)localObject1).field_snsId), paramString2 });
    paramString2 = new wl();
    wr localwr = new wr();
    x.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", new Object[] { ((n)localObject1).field_userName });
    localwr.Vw(((n)localObject1).field_userName);
    localwr.Vx(q.GF());
    localwr.CO(2);
    localwr.fU(((n)localObject1).field_createTime * 1000L);
    localwr.VB(((n)localObject1).bAK());
    localwr.Vy((String)localObject3);
    localwr.VD(paramString1);
    paramString1 = new vx();
    paramString1.UT((String)localObject3);
    if (localObject2 != null)
    {
      localObject3 = an.s(af.getAccSnsPath(), ((ate)localObject2).ksA) + i.e((ate)localObject2);
      if (FileOp.cn((String)localObject3)) {
        paramString1.UQ((String)localObject3);
      }
    }
    for (;;)
    {
      paramString1.CF(5);
      localObject1 = ((n)localObject1).bAJ();
      paramString1.UB(((bsu)localObject1).sqc.bHD);
      paramString1.UC(((bsu)localObject1).sqc.jOS);
      paramString1.Va(((bsu)localObject1).ogR);
      if (!bi.oW(((bsu)localObject1).ogR))
      {
        localObject2 = bl.z(((bsu)localObject1).ogR, "adxml");
        if (((Map)localObject2).size() > 0)
        {
          paramString1.UB(bi.aG((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareTitle"), ""));
          paramString1.UC(bi.aG((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
      a(paramString1, (bsu)localObject1);
      paramString1.kX(true);
      paramString2.rBI.add(paramString1);
      paramString1 = new xa();
      paramString1.CQ(((bsu)localObject1).dwt);
      paramString2.b(paramString1);
      paramString2.a(localwr);
      paramch.bJF.bJH = paramString2;
      paramch.bJF.desc = ((bsu)localObject1).sqc.bHD;
      paramch.bJF.type = 5;
      return true;
      paramString1.kY(true);
      paramString1.UK(((ate)localObject2).rVE);
      localObject3 = new xa();
      ((xa)localObject3).VM(((ate)localObject2).rVE);
      paramString2.b((xa)localObject3);
      continue;
      paramString1.kY(true);
    }
  }
  
  public static boolean b(ch paramch, String paramString)
  {
    int i = 0;
    if ((paramch == null) || (!v.NG(paramString)))
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramch != null) {
        paramch.bJF.bJL = i.j.favorite_fail_argument_error;
      }
      return false;
    }
    if (af.bxX())
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramch.bJF.bJL = i.j.favorite_fail_system_error;
      return false;
    }
    Object localObject1 = h.Nl(paramString);
    if (localObject1 == null)
    {
      x.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramch.bJF.bJL = i.j.favorite_fail_attachment_not_exists;
      return false;
    }
    paramString = "0";
    Object localObject2 = aj.a((n)localObject1, 0);
    if (localObject2 != null) {
      paramString = ((ate)localObject2).ksA;
    }
    String str = String.format("%s#%s", new Object[] { i.eF(((n)localObject1).field_snsId), paramString });
    localObject2 = new wr();
    paramString = ((n)localObject1).bAJ();
    if (paramString == null)
    {
      x.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
      return false;
    }
    x.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", new Object[] { ((n)localObject1).field_userName });
    ((wr)localObject2).Vw(((n)localObject1).field_userName);
    ((wr)localObject2).Vx(q.GF());
    ((wr)localObject2).CO(2);
    ((wr)localObject2).fU(((n)localObject1).field_createTime * 1000L);
    ((wr)localObject2).VB(((n)localObject1).bAK());
    ((wr)localObject2).Vy(str);
    localObject1 = new fz();
    ((fz)localObject1).bOL.type = 30;
    ((fz)localObject1).bOL.bOS = 4;
    ((fz)localObject1).bOL.desc = paramString.sqc.ruC;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    ((fz)localObject1).bOL.bJH.a((wr)localObject2);
    paramch.bJF.bJH = ((fz)localObject1).bOL.bJH;
    if (paramch.bJF.bJH != null)
    {
      localObject1 = paramch.bJF.bJH.rBI;
      if (localObject1 != null) {
        while (i < ((LinkedList)localObject1).size())
        {
          localObject2 = (vx)((LinkedList)localObject1).get(i);
          if (localObject2 != null)
          {
            ((vx)localObject2).kX(true);
            ((vx)localObject2).kY(true);
          }
          i += 1;
        }
      }
    }
    paramch.bJF.desc = paramString.sqc.bHD;
    paramch.bJF.type = 18;
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */