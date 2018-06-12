package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.l;

public abstract class p
  implements View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private int IZ;
  private ViewTreeObserver Jd;
  private ViewGroup Je;
  private int dividerHeight;
  private View eS;
  private boolean gKt = false;
  private BaseAdapter hAv;
  protected Context mContext;
  private boolean qgI = false;
  private MMListPopupWindow tIc;
  private int tId = a.l.DropMenuAnimation;
  private DialogInterface.OnCancelListener uCh;
  private PopupWindow.OnDismissListener uCi;
  private boolean uCj = true;
  private View uCk;
  private int uCl;
  private int uCm = 0;
  private int uCn = 0;
  private int uCo = 0;
  private float uCp = 0.0F;
  private float uCq = 0.0F;
  
  public p(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = paramContext.getResources();
    this.IZ = Math.min(paramContext.getDisplayMetrics().widthPixels * 4 / 5, paramContext.getDimensionPixelSize(a.e.abc_config_prefDialogWidth));
    ViewGroup localViewGroup;
    if ((this.mContext instanceof Activity))
    {
      localViewGroup = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (localViewGroup.getChildCount() <= 0) {
        break label187;
      }
    }
    label187:
    for (this.eS = localViewGroup.getChildAt(0);; this.eS = localViewGroup)
    {
      this.dividerHeight = BackwardSupportUtil.b.b(this.mContext, 1.0F);
      this.uCm = (paramContext.getDimensionPixelSize(a.e.NormalPadding) * 2);
      this.uCn = paramContext.getDimensionPixelSize(a.e.SmallListHeight);
      this.uCo = BackwardSupportUtil.b.b(this.mContext, 36.0F);
      this.hAv = avF();
      return;
    }
  }
  
  private int a(ListAdapter paramListAdapter)
  {
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = paramListAdapter.getCount();
    int j = 0;
    int i = 0;
    View localView = null;
    int k = 0;
    if (j < i2)
    {
      int m = paramListAdapter.getItemViewType(j);
      if (m == i) {
        break label127;
      }
      localView = null;
      i = m;
    }
    label127:
    for (;;)
    {
      if (this.Je == null) {
        this.Je = new FrameLayout(this.mContext);
      }
      localView = paramListAdapter.getView(j, localView, this.Je);
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      return k;
    }
  }
  
  private boolean bdK()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    return localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels;
  }
  
  public abstract BaseAdapter avF();
  
  public boolean dZ()
  {
    Object localObject1 = new Rect();
    int i;
    int j;
    Object localObject2;
    if ((this.mContext instanceof ActionBarActivity))
    {
      i = ((ActionBarActivity)this.mContext).getSupportActionBar().getHeight();
      i -= this.mContext.getResources().getDimensionPixelSize(a.e.NormalPadding);
      if (!(this.mContext instanceof Activity)) {
        break label960;
      }
      ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
      j = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
      localObject2 = new int[2];
      ((Activity)this.mContext).getWindow().getDecorView().getLocationOnScreen((int[])localObject2);
      if ((j - ((Rect)localObject1).height() < 0) || (localObject2[1] <= 200)) {
        break label870;
      }
      i = j - ((Rect)localObject1).height() + i;
    }
    label147:
    label288:
    label443:
    label515:
    label870:
    label881:
    label887:
    label904:
    label945:
    label957:
    label960:
    for (;;)
    {
      this.qgI = bdK();
      if ((this.tIc == null) || (true == this.uCj)) {
        this.tIc = new MMListPopupWindow(this.mContext, null, 0);
      }
      this.tIc.setOnDismissListener(this);
      this.tIc.PY = this;
      this.tIc.setAdapter(this.hAv);
      this.tIc.crA();
      this.tIc.setBackgroundDrawable(this.mContext.getResources().getDrawable(a.f.ofm_menu_bg));
      this.tIc.setAnimationStyle(this.tId);
      this.tIc.PN = 0;
      this.tIc.PW = this.eS;
      boolean bool;
      if (this.eS != null)
      {
        if (this.Jd != null) {
          break label881;
        }
        bool = true;
        this.Jd = this.eS.getViewTreeObserver();
        x.v("MicroMsg.SubMenuHelperBase", "tryshow addGlobalListener:%b", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          this.Jd.addOnGlobalLayoutListener(this);
        }
      }
      this.tIc.setVerticalOffset(i);
      this.tIc.gKt = this.gKt;
      this.tIc.setContentWidth(Math.min(a(this.hAv), this.IZ));
      this.tIc.fo();
      if ((this.uCp != 0.0F) && (this.uCq != 0.0F))
      {
        localObject1 = new DisplayMetrics();
        ((Activity)this.mContext).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
        if (((DisplayMetrics)localObject1).widthPixels <= ((DisplayMetrics)localObject1).heightPixels) {
          break label887;
        }
        i = 1;
        localObject1 = new Rect();
        ((Activity)this.mContext).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject1);
        j = ((Activity)this.mContext).getWindow().getDecorView().getHeight();
        if (j <= ((Rect)localObject1).height()) {
          break label957;
        }
        j = ((Rect)localObject1).height();
      }
      for (;;)
      {
        if (i != 0)
        {
          i = (int)(this.uCq * j);
          x.d("MicroMsg.SubMenuHelperBase", "menuHeightPercentPort(%f), menuHeightPercentLand(%f), frameHeight(%d), decorViewHeight(%d), menuHeight(%d)", new Object[] { Float.valueOf(this.uCp), Float.valueOf(this.uCq), Integer.valueOf(((Rect)localObject1).height()), Integer.valueOf(j), Integer.valueOf(i) });
          i = Math.round(i / this.uCn);
          if ((i <= 0) || (this.hAv == null)) {
            break label945;
          }
          j = this.uCn * i + this.uCm;
          if ((j == 0) || (j >= this.hAv.getCount() * this.uCn)) {
            break label904;
          }
          j = this.uCn;
          int k = this.uCm;
          int m = this.uCo;
          this.tIc.PM = ((i - 1) * j + k + m);
        }
        for (;;)
        {
          if ((this.tIc != null) && (this.uCk != null))
          {
            localObject1 = this.tIc;
            localObject2 = this.uCk;
            bool = ((MMListPopupWindow)localObject1).eZB.isShowing();
            if (bool) {
              ((MMListPopupWindow)localObject1).aqa();
            }
            ((MMListPopupWindow)localObject1).PU = ((View)localObject2);
            if (bool) {
              ((MMListPopupWindow)localObject1).show();
            }
            this.tIc.PV = this.uCl;
          }
          this.tIc.show();
          this.tIc.tvU.setOnKeyListener(this);
          this.tIc.tvU.setSelector(new ColorDrawable(this.mContext.getResources().getColor(a.d.transparent)));
          this.tIc.tvU.setDividerHeight(0);
          this.tIc.tvU.setVerticalScrollBarEnabled(true);
          this.tIc.tvU.setHorizontalScrollBarEnabled(false);
          return true;
          localObject2 = this.mContext.getResources().getDisplayMetrics();
          if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
          {
            i = BackwardSupportUtil.b.b(this.mContext, 40.0F);
            break;
          }
          i = BackwardSupportUtil.b.b(this.mContext, 49.0F);
          break;
          i = ((Rect)localObject1).top + i;
          break label147;
          bool = false;
          break label288;
          i = 0;
          break label443;
          i = (int)(this.uCp * j);
          break label515;
          x.w("MicroMsg.SubMenuHelperBase", "[cpan] menuheight:%d,listHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(this.hAv.getCount() * this.uCn) });
          continue;
          x.e("MicroMsg.SubMenuHelperBase", "[cpan] setpopuHeight error.");
        }
      }
    }
  }
  
  public final void dismiss()
  {
    if (isShowing()) {
      this.tIc.dismiss();
    }
  }
  
  public final boolean isShowing()
  {
    return (this.tIc != null) && (this.tIc.eZB.isShowing());
  }
  
  public final void mw(boolean paramBoolean)
  {
    this.gKt = paramBoolean;
    if (paramBoolean)
    {
      this.tId = a.l.CenterMenuAnimation;
      return;
    }
    this.tId = a.l.DropMenuAnimation;
  }
  
  public void onDismiss()
  {
    this.tIc = null;
    if (this.Jd != null)
    {
      if (!this.Jd.isAlive()) {
        this.Jd = this.eS.getViewTreeObserver();
      }
      this.Jd.removeGlobalOnLayoutListener(this);
      this.Jd = null;
    }
    if (this.uCh != null) {
      this.uCh.onCancel(null);
    }
    if (this.uCi != null) {
      this.uCi.onDismiss();
    }
  }
  
  public void onGlobalLayout()
  {
    x.v("MicroMsg.SubMenuHelperBase", "onGlobalLayout showing:%b, anchorshown:%b", new Object[] { Boolean.valueOf(isShowing()), Boolean.valueOf(this.eS.isShown()) });
    if (isShowing())
    {
      View localView = this.eS;
      if ((localView != null) && (localView.isShown())) {
        break label64;
      }
      dismiss();
    }
    label64:
    while ((!isShowing()) || (this.qgI == bdK())) {
      return;
    }
    this.tIc.dismiss();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    dismiss();
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    x.v("MicroMsg.SubMenuHelperBase", "onKey");
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/tools/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */