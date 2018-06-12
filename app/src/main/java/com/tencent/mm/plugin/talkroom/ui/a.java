package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.base.o;

public final class a
{
  private static final int[] erx = { R.g.amp1, R.g.amp2, R.g.amp3, R.g.amp4, R.g.amp5, R.g.amp6, R.g.amp7 };
  private static final int[] hnd = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private Context context;
  private final ag hnB = new a.1(this);
  private ImageView hnl;
  private View iZf;
  private View iZg;
  private View iZi;
  private o oxs;
  private TextView oxt;
  private ImageView oxu;
  private View oxv;
  private int oxw;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
    this.oxw = BackwardSupportUtil.b.b(paramContext, 180.0F);
    this.oxs = new o(((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.voice_rcd_hint_window, null), -1, -2);
    this.hnl = ((ImageView)this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_anim));
    this.iZi = this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_cancel_area);
    this.oxt = ((TextView)this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_cancel_text));
    this.oxu = ((ImageView)this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_cancel_icon));
    this.oxv = this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_loading);
    this.iZf = this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_rcding);
    this.iZg = this.oxs.getContentView().findViewById(R.h.voice_rcd_hint_tooshort);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/talkroom/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */