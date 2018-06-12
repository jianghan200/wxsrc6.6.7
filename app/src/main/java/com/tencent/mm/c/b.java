package com.tencent.mm.c;

public final class b
  extends com.tencent.mm.bk.a
{
  public String apkMd5;
  public int bxk;
  public String bxl;
  public int bxm;
  public String bxn;
  public String bxo;
  public boolean bxp;
  public int bxq;
  public boolean bxr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.apkMd5 == null) {
        throw new f.a.a.b("Not all required fields were included: apkMd5");
      }
      if (this.apkMd5 != null) {
        paramVarArgs.g(1, this.apkMd5);
      }
      paramVarArgs.fU(2, this.bxk);
      if (this.bxl != null) {
        paramVarArgs.g(3, this.bxl);
      }
      paramVarArgs.fU(4, this.bxm);
      if (this.bxn != null) {
        paramVarArgs.g(5, this.bxn);
      }
      if (this.bxo != null) {
        paramVarArgs.g(6, this.bxo);
      }
      paramVarArgs.av(7, this.bxp);
      paramVarArgs.fU(8, this.bxq);
      paramVarArgs.av(9, this.bxr);
      return 0;
    }
    if (paramInt == 1) {
      if (this.apkMd5 == null) {
        break label536;
      }
    }
    label536:
    for (paramInt = f.a.a.a.h(1, this.apkMd5) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fR(2, this.bxk);
      paramInt = i;
      if (this.bxl != null) {
        paramInt = i + f.a.a.a.h(3, this.bxl);
      }
      i = paramInt + f.a.a.a.fR(4, this.bxm);
      paramInt = i;
      if (this.bxn != null) {
        paramInt = i + f.a.a.a.h(5, this.bxn);
      }
      i = paramInt;
      if (this.bxo != null) {
        i = paramInt + f.a.a.a.h(6, this.bxo);
      }
      return i + f.a.a.a.IB(7) + f.a.a.a.fR(8, this.bxq) + f.a.a.a.IB(9);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs);; paramInt = com.tencent.mm.bk.a.a(paramVarArgs))
        {
          if (paramInt <= 0)
          {
            if (this.apkMd5 != null) {
              break;
            }
            throw new f.a.a.b("Not all required fields were included: apkMd5");
          }
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localb.apkMd5 = locala.cJP();
          return 0;
        case 2: 
          localb.bxk = locala.cJN();
          return 0;
        case 3: 
          localb.bxl = locala.cJP();
          return 0;
        case 4: 
          localb.bxm = locala.cJN();
          return 0;
        case 5: 
          localb.bxn = locala.cJP();
          return 0;
        case 6: 
          localb.bxo = locala.cJP();
          return 0;
        case 7: 
          localb.bxp = locala.cJQ();
          return 0;
        case 8: 
          localb.bxq = locala.cJN();
          return 0;
        }
        localb.bxr = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */