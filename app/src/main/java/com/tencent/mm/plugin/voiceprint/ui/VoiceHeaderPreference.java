package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class VoiceHeaderPreference
  extends Preference
{
  private MMActivity bGc;
  private String cZH = "";
  private TextView eBO;
  private TextView eYC;
  private ImageView gxd;
  private int iRP = 255;
  private Button iRQ;
  private View iRR;
  private View.OnClickListener iRS = null;
  private String iRT = "";
  private String iRU = "";
  
  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public VoiceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    setLayoutResource(R.i.voice_print_pref_header);
  }
  
  public final void a(View.OnClickListener paramOnClickListener)
  {
    this.iRS = paramOnClickListener;
    if ((this.iRQ == null) || (this.iRR == null)) {
      return;
    }
    if ((this.iRQ != null) && (this.iRS != null))
    {
      this.iRQ.setOnClickListener(paramOnClickListener);
      this.iRQ.setVisibility(0);
      this.iRR.setVisibility(0);
      return;
    }
    this.iRQ.setVisibility(8);
    this.iRR.setVisibility(8);
  }
  
  public final void cH(String paramString1, String paramString2)
  {
    this.iRT = paramString1;
    this.iRU = paramString2;
    if (this.eBO != null)
    {
      if (bi.oW(this.iRT)) {
        break label83;
      }
      this.eBO.setText(this.iRT);
      this.eBO.setVisibility(0);
    }
    for (;;)
    {
      if (this.eYC != null)
      {
        if (bi.oW(this.iRU)) {
          break;
        }
        this.eYC.setText(this.iRU);
        this.eYC.setVisibility(0);
      }
      return;
      label83:
      this.eBO.setVisibility(8);
    }
    this.eYC.setVisibility(8);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.gxd = ((ImageView)paramView.findViewById(R.h.voice_print_sucesss_icon));
    this.eBO = ((TextView)paramView.findViewById(R.h.voice_print_title));
    this.eYC = ((TextView)paramView.findViewById(R.h.voice_print_title_tip));
    this.iRQ = ((Button)paramView.findViewById(R.h.right_btn));
    this.iRR = paramView.findViewById(R.h.button_ll);
    if (!bi.oW(this.iRT))
    {
      this.eBO.setText(this.iRT);
      this.eBO.setVisibility(0);
      if (bi.oW(this.iRU)) {
        break label184;
      }
      this.eYC.setText(this.iRU);
      this.eYC.setVisibility(0);
    }
    for (;;)
    {
      if ((this.iRQ == null) || (this.iRS == null)) {
        break label196;
      }
      this.iRQ.setOnClickListener(this.iRS);
      this.iRQ.setVisibility(0);
      this.iRR.setVisibility(0);
      return;
      this.eBO.setVisibility(8);
      break;
      label184:
      this.eYC.setVisibility(8);
    }
    label196:
    this.iRQ.setVisibility(8);
    this.iRR.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */