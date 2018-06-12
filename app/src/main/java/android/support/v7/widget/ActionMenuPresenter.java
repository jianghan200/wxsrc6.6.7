package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ae;
import android.support.v4.view.d;
import android.support.v4.view.d.a;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.a.a.h;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.m.a;
import android.support.v7.view.menu.p;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

final class ActionMenuPresenter
  extends b
  implements d.a
{
  private int KA;
  private final SparseBooleanArray KB = new SparseBooleanArray();
  private View KC;
  e KD;
  a KE;
  c KF;
  private b KG;
  final f KH = new f((byte)0);
  int KI;
  d Ko;
  Drawable Kp;
  boolean Kq;
  private boolean Kr;
  private boolean Ks;
  private int Kt;
  private int Ku;
  int Kv;
  boolean Kw;
  private boolean Kx;
  private boolean Ky;
  boolean Kz;
  
  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, a.h.abc_action_menu_layout, a.h.abc_action_menu_item_layout);
  }
  
  public final boolean N()
  {
    ArrayList localArrayList = this.bq.dN();
    int i4 = localArrayList.size();
    int i = this.Kv;
    int i3 = this.Ku;
    int i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.HJ;
    int k = 0;
    int m = 0;
    int n = 0;
    int j = 0;
    Object localObject1;
    if (j < i4)
    {
      localObject1 = (h)localArrayList.get(j);
      if (((h)localObject1).dX())
      {
        k += 1;
        label82:
        if ((!this.Kz) || (!((h)localObject1).isActionViewExpanded())) {
          break label740;
        }
        i = 0;
      }
    }
    label295:
    label415:
    label487:
    label526:
    label585:
    label597:
    label602:
    label728:
    label731:
    label740:
    for (;;)
    {
      j += 1;
      break;
      if (((h)localObject1).dW())
      {
        m += 1;
        break label82;
      }
      n = 1;
      break label82;
      j = i;
      if (this.Kr) {
        if (n == 0)
        {
          j = i;
          if (k + m <= i) {}
        }
        else
        {
          j = i - 1;
        }
      }
      j -= k;
      localObject1 = this.KB;
      ((SparseBooleanArray)localObject1).clear();
      i = 0;
      if (this.Kx)
      {
        i = i3 / this.KA;
        k = this.KA;
        m = this.KA;
      }
      for (int i1 = i3 % k / i + m;; i1 = 0)
      {
        k = 0;
        int i2 = 0;
        m = i3;
        h localh;
        Object localObject2;
        if (i2 < i4)
        {
          localh = (h)localArrayList.get(i2);
          if (localh.dX())
          {
            localObject2 = a(localh, this.KC, localViewGroup);
            if (this.KC == null) {
              this.KC = ((View)localObject2);
            }
            if (this.Kx)
            {
              i -= ActionMenuView.d((View)localObject2, i1, i, i5, 0);
              n = ((View)localObject2).getMeasuredWidth();
              if (k != 0) {
                break label731;
              }
              k = n;
            }
          }
        }
        for (;;)
        {
          i3 = localh.getGroupId();
          if (i3 != 0) {
            ((SparseBooleanArray)localObject1).put(i3, true);
          }
          localh.N(true);
          m -= n;
          i2 += 1;
          break;
          ((View)localObject2).measure(i5, i5);
          break label295;
          int i6;
          boolean bool;
          int i7;
          if (localh.dW())
          {
            i6 = localh.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i6);
            if (((j > 0) || (bool)) && (m > 0) && ((!this.Kx) || (i > 0)))
            {
              i7 = 1;
              if (i7 == 0) {
                break label728;
              }
              localObject2 = a(localh, this.KC, localViewGroup);
              if (this.KC == null) {
                this.KC = ((View)localObject2);
              }
              if (!this.Kx) {
                break label585;
              }
              i3 = ActionMenuView.d((View)localObject2, i1, i, i5, 0);
              n = i - i3;
              i = n;
              if (i3 == 0)
              {
                i7 = 0;
                i = n;
              }
              i3 = ((View)localObject2).getMeasuredWidth();
              m -= i3;
              n = k;
              if (k == 0) {
                n = i3;
              }
              if (!this.Kx) {
                break label602;
              }
              if (m < 0) {
                break label597;
              }
              k = 1;
              i7 &= k;
              k = n;
            }
          }
          for (;;)
          {
            if ((i7 != 0) && (i6 != 0)) {
              ((SparseBooleanArray)localObject1).put(i6, true);
            }
            for (;;)
            {
              n = j;
              if (i7 != 0) {
                n = j - 1;
              }
              localh.N(i7);
              j = n;
              break;
              int i8 = 0;
              break label415;
              ((View)localObject2).measure(i5, i5);
              break label487;
              k = 0;
              break label526;
              if (m + n > 0) {}
              for (k = 1;; k = 0)
              {
                i8 &= k;
                k = n;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i6, false);
                i3 = 0;
                for (;;)
                {
                  if (i3 < i2)
                  {
                    localObject2 = (h)localArrayList.get(i3);
                    n = j;
                    if (((h)localObject2).getGroupId() == i6)
                    {
                      n = j;
                      if (((h)localObject2).dV()) {
                        n = j + 1;
                      }
                      ((h)localObject2).N(false);
                    }
                    i3 += 1;
                    j = n;
                    continue;
                    localh.N(false);
                    break;
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final View a(h paramh, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramh.getActionView();
    if ((localView == null) || (paramh.dY())) {
      localView = super.a(paramh, paramView, paramViewGroup);
    }
    if (paramh.isActionViewExpanded()) {}
    for (int i = 8;; i = 0)
    {
      localView.setVisibility(i);
      paramh = (ActionMenuView)paramViewGroup;
      paramView = localView.getLayoutParams();
      if (!paramh.checkLayoutParams(paramView)) {
        localView.setLayoutParams(ActionMenuView.c(paramView));
      }
      return localView;
    }
  }
  
  public final void a(Context paramContext, f paramf)
  {
    boolean bool = true;
    super.a(paramContext, paramf);
    paramf = paramContext.getResources();
    paramContext = android.support.v7.view.a.R(paramContext);
    int i;
    if (!this.Ks)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        this.Kr = bool;
      }
    }
    else
    {
      if (!this.Ky) {
        this.Kt = (paramContext.mContext.getResources().getDisplayMetrics().widthPixels / 2);
      }
      if (!this.Kw) {
        this.Kv = paramContext.mContext.getResources().getInteger(a.g.abc_max_action_buttons);
      }
      i = this.Kt;
      if (!this.Kr) {
        break label227;
      }
      if (this.Ko == null)
      {
        this.Ko = new d(this.HF);
        if (this.Kq)
        {
          this.Ko.setImageDrawable(this.Kp);
          this.Kp = null;
          this.Kq = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.Ko.measure(j, j);
      }
      i -= this.Ko.getMeasuredWidth();
    }
    for (;;)
    {
      this.Ku = i;
      this.KA = ((int)(56.0F * paramf.getDisplayMetrics().density));
      this.KC = null;
      return;
      if (!ae.b(ViewConfiguration.get(paramContext.mContext))) {
        break;
      }
      bool = false;
      break;
      label227:
      this.Ko = null;
    }
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    ek();
    super.a(paramf, paramBoolean);
  }
  
  public final void a(h paramh, m.a parama)
  {
    parama.a(paramh);
    paramh = (ActionMenuView)this.HJ;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker(paramh);
    if (this.KG == null) {
      this.KG = new b((byte)0);
    }
    parama.setPopupCallback(this.KG);
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    this.HJ = paramActionMenuView;
    paramActionMenuView.bq = this.bq;
  }
  
  public final boolean a(p paramp)
  {
    if (!paramp.hasVisibleItems()) {
      return false;
    }
    for (Object localObject1 = paramp; ((p)localObject1).Jk != this.bq; localObject1 = (p)((p)localObject1).Jk) {}
    Object localObject2 = ((p)localObject1).getItem();
    ViewGroup localViewGroup = (ViewGroup)this.HJ;
    int i;
    if (localViewGroup != null)
    {
      int j = localViewGroup.getChildCount();
      i = 0;
      if (i < j)
      {
        localObject1 = localViewGroup.getChildAt(i);
        if ((!(localObject1 instanceof m.a)) || (((m.a)localObject1).getItemData() != localObject2)) {}
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 != null) {
        break label139;
      }
      if (this.Ko != null) {
        break label133;
      }
      return false;
      i += 1;
      break;
      localObject1 = null;
    }
    label133:
    localObject2 = this.Ko;
    label139:
    this.KI = paramp.getItem().getItemId();
    this.KE = new a(this.mContext, paramp);
    this.KE.eS = ((View)localObject2);
    if (!this.KE.dZ()) {
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    super.a(paramp);
    return true;
  }
  
  public final boolean c(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.Ko) {
      return false;
    }
    return super.c(paramViewGroup, paramInt);
  }
  
  public final m e(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.e(paramViewGroup);
    ((ActionMenuView)paramViewGroup).setPresenter(this);
    return paramViewGroup;
  }
  
  public final boolean e(h paramh)
  {
    return paramh.dV();
  }
  
  public final void ej()
  {
    this.Kr = true;
    this.Ks = true;
  }
  
  public final boolean ek()
  {
    return hideOverflowMenu() | el();
  }
  
  public final boolean el()
  {
    if (this.KE != null)
    {
      this.KE.dismiss();
      return true;
    }
    return false;
  }
  
  public final boolean hideOverflowMenu()
  {
    if ((this.KF != null) && (this.HJ != null))
    {
      ((View)this.HJ).removeCallbacks(this.KF);
      this.KF = null;
      return true;
    }
    e locale = this.KD;
    if (locale != null)
    {
      locale.dismiss();
      return true;
    }
    return false;
  }
  
  public final boolean isOverflowMenuShowing()
  {
    return (this.KD != null) && (this.KD.isShowing());
  }
  
  public final void n(boolean paramBoolean)
  {
    int j = 1;
    int k = 0;
    ((View)this.HJ).getParent();
    super.n(paramBoolean);
    ((View)this.HJ).requestLayout();
    Object localObject;
    int i;
    if (this.bq != null)
    {
      localObject = this.bq;
      ((f)localObject).dO();
      localObject = ((f)localObject).Ij;
      int m = ((ArrayList)localObject).size();
      i = 0;
      while (i < m)
      {
        d locald = ((h)((ArrayList)localObject).get(i)).IH;
        if (locald != null) {
          locald.ud = this;
        }
        i += 1;
      }
    }
    if (this.bq != null)
    {
      localObject = this.bq.dP();
      i = k;
      if (this.Kr)
      {
        i = k;
        if (localObject != null)
        {
          i = ((ArrayList)localObject).size();
          if (i != 1) {
            break label270;
          }
          if (((h)((ArrayList)localObject).get(0)).isActionViewExpanded()) {
            break label265;
          }
          i = 1;
        }
      }
      label165:
      if (i == 0) {
        break label284;
      }
      if (this.Ko == null) {
        this.Ko = new d(this.HF);
      }
      localObject = (ViewGroup)this.Ko.getParent();
      if (localObject != this.HJ)
      {
        if (localObject != null) {
          ((ViewGroup)localObject).removeView(this.Ko);
        }
        ((ActionMenuView)this.HJ).addView(this.Ko, ActionMenuView.eo());
      }
    }
    for (;;)
    {
      ((ActionMenuView)this.HJ).setOverflowReserved(this.Kr);
      return;
      localObject = null;
      break;
      label265:
      i = 0;
      break label165;
      label270:
      if (i > 0) {}
      for (i = j;; i = 0) {
        break;
      }
      label284:
      if ((this.Ko != null) && (this.Ko.getParent() == this.HJ)) {
        ((ViewGroup)this.HJ).removeView(this.Ko);
      }
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {}
    do
    {
      do
      {
        return;
        paramParcelable = (SavedState)paramParcelable;
      } while (paramParcelable.KO <= 0);
      paramParcelable = this.bq.findItem(paramParcelable.KO);
    } while (paramParcelable == null);
    a((p)paramParcelable.getSubMenu());
  }
  
  public final Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState();
    localSavedState.KO = this.KI;
    return localSavedState;
  }
  
  public final boolean showOverflowMenu()
  {
    if ((this.Kr) && (!isOverflowMenuShowing()) && (this.bq != null) && (this.HJ != null) && (this.KF == null) && (!this.bq.dP().isEmpty()))
    {
      this.KF = new c(new e(this.mContext, this.bq, this.Ko));
      ((View)this.HJ).post(this.KF);
      super.a(null);
      return true;
    }
    return false;
  }
  
  public final void w(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.bq.J(false);
  }
  
  private static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    public int KO;
    
    SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.KO = paramParcel.readInt();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.KO);
    }
  }
  
  private final class a
    extends k
  {
    private p IC;
    
    public a(Context paramContext, p paramp)
    {
      super(paramp, null, false, a.a.actionOverflowMenuStyle);
      this.IC = paramp;
      int j;
      int i;
      if (!((h)paramp.getItem()).dV())
      {
        if (ActionMenuPresenter.this.Ko == null)
        {
          paramContext = (View)ActionMenuPresenter.this.HJ;
          this.eS = paramContext;
        }
      }
      else
      {
        this.IB = ActionMenuPresenter.this.KH;
        j = paramp.size();
        i = 0;
      }
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          this$1 = paramp.getItem(i);
          if ((ActionMenuPresenter.this.isVisible()) && (ActionMenuPresenter.this.getIcon() != null)) {
            bool1 = true;
          }
        }
        else
        {
          this.HW = bool1;
          return;
          paramContext = ActionMenuPresenter.this.Ko;
          break;
        }
        i += 1;
      }
    }
    
    public final void onDismiss()
    {
      super.onDismiss();
      ActionMenuPresenter.this.KE = null;
      ActionMenuPresenter.this.KI = 0;
    }
  }
  
  private final class b
    extends ActionMenuItemView.b
  {
    private b() {}
    
    public final ListPopupWindow dB()
    {
      if (ActionMenuPresenter.this.KE != null) {
        return ActionMenuPresenter.this.KE.Jc;
      }
      return null;
    }
  }
  
  private final class c
    implements Runnable
  {
    private ActionMenuPresenter.e KK;
    
    public c(ActionMenuPresenter.e parame)
    {
      this.KK = parame;
    }
    
    public final void run()
    {
      Object localObject = ActionMenuPresenter.this.bq;
      if (((f)localObject).Ig != null) {
        ((f)localObject).Ig.b((f)localObject);
      }
      localObject = (View)ActionMenuPresenter.this.HJ;
      if ((localObject != null) && (((View)localObject).getWindowToken() != null) && (this.KK.dZ())) {
        ActionMenuPresenter.this.KD = this.KK;
      }
      ActionMenuPresenter.this.KF = null;
    }
  }
  
  private final class d
    extends AppCompatImageView
    implements ActionMenuView.a
  {
    private final float[] KL = new float[2];
    
    public d(Context paramContext)
    {
      super(null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      setOnTouchListener(new ListPopupWindow.b(this)
      {
        public final ListPopupWindow dB()
        {
          if (ActionMenuPresenter.this.KD == null) {
            return null;
          }
          return ActionMenuPresenter.this.KD.Jc;
        }
        
        public final boolean dC()
        {
          ActionMenuPresenter.this.showOverflowMenu();
          return true;
        }
        
        public final boolean em()
        {
          if (ActionMenuPresenter.this.KF != null) {
            return false;
          }
          ActionMenuPresenter.this.hideOverflowMenu();
          return true;
        }
      });
    }
    
    public final boolean dA()
    {
      return false;
    }
    
    public final boolean dz()
    {
      return false;
    }
    
    public final boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      ActionMenuPresenter.this.showOverflowMenu();
      return true;
    }
    
    protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt2 = getHeight();
        paramInt1 = Math.max(i, paramInt2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt3 = getPaddingTop();
        paramInt4 = getPaddingBottom();
        i = (i + (j - k)) / 2;
        paramInt2 = (paramInt2 + (paramInt3 - paramInt4)) / 2;
        android.support.v4.b.a.a.a(localDrawable2, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }
  
  private final class e
    extends k
  {
    public e(Context paramContext, f paramf, View paramView)
    {
      super(paramf, paramView, true, a.a.actionOverflowMenuStyle);
      this.Jh = 8388613;
      this.IB = ActionMenuPresenter.this.KH;
    }
    
    public final void onDismiss()
    {
      super.onDismiss();
      if (ActionMenuPresenter.this.bq != null) {
        ActionMenuPresenter.this.bq.close();
      }
      ActionMenuPresenter.this.KD = null;
    }
  }
  
  private final class f
    implements l.a
  {
    private f() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      if ((paramf instanceof p)) {
        ((p)paramf).Jk.J(false);
      }
      l.a locala = ActionMenuPresenter.this.bp;
      if (locala != null) {
        locala.a(paramf, paramBoolean);
      }
    }
    
    public final boolean d(f paramf)
    {
      if (paramf == null) {
        return false;
      }
      ActionMenuPresenter.this.KI = ((p)paramf).getItem().getItemId();
      l.a locala = ActionMenuPresenter.this.bp;
      if (locala != null) {
        return locala.d(paramf);
      }
      return false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionMenuPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */