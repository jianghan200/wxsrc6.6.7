package com.tencent.mm.plugin.wear.model.e;

import java.util.ArrayList;
import java.util.List;

public final class l
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11032));
    localArrayList.add(Integer.valueOf(11034));
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iload_1
    //   1: tableswitch	default:+27->28, 11032:+31->32, 11033:+27->28, 11034:+318->319
    //   28: iconst_0
    //   29: newarray <illegal type>
    //   31: areturn
    //   32: new 34	com/tencent/mm/protocal/c/cer
    //   35: dup
    //   36: invokespecial 35	com/tencent/mm/protocal/c/cer:<init>	()V
    //   39: astore_2
    //   40: invokestatic 41	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   43: ldc 43
    //   45: iconst_0
    //   46: invokevirtual 49	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   49: ifeq +29 -> 78
    //   52: aload_2
    //   53: ldc 50
    //   55: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   58: aload_2
    //   59: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   62: getstatic 65	com/tencent/mm/R$l:wear_get_pay_code_not_support	I
    //   65: invokevirtual 71	android/content/Context:getString	(I)Ljava/lang/String;
    //   68: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   71: aload_2
    //   72: invokevirtual 79	com/tencent/mm/protocal/c/cer:toByteArray	()[B
    //   75: astore_2
    //   76: aload_2
    //   77: areturn
    //   78: bipush 13
    //   80: iconst_0
    //   81: invokestatic 85	com/tencent/mm/plugin/wear/model/c/a:ee	(II)V
    //   84: bipush 15
    //   86: invokestatic 89	com/tencent/mm/plugin/wear/model/c/a:zC	(I)V
    //   89: new 91	com/tencent/mm/g/a/to
    //   92: dup
    //   93: invokespecial 92	com/tencent/mm/g/a/to:<init>	()V
    //   96: astore_3
    //   97: aload_3
    //   98: getfield 96	com/tencent/mm/g/a/to:cfd	Lcom/tencent/mm/g/a/to$a;
    //   101: iconst_3
    //   102: putfield 101	com/tencent/mm/g/a/to$a:action	I
    //   105: getstatic 107	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   108: aload_3
    //   109: invokevirtual 111	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   112: pop
    //   113: aload_3
    //   114: getfield 115	com/tencent/mm/g/a/to:cfe	Lcom/tencent/mm/g/a/to$b;
    //   117: getfield 120	com/tencent/mm/g/a/to$b:cff	I
    //   120: tableswitch	default:+36->156, 1:+39->159, 2:+155->275, 3:+111->231, 4:+133->253, 5:+177->297
    //   156: goto -85 -> 71
    //   159: aload_2
    //   160: iconst_0
    //   161: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   164: aload_2
    //   165: ldc 122
    //   167: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   170: aload_2
    //   171: new 124	com/tencent/mm/bk/b
    //   174: dup
    //   175: aload_3
    //   176: getfield 115	com/tencent/mm/g/a/to:cfe	Lcom/tencent/mm/g/a/to$b;
    //   179: getfield 128	com/tencent/mm/g/a/to$b:cfk	[B
    //   182: invokespecial 131	com/tencent/mm/bk/b:<init>	([B)V
    //   185: putfield 135	com/tencent/mm/protocal/c/cer:szA	Lcom/tencent/mm/bk/b;
    //   188: aload_2
    //   189: new 124	com/tencent/mm/bk/b
    //   192: dup
    //   193: aload_3
    //   194: getfield 115	com/tencent/mm/g/a/to:cfe	Lcom/tencent/mm/g/a/to$b;
    //   197: getfield 138	com/tencent/mm/g/a/to$b:cfl	[B
    //   200: invokespecial 131	com/tencent/mm/bk/b:<init>	([B)V
    //   203: putfield 141	com/tencent/mm/protocal/c/cer:szB	Lcom/tencent/mm/bk/b;
    //   206: aload_2
    //   207: aload_3
    //   208: getfield 115	com/tencent/mm/g/a/to:cfe	Lcom/tencent/mm/g/a/to$b;
    //   211: getfield 144	com/tencent/mm/g/a/to$b:cfm	Ljava/lang/String;
    //   214: putfield 147	com/tencent/mm/protocal/c/cer:szC	Ljava/lang/String;
    //   217: aload_2
    //   218: aload_3
    //   219: getfield 115	com/tencent/mm/g/a/to:cfe	Lcom/tencent/mm/g/a/to$b;
    //   222: getfield 150	com/tencent/mm/g/a/to$b:cfn	Ljava/lang/String;
    //   225: putfield 153	com/tencent/mm/protocal/c/cer:szD	Ljava/lang/String;
    //   228: goto -157 -> 71
    //   231: aload_2
    //   232: ldc -102
    //   234: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   237: aload_2
    //   238: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   241: getstatic 157	com/tencent/mm/R$l:wear_get_pay_code_bank_fail	I
    //   244: invokevirtual 71	android/content/Context:getString	(I)Ljava/lang/String;
    //   247: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   250: goto -179 -> 71
    //   253: aload_2
    //   254: ldc -98
    //   256: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   259: aload_2
    //   260: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   263: getstatic 161	com/tencent/mm/R$l:wear_get_pay_code_pwd_fail	I
    //   266: invokevirtual 71	android/content/Context:getString	(I)Ljava/lang/String;
    //   269: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   272: goto -201 -> 71
    //   275: aload_2
    //   276: ldc -94
    //   278: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   281: aload_2
    //   282: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   285: getstatic 165	com/tencent/mm/R$l:wear_get_pay_code_fail	I
    //   288: invokevirtual 71	android/content/Context:getString	(I)Ljava/lang/String;
    //   291: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   294: goto -223 -> 71
    //   297: aload_2
    //   298: ldc -90
    //   300: putfield 54	com/tencent/mm/protocal/c/cer:spd	I
    //   303: aload_2
    //   304: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   307: getstatic 169	com/tencent/mm/R$l:wear_get_pay_code_gesture_pwd_fail	I
    //   310: invokevirtual 71	android/content/Context:getString	(I)Ljava/lang/String;
    //   313: putfield 75	com/tencent/mm/protocal/c/cer:syk	Ljava/lang/String;
    //   316: goto -245 -> 71
    //   319: new 171	com/tencent/mm/protocal/c/cfc
    //   322: dup
    //   323: invokespecial 172	com/tencent/mm/protocal/c/cfc:<init>	()V
    //   326: astore_3
    //   327: aload_3
    //   328: aload_2
    //   329: invokevirtual 176	com/tencent/mm/protocal/c/cfc:aG	([B)Lcom/tencent/mm/bk/a;
    //   332: pop
    //   333: invokestatic 60	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   336: aload_3
    //   337: getfield 179	com/tencent/mm/protocal/c/cfc:szH	Ljava/lang/String;
    //   340: aload_3
    //   341: getfield 182	com/tencent/mm/protocal/c/cfc:szI	Ljava/lang/String;
    //   344: invokestatic 188	com/tencent/mm/bg/d:A	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   347: goto -319 -> 28
    //   350: astore_2
    //   351: goto -323 -> 28
    //   354: astore_2
    //   355: goto -22 -> 333
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	358	0	this	l
    //   0	358	1	paramInt	int
    //   0	358	2	paramArrayOfByte	byte[]
    //   96	245	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   71	76	350	java/io/IOException
    //   327	333	354	java/io/IOException
  }
  
  protected final boolean zD(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean zF(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */