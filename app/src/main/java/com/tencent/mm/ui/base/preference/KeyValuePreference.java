package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference
  extends Preference
{
  private View contentView;
  public TextView lWL;
  public boolean tCA = true;
  private boolean tCB = false;
  private boolean tCC = false;
  public boolean tCD = false;
  private int tCE = 17;
  public int tCF = 17;
  public int tCG = 0;
  public ImageView tCH = null;
  public Drawable tCI = null;
  private List<View> tCJ = new LinkedList();
  private Drawable tCz = null;
  public String tmc = null;
  
  public KeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference);
  }
  
  public final void csk()
  {
    this.tCJ.clear();
  }
  
  public final void csl()
  {
    this.tCC = true;
    this.tCE = 49;
  }
  
  public final void dp(View paramView)
  {
    this.tCJ.add(paramView);
  }
  
  public final void lO(boolean paramBoolean)
  {
    this.tCB = paramBoolean;
    if (this.tCB) {
      setWidgetLayoutResource(a.h.mm_preference_submenu);
    }
  }
  
  public void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.contentView = paramView.findViewById(a.g.content);
    if (this.tDk != null) {
      this.contentView.setOnClickListener(new KeyValuePreference.1(this));
    }
    this.lWL = ((TextView)paramView.findViewById(16908304));
    this.lWL.setSingleLine(this.tCA);
    if (this.tCB) {
      setWidgetLayoutResource(a.h.mm_preference_submenu);
    }
    Object localObject2;
    if (this.tCD)
    {
      localObject2 = (LinearLayout)paramView.findViewById(a.g.container);
      localObject1 = (LinearLayout.LayoutParams)((LinearLayout)localObject2).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).width = -1;
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject2 = (LinearLayout)paramView.findViewById(a.g.summary_container);
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((LinearLayout)localObject2).getChildAt(0).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.lWL.setGravity(this.tCF);
    }
    Object localObject1 = (TextView)paramView.findViewById(16908310);
    if (!bi.oW(this.tmc)) {
      ((TextView)localObject1).setText(this.tmc);
    }
    if (localObject1 != null)
    {
      localObject2 = ((TextView)localObject1).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = a.ad(this.mContext, a.e.FixedTitleWidth);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    if (this.tCz != null) {
      ((ImageView)paramView.findViewById(a.g.icon_preference_imageview)).setImageDrawable(this.tCz);
    }
    this.tCH = ((ImageView)paramView.findViewById(a.g.image_iv));
    if (this.tCI != null)
    {
      this.tCH.setVisibility(this.tCG);
      this.tCH.setImageDrawable(this.tCI);
    }
    for (;;)
    {
      if (this.tCC)
      {
        localObject1 = (LinearLayout)paramView.findViewById(a.g.container);
        if (localObject1 != null) {
          ((LinearLayout)localObject1).setGravity(this.tCE);
        }
      }
      if (this.tCJ.size() <= 0) {
        break;
      }
      paramView = (LinearLayout)paramView.findViewById(a.g.summary_container);
      paramView.removeAllViews();
      localObject1 = this.tCJ.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (View)((Iterator)localObject1).next();
        ViewGroup localViewGroup = (ViewGroup)((View)localObject2).getParent();
        if (localViewGroup != null) {
          localViewGroup.removeView((View)localObject2);
        }
        paramView.addView((View)localObject2);
      }
      this.tCH.setVisibility(8);
    }
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(a.h.mm_preference_content_keyvalue, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/preference/KeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */