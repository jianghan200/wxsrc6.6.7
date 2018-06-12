package com.tencent.mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.api.SmileyPanel;
import com.tencent.mm.bo.a.b;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.n.a.e;
import com.tencent.mm.plugin.n.a.f;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.HorizontalListViewV2;
import com.tencent.mm.view.e.a.3;
import com.tencent.mm.view.e.a.a;
import com.tencent.mm.view.f.a.1;
import java.util.ArrayList;
import java.util.Iterator;

public class SmileyPanelImpl
  extends SmileyPanel
  implements a.a
{
  private final String TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanel";
  private boolean gIv = false;
  private com.tencent.mm.view.e.a uSJ;
  private com.tencent.mm.view.f.a uSK;
  
  public SmileyPanelImpl(Context paramContext)
  {
    super(paramContext, null);
    init();
  }
  
  public SmileyPanelImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    this.uSK = new com.tencent.mm.view.f.a();
    this.uSJ = new com.tencent.mm.view.e.a(getContext(), this.uSK, this);
  }
  
  public final void aE(boolean paramBoolean)
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSendButton:B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uSJ.mL(paramBoolean);
    this.uSK.uWA = true;
  }
  
  public final void destroy()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDestroy");
    this.qFa = null;
    Object localObject;
    if (this.uSJ != null)
    {
      x.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "ui clear");
      localObject = this.uSJ;
      ((com.tencent.mm.view.e.a)localObject).cCr();
      ((com.tencent.mm.view.e.a)localObject).gKE = null;
      if (((com.tencent.mm.view.e.a)localObject).uVF != null) {
        ((com.tencent.mm.view.e.a)localObject).uVF.setAdapter(null);
      }
      x.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager destroy remove listener.");
      ((c)com.tencent.mm.kernel.g.n(c.class)).getProvider().i(((com.tencent.mm.view.e.a)localObject).uVX);
      ((c)com.tencent.mm.kernel.g.n(c.class)).getProvider().g(((com.tencent.mm.view.e.a)localObject).igR);
      ((c)com.tencent.mm.kernel.g.n(c.class)).getProvider().k(((com.tencent.mm.view.e.a)localObject).uVY);
      com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.view.e.a)localObject).igS);
      this.uSJ = null;
    }
    if (this.uSK != null)
    {
      x.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "stg clear");
      this.uSK.onPause();
      localObject = this.uSK;
      Iterator localIterator = ((com.tencent.mm.view.f.a)localObject).uWG.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)localIterator.next();
        if (locala != null)
        {
          locala.uSK = null;
          locala.uVv = null;
        }
      }
      ((com.tencent.mm.view.f.a)localObject).cCJ();
    }
    ((c)com.tencent.mm.kernel.g.n(c.class)).getProvider().onDestroy();
  }
  
  public int getBottomHeightPx()
  {
    return this.uSK.uWl;
  }
  
  public j getSmileyPanelCallback()
  {
    return (j)this.qFb;
  }
  
  public ChatFooterPanel.a getTextOpListener()
  {
    return this.qFa;
  }
  
  public final void i(boolean paramBoolean1, boolean paramBoolean2)
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    this.uSK.uWw = paramBoolean1;
    this.uSK.uWx = paramBoolean2;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.gIv)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void onPause()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
    this.uSK.onPause();
  }
  
  public final void onResume()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
    Object localObject = this.uSK;
    ((com.tencent.mm.view.f.a)localObject).uWz = true;
    ((com.tencent.mm.view.f.a)localObject).cCK();
    ((com.tencent.mm.view.f.a)localObject).cCB();
    localObject = this.uSJ;
    if ((((com.tencent.mm.view.e.a)localObject).uVG != null) && (((com.tencent.mm.view.e.a)localObject).uVF != null)) {
      ((com.tencent.mm.view.e.a)localObject).uVG.as(((com.tencent.mm.view.e.a)localObject).uVF.getCurrentItem(), true);
    }
    ((com.tencent.mm.view.e.a)localObject).cCt();
    ((com.tencent.mm.view.e.a)localObject).cCv();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void refresh()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "reflesh");
    try
    {
      if (this.uSK != null)
      {
        if (this.uSJ == null) {
          return;
        }
        this.uSJ.cCw();
        return;
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.emoji.SmileyPanel.SmileyPanel", localException, "", new Object[0]);
    }
  }
  
  public void setCallback(com.tencent.mm.pluginsdk.ui.chat.f paramf)
  {
    super.setCallback(paramf);
  }
  
  public void setDefaultEmojiByDetail(String paramString)
  {
    com.tencent.mm.view.f.a locala = this.uSK;
    locala.setShowProductId(paramString);
    locala.cCA();
    if (locala.uWJ == null) {
      locala.uWJ = new a.1(locala);
    }
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "add succeed send listener");
    com.tencent.mm.sdk.b.a.sFg.b(locala.uWJ);
  }
  
  public void setEntranceScene(int paramInt)
  {
    if (this.uSK != null) {
      this.uSK.fdx = paramInt;
    }
  }
  
  public void setHide(boolean paramBoolean)
  {
    this.gIv = paramBoolean;
  }
  
  public void setPortHeightPx(int paramInt)
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setPortHeightPx: %d", new Object[] { Integer.valueOf(paramInt) });
    this.uSK.OT = 0;
    com.tencent.mm.view.f.a locala = this.uSK;
    if (locala.uWl != paramInt)
    {
      locala.uWF = false;
      locala.uWE = false;
    }
    locala.uWl = paramInt;
    this.uSK.cCA();
    this.uSK.GW(paramInt - this.uSK.uWb);
    this.uSK.gLa = 0;
  }
  
  public void setSendButtonEnable(boolean paramBoolean)
  {
    com.tencent.mm.view.e.a locala = this.uSJ;
    if (locala.uVP != null) {
      locala.uVP.setEnabled(paramBoolean);
    }
  }
  
  public void setShowProductId(String paramString)
  {
    this.uSK.setShowProductId(paramString);
  }
  
  public void setTalkerName(String paramString)
  {
    this.uSK.qLj = paramString;
  }
  
  public void setVisibility(int paramInt)
  {
    int i = 0;
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.gIv = false;
      if (this.uSJ != null)
      {
        com.tencent.mm.view.e.a locala = this.uSJ;
        x.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "initView begin");
        if (this != null)
        {
          if ((locala.mView != null) && (getChildCount() > 0))
          {
            x.d("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "already load view --- pass");
            if (locala.uVG != null) {
              locala.uVG.as(locala.uVF.getCurrentItem(), true);
            }
            locala.cCq();
          }
        }
        else {
          return;
        }
        if (locala.uSK == null)
        {
          x.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "mPanelStg is null");
          return;
        }
        locala.uSK.uWK = false;
        Object localObject;
        if (locala.mView == null)
        {
          locala.mView = View.inflate(locala.rc, a.f.smiley_panel_main, null);
          locala.uVF = ((SmileyPanelViewPager)locala.findViewById(a.e.smiley_panel_view_pager));
          locala.uVF.setPanelStg(locala.uSK);
          locala.uVF.setSmileyPanelViewPagerLayoutListener(locala);
          locala.uVF.setOnPageChangeListener(locala);
          locala.uVF.setOffscreenPageLimit(3);
          locala.uSK.gLa = locala.uVF.getWidth();
          locala.uVH = ((SmileyPanelScrollView)locala.findViewById(a.e.smiley_panel_dot));
          locala.uVH.setOnPageSelectListener(locala);
          locala.uVH.setSmileyPanelStg(locala.uSK);
          locala.uVI = ((HorizontalListViewV2)locala.findViewById(a.e.smiley_list_view));
          locala.uVJ = new com.tencent.mm.view.a.g(locala.gKE, locala.uSK);
          locala.uVI.setAdapter(locala.uVJ);
          locala.uVI.setOnItemClickListener(locala.uVZ);
          locala.uVP = ((TextView)locala.findViewById(a.e.send_btn));
          locala.uVL = ((ImageView)locala.findViewById(a.e.right_store_btn));
          locala.uVL.setOnClickListener(locala);
          locala.uVK = locala.findViewById(a.e.right_stoe_btn_container);
          locala.uVM = ((ImageView)locala.findViewById(a.e.right_store_btn_new));
          locala.uVP.setOnClickListener(locala);
          localObject = locala.uVP;
          if (!locala.uSK.cCE()) {
            break label529;
          }
          paramInt = 0;
          label373:
          ((TextView)localObject).setVisibility(paramInt);
          addView(locala.mView, new LinearLayout.LayoutParams(-1, -1));
          locala.uSK.uWK = true;
          localObject = locala.uVK;
          if ((!locala.uSK.uWu) && (!locala.uSK.uWv)) {
            break label535;
          }
          paramInt = 8;
          label433:
          ((View)localObject).setVisibility(paramInt);
          locala.uVO = ((ImageButton)locala.findViewById(a.e.hide_panel_btn));
          locala.uVO.setOnClickListener(locala);
          localObject = locala.uVO;
          if ((!locala.uSK.uWv) || (locala.uSK.fdx != ChatFooterPanel.qFf)) {
            break label540;
          }
        }
        label529:
        label535:
        label540:
        for (paramInt = i;; paramInt = 8)
        {
          ((ImageButton)localObject).setVisibility(paramInt);
          return;
          if (locala.mView.getParent() == null) {
            break;
          }
          ((ViewGroup)locala.mView.getParent()).removeView(locala.mView);
          break;
          paramInt = 8;
          break label373;
          paramInt = 0;
          break label433;
        }
      }
      x.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley Panel Manager is null.");
      return;
    }
    if (this.uSK != null)
    {
      this.uSK.cCJ();
      return;
    }
    x.w("MicroMsg.emoji.SmileyPanel.SmileyPanel", "Smiley PanelStg Manager is null.");
  }
  
  public final void ul()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "dealOrientationChange");
    this.uSJ.uSK.OT = 0;
  }
  
  public final void um()
  {
    this.qFa = null;
  }
  
  public final void un()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideCustomBtn");
    this.uSK.uWu = true;
  }
  
  public final void uo()
  {
    x.d("MicroMsg.emoji.SmileyPanel.SmileyPanel", "[hideDefaultBtn]");
    this.uSK.uWv = true;
  }
  
  public final void up()
  {
    Object localObject;
    if (this.uSJ != null)
    {
      localObject = this.uSJ;
      if ((((com.tencent.mm.view.e.a)localObject).uVF != null) && (((com.tencent.mm.view.e.a)localObject).uSK != null)) {
        break label48;
      }
    }
    for (;;)
    {
      if (this.uSK != null)
      {
        com.tencent.mm.bo.a.cgy();
        localObject = com.tencent.mm.bo.a.sCv;
        a.b.VP("TAG_DEFAULT_TAB");
      }
      return;
      label48:
      if (!((com.tencent.mm.view.e.a)localObject).uVT)
      {
        ((com.tencent.mm.view.e.a)localObject).uVU = "TAG_DEFAULT_TAB";
      }
      else
      {
        ((com.tencent.mm.view.e.a)localObject).uVU = null;
        ((com.tencent.mm.view.e.a)localObject).uVF.post(new a.3((com.tencent.mm.view.e.a)localObject, "TAG_DEFAULT_TAB"));
      }
    }
  }
  
  public final void uq()
  {
    this.uSK.uWC = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/view/SmileyPanelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */