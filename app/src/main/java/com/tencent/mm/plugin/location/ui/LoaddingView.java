package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.plugin.map.a.a;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.sdk.platformtools.bi;

public class LoaddingView
  extends LinearLayout
  implements c
{
  private TextView kEs;
  private ProgressBar kEt;
  private Animation kEu;
  private View kEv;
  private boolean kEw = false;
  private String kEx = "";
  
  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public LoaddingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.kEu = AnimationUtils.loadAnimation(paramContext, a.a.translate_map);
    paramContext = LayoutInflater.from(paramContext).inflate(a.f.location_view, this, true);
    this.kEt = ((ProgressBar)paramContext.findViewById(a.e.location_load_progress));
    this.kEs = ((TextView)paramContext.findViewById(a.e.location_tips));
    this.kEv = paramContext.findViewById(a.e.location_here);
    this.kEs.setText("");
    this.kEs.setVisibility(0);
    this.kEt.setVisibility(0);
  }
  
  public String getPreText()
  {
    return this.kEx;
  }
  
  public void setPreText(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    this.kEx = (paramString + "\n");
  }
  
  public void setProgressAlwaysGone(boolean paramBoolean)
  {
    this.kEw = paramBoolean;
    this.kEt.setVisibility(8);
    this.kEs.setVisibility(8);
  }
  
  public void setText(String paramString)
  {
    if ((this.kEs == null) || (this.kEt == null) || (this.kEw)) {
      return;
    }
    if (!bi.oW(paramString))
    {
      this.kEs.setText(paramString);
      this.kEt.setVisibility(8);
      this.kEs.setVisibility(0);
      return;
    }
    this.kEs.setText("");
    this.kEs.setVisibility(0);
    this.kEt.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/ui/LoaddingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */