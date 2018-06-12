package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Switch;
import com.tencent.mm.api.d;
import com.tencent.mm.api.e;
import com.tencent.mm.api.m.a;
import com.tencent.mm.api.n;
import com.tencent.mm.api.o;
import com.tencent.mm.api.o.a;
import com.tencent.mm.bd.a.a;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.bd.a.d;
import com.tencent.mm.bd.a.e;
import com.tencent.mm.bd.a.f;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.f;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;
import com.tencent.mm.view.footer.SelectColorBar;

public abstract class a
  extends com.tencent.mm.api.b
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private com.tencent.mm.bi.b bBn;
  private com.tencent.mm.view.b.a bwB;
  private m.a bwU;
  public boolean bwY = true;
  private View gxg;
  private Button iRz;
  private Button lqN;
  protected d[] uSp;
  private View uSq;
  private com.tencent.mm.view.footer.a uSr;
  private View uSs;
  private View uSt;
  public ChatFooterPanel uSu;
  private PhotoEditText uSv;
  private Switch uSw;
  private boolean uSx = true;
  
  public a(Context paramContext, m.a parama)
  {
    super(paramContext);
    this.bwU = parama;
    getPresenter().a(getConfig());
    removeAllViews();
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    addView(getBaseBoardView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.feature_select_all_layout_height));
    paramContext.gravity = 80;
    addView(getFooterBg(), paramContext);
    addView(getBaseFooterView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, -1);
    getTextEditView().setVisibility(8);
    addView(getTextEditView(), paramContext);
    getViewTreeObserver().addOnGlobalLayoutListener(this);
    paramContext = new FrameLayout.LayoutParams(-1, -2);
    paramContext.gravity = 80;
    getRubbishView().setVisibility(8);
    addView(getRubbishView(), paramContext);
    paramContext = new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.emoji_feature_layout_height));
    paramContext.gravity = 80;
    addView(getChatFooterPanel(), paramContext);
    new FrameLayout.LayoutParams(-1, (int)getResources().getDimension(a.c.DefaultActionbarHeightLand)).gravity = 48;
    if (this.bwU.bwY) {
      addView(getActionBar());
    }
  }
  
  protected abstract com.tencent.mm.view.b.a cBZ();
  
  protected abstract com.tencent.mm.view.footer.a cCa();
  
  public View getActionBar()
  {
    if (this.gxg == null)
    {
      this.gxg = LayoutInflater.from(getContext()).inflate(a.f.photoedit_actionbar_view, null);
      if (!ak.gw(getContext())) {
        break label125;
      }
    }
    label125:
    for (int i = ak.gv(getContext()) + 0;; i = 0)
    {
      this.gxg.setPadding(0, i, 0, 0);
      this.lqN = ((Button)this.gxg.findViewById(a.e.edit_text_ok));
      this.lqN.setOnClickListener(new a.1(this));
      this.iRz = ((Button)this.gxg.findViewById(a.e.edit_text_cancel));
      this.iRz.setOnClickListener(new a.6(this));
      return this.gxg;
    }
  }
  
  public <T extends com.tencent.mm.view.b.a> T getBaseBoardView()
  {
    if (this.bwB == null) {
      this.bwB = cBZ();
    }
    return this.bwB;
  }
  
  public <T extends com.tencent.mm.view.footer.a> T getBaseFooterView()
  {
    if (this.uSr == null) {
      this.uSr = cCa();
    }
    return this.uSr;
  }
  
  public ChatFooterPanel getChatFooterPanel()
  {
    boolean bool = false;
    if (this.uSu == null) {}
    try
    {
      Object localObject = getContext();
      this.uSu = o.bxf.aS((Context)localObject);
      this.uSu.setEntranceScene(ChatFooterPanel.qFf);
      this.uSu.setBackgroundResource(a.d.bottombar_bg);
      this.uSu.uo();
      this.uSu.aE(true);
      this.uSu.i(true, true);
      this.uSu.setVisibility(8);
      this.uSu.onResume();
      localObject = o.bxf.ur();
      ((n)localObject).bxe = new a.9(this);
      this.uSu.setCallback((f)localObject);
      return this.uSu;
    }
    catch (Exception localException)
    {
      String str = localException.getMessage();
      if (getContext() == null) {
        bool = true;
      }
      x.e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", new Object[] { str, Boolean.valueOf(bool) });
      throw localException;
    }
  }
  
  public m.a getConfig()
  {
    return this.bwU;
  }
  
  public abstract d[] getFeatures();
  
  public View getFooterBg()
  {
    if (this.uSq == null)
    {
      this.uSq = LayoutInflater.from(getContext()).inflate(a.f.footer_bg_view, null);
      this.uSq.setVisibility(0);
    }
    return this.uSq;
  }
  
  public com.tencent.mm.bi.b getPresenter()
  {
    if (this.bBn == null)
    {
      this.bBn = new com.tencent.mm.bi.a();
      this.bBn.a(this);
    }
    return this.bBn;
  }
  
  public View getRubbishView()
  {
    if (this.uSs == null) {
      this.uSt = LayoutInflater.from(getContext()).inflate(a.f.rubbish_view, null);
    }
    return this.uSt;
  }
  
  public View getTextEditView()
  {
    if (this.uSs == null)
    {
      this.uSs = LayoutInflater.from(getContext()).inflate(a.f.edit_text_view, null);
      this.uSv = ((PhotoEditText)this.uSs.findViewById(a.e.text_edit));
      SelectColorBar localSelectColorBar = (SelectColorBar)this.uSs.findViewById(a.e.select_color_bar);
      this.uSw = ((Switch)this.uSs.findViewById(a.e.bg_switch));
      this.uSw.setTag(Integer.valueOf(-707825));
      this.uSw.setOnCheckedChangeListener(new a.7(this, localSelectColorBar));
      this.uSv.setTextColor(-1);
      localSelectColorBar.setSelectColor(-1);
      localSelectColorBar.setSelectColorListener(new a.8(this));
    }
    return this.uSs;
  }
  
  public final void mK(boolean paramBoolean)
  {
    x.i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.uSu.getVisibility() == 0) && (paramBoolean))
    {
      this.uSu.setVisibility(8);
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.push_down_out);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          a.d(a.this).setVisibility(8);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          a.d(a.this).setVisibility(0);
        }
      });
      this.uSu.startAnimation(localAnimation);
    }
    while ((this.uSu.getVisibility() != 8) || (paramBoolean)) {
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.push_up_in);
    localAnimation.setAnimationListener(new a.4(this));
    this.uSu.startAnimation(localAnimation);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    post(new a.10(this));
  }
  
  public void onGlobalLayout()
  {
    if (getTextEditView().getVisibility() == 0)
    {
      getViewTreeObserver().removeOnGlobalLayoutListener(this);
      this.uSv.postDelayed(new Runnable()
      {
        public final void run()
        {
          Object localObject = new Rect();
          a.this.getWindowVisibleDisplayFrame((Rect)localObject);
          if (a.this.getBottom() - ((Rect)localObject).bottom >= 300)
          {
            i = 1;
            localObject = a.this.getResources().getDisplayMetrics();
            if (i != 0) {
              break label130;
            }
          }
          label130:
          for (int i = ((DisplayMetrics)localObject).heightPixels - (int)a.this.getResources().getDimension(a.c.color_select_layout_height);; i = ((DisplayMetrics)localObject).heightPixels - j.s(a.this.getContext(), false) - (int)a.this.getResources().getDimension(a.c.color_select_layout_height))
          {
            if (a.b(a.this).getHeight() != i) {
              a.b(a.this).setHeight(i);
            }
            a.this.getViewTreeObserver().removeOnGlobalLayoutListener(a.this);
            a.this.getViewTreeObserver().addOnGlobalLayoutListener(a.this);
            return;
            i = 0;
            break;
          }
        }
      }, 160L);
    }
  }
  
  public void setActionBarCallback(e parame)
  {
    getPresenter().setActionBarCallback(parame);
  }
  
  public void setActionBarVisible(boolean paramBoolean)
  {
    if (this.bwY == paramBoolean)
    {
      x.w("MicroMsg.BaseDrawingView", "[setActionBarVisible] isShowActionBar == isShow");
      return;
    }
    this.bwY = paramBoolean;
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_in);
      localAnimation.setAnimationListener(new a.11(this));
      getActionBar().startAnimation(localAnimation);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_out);
    localAnimation.setAnimationListener(new a.12(this));
    getActionBar().startAnimation(localAnimation);
  }
  
  public void setAutoShowFooterAndBar(boolean paramBoolean)
  {
    getPresenter().setAutoShowFooterAndBar(paramBoolean);
  }
  
  public void setFooterBgVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_in);
      localAnimation.setAnimationListener(new a.13(this));
      getActionBar().startAnimation(localAnimation);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), a.a.alpha_out);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        a.this.getFooterBg().setVisibility(8);
        a.this.getActionBar().setVisibility(8);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    getActionBar().startAnimation(localAnimation);
  }
  
  public void setFooterVisible(boolean paramBoolean)
  {
    if (this.uSx != paramBoolean)
    {
      getBaseFooterView().setFooterVisible(paramBoolean);
      setFooterBgVisible(paramBoolean);
      this.uSx = paramBoolean;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */