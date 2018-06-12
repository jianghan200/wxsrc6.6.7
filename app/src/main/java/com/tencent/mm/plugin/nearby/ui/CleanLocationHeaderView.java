package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;

public class CleanLocationHeaderView
  extends LinearLayout
{
  private ImageView gxd;
  private TextView lBv;
  
  public CleanLocationHeaderView(Context paramContext)
  {
    super(paramContext);
    co(paramContext);
  }
  
  public CleanLocationHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    co(paramContext);
  }
  
  private void co(Context paramContext)
  {
    paramContext = View.inflate(paramContext, R.i.nearby_bindmobile_header_view, this);
    this.lBv = ((TextView)paramContext.findViewById(R.h.nearby_header_text));
    this.lBv.setSingleLine(false);
    this.gxd = ((ImageView)paramContext.findViewById(R.h.nearby_bind_icon));
    this.lBv.setText(R.l.clean_loaction_header_title);
    this.gxd.setImageResource(R.k.peoplenearby_icon);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nearby/ui/CleanLocationHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */