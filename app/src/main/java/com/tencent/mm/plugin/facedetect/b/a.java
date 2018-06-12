package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements com.tencent.mm.ab.e
{
  public int iLW = -1;
  public d iLX = null;
  public c iLY = null;
  public boolean iLZ = false;
  public boolean iMa = false;
  public long iMb = 0L;
  public int iMc = 0;
  public l iMd = null;
  public l iMe = null;
  public long iMf = -1L;
  public int iMg = -1;
  public i.a iMh = new a.1(this);
  
  public a(int paramInt)
  {
    this.iLW = paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool = false;
    x.i("MicroMsg.FaceUploadProcessor", "hy: scene: %s, errType: %d, errCode: %d, errMsg: %s", new Object[] { paraml.toString(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (((paraml instanceof u)) || ((paraml instanceof v))) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paraml;
        this.iMb = paramString.aJp();
        com.tencent.mm.plugin.facedetect.model.e.df(this.iMb);
        if (paramString.aJq() == null)
        {
          x.e("MicroMsg.FaceUploadProcessor", "hy: backend not return config");
          h(2, 90015, "face motion config from server is null");
        }
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            paramString = paramString.aJq();
            paramInt1 = paramString.length;
            if (this.iLX == null) {
              bool = true;
            }
            x.i("MicroMsg.FaceUploadProcessor", "configLen: %d, mUploadCallback == null: %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool) });
          } while (this.iLY == null);
          this.iLY.e(this.iMb, paramString);
          return;
        } while (this.iLY == null);
        this.iLY.ab(paramInt1, "get face bio config failed");
        return;
      } while ((this.iMe == null) || (paraml.getType() != this.iMe.getType()));
      this.iMg = ((int)(System.currentTimeMillis() - this.iMf));
    } while (this.iLX == null);
    this.iLX.i(paramInt1, paramInt2, paramString, paraml);
  }
  
  public final void aJo()
  {
    if (this.iMe != null) {
      g.DF().b(this.iMe.getType(), this);
    }
  }
  
  public final void h(int paramInt1, int paramInt2, String paramString)
  {
    ah.A(new a.2(this, paramInt1, paramInt2, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */