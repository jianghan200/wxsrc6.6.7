package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.e;
import android.support.v7.a.a.f;
import android.support.v7.a.a.i;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.TextView;

public final class aq
  implements u
{
  Window.Callback Fu;
  private ActionMenuPresenter Jp;
  private final h Mb;
  private int Xh;
  private View Xi;
  private Drawable Xj;
  private Drawable Xk;
  private boolean Xl;
  private CharSequence Xm;
  boolean Xn;
  private int Xo = 0;
  private int Xp = 0;
  private Drawable Xq;
  Toolbar dT;
  private View hZ;
  private Drawable hh;
  CharSequence sn;
  private CharSequence so;
  
  public aq(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, a.i.abc_action_bar_up_description, a.e.abc_ic_ab_back_mtrl_am_alpha);
  }
  
  private aq(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.dT = paramToolbar;
    this.sn = paramToolbar.getTitle();
    this.so = paramToolbar.getSubtitle();
    boolean bool;
    int i;
    if (this.sn != null)
    {
      bool = true;
      this.Xl = bool;
      this.Xk = paramToolbar.getNavigationIcon();
      if (!paramBoolean) {
        break label639;
      }
      paramToolbar = ap.a(paramToolbar.getContext(), null, a.k.ActionBar, a.a.actionBarStyle);
      Object localObject = paramToolbar.getText(a.k.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        this.Xl = true;
        i((CharSequence)localObject);
      }
      localObject = paramToolbar.getText(a.k.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        this.so = ((CharSequence)localObject);
        if ((this.Xh & 0x8) != 0) {
          this.dT.setSubtitle((CharSequence)localObject);
        }
      }
      localObject = paramToolbar.getDrawable(a.k.ActionBar_logo);
      if (localObject != null) {
        setLogo((Drawable)localObject);
      }
      localObject = paramToolbar.getDrawable(a.k.ActionBar_icon);
      if ((this.Xk == null) && (localObject != null)) {
        setIcon((Drawable)localObject);
      }
      localObject = paramToolbar.getDrawable(a.k.ActionBar_homeAsUpIndicator);
      if (localObject != null)
      {
        this.Xk = ((Drawable)localObject);
        hh();
      }
      setDisplayOptions(paramToolbar.getInt(a.k.ActionBar_displayOptions, 0));
      i = paramToolbar.getResourceId(a.k.ActionBar_customNavigationLayout, 0);
      if (i != 0)
      {
        setCustomView(LayoutInflater.from(this.dT.getContext()).inflate(i, this.dT, false));
        setDisplayOptions(this.Xh | 0x10);
      }
      i = paramToolbar.getLayoutDimension(a.k.ActionBar_height, 0);
      if (i > 0)
      {
        localObject = this.dT.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = i;
        this.dT.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      int j = paramToolbar.getDimensionPixelOffset(a.k.ActionBar_contentInsetStart, -1);
      i = paramToolbar.getDimensionPixelOffset(a.k.ActionBar_contentInsetEnd, -1);
      if ((j >= 0) || (i >= 0))
      {
        localObject = this.dT;
        j = Math.max(j, 0);
        i = Math.max(i, 0);
        ((Toolbar)localObject).WN.aj(j, i);
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_titleTextStyle, 0);
      Context localContext;
      if (i != 0)
      {
        localObject = this.dT;
        localContext = this.dT.getContext();
        ((Toolbar)localObject).WF = i;
        if (((Toolbar)localObject).Wx != null) {
          ((Toolbar)localObject).Wx.setTextAppearance(localContext, i);
        }
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_subtitleTextStyle, 0);
      if (i != 0)
      {
        localObject = this.dT;
        localContext = this.dT.getContext();
        ((Toolbar)localObject).WG = i;
        if (((Toolbar)localObject).Wy != null) {
          ((Toolbar)localObject).Wy.setTextAppearance(localContext, i);
        }
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_popupTheme, 0);
      if (i != 0) {
        this.dT.setPopupTheme(i);
      }
      paramToolbar.Ww.recycle();
    }
    for (;;)
    {
      this.Mb = h.eJ();
      if (paramInt1 != this.Xp)
      {
        this.Xp = paramInt1;
        if (TextUtils.isEmpty(this.dT.getNavigationContentDescription())) {
          setNavigationContentDescription(this.Xp);
        }
      }
      this.Xm = this.dT.getNavigationContentDescription();
      paramToolbar = this.Mb.a(this.dT.getContext(), paramInt2, false);
      if (this.Xq != paramToolbar)
      {
        this.Xq = paramToolbar;
        hh();
      }
      this.dT.setNavigationOnClickListener(new View.OnClickListener()
      {
        final a Xr = new a(aq.this.dT.getContext(), aq.this.sn);
        
        public final void onClick(View paramAnonymousView)
        {
          if ((aq.this.Fu != null) && (aq.this.Xn)) {
            aq.this.Fu.onMenuItemSelected(0, this.Xr);
          }
        }
      });
      return;
      bool = false;
      break;
      label639:
      i = 11;
      if (this.dT.getNavigationIcon() != null) {
        i = 15;
      }
      this.Xh = i;
    }
  }
  
  private void hf()
  {
    Drawable localDrawable = null;
    if ((this.Xh & 0x2) != 0)
    {
      if ((this.Xh & 0x1) == 0) {
        break label49;
      }
      if (this.Xj == null) {
        break label41;
      }
      localDrawable = this.Xj;
    }
    for (;;)
    {
      this.dT.setLogo(localDrawable);
      return;
      label41:
      localDrawable = this.hh;
      continue;
      label49:
      localDrawable = this.hh;
    }
  }
  
  private void hg()
  {
    if ((this.Xh & 0x4) != 0)
    {
      if (TextUtils.isEmpty(this.Xm)) {
        this.dT.setNavigationContentDescription(this.Xp);
      }
    }
    else {
      return;
    }
    this.dT.setNavigationContentDescription(this.Xm);
  }
  
  private void hh()
  {
    Toolbar localToolbar;
    if ((this.Xh & 0x4) != 0)
    {
      localToolbar = this.dT;
      if (this.Xk == null) {
        break label32;
      }
    }
    label32:
    for (Drawable localDrawable = this.Xk;; localDrawable = this.Xq)
    {
      localToolbar.setNavigationIcon(localDrawable);
      return;
    }
  }
  
  private void i(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    if ((this.Xh & 0x8) != 0) {
      this.dT.setTitle(paramCharSequence);
    }
  }
  
  public final void a(l.a parama, f.a parama1)
  {
    Toolbar localToolbar = this.dT;
    localToolbar.KR = parama;
    localToolbar.KS = parama1;
    if (localToolbar.Jo != null) {
      localToolbar.Jo.a(parama, parama1);
    }
  }
  
  public final void a(ai paramai)
  {
    if ((this.Xi != null) && (this.Xi.getParent() == this.dT)) {
      this.dT.removeView(this.Xi);
    }
    this.Xi = paramai;
    if ((paramai != null) && (this.Xo == 2))
    {
      this.dT.addView(this.Xi, 0);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)this.Xi.getLayoutParams();
      localLayoutParams.width = -2;
      localLayoutParams.height = -2;
      localLayoutParams.gravity = 8388691;
      paramai.setAllowCollapse(true);
    }
  }
  
  public final void a(Menu paramMenu, l.a parama)
  {
    if (this.Jp == null)
    {
      this.Jp = new ActionMenuPresenter(this.dT.getContext());
      this.Jp.mId = a.f.action_menu_presenter;
    }
    this.Jp.bp = parama;
    parama = this.dT;
    paramMenu = (f)paramMenu;
    ActionMenuPresenter localActionMenuPresenter = this.Jp;
    if ((paramMenu != null) || (parama.Jo != null))
    {
      parama.hc();
      f localf = parama.Jo.bq;
      if (localf != paramMenu)
      {
        if (localf != null)
        {
          localf.b(parama.WY);
          localf.b(parama.WZ);
        }
        if (parama.WZ == null) {
          parama.WZ = new Toolbar.a(parama, (byte)0);
        }
        localActionMenuPresenter.Kz = true;
        if (paramMenu == null) {
          break label186;
        }
        paramMenu.a(localActionMenuPresenter, parama.Jn);
        paramMenu.a(parama.WZ, parama.Jn);
      }
    }
    for (;;)
    {
      parama.Jo.setPopupTheme(parama.KP);
      parama.Jo.setPresenter(localActionMenuPresenter);
      parama.WY = localActionMenuPresenter;
      return;
      label186:
      localActionMenuPresenter.a(parama.Jn, null);
      parama.WZ.a(parama.Jn, null);
      localActionMenuPresenter.n(true);
      parama.WZ.n(true);
    }
  }
  
  public final android.support.v4.view.ai c(final int paramInt, long paramLong)
  {
    android.support.v4.view.ai localai = z.U(this.dT);
    if (paramInt == 0) {}
    for (float f = 1.0F;; f = 0.0F) {
      localai.t(f).h(paramLong).a(new an()
      {
        private boolean Ju = false;
        
        public final void ar(View paramAnonymousView)
        {
          this.Ju = true;
        }
        
        public final void p(View paramAnonymousView)
        {
          aq.this.dT.setVisibility(0);
        }
        
        public final void q(View paramAnonymousView)
        {
          if (!this.Ju) {
            aq.this.dT.setVisibility(paramInt);
          }
        }
      });
    }
  }
  
  public final void collapseActionView()
  {
    this.dT.collapseActionView();
  }
  
  public final void dismissPopupMenus()
  {
    Toolbar localToolbar = this.dT;
    if (localToolbar.Jo != null) {
      localToolbar.Jo.dismissPopupMenus();
    }
  }
  
  public final ViewGroup eQ()
  {
    return this.dT;
  }
  
  public final boolean ef()
  {
    Toolbar localToolbar = this.dT;
    return (localToolbar.getVisibility() == 0) && (localToolbar.Jo != null) && (localToolbar.Jo.Kr);
  }
  
  public final boolean eg()
  {
    Object localObject = this.dT;
    if (((Toolbar)localObject).Jo != null)
    {
      localObject = ((Toolbar)localObject).Jo;
      if (((ActionMenuView)localObject).KQ != null)
      {
        localObject = ((ActionMenuView)localObject).KQ;
        if ((((ActionMenuPresenter)localObject).KF != null) || (((ActionMenuPresenter)localObject).isOverflowMenuShowing()))
        {
          i = 1;
          if (i == 0) {
            break label62;
          }
        }
      }
      label62:
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label67;
        }
        return true;
        i = 0;
        break;
      }
    }
    label67:
    return false;
  }
  
  public final void eh()
  {
    this.Xn = true;
  }
  
  public final Context getContext()
  {
    return this.dT.getContext();
  }
  
  public final View getCustomView()
  {
    return this.hZ;
  }
  
  public final int getDisplayOptions()
  {
    return this.Xh;
  }
  
  public final int getHeight()
  {
    return this.dT.getHeight();
  }
  
  public final Menu getMenu()
  {
    return this.dT.getMenu();
  }
  
  public final int getNavigationMode()
  {
    return this.Xo;
  }
  
  public final CharSequence getTitle()
  {
    return this.dT.getTitle();
  }
  
  public final int getVisibility()
  {
    return this.dT.getVisibility();
  }
  
  public final boolean hasExpandedActionView()
  {
    Toolbar localToolbar = this.dT;
    return (localToolbar.WZ != null) && (localToolbar.WZ.Xd != null);
  }
  
  public final boolean hideOverflowMenu()
  {
    Object localObject = this.dT;
    if (((Toolbar)localObject).Jo != null)
    {
      localObject = ((Toolbar)localObject).Jo;
      if ((((ActionMenuView)localObject).KQ != null) && (((ActionMenuView)localObject).KQ.hideOverflowMenu())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean isOverflowMenuShowing()
  {
    return this.dT.isOverflowMenuShowing();
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.dT.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setCollapsible(boolean paramBoolean)
  {
    this.dT.setCollapsible(paramBoolean);
  }
  
  public final void setCustomView(View paramView)
  {
    if ((this.hZ != null) && ((this.Xh & 0x10) != 0)) {
      this.dT.removeView(this.hZ);
    }
    this.hZ = paramView;
    if ((paramView != null) && ((this.Xh & 0x10) != 0)) {
      this.dT.addView(this.hZ);
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    int i = this.Xh ^ paramInt;
    this.Xh = paramInt;
    if (i != 0)
    {
      if ((i & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0) {
          break label115;
        }
        hh();
        hg();
      }
      if ((i & 0x3) != 0) {
        hf();
      }
      if ((i & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0) {
          break label126;
        }
        this.dT.setTitle(this.sn);
        this.dT.setSubtitle(this.so);
      }
    }
    for (;;)
    {
      if (((i & 0x10) != 0) && (this.hZ != null))
      {
        if ((paramInt & 0x10) == 0) {
          break label145;
        }
        this.dT.addView(this.hZ);
      }
      return;
      label115:
      this.dT.setNavigationIcon(null);
      break;
      label126:
      this.dT.setTitle(null);
      this.dT.setSubtitle(null);
    }
    label145:
    this.dT.removeView(this.hZ);
  }
  
  public final void setIcon(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = this.Mb.a(this.dT.getContext(), paramInt, false);; localDrawable = null)
    {
      setIcon(localDrawable);
      return;
    }
  }
  
  public final void setIcon(Drawable paramDrawable)
  {
    this.hh = paramDrawable;
    hf();
  }
  
  public final void setLogo(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = this.Mb.a(this.dT.getContext(), paramInt, false);; localDrawable = null)
    {
      setLogo(localDrawable);
      return;
    }
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.Xj = paramDrawable;
    hf();
  }
  
  public final void setNavigationContentDescription(int paramInt)
  {
    if (paramInt == 0) {}
    for (String str = null;; str = this.dT.getContext().getString(paramInt))
    {
      this.Xm = str;
      hg();
      return;
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    this.dT.setVisibility(paramInt);
  }
  
  public final void setWindowCallback(Window.Callback paramCallback)
  {
    this.Fu = paramCallback;
  }
  
  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!this.Xl) {
      i(paramCharSequence);
    }
  }
  
  public final boolean showOverflowMenu()
  {
    return this.dT.showOverflowMenu();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */