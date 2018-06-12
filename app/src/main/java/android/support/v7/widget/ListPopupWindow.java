package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.b.a.a;
import android.support.v4.d.f;
import android.support.v4.view.ai;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v4.widget.k;
import android.support.v4.widget.m;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ListPopupWindow
{
  private static Method PI;
  private static Method PJ;
  private ListAdapter Do;
  public int Jh = 0;
  public int MU = -2;
  private int OK;
  public PopupWindow PK;
  public a PL;
  public int PM = -2;
  int PN;
  int PO;
  private int PP = 1002;
  boolean PQ;
  private boolean PR = false;
  private boolean PS = false;
  int PT = Integer.MAX_VALUE;
  private View PU;
  int PV = 0;
  public View PW;
  private Drawable PX;
  public AdapterView.OnItemClickListener PY;
  private AdapterView.OnItemSelectedListener PZ;
  private final g Qa = new g((byte)0);
  private final f Qb = new f((byte)0);
  private final e Qc = new e((byte)0);
  private final c Qd = new c((byte)0);
  private Runnable Qe;
  private boolean Qf;
  private Rect bJ = new Rect();
  private Context mContext;
  private final Handler mHandler;
  private DataSetObserver mObserver;
  
  static
  {
    try
    {
      PI = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      try
      {
        PJ = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException1) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;) {}
    }
  }
  
  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ListPopupWindow, paramInt1, paramInt2);
    this.PN = localTypedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    this.PO = localTypedArray.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (this.PO != 0) {
      this.PQ = true;
    }
    localTypedArray.recycle();
    this.PK = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt1);
    this.PK.setInputMethodMode(1);
    this.OK = f.getLayoutDirectionFromLocale(this.mContext.getResources().getConfiguration().locale);
  }
  
  private int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    if (PJ != null) {
      try
      {
        int i = ((Integer)PJ.invoke(this.PK, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        return i;
      }
      catch (Exception localException) {}
    }
    return this.PK.getMaxAvailableHeight(paramView, paramInt);
  }
  
  public final void clearListSelection()
  {
    a locala = this.PL;
    if (locala != null)
    {
      a.a(locala, true);
      locala.requestLayout();
    }
  }
  
  public final void dismiss()
  {
    this.PK.dismiss();
    if (this.PU != null)
    {
      ViewParent localViewParent = this.PU.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.PU);
      }
    }
    this.PK.setContentView(null);
    this.PL = null;
    this.mHandler.removeCallbacks(this.Qa);
  }
  
  public final void fo()
  {
    this.PK.setInputMethodMode(2);
  }
  
  public final boolean isInputMethodNotNeeded()
  {
    return this.PK.getInputMethodMode() == 2;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mObserver == null) {
      this.mObserver = new d((byte)0);
    }
    for (;;)
    {
      this.Do = paramListAdapter;
      if (this.Do != null) {
        paramListAdapter.registerDataSetObserver(this.mObserver);
      }
      if (this.PL != null) {
        this.PL.setAdapter(this.Do);
      }
      return;
      if (this.Do != null) {
        this.Do.unregisterDataSetObserver(this.mObserver);
      }
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.PK.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.PK.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.bJ);
      this.MU = (this.bJ.left + this.bJ.right + paramInt);
      return;
    }
    this.MU = paramInt;
  }
  
  public final void setModal(boolean paramBoolean)
  {
    this.Qf = paramBoolean;
    this.PK.setFocusable(paramBoolean);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.PK.setOnDismissListener(paramOnDismissListener);
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    this.PO = paramInt;
    this.PQ = true;
  }
  
  public void show()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    label246:
    int j;
    int i;
    if (this.PL == null)
    {
      localObject2 = this.mContext;
      this.Qe = new Runnable()
      {
        public final void run()
        {
          View localView = ListPopupWindow.this.PW;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            ListPopupWindow.this.show();
          }
        }
      };
      if (!this.Qf)
      {
        bool1 = true;
        this.PL = new a((Context)localObject2, bool1);
        if (this.PX != null) {
          this.PL.setSelector(this.PX);
        }
        this.PL.setAdapter(this.Do);
        this.PL.setOnItemClickListener(this.PY);
        this.PL.setFocusable(true);
        this.PL.setFocusableInTouchMode(true);
        this.PL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = ListPopupWindow.a(ListPopupWindow.this);
              if (paramAnonymousAdapterView != null) {
                ListPopupWindow.a.a(paramAnonymousAdapterView, false);
              }
            }
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
        this.PL.setOnScrollListener(this.Qc);
        if (this.PZ != null) {
          this.PL.setOnItemSelectedListener(this.PZ);
        }
        localObject1 = this.PL;
        localView = this.PU;
        if (localView == null) {
          break label1215;
        }
        localObject2 = new LinearLayout((Context)localObject2);
        ((LinearLayout)localObject2).setOrientation(1);
        localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (this.PV)
        {
        default: 
          new StringBuilder("Invalid hint position ").append(this.PV);
          if (this.MU >= 0)
          {
            j = this.MU;
            i = Integer.MIN_VALUE;
            label262:
            localView.measure(View.MeasureSpec.makeMeasureSpec(j, i), 0);
            localObject1 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            i = localView.getMeasuredHeight();
            j = ((LinearLayout.LayoutParams)localObject1).topMargin;
            i = ((LinearLayout.LayoutParams)localObject1).bottomMargin + (i + j);
            localObject1 = localObject2;
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.PK.setContentView((View)localObject1);
      for (;;)
      {
        label318:
        localObject1 = this.PK.getBackground();
        int k;
        label381:
        label395:
        int m;
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(this.bJ);
          j = this.bJ.top + this.bJ.bottom;
          k = j;
          if (!this.PQ)
          {
            this.PO = (-this.bJ.top);
            k = j;
          }
          if (this.PK.getInputMethodMode() != 2) {
            break label718;
          }
          bool1 = true;
          m = getMaxAvailableHeight(this.PW, this.PO, bool1);
          if ((!this.PR) && (this.PM != -1)) {
            break label724;
          }
          i = m + k;
          bool1 = isInputMethodNotNeeded();
          m.a(this.PK, this.PP);
          if (!this.PK.isShowing()) {
            break label973;
          }
          if (this.MU != -1) {
            break label874;
          }
          j = -1;
          label468:
          if (this.PM != -1) {
            break label950;
          }
          if (!bool1) {
            break label902;
          }
          label481:
          if (!bool1) {
            break label912;
          }
          localObject1 = this.PK;
          if (this.MU != -1) {
            break label907;
          }
          k = -1;
          label502:
          ((PopupWindow)localObject1).setWidth(k);
          this.PK.setHeight(0);
        }
        for (;;)
        {
          label516:
          localObject1 = this.PK;
          if ((!this.PS) && (!this.PR))
          {
            bool1 = bool2;
            label540:
            ((PopupWindow)localObject1).setOutsideTouchable(bool1);
            localObject1 = this.PK;
            localObject2 = this.PW;
            m = this.PN;
            int n = this.PO;
            k = j;
            if (j < 0) {
              k = -1;
            }
            j = i;
            if (i < 0) {
              j = -1;
            }
            ((PopupWindow)localObject1).update((View)localObject2, m, n, k, j);
          }
          for (;;)
          {
            return;
            bool1 = false;
            break;
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            ((LinearLayout)localObject2).addView(localView);
            break label246;
            ((LinearLayout)localObject2).addView(localView);
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            break label246;
            i = 0;
            j = 0;
            break label262;
            this.PK.getContentView();
            localObject1 = this.PU;
            if (localObject1 == null) {
              break label1210;
            }
            localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            i = ((View)localObject1).getMeasuredHeight();
            j = ((LinearLayout.LayoutParams)localObject2).topMargin;
            i = ((LinearLayout.LayoutParams)localObject2).bottomMargin + (i + j);
            break label318;
            this.bJ.setEmpty();
            k = 0;
            break label381;
            label718:
            bool1 = false;
            break label395;
            label724:
            switch (this.MU)
            {
            default: 
              j = View.MeasureSpec.makeMeasureSpec(this.MU, 1073741824);
            }
            for (;;)
            {
              m = this.PL.S(j, m - i);
              j = i;
              if (m > 0) {
                j = i + k;
              }
              i = j + m;
              break;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.bJ.left + this.bJ.right), Integer.MIN_VALUE);
              continue;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.bJ.left + this.bJ.right), 1073741824);
            }
            label874:
            if (this.MU == -2)
            {
              j = this.PW.getWidth();
              break label468;
            }
            j = this.MU;
            break label468;
            label902:
            i = -1;
            break label481;
            label907:
            k = 0;
            break label502;
            label912:
            localObject1 = this.PK;
            if (this.MU == -1) {}
            for (k = -1;; k = 0)
            {
              ((PopupWindow)localObject1).setWidth(k);
              this.PK.setHeight(-1);
              break;
            }
            label950:
            if (this.PM != -2)
            {
              i = this.PM;
              break label516;
              bool1 = false;
              break label540;
              label973:
              if (this.MU == -1)
              {
                j = -1;
                label983:
                if (this.PM != -1) {
                  break label1179;
                }
                i = -1;
                label993:
                this.PK.setWidth(j);
                this.PK.setHeight(i);
                if (PI == null) {}
              }
              try
              {
                PI.invoke(this.PK, new Object[] { Boolean.valueOf(true) });
                localObject1 = this.PK;
                if ((!this.PS) && (!this.PR)) {}
                for (bool1 = bool3;; bool1 = false)
                {
                  ((PopupWindow)localObject1).setOutsideTouchable(bool1);
                  this.PK.setTouchInterceptor(this.Qb);
                  m.a(this.PK, this.PW, this.PN, this.PO, this.Jh);
                  this.PL.setSelection(-1);
                  if ((!this.Qf) || (this.PL.isInTouchMode())) {
                    clearListSelection();
                  }
                  if (this.Qf) {
                    break;
                  }
                  this.mHandler.post(this.Qd);
                  return;
                  if (this.MU == -2)
                  {
                    j = this.PW.getWidth();
                    break label983;
                  }
                  j = this.MU;
                  break label983;
                  label1179:
                  if (this.PM == -2) {
                    break label993;
                  }
                  i = this.PM;
                  break label993;
                }
              }
              catch (Exception localException)
              {
                for (;;) {}
              }
            }
          }
        }
        label1210:
        i = 0;
      }
      label1215:
      i = 0;
    }
  }
  
  private static final class a
    extends ListViewCompat
  {
    private boolean Qh;
    private boolean Qi;
    private boolean Qj;
    private ai Qk;
    private k Ql;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(null, a.a.dropDownListViewStyle);
      this.Qi = paramBoolean;
      setCacheColorHint(0);
    }
    
    protected final boolean fp()
    {
      return (this.Qj) || (super.fp());
    }
    
    public final boolean h(MotionEvent paramMotionEvent, int paramInt)
    {
      boolean bool1 = true;
      boolean bool2 = true;
      int i = 0;
      int j = o.d(paramMotionEvent);
      View localView;
      switch (j)
      {
      default: 
        paramInt = i;
        bool1 = bool2;
        if ((!bool1) || (paramInt != 0))
        {
          this.Qj = false;
          setPressed(false);
          drawableStateChanged();
          localView = getChildAt(this.QC - getFirstVisiblePosition());
          if (localView != null) {
            localView.setPressed(false);
          }
          if (this.Qk != null)
          {
            this.Qk.cancel();
            this.Qk = null;
          }
        }
        if (bool1)
        {
          if (this.Ql == null) {
            this.Ql = new k(this);
          }
          this.Ql.y(true);
          this.Ql.onTouch(this, paramMotionEvent);
        }
        break;
      }
      label418:
      label555:
      label708:
      label714:
      while (this.Ql == null)
      {
        return bool1;
        bool1 = false;
        paramInt = i;
        break;
        bool1 = false;
        int k = paramMotionEvent.findPointerIndex(paramInt);
        if (k < 0)
        {
          bool1 = false;
          paramInt = i;
          break;
        }
        paramInt = (int)paramMotionEvent.getX(k);
        int m = (int)paramMotionEvent.getY(k);
        k = pointToPosition(paramInt, m);
        if (k == -1)
        {
          paramInt = 1;
          break;
        }
        localView = getChildAt(k - getFirstVisiblePosition());
        float f1 = paramInt;
        float f2 = m;
        this.Qj = true;
        if (Build.VERSION.SDK_INT >= 21) {
          drawableHotspotChanged(f1, f2);
        }
        if (!isPressed()) {
          setPressed(true);
        }
        layoutChildren();
        if (this.QC != -1)
        {
          localObject1 = getChildAt(this.QC - getFirstVisiblePosition());
          if ((localObject1 != null) && (localObject1 != localView) && (((View)localObject1).isPressed())) {
            ((View)localObject1).setPressed(false);
          }
        }
        this.QC = k;
        float f3 = localView.getLeft();
        float f4 = localView.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
          localView.drawableHotspotChanged(f1 - f3, f2 - f4);
        }
        if (!localView.isPressed()) {
          localView.setPressed(true);
        }
        Object localObject1 = getSelector();
        Object localObject2;
        if ((localObject1 != null) && (k != -1))
        {
          paramInt = 1;
          if (paramInt != 0) {
            ((Drawable)localObject1).setVisible(false, false);
          }
          localObject2 = this.Qx;
          ((Rect)localObject2).set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          ((Rect)localObject2).left -= this.Qy;
          ((Rect)localObject2).top -= this.Qz;
          ((Rect)localObject2).right += this.QA;
          ((Rect)localObject2).bottom += this.QB;
        }
        try
        {
          bool1 = this.QD.getBoolean(this);
          if (localView.isEnabled() != bool1)
          {
            localObject2 = this.QD;
            if (bool1) {
              break label708;
            }
            bool1 = true;
            ((Field)localObject2).set(this, Boolean.valueOf(bool1));
            if (k != -1) {
              refreshDrawableState();
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;) {}
        }
        if (paramInt != 0)
        {
          localObject2 = this.Qx;
          f3 = ((Rect)localObject2).exactCenterX();
          f4 = ((Rect)localObject2).exactCenterY();
          if (getVisibility() != 0) {
            break label714;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          ((Drawable)localObject1).setVisible(bool1, false);
          a.a((Drawable)localObject1, f3, f4);
          localObject1 = getSelector();
          if ((localObject1 != null) && (k != -1)) {
            a.a((Drawable)localObject1, f1, f2);
          }
          setSelectorEnabled(false);
          refreshDrawableState();
          bool2 = true;
          bool1 = bool2;
          paramInt = i;
          if (j != 1) {
            break;
          }
          performItemClick(localView, k, getItemIdAtPosition(k));
          bool1 = bool2;
          paramInt = i;
          break;
          paramInt = 0;
          break label418;
          bool1 = false;
          break label555;
        }
      }
      this.Ql.y(false);
      return bool1;
    }
    
    public final boolean hasFocus()
    {
      return (this.Qi) || (super.hasFocus());
    }
    
    public final boolean hasWindowFocus()
    {
      return (this.Qi) || (super.hasWindowFocus());
    }
    
    public final boolean isFocused()
    {
      return (this.Qi) || (super.isFocused());
    }
    
    public final boolean isInTouchMode()
    {
      return ((this.Qi) && (this.Qh)) || (super.isInTouchMode());
    }
  }
  
  public static abstract class b
    implements View.OnTouchListener
  {
    private final float Qm;
    private final int Qn;
    private final int Qo;
    private final View Qp;
    private Runnable Qq;
    private Runnable Qr;
    private boolean Qs;
    private boolean Qt;
    private final int[] Qu = new int[2];
    private int cF;
    
    public b(View paramView)
    {
      this.Qp = paramView;
      this.Qm = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      this.Qn = ViewConfiguration.getTapTimeout();
      this.Qo = ((this.Qn + ViewConfiguration.getLongPressTimeout()) / 2);
    }
    
    private void fq()
    {
      if (this.Qr != null) {
        this.Qp.removeCallbacks(this.Qr);
      }
      if (this.Qq != null) {
        this.Qp.removeCallbacks(this.Qq);
      }
    }
    
    private boolean l(MotionEvent paramMotionEvent)
    {
      boolean bool1 = true;
      Object localObject1 = this.Qp;
      Object localObject2 = dB();
      if ((localObject2 == null) || (!((ListPopupWindow)localObject2).PK.isShowing())) {
        bool1 = false;
      }
      for (;;)
      {
        return bool1;
        localObject2 = ListPopupWindow.a((ListPopupWindow)localObject2);
        if ((localObject2 == null) || (!((ListPopupWindow.a)localObject2).isShown())) {
          return false;
        }
        MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
        int[] arrayOfInt = this.Qu;
        ((View)localObject1).getLocationOnScreen(arrayOfInt);
        localMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
        localObject1 = this.Qu;
        ((View)localObject2).getLocationOnScreen((int[])localObject1);
        localMotionEvent.offsetLocation(-localObject1[0], -localObject1[1]);
        boolean bool2 = ((ListPopupWindow.a)localObject2).h(localMotionEvent, this.cF);
        localMotionEvent.recycle();
        int i = o.d(paramMotionEvent);
        if ((i != 1) && (i != 3)) {}
        for (i = 1; (!bool2) || (i == 0); i = 0) {
          return false;
        }
      }
    }
    
    public abstract ListPopupWindow dB();
    
    public boolean dC()
    {
      ListPopupWindow localListPopupWindow = dB();
      if ((localListPopupWindow != null) && (!localListPopupWindow.PK.isShowing())) {
        localListPopupWindow.show();
      }
      return true;
    }
    
    protected boolean em()
    {
      ListPopupWindow localListPopupWindow = dB();
      if ((localListPopupWindow != null) && (localListPopupWindow.PK.isShowing())) {
        localListPopupWindow.dismiss();
      }
      return true;
    }
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      boolean bool2 = false;
      boolean bool3 = this.Qs;
      if (bool3)
      {
        if (this.Qt) {
          bool1 = l(paramMotionEvent);
        }
        for (;;)
        {
          this.Qs = bool1;
          if (!bool1)
          {
            bool1 = bool2;
            if (!bool3) {}
          }
          else
          {
            bool1 = true;
          }
          return bool1;
          if ((l(paramMotionEvent)) || (!em())) {
            bool1 = true;
          } else {
            bool1 = false;
          }
        }
      }
      paramView = this.Qp;
      if (paramView.isEnabled()) {}
      label128:
      int i;
      switch (o.d(paramMotionEvent))
      {
      default: 
        i = 0;
        label131:
        if ((i == 0) || (!dC())) {
          break;
        }
      }
      for (boolean bool1 = true;; bool1 = false)
      {
        if (bool1)
        {
          long l = SystemClock.uptimeMillis();
          paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          this.Qp.onTouchEvent(paramView);
          paramView.recycle();
        }
        break;
        this.cF = paramMotionEvent.getPointerId(0);
        this.Qt = false;
        if (this.Qq == null) {
          this.Qq = new a((byte)0);
        }
        paramView.postDelayed(this.Qq, this.Qn);
        if (this.Qr == null) {
          this.Qr = new b((byte)0);
        }
        paramView.postDelayed(this.Qr, this.Qo);
        break label128;
        i = paramMotionEvent.findPointerIndex(this.cF);
        if (i < 0) {
          break label128;
        }
        float f1 = paramMotionEvent.getX(i);
        float f2 = paramMotionEvent.getY(i);
        float f3 = this.Qm;
        if ((f1 >= -f3) && (f2 >= -f3) && (f1 < paramView.getRight() - paramView.getLeft() + f3) && (f2 < paramView.getBottom() - paramView.getTop() + f3)) {}
        for (i = 1; i == 0; i = 0)
        {
          fq();
          paramView.getParent().requestDisallowInterceptTouchEvent(true);
          i = 1;
          break label131;
        }
        fq();
        break label128;
      }
    }
    
    private final class a
      implements Runnable
    {
      private a() {}
      
      public final void run()
      {
        ListPopupWindow.b.a(ListPopupWindow.b.this).getParent().requestDisallowInterceptTouchEvent(true);
      }
    }
    
    private final class b
      implements Runnable
    {
      private b() {}
      
      public final void run()
      {
        ListPopupWindow.b.b(ListPopupWindow.b.this);
      }
    }
  }
  
  private final class c
    implements Runnable
  {
    private c() {}
    
    public final void run()
    {
      ListPopupWindow.this.clearListSelection();
    }
  }
  
  private final class d
    extends DataSetObserver
  {
    private d() {}
    
    public final void onChanged()
    {
      if (ListPopupWindow.this.PK.isShowing()) {
        ListPopupWindow.this.show();
      }
    }
    
    public final void onInvalidated()
    {
      ListPopupWindow.this.dismiss();
    }
  }
  
  private final class e
    implements AbsListView.OnScrollListener
  {
    private e() {}
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!ListPopupWindow.this.isInputMethodNotNeeded()) && (ListPopupWindow.b(ListPopupWindow.this).getContentView() != null))
      {
        ListPopupWindow.d(ListPopupWindow.this).removeCallbacks(ListPopupWindow.c(ListPopupWindow.this));
        ListPopupWindow.c(ListPopupWindow.this).run();
      }
    }
  }
  
  private final class f
    implements View.OnTouchListener
  {
    private f() {}
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (ListPopupWindow.b(ListPopupWindow.this) != null) && (ListPopupWindow.b(ListPopupWindow.this).isShowing()) && (j >= 0) && (j < ListPopupWindow.b(ListPopupWindow.this).getWidth()) && (k >= 0) && (k < ListPopupWindow.b(ListPopupWindow.this).getHeight())) {
        ListPopupWindow.d(ListPopupWindow.this).postDelayed(ListPopupWindow.c(ListPopupWindow.this), 250L);
      }
      for (;;)
      {
        return false;
        if (i == 1) {
          ListPopupWindow.d(ListPopupWindow.this).removeCallbacks(ListPopupWindow.c(ListPopupWindow.this));
        }
      }
    }
  }
  
  private final class g
    implements Runnable
  {
    private g() {}
    
    public final void run()
    {
      if ((ListPopupWindow.a(ListPopupWindow.this) != null) && (z.ak(ListPopupWindow.a(ListPopupWindow.this))) && (ListPopupWindow.a(ListPopupWindow.this).getCount() > ListPopupWindow.a(ListPopupWindow.this).getChildCount()) && (ListPopupWindow.a(ListPopupWindow.this).getChildCount() <= ListPopupWindow.this.PT))
      {
        ListPopupWindow.b(ListPopupWindow.this).setInputMethodMode(2);
        ListPopupWindow.this.show();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ListPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */