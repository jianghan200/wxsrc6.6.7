package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.List;

public class AutoScrollTextView
  extends LinearLayout
{
  private int irJ = 0;
  private al jUl = new al(new AutoScrollTextView.1(this), true);
  private ArrayList<String> jVK = new ArrayList();
  private Animation jVR;
  private Animation jVS;
  private TextView kgA;
  private TextView kgB;
  
  public AutoScrollTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.kgA = new TextView(paramContext, paramAttributeSet);
    this.kgA.setVisibility(8);
    this.kgB = new TextView(paramContext, paramAttributeSet);
    this.kgB.setVisibility(8);
    addView(this.kgA);
    addView(this.kgB);
    setOrientation(1);
    setGravity(17);
    setPadding(0, 0, 0, 0);
    this.jVR = AnimationUtils.loadAnimation(paramContext, f.a.slide_bottom_in);
    this.jVS = AnimationUtils.loadAnimation(paramContext, f.a.slide_top_out);
  }
  
  private void b(TextView paramTextView, String paramString)
  {
    paramTextView.setText(new SpannableString(j.a(getContext(), paramString, paramTextView.getTextSize())));
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.jUl.SO();
  }
  
  public void setText(List<String> paramList)
  {
    this.jVK.clear();
    this.jUl.SO();
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.kgA.setVisibility(8);
      this.kgB.setVisibility(8);
    }
    do
    {
      return;
      this.jVK.addAll(paramList);
      b(this.kgA, (String)this.jVK.get(0));
      this.kgA.setVisibility(0);
      this.irJ = 0;
    } while (this.jVK.size() == 1);
    this.jUl.J(5000L, 5000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/AutoScrollTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */