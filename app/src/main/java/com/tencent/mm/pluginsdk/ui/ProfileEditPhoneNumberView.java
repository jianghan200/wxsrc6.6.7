package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

public class ProfileEditPhoneNumberView
  extends ProfileItemView
  implements MMPhoneNumberEditText.a
{
  public String qGi;
  public String qGj;
  public String[] qGk;
  private LinearLayout qGl;
  private boolean qGm = false;
  public a qGn;
  
  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void bn(String paramString, boolean paramBoolean)
  {
    MMPhoneNumberEditText localMMPhoneNumberEditText = (MMPhoneNumberEditText)LayoutInflater.from(getContext()).inflate(R.i.profile_edit_phone_number_item, null);
    localMMPhoneNumberEditText.setHint(ad.getResources().getString(R.l.add_phone_number));
    if (paramBoolean)
    {
      localMMPhoneNumberEditText.qFP = true;
      localMMPhoneNumberEditText.qFN = localMMPhoneNumberEditText.getResources().getDrawable(R.k.info_icon);
      localMMPhoneNumberEditText.qFN.setBounds(0, 0, localMMPhoneNumberEditText.qFN.getIntrinsicWidth(), localMMPhoneNumberEditText.qFN.getIntrinsicHeight());
      localMMPhoneNumberEditText.setFocusable(false);
      localMMPhoneNumberEditText.cdj();
    }
    localMMPhoneNumberEditText.setCallback(this);
    localMMPhoneNumberEditText.setText(paramString);
    localMMPhoneNumberEditText.setSelection(localMMPhoneNumberEditText.getText().length());
    paramString = new LinearLayout.LayoutParams(-1, -2);
    paramString.setMargins(0, a.fromDPToPix(getContext(), 12), 0, 0);
    this.qGl.addView(localMMPhoneNumberEditText, paramString);
  }
  
  private void cdr()
  {
    if (this.qGn != null) {
      this.qGn.auM();
    }
  }
  
  private void h(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    this.qGl.removeView(paramMMPhoneNumberEditText);
    this.qGl.getChildAt(this.qGl.getChildCount() - 1).requestFocus();
  }
  
  public final boolean N(ab paramab)
  {
    this.ipd = paramab;
    return true;
  }
  
  public final boolean bnH()
  {
    int j;
    if (!bi.oW(this.qGi))
    {
      bn(this.qGi, true);
      j = 1;
    }
    for (int i = 1;; i = 0)
    {
      int k = i;
      if (!bi.oW(this.qGj))
      {
        this.qGk = this.qGj.split(",");
        for (;;)
        {
          k = i;
          if (i >= this.qGk.length + j) {
            break;
          }
          bn(this.qGk[(i - j)].trim(), false);
          i += 1;
        }
      }
      if (k < 5)
      {
        bn(null, false);
        this.qGm = false;
        return false;
      }
      this.qGm = true;
      return false;
      j = 0;
    }
  }
  
  public final void cdl()
  {
    if (this.qGl.getChildCount() - 1 < 5) {
      bn(null, false);
    }
    for (;;)
    {
      cdr();
      return;
      this.qGm = true;
    }
  }
  
  public final void cdm()
  {
    cdr();
  }
  
  public void clearFocus()
  {
    int i = 1;
    while (i < this.qGl.getChildCount())
    {
      this.qGl.getChildAt(i).clearFocus();
      i += 1;
    }
  }
  
  public final void f(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    if (paramMMPhoneNumberEditText.qFP)
    {
      h.a(getContext(), R.l.hide_md5_match_phone_number_tip, 0, R.l.hide_md5_match_phone_number_hide, R.l.hide_md5_match_phone_number_cancel, new ProfileEditPhoneNumberView.1(this, paramMMPhoneNumberEditText), null);
      return;
    }
    h(paramMMPhoneNumberEditText);
    if (this.qGm)
    {
      bn(null, false);
      this.qGm = false;
    }
    cdr();
  }
  
  public final void g(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    if (this.qGl.getChildCount() - 1 == 1) {
      return;
    }
    h(paramMMPhoneNumberEditText);
    if (this.qGm) {
      bn(null, false);
    }
    this.qGm = false;
    cdr();
  }
  
  public int getLayout()
  {
    return R.i.profile_edit_phone_number_layout;
  }
  
  public ArrayList<String> getPhoneNumberList()
  {
    int j = this.qGl.getChildCount();
    if (j == 1) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(j - 1);
    int i = 1;
    while (i < j)
    {
      String str = ((MMPhoneNumberEditText)this.qGl.getChildAt(i)).getText().toString();
      if (!bi.oW(str)) {
        localArrayList.add(str);
      }
      i += 1;
    }
    if (!bi.oW(this.qGi)) {
      localArrayList.remove(0);
    }
    return localArrayList;
  }
  
  public final void init()
  {
    this.qGl = ((LinearLayout)findViewById(R.h.main_layout));
  }
  
  public static abstract interface a
  {
    public abstract void auM();
    
    public abstract void cds();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */