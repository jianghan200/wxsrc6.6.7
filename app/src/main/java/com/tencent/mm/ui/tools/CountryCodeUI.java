package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryCodeUI
  extends MMActivity
{
  private String countryCode;
  private String dYy;
  private String eIQ = "";
  private o eMS;
  private String eQJ;
  private boolean kuP = false;
  private ListView kvg;
  private List<b.a> list;
  private VerticalScrollBar.a uhB;
  private c uvP;
  private VerticalScrollBar uvQ;
  
  protected final int getLayoutId()
  {
    if (w.chN()) {
      return R.i.country_code_select_big5;
    }
    return R.i.country_code_select;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.address_title_select_country_code);
    this.list = b.E(this, getString(R.l.country_code));
    if (!w.chN())
    {
      Collections.sort(this.list, new CountryCodeUI.1(this));
      this.eMS = new o((byte)0);
      this.eMS.uBw = new CountryCodeUI.3(this);
      a(this.eMS);
      this.kvg = ((ListView)findViewById(R.h.address_contactlist));
      this.uvP = new c(this, this.list);
      this.uvP.kuP = this.kuP;
      this.kvg.setAdapter(this.uvP);
      this.kvg.setVisibility(0);
      this.uvQ = ((VerticalScrollBar)findViewById(R.h.address_scrollbar));
      if (w.chN()) {
        break label227;
      }
    }
    label227:
    for (this.uhB = new CountryCodeUI.4(this);; this.uhB = new CountryCodeUI.5(this))
    {
      this.uvQ.setOnScrollBarTouchListener(this.uhB);
      setBackBtn(new CountryCodeUI.6(this));
      this.kvg.setOnItemClickListener(new CountryCodeUI.7(this));
      return;
      Collections.sort(this.list, new Comparator() {});
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dYy = ai.aG(getIntent().getStringExtra("country_name"), "");
    this.countryCode = ai.aG(getIntent().getStringExtra("couttry_code"), "");
    this.eQJ = ai.aG(getIntent().getStringExtra("iso_code"), "");
    this.kuP = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
    initView();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("country_name", this.dYy);
      paramKeyEvent.putExtra("couttry_code", this.countryCode);
      paramKeyEvent.putExtra("iso_code", this.eQJ);
      setResult(100, paramKeyEvent);
      finish();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.eMS != null) {
      this.eMS.czQ();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/tools/CountryCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */