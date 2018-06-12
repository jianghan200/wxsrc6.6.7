package com.tencent.mm.plugin.sns.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.n;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public class ArtistUI
  extends MMActivity
  implements e
{
  private SharedPreferences duR;
  private ListView eVT;
  private String kCA = "";
  private g nLk;
  private ArtistHeader nLl;
  private com.tencent.mm.ab.l nLm = null;
  private p tipDialog = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((!(paraml instanceof n)) || (((n)paraml).Lf() != 4)) {
      x.d("MicroMsg.ArtistUI", "another scene");
    }
    do
    {
      return;
      x.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paraml.getType() + " @" + hashCode());
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break;
      }
    } while ((paraml.getType() != 159) || (this.tipDialog == null));
    this.tipDialog.dismiss();
    return;
    switch (paraml.getType())
    {
    default: 
      return;
    }
    if (this.nLk != null) {
      this.nLk.WT();
    }
    this.nLm = null;
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_artist_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(i.j.settings_sns_bg_title);
    getString(i.j.app_tip);
    this.tipDialog = h.a(this, getString(i.j.app_loading_data), true, new ArtistUI.1(this));
    this.eVT = ((ListView)findViewById(i.f.sns_artist_list));
    a.ezo.aG(false);
    this.nLk = new g(this, this.kCA, new ArtistUI.2(this), new ArtistUI.3(this));
    this.nLl = new ArtistHeader(this);
    this.eVT.addHeaderView(this.nLl);
    this.eVT.setAdapter(this.nLk);
    this.nLk.notifyDataSetChanged();
    this.nLl.setVisibility(8);
    setBackBtn(new ArtistUI.4(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = w.d(getSharedPreferences(ad.chY(), 0));
    x.d("MicroMsg.ArtistUI", "filterLan temp " + str);
    paramBundle = str;
    if (!str.equals("zh_CN"))
    {
      paramBundle = str;
      if (!str.equals("en"))
      {
        if (!str.equals("zh_TW")) {
          break label146;
        }
        paramBundle = str;
      }
    }
    for (;;)
    {
      this.kCA = paramBundle;
      x.d("MicroMsg.ArtistUI", "lan " + this.kCA);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(159, this);
      this.duR = getSharedPreferences(ad.chY(), 0);
      initView();
      paramBundle = this.nLl;
      af.byj().a(paramBundle);
      return;
      label146:
      if (str.equals("zh_HK")) {
        paramBundle = "zh_TW";
      } else {
        paramBundle = "en";
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.tipDialog != null) {
      this.tipDialog = null;
    }
    if (this.nLl != null)
    {
      ArtistHeader localArtistHeader = this.nLl;
      af.byj().b(localArtistHeader);
    }
    af.byl().H(this);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(159, this);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ArtistUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */