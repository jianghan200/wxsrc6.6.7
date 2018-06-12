package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.sdk.platformtools.x;

public class PoiHeaderView
  extends RelativeLayout
{
  private Context context;
  public TextView hND;
  public String kFg = "";
  public String kFh = "";
  public SimpleImageView kFi;
  
  public PoiHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    paramContext = View.inflate(this.context, a.f.poi_header_view, this);
    this.hND = ((TextView)paramContext.findViewById(a.e.header_text));
    this.kFi = ((SimpleImageView)paramContext.findViewById(a.e.header_logo));
    this.hND.setVisibility(8);
    this.kFi.setVisibility(8);
    setVisibility(8);
    setOnClickListener(new PoiHeaderView.1(this));
  }
  
  public void setViewUrl(String paramString)
  {
    x.d("MicroMsg.PoiHeaderView", "viewUrl " + paramString);
    this.kFh = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/location/ui/PoiHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */