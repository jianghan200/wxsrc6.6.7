package com.tencent.mm.plugin.exdevice.ui;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.h.a.e.a;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import junit.framework.Assert;

public class ExdeviceBindDeviceGuideUI
  extends MMActivity
  implements e
{
  private ListView CU;
  private String cZH;
  private Button eWk;
  BroadcastReceiver hiJ = new ExdeviceBindDeviceGuideUI.4(this);
  private TextView iAA;
  private ScrollView iAB;
  private ImageView iAC;
  private TextView iAD;
  private String iAE;
  private String iAF;
  private String iAG;
  private String iAH;
  private long iAI;
  private ArrayList<String> iAJ;
  private String iAK;
  private boolean iAL = false;
  private boolean iAM = false;
  private String iAa;
  private String iAb;
  private TextView iAg;
  private LocationManager iAj;
  private boolean iAk = false;
  private a iAy;
  private Button iAz;
  private String ius;
  private String iut;
  private String izI;
  private String pM;
  
  private void pc(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        return;
        this.iAz.setText(this.mController.tml.getString(R.l.exdevice_connect_bt_next));
        this.eWk.setVisibility(8);
        this.iAA.setText(this.mController.tml.getString(R.l.exdevice_connect_bt_guide));
        continue;
        this.iAz.setText(this.mController.tml.getString(R.l.exdevice_connect_wifi));
        this.eWk.setText(this.mController.tml.getString(R.l.exdevice_already_connect_wifi));
        this.iAA.setText(this.mController.tml.getString(R.l.exdevice_connect_wifi_guide));
        continue;
        this.iAC.setImageResource(R.k.bluetooth_logo);
        this.iAg.setText(R.l.exdevice_can_not_scan);
        this.iAD.setText(R.l.exdevice_bind_device_blue_no_open_detail);
        continue;
        this.iAC.setImageResource(R.k.bluetooth_logo);
        this.iAg.setText(R.l.exdevice_ble_version_below_4_0);
        this.iAD.setText("");
        continue;
        this.iAC.setImageResource(R.k.wifi_logo);
        this.iAg.setText(R.l.exdevice_can_not_scan);
        this.iAD.setText(R.l.exdevice_bind_device_wifi_no_open_detail);
        continue;
        this.iAC.setImageResource(R.k.bluetooth_logo);
        this.iAg.setText(R.l.exdevice_can_not_scan);
        this.iAD.setText(R.l.exdevice_gps_not_open);
      }
    }
    this.iAC.setVisibility(8);
    this.iAg.setVisibility(8);
    this.iAD.setVisibility(8);
    this.CU.setVisibility(0);
    this.iAB.setVisibility(0);
    return;
    this.iAC.setVisibility(0);
    this.iAg.setVisibility(0);
    this.CU.setVisibility(8);
    this.iAB.setVisibility(8);
    if (paramInt == 4)
    {
      this.iAD.setVisibility(8);
      return;
    }
    this.iAD.setVisibility(0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml) {}
  
  protected final int getLayoutId()
  {
    return R.i.exdevice_bind_device_guide_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceBindDeviceGuideUI.1(this));
    if ((com.tencent.mm.compatible.util.d.fR(23)) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
    {
      x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth limited version(%s)", new Object[] { Build.VERSION.RELEASE });
      this.iAk = true;
    }
    paramBundle = getIntent();
    this.iAE = paramBundle.getStringExtra("device_scan_mode");
    this.iAF = paramBundle.getStringExtra("device_scan_conn_proto");
    this.iut = paramBundle.getStringExtra("device_id");
    this.izI = paramBundle.getStringExtra("device_type");
    this.iAG = paramBundle.getStringExtra("device_title");
    this.iAa = paramBundle.getStringExtra("device_desc");
    this.iAb = paramBundle.getStringExtra("device_icon_url");
    this.pM = paramBundle.getStringExtra("device_category_id");
    this.ius = paramBundle.getStringExtra("device_brand_name");
    this.iAH = paramBundle.getStringExtra("bind_ticket");
    this.iAI = paramBundle.getLongExtra("device_ble_simple_proto", -1L);
    this.iAJ = paramBundle.getStringArrayListExtra("device_airkiss_steps");
    this.iAK = paramBundle.getStringExtra("device_airkiss_key");
    this.cZH = paramBundle.getStringExtra("device_airkiss_title");
    x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Category config guide steps(%d)", new Object[] { Integer.valueOf(this.iAJ.size()) });
    this.iAj = ((LocationManager)this.mController.tml.getSystemService("location"));
    this.CU = ((ListView)findViewById(R.h.contentList));
    paramBundle = View.inflate(this, R.i.exdeivce_bind_device_guide_ui_header, null);
    this.iAA = ((TextView)paramBundle.findViewById(R.h.titleTV));
    this.iAy = new a(this.iAJ);
    this.CU.addHeaderView(paramBundle);
    this.CU.setDividerHeight(0);
    this.CU.setClickable(false);
    this.CU.setFooterDividersEnabled(false);
    this.CU.setAdapter(this.iAy);
    this.iAC = ((ImageView)findViewById(R.h.logoTV));
    this.iAB = ((ScrollView)findViewById(R.h.guideListScrollView));
    this.iAz = ((Button)findViewById(R.h.connectButton));
    this.eWk = ((Button)findViewById(R.h.nextButton));
    this.iAg = ((TextView)findViewById(R.h.errTips));
    this.iAD = ((TextView)findViewById(R.h.errTipsDetail));
    paramBundle = "";
    if (this.iAE.compareTo("SCAN_CATALOG") == 0) {
      if (this.iAF.contains("wifi"))
      {
        this.iAL = true;
        paramBundle = this.mController.tml.getString(R.l.exdevice_connect_wifi);
        setMMTitle(paramBundle);
        if ((!this.iAM) || (this.iAL)) {
          break label760;
        }
        if (a.cT(this.mController.tml)) {
          break label692;
        }
        x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        pc(4);
      }
    }
    for (;;)
    {
      this.iAz.setOnClickListener(new ExdeviceBindDeviceGuideUI.2(this));
      this.eWk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if ((ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)) && (!ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.b(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_id", ExdeviceBindDeviceGuideUI.c(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_type", ExdeviceBindDeviceGuideUI.d(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_title", ExdeviceBindDeviceGuideUI.e(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_desc", ExdeviceBindDeviceGuideUI.f(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.g(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.h(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.i(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.j(ExdeviceBindDeviceGuideUI.this));
            com.tencent.mm.bg.d.b(ExdeviceBindDeviceGuideUI.this.mController.tml, "exdevice", ".ui.ExdeviceBindDeviceUI", paramAnonymousView);
          }
        }
      });
      paramBundle = new IntentFilter();
      paramBundle.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramBundle.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      paramBundle.addAction("android.location.MODE_CHANGED");
      this.mController.tml.registerReceiver(this.hiJ, paramBundle);
      return;
      if (this.iAF.contains("blue"))
      {
        this.iAM = true;
        paramBundle = this.mController.tml.getString(R.l.exdevice_bind_device_help_prepare);
        break;
      }
      Assert.assertTrue(false);
      break;
      Assert.assertTrue(false);
      break;
      label692:
      if (!a.atY())
      {
        x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth is not open, Just leave");
        pc(3);
      }
      else if ((this.iAj != null) && (this.iAk) && (!this.iAj.isProviderEnabled("gps")))
      {
        x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "BLE limited version, GPS do not open");
        pc(6);
      }
      else
      {
        label760:
        if ((!this.iAM) && (this.iAL) && (!ao.isWifi(this.mController.tml)))
        {
          x.i("MicroMsg.ExdeviceBindDeviceGuideUI", "wifi is not open, Just leave");
          pc(5);
        }
        else if ((this.iAL) && (!this.iAM))
        {
          pc(1);
        }
        else if ((this.iAM) && (!this.iAL))
        {
          pc(2);
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.mController.tml.unregisterReceiver(this.hiJ);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private ArrayList<String> iAO;
    
    public a(ArrayList<String> paramArrayList)
    {
      this.iAO = paramArrayList;
    }
    
    private String jl(int paramInt)
    {
      if ((this.iAO != null) && (this.iAO.size() > 0)) {
        return (String)this.iAO.get(paramInt);
      }
      return null;
    }
    
    public final int getCount()
    {
      if (this.iAO != null) {
        return this.iAO.size();
      }
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView;
      if ((this.iAO == null) || (this.iAO.size() <= 0)) {
        localView = null;
      }
      do
      {
        return localView;
        String str = jl(paramInt);
        if (paramView == null)
        {
          paramView = new a((byte)0);
          localView = View.inflate(paramViewGroup.getContext(), R.i.exdevice_bind_device_guide_item, null);
          paramView.iAQ = ((TextView)localView.findViewById(R.h.contentTV));
          paramView.iAP = ((TextView)localView.findViewById(R.h.stepTV));
          paramView.iAR = localView.findViewById(R.h.topView);
          paramView.iAS = localView.findViewById(R.h.bottomView);
          localView.setTag(paramView);
          paramViewGroup = paramView;
          paramView = localView;
        }
        for (;;)
        {
          paramViewGroup.iAP.setText(Integer.toString(paramInt + 1));
          paramViewGroup.iAQ.setText(str);
          if ((paramInt != 0) || (this.iAO.size() != 1)) {
            break;
          }
          paramViewGroup.iAR.setVisibility(4);
          paramViewGroup.iAS.setVisibility(4);
          return paramView;
          paramViewGroup = (a)paramView.getTag();
        }
        if (paramInt == 0)
        {
          paramViewGroup.iAR.setVisibility(4);
          paramViewGroup.iAS.setVisibility(0);
          return paramView;
        }
        localView = paramView;
      } while (paramInt != this.iAO.size() - 1);
      paramViewGroup.iAS.setVisibility(4);
      paramViewGroup.iAR.setVisibility(0);
      return paramView;
    }
    
    private static final class a
    {
      TextView iAP;
      TextView iAQ;
      View iAR;
      View iAS;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */