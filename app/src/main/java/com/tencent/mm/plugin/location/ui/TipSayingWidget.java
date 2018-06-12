package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bi;

public class TipSayingWidget
  extends LinearLayout
{
  private String cXR;
  private Context context;
  private TextView hND;
  private ImageView kGL;
  private Chronometer kGM;
  private int kGN = 0;
  
  public TipSayingWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    paramContext = View.inflate(this.context, a.f.tips_saying, this);
    this.kGL = ((ImageView)paramContext.findViewById(a.e.saying_iv));
    this.hND = ((TextView)paramContext.findViewById(a.e.sayint_tips));
    this.kGM = ((Chronometer)findViewById(a.e.chronometer));
  }
  
  public void setCurSaying(String paramString)
  {
    if (bi.oW(paramString))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    a.b.p(this.kGL, paramString);
    if (bi.oW(this.cXR)) {
      this.cXR = q.GF();
    }
    if (this.cXR.equals(paramString))
    {
      this.hND.setText(this.context.getString(a.h.track_somebody_saying, new Object[] { paramString }));
      this.kGM.setVisibility(0);
      return;
    }
    this.hND.setText(this.context.getString(a.h.track_somebody_saying, new Object[] { paramString }));
    this.kGM.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/location/ui/TipSayingWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */