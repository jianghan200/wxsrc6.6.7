package com.tencent.mm.plugin.wallet_index.c;

import android.content.Context;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public int kjf;
  public String kjg;
  public int pCM = 0;
  
  private a(int paramInt, String paramString)
  {
    this.kjf = paramInt;
    this.kjg = paramString;
  }
  
  public static a aN(int paramInt, String paramString)
  {
    int j = 6;
    int i = a.i.wxwallet_result_unknown;
    if (paramInt <= 50535) {
      j = paramInt;
    }
    for (;;)
    {
      x.i("MicroMsg.IapResult", "code : " + paramInt + ", errMsg : " + paramString + ", convert to errCode : " + j);
      if (!bi.oW(paramString)) {
        break;
      }
      return new a(j, ad.getContext().getString(i));
      switch (paramInt)
      {
      default: 
        i = a.i.wxwallet_result_unknown;
        break;
      case 0: 
        i = a.i.wxwallet_result_success;
        j = paramInt;
        break;
      case 1: 
        i = a.i.wxwallet_result_user_canceled;
        j = paramInt;
        break;
      case 103: 
      case 104: 
      case 100000002: 
        j = 100000002;
        i = a.i.wxwallet_result_item_already_owned;
        break;
      case 6: 
        return new a(6, paramString);
      case 109: 
        i = a.i.wxwallet_result_wco_invalid_purchase;
        j = paramInt;
        break;
      case 110: 
        i = a.i.wxwallet_result_wco_invalid_purchase_quota_day;
        j = paramInt;
        break;
      case 111: 
        i = a.i.wxwallet_result_wco_invalid_purchase_quota_week;
        j = paramInt;
        break;
      case 112: 
        i = a.i.wxwallet_result_wco_invalid_purchase_freq_limit;
        j = paramInt;
        break;
      case 113: 
        i = a.i.wxwallet_result_unknown;
        j = paramInt;
        break;
      case 3: 
      case 105: 
        j = 3;
        paramString = "Google Play not install";
        break;
      case 106: 
      case 100000001: 
        i = a.i.wxwallet_result_unknown;
      }
    }
    return new a(j, paramString);
  }
  
  public final boolean bRc()
  {
    return (this.kjf == 104) || (this.kjf == 100000002);
  }
  
  public final boolean isFailure()
  {
    if (this.kjf == 0) {}
    for (int i = 1; (i == 0) && (!bRc()); i = 0) {
      return true;
    }
    return false;
  }
  
  public final String toString()
  {
    return "IapResult: " + this.kjg;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */