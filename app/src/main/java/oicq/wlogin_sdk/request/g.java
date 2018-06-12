package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ao;
import oicq.wlogin_sdk.a.f;

public final class g
  extends d
{
  public g(i parami)
  {
    this.vIl = 2064;
    this.vIm = 2;
    this.vIo = parami;
  }
  
  public final byte[] bX(byte[] paramArrayOfByte)
  {
    int k = this.vIo.vIy;
    byte[] arrayOfByte1 = this.vIo.vIt.cKd();
    Object localObject = this.vIo.vIu;
    byte[] arrayOfByte2 = new byte[((oicq.wlogin_sdk.a.g)localObject).vJg];
    int i;
    if (((oicq.wlogin_sdk.a.g)localObject).vJg <= 0)
    {
      localObject = new f();
      ao localao = new ao();
      localObject = ((f)localObject).bY(arrayOfByte1);
      paramArrayOfByte = localao.n(paramArrayOfByte, arrayOfByte2);
      arrayOfByte2 = new byte[localObject.length + paramArrayOfByte.length];
      if (arrayOfByte1.length <= 0) {
        break label206;
      }
      System.arraycopy(localObject, 0, arrayOfByte2, 0, localObject.length);
      i = localObject.length + 0;
    }
    for (int j = 1;; j = 0)
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, i, paramArrayOfByte.length);
      paramArrayOfByte = super.v(arrayOfByte2, this.vIm, j + 1);
      a(this.vIg, this.vIl, this.vIo._uin, this.vIi, this.vIj, k, this.vIk, paramArrayOfByte);
      return super.cKa();
      System.arraycopy(((oicq.wlogin_sdk.a.g)localObject).vIf, ((oicq.wlogin_sdk.a.g)localObject).vJi, arrayOfByte2, 0, ((oicq.wlogin_sdk.a.g)localObject).vJg);
      break;
      label206:
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/request/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */