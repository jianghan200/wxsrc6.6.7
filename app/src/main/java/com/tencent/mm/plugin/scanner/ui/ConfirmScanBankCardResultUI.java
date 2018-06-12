package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.HashMap;
import java.util.Map;

@a(3)
public class ConfirmScanBankCardResultUI
  extends MMActivity
{
  protected static final Map<String, Bitmap> mIc = new HashMap();
  protected Bitmap mBmp = null;
  private String mIb = null;
  private ImageView mIe;
  private EditText mIf;
  
  public static void c(Bitmap paramBitmap, String paramString)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (bi.oW(paramString))) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ad.getContext(), ConfirmScanBankCardResultUI.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("_card_num_", paramString);
    paramString = "_image_cache_key_" + paramString;
    mIc.put(paramString, paramBitmap);
    localIntent.putExtra("_image_cache_key_", paramString);
    ad.getContext().startActivity(localIntent);
  }
  
  public void finish()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 7);
    localIntent.putExtra("scan_bankcard_with_confirm_ui", true);
    localIntent.addFlags(268435456);
    localIntent.setClass(this, BaseScanUI.class);
    startActivity(localIntent);
    super.finish();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.confirm_scan_bank_card_result_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.scan_wallet_confirm_card_id_ui_title);
    int i;
    if (getIntent() == null)
    {
      x.e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
      i = 0;
    }
    while (i == 0)
    {
      finish();
      return;
      this.mIb = getIntent().getStringExtra("_image_cache_key_");
      if (bi.oW(this.mIb))
      {
        x.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
        i = 0;
      }
      else
      {
        this.mBmp = ((Bitmap)mIc.get(this.mIb));
        if ((this.mBmp == null) || (this.mBmp.isRecycled()))
        {
          x.e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
    }
    paramBundle = getIntent().getStringExtra("_card_num_");
    if (bi.oW(paramBundle))
    {
      x.e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
      finish();
      return;
    }
    this.mIe = ((ImageView)findViewById(R.h.imageBankCard));
    this.mIf = ((EditText)findViewById(R.h.editBankCard));
    this.mIe.setImageBitmap(this.mBmp);
    this.mIf.setText(paramBundle);
    findViewById(R.h.buttonOK).setOnClickListener(new ConfirmScanBankCardResultUI.1(this));
    setBackBtn(new ConfirmScanBankCardResultUI.2(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.mIe != null) {
      this.mIe.setImageBitmap(null);
    }
    if (!bi.oW(this.mIb)) {
      mIc.remove(this.mIb);
    }
    if (this.mBmp != null) {
      this.mBmp.recycle();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */