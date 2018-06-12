package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class SnsArtistPreference
  extends Preference
{
  private MMActivity bGc;
  private String cZH = "";
  private String mQi = "";
  private int mQj = -1;
  private int mQk = 8;
  private TextView nTm = null;
  String nTn = "";
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    setLayoutResource(i.g.mm_preference);
    setWidgetLayoutResource(i.g.mm_preference_submenu);
  }
  
  public final void bCU()
  {
    if ((this.nTm != null) && (this.nTn != null) && (!this.nTn.equals("")) && (this.bGc != null))
    {
      String str = this.bGc.getString(i.j.settings_sns_bg_from_artist, new Object[] { this.nTn });
      this.nTm.setText(str);
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.nTm = ((TextView)paramView.findViewById(i.f.artist_name));
    ((TextView)paramView.findViewById(i.f.album_title)).setText(this.cZH);
    paramView = (TextView)paramView.findViewById(i.f.text_tv_one);
    if (paramView != null)
    {
      paramView.setVisibility(this.mQk);
      paramView.setText(this.mQi);
      if (this.mQj != -1) {
        paramView.setBackgroundDrawable(a.f(this.bGc, this.mQj));
      }
    }
    bCU();
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(i.f.content);
    localViewGroup.removeAllViews();
    this.cZH = this.bGc.getString(i.j.settings_sns_bg_select_bg);
    localLayoutInflater.inflate(i.g.mm_preference_artist, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsArtistPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */