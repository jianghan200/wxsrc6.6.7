package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class ExdeviceRankChampionInfoView
  extends LinearLayout
{
  private TextPaint dG;
  private int duy = 0;
  private String gtX;
  private TextView hEx;
  private ImageView izS;
  
  public ExdeviceRankChampionInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.exdevice_rank_champion_info_view, this, true);
    this.dG = new TextPaint(1);
    this.hEx = ((TextView)paramAttributeSet.findViewById(R.h.titleTV));
    this.izS = ((ImageView)paramAttributeSet.findViewById(R.h.avatarIV));
    this.izS.setOnClickListener(new ExdeviceRankChampionInfoView.1(this, paramContext));
    this.hEx.setOnClickListener(new ExdeviceRankChampionInfoView.2(this, paramContext));
    try
    {
      this.duy = paramContext.getResources().getDimensionPixelSize(R.f.ExdeviceUserNameWidth);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.ExdeviceRankChampionInfoView", paramContext, "", new Object[0]);
        if (this.duy <= 0) {
          this.duy = 128;
        }
      }
    }
    finally
    {
      if (this.duy > 0) {
        break label191;
      }
      this.duy = 128;
    }
    x.d("MicroMsg.ExdeviceRankChampionInfoView", "ap: ellipsizewidth: %d", new Object[] { Integer.valueOf(this.duy) });
  }
  
  public final void Av(String paramString)
  {
    this.gtX = paramString;
    if (this.hEx != null)
    {
      if (bi.oW(paramString)) {
        break label164;
      }
      this.hEx.setVisibility(0);
      Object localObject = getContext();
      int i = R.l.exdevice_champion_occupy_cover;
      String str = this.gtX;
      int j = this.duy;
      localObject = ((Context)localObject).getString(i, new Object[] { TextUtils.ellipsize(j.a(getContext(), r.gT(str)), this.dG, j, TextUtils.TruncateAt.END) });
      x.d("MicroMsg.ExdeviceRankChampionInfoView", "title : %s", new Object[] { j.a(getContext(), (CharSequence)localObject) });
      this.hEx.setText(j.a(getContext(), (CharSequence)localObject, this.hEx.getTextSize()));
    }
    for (;;)
    {
      if (this.izS != null)
      {
        if (bi.oW(paramString)) {
          break;
        }
        a.b.n(this.izS, paramString);
        this.izS.setVisibility(0);
      }
      return;
      label164:
      this.hEx.setVisibility(8);
      this.hEx.setText("");
    }
    this.izS.setVisibility(4);
  }
  
  public void setAlpha(float paramFloat)
  {
    this.hEx.setAlpha(paramFloat);
    this.izS.setAlpha(paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceRankChampionInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */