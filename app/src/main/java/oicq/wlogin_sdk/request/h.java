package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;

public final class h
  extends d
{
  public h(i parami)
  {
    this.vIl = 2064;
    this.vIm = 3;
    this.vIo = parami;
  }
  
  public final int x(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    g localg = new g();
    int i = super.Y(paramArrayOfByte, paramInt1 + 2);
    super.cKb();
    int j = paramInt1 + 5;
    switch (i)
    {
    case 3: 
    case 4: 
    default: 
      w(paramArrayOfByte, j, this.vIa - j - 1);
      return i;
    case 2: 
      paramInt2 = localf.z(paramArrayOfByte, j, this.vIa - j);
      paramInt1 = paramInt2;
      if (paramInt2 >= 0)
      {
        this.vIo.vIt = localf;
        paramInt2 = localg.z(paramArrayOfByte, j, this.vIa - j);
        paramInt1 = paramInt2;
        if (paramInt2 >= 0)
        {
          this.vIo.vIu = localg;
          return i;
        }
      }
      break;
    case 5: 
      super.w(paramArrayOfByte, j, this.vIa - j - 1);
      return i;
    }
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/request/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */