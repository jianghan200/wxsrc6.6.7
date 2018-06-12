package com.tencent.mm.ui.chatting.g;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.d.a;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.wz;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.d.a.a;
import com.tencent.mm.ui.chatting.d.a.b;
import com.tencent.mm.ui.chatting.gallery.b;
import com.tencent.mm.ui.chatting.gallery.g.a;
import com.tencent.mm.ui.chatting.gallery.g.b;
import com.tencent.mm.ui.chatting.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class e
  implements d.a, s.a, a.a, g.b
{
  static int count = 0;
  private ArrayList<com.tencent.mm.ui.chatting.a.a.c> gBc = null;
  private String gBf;
  private int jub = 0;
  private Context mContext;
  private ag mHandler = new ag(Looper.getMainLooper());
  private long tNE;
  private com.tencent.mm.sdk.b.c tQa = new e.9(this);
  private int tYk = 0;
  private a.b tYo;
  com.tencent.mm.ui.chatting.a.a tYp;
  private GridLayoutManager tYq;
  boolean tYr = false;
  private int tYs = 0;
  private boolean tYt = false;
  
  public e(Context paramContext)
  {
    this.mContext = paramContext;
    this.gBc = new ArrayList();
  }
  
  private void b(ch paramch)
  {
    paramch.bJF.bJM = 45;
    paramch.bJF.activity = ((Activity)this.mContext);
    com.tencent.mm.sdk.b.a.sFg.m(paramch);
    if ((paramch.bJG.ret == -2) || (paramch.bJG.ret > 0)) {}
    while (paramch.bJG.ret > 0) {
      return;
    }
    if (14 != paramch.bJF.type)
    {
      x.d("MicroMsg.MediaHistoryGalleryPresenter", "not record type, do not report");
      return;
    }
    if (paramch.bJF.bJI == null)
    {
      x.e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(11142, new Object[] { Integer.valueOf(paramch.bJF.bJI.rBY), Integer.valueOf(paramch.bJF.bJI.rBZ), Integer.valueOf(paramch.bJF.bJI.rCa), Integer.valueOf(paramch.bJF.bJI.rCb), Integer.valueOf(paramch.bJF.bJI.rCc), Integer.valueOf(paramch.bJF.bJI.rCd), Integer.valueOf(paramch.bJF.bJI.rCe), Integer.valueOf(paramch.bJF.bJI.rCf), Integer.valueOf(paramch.bJF.bJI.rCg), Integer.valueOf(paramch.bJF.bJI.rCh), Integer.valueOf(paramch.bJF.bJI.rCi), Integer.valueOf(paramch.bJF.bJI.rCj), Integer.valueOf(paramch.bJF.bJI.rCk), Integer.valueOf(paramch.bJF.bJI.rCl), Integer.valueOf(paramch.bJF.bJI.rCm) });
  }
  
  private static String c(bd parambd, r paramr)
  {
    Object localObject;
    if (paramr.enT == -1)
    {
      paramr = paramr.Tl();
      localObject = paramr;
      if (!com.tencent.mm.a.e.cn(paramr))
      {
        com.tencent.mm.modelvideo.o.Ta();
        localObject = s.nK(parambd.field_imgPath);
      }
    }
    String str;
    do
    {
      do
      {
        do
        {
          return (String)localObject;
          com.tencent.mm.modelvideo.o.Ta();
          str = s.nK(parambd.field_imgPath);
          localObject = str;
        } while (parambd.field_isSend != 1);
        localObject = str;
      } while (paramr.enW == null);
      localObject = str;
    } while (!paramr.enW.rUP);
    for (;;)
    {
      try
      {
        paramr = FileOp.mK(str);
        parambd = paramr;
        if (!paramr.endsWith("/")) {
          parambd = paramr + "/";
        }
        paramr = com.tencent.mm.a.e.cq(str);
        parambd = parambd + paramr + "_hd.mp4";
        boolean bool = FileOp.cn(parambd);
        x.i("MicroMsg.MediaHistoryGalleryPresenter", "local capture video, hdFilePath: %s, exist: %s", new Object[] { parambd, Boolean.valueOf(bool) });
        if (bool) {
          return parambd;
        }
      }
      catch (Exception parambd)
      {
        x.e("MicroMsg.MediaHistoryGalleryPresenter", "try to get hd filePath error: %s", new Object[] { parambd.getMessage() });
        return str;
      }
      parambd = str;
    }
  }
  
  private boolean cxH()
  {
    return this.tYs == 0;
  }
  
  private void dL(final List<bd> paramList)
  {
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        int i = e.dO(paramList);
        if (paramList.size() == i) {
          e.d(e.this).post(new e.2.1(this));
        }
        do
        {
          return;
          Object localObject1 = e.this;
          if (i > 0) {}
          for (boolean bool = true;; bool = false)
          {
            e.a((e)localObject1, bool);
            localObject2 = e.b(e.this, paramList);
            localObject1 = e.c(e.this, paramList);
            x.i("MicroMsg.MediaHistoryGalleryPresenter", "[innerHandleSave] needDownloadImageList size:%s needDownloadVideoList:%s", new Object[] { Integer.valueOf(((List)localObject2).size()), Integer.valueOf(((List)localObject1).size()) });
            e.a(e.this, ((List)localObject2).size() + ((List)localObject1).size());
            if ((ao.isWifi(ad.getContext())) || (e.e(e.this) != paramList.size())) {
              break;
            }
            e.d(e.this).post(new e.2.2(this));
            return;
          }
          Object localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            bd localbd = (bd)((Iterator)localObject2).next();
            e.a(e.this, localbd, com.tencent.mm.ui.chatting.gallery.d.bv(localbd));
          }
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (bd)((Iterator)localObject1).next();
            e.a(e.this, (bd)localObject2);
          }
          if (e.f(e.this)) {
            e.d(e.this).post(new Runnable()
            {
              public final void run()
              {
                e.c(e.this).Fk(R.l.gallery_selected_save_err_part);
              }
            });
          }
        } while ((!e.g(e.this)) || (e.f(e.this)));
        e.d(e.this).post(new e.2.4(this));
      }
    }, "handleSave");
  }
  
  private void dM(List<bd> paramList)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11627, new Object[] { Integer.valueOf(5) });
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localTreeSet.add(Long.valueOf(((bd)localIterator.next()).field_msgId));
    }
    com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(R.l.confirm_delete), "", this.mContext.getString(R.l.delete_message), this.mContext.getString(R.l.app_cancel), new e.5(this, localTreeSet, paramList), null);
  }
  
  private static void dN(List<bd> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      bd localbd = (bd)paramList.next();
      com.tencent.mm.ui.chatting.a.a(com.tencent.mm.ui.chatting.a.c.tFU, a.d.tFZ, localbd, 0);
    }
  }
  
  public final void Fi(int paramInt)
  {
    x.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList = g.a.cwU().tTJ;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramInt)
    {
    default: 
      return;
    case 3: 
      this.tYo.cwB();
      localObject1 = new ArrayList();
      localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (bd)((Iterator)localObject2).next();
        if ((!b.bi((bd)localObject3)) && (!b.bj((bd)localObject3))) {
          ((List)localObject1).add(localObject3);
        }
      }
      if (((List)localObject1).size() != localArrayList.size())
      {
        com.tencent.mm.ui.base.h.a(this.mContext, R.l.gallery_save_sight_tips, R.l.app_tip, new e.15(this, (List)localObject1), null);
        return;
      }
      dL((List)localObject1);
      return;
    case 1: 
      com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 18L, 1L, true);
      localObject3 = new ch();
      if (com.tencent.mm.pluginsdk.model.g.a(this.mContext, (ch)localObject3, this.gBf, localArrayList, false, false))
      {
        b((ch)localObject3);
        dN(localArrayList);
      }
      for (;;)
      {
        this.tYo.cwy();
        return;
        if (localArrayList.size() > 1)
        {
          Context localContext = this.mContext;
          if (((ch)localObject3).bJF.bJL >= 0)
          {
            localObject1 = this.mContext.getString(R.l.favorite_fail_recordtype_error);
            if (((ch)localObject3).bJF.bJL < 0) {
              break label362;
            }
          }
          for (localObject2 = this.mContext.getString(R.l.confirm_dialog_ok);; localObject2 = this.mContext.getString(R.l.plugin_favorite_opt))
          {
            com.tencent.mm.ui.base.h.a(localContext, (String)localObject1, "", (String)localObject2, this.mContext.getString(R.l.confirm_dialog_cancel), new e.4(this, (ch)localObject3, localArrayList), null);
            break;
            localObject1 = this.mContext.getString(R.l.favorite_fail_record_expired_bigfile);
            break label287;
          }
        }
        com.tencent.mm.ui.base.h.i(this.mContext, ((ch)localObject3).bJF.bJL, 0);
      }
    case 0: 
      label287:
      label362:
      com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 19L, 1L, true);
      boolean bool = this.gBf.toLowerCase().endsWith("@chatroom");
      k.a(this.mContext, localArrayList, bool, this.gBf, new e.6(this));
      this.tYo.cwy();
      return;
    }
    dM(localArrayList);
  }
  
  public final String Wm()
  {
    return this.mContext.getString(R.l.all_pictures_video);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, l paraml)
  {
    x.d("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskProgress] offset:%s totalLen:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, l paraml)
  {
    x.i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", new Object[] { Integer.valueOf(this.tYs), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
    if (!this.tYo.cwD()) {}
    do
    {
      return;
      this.tYs -= 1;
      au.HU();
      paramObject = com.tencent.mm.model.c.FT().dW(paramLong2);
      if (!b.b(this.mContext, (bd)paramObject, false)) {
        this.tYt = true;
      }
    } while (!cxH());
    if (!this.tYt)
    {
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          if (e.c(e.this) != null) {
            e.c(e.this).cwC();
          }
        }
      });
      return;
    }
    this.mHandler.post(new e.12(this));
  }
  
  public final void a(s.a.a parama)
  {
    if (!this.tYo.cwD()) {}
    for (;;)
    {
      return;
      r localr = t.nW(parama.fileName);
      x.d("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] mNeedDownloadCount:%s statusType:%s %s", new Object[] { Integer.valueOf(this.tYs), parama.eod, parama.fileName });
      if (localr != null) {
        if (localr.Tp())
        {
          this.tYs -= 1;
          au.HU();
          parama = com.tencent.mm.model.c.FT().dW(localr.enN);
          b.a(this.mContext, parama, false);
        }
      }
      while (cxH())
      {
        if (!this.tYt) {
          break label162;
        }
        this.mHandler.post(new e.13(this));
        return;
        x.e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
        cwA();
        this.tYo.Fk(0);
      }
    }
    label162:
    this.mHandler.post(new e.14(this));
  }
  
  public final RecyclerView.a ay(String paramString, long paramLong)
  {
    this.gBf = paramString;
    this.tNE = paramLong;
    if (paramLong == -1L) {}
    for (this.tYp = new com.tencent.mm.ui.chatting.a.a(this.mContext, this.gBc, paramString);; this.tYp = new com.tencent.mm.ui.chatting.a.a(this.mContext, this.gBc, paramString, paramLong))
    {
      this.tYp.tNG = new e.10(this);
      return this.tYp;
    }
  }
  
  public final void clear() {}
  
  public final void cwA()
  {
    com.tencent.mm.ak.o.Pg().a(this);
    com.tencent.mm.modelvideo.o.Ta().a(this);
    this.tYo.cwA();
  }
  
  public final void cwS()
  {
    this.tYr = true;
  }
  
  public final <T extends RecyclerView.h> T cwu()
  {
    if (this.tYq == null)
    {
      this.tYq = new GridLayoutManager(4);
      this.tYq.OA = new e.1(this);
    }
    return this.tYq;
  }
  
  public final int cww()
  {
    return g.a.cwU().tTJ.size();
  }
  
  public final void cwx()
  {
    this.tYp.tNH = true;
    g.a.cwU().tVs = true;
    GridLayoutManager localGridLayoutManager = (GridLayoutManager)cwu();
    int i = localGridLayoutManager.fi();
    int j = localGridLayoutManager.fj();
    this.tYp.b(i, j - i + 1, Integer.valueOf(0));
  }
  
  public final void cwy()
  {
    this.tYp.tNH = false;
    g.a.cwU().clear();
    g.a.cwU().tVs = false;
    this.tYp.RR.notifyChanged();
  }
  
  public final boolean cwz()
  {
    return g.a.cwU().tVs;
  }
  
  public final RecyclerView.g gN(Context paramContext)
  {
    return new e.8(this, paramContext);
  }
  
  public final void onDetach()
  {
    this.tQa.dead();
    this.tYo.a(null);
    this.tYo = null;
    com.tencent.mm.ak.o.Pg().a(this);
    com.tencent.mm.modelvideo.o.Ta().a(this);
    g.a.cwU().detach();
  }
  
  public final void onResume()
  {
    if ((this.tYr) && (g.a.cwU().tVs))
    {
      this.tYo.Fj(g.a.cwU().tTJ.size());
      this.tYp.RR.notifyChanged();
    }
  }
  
  public final void x(boolean paramBoolean, int paramInt)
  {
    if ((!paramBoolean) && (this.jub + this.tYk == this.gBc.size()))
    {
      x.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", new Object[] { Integer.valueOf(this.jub), Integer.valueOf(paramInt) });
      return;
    }
    this.tYp.tNF = true;
    this.tYo.ma(paramBoolean);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Em().H(new e.7(this, paramBoolean, paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */