package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;
import com.tencent.mm.R.h;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class SpecialCheckBoxPreference
  extends Preference
{
  private boolean bSD;
  private String fsV;
  private boolean hEj = false;
  private boolean hLj;
  private ab ipd;
  private Context mContext;
  private ToggleButton qPA;
  private ToggleButton qPB;
  private ToggleButton qPC;
  private CompoundButton.OnCheckedChangeListener qPD = new SpecialCheckBoxPreference.1(this);
  
  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public SpecialCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }
  
  private boolean cfh()
  {
    boolean bool2 = false;
    boolean bool1;
    if (this.bSD) {
      if (this.ipd.csI == 0)
      {
        bool1 = true;
        this.hEj = bool1;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if ((this.mContext instanceof MMActivity))
      {
        if (!this.hEj) {
          break label86;
        }
        ((MMActivity)this.mContext).setTitleMuteIconVisibility(0);
        bool1 = true;
      }
      return bool1;
      bool1 = false;
      break;
      if (!this.hLj) {
        this.hEj = this.ipd.BD();
      }
    }
    label86:
    ((MMActivity)this.mContext).setTitleMuteIconVisibility(8);
    return false;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.qPA = ((ToggleButton)paramView.findViewById(R.h.room_placed_to_the_top));
    this.qPB = ((ToggleButton)paramView.findViewById(R.h.room_notify_new_msg));
    this.qPC = ((ToggleButton)paramView.findViewById(R.h.room_save_to_contact));
    this.fsV = ((MMActivity)this.mContext).getIntent().getStringExtra("RoomInfo_Id");
    this.bSD = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Chatroom", true);
    this.hLj = ((MMActivity)this.mContext).getIntent().getBooleanExtra("Is_Lbsroom", false);
    au.HU();
    this.ipd = c.FR().Yg(this.fsV);
    if (this.ipd != null)
    {
      paramView = this.qPA;
      au.HU();
      paramView.setChecked(c.FW().Yx(this.ipd.field_username));
      this.qPC.setChecked(a.gd(this.ipd.field_type));
      this.qPB.setChecked(cfh());
    }
    this.qPA.setOnCheckedChangeListener(this.qPD);
    this.qPB.setOnCheckedChangeListener(this.qPD);
    this.qPC.setOnCheckedChangeListener(this.qPD);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/SpecialCheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */