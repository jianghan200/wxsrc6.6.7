package com.tencent.mm.plugin.address.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.Iterator;
import java.util.List;

public class WalletMultiRcptSelectUI
  extends MMPreference
{
  private int bUw = 0;
  private f eOE;
  private RcptItem eZR = null;
  private RcptItem eZS = null;
  private List<RcptItem> eZT;
  
  private void ZL()
  {
    switch (this.bUw)
    {
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_stage", this.bUw);
      localIntent.putExtra("key_province", this.eZR);
      localIntent.putExtra("key_city", this.eZS);
      setResult(0, localIntent);
      finish();
      return;
      this.eZS = null;
      this.bUw = 1;
      continue;
      this.eZR = null;
      this.bUw = 0;
    }
  }
  
  private void r(Intent paramIntent)
  {
    Object localObject2 = null;
    if (paramIntent == null) {
      x.e("MicroMsg.MultiRptSelectUI", "initData intent is null");
    }
    Object localObject1;
    label124:
    do
    {
      return;
      this.bUw = paramIntent.getIntExtra("key_stage", 0);
      this.eZR = ((RcptItem)paramIntent.getParcelableExtra("key_province"));
      this.eZS = ((RcptItem)paramIntent.getParcelableExtra("key_city"));
      localObject3 = paramIntent.getStringExtra("extra_province");
      if (localObject3 != null)
      {
        a.Zv();
        localObject1 = a.Zx();
        if (bi.oW((String)localObject3)) {
          break;
        }
        Iterator localIterator = ((l)localObject1).eXP.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject1 = (RcptItem)localIterator.next();
        } while (!((RcptItem)localObject1).name.startsWith((String)localObject3));
        this.eZR = ((RcptItem)localObject1);
        if (this.eZR != null) {
          this.bUw = 1;
        }
      }
      localObject1 = paramIntent.getStringExtra("extra_city");
    } while ((localObject1 == null) || (1 != this.bUw));
    a.Zv();
    Object localObject3 = a.Zx().pW(this.eZR.code);
    paramIntent = (Intent)localObject2;
    if (localObject3 != null)
    {
      if (((List)localObject3).size() != 0) {
        break label221;
      }
      paramIntent = (Intent)localObject2;
    }
    for (;;)
    {
      this.eZS = paramIntent;
      if (this.eZS == null) {
        break;
      }
      this.bUw = 2;
      return;
      localObject1 = null;
      break label124;
      label221:
      localObject3 = ((List)localObject3).iterator();
      do
      {
        paramIntent = (Intent)localObject2;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        paramIntent = (RcptItem)((Iterator)localObject3).next();
      } while (!paramIntent.name.startsWith((String)localObject1));
    }
  }
  
  public final int Ys()
  {
    return R.o.rptselect;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ((paramPreference instanceof RcptPreference))
    {
      paramf = ((RcptPreference)paramPreference).eZI;
      if ((paramf == null) || (bi.oW(paramf.name))) {
        x.e("MicroMsg.MultiRptSelectUI", "onPreferenceTreeClick error item, item is null or item.name isNullOrNil");
      }
    }
    else
    {
      return false;
    }
    if (!paramf.eXN) {
      this.bUw = 2;
    }
    switch (this.bUw)
    {
    default: 
      paramf = getIntent();
      if (paramf == null) {
        break;
      }
    }
    for (int i = paramf.getIntExtra("ui_title", -1);; i = -1)
    {
      paramf = new Intent(this, WalletMultiRcptSelectUI.class);
      paramf.putExtra("key_stage", this.bUw);
      paramf.putExtra("key_province", this.eZR);
      paramf.putExtra("key_city", this.eZS);
      if (-1 != i) {
        paramf.putExtra("ui_title", i);
      }
      startActivityForResult(paramf, 1);
      return false;
      this.eZR = paramf;
      this.bUw = 1;
      break;
      this.eZS = paramf;
      this.bUw = 2;
      break;
      paramPreference = new StringBuilder();
      if (this.eZR != null) {
        paramPreference.append(this.eZR.name).append(" ");
      }
      if (this.eZS != null) {
        paramPreference.append(this.eZS.name).append(" ");
      }
      paramPreference.append(paramf.name);
      x.d("MicroMsg.MultiRptSelectUI", "area_result: " + paramPreference.toString() + ",item.name: " + paramf.name);
      Intent localIntent = new Intent();
      localIntent.putExtra("karea_result", paramPreference.toString());
      localIntent.putExtra("kpost_code", paramf.eXM);
      localIntent.putExtra("kwcode", paramf.code);
      setResult(-1, localIntent);
      finish();
      return false;
    }
  }
  
  protected final void initView()
  {
    Object localObject = getIntent();
    int i = R.l.address_select_title;
    if (localObject != null) {
      i = ((Intent)localObject).getIntExtra("ui_title", R.l.address_select_title);
    }
    setMMTitle(i);
    setBackBtn(new WalletMultiRcptSelectUI.1(this));
    r((Intent)localObject);
    localObject = a.Zx().eXP;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      x.e("MicroMsg.MultiRptSelectUI", "list == null || list.isEmpty(), need loadata!");
      a.Zx().Zy();
    }
    switch (this.bUw)
    {
    default: 
      a.Zv();
      localObject = a.Zx().eXP;
    }
    for (;;)
    {
      this.eZT = ((List)localObject);
      if ((this.eZT != null) && (this.eZT.size() > 0)) {
        break label247;
      }
      x.e("MicroMsg.MultiRptSelectUI", "initZoneItems error ,check zone lists!");
      return;
      a.Zv();
      localObject = a.Zx().eXP;
      continue;
      if ((this.eZR != null) && (!bi.oW(this.eZR.code)))
      {
        a.Zv();
        localObject = a.Zx().pW(this.eZR.code);
      }
      else
      {
        if ((this.eZS == null) || (bi.oW(this.eZS.code))) {
          break;
        }
        a.Zv();
        localObject = a.Zx().pX(this.eZS.code);
      }
    }
    label247:
    this.eOE.removeAll();
    i = 0;
    if (i < this.eZT.size())
    {
      RcptItem localRcptItem;
      if ((this.eZT.get(i) != null) && (!bi.oW(((RcptItem)this.eZT.get(i)).name)))
      {
        localObject = new RcptPreference(this);
        localRcptItem = (RcptItem)this.eZT.get(i);
        if ((localRcptItem != null) && (!bi.oW(localRcptItem.name))) {
          break label369;
        }
        x.e("MicroMsg.RcptPreference", "setZoneItem item = null");
      }
      for (;;)
      {
        this.eOE.a((Preference)localObject);
        i += 1;
        break;
        label369:
        ((RcptPreference)localObject).setKey(localRcptItem.code + localObject.hashCode());
        ((RcptPreference)localObject).eZI = localRcptItem;
      }
    }
    localObject = new PreferenceSmallCategory(this);
    this.eOE.a((Preference)localObject);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      return;
    }
    if (paramInt2 == -1)
    {
      setResult(-1, paramIntent);
      finish();
      return;
    }
    r(paramIntent);
  }
  
  public void onBackPressed()
  {
    ZL();
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/address/ui/WalletMultiRcptSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */