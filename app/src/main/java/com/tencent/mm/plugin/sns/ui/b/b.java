package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dj.b;
import com.tencent.mm.k.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.av.a;
import com.tencent.mm.plugin.sns.ui.m;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class b
{
  Activity activity;
  public View.OnTouchListener hqR;
  private ClipboardManager jdw;
  ae nMm;
  public View.OnClickListener nNR;
  public View.OnClickListener okA;
  public View.OnClickListener okB;
  public View.OnClickListener okC;
  public View.OnClickListener okD;
  public View.OnClickListener okE;
  public View.OnClickListener okF;
  public View.OnClickListener okG;
  public View.OnClickListener okH;
  public c okI;
  public c okJ;
  public c okK;
  public c okL;
  public c okM;
  public c okN;
  public c okO;
  c okP;
  public View.OnClickListener okQ;
  public View.OnClickListener okR;
  public View.OnClickListener okS;
  public View.OnClickListener okT;
  public View.OnClickListener okU;
  public View.OnClickListener okV;
  public View.OnClickListener okW;
  public AdapterView.OnItemClickListener okX;
  public AdapterView.OnItemClickListener okY;
  public View.OnClickListener okZ = new b.1(this);
  public b.e okp;
  public a okv;
  public View.OnClickListener okw;
  public View.OnLongClickListener okx;
  public c oky;
  public View.OnClickListener okz;
  public View.OnClickListener ola = new b.12(this);
  public View.OnClickListener olb;
  public av.a olc;
  int old;
  public View.OnClickListener ole = new b.30(this);
  int scene = 0;
  
  public b(int paramInt, Activity paramActivity, ae paramae)
  {
    this.scene = paramInt;
    this.activity = paramActivity;
    this.nMm = paramae;
    this.old = bi.getInt(com.tencent.mm.k.g.AT().getValue("SnsPOICommentFeedNewUrlSwitch"), 0);
    x.i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", new Object[] { Integer.valueOf(this.old) });
    this.jdw = ((ClipboardManager)this.activity.getSystemService("clipboard"));
    this.okv = new a(this.activity, this.scene, this.nMm);
    this.okG = new b.23(this);
    this.okR = new b.31(this);
    this.okV = new b.32(this);
    this.okW = new b.33(this);
    this.okw = new b.34(this);
    this.okx = new b.35(this);
    this.oky = new b.36(this);
    this.okN = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if (((paramAnonymousContextMenuInfo instanceof a.c)) || ((paramAnonymousContextMenuInfo instanceof n)) || ((paramAnonymousContextMenuInfo instanceof ak)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          if (!(paramAnonymousContextMenuInfo instanceof a.c)) {
            break label61;
          }
          paramAnonymousContextMenuInfo = h.Nk(((a.c)paramAnonymousContextMenuInfo).bSZ);
        }
        for (;;)
        {
          if (!paramAnonymousContextMenuInfo.xb(32)) {}
          label61:
          do
          {
            do
            {
              return;
              if ((paramAnonymousContextMenuInfo instanceof n))
              {
                paramAnonymousContextMenuInfo = (n)paramAnonymousContextMenuInfo;
                break;
              }
              if ((paramAnonymousContextMenuInfo instanceof ak))
              {
                paramAnonymousContextMenuInfo = (ak)paramAnonymousContextMenuInfo;
                paramAnonymousContextMenuInfo = af.byo().Nl(paramAnonymousContextMenuInfo.bKW);
                break;
              }
              if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
                break label282;
              }
              paramAnonymousContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).bNH;
              paramAnonymousContextMenuInfo = af.byo().Nl(paramAnonymousContextMenuInfo);
              break;
            } while ((paramAnonymousContextMenuInfo.bAF() == null) || (paramAnonymousContextMenuInfo.bAF().nzp != 1) || (paramAnonymousContextMenuInfo.bAH().nyn != null));
            if (d.QS("favorite"))
            {
              Object localObject = paramAnonymousContextMenuInfo.bAF();
              paramAnonymousContextMenuInfo.bAH();
              if (((com.tencent.mm.plugin.sns.storage.b)localObject).bzr()) {
                paramAnonymousContextMenu.add(0, 20, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
              }
              localObject = new dj();
              ((dj)localObject).bLf.bKW = paramAnonymousContextMenuInfo.bBe();
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
              if (((dj)localObject).bLg.bKE) {
                paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.app_open));
              }
            }
          } while (paramAnonymousContextMenuInfo == null);
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
          return;
          label282:
          paramAnonymousContextMenuInfo = null;
        }
      }
      
      public final boolean cO(View paramAnonymousView)
      {
        Object localObject;
        if (((paramAnonymousView.getTag() instanceof a.c)) || ((paramAnonymousView.getTag() instanceof n)) || ((paramAnonymousView.getTag() instanceof ak)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          localObject = paramAnonymousView.getTag();
          if ((localObject instanceof a.c)) {
            localObject = h.Nk(((a.c)paramAnonymousView.getTag()).bSZ);
          }
        }
        for (;;)
        {
          if (localObject != null)
          {
            if (!((n)localObject).xb(32))
            {
              return false;
              if ((localObject instanceof n))
              {
                localObject = (n)localObject;
                continue;
              }
              if ((localObject instanceof ak))
              {
                localObject = (ak)localObject;
                localObject = af.byo().Nl(((ak)localObject).bKW);
                continue;
              }
              if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
              {
                localObject = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).bNH;
                localObject = af.byo().Nl((String)localObject);
              }
            }
            else
            {
              if ((((n)localObject).bAF() == null) || (((n)localObject).bAF().nzp != 1)) {
                return false;
              }
              b.this.okv.a(paramAnonymousView, ((n)localObject).bBe(), ((n)localObject).bAJ());
            }
          }
          else
          {
            return true;
            return false;
          }
          localObject = null;
        }
      }
    };
    this.okO = new b.3(this);
    this.okK = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        if ((paramAnonymousView.getTag() instanceof r)) {
          b.this.okP.onCreateContextMenu(paramAnonymousContextMenu, paramAnonymousView, paramAnonymousContextMenuInfo);
        }
      }
      
      public final boolean cO(View paramAnonymousView)
      {
        if ((paramAnonymousView.getTag() instanceof r))
        {
          String str = ((r)paramAnonymousView.getTag()).bKW;
          n localn = af.byo().Nl(str);
          b.this.okv.a(paramAnonymousView, str, localn.bAJ());
          return true;
        }
        return false;
      }
    };
    this.okJ = new b.5(this);
    this.okM = new b.6(this);
    this.nNR = new b.7(this);
    this.okz = new b.8(this);
    this.okA = new b.9(this);
    this.okB = new b.10(this);
    this.okH = new b.11(this);
    this.okC = new b.13(this);
    this.okD = new b.14(this);
    this.okE = new b.15(this);
    this.okF = new b.16(this);
    this.okI = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        long l;
        int i;
        if ((paramAnonymousView.getTag() instanceof m))
        {
          paramAnonymousView = (m)paramAnonymousView.getTag();
          paramAnonymousContextMenu.add(0, 11, 0, b.this.activity.getString(i.j.app_copy));
          if ((paramAnonymousView.hbL != null) && (paramAnonymousView.hbL.equals(q.GF()))) {
            paramAnonymousContextMenu.add(0, 7, 0, b.this.activity.getString(i.j.app_delete));
          }
          paramAnonymousContextMenuInfo = paramAnonymousView.nMv;
          StringBuilder localStringBuilder = new StringBuilder();
          if (paramAnonymousView.noe.smh == 0) {
            break label193;
          }
          l = paramAnonymousView.noe.smh;
          paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ap.ez(paramAnonymousContextMenuInfo, l);
          if (paramAnonymousView.scene != 1) {
            break label205;
          }
          i = 2;
        }
        for (;;)
        {
          label146:
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ap.Mq(paramAnonymousContextMenuInfo);
          if ((paramAnonymousView != null) && (paramAnonymousView.dDR) && (!paramAnonymousView.dHC) && ((i & paramAnonymousView.csE) != 0)) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label225;
            }
            com.tencent.mm.plugin.sns.model.ap.a(paramAnonymousContextMenu, false);
            return;
            label193:
            l = paramAnonymousView.noe.smk;
            break;
            label205:
            if (paramAnonymousView.scene != 2) {
              break label231;
            }
            i = 4;
            break label146;
          }
          label225:
          com.tencent.mm.plugin.sns.model.ap.b(paramAnonymousContextMenu, false);
          return;
          label231:
          i = -1;
        }
      }
      
      public final boolean cO(View paramAnonymousView)
      {
        if ((paramAnonymousView.getTag() instanceof m))
        {
          Object localObject = (m)paramAnonymousView.getTag();
          localObject = af.byo().Nk(((m)localObject).nMv);
          b.this.okv.a(paramAnonymousView, ((n)localObject).bBe(), ((n)localObject).bAJ());
          return true;
        }
        return false;
      }
    };
    this.hqR = new b.18(this);
    this.okQ = new b.19(this);
    this.okT = new b.20(this);
    this.okS = new b.21(this);
    this.okL = new b.22(this);
    this.okU = new b.24(this);
    this.okX = new b.25(this);
    this.okY = new b.26(this);
    this.olb = new b.27(this);
    this.okP = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        Object localObject;
        if ((paramAnonymousContextMenuInfo instanceof r))
        {
          paramAnonymousContextMenuInfo = (r)paramAnonymousContextMenuInfo;
          localObject = paramAnonymousContextMenuInfo.nMH;
          if (d.QS("favorite")) {
            switch (((bsu)localObject).sqc.ruz)
            {
            default: 
              paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
            }
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, af.byo().Nl(paramAnonymousContextMenuInfo.bKW));
          return;
          paramAnonymousContextMenu.add(0, 4, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
          localObject = new dj();
          ((dj)localObject).bLf.bKW = paramAnonymousContextMenuInfo.bKW;
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
          if (((dj)localObject).bLg.bKE)
          {
            paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.app_open));
            continue;
            paramAnonymousContextMenu.add(0, 5, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
            continue;
            paramAnonymousContextMenu.add(0, 9, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
            continue;
            paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
            localObject = new dj();
            ((dj)localObject).bLf.bKW = paramAnonymousContextMenuInfo.bKW;
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
            if (((dj)localObject).bLg.bKE)
            {
              paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.app_open));
              continue;
              paramAnonymousContextMenu.add(0, 10, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
              continue;
              paramAnonymousContextMenu.add(0, 22, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
              continue;
              paramAnonymousContextMenu.add(0, 2, 0, paramAnonymousView.getContext().getString(i.j.plugin_favorite_opt));
            }
          }
        }
      }
      
      public final boolean cO(View paramAnonymousView)
      {
        Object localObject = paramAnonymousView.getTag();
        if ((localObject instanceof r))
        {
          localObject = (r)localObject;
          bsu localbsu = ((r)localObject).nMH;
          if ((localbsu.sqc.ruz == 10) || (localbsu.sqc.ruz == 17) || (localbsu.sqc.ruz == 22) || (localbsu.sqc.ruz == 23)) {
            return false;
          }
          b.this.okv.a(paramAnonymousView, ((r)localObject).bKW, localbsu);
          return true;
        }
        return false;
      }
    };
    this.okp = new b.29(this);
  }
  
  public final void aEI()
  {
    a locala = this.okv;
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(218, locala);
  }
  
  public final void aYt()
  {
    a locala = this.okv;
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(218, locala);
  }
  
  public abstract void b(View paramView, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void bBS();
  
  public abstract void bBT();
  
  public abstract void bS(Object paramObject);
  
  public abstract void cE(View paramView);
  
  public abstract void cF(View paramView);
  
  public abstract void cG(View paramView);
  
  public abstract void cH(View paramView);
  
  public abstract void cI(View paramView);
  
  public abstract void cJ(View paramView);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */