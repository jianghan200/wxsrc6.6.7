package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.z;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public final class c
  extends j
  implements DialogInterface
{
  private b Eb = new b(getContext(), this, getWindow());
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, h(paramContext, paramInt));
  }
  
  static int h(Context paramContext, int paramInt)
  {
    if (paramInt >= 16777216) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(a.a.alertDialogTheme, localTypedValue, true);
    return localTypedValue.resourceId;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b localb = this.Eb;
    int i;
    Object localObject4;
    Object localObject3;
    Object localObject2;
    Object localObject1;
    label108:
    label114:
    label225:
    label360:
    label411:
    label460:
    label509:
    label515:
    label574:
    label591:
    int k;
    label607:
    int j;
    if ((localb.Dr != 0) && (localb.Dw == 1))
    {
      i = localb.Dr;
      localb.CR.setContentView(i);
      paramBundle = localb.CS.findViewById(a.f.parentPanel);
      localObject4 = paramBundle.findViewById(a.f.topPanel);
      localObject3 = paramBundle.findViewById(a.f.contentPanel);
      localObject2 = paramBundle.findViewById(a.f.buttonPanel);
      localObject1 = (ViewGroup)paramBundle.findViewById(a.f.customPanel);
      if (localb.mView == null) {
        break label833;
      }
      paramBundle = localb.mView;
      if (paramBundle == null) {
        break label869;
      }
      i = 1;
      if ((i == 0) || (!b.aH(paramBundle))) {
        localb.CS.setFlags(131072, 131072);
      }
      if (i == 0) {
        break label874;
      }
      Object localObject5 = (FrameLayout)localb.CS.findViewById(a.f.custom);
      ((FrameLayout)localObject5).addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (localb.Da) {
        ((FrameLayout)localObject5).setPadding(localb.CW, localb.CX, localb.CY, localb.CZ);
      }
      if (localb.CU != null) {
        ((LinearLayout.LayoutParams)((ViewGroup)localObject1).getLayoutParams()).weight = 0.0F;
      }
      paramBundle = ((ViewGroup)localObject1).findViewById(a.f.topPanel);
      View localView = ((ViewGroup)localObject1).findViewById(a.f.contentPanel);
      localObject5 = ((ViewGroup)localObject1).findViewById(a.f.buttonPanel);
      paramBundle = b.b(paramBundle, (View)localObject4);
      localObject3 = b.b(localView, (View)localObject3);
      localObject2 = b.b((View)localObject5, (View)localObject2);
      localb.Dk = ((NestedScrollView)localb.CS.findViewById(a.f.scrollView));
      localb.Dk.setFocusable(false);
      localb.Dk.setNestedScrollingEnabled(false);
      localb.gH = ((TextView)((ViewGroup)localObject3).findViewById(16908299));
      if (localb.gH != null)
      {
        if (localb.CT == null) {
          break label884;
        }
        localb.gH.setText(localb.CT);
      }
      i = 0;
      localb.Db = ((Button)((ViewGroup)localObject2).findViewById(16908313));
      localb.Db.setOnClickListener(localb.Dx);
      if (!TextUtils.isEmpty(localb.Dc)) {
        break label978;
      }
      localb.Db.setVisibility(8);
      localb.De = ((Button)((ViewGroup)localObject2).findViewById(16908314));
      localb.De.setOnClickListener(localb.Dx);
      if (!TextUtils.isEmpty(localb.Df)) {
        break label1005;
      }
      localb.De.setVisibility(8);
      localb.Dh = ((Button)((ViewGroup)localObject2).findViewById(16908315));
      localb.Dh.setOnClickListener(localb.Dx);
      if (!TextUtils.isEmpty(localb.Di)) {
        break label1034;
      }
      localb.Dh.setVisibility(8);
      if (i == 0) {
        break label1063;
      }
      i = 1;
      if (i == 0) {
        ((ViewGroup)localObject2).setVisibility(8);
      }
      if (localb.Dn == null) {
        break label1068;
      }
      localObject4 = new ViewGroup.LayoutParams(-1, -2);
      paramBundle.addView(localb.Dn, 0, (ViewGroup.LayoutParams)localObject4);
      localb.CS.findViewById(a.f.title_template).setVisibility(8);
      if ((localObject1 == null) || (((ViewGroup)localObject1).getVisibility() == 8)) {
        break label1277;
      }
      i = 1;
      if ((paramBundle == null) || (paramBundle.getVisibility() == 8)) {
        break label1282;
      }
      k = 1;
      if ((localObject2 == null) || (((ViewGroup)localObject2).getVisibility() == 8)) {
        break label1288;
      }
      j = 1;
      label624:
      if ((j == 0) && (localObject3 != null))
      {
        paramBundle = ((ViewGroup)localObject3).findViewById(a.f.textSpacerNoButtons);
        if (paramBundle != null) {
          paramBundle.setVisibility(0);
        }
      }
      if ((k != 0) && (localb.Dk != null)) {
        localb.Dk.setClipToPadding(true);
      }
      if (i == 0)
      {
        if (localb.CU == null) {
          break label1293;
        }
        paramBundle = localb.CU;
        label691:
        if (paramBundle != null)
        {
          if (k == 0) {
            break label1302;
          }
          i = 1;
          label702:
          if (j == 0) {
            break label1307;
          }
          j = 2;
          label708:
          i |= j;
          localObject1 = localb.CS.findViewById(a.f.scrollIndicatorUp);
          localObject2 = localb.CS.findViewById(a.f.scrollIndicatorDown);
          if (Build.VERSION.SDK_INT < 23) {
            break label1312;
          }
          z.l(paramBundle, i);
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
          if (localObject2 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject2);
          }
        }
      }
    }
    for (;;)
    {
      paramBundle = localb.CU;
      if ((paramBundle != null) && (localb.Do != null))
      {
        paramBundle.setAdapter(localb.Do);
        i = localb.Dp;
        if (i >= 0)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
      return;
      i = localb.Dq;
      break;
      label833:
      if (localb.CV != 0)
      {
        paramBundle = LayoutInflater.from(localb.mContext).inflate(localb.CV, (ViewGroup)localObject1, false);
        break label108;
      }
      paramBundle = null;
      break label108;
      label869:
      i = 0;
      break label114;
      label874:
      ((ViewGroup)localObject1).setVisibility(8);
      break label225;
      label884:
      localb.gH.setVisibility(8);
      localb.Dk.removeView(localb.gH);
      if (localb.CU != null)
      {
        localObject4 = (ViewGroup)localb.Dk.getParent();
        i = ((ViewGroup)localObject4).indexOfChild(localb.Dk);
        ((ViewGroup)localObject4).removeViewAt(i);
        ((ViewGroup)localObject4).addView(localb.CU, i, new ViewGroup.LayoutParams(-1, -1));
        break label360;
      }
      ((ViewGroup)localObject3).setVisibility(8);
      break label360;
      label978:
      localb.Db.setText(localb.Dc);
      localb.Db.setVisibility(0);
      i = 1;
      break label411;
      label1005:
      localb.De.setText(localb.Df);
      localb.De.setVisibility(0);
      i |= 0x2;
      break label460;
      label1034:
      localb.Dh.setText(localb.Di);
      localb.Dh.setVisibility(0);
      i |= 0x4;
      break label509;
      label1063:
      i = 0;
      break label515;
      label1068:
      localb.ii = ((ImageView)localb.CS.findViewById(16908294));
      if (!TextUtils.isEmpty(localb.sn)) {
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          localb.Dm = ((TextView)localb.CS.findViewById(a.f.alertTitle));
          localb.Dm.setText(localb.sn);
          if (localb.Dl != 0)
          {
            localb.ii.setImageResource(localb.Dl);
            break;
            i = 0;
            continue;
          }
          if (localb.hh != null)
          {
            localb.ii.setImageDrawable(localb.hh);
            break;
          }
          localb.Dm.setPadding(localb.ii.getPaddingLeft(), localb.ii.getPaddingTop(), localb.ii.getPaddingRight(), localb.ii.getPaddingBottom());
          localb.ii.setVisibility(8);
          break;
        }
      }
      localb.CS.findViewById(a.f.title_template).setVisibility(8);
      localb.ii.setVisibility(8);
      paramBundle.setVisibility(8);
      break label574;
      label1277:
      i = 0;
      break label591;
      label1282:
      k = 0;
      break label607;
      label1288:
      j = 0;
      break label624;
      label1293:
      paramBundle = localb.Dk;
      break label691;
      label1302:
      i = 0;
      break label702;
      label1307:
      j = 0;
      break label708;
      label1312:
      paramBundle = (Bundle)localObject1;
      if (localObject1 != null)
      {
        paramBundle = (Bundle)localObject1;
        if ((i & 0x1) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject1);
          paramBundle = null;
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if ((i & 0x2) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject2);
          localObject1 = null;
        }
      }
      if ((paramBundle != null) || (localObject1 != null)) {
        if (localb.CT != null)
        {
          localb.Dk.setOnScrollChangeListener(new b.2(localb, paramBundle, (View)localObject1));
          localb.Dk.post(new b.3(localb, paramBundle, (View)localObject1));
        }
        else if (localb.CU != null)
        {
          localb.CU.setOnScrollListener(new b.4(localb, paramBundle, (View)localObject1));
          localb.CU.post(new b.5(localb, paramBundle, (View)localObject1));
        }
        else
        {
          if (paramBundle != null) {
            ((ViewGroup)localObject3).removeView(paramBundle);
          }
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    b localb = this.Eb;
    if ((localb.Dk != null) && (localb.Dk.executeKeyEvent(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    b localb = this.Eb;
    if ((localb.Dk != null) && (localb.Dk.executeKeyEvent(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    this.Eb.setTitle(paramCharSequence);
  }
  
  public static final class a
  {
    public final b.a Ec;
    public int np;
    
    public a(Context paramContext)
    {
      this(paramContext, c.h(paramContext, 0));
    }
    
    private a(Context paramContext, int paramInt)
    {
      this.Ec = new b.a(new ContextThemeWrapper(paramContext, c.h(paramContext, paramInt)));
      this.np = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */