package com.tencent.mm.plugin.scanner.a;

import android.os.Bundle;
import com.tencent.mm.g.a.no;
import com.tencent.mm.plugin.facedetect.model.q;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends c<no>
  implements b.a
{
  private boolean jAi = false;
  private d mGj = null;
  private q mGk = null;
  
  public m()
  {
    this.sFo = no.class.getName().hashCode();
  }
  
  public final void E(Bundle paramBundle) {}
  
  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.RecogQBarInYUVListener", "hy: on decode success. result type: %d, result: %s, codeType: %d, codeVersion: %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.mGk != null) {
      this.mGk.N(paramString, paramInt2, paramInt3);
    }
    this.jAi = false;
  }
  
  public final void bsf()
  {
    x.i("MicroMsg.RecogQBarInYUVListener", "hy: on qrcode decode failed");
    if (this.mGk != null) {
      this.mGk.N("", -2, -1);
    }
    this.jAi = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */