package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar.a;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public final class ai
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator TH = new DecelerateInterpolator();
  private int Jq;
  Runnable TA;
  private LinearLayoutCompat TB;
  private Spinner TC;
  private boolean TD;
  int TE;
  int TF;
  private int TG;
  
  private boolean gA()
  {
    return (this.TC != null) && (this.TC.getParent() == this);
  }
  
  private boolean gB()
  {
    if (!gA()) {
      return false;
    }
    removeView(this.TC);
    addView(this.TB, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.TC.getSelectedItemPosition());
    return false;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.TA != null) {
      post(this.TA);
    }
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = a.R(getContext());
    TypedArray localTypedArray = paramConfiguration.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
    int j = localTypedArray.getLayoutDimension(a.k.ActionBar_height, 0);
    Resources localResources = paramConfiguration.mContext.getResources();
    int i = j;
    if (!paramConfiguration.dr()) {
      i = Math.min(j, localResources.getDimensionPixelSize(a.d.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    setContentHeight(i);
    this.TF = paramConfiguration.mContext.getResources().getDimensionPixelSize(a.d.abc_action_bar_stacked_tab_max_width);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.TA != null) {
      removeCallbacks(this.TA);
    }
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int i = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (i == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int j = this.TB.getChildCount();
      if ((j <= 1) || ((i != 1073741824) && (i != Integer.MIN_VALUE))) {
        break label328;
      }
      if (j <= 2) {
        break label315;
      }
      this.TE = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      label68:
      this.TE = Math.min(this.TE, this.TF);
      label83:
      i = View.MeasureSpec.makeMeasureSpec(this.Jq, 1073741824);
      if ((bool) || (!this.TD)) {
        break label336;
      }
      label105:
      if (paramInt2 == 0) {
        break label349;
      }
      this.TB.measure(0, i);
      if (this.TB.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1)) {
        break label341;
      }
      if (!gA())
      {
        if (this.TC == null)
        {
          AppCompatSpinner localAppCompatSpinner = new AppCompatSpinner(getContext(), null, a.a.actionDropDownStyle);
          localAppCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
          localAppCompatSpinner.setOnItemSelectedListener(this);
          this.TC = localAppCompatSpinner;
        }
        removeView(this.TB);
        addView(this.TC, new ViewGroup.LayoutParams(-2, -1));
        if (this.TC.getAdapter() == null) {
          this.TC.setAdapter(new a((byte)0));
        }
        if (this.TA != null)
        {
          removeCallbacks(this.TA);
          this.TA = null;
        }
        this.TC.setSelection(this.TG);
      }
    }
    for (;;)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, i);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1)) {
        setTabSelected(this.TG);
      }
      return;
      bool = false;
      break;
      label315:
      this.TE = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label328:
      this.TE = -1;
      break label83;
      label336:
      paramInt2 = 0;
      break label105;
      label341:
      gB();
      continue;
      label349:
      gB();
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public final void setAllowCollapse(boolean paramBoolean)
  {
    this.TD = paramBoolean;
  }
  
  public final void setContentHeight(int paramInt)
  {
    this.Jq = paramInt;
    requestLayout();
  }
  
  public final void setTabSelected(int paramInt)
  {
    this.TG = paramInt;
    int j = this.TB.getChildCount();
    int i = 0;
    if (i < j)
    {
      final View localView = this.TB.getChildAt(i);
      if (i == paramInt) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
        {
          localView = this.TB.getChildAt(paramInt);
          if (this.TA != null) {
            removeCallbacks(this.TA);
          }
          this.TA = new Runnable()
          {
            public final void run()
            {
              int i = localView.getLeft();
              int j = (ai.this.getWidth() - localView.getWidth()) / 2;
              ai.this.smoothScrollTo(i - j, 0);
              ai.this.TA = null;
            }
          };
          post(this.TA);
        }
        i += 1;
        break;
      }
    }
    if ((this.TC != null) && (paramInt >= 0)) {
      this.TC.setSelection(paramInt);
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a() {}
    
    public final int getCount()
    {
      return ai.b(ai.this).getChildCount();
    }
    
    public final Object getItem(int paramInt)
    {
      return ((ai.b)ai.b(ai.this).getChildAt(paramInt)).TL;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        return ai.a(ai.this, (ActionBar.a)getItem(paramInt));
      }
      paramViewGroup = (ai.b)paramView;
      paramViewGroup.TL = ((ActionBar.a)getItem(paramInt));
      paramViewGroup.update();
      return paramView;
    }
  }
  
  private final class b
    extends LinearLayoutCompat
    implements View.OnLongClickListener
  {
    private final int[] TK = { 16842964 };
    ActionBar.a TL;
    private View hZ;
    private TextView ih;
    private ImageView ii;
    
    public b(Context paramContext, ActionBar.a parama)
    {
      super(null, a.a.actionBarTabStyle);
      this.TL = parama;
      this$1 = ap.a(paramContext, null, this.TK, a.a.actionBarTabStyle);
      if (ai.this.hasValue(0)) {
        setBackgroundDrawable(ai.this.getDrawable(0));
      }
      ai.this.Ww.recycle();
      setGravity(8388627);
      update();
    }
    
    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.a.class.getName());
    }
    
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 14) {
        paramAccessibilityNodeInfo.setClassName(ActionBar.a.class.getName());
      }
    }
    
    public final boolean onLongClick(View paramView)
    {
      paramView = new int[2];
      getLocationOnScreen(paramView);
      Object localObject = getContext();
      int i = getWidth();
      int j = getHeight();
      int k = ((Context)localObject).getResources().getDisplayMetrics().widthPixels;
      localObject = Toast.makeText((Context)localObject, this.TL.getContentDescription(), 0);
      ((Toast)localObject).setGravity(49, paramView[0] + i / 2 - k / 2, j);
      ((Toast)localObject).show();
      return true;
    }
    
    public final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if ((ai.this.TE > 0) && (getMeasuredWidth() > ai.this.TE)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ai.this.TE, 1073741824), paramInt2);
      }
    }
    
    public final void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean)) {
          sendAccessibilityEvent(4);
        }
        return;
      }
    }
    
    public final void update()
    {
      Object localObject1 = this.TL;
      Object localObject2 = ((ActionBar.a)localObject1).getCustomView();
      if (localObject2 != null)
      {
        localObject1 = ((View)localObject2).getParent();
        if (localObject1 != this)
        {
          if (localObject1 != null) {
            ((ViewGroup)localObject1).removeView((View)localObject2);
          }
          addView((View)localObject2);
        }
        this.hZ = ((View)localObject2);
        if (this.ih != null) {
          this.ih.setVisibility(8);
        }
        if (this.ii != null)
        {
          this.ii.setVisibility(8);
          this.ii.setImageDrawable(null);
        }
        return;
      }
      if (this.hZ != null)
      {
        removeView(this.hZ);
        this.hZ = null;
      }
      Object localObject3 = ((ActionBar.a)localObject1).getIcon();
      localObject2 = ((ActionBar.a)localObject1).getText();
      int i;
      if (localObject3 != null)
      {
        Object localObject4;
        if (this.ii == null)
        {
          localObject4 = new ImageView(getContext());
          LinearLayoutCompat.LayoutParams localLayoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
          localLayoutParams.gravity = 16;
          ((ImageView)localObject4).setLayoutParams(localLayoutParams);
          addView((View)localObject4, 0);
          this.ii = ((ImageView)localObject4);
        }
        this.ii.setImageDrawable((Drawable)localObject3);
        this.ii.setVisibility(0);
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label365;
        }
        i = 1;
        label209:
        if (i == 0) {
          break label370;
        }
        if (this.ih == null)
        {
          localObject3 = new AppCompatTextView(getContext(), null, a.a.actionBarTabTextStyle);
          ((TextView)localObject3).setEllipsize(TextUtils.TruncateAt.END);
          localObject4 = new LinearLayoutCompat.LayoutParams(-2, -2);
          ((LinearLayoutCompat.LayoutParams)localObject4).gravity = 16;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3);
          this.ih = ((TextView)localObject3);
        }
        this.ih.setText((CharSequence)localObject2);
        this.ih.setVisibility(0);
      }
      for (;;)
      {
        if (this.ii != null) {
          this.ii.setContentDescription(((ActionBar.a)localObject1).getContentDescription());
        }
        if ((i != 0) || (TextUtils.isEmpty(((ActionBar.a)localObject1).getContentDescription()))) {
          break label397;
        }
        setOnLongClickListener(this);
        return;
        if (this.ii == null) {
          break;
        }
        this.ii.setVisibility(8);
        this.ii.setImageDrawable(null);
        break;
        label365:
        i = 0;
        break label209;
        label370:
        if (this.ih != null)
        {
          this.ih.setVisibility(8);
          this.ih.setText(null);
        }
      }
      label397:
      setOnLongClickListener(null);
      setLongClickable(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */