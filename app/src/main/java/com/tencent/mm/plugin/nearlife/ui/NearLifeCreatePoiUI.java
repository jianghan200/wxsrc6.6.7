package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.tools.a.c;

public class NearLifeCreatePoiUI
  extends MMActivity
  implements e
{
  private TextWatcher UE = new NearLifeCreatePoiUI.7(this);
  private p fUo;
  private String fuu;
  private aqr lEa;
  private String lEb;
  private String lEc;
  private Addr lEd;
  private String lEe;
  private EditText lEf;
  private EditText lEg;
  private TextView lEh;
  private TextView lEi;
  private com.tencent.mm.modelgeo.b lEj;
  private com.tencent.mm.plugin.nearlife.b.b lEk;
  private View.OnClickListener lEl = new NearLifeCreatePoiUI.1(this);
  private View.OnClickListener lEm = new NearLifeCreatePoiUI.2(this);
  private View.OnClickListener lEn = new NearLifeCreatePoiUI.3(this);
  private MenuItem.OnMenuItemClickListener lEo = new NearLifeCreatePoiUI.4(this);
  private b.a lEp = new NearLifeCreatePoiUI.5(this);
  private MenuItem.OnMenuItemClickListener lEq = new NearLifeCreatePoiUI.6(this);
  
  private void bjf()
  {
    h.a(this, R.l.nl_abandon_create_poi, R.l.nl_create_poi_title, new NearLifeCreatePoiUI.8(this), null);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.NearLifeCreatePoiUI", "errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.fUo.dismiss();
      paramString = (com.tencent.mm.plugin.nearlife.b.b)paraml;
      paraml = new Intent();
      if (this.lEa != null)
      {
        paraml.putExtra("get_lat", this.lEa.rms);
        paraml.putExtra("get_lng", this.lEa.rmr);
      }
      if (this.lEd != null) {
        paraml.putExtra("get_city", this.lEd.dRJ);
      }
      paraml.putExtra("get_poi_address", this.lEc);
      paraml.putExtra("get_poi_classify_id", paramString.lCR);
      paraml.putExtra("get_poi_name", this.lEb);
      paraml.putExtra("get_poi_classify_type", 1);
      setResult(-1, paraml);
      finish();
      return;
    }
    this.fUo.dismiss();
    Toast.makeText(this.mController.tml, getString(R.l.nl_create_failed), 1).show();
    this.lEk = null;
  }
  
  protected final int getLayoutId()
  {
    return R.i.near_life_create_poi;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.nl_create_poi_title);
    ((ViewGroup)findViewById(R.h.ll_pos_district_ctn)).setOnClickListener(this.lEl);
    ((ViewGroup)findViewById(R.h.ll_pos_category_ctn)).setOnClickListener(this.lEm);
    ((TextView)findViewById(R.h.tv_more_content)).setOnClickListener(this.lEn);
    findViewById(R.h.tv_more_content).setVisibility(8);
    findViewById(R.h.ll_pos_category_ctn).setVisibility(0);
    findViewById(R.h.ll_pos_tel_container).setVisibility(0);
    this.lEf = ((EditText)findViewById(R.h.et_position_name));
    this.lEg = ((EditText)findViewById(R.h.et_detailed_address));
    this.lEh = ((TextView)findViewById(R.h.tv_position_district));
    this.lEi = ((TextView)findViewById(R.h.tv_position_category));
    this.lEf.addTextChangedListener(this.UE);
    this.lEg.addTextChangedListener(this.UE);
    this.lEh.addTextChangedListener(this.UE);
    String str = bi.aG(getIntent().getStringExtra("get_poi_name"), "");
    if (str.length() != 0)
    {
      this.lEf.setText(str);
      this.lEf.setSelection(str.length());
    }
    c.d(this.lEf).Gi(100).a(null);
    c.d(this.lEg).Gi(400).a(null);
    c.d((EditText)findViewById(R.h.et_position_tel)).Gi(100).a(null);
    a(0, getString(R.l.app_finish), this.lEo, s.b.tmX);
    enableOptionMenu(0, false);
    setBackBtn(this.lEq);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
        paramIntent = paramIntent.getStringExtra("karea_result");
      } while (bi.oW(paramIntent));
      ((TextView)findViewById(R.h.tv_position_district)).setText(paramIntent.replace(" ", ""));
      return;
    } while ((-1 != paramInt2) || (paramIntent == null));
    paramIntent = bi.oV(paramIntent.getStringExtra("poi_category"));
    this.lEi.setText(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(650, this);
    this.lEa = new aqr();
    this.lEa.rms = getIntent().getFloatExtra("get_lat", -85.0F);
    this.lEa.rmr = getIntent().getFloatExtra("get_lng", -1000.0F);
    this.lEa.ryV = getIntent().getIntExtra("get_preci", 0);
    this.lEa.ryX = "";
    this.lEa.ryY = 0;
    this.lEa.ryW = "";
    this.lEj = com.tencent.mm.modelgeo.b.Oz();
    if (this.lEj != null) {
      this.lEj.a(this.lEa.rms, this.lEa.rmr, this.lEp);
    }
    this.fuu = getIntent().getStringExtra("search_id");
    x.d("MicroMsg.NearLifeCreatePoiUI", "tofuliutest searchid: %s", new Object[] { this.fuu });
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(650, this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramKeyEvent.getKeyCode())
    {
      bjf();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */