package com.tencent.mm.platformtools;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends e
{
  public o(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.ErrorMsgBoxProcessor", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }
  
  public final boolean b(ah paramah)
  {
    x.d("MicroMsg.ErrorMsgBoxProcessor", "handleOpenUrl");
    Toast.makeText(this.activity, paramah.content, 0).show();
    return true;
  }
  
  public final boolean c(ah paramah)
  {
    x.d("MicroMsg.ErrorMsgBoxProcessor", "handleIgnore");
    Toast.makeText(this.activity, paramah.content, 0).show();
    return true;
  }
  
  public final boolean d(ah paramah)
  {
    x.d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseLast");
    Toast.makeText(this.activity, paramah.content, 0).show();
    return true;
  }
  
  public final boolean e(ah paramah)
  {
    x.d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseCancel");
    Toast.makeText(this.activity, paramah.content, 0).show();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/platformtools/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */