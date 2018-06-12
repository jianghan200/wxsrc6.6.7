package com.tencent.mm.plugin.topstory.ui.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView.t;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.topstory.a.b;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.topstory.ui.b.c;
import com.tencent.mm.plugin.topstory.ui.b.d;
import com.tencent.mm.plugin.topstory.ui.b.g;
import com.tencent.mm.plugin.topstory.ui.video.j;
import com.tencent.mm.plugin.topstory.ui.video.k;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.p;
import com.tencent.mm.plugin.websearch.api.q;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.y.g.a;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;

public class c
  extends RecyclerView.t
  implements p
{
  public static com.tencent.mm.ak.a.a.c oCI;
  public TextView eBO;
  public View ivV;
  public TextView mKZ;
  protected View.OnClickListener mtE = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      c.this.cY(paramAnonymousView);
    }
  };
  public Point nqm;
  public com.tencent.mm.plugin.topstory.ui.video.a oAb;
  public n oCJ;
  public FrameLayout oCK;
  public View oCL;
  public ImageView oCM;
  public ImageView oCN;
  public TextView oCO;
  public View oCP;
  public View oCQ;
  public View oCR;
  public int oCS;
  public bti ozj;
  public int position;
  
  static
  {
    c.a locala = new c.a();
    locala.dXy = true;
    locala.dXx = true;
    locala.dXW = true;
    locala.dXN = b.c.default_avatar;
    oCI = locala.Pt();
  }
  
  public c(View paramView, com.tencent.mm.plugin.topstory.ui.video.a parama)
  {
    super(paramView);
    this.oAb = parama;
    this.nqm = ak.gu(parama.baA());
    if (ak.gt(parama.baA()))
    {
      localPoint = this.nqm;
      localPoint.y -= ak.gs(parama.baA());
    }
    Point localPoint = this.nqm;
    localPoint.y -= s.gJ(parama.baA());
    this.oCS = com.tencent.mm.bp.a.fromDPToPix(parama.baA(), 24);
    cX(paramView);
  }
  
  private void Oy(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    d.b(this.oAb.baA(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
  }
  
  public static void a(final com.tencent.mm.plugin.topstory.ui.video.a parama, final Context paramContext, n paramn, int paramInt)
  {
    final bti localbti = (bti)parama.bHO().get(paramInt);
    if (localbti != null)
    {
      com.tencent.mm.ui.widget.c localc = new com.tencent.mm.ui.widget.c(paramContext, 1, false);
      localc.ofp = new n.c()
      {
        public final void a(l paramAnonymousl)
        {
          paramAnonymousl.eR(0, b.g.video_share_to_sns);
          paramAnonymousl.eR(1, b.g.video_share_to_friend);
        }
      };
      localc.ofq = new n.d()
      {
        public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          if (paramAnonymousMenuItem.getItemId() == 0)
          {
            this.oCU.bIr();
            paramAnonymousMenuItem = k.oAn;
            localContext = paramContext;
            localObject2 = localbti;
            localObject3 = parama.bHT();
            if ((localObject2 != null) && (localObject3 != null))
            {
              paramAnonymousMenuItem.oAo = ((bti)localObject2);
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("Ksnsupload_title", ((bti)localObject2).ixz);
              ((Intent)localObject1).putExtra("Ksnsupload_imgurl", ((bti)localObject2).pLw);
              ((Intent)localObject1).putExtra("Ksnsupload_link", ((bti)localObject2).ixy);
              if (!bi.oW(((bti)localObject2).nzH)) {
                break label380;
              }
              paramAnonymousMenuItem = localContext.getString(b.g.recommend_video_share_desc_default);
              ((Intent)localObject1).putExtra("KContentObjDesc", paramAnonymousMenuItem);
              ((Intent)localObject1).putExtra("KlinkThumb_url", ((bti)localObject2).pLw);
              ((Intent)localObject1).putExtra("Ksnsupload_source", 1);
              ((Intent)localObject1).putExtra("Ksnsupload_type", 16);
              ((Intent)localObject1).putExtra("need_result", true);
              paramAnonymousMenuItem = new cfn();
              paramAnonymousMenuItem.pLr = ((bti)localObject2).sqS;
              paramAnonymousMenuItem.pLs = ((bti)localObject2).sqV;
              paramAnonymousMenuItem.pLt = ((bth)localObject3).sqJ;
              paramAnonymousMenuItem.pLu = ((bti)localObject2).sqU;
              paramAnonymousMenuItem.pLv = ((bth)localObject3).sqO;
              paramAnonymousMenuItem.ixy = ((bti)localObject2).ixy;
              paramAnonymousMenuItem.ixz = ((bti)localObject2).ixz;
              paramAnonymousMenuItem.nzH = ((bti)localObject2).nzH;
              paramAnonymousMenuItem.pLw = ((bti)localObject2).pLw;
              paramAnonymousMenuItem.pLx = ((bti)localObject2).pLx;
              paramAnonymousMenuItem.pLy = ((bti)localObject2).pLy;
              paramAnonymousMenuItem.bhd = ((bti)localObject2).bhd;
              paramAnonymousMenuItem.lRt = ((bti)localObject2).lRt;
              paramAnonymousMenuItem.pLz = ((bti)localObject2).pLz;
              paramAnonymousMenuItem.pLA = ((bti)localObject2).pLA;
              paramAnonymousMenuItem.pLB = k.cB(((bth)localObject3).pKZ).toString();
              paramAnonymousMenuItem.pLC = com.tencent.mm.plugin.topstory.a.g.cA(((bti)localObject2).rBV).toString();
            }
          }
          label380:
          while (paramAnonymousMenuItem.getItemId() != 1) {
            try
            {
              paramAnonymousMenuItem = paramAnonymousMenuItem.toByteArray();
              if (paramAnonymousMenuItem != null) {
                ((Intent)localObject1).putExtra("KWebSearchInfo", paramAnonymousMenuItem);
              }
              d.b(localContext, "sns", ".ui.SnsUploadUI", (Intent)localObject1, 1024);
              return;
              paramAnonymousMenuItem = ((bti)localObject2).nzH;
            }
            catch (IOException paramAnonymousMenuItem)
            {
              for (;;)
              {
                x.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoShareMgr", paramAnonymousMenuItem, "", new Object[0]);
                paramAnonymousMenuItem = null;
              }
            }
          }
          this.oCU.bIr();
          paramAnonymousMenuItem = k.oAn;
          Context localContext = paramContext;
          Object localObject1 = localbti;
          Object localObject2 = parama.bHT();
          paramAnonymousMenuItem.oAo = ((bti)localObject1);
          Object localObject3 = new g.a();
          ((g.a)localObject3).type = 5;
          ((g.a)localObject3).title = ((bti)localObject1).ixz;
          if (bi.oW(((bti)localObject1).nzH)) {}
          for (paramAnonymousMenuItem = localContext.getString(b.g.recommend_video_share_desc_default);; paramAnonymousMenuItem = ((bti)localObject1).nzH)
          {
            ((g.a)localObject3).description = paramAnonymousMenuItem;
            ((g.a)localObject3).url = ((bti)localObject1).ixy;
            ((g.a)localObject3).thumburl = ((bti)localObject1).pLw;
            paramAnonymousMenuItem = new q();
            paramAnonymousMenuItem.pLr = ((bti)localObject1).sqS;
            paramAnonymousMenuItem.pLs = ((bti)localObject1).sqV;
            paramAnonymousMenuItem.pLt = ((bth)localObject2).sqJ;
            paramAnonymousMenuItem.pLu = ((bti)localObject1).sqU;
            paramAnonymousMenuItem.pLv = ((bth)localObject2).sqO;
            paramAnonymousMenuItem.ixy = ((bti)localObject1).ixy;
            paramAnonymousMenuItem.ixz = ((bti)localObject1).ixz;
            paramAnonymousMenuItem.nzH = ((bti)localObject1).nzH;
            paramAnonymousMenuItem.pLw = ((bti)localObject1).pLw;
            paramAnonymousMenuItem.pLx = ((bti)localObject1).pLx;
            paramAnonymousMenuItem.pLy = ((bti)localObject1).pLy;
            paramAnonymousMenuItem.bhd = ((bti)localObject1).bhd;
            paramAnonymousMenuItem.lRt = ((bti)localObject1).lRt;
            paramAnonymousMenuItem.pLz = ((bti)localObject1).pLz;
            paramAnonymousMenuItem.pLA = ((bti)localObject1).pLA;
            paramAnonymousMenuItem.pLB = k.cB(((bth)localObject2).pKZ).toString();
            paramAnonymousMenuItem.pLC = com.tencent.mm.plugin.topstory.a.g.cA(((bti)localObject1).rBV).toString();
            ((g.a)localObject3).a(paramAnonymousMenuItem);
            paramAnonymousMenuItem = g.a.a((g.a)localObject3, null, null);
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("Retr_Msg_Type", 2);
            ((Intent)localObject1).putExtra("Retr_Msg_content", paramAnonymousMenuItem);
            ((Intent)localObject1).putExtra("Multi_Retr", true);
            ((Intent)localObject1).putExtra("Retr_go_to_chattingUI", false);
            ((Intent)localObject1).putExtra("Retr_show_success_tips", true);
            d.b(localContext, ".ui.transmit.MsgRetransmitUI", (Intent)localObject1, 2048);
            return;
          }
        }
      };
      localc.uJQ = new c.4(parama);
      localc.bXO();
    }
  }
  
  private void bIK()
  {
    if (this.oAb.bHS().oCg)
    {
      this.oCJ.bIr();
      this.oAb.bHS().bAf();
    }
  }
  
  public final void a(bti parambti, int paramInt)
  {
    this.ozj = parambti;
    this.position = paramInt;
    aL();
  }
  
  protected void aL()
  {
    if (!bi.oW(this.ozj.title))
    {
      this.eBO.setText(this.ozj.title);
      this.eBO.setVisibility(0);
      this.eBO.requestLayout();
      this.eBO.setOnClickListener(this.mtE);
      this.mKZ.setText(this.ozj.bhd);
      if (bi.oW(this.ozj.pLz)) {
        break label366;
      }
      this.oCO.setText(this.ozj.pLz);
      this.oCO.setVisibility(0);
      label102:
      this.oCO.setOnClickListener(this.mtE);
      if (bi.oW(this.ozj.sqY)) {
        break label378;
      }
      com.tencent.mm.ak.o.Pj().a(this.ozj.sqY, this.oCM, oCI);
      this.oCM.setVisibility(0);
      label154:
      if (!this.oAb.bHX()) {
        break label390;
      }
      this.ivV.setVisibility(0);
      this.ivV.setOnClickListener(this.mtE);
    }
    for (;;)
    {
      this.oCN.setTag(this.ozj);
      this.oCN.setOnClickListener(this.mtE);
      this.oCP.setVisibility(0);
      this.oCQ.setVisibility(0);
      this.oCR.setVisibility(0);
      this.oCL.setOnClickListener(this.mtE);
      if (this.oCJ == null)
      {
        this.oCJ = new n(this.oAb.baA());
        this.oCK.removeAllViews();
        this.oCK.addView(this.oCJ);
      }
      this.oCJ.setStreamUIComponent(this.oAb);
      this.oCJ.setVideoItemUIComponent(this);
      n localn = this.oCJ;
      bti localbti = this.ozj;
      localn.position = this.position;
      localn.ozj = localbti;
      localn.aL();
      if (this.oAb.bHP() == this.position) {
        break label402;
      }
      bII();
      return;
      this.eBO.setVisibility(8);
      break;
      label366:
      this.oCO.setVisibility(8);
      break label102;
      label378:
      this.oCM.setVisibility(8);
      break label154;
      label390:
      this.ivV.setVisibility(8);
    }
    label402:
    bHK();
  }
  
  public final void bHK()
  {
    this.oCR.animate().cancel();
    this.oCQ.animate().cancel();
    this.oCR.animate().alpha(0.8F).setDuration(200L).setStartDelay(3000L).start();
    this.oCQ.animate().alpha(0.8F).setDuration(200L).setStartDelay(3000L).start();
    this.oAb.bHK();
  }
  
  public final void bHL()
  {
    this.oCR.animate().cancel();
    this.oCQ.animate().cancel();
    this.oCR.setAlpha(0.0F);
    this.oCQ.setAlpha(0.0F);
    this.oAb.bHL();
  }
  
  public final void bID()
  {
    this.oCJ = null;
    this.oAb.yg(0);
    aL();
  }
  
  public final int bIE()
  {
    return this.position;
  }
  
  public final void bII()
  {
    x.d("MicroMsg.TopStory.TopStoryBaseVideoItemHolder", "showMaskView %d", new Object[] { Integer.valueOf(hashCode()) });
    this.oCR.animate().cancel();
    this.oCQ.animate().cancel();
    this.oCP.animate().cancel();
    this.oCP.setAlpha(0.8F);
    this.oCR.setAlpha(0.8F);
    this.oCQ.setAlpha(0.8F);
  }
  
  public final void bIJ()
  {
    x.d("MicroMsg.TopStory.TopStoryBaseVideoItemHolder", "hideMaskView %d", new Object[] { Integer.valueOf(hashCode()) });
    this.oCR.animate().cancel();
    this.oCQ.animate().cancel();
    this.oCP.animate().cancel();
    this.oCP.setAlpha(0.0F);
    this.oCR.setAlpha(0.0F);
    this.oCQ.setAlpha(0.0F);
  }
  
  public void cX(View paramView)
  {
    this.oCK = ((FrameLayout)paramView.findViewById(b.d.video_view_container));
    this.oCL = paramView.findViewById(b.d.source_layout);
    this.oCM = ((ImageView)paramView.findViewById(b.d.source_iv));
    this.mKZ = ((TextView)paramView.findViewById(b.d.source_tv));
    this.eBO = ((TextView)paramView.findViewById(b.d.title_tv));
    this.oCO = ((TextView)paramView.findViewById(b.d.play_count_tv));
    this.ivV = paramView.findViewById(b.d.share_icon_iv);
    this.oCP = paramView.findViewById(b.d.body_mask);
    this.oCQ = paramView.findViewById(b.d.header_mask);
    this.oCR = paramView.findViewById(b.d.footer_mask);
    this.oCN = ((ImageView)paramView.findViewById(b.d.feedback_iv));
  }
  
  protected void cY(View paramView)
  {
    if (this.oAb.bHP() != this.position)
    {
      this.oAb.bHU().oAl = 2;
      this.oAb.ye(this.position);
      com.tencent.mm.plugin.websearch.api.a.a.kB(4);
      this.oAb.bHU().b(this.ozj);
      ((b)com.tencent.mm.kernel.g.n(b.class)).getReporter().a(this.oAb.bHT(), this.ozj, this.position, 2, "");
    }
    do
    {
      do
      {
        do
        {
          return;
          if ((this.oCR.getAlpha() != 0.0F) && (this.oCQ.getAlpha() != 0.0F)) {}
          for (int i = 1; i != 0; i = 0)
          {
            bHL();
            this.oAb.bHL();
            bHK();
            this.oAb.bHK();
            return;
          }
          if (paramView.getId() != this.oCL.getId()) {
            break;
          }
        } while (bi.oW(this.ozj.lRt));
        Oy(this.ozj.lRt);
        bIK();
        this.oAb.bHU().b(this.ozj);
        ((b)com.tencent.mm.kernel.g.n(b.class)).getReporter().a(this.oAb.bHT(), this.ozj, this.position, 3, this.ozj.bhd);
        return;
        if (paramView.getId() != this.eBO.getId()) {
          break;
        }
      } while ((this.ozj == null) || (bi.oW(this.ozj.pLA)));
      Oy(this.ozj.pLA);
      bIK();
      this.oAb.bHU().b(this.ozj);
      ((b)com.tencent.mm.kernel.g.n(b.class)).getReporter().a(this.oAb.bHT(), this.ozj, this.position, 1, "");
      return;
      if (paramView.getId() == this.ivV.getId())
      {
        com.tencent.mm.plugin.websearch.api.a.a.kB(8);
        a(this.oAb, this.oAb.baA(), this.oCJ, this.position);
        return;
      }
    } while (paramView.getId() != this.oCN.getId());
    this.oAb.onFeedBackItemClick(this.oCN);
  }
  
  public final void iE(boolean paramBoolean)
  {
    bIJ();
    this.oAb.yg(this.position);
    if (this.oCJ.iB(paramBoolean))
    {
      bHL();
      bHK();
    }
  }
  
  public void z(n paramn)
  {
    this.ozj = paramn.getVideoInfo();
    Object localObject;
    if (this.ozj != null)
    {
      localObject = this.ozj.title;
      x.i("MicroMsg.TopStory.TopStoryBaseVideoItemHolder", "setVideoInfoFromResumeFullScreenView, videoInfo: %s, videoViewPosition: %s, position: %s", new Object[] { localObject, Integer.valueOf(paramn.getPosition()), Integer.valueOf(this.position) });
      if (this.ozj != null)
      {
        if (bi.oW(this.ozj.title)) {
          break label301;
        }
        this.eBO.setText(this.ozj.title);
        this.eBO.setVisibility(0);
        label102:
        this.mKZ.setText(this.ozj.bhd);
        if (bi.oW(this.ozj.pLz)) {
          break label313;
        }
        this.oCO.setText(this.ozj.pLz);
        this.oCO.setVisibility(0);
        label151:
        this.oCK.removeAllViews();
        if (paramn.getParent() != null) {
          ((ViewGroup)paramn.getParent()).removeView(paramn);
        }
        localObject = this.oCK;
        bti localbti = this.ozj;
        int i = Math.min(this.nqm.x, this.nqm.y);
        ((FrameLayout)localObject).addView(paramn, new FrameLayout.LayoutParams(i, localbti.dwI * i / localbti.dwJ));
        this.oCJ = paramn;
        paramn.setVideoItemUIComponent(this);
        if (this.oAb.bHS().oCg) {
          break label325;
        }
        paramn.bIn();
      }
    }
    for (;;)
    {
      bIJ();
      bHL();
      bHK();
      this.position = paramn.getPosition();
      this.oAb.yg(this.position);
      return;
      localObject = "";
      break;
      label301:
      this.eBO.setVisibility(8);
      break label102;
      label313:
      this.oCO.setVisibility(8);
      break label151;
      label325:
      paramn.bIm();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */