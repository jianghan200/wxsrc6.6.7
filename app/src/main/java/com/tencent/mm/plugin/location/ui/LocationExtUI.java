package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;

public class LocationExtUI
  extends MMActivity
{
  private ArrayList<String> irs = new ArrayList();
  private String kEA;
  private TextView kEy;
  private TextView kEz;
  
  protected final int getLayoutId()
  {
    return a.f.location_ext_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (4097 == paramInt1) {
      if ((-1 == paramInt2) && (paramIntent != null)) {}
    }
    String[] arrayOfString;
    do
    {
      do
      {
        return;
        paramIntent = paramIntent.getCharSequenceExtra("key_result");
        if (paramIntent == null) {}
        for (paramIntent = "";; paramIntent = paramIntent.toString())
        {
          this.kEA = paramIntent;
          this.kEz.setText(this.kEA);
          return;
        }
        if (4098 != paramInt1) {
          break;
        }
      } while ((-1 != paramInt2) || (paramIntent == null));
      this.irs.clear();
      arrayOfString = paramIntent.getStringArrayExtra("key_fav_result_array");
    } while ((arrayOfString == null) || (arrayOfString.length <= 0));
    paramIntent = arrayOfString[0];
    this.irs.add(arrayOfString[0]);
    String str = getResources().getString(a.h.favorite_tag_delimiter_1);
    paramInt1 = 1;
    while (paramInt1 < arrayOfString.length)
    {
      this.irs.add(arrayOfString[paramInt1]);
      paramIntent = paramIntent + str + arrayOfString[paramInt1];
      paramInt1 += 1;
    }
    this.kEy.setText(paramIntent);
    return;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bi.oW(paramBundle)) {
      findViewById(a.e.location_info_ll).setVisibility(8);
    }
    for (;;)
    {
      this.kEy = ((TextView)findViewById(a.e.tag_tv));
      this.kEz = ((TextView)findViewById(a.e.remard_tv));
      this.kEy.setOnClickListener(new LocationExtUI.1(this));
      this.kEz.setOnClickListener(new LocationExtUI.2(this));
      a(0, getString(a.h.app_finish), new LocationExtUI.3(this), s.b.tmX);
      setBackBtn(new LocationExtUI.4(this));
      return;
      ((TextView)findViewById(a.e.location_text_tv)).setText(paramBundle);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/location/ui/LocationExtUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */