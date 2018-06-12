package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;

public class ContactRemarkInfoViewUI
  extends MMActivity
{
  private String bgo;
  private String csT;
  private int eLK;
  private String edD;
  private ab guS;
  private TextView uiI;
  private TextView uiJ;
  private ImageView uiM;
  private boolean uiS = false;
  private View ujk;
  private View ujl;
  private String username;
  
  private void Wj()
  {
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(this.username);
    this.bgo = this.guS.BL();
    this.csT = this.guS.csT;
    this.edD = this.guS.csU;
  }
  
  private void cyf()
  {
    com.tencent.mm.at.c.Qt();
    Bitmap localBitmap = com.tencent.mm.at.c.mB(this.username);
    if (localBitmap != null)
    {
      this.uiM.setImageBitmap(localBitmap);
      this.uiS = true;
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.contact_remark_info_view;
  }
  
  protected final void initView()
  {
    this.uiI = ((TextView)findViewById(R.h.contact_info_remark_name_tv));
    this.uiJ = ((TextView)findViewById(R.h.contact_info_remark_desc_tv));
    this.uiM = ((ImageView)findViewById(R.h.remark_pic_display));
    this.ujk = findViewById(R.h.contact_remark_desc_container);
    this.ujl = findViewById(R.h.contact_remark_image_container);
    setMMTitle(R.l.contact_info_mod_remarkinfo);
    this.uiM.setOnClickListener(new ContactRemarkInfoViewUI.1(this));
    addTextOptionMenu(0, getString(R.l.app_edit), new ContactRemarkInfoViewUI.2(this));
    setBackBtn(new ContactRemarkInfoViewUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eLK = getIntent().getIntExtra("Contact_Scene", 9);
    this.username = getIntent().getStringExtra("Contact_User");
    if (com.tencent.mm.platformtools.ai.oW(this.username))
    {
      finish();
      return;
    }
    Wj();
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    Wj();
    this.uiI.setText(j.a(this, com.tencent.mm.platformtools.ai.oV(this.bgo), this.uiI.getTextSize()));
    if (!com.tencent.mm.platformtools.ai.oW(this.csT))
    {
      this.ujk.setVisibility(0);
      this.uiJ.setText(com.tencent.mm.platformtools.ai.oV(this.csT));
    }
    while (!com.tencent.mm.platformtools.ai.oW(this.edD))
    {
      this.ujl.setVisibility(0);
      com.tencent.mm.at.c.Qt();
      if (!com.tencent.mm.at.c.mz(this.username))
      {
        com.tencent.mm.at.c.Qt().a(this.username, this.edD, new ContactRemarkInfoViewUI.4(this));
        return;
        this.ujk.setVisibility(8);
      }
      else
      {
        cyf();
        return;
      }
    }
    this.ujl.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/contact/ContactRemarkInfoViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */