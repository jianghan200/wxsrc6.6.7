package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.h;
import android.support.v7.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;

public class k
  implements l, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int IW = a.h.abc_popup_menu_item_layout;
  private final LayoutInflater Bc;
  public boolean HW;
  public l.a IB;
  private final a IX;
  private final boolean IY;
  private final int IZ;
  private final int Ja;
  private final int Jb;
  public ListPopupWindow Jc;
  private ViewTreeObserver Jd;
  private ViewGroup Je;
  private boolean Jf;
  private int Jg;
  public int Jh = 0;
  private final f bq;
  public View eS;
  private final Context mContext;
  
  private k(Context paramContext, f paramf, View paramView)
  {
    this(paramContext, paramf, paramView, false, a.a.popupMenuStyle);
  }
  
  public k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramf, paramView, paramBoolean, paramInt, (byte)0);
  }
  
  private k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt, byte paramByte)
  {
    this.mContext = paramContext;
    this.Bc = LayoutInflater.from(paramContext);
    this.bq = paramf;
    this.IX = new a(this.bq);
    this.IY = paramBoolean;
    this.Ja = paramInt;
    this.Jb = 0;
    Resources localResources = paramContext.getResources();
    this.IZ = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    this.eS = paramView;
    paramf.a(this, paramContext);
  }
  
  public final boolean N()
  {
    return false;
  }
  
  public final void a(Context paramContext, f paramf) {}
  
  public final void a(f paramf, boolean paramBoolean)
  {
    if (paramf != this.bq) {}
    do
    {
      return;
      dismiss();
    } while (this.IB == null);
    this.IB.a(paramf, paramBoolean);
  }
  
  public final boolean a(p paramp)
  {
    k localk;
    int i;
    if (paramp.hasVisibleItems())
    {
      localk = new k(this.mContext, paramp, this.eS);
      localk.IB = this.IB;
      int j = paramp.size();
      i = 0;
      if (i >= j) {
        break label120;
      }
      MenuItem localMenuItem = paramp.getItem(i);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {}
    }
    label120:
    for (boolean bool = true;; bool = false)
    {
      localk.HW = bool;
      if (localk.dZ())
      {
        if (this.IB != null) {
          this.IB.d(paramp);
        }
        return true;
        i += 1;
        break;
      }
      return false;
    }
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public final boolean dZ()
  {
    this.Jc = new ListPopupWindow(this.mContext, null, this.Ja, this.Jb);
    this.Jc.setOnDismissListener(this);
    this.Jc.PY = this;
    this.Jc.setAdapter(this.IX);
    this.Jc.setModal(true);
    View localView = this.eS;
    int i;
    int k;
    int m;
    if (localView != null)
    {
      if (this.Jd == null) {}
      for (i = 1;; i = 0)
      {
        this.Jd = localView.getViewTreeObserver();
        if (i != 0) {
          this.Jd.addOnGlobalLayoutListener(this);
        }
        this.Jc.PW = localView;
        this.Jc.Jh = this.Jh;
        if (!this.Jf)
        {
          a locala = this.IX;
          int n = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i2 = locala.getCount();
          k = 0;
          int j = 0;
          localView = null;
          i = 0;
          m = i;
          if (k < i2)
          {
            m = locala.getItemViewType(k);
            if (m == j) {
              break label337;
            }
            j = m;
            localView = null;
            label196:
            if (this.Je == null) {
              this.Je = new FrameLayout(this.mContext);
            }
            localView = locala.getView(k, localView, this.Je);
            localView.measure(n, i1);
            m = localView.getMeasuredWidth();
            if (m < this.IZ) {
              break;
            }
            m = this.IZ;
          }
          this.Jg = m;
          this.Jf = true;
        }
        this.Jc.setContentWidth(this.Jg);
        this.Jc.fo();
        this.Jc.show();
        this.Jc.PL.setOnKeyListener(this);
        return true;
      }
    }
    return false;
    if (m > i) {
      i = m;
    }
    for (;;)
    {
      k += 1;
      break;
      label337:
      break label196;
    }
  }
  
  public final void dismiss()
  {
    if (isShowing()) {
      this.Jc.dismiss();
    }
  }
  
  public final int getId()
  {
    return 0;
  }
  
  public final boolean isShowing()
  {
    return (this.Jc != null) && (this.Jc.PK.isShowing());
  }
  
  public final void n(boolean paramBoolean)
  {
    this.Jf = false;
    if (this.IX != null) {
      this.IX.notifyDataSetChanged();
    }
  }
  
  public void onDismiss()
  {
    this.Jc = null;
    this.bq.close();
    if (this.Jd != null)
    {
      if (!this.Jd.isAlive()) {
        this.Jd = this.eS.getViewTreeObserver();
      }
      this.Jd.removeGlobalOnLayoutListener(this);
      this.Jd = null;
    }
  }
  
  public void onGlobalLayout()
  {
    if (isShowing())
    {
      View localView = this.eS;
      if ((localView != null) && (localView.isShown())) {
        break label28;
      }
      dismiss();
    }
    label28:
    while (!isShowing()) {
      return;
    }
    this.Jc.show();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.IX;
    a.a(paramAdapterView).a(paramAdapterView.aI(paramInt), null, 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public final Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  private final class a
    extends BaseAdapter
  {
    private int Ib = -1;
    private f Ji;
    
    public a(f paramf)
    {
      this.Ji = paramf;
      dF();
    }
    
    private void dF()
    {
      h localh = k.c(k.this).Ix;
      if (localh != null)
      {
        ArrayList localArrayList = k.c(k.this).dP();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          if ((h)localArrayList.get(i) == localh)
          {
            this.Ib = i;
            return;
          }
          i += 1;
        }
      }
      this.Ib = -1;
    }
    
    public final h aI(int paramInt)
    {
      if (k.a(k.this)) {}
      for (ArrayList localArrayList = this.Ji.dP();; localArrayList = this.Ji.dN())
      {
        int i = paramInt;
        if (this.Ib >= 0)
        {
          i = paramInt;
          if (paramInt >= this.Ib) {
            i = paramInt + 1;
          }
        }
        return (h)localArrayList.get(i);
      }
    }
    
    public final int getCount()
    {
      if (k.a(k.this)) {}
      for (ArrayList localArrayList = this.Ji.dP(); this.Ib < 0; localArrayList = this.Ji.dN()) {
        return localArrayList.size();
      }
      return localArrayList.size() - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = k.b(k.this).inflate(k.IW, paramViewGroup, false);
      }
      for (;;)
      {
        paramViewGroup = (m.a)paramView;
        if (k.this.HW) {
          ((ListMenuItemView)paramView).setForceShowIcon(true);
        }
        paramViewGroup.a(aI(paramInt));
        return paramView;
      }
    }
    
    public final void notifyDataSetChanged()
    {
      dF();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */