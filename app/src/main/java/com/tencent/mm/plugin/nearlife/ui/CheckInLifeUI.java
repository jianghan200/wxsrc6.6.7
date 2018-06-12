package com.tencent.mm.plugin.nearlife.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public class CheckInLifeUI
  extends BaseLifeUI
  implements e
{
  private String csL = "";
  private View.OnClickListener jXR = new CheckInLifeUI.1(this);
  private String lDL = "";
  private b lDR;
  private b lDS;
  private ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> lDT;
  private com.tencent.mm.modelgeo.b lDU = null;
  private aqq lDV;
  private View.OnClickListener lDW = new CheckInLifeUI.2(this);
  private b.a lDX = new b.a()
  {
    public final void b(Addr paramAnonymousAddr)
    {
      x.i("MicroMsg.CheckInLifeUI", "get info %s", new Object[] { paramAnonymousAddr.toString() });
      if (!bi.oW(CheckInLifeUI.a(CheckInLifeUI.this))) {
        return;
      }
      CheckInLifeUI.a(CheckInLifeUI.this, paramAnonymousAddr.dRJ);
      CheckInLifeUI.b(CheckInLifeUI.this).dW(CheckInLifeUI.a(CheckInLifeUI.this), paramAnonymousAddr.dRR);
    }
  };
  
  private static ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> H(ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String[] arrayOfString = ((String)paramArrayList.next()).split("\n");
      if (2 == arrayOfString.length) {
        try
        {
          localArrayList.add(new BackwardSupportUtil.ExifHelper.LatLongData(Float.valueOf(arrayOfString[0]).floatValue(), Float.valueOf(arrayOfString[1]).floatValue()));
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
    }
    x.i("MicroMsg.CheckInLifeUI", "parse list end, size: " + localArrayList.size());
    return localArrayList;
  }
  
  public final a bjb()
  {
    if (this.lDT == null) {
      this.lDT = H(getIntent().getStringArrayListExtra("lat_long_list"));
    }
    if (this.lDR == null)
    {
      this.lDR = new b(this, this.jXR, "viewlist", false);
      if ((this.lDT != null) && (this.lDT.size() != 0))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(this.lDT.get(this.lDT.size() - 1));
        this.lDR.G(localArrayList);
        this.lDR.lDf = false;
      }
      return this.lDR;
    }
    return this.lDR;
  }
  
  public final a bjc()
  {
    if (this.lDT == null) {
      this.lDT = H(getIntent().getStringArrayListExtra("lat_long_list"));
    }
    if (this.lDS == null)
    {
      this.lDS = new b(this, this.lDW, "searchlist", true);
      this.lDS.G(this.lDT);
      this.lDS.lDf = true;
      return this.lDS;
    }
    return this.lDS;
  }
  
  public final void bjd()
  {
    super.bjd();
  }
  
  protected final int getLayoutId()
  {
    return R.i.near_life_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.near_check_list);
    this.lDU = com.tencent.mm.modelgeo.b.Oz();
    this.lDV = new aqq();
    this.lDL = getIntent().getStringExtra("get_poi_classify_id");
    try
    {
      this.lDV = ((aqq)this.lDV.aG(getIntent().getByteArrayExtra("get_poi_item_buf")));
      if (this.lDV != null) {
        this.lDL = this.lDV.lCG;
      }
      if (bi.oW(this.lDL)) {
        this.csL = getIntent().getStringExtra("get_city");
      }
      if (!bi.oW(this.csL)) {
        this.lDL = this.lDR.dW(this.csL, "").lCG;
      }
      this.lDR.lDL = this.lDL;
      if ((this.lDV != null) && (!bi.oW(this.lDV.lCG)))
      {
        paramBundle = this.lDR;
        locala = new com.tencent.mm.plugin.nearlife.b.a("", this.lDV);
        if (paramBundle.lDJ == null) {
          paramBundle.a(locala, 1);
        }
      }
      else
      {
        return;
      }
    }
    catch (Exception paramBundle)
    {
      com.tencent.mm.plugin.nearlife.b.a locala;
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.CheckInLifeUI", paramBundle, "", new Object[0]);
        this.lDV = null;
      }
      paramBundle.a(locala, 2);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.lDU != null) {
      this.lDU.a(this.lDX);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  public final void p(double paramDouble1, double paramDouble2)
  {
    x.i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
    if ((this.lDU != null) && (bi.oW(this.csL))) {
      this.lDU.a(paramDouble1, paramDouble2, this.lDX);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/nearlife/ui/CheckInLifeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */