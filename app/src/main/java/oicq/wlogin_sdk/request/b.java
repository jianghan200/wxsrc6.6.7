package oicq.wlogin_sdk.request;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class b
{
  private Context mContext = null;
  public i vHK = new i();
  private j vHL = new j(this.vHK);
  private f vHM = new f(this.vHK);
  private g vHN = new g(this.vHK);
  private h vHO = new h(this.vHK);
  private e vHP = new e(this.vHK);
  public d vHQ = null;
  private int vHR = 66560;
  private int vHS = 1404;
  
  public b(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    i locali = this.vHK;
    locali._context = paramContext;
    locali.vIy = paramInt;
    locali.vIS = new c(paramContext);
    paramContext = new byte[16];
    locali.vIp.nextBytes(paramContext);
    System.arraycopy(paramContext, 0, locali.vIs, 0, 16);
    cJY();
  }
  
  private int cJY()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = util.iz(this.mContext);
        if ((localObject1 == null) || (localObject1.length <= 0))
        {
          localObject1 = util.is(this.mContext);
          if ((localObject1 == null) || (localObject1.length <= 0))
          {
            localObject1 = new String("%4;7t>;28<fc.5*6").getBytes();
            this.vHK.vIL = 0;
            util.b(this.mContext, (byte[])localObject1);
            this.vHK.vIK = 1;
            this.vHK.vIM = 1;
            this.vHK.vIz = new byte[localObject1.length];
            System.arraycopy(localObject1, 0, this.vHK.vIz, 0, localObject1.length);
            Object localObject3 = new byte[localObject1.length + 1];
            localObject3[0] = 35;
            System.arraycopy(localObject1, 0, localObject3, 1, localObject1.length);
            this.vHK.vIq = util.cf((byte[])localObject3);
            i.vIA = (byte[])this.vHK.vIz.clone();
            this.vHK.vIB = util.it(this.mContext);
            i = util.iv(this.mContext);
            this.vHK.vIC = util.iu(this.mContext);
            if (i != this.vHK.vIC)
            {
              util.iw(this.mContext);
              util.at(this.mContext, this.vHK.vIC);
            }
            this.vHK.vIE = util.ix(this.mContext).getBytes();
            this.vHK.vIN = util.iy(this.mContext);
            this.vHK.vID = util.iA(this.mContext);
            this.vHK.vIG = util.bV(this.mContext, new String(this.vHK.vID));
            this.vHK.vIH = util.bW(this.mContext, new String(this.vHK.vID));
            localObject1 = Build.MODEL;
            if (localObject1 != null) {
              break label475;
            }
            this.vHK.vII = new byte[0];
            if ((util.isFileExist("/system/bin/su")) || (util.isFileExist("/system/xbin/su")) || (util.isFileExist("/sbin/su"))) {
              break label489;
            }
            i = 0;
            localObject1 = this.vHK;
            if (i == 0) {
              break label494;
            }
            i = 1;
            ((i)localObject1).vIJ = i;
            localObject3 = Build.VERSION.RELEASE;
            localObject1 = localObject3;
            if (localObject3 == null) {
              localObject1 = "";
            }
            util.adN("WtloginHelper init ok: android version:" + (String)localObject1 + " release time:" + util.cKp());
            return 0;
          }
          this.vHK.vIL = 1;
          continue;
        }
        this.vHK.vIL = 1;
      }
      finally {}
      this.vHK.vIK = 0;
      this.vHK.vIM = 0;
      continue;
      label475:
      this.vHK.vII = ((String)localObject2).getBytes();
      continue;
      label489:
      int i = 1;
      continue;
      label494:
      i = 0;
    }
  }
  
  public final byte[] a(long paramLong, a parama, String paramString)
  {
    util.adN("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256 ...");
    String str = paramString;
    if (paramString.length() > 16) {
      str = paramString.substring(0, 16);
    }
    try
    {
      switch (cJZ()[parama.ordinal()])
      {
      case 1: 
        return null;
      }
    }
    finally {}
    if ((str == null) || (str.length() == 0))
    {
      util.adN("USER_WITH_PWD userPasswd null");
      return null;
    }
    parama = oicq.wlogin_sdk.tools.c.adL(str);
    for (int i = 0;; i = 1)
    {
      this.vHK.vIC = util.iu(this.mContext);
      this.vHK.vIE = util.ix(this.mContext).getBytes();
      this.vHK._uin = paramLong;
      this.vHK.vIv = 522017402L;
      this.vHK.vIw = 8256;
      this.vHK.vIt = new oicq.wlogin_sdk.a.f();
      this.vHQ = this.vHL;
      if (i != 0) {}
      for (parama = this.vHL.a(paramLong, this.vHK.vIQ, parama, this.vHS, this.vHR, this.vHK.vIN);; parama = this.vHL.a(paramLong, this.vHK.vIQ, paramString, parama, this.vHS, this.vHR, this.vHK.vIN))
      {
        util.adN("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256 end");
        return parama;
        if ((str == null) || (str.length() == 0))
        {
          util.adN("USER_WITH_MD5 userPasswd null");
          return null;
        }
        try
        {
          parama = (byte[])str.getBytes("ISO-8859-1").clone();
          i = 0;
        }
        catch (Exception parama)
        {
          return null;
        }
        parama = this.vHK.hj(paramLong);
        if ((parama == null) || (parama._en_A1 == null) || (parama._en_A1.length <= 0)) {
          util.adN("userAccount:" + paramLong + " appid:522017402 GetA1ByAccount return: null");
        }
        for (parama = null; (parama == null) || (parama.length < 16); parama = (byte[])parama._en_A1.clone())
        {
          util.adN("USER_WITH_A1 tmp_pwd null");
          return null;
          util.adN("userAccount:" + paramLong + " appid:522017402 GetA1ByAccount return: not null");
        }
        paramString = new byte[4];
        util.d(paramString, 0, i.cKc());
      }
      break;
    }
  }
  
  public final byte[] f(long paramLong, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    util.adN("user:" + paramLong + " CheckPicture ...");
    try
    {
      this.vHQ = this.vHN;
      paramArrayOfByte = this.vHN.bX(paramArrayOfByte);
      util.adN("user:" + paramLong + " CheckPicture end");
      return paramArrayOfByte;
    }
    finally {}
  }
  
  /* Error */
  public final byte[] hg(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	oicq/wlogin_sdk/request/b:vHK	Loicq/wlogin_sdk/request/i;
    //   6: getfield 399	oicq/wlogin_sdk/request/i:vIu	Loicq/wlogin_sdk/a/g;
    //   9: astore_3
    //   10: aload_3
    //   11: getfield 404	oicq/wlogin_sdk/a/g:vJf	I
    //   14: newarray <illegal type>
    //   16: astore 4
    //   18: aload_3
    //   19: getfield 404	oicq/wlogin_sdk/a/g:vJf	I
    //   22: ifgt +40 -> 62
    //   25: aload_0
    //   26: monitorexit
    //   27: new 252	java/lang/StringBuilder
    //   30: dup
    //   31: ldc_w 386
    //   34: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   37: lload_1
    //   38: invokevirtual 302	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: ldc_w 406
    //   44: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload 4
    //   49: arraylength
    //   50: invokevirtual 409	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: invokevirtual 268	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: invokestatic 271	oicq/wlogin_sdk/tools/util:adN	(Ljava/lang/String;)V
    //   59: aload 4
    //   61: areturn
    //   62: aload_3
    //   63: getfield 412	oicq/wlogin_sdk/a/g:vIf	[B
    //   66: aload_3
    //   67: getfield 415	oicq/wlogin_sdk/a/g:vJh	I
    //   70: aload 4
    //   72: iconst_0
    //   73: aload_3
    //   74: getfield 404	oicq/wlogin_sdk/a/g:vJf	I
    //   77: invokestatic 109	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   80: goto -55 -> 25
    //   83: astore_3
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_3
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	b
    //   0	88	1	paramLong	long
    //   9	65	3	localg	oicq.wlogin_sdk.a.g
    //   83	4	3	localObject	Object
    //   16	55	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	25	83	finally
    //   25	27	83	finally
    //   62	80	83	finally
    //   84	86	83	finally
  }
  
  public final void hh(long paramLong)
  {
    util.adN("user:" + paramLong + " ClearUserSigInfo");
    this.vHK.i(Long.valueOf(paramLong));
  }
  
  public static enum a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/request/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */