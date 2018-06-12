package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.akl;
import com.tencent.mm.protocal.c.akm;

public final class b
  extends a<akm>
{
  public final com.tencent.mm.ab.b diG;
  
  public b(akl paramakl)
  {
    b.a locala = new b.a();
    locala.dIF = 1139;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxacdndownloadurl";
    locala.dIG = paramakl;
    locala.dIH = new akm();
    paramakl = locala.KT();
    this.diG = paramakl;
    this.diG = paramakl;
  }
  
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    this(paramString1, paramInt1, paramString2, paramInt2, 0);
  }
  
  /* Error */
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: new 49	com/tencent/mm/protocal/c/akl
    //   3: dup
    //   4: invokespecial 50	com/tencent/mm/protocal/c/akl:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: iload_2
    //   12: putfield 53	com/tencent/mm/protocal/c/akl:rkb	I
    //   15: aload 6
    //   17: aload_1
    //   18: putfield 56	com/tencent/mm/protocal/c/akl:bPS	Ljava/lang/String;
    //   21: aload 6
    //   23: aload_3
    //   24: putfield 59	com/tencent/mm/protocal/c/akl:rMZ	Ljava/lang/String;
    //   27: aload 6
    //   29: iload 4
    //   31: putfield 62	com/tencent/mm/protocal/c/akl:rNa	I
    //   34: aload 6
    //   36: iload 5
    //   38: putfield 65	com/tencent/mm/protocal/c/akl:rNb	I
    //   41: aload_0
    //   42: aload 6
    //   44: invokespecial 67	com/tencent/mm/plugin/appbrand/appcache/b:<init>	(Lcom/tencent/mm/protocal/c/akl;)V
    //   47: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	b
    //   0	48	1	paramString1	String
    //   0	48	2	paramInt1	int
    //   0	48	3	paramString2	String
    //   0	48	4	paramInt2	int
    //   0	48	5	paramInt3	int
    //   7	36	6	localakl	akl
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */